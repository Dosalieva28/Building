package hospital.people;

public class Patient extends Person {
    private String diagnoz;

    public Patient() {

    }

    public Patient(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    public Patient(String name, String familiya, int dataRojdeniya, String adressElektronoiPochty, String diagnoz) {
        super(name, familiya, dataRojdeniya, adressElektronoiPochty);
        this.diagnoz = diagnoz;
    }


    public String getDiagnoz() {
        return diagnoz;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "diagnoz='" + diagnoz + '\'' +
                "} " + super.toString();
    }
}


