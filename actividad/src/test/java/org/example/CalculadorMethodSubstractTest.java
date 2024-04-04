package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorMethodSubstractTest {
  
  @Test //Test para dos numeros positivos.
  public void testSubstract_PositiveNumbers_ShouldReturnCorrectSubstract() {
    //Arrange
    Calculador calculador = new Calculador();
    int numeroA = 10;
    int numeroB = 5;

    //Act
    int resultado = calculador.substract(numeroA, numeroB);

    //Assert
    assertEquals(5, resultado, "10 - 5 deberia ser ");
  }
  
  @Test //Test para dos numeros negativos
  public void testSubstract_NegativeNumbers_ShouldReturnCorrectSubstract(){
    //Arrange
    Calculador calculador = new Calculador();
    int numeroA = -10;
    int numeroB = -3;

    //Act
    int resultado = calculador.substract(numeroA , numeroB);

    //Assert
    assertEquals(-7 , resultado , "-10 - -3 deberia ser -7");
  }

  @Test //Test para dos numeros de signos opuestos
  public void testSubstract_OppositionSignsNumbers_ShouldReturnCorrectSubstract(){
    //Arrange
    Calculador calculador = new Calculador();
    int numeroA = -10;
    int numeroB = 3;

    //Act
    int resultado = calculador.substract(numeroA , numeroB);

    //Assert
    assertEquals(-13 , resultado , "-10 - 3 deberia ser -13");
  }

  @Test //Test para el valor maximo de un entero
  public void testSubstract_MaxValue_ShouldReturnCorrectSubstract() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = 2147483647;
    int numeroB = 5;

    // Act
    int resultado = calculador.substract(numeroA, numeroB);

    // Assert
    assertEquals(2147483642, resultado, "2147483648 - 5  deberia ser 2147483642");
  }

  @Test //Test para el valor minimo de un entero
  public void testSubstract_MinValue_ShouldReturnCorrectSubstract() {
    // Arrange
    Calculador calculador = new Calculador();
    int numeroA = -2147483648;
    int numeroB = 1;

    // Act
    int resultado = calculador.substract(numeroA, numeroB);

    // Assert
    assertEquals(2147483647, resultado, "2147483648 - 5  deberia ser 2147483642");
  }

}
