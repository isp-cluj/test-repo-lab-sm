package isp.lab4.exercise5;

class TemperatureSensor{
    
}

class FireAlarm{
    
}

class Controller{
    private TemperatureSensor[] temperatureSensors;
    private FireAlarm fireAlarm;
    
    public Controller(){
        fireAlarm = new FireAlarm();
        temperatureSensors = new TemperatureSensor[3]; // vector de 3 elemente [null, null, null]
        temperatureSensors[0] = new TemperatureSensor();
        temperatureSensors[1] = new TemperatureSensor();
        temperatureSensors[2] = new TemperatureSensor();
    }
    
    public void controlSetp(){
        System.out.println("Apply control logic.");
    } 
}

class House{
    private Controller controller;

    public House(Controller controller) {
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }
    
}

public class Exercise5 {
    public static void main(String[] args) {
        Controller ctrl = new Controller();
        House h1 = new House(ctrl);
        h1.getController().controlSetp();
        
    }
}
