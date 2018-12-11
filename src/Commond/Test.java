package Commond;

public class Test {

    public static void main(String[] args) {
        Light light = new Light();
        Computer computer = new Computer();
        Door door = new Door();

        ControlPannel controlPannel = new ControlPannel();
        controlPannel.setCommonds(0,new ComputerOnCommond(computer));
        controlPannel.setCommonds(1,new ComputerOffCommond(computer));

        controlPannel.setCommonds(2,new QuickCommond(new Commond[]{new ComputerOnCommond(computer),new ComputerOffCommond(computer)}));
        controlPannel.keyPress(0);
        controlPannel.keyPress(1);


        System.out.println("====================");
        controlPannel.keyPress(2);
    }
}
