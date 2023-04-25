import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tarefa1 {
    public static void main(String args[]) {
        List <String> listaNomes = new ArrayList<>();

        listaNomes.add("Saulo Pereira");
        listaNomes.add("Luci de Souza");
        listaNomes.add("Camila Pitanga");
        listaNomes.add("Veluma Santana");
        listaNomes.add("Amanda Cornes");
        listaNomes.add("Pedro Gustavo");
        listaNomes.add("Raul Gazol");

        System.out.println("*** Lista com nomes em ordem original ***");
        System.out.println(listaNomes);
        System.out.println(" ");

        System.out.println("*** Lista com nomes em ordem alfabetica ***");
        Collections.sort(listaNomes);
        System.out.println(listaNomes);
        System.out.println(" ");

    }
}