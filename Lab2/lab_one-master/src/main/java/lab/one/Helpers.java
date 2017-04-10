package lab.one;

import java.util.Iterator;
import java.util.List;

class Helpers {

    void printListElements(List<Integer> list) {
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.print(" "+listIterator.next()+" ");
        }
        System.out.println();
    }

    void removeFromList(List<Integer> list, int r) {
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Integer temp = listIterator.next();
            if(temp==r)
                listIterator.remove();
        }
    }

    void addElementToList(List<Integer> list, int r) {
        list.add(r);
    }

    void copyFromListToList(List<Integer> list1, List<Integer> list2) {
        Iterator<Integer> listIterator = list1.iterator();
        while (listIterator.hasNext()) {
            Integer temp = listIterator.next();
            list2.add(temp);
        }
    }

    boolean removeLastNElements(List<Integer> list, int n) {
        if(n<list.size()){
            int countdown = 0;
            while (countdown < n) {
                list.remove(list.size() - 1);
                countdown++;
            }
            return true;
        }
        else
            return false;
    }

}
