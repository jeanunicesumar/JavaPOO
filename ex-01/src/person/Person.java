package person;

public class Person {
    private String name;
    private String dateBirth;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String dateBirth, int age) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void showInfoPerson() {
        System.out.printf("""
                Nome: %s
                Data nascimento: %s
                Idade: %d
                %n""", name, dateBirth, age);
    }
}
