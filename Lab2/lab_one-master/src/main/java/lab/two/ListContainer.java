package lab.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    void removeElementFromList(Telefon telefon) {
        this.telefonList.remove(telefon);
    }

    void removeElementFromListByProducator(String producator) {
        Telefon temp = findElementByProducator(producator);
        if(temp!=null){
            this.removeElementFromList(temp);
        }
        else {
            System.out.println("************************");
            System.out.println("Nu exista asa producator");
            System.out.println("************************");
        }
    }

    Telefon findElementByProducator(String producator) {
        Telefon result = null;
        Iterator<Telefon> listIterator = telefonList.iterator();
        while (listIterator.hasNext()) {
            Telefon temp = listIterator.next();
            if(temp.getProducator().equals(producator))
                result = temp;
        }
        return result;
    }

    ListContainer createNewListContainerFromThis() {
        ListContainer newList = new ListContainer();
        Iterator<Telefon> listIterator = telefonList.iterator();
        while (listIterator.hasNext()) {
            newList.addElementToList(listIterator.next());
        }
        return newList;
    }

    void printListMembersDetails() {
        Iterator<Telefon> listIterator = telefonList.iterator();

        while (listIterator.hasNext()) {
            Telefon temp = listIterator.next();
            System.out.println(temp.toString());
        }
    }

    boolean removeLastNElements(int n) {
        if(n<telefonList.size()){
            this.removeFromList(n);
            return true;
        }
        else
            return false;
    }

    void removeFromList(int n) {
        int countdown = 0;
        while (countdown < n) {
            telefonList.remove(telefonList.size() - 1);
            countdown++;
        }
    }

    void addFromAnotherListContainer(ListContainer oldList) {
        Iterator<Telefon> listIterator = oldList.getTelefonList().iterator();

        while (listIterator.hasNext()) {
            Telefon temp = listIterator.next();
            this.addElementToList(temp);
        }
    }

}
