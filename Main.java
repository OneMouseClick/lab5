import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        HelloMethod helloMethod = new HelloMethod();
        String string1 = helloMethod.Hello();
        Scanner scanner = new Scanner(System.in);
        String string2 = scanner.next();
        System.out.println(string1 + " " + string2);
    }
}
