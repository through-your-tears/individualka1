import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //типо работа с массивом из векторов
        /*System.out.println("Введите кол-во векторов");
        int n = scanner.nextInt();
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; ++i) {
            vectors[i] = new Vector(
                    new Point(scanner.nextDouble(), scanner.nextDouble(),scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble(),scanner.nextDouble())
            );
        }*/
        /*for (Vector a : vectors) {
            a.print();
        }*/
        System.out.println("Введите координаты начала и конца вектора");
        Vector a = new Vector(
                new Point(scanner.nextDouble(), scanner.nextDouble(),scanner.nextDouble()),
                new Point(scanner.nextDouble(), scanner.nextDouble(),scanner.nextDouble())
        );
        System.out.println("Введите координаты начала и конца вектора для сложения, вычетания, скалярного произведения, нахождения угла");
        Vector b = new Vector(
                new Point(scanner.nextDouble(), scanner.nextDouble(),scanner.nextDouble()),
                new Point(scanner.nextDouble(), scanner.nextDouble(),scanner.nextDouble())
        );
        Vector c = a.addition(b);
        c.print();
        c = a.subtraction(b);
        c.print();
        System.out.println("Скалярное произведение первого и второго векторов: "+a.scalar(b));
        System.out.println("Длина первого вектора: "+a.length());
        System.out.println("Косинус угла между векторами: "+a.Cos(b));

    }
}
