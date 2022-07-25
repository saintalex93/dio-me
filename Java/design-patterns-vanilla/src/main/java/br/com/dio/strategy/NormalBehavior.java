package br.com.dio.strategy;

public class NormalBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Movendo-se com o comportamento normal");
    }
}
