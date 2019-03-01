package Test.model;

public class Test{
    private Long id;
    private String name;
    private int prize;
    private int amount;

    public Test() {
    }

    public Test(String name, int prize, int amount) {
        this.id = id;
        this.name = name;
        this.prize = prize;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
