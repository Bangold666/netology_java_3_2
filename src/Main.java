public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 70;
        float bodyIndex = service.calculate(bodyMass);
        System.out.println(bodyIndex);
    }
}
