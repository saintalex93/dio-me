package br.com.dio.strategy;

public class AggressiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Movendo-se com o comportamento agressivo");
    }
}
