package lab.three;

import java.util.Scanner;

public class StoreMain {
    public static void main( String[] args ) {
        String producator;
        int pret, result;
        ListContainer list = new ListContainer();
        SetContainer set = new SetContainer();
        ListContainer finalContainer;
        Scanner in = new Scanner(System.in);

        Telefon telefon1 = new Telefon("htc","two", 350);
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
        System.out.println("----------------------------");
        list.printListMembersDetails();

        System.out.println("****************************");
        list.sortListDescending();
        System.out.println("Afisarea listei oridnata descrescator dupa producator: ");
        System.out.println("----------------------------");
        list.printListMembersDetails();

        System.out.println("****************************");

        System.out.println("Indicati producatorul care doriti sa cautati in lista: ");
        System.out.println("----------------------------");
        producator = in.next();
        list.findElementByProducatorOutput(producator);

        System.out.println("****************************");

        set.copyElementsFromList(list);
        System.out.println("Afisarea setului creat cu elementele listei ordinate crecator dupa producator: ");
        System.out.println("----------------------------");
        set.printSetMembersDetails();

        System.out.println("****************************");

        list.sortListCustomComparator(new ComparatorAscending());
        System.out.println("Afisarea listei cu elementele ordinate crecator dupa producator: ");
        System.out.println("----------------------------");
        list.printListMembersDetails();

        System.out.println("****************************");
        finalContainer = set.mergeWithList(list);
        System.out.println("Afisarea setului final cu elementele listei si setului precedent (ordinate): ");
        System.out.println("----------------------------");
        finalContainer.sortListCustomComparator(new ComparatorAscending());
        finalContainer.printListMembersDetails();

        System.out.println("****************************");
        System.out.println("Indicati pretul maxim de interes: ");
        System.out.println("----------------------------");
        pret = in.nextInt();
        result = finalContainer.findElementsByCustomRule(pret);
        System.out.println("Exista "+result+" elemente cu pret mai mic de "+pret+"€");

        System.out.println("****************************");

        System.out.println("Indicati producatorul care doriti sa cautati in lista finala: ");
        System.out.println("----------------------------");
        producator = in.next();
        finalContainer.findElementByProducatorOutput(producator);


    }
}