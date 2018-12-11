package Commond;

public class ControlPannel {

    private static final int CONTROL_SIZE = 9;

    private Commond[] commonds;

    public ControlPannel(){
        commonds = new Commond[CONTROL_SIZE];
        for (int i = 0; i < CONTROL_SIZE; i++){
            commonds[i] = new NoCommond();
        }
    }

    public void setCommonds(int index,Commond commond){
       commonds[index] = commond;
    }

    public void keyPress(int index){
        commonds[index].excute();
    }




}
