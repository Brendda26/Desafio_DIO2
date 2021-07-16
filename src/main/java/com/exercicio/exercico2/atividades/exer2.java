
import java.io.IOException;
import java.util.Scanner;

public class  Desafio {
	
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int cont = 0;
    double soma = 0;
    double n = 0;
   
    
      while (true) {
        n = leitor.nextInt();
        
        if(n<=0){
         break;
        }
        
        soma += n;
        cont ++;
      }  
        
      double media = soma / cont;
      System.out.println(String.format("%.2f", media));  

    }

}

/*
Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a 
idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo
 for lido.

Saída

A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.

*/

