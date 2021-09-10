package LSP;

import java.util.ArrayList;

interface Bird {
    public void fly();
}

class FlyingBirds implements Bird {
    public void fly() {
    }
}

class SwimmingBirds {
    public void swim() {
    }
}

class Duck extends FlyingBirds {
    @Override
    public void fly() {
        System.out.println("Duck can Fly");
    }

}

class Penguin extends SwimmingBirds {

    public void swim() {
        System.out.println("Penguin can Swim");
    }


}

class Pigeon extends FlyingBirds {
    @Override
    public void fly() {
        System.out.println("Pigeon can Fly");
    }
}


public class LSP {
    public static void main(String[] args) {
        LSP testBird = new LSP();

        ArrayList<FlyingBirds> FlyBirds = new ArrayList<FlyingBirds>();
        FlyBirds.add(new Duck());
        FlyBirds.add(new Pigeon());

        testBird.letsMakeFly(FlyBirds);

        ArrayList<SwimmingBirds> SwimBirds = new ArrayList<SwimmingBirds>();
        SwimBirds.add(new Penguin());

        testBird.letsMakeSwim(SwimBirds);
    }

    // Make the call to flying birds
    public void letsMakeFly(ArrayList<FlyingBirds> birds) {
        for (FlyingBirds fb : birds) {
            fb.fly();
        }
    }

    // Make the call to swimmimg birds
    public void letsMakeSwim(ArrayList<SwimmingBirds> bird) {
        for (SwimmingBirds sb : bird) {
            sb.swim();
        }
    }
}