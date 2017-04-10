package lab.three;

import java.util.Comparator;

/* Comparator crescator dupa producator */
public class ComparatorAscending implements Comparator<Telefon> {
    public int compare(Telefon o1, Telefon o2) {
        return o1.getProducator().compareTo(o2.getProducator());
    }
}