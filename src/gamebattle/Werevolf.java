package gamebattle;

public class Werevolf extends Unit {

    Werevolf() {
        this.name = "Werevolf";
        this.state.setHealthPoints(80);
        this.state.setDamage(10);
    }

    public void transform(Werevolf werevolf) {
        System.out.println("tranformed");
    }

}
