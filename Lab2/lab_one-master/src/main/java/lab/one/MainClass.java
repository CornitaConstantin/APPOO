package lab.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main( String[] args ) {
        Helpers help = new Helpers();
        Scanner in = new Scanner(System.in);
        int element, elements, size;

        // Create list
        List<Integer> list = new ArrayList<>();
        List<Integer> listNew = new ArrayList<>();

        // Populate list of integers
        for(int i=1;i<=10;i++){
            list.add(i);
        }

        System.out.println("Afisarea listei: ");
        help.printListElements(list);

        System.out.println("************************");
        System.out.println("Indicati cite elemente doriti sa stergeti din lista: ");
        size = in.nextInt();
        if(size>0)
            System.out.println("Indicati elementul care doriti sa stergeti din lista: ");
        for(int i=0;i<size;i++) {
            System.out.print("Elementul "+i+": ");
            element = in.nextInt();
            help.removeFromList(list,element);
        }
        System.out.println("Afisarea listei actualizata: ");
        help.printListElements(list);

        System.out.println("************************");
        System.out.println("Indicati cite elemente doriti sa adaugati in lista: ");
        size = in.nextInt();
        if(size>0)
            System.out.println("Indicati elementul care doriti sa adaugati in lista: ");
        for(int i=0;i<size;i++) {
            System.out.print("Elementul "+i+": ");
            element = in.nextInt();
            help.addElementToList(list, element);
        }
        System.out.println("Afisarea listei actualizata: ");
        help.printListElements(list);

        System.out.println("************************");
        help.copyFromListToList(list,listNew);
        System.out.println("Afisarea listei noi, creata de la prima lista: ");
        help.printListElements(listNew);

        System.out.println("************************");
        System.out.print("Cite elemente doriti sa stergeti din prima lista: ");
        elements = in.nextInt();
        if(elements>list.size()) {
            while(elements>list.size()){
                System.out.println("Prea mult! Lista are doar "+list.size()+" elemente.");
                System.out.println("Cite elemente doriti sa stergeti din prima lista: ");
                elements = in.nextInt();
                help.removeLastNElements(list,elements);
            }
        }
        else
            help.removeLastNElements(list,elements);
        System.out.println("Afisarea primei liste cu ultimele "+elements+" elemente sterse:");
        help.printListElements(list);

        System.out.println("************************");
        help.copyFromListToList(listNew,list);
        System.out.println("Afisarea primei liste dupa adaugarea elementelor din a doua: ");
        help.printListElements(list);
        System.out.println("Afisarea listei a doua: ");
        help.printListElements(listNew);

    }
}
