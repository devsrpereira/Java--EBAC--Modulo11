import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExemploListSimples {
    public static void main(String args[]) {
        System.out.println("****** VAMOS MONTAR UMA LISTA de ELEMENTOS ******");
        Scanner s = new Scanner(System.in);
        String criarLista = null;

        do {
            List<String> novaLista = new ArrayList<String>();

            System.out.println("----- Insira o nome da Lista. -----");
            String nomeLista = s.next();

            String novoElemento = null;

            do {
                System.out.println("----- Insira um elemento na lista " + nomeLista + ". -----");
                novaLista.add(s.next());

                System.out.println("***** Deseja adicionar outro elemento? (S/N) ******");
                novoElemento = s.next();

            } while (novoElemento.equals("S"));

            System.out.println("------ Estes são os elementos adicionados à lista " + nomeLista + ". ------");
            System.out.println(novaLista);

            System.out.println("------ Deseja colocar estes elementos em ordem alfabetica? (S/N) ------");
            String ordenarElemento = s.next();

            if (ordenarElemento.equals("S")) {
                Collections.sort(novaLista);
                System.out.println(novaLista);
            }

            System.out.println("------ Deseja criar uma nova lista? (S/N) ------");
            criarLista = s.next();

        } while (criarLista.equals("S"));

   System.out.println("------ Obrigado por utilizar o Montador de Listas 2.2 ------");
    }
}