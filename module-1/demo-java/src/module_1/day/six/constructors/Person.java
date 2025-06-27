package module_1.day.six.constructors;

public class Person {
    public String aahaarNo;
    public String panCard;


    public Person() {
        System.out.println("from parent");
    }

    public Person(String aahaarNo, String panCard) {
        this.aahaarNo = aahaarNo;
        this.panCard = panCard;
    }

    public void sub() {

    }
}
