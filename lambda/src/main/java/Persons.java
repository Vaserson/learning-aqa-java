import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Persons {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.getName(), this.getAge());
    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Persons> persons = new ArrayList<Persons>();
        persons.add(new Persons("Serhii", 35));
        persons.add(new Persons("Mariia", 23));
        persons.add(new Persons("Iryna", 26));
        persons.add(new Persons("Vasyl", 33));

/*        for(Persons p : persons)
            System.out.println(p);*/
        persons.stream()
                .sorted(((o1, o2) -> o2.getAge() - o1.getAge()))
//                .sorted(Comparator.comparing(Persons::getAge))
//                .filter(p -> p.getAge() < 30)
                .forEach(System.out::println);
    }
}
