package Test.controller;

import Test.model.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TestController {

    private List<Test> tests = new ArrayList<>();
    private AtomicLong nextId = new AtomicLong();

    @GetMapping("/hello")
    public String getHelloMessage(){
        return "Hello Spring Boot World";
    }

    @PostMapping("/tests")
    @ResponseStatus(HttpStatus.CREATED)
    public Test createNewTest(@RequestBody Test test){
        test.setId(nextId.incrementAndGet());

        tests.add(test);
        return test;
    }

    @GetMapping("/tests")
    public List<Test> getAllTests(){
        return tests;
    }

    @GetMapping("/tests/{id}")
    public Test getOneTest(@PathVariable("id") Long testId){
        for (Test test: tests){
            if(test.getId() == testId){
                return test;
            }
        }
        throw new IllegalArgumentException();
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Request ID not found")
    @ExceptionHandler(IllegalArgumentException.class)
    public void badIdExceptionHandler(){

    }
}
