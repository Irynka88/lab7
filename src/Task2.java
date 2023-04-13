public class Task2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        double hypotenuse = Math.sqrt(a*a + b*b);
        double area = (a * b) / 2.0;
        double perimeter = a + b + hypotenuse;

        System.out.println("Площа трикутника: " + area);
        System.out.println("Периметр трикутника: " + perimeter);
    }
}
