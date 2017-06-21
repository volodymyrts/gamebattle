package gamebattle;

public class Werevolf extends Unit {

    Werevolf() {
        super(80, 10);
        this.name = "Werevolf";
    }

    public void transform(Werevolf werevolf) {
        System.out.println("tranformed");
    }

}
