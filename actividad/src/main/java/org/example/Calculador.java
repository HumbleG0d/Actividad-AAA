package org.example;

public class Calculador {
  public int add(int numeroA, int numeroB) {
    if ((numeroA > 0 && numeroB > 0 && numeroA > Integer.MAX_VALUE - numeroB) ||
    (numeroA < 0 && numeroB < 0 && numeroA < Integer.MIN_VALUE - numeroB)) {
      throw new ArithmeticException("Overflow al sumar " + numeroA + " y " + numeroB);
    }
    return numeroA + numeroB;
  }

  public int substract(int numeroA, int numeroB) {
    if ((numeroA < 0 && numeroB > 0 && numeroA < Integer.MIN_VALUE + numeroB) || (numeroA > 0 && numeroB < 0 && numeroA > Integer.MAX_VALUE + numeroB)) {
            throw new ArithmeticException("Overflow al restar " + numeroA + " y " + numeroB);
        }
    return numeroA - numeroB;
  }

  public int multiply(int numeroA, int numeroB) {
    if(numeroA == Integer.MAX_VALUE || numeroB == Integer.MAX_VALUE || numeroA == Integer.MIN_VALUE || numeroB == Integer.MIN_VALUE){
      throw new ArithmeticException("Overflow al multiplicar " + numeroA + " y " + numeroB);
    }
  
    return numeroA * numeroB;
  }

  public double divide(int numeroA, int numeroB) {
    if (numeroB == 0) {
      throw new ArithmeticException("Division por cero");
    }
    return (double) numeroA / numeroB;
  }

}
