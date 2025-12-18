package h1;
import java.util.ArrayList;

public class PrioList {
    public ArrayList<Patient> myList;
    myList=new ArrayList <Patient>();
    public void addPatient(Patient p){
        int i=0;
        if(myList.isEmpty()==true){
            myList.add(p);
            return;
        }
        while(i<myList.size()&&myList.get(i).getPrio()<p.getPrio()){
            i++;
        }
        myList.add(i,p);
    }
    public Patient getNextPatient(){
        if (myList.isEmpty()==true){
            return null;
        }
        Patient nextPatient=myList.get(0);
        myList.remove(0);
        return nextPatient;

    }

    public int getPosition(Patient p){
       int a =myList.indexOf(p);
       return a;
    }
    public Patient getPatient(int a){
        Patient myPatient=myList.get(a);
        return myPatient;
    }
 
    }
