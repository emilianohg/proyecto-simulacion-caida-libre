public class Main {
    public static void main(String[] args) {

        double currentVelocity = -1;
        double previusVelocity = -2;
        int time = 0;
        int increment = 5;

        CalculateVelocity calcVelocity = new CalculateVelocity();

        while (currentVelocity != previusVelocity) {
            previusVelocity = currentVelocity;
            currentVelocity = calcVelocity.execute(68, time);
            time += increment;
            System.out.printf("Time: %d s%n", time);
            System.out.printf("V(t) = %s m/s%n", currentVelocity);
        }
    }
}
