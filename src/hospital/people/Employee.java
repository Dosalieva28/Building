package hospital.people;

public class Employee extends Person {
    private String doljnost;
     public Employee(){

     }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String familiya, int dataRojdeniya, String adressElektronoiPochty, String doljnost) {
        super(name, familiya, dataRojdeniya, adressElektronoiPochty);
        this.doljnost = doljnost;
    }

    public String getDoljnost() {
        return doljnost;
    }

    public void setDoljnost(String doljnost) {
        this.doljnost = doljnost;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "doljnost='" + doljnost + '\'' +
                "} " + super.toString();
    }
}
