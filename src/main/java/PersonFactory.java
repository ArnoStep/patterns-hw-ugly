import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.Person;
import person.Phone;
import person.Physical;
import person.appearance.Appearance;

public class PersonFactory {
    public static Person getPersonWithInputId(final String id) {
        final int intCode = Integer.parseInt(id);

        final FioGenerator fioGenerator = new FioGenerator();
        fioGenerator.generateParams(intCode);
        final String name = fioGenerator.getName();

        final PhysGenerator physGenerator = new PhysGenerator();
        physGenerator.generateParams(intCode);
        final Physical physical = physGenerator.buildResponse();

        final AppearanceGenerator appearanceGenerator = new AppearanceGenerator();
        appearanceGenerator.generateParams(intCode);
        final Appearance appearance = appearanceGenerator.buildResponse();

        Phone phone = null;
        // добавляем телефон, только если введённый код не палиндром
        if (!id.equals(new StringBuilder(id).reverse().toString())) {
            final PhoneGenerator phoneGenerator = new PhoneGenerator();
            phoneGenerator.generateParams(intCode);
            phone = phoneGenerator.buildResponse();
        }
        Person person = new Person.Builder(id)
                .withName(name)
                .withPhys(physical)
                .withAppearance(appearance)
                .withPhone(phone)
                .build();
        return person;
    }
}
