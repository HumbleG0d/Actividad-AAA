package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadorMethodMultiplyTest {
    @Test //Test para dos numeros positivos.
  public void testMultipli_PositiveNumbers_ShouldReturnCorrectMultiply() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = 10;
    int numeroB = 5;

    // Act
    int resultado = calculador.multiply(numeroA,numeroB);

    // Assert
    assertEquals(15, resultado, "10 + 5  deberia ser 15");
  }

  @Test //Test para dos numeros negativos
  public void testMultiply_NegativeNumbers_ShouldReturnCorrectMultiply() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = -10;
    int numeroB = -5;

    // Act
    int resultado = calculador.multiply(numeroA, numeroB);

    // Assert
    assertEquals(-15, resultado, "-10 + -5  deberia ser -15");
  }

  @Test //Test para dos numeros de signos opuestos
  public void testMultiply_OppsitionSignsumbers_ShouldReturnCorrectMultiply() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = -10;
    int numeroB = 5;

    // Act
    int resultado = calculador.multiply(numeroA, numeroB);

    // Assert
    assertEquals(-5, resultado, "-10 + 5  deberia ser -5");
  }

  @Test //Test para el valor maximo de un entero
  public void testMultiply_MaxValue_ShouldReturnCorrectMultiply() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = 2147483647;
    int numeroB = 5;


    try{
      // Act
      int resultado = calculador.multiply(numeroA, numeroB);

      // Assert
      assertEquals(-2147483647, resultado, "2147483648 + 5  deberia ser -2147483647");
    }catch (ArithmeticException e){
      System.out.println("Error: " + e.getMessage());
    }
  }

  @Test //Test para el valor minimo de un entero
  public void testAdd_MinValue_ShouldReturnCorrectMultiply() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = -2147483647;
    int numeroB = 5;

    // Act
    int resultado = calculador.multiply(numeroA, numeroB);

    // Assert
    assertEquals(-2147483642 ,resultado, "-2147483648 + 5  deberia ser -2147483642");

  }
}
