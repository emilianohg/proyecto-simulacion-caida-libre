public class CalculateVelocity {

    private double gravity;
    private double resistance;


    public CalculateVelocity() {
        this(9.81, 12.5);
    }

    public CalculateVelocity(double gravity, double resistance) {
        this.gravity = gravity;
        this.resistance = resistance;
    }

    public double execute(double mass, double time) {
        double f1 = (gravity * mass) / resistance;
        double f2 = 1 - Math.pow(Math.E, -(resistance /mass) * time);
        return f1 * f2;
    }




}
