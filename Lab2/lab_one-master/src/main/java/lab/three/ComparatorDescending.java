package lab.three;

import java.util.Comparator;

/* Comparator descrescator dupa producator */
public class ComparatorDescending implements Comparator<Telefon> {
    public int compare(Telefon o1, Telefon o2) {
        return -(o1.getProducator().compareTo(o2.getProducator()));
    }
}