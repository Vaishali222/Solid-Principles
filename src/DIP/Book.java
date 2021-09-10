package DIP;


public class Book implements Product {
    @Override

    public void seeReviews() {
        System.out.println("Best book of the year!");
    }

    @Override
    public void getSample() {
        System.out.println("Get the sample at the store.");
    }
}