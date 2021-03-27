package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        TemperatureSensor t1 = new TemperatureSensor();
        System.out.println(t1);
        
        TemperatureSensor t2 = new TemperatureSensor(10, "Plant_A");
        System.out.println(t2);
        System.out.println(t2.getLocation());
        
    }
}
