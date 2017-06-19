package gamebattle;

public class HumanState implements State {

    public void transform(Context context) {
        System.out.println("Player is in Human state");
        //context.setState(this);
    };

}