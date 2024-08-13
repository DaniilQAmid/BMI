public class main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.80;
        int weight = 67;
        double index = service.calculateBmi(height, weight);
        System.out.println("При массе тела " + weight + " килограмм " + "и" + " Росте " + height + " метров");
        System.out.println("Индекс массы тела составляет: " + (int) index);
    }
}
