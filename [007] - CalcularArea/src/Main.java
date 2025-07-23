import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        while (true) {
            System.out.println("Escolha a forma geométrica para cálcula da área: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair");
            option = scanner.nextInt();

            double geometricArea = 0;

            if(option == 1){
                geometricArea = createSquare().getArea();
            } else if (option == 2) {
                geometricArea = createRectangle().getArea();
            }else if (option == 3){
                geometricArea = createCircle().getArea();
            } else if(option == 4) {
                break;
            }else {
                System.out.println("Opção inválida!");
                continue;
            }

            System.out.println("Cálculo da área: " + geometricArea);
        }

    }

    private static GeometricForm createSquare(){
        System.out.println("Informe o tamanho dos lados: ");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Informe a base: ");
        var base = scanner.nextDouble();
        System.out.println("Informe o altura: ");
        var height = scanner.nextDouble();
        return new Rectangle(base,height);
    }

    private static GeometricForm createCircle(){
        System.out.println("Informe o raio: ");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
