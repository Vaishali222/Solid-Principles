package SRP;

public class Customer {

    String name;
    int age;
    long bill;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getName() {
        System.out.println("Name is:" + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAge() {
        System.out.println("Age is:" + age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getBill() {
        System.out.println("Bill is:" + bill);
    }

    public void setBill(int bill) {
        this.bill = bill;
    }


}
