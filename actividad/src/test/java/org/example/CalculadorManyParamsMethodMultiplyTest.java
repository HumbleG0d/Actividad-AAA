package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadorManyParamsMethodMultiplyTest {


  @ParameterizedTest
  @CsvSource({
          "2 , 3 , 6", //Test para dos numeros positivos.
          "-2 , -3 , 6", //Test para dos numeros negativos.
          "0 , 0 , 0 ", //Test para dos ceros.
          "2147483647 , 1 , 2147483647", //Test para el valor maximo de un entero.
          "-2 , 2147483647 , 2147483645", // Test para el valor minimo de un entero.
          "-1 , -2147483646 , 2147483646" // Test para el valor minimo de un entero.
  })
  public void tests_ShouldReturnCorrectMultiply(int numberA , int numberB , int expected){
    /*Arrange:
    * Datos de entrada -> Argumentos a y b.
    * Entorno de prueba -> Instancia del objeto Calculador
    * */

    Calculador calculador = new Calculador();
    //Captura de excepciones
    try{
      //Act
      int resultado = calculador.multiply(numberA , numberB);

      //Assert
      assertEquals(expected , resultado);

    }catch (ArithmeticException e){
      System.out.print("Error: " + e.getMessage());
    }

  }

}
