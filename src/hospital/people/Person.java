package hospital.people;

public class Person {
    private String name;
    private String familiya;
    private int dataRojdeniya;
    private String adressElektronoiPochty;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String familiya, int dataRojdeniya, String adressElektronoiPochty) {
        this.name = name;
        this.familiya = familiya;
        this.dataRojdeniya = dataRojdeniya;
        this.adressElektronoiPochty = adressElektronoiPochty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public int getDataRojdeniya() {
        return dataRojdeniya;
    }

    public void setDataRojdeniya(int dataRojdeniya) {
        this.dataRojdeniya = dataRojdeniya;
    }

    public String getAdressElektronoiPochty() {
        return adressElektronoiPochty;
    }

    public void setAdressElektronoiPochty(String adressElektronoiPochty) {
        this.adressElektronoiPochty = adressElektronoiPochty;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", familiya='" + familiya + '\'' +
                ", dataRojdeniya=" + dataRojdeniya +
                ", adressElektronoiPochty='" + adressElektronoiPochty + '\'' +
                '}';
    }

}

