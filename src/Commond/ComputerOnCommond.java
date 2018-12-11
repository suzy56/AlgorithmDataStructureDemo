package Commond;

public class ComputerOnCommond implements Commond {

    private Computer computer;

    public ComputerOnCommond(Computer computer){
        this.computer = computer;
    }

    @Override
    public void excute() {
        computer.on();
    }
}
