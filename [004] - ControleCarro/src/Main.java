import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static Car car = new Car();

    public static void main(String[] args) {
        var option = -1;
        do {
            System.out.println("====== Escolha uma opção ======");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda/direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar a marcha");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    car.start();
                }
                case 2 -> car.stop();
                case 3 -> car.accelerate();
                case 4 -> car.decelerate();
                case 5 -> car.changeDirection();
                case 6 -> car.getSpeed();
                case 7 -> changeGear();
                case 0 -> System.exit(0);
            }
        } while (true);
    }

    static public void changeGear(){
        if(!car.isRunning()){
            System.out.println("O carro está desligado, não é possível mudar a marcha");
            return;
        }

        System.out.println("Deseja subir ou descer uma marcha? \n 1 - Subir \n 2 - Descer");
        var option = scanner.nextInt();

        switch (option) {
            case 1 -> car.setActualGear(car.getActualGear() + 1);
            case 2 -> car.setActualGear(car.getActualGear() - 1);
            default -> System.out.println("Opção inválida");
        }
    }
}
