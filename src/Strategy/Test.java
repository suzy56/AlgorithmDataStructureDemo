package Strategy;


import Strategy.v2.*;

public class Test {

    public static void main(String[] args) {
        Role ra = new RoleA("tt");
        ra.setAttackIn(new AttackInImpl())
          .setDefendIn(new DefendInImpl())
          .setDisplayIn(new DisplayInImpl())
          .setRunIn(new RunInImpl());
        ra.run();
        ra.defend();
        ra.display();
        ra.defend();

    }
}
