import java.util.List;

public class Main implements CheckPerson{

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    @Override
    public boolean test(Person p) {
        return false;
    }
}
