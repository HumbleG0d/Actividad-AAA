package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadorMethodAddTest {


  @ParameterizedTest
  @CsvSource({
          "2 , 3 , 5",
          "-2 , -3 , -5",
          "0 , 0 , 0 ",
          "2147483647 , 1 , 214748648",
          "-2 , 2147483647 , 2147483645"
  })
  public void testSuma_ShouldReturnCorrectAdd(int numberA , int numberB , int expected){
    /*Arrange:
    * Datos de entrada -> Argumentos a y b.
    * Entorno de prueba -> Instancia del objeto Calculador
    * */

    Calculador calculador = new Calculador();
    try{
      //Act
      int resultado = calculador.add(numberA , numberB);

      //Assert
      assertEquals(expected , resultado);

    }catch (Exception e){
      assertThrows(ArithmeticException.class , () -> {
        calculador.add(numberA , numberB);
      });
    }

  }

}
