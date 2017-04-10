package lab.two;

import java.util.Scanner;

public class StoreMain {
    public static void main( String[] args ) {
        String producator,marca;
        int pret, elements;
        Scanner in = new Scanner(System.in);
        ListContainer list = new ListContainer();
        ListContainer list1;

        Telefon telefon1 = new Telefon("htc","one", 350);
        Telefon telefon2 = new Telefon("samsung", "s8",850);
        Telefon telefon3 = new Telefon("lg", "nexus5",250);
        Telefon telefon4 = new Telefon("meizu", "mi3",350);
        Telefon telefon5 = new Telefon("iPhone", "6S",650);

        list.addElementToList(telefon1);
        list.addElementToList(telefon2);
        list.addElementToList(telefon3);
        list.addElementToList(telefon4);
        list.addElementToList(telefon5);

        System.out.println("Afisarea listei: ");
        list.printListMembersDetails();

        System.out.println("************************");

        System.out.println("Indicati producatorul care doriti sa stergeti din lista: ");
        producator = in.next();
        list.removeElementFromListByProducator(producator);
        System.out.println("Afisarea listei actualizata: ");
        list.printListMembersDetails();

        System.out.println("************************");

        System.out.println("Indicati datele noului element de adaugat in lista");
        System.out.print("Producator: ");
        producator = in.next();
        System.out.print("Marca: ");
        marca = in.next();
        System.out.print("Pret: ");
        pret = in.nextInt();

        Telefon newTel = new Telefon(producator,marca,pret);
        list.addElementToList(newTel);
        System.out.println("Afisarea listei actualizata: ");
        list.printListMembersDetails();

        System.out.println("************************");

        list1 = list.createNewListContainerFromThis();
        System.out.println("Afisarea listei noi, creata da la precedenta: ");
        list1.printListMembersDetails();

        System.out.println("************************");
        System.out.print("Cite elemente doriti sa stergeti din prima lista: ");
        elements = in.nextInt();
        while(!list.removeLastNElements(elements)){
            System.out.print("Prea mult! Cite elemente doriti sa stergeti din prima lista: ");
            elements = in.nextInt();
            list.removeLastNElements(elements);
        }
        System.out.println("Afisarea primei liste cu ultimele "+elements+" elemente sterse:");
        list.printListMembersDetails();

        System.out.println("************************");

        System.out.println("Copy elementelor din a doua lista in prima: ");
        list.addFromAnotherListContainer(list1);
        System.out.println("Afisarea finala a primei liste: ");
        list.printListMembersDetails();

        System.out.println("************************");

        System.out.println("Afisarea finala a listei a doua: ");
        list1.printListMembersDetails();
    }
}
