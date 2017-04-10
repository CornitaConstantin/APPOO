package lab.three;

import java.util.*;

class ListContainer {
    private List<Telefon> telefonList;

    ListContainer() {
        this.telefonList = new ArrayList<>();
    }

    void addElementToList(Telefon telefon) {
        this.telefonList.add(telefon);
    }

    List<Telefon> getTelefonList() {
        return telefonList;
    }

    void setTelefonList(List<Telefon> telefonList) {
        this.telefonList = telefonList;
    }

    /* Cautarea elementelor in baza la producatorul dat -> in output lista elementelor gasite */
    List<Telefon> findElementsByProducator(String producator) {
        List<Telefon> result = new ArrayList<>();

        Iterator<Telefon> listIterator = telefonList.iterator();
        while (listIterator.hasNext()) {
            Telefon temp = listIterator.next();
            if(temp.getProducator().equals(producator))
                result.add(temp);
        }
        return result;
    }

    /* Cautarea elementelor in baza la producatorul dat -> in output detalii despre elemente gasite */
    void findElementByProducatorOutput(String producator) {
        List<Telefon> tFinal = this.findElementsByProducator(producator);
        if(tFinal.size()!=0){
            System.out.println("Elemente gasite:");
            for(Telefon t:tFinal) {
                System.out.println(t.toString());
            }
        }
        else {
            System.out.println("----------------------------");
            System.out.println("Nu exista asa elemente in lista");
            System.out.println("----------------------------");
        }
    }

    /* Ordinarea listei in ordine descrescator */
    void sortListDescending() {
        this.telefonList.sort(new ComparatorDescending());
    }

    /* Ordinarea listei cu un comparator dat */
    void sortListCustomComparator(Comparator<Telefon> comparator) {
        this.telefonList.sort(comparator);
    }

    /* Print cu detalii despre fiecare element din lista */
    void printListMembersDetails() {
        Iterator<Telefon> listIterator = telefonList.iterator();

        while (listIterator.hasNext()) {
            Telefon temp = listIterator.next();
            System.out.println(temp.toString());
        }
    }

    /* Cauta elementele cu pret mai mic decit acel dat in input */
    int findElementsByCustomRule(int pret) {
        int result = 0;
        Iterator<Telefon> listIterator = telefonList.iterator();

        while (listIterator.hasNext()) {
            Telefon temp = listIterator.next();
            if(temp.getPret()<pret)
                result++;
        }
        return result;
    }
}