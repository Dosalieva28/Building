import hospital.Building;
import hospital.people.Employee;
import hospital.people.Patient;
import hospital.people.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient pt = new Patient("Cabyr","Ab",250520,"s@gmail","Psih") ;
        Employee ee = new Employee("Ariana", "Dia", 12032002, "fd@vjvhj", "medsestra");
        Person pn = new Person("Ademi", "Rahatbekova", 29082001, "kjkj@bj");
        Building bg = new Building(99, 97, "Cholpon-Ata ul.Green 45");
        System.out.println(pt.toString());
        System.out.println(ee.toString());
        System.out.println(pn.toString());
        System.out.println(bg.toString());


        System.out.println("|-------------------------------------------------|");
        System.out.println("|_______________Hospital____________________|");
        System.out.println("|   Building   |   Employee   |    Patient     | ");
        System.out.printf("|       %s       |      %s        |       %s         | \n",bg.getAdress(),ee.getName(),pt.getName());
        for (int i = 0; true; i++) {
            Scanner ds = new Scanner(System.in);
                System.out.println("Напишите имя сотрудника");
            String d = ds.nextLine();
                System.out.println("Напишите имя пациента");
            String d2 = ds.nextLine();
            if(d.contains("n")){
                break;
            }else {
                Employee em = new Employee(d);
                Patient p1 = new Patient(d2);
        System.out.printf("|             |       %s        |         %s        | \n",em.getName(),p1.getName());

            }

        }
    }



}