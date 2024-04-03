package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadorMethodAddTest {
  @Test //Test pata dos numeros positivos.
  public void testAdd_PositiveNumbers_ShouldReturnCorrectAdd() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = 10;
    int numeroB = 5;

    // Act
    int resultado = calculador.add(numeroA, numeroB);

    // Assert
    assertEquals(15, resultado, "10 + 5  deberia ser 15");
  }

  @Test //Test pata dos numeros positivos.
  public void testAdd_NegativeNumbers_ShouldReturnCorrectAdd() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = -10;
    int numeroB = -5;

    // Act
    int resultado = calculador.add(numeroA, numeroB);

    // Assert
    assertEquals(-15, resultado, "-10 + -5  deberia ser -15");
  }

  @Test //Test pata dos numeros positivos.
  public void testAdd_OppsitionSignsumbers_ShouldReturnCorrectAdd() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = -10;
    int numeroB = 5;

    // Act
    int resultado = calculador.add(numeroA, numeroB);

    // Assert
    assertEquals(-5, resultado, "-10 + 5  deberia ser -5");
  }

  @Test //Test pata dos numeros positivos.
  public void testAdd_MaxValue_ShouldReturnCorrectAdd() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = 2147483647;
    int numeroB = 5;


    try{
      // Act
      int resultado = calculador.add(numeroA, numeroB);

      // Assert
      assertEquals(-2147483647, resultado, "2147483648 + 5  deberia ser -2147483647");
    }catch (ArithmeticException e){
      System.out.println("Error: " + e.getMessage());
    }
  }

  @Test //Test pata dos numeros positivos.
  public void testAdd_MinValue_ShouldReturnCorrectAdd() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = -2147483647;
    int numeroB = 5;

    // Act
    int resultado = calculador.add(numeroA, numeroB);

    // Assert
    assertEquals(-2147483642 ,resultado, "-2147483648 + 5  deberia ser -2147483642");

  }
}
