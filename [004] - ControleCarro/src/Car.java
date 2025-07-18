public class Car {
    private boolean isRunning = false;
    private int speed = 0;
    private int actualGear = 0;

    public void start(){
        if(isRunning){
            System.out.println("O carro já está ligado");
            return;
        }
        this.isRunning = true;
        System.out.println("Carro ligado");
    }

    public void stop(){
        if(!isRunning){
            System.out.println("O carro já está desligado");
            return;
        } else if(actualGear > 0){
            System.out.println("O carro só pode ser desligado em ponto morto (marcha 0)");
            return;
        } else if (speed > 0){
            System.out.println("O carro não pode ser desligado em movimento");
            return;
        }

        this.isRunning = false;
        System.out.println("Carro desligado");
    }

    public void accelerate(){
        if(!isRunning){
            System.out.println("O carro está desligado, não é possível acelerar");
            return;
        } else if(this.speed > 120){
            System.out.println("Velocidade máxima atingida");
            return;
        } else if(this.actualGear == 0){
            System.out.println("Carro em ponto morto, não é possível acelerar");
            return;
        } else if((this.actualGear == 1 && this.speed == 20) ||
                (this.actualGear == 2 && this.speed == 40) ||
                (this.actualGear == 3 && this.speed == 60) ||
                (this.actualGear == 4 && this.speed == 80) ||
                (this.actualGear == 5 && this.speed == 100)) {
            System.out.println("Velocidade máxima para a marcha atual atingida");
            return;
        }

        this.speed += 10;
        System.out.println("Acelerando");
    }

    public void decelerate(){
        if(!isRunning){
            System.out.println("O carro está desligado, não é possível desacelerar");
            return;
        } if(this.speed == 0){
            System.out.println("Velocidade mínima atingida");
            return;
        } else if((this.actualGear == 1 && this.speed > 20) ||
                (this.actualGear == 2 && this.speed > 40) ||
                (this.actualGear == 3 && this.speed > 60) ||
                (this.actualGear == 4 && this.speed > 80) ||
                (this.actualGear == 5 && this.speed > 100)) {
            System.out.println("Velocidade mínima para a marcha atual atingida");
            return;
        }

        this.speed--;
        System.out.println("Desacelerando");
    }

    public void changeDirection(){
        if(!isRunning){
            System.out.println("O carro está desligado, não é possível mudar a direção");
            return;
        } else if(this.speed < 1 || this.speed > 40){
            System.out.println("Só é possível mudar a direção quando a velocidade está entre 1 e 40 km/h");
            return;
        }

        System.out.println("Mudando direção");
    }

    public int getActualGear() {
        return actualGear;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setActualGear(int actualGear) {
        if(actualGear < 0){
            System.out.println("Marcha já está no mínimo");
            return;
        } else if(actualGear > 6){
            System.out.println("Marcha já está na máxima");
        }
        this.actualGear = actualGear;
    }

    public void getSpeed() {
        System.out.println("Velocidade atual: " + this.speed);
    }
}
