package activities;

public class Activity3 {

    public static void main(String[] args) {
        double ageInSeconds = 1000000000;
        calculateAge(ageInSeconds);
    }

    private static void calculateAge(double ageInSeconds) {
        double earthYearInSec = 31557600;
        double mercuryYearInSec = (0.2408467*earthYearInSec);
        double venusYearInSec= (0.61519726*earthYearInSec);
        double marsYearInSec = (1.8808158*earthYearInSec);
        double jupiterYearInSec = (11.862615*earthYearInSec);
        double saturnYearInSec = (29.447498*earthYearInSec);
        double uranusYearInSec = (84.016846*earthYearInSec);
        double neptuneYearInSec = (164.79132*earthYearInSec);

        System.out.println("Age On Earth : " + ageInSeconds/earthYearInSec);
        System.out.println("Age On Mercury : " + ageInSeconds/mercuryYearInSec);
        System.out.println("Age On Venus : " + ageInSeconds/venusYearInSec);
        System.out.println("Age On Mars : " + ageInSeconds/marsYearInSec);
        System.out.println("Age On Jupiter : " + ageInSeconds/jupiterYearInSec);
        System.out.println("Age On Saturn : " + ageInSeconds/saturnYearInSec);
        System.out.println("Age On Uranus : " + ageInSeconds/uranusYearInSec);
        System.out.println("Age On Neptune : " + ageInSeconds/neptuneYearInSec);




    }


}
