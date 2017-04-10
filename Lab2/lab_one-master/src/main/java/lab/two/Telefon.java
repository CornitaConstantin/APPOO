package lab.two;

class Telefon {
    private String producator;
    private String marca;
    private double pret;

    Telefon(String producator, String marca, double pret) {
        this.producator = producator;
        this.marca = marca;
        this.pret = pret;
    }

    String getProducator() {
        return producator;
    }

    String getMarca() {return marca;}

    double getPret() {
        return pret;
    }

    void setProducator(String producator) {
        this.producator = producator;
    }

    void setMarca(String marca) {this.marca = marca;}

    public void setPret(double pret) { this.pret = pret; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telefon telefon = (Telefon) o;

        if (Double.compare(telefon.pret, pret) != 0) return false;
        if (producator != null ? !producator.equals(telefon.producator) : telefon.producator != null) return false;
        return marca != null ? marca.equals(telefon.marca) : telefon.marca == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = producator != null ? producator.hashCode() : 0;
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        temp = Double.doubleToLongBits(pret);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "producator='" + producator + '\'' +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                " €}";
    }
}
