public class BmiService {
    public int calculateBmi(double heightMetr, int weightKilo) {
        int bmi = (int) (weightKilo / (heightMetr * heightMetr));
        return bmi;
    }
}
