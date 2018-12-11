package Strategy.v1;

public class RoleA extends Role {


    public RoleA (String name){
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("姓名："+this.name);
    }

    @Override
    public void attack() {
        System.out.println("剑开天门");
    }

    @Override
    public void defend() {
        System.out.println("铁布衫");
    }

    @Override
    public void run() {
        System.out.println("御剑");
    }
}
