import java.util.ArrayList;
import java.util.List;

public class Tarefa2 {
    public static void main(String args[]) {
        List<String> listaCompleta = new ArrayList<>();
        List<String> listaMasculina = new ArrayList<>();
        List<String> listaFeminina = new ArrayList<>();

        listaCompleta.add("Saulo-M");
        listaCompleta.add("Fabia-F");
        listaCompleta.add("Pedro-M");
        listaCompleta.add("Veluma-F");
        listaCompleta.add("Miguel-M");
        listaCompleta.add("Suzana-F");
        listaCompleta.add("Raul-M");
        listaCompleta.add("Vivian-F");
        listaCompleta.add("João-M");
        listaCompleta.add("Bianca-F");
        listaCompleta.add("Artur-M");
        listaCompleta.add("Cleusa-F");

        for(String element : listaCompleta){
            if(element.contains("-M")){
                listaMasculina.add(element);
            }else {
                listaFeminina.add(element);
            }
        }

        System.out.println("*** Esta é a lista Original. ***");
        System.out.println(listaCompleta);
        System.out.println(" ");

        System.out.println("*** Aqui temos a lista Masculina. ***");
        System.out.println(listaMasculina);
        System.out.println(" ");

        System.out.println("*** E por fim a lista Feminina. ***");
        System.out.println(listaFeminina);
        System.out.println(" ");
    }
}
