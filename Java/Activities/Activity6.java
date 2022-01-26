import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengersList;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengersList = new ArrayList<>();
    }

    public void onboard(String passenger) {
        this.passengersList.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengersList.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengersList;
    }
}

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        //There is a plane with max 30 passengers
        Plane plane = new Plane(30);
        //Add passengers on the list
        plane.onboard("Aadeel");
        plane.onboard("John1");
        plane.onboard("Steve2");
        plane.onboard("Anna3");
        plane.onboard("Nadhir");
        //Plane takes off
        System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        //Flying.....
        Thread.sleep(5000);
        //Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}