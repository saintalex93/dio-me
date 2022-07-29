package com.br.dio;

import com.br.dio.bootstarter.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

  @Autowired
  private Calculator calculator;

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Resultado" + calculator.sum(1, 2));
  }
}
