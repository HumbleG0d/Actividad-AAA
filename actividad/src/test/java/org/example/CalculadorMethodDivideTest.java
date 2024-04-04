package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadorMethodDivideTest {
    @Test //Test para dos numeros positivos.
  public void testDivide_PositiveNumbers_ShouldReturnCorrectDivide() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = 10;
    int numeroB = 5;

    // Act
    double resultado = calculador.divide(numeroA,numeroB);

    // Assert
    assertEquals(2, resultado, "10 / 5  deberia ser 2 ");
  }

  @Test //Test para dos numeros negativos
  public void testDivide_NegativeNumbers_ShouldReturnCorrectDivide() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = -10;
    int numeroB = -5;

    // Act
    double resultado = calculador.divide(numeroA, numeroB);

    // Assert
    assertEquals(2, resultado, "-10 / -5  deberia ser 2");
  }

  @Test //Test para dos numeros de signos opuestos
  public void testDivide_OppsitionSignsumbers_ShouldReturnCorrectDivide() {
      // Arrange
      Calculador calculador = new Calculador();
      int numeroA = 30;
      int numeroB = -5;

      // Act
      double resultado = calculador.divide(numeroA, numeroB);

      // Assert
      assertEquals(-6, resultado, "30 / -5  deberia ser -6");
  }
  
  @Test //Test para dos numeros de signos opuestos
  public void testDivide_ZerosNumbers_ShouldReturnCorrectDivide() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = 0;
    int numeroB = 0;

    try{
        // Act
        double resultado = calculador.divide(numeroA, numeroB);

        // Assert
        assertEquals(-6, resultado, "0 / 0  deberia ser infinito");
    }catch(ArithmeticException e){
      System.out.print("Error: " + e.getMessage());
    }
  }

  @Test //Test para el valor maximo de un entero
  public void testDivide_MaxValue_ShouldReturnCorrectDivide() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = 2147483647;
    int numeroB = 5;

    // Act
    double resultado = calculador.divide(numeroA, numeroB);

    // Assert
    assertEquals(429496729.4, resultado, "2147483648 / 5  deberia ser 429496729.4");

  }

  @Test //Test para el valor minimo de un entero
  public void testDivide_MinValue_ShouldReturnCorrectDivide() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = -2147483647;
    int numeroB = 5;

    // Act
    double resultado = calculador.divide(numeroA, numeroB);

    // Assert
    assertEquals(-429496729.4 ,resultado, "-2147483648 / 5  deberia ser -429496729.4");

  }
}
