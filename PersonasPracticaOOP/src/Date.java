public class Date {
    private final short minimumYear = 1601;
    private final int relDays;
    private final int day;
    private final int month;
    private final int year;
    private final short[] gregorianDay = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
    private final short[] gregorianLeapDays = {0, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};

    Date(int actDay, int actMonth, int actYear) throws IllegalArgumentException{
        if(!isValidDate(actDay,actMonth,actYear)){
            throw new IllegalArgumentException("This is not a valid date.");
        }
        this.day = actDay;
        this.month = actMonth;
        this.year = actYear;
        this.relDays = obtainRelativeDays();
    }
    private boolean isLeap(int actYear){
        return (actYear % 400 == 0) || (actYear % 4 == 0 && actYear % 100 != 0);
    }
    private boolean isValidDate(int actDay, int actMonth, int actYear){
        short[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(actYear < minimumYear){
            return false;
        }

        if(isLeap(actYear)){
            monthDays[2] += 1;
        }

        return actDay >= 1 && actDay <= monthDays[actMonth];

    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    private int obtainRelativeDays(){
        int amountYears = this.year - minimumYear;
        int numberOfDays = (amountYears * 365)  + (amountYears / 4) - (amountYears / 100) + (amountYears / 400);

        if(isLeap(this.year)){
            numberOfDays += gregorianLeapDays[this.month] + this.day;
        }else{
            numberOfDays += gregorianDay[this.month] + this.day;
        }
        return numberOfDays;
    }
    public int daysUntil(Date newDate)
    {
        return this.relDays - newDate.relDays;
    }
    public void printDate() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
    public int elapsedYears(Date newDate) {
        int relYears = newDate.year - this.year;

        if(relYears <= 0)
            return 0;

        if(newDate.month < this.month)
            relYears--;

        return relYears;
    }

}
