import java.time.LocalDate;

public class Persona {
    private final String name;
    private final String lastName;
    private final Date birthDate;

    Persona(String name, String lastName, Date bd) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = bd;
    }

    int getAge() {
        LocalDate today = LocalDate.now();
        Date newDate = new Date(today.getDayOfMonth(),today.getMonthValue(), today.getYear());
        return this.birthDate.elapsedYears(newDate);
    }

    String getName() {
        return this.name;
    }
    String getLastName() {
        return this.lastName;
    }

    int daysUntilBd() {
        LocalDate today = LocalDate.now();
        Date actual = new Date(today.getDayOfMonth(),today.getMonthValue(), today.getYear());
        Date newBd;
        int year = today.getYear();

        if(today.getMonthValue() > this.birthDate.getMonth() ||
          (today.getMonthValue() == this.birthDate.getMonth() && today.getDayOfMonth() > this.birthDate.getDay())) {
            year++;
        }

        newBd = new Date(this.birthDate.getDay(), this.birthDate.getMonth(), year);

        return newBd.daysUntil(actual);
    }

}
