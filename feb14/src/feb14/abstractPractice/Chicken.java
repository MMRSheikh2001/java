package feb14.abstractPractice;

/**
 *
 * @author Mahbub
 */
public class Chicken implements Edible {

    @Override
    public String howToEat() {
        return "Eat by Biting";

    }

    public Chicken() {
    }

    @Override
    public void getFat() {

        System.out.println("You are too fat");
    }

}
