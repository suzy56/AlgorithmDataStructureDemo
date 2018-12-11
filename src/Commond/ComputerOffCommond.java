package Commond;

public class ComputerOffCommond implements Commond {

    private Computer computer;

    public ComputerOffCommond(Computer computer){
        this.computer = computer;
    }


    @Override
    public void excute() {
        computer.off();
    }
}
