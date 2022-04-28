public class BmiService {
    public float calculate(int weight, float height) {
        float index = (weight / (height * height));
        return index;
    }
}
