import java.util.Scanner;

public class Exercicio6 {
  /**
   * 6. Elabore um programa que leia 30 valores em Fahrenheit, calcula a conversão de cada 
   * temperatura de Fahrenheit (F) para Celsius (C) e escreve o valor resultante na tela. 
   * Para calcular a conversão defina um método e use a fórmula C = 59 × (F − 32).
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double fahrenheitValue, celsiusValue;
    
  for(int i=1; i<=30; i++){
    //celsiusValue=0.0;
    System.out.println("\nInforme o " + i + "° valor em Fahrenheit.");
    fahrenheitValue = in.nextDouble();
    celsiusValue = calculateCelcius(fahrenheitValue);
    System.out.printf("O valor em Celsius é %.2f.", celsiusValue);
  }
  System.out.println();
  System.out.printf("\n.::Fim da Execução::.");
  in.close();
}
/*
 * return the Fahrenheit temperature in Celsius 
 */
  public static double calculateCelcius(double value1){
    return ((value1 - 32) * 5/9);
  }
}
