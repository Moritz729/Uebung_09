package h2;
import java.util.ArrayList;

public class Bus {
    public ArrayList <Passenger> passengers;
    public Bus(){
        passengers=new ArrayList<Passenger>();
    }
    public void enterBus(Passenger p){
        passengers.add(p);
    }
    private void exitBus(){
        int i=0;
        while(i<passengers.size()){
           if(passengers.get(i).getPlanned()==passengers.get(i).getVisited()){
            passengers.remove(i);
            i=i-1;
           }
           i++; 

        }
    }
    public void nextStop(Passenger[] boarding){
        int i=0;
        while(i<passengers.size()){
            passengers.get(i).setVisited();
            i++;
        }
        exitBus();
        if(boarding!=null){
        for(int e = 0;e<=boarding.length-1;e++){
            passengers.add(boarding[e]);
        }
        }
    }
    public void nextStop(){
        int i=0;
        while(i<passengers.size()){
            passengers.get(i).setVisited();
            i++;
        }
        exitBus();
    }
    public ArrayList <Passenger>  findPassengersWithoutTickets(){
        ArrayList <Passenger> ohneTicket=new ArrayList<Passenger>();
        int i=0;
        while(i<passengers.size()){
            if(passengers.get(i).getTicket()==false){
                ohneTicket.add(passengers.get(i));
                passengers.remove(i);
                i=i-1;
            }
            i++;
        }
        return ohneTicket;
    }
    public void  transferPassengers(Bus otherBus, String[] passengerNames){
        
        for(int i=0;i<passengers.size();i++){
            for(int j=0;j<=passengerNames.length-1;j++){
                if(passengers.get(i).getName().equals(passengerNames[j])){
                    otherBus.enterBus(passengers.get(i));
                    passengers.remove(i);
                }
            }
        }
    }
    public String getPassengerName(int a){
        return passengers.get(a).getName();
    }


}
