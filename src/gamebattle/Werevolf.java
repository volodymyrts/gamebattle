package gamebattle;

public class Werevolf extends Unit {

    Werevolf() {
        this.name = "Werevolf";
        this.healthPoints = 80;
        this.damage = 10;
    }

    private State state;

//    public Context() {
//        state = null;
//    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

//    beHuman(this) {
//
//    }
//
//    beWarevolf(this) {
//
//    }

}
