package EnumeratedTypes;

public class Enumerated {
    Day day;

    public Enumerated(Day day){
        this.day =day;
    }

    public void aboutThisDay(){
        switch (day){
            case MONDAY:
                System.out.println("Monday are bad");
                break;
            case FRIDAY:
                System.out.println("Friday are better");
                break;
            case SATURDAY:case SUNDAY:
                System.out.println("Wekkend are the best");
            default:
                System.out.println("Midweek are : (");
                break;
        }
    }
    public static void main(String[] args) {
        Enumerated fristday = new Enumerated(Day.MONDAY);
        fristday.aboutThisDay();
        Enumerated thirdday = new Enumerated(Day.WEDNESDAY);
        thirdday.aboutThisDay();
        Enumerated fifthday = new Enumerated(Day.FRIDAY);
        fifthday.aboutThisDay();
        Enumerated sixthday = new Enumerated(Day.SATURDAY);
        sixthday.aboutThisDay();
    }
}
