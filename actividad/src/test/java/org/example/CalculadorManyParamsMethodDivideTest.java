package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadorManyParamsMethodDivideTest {
        
  @ParameterizedTest
  @CsvSource({
    "2 , 3 , 0.6666666666666666", //Test para dos numeros positivos.
    "-2 , -3 , 0.6666666666666666", //Test para dos numeros negativos.
    "0 , 0 , 0 ", //Test para dos ceros.
    "2147483647 , 1 , 2147483647", //Test para el valor maximo de un entero.
    "-2 , 2147483647 , -9.313225750491594E-10", // Test para el valor minimo de un entero.
    "-1 , -2147483646 , 4.656612877414201E-10" // Test para el valor minimo de un entero.
  })
  public void tests_ShouldReturnCorrectDivide(int numberA , int numberB , double expected){
    /*Arrange:
    * Datos de entrada -> Argumentos a y b.
    * Entorno de prueba -> Instancia del objeto Calculador
    * */

    Calculador calculador = new Calculador();
    //Captura de excepciones
    try{
      //Act
      double resultado = calculador.divide(numberA , numberB);

      //Assert
      assertEquals(expected , resultado , 0.0000000000000001);

    }catch (ArithmeticException e){
      System.out.print("Error: " + e.getMessage());
    }

  }
    
}
