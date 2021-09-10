package DIP;


public class DVD implements Product {
    @Override
    public void seeReviews() {
        System.out.println("See reviews of DVD.");
    }

    @Override
    public void getSample() {
        System.out.println("Get a free sample book from Store.");
    }
}