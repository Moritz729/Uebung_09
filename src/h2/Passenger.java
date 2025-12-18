package h2;

public class Passenger {
    public String name;
    public int planned;
    public int visited;
    public boolean ticket;
    public Passenger(String name, int planned, boolean ticket){
        this.name=name;
        this.planned=planned;
        this.visited=0;
        this.ticket=ticket;
    }

    public String getName(){
        return this.name;
    }
    public int getPlanned(){
        return this.planned;
    }
    public boolean getTicket(){
        return this.ticket;
    }
    public int getVisited(){
        return this.visited;
    }
    public void setVisited(){
        visited++;

    }

}
