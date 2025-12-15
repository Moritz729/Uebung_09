package h1;

public class H1_main {
    public static void main(String[] args) {
       Patient myPatient= new Patient("moritz",5);
    Patient myPatient2= new Patient("Maximilian",3);
     Patient myPatient3= new Patient("Jonas",2);
     Patient myPatient4= new Patient("Jonas",4);
     PrioList p= new PrioList();
     p.addPatient(myPatient);
     p.addPatient(myPatient2);
      p.addPatient(myPatient3);
      System.out.println(p.getPatient(1).getPrio()); 
      p.addPatient(myPatient4);
      System.out.println(p.getPatient(2).getPrio());
    }
   
     


}
