public class BmiService {
    public float calculate(int weight) {
        float height = 1.71f;
        float index = weight / (height * height);
        return index;
    }
}
