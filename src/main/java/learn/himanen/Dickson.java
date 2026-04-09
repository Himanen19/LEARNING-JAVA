package learn.himanen;

public class Dickson {

    private String name1;

    public Dickson() {

    }

    public Dickson(String name1) {
        this.name1 = name1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;

        //inheritance
        Customer c = new Customer();
        c.getCreditLimit();
    }
}
