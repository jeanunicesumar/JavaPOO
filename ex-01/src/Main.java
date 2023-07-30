import person.Person;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Data agora: " + date);


        Person person1 = new Person();
        person1.setName("Ricardo");
        person1.showInfoPerson();

        Person person2 = new Person("Mauricio", 19);
        person2.showInfoPerson();
    }
}