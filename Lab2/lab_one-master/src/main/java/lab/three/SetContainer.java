package lab.three;

import java.util.Set;
import java.util.TreeSet;

class SetContainer {
    private Set<Telefon> telefonSet;

    /* Constructor cu elemente in un TreeSet -> ordinat crescator dupa producator */
    SetContainer() {
        this.telefonSet = new TreeSet<>(new ComparatorAscending());
    }

    Set<Telefon> getTelefonSet() {
        return telefonSet;
    }

    void setTelefonSet(Set<Telefon> telefonSet) {
        this.telefonSet = telefonSet;
    }

    /* Popularea setului cu elemente din o lista data */
    void copyElementsFromList(ListContainer list) {
        this.telefonSet.addAll(list.getTelefonList());
    }

    /* Crearea unei noi liste unind setul cu o alta lista data */
    ListContainer mergeWithList(ListContainer list) {
        ListContainer result = new ListContainer();

        for(Telefon tList:list.getTelefonList()){
            result.addElementToList(tList);
        }

        for(Telefon tSet:this.telefonSet){
            result.addElementToList(tSet);
        }

        return result;
    }

    /* Print cu detalii despre fiecare element din set */
    void printSetMembersDetails() {
        for(Telefon t:telefonSet){
            System.out.println(t.toString());
        }
    }
}
