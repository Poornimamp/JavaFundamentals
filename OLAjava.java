package additionApp;

public class OLAjava {
	
	
     static int capacity=4;
     static int basefare=30;
     static int  i=25;
     void olaMethod(int km){
     //int km=5;
     basefare=basefare+i;
     System.out.println("Starting price"+basefare);
     if(km>3) {
    	 basefare+=20;
    	 System.out.println("After 3km Fare"+basefare);
     } }   	 
     	

}
