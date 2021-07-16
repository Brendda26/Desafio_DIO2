import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.*;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
	    //	num = 
        //declare as variaveis corretamente e continue a sua solução

		ArrayList<Integer> numeros = new  ArrayList<>();
		LinkedHashMap<Long, Integer> sortedMap = new LinkedHashMap<>();
		int num= sc.nextInt();

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
               numeros.add(sc.nextInt());
            } else {
                break;
            }
        }
        
      //  Collections.sort(numeros, Comparator.reverseOrder());   
		Map<Integer, Long>  variavel =  numeros.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        variavel.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey()).forEachOrdered(x -> System.out.println(x.getKey() +" aparece " + x.getValue() +" vez(es)"));
                            
		sc.close();
	}
}

/*

Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece, 
ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de 
valor.

Entrada

A primeira linha de entrada contem um único inteiro N, que indica a quantidade de valores que serão
lidos para X (1 ≤ N ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do que 20 vezes
na entrada de dados.

Saída

Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece
na entrada por ordem crescente de valor.
 
Exemplo de Entrada 	

7
8
10
8
260
4
10
10

Exemplo de Saída

4 aparece 1 vez(es)
8 aparece 2 vez(es)
10 aparece 3 vez(es)
260 aparece 1 vez(es)
*/