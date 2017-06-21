package gamebattle;

public class Werevolf extends Unit implements IWerevolfState {

    IWerevolfState stateOfWerevolf;

    Werevolf(IWerevolfState stateOfWerevolf) {
        stateOfWerevolf = new StateHuman();
        this.name = "Werevolf";
        this.healthPoints = 80;
        this.damage = 10;
    }

    public void transform(Werevolf werevolf) {
        System.out.println("tranformed");
    }

//    public void transform(IWerevolfState werevolf) {
//        System.out.println("transforming...");
//
//    };


}
