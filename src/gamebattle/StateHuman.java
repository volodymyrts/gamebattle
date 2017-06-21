package gamebattle;

public class StateHuman implements IWerevolfState {

    public void transform(Werevolf werevolf) {
        werevolf.healthPoints /= 2;
        werevolf.damage /= 2;
        System.out.println("Player is in Human state");
    };


}