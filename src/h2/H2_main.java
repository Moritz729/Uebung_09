package h2;

import java.util.ArrayList;

public class H2_main {
    public static void main(String[] args) {
         Passenger a = new Passenger("Anna", 2, true);   // möchte 2 Stationen fahren
        Passenger b = new Passenger("Ben", 1, true);
        Passenger c = new Passenger("Clara", 3, false);

        Bus bus = new Bus();
        bus.enterBus(a);
        bus.enterBus(b);
        bus.enterBus(c);
        System.out.println(bus.getPassengerName(1));
        Bus otherBus=new Bus();
        String[] namensListe={"Ben","Max"};
        bus.transferPassengers(otherBus, namensListe);
        System.out.println(otherBus.getPassengerName(0));
        System.out.println(bus.getPassengerName(1));
        System.out.println(bus.findPassengersWithoutTickets());




       

        
    }

}
