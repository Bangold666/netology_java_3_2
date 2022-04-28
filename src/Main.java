public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 70;
        float height = 1.71f;
        float bodyIndex = service.calculate(bodyMass, height);
        System.out.println(bodyIndex);
    }
}
