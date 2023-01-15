package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {

        Plane plane = new Plane(10);
        plane.onboard("Shweta");
        plane.onboard("Rohant");
        plane.onboard("Anvi");
        plane.onboard("Yash");
        plane.onboard("Lata");
        plane.onboard("Anita");
        plane.onboard("Ashok");
        plane.onboard("Pravin");
        plane.onboard("Chintu");
        plane.onboard("Mintu");

        System.out.println("Take Off Time : " + plane.takeOff());

        System.out.println("Passenger list : "+plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plane landing time : "+plane.getLastTimeLanded());
    }
}
