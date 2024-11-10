//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date myBd = new Date(22,7,1997);
        Date mBd = new Date(22,7,2024);
        Date today = new Date(15,6,2024);

        myBd.printDate();
        System.out.println("It's been " + myBd.elapsedYears(today) + " years.");
        System.out.println(mBd.daysUntil(today) + " days left until my birthday");
        Persona pablo = new Persona("Pablo", "Monardo", myBd);
        System.out.println(pablo.getName() + " " + pablo.getLastName() + " is " + pablo.getAge() + " years old");
        System.out.println(pablo.daysUntilBd() + " days left until "+ pablo.getName() +  " birthday");
    }
}