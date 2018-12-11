package Strategy.v2;


public abstract class Role {
    protected AttackIn attackIn;
    protected DefendIn defendIn;
    protected RunIn runIn;
    protected DisplayIn displayIn;
    protected String name;





    public Role setAttackIn(AttackIn attackIn) {
        this.attackIn = attackIn;
        return this;
    }

    public Role setDefendIn(DefendIn defendIn) {
        this.defendIn = defendIn;
        return this;
    }

    public Role setRunIn(RunIn runIn) {
        this.runIn = runIn;
        return this;
    }

    public Role setDisplayIn(DisplayIn displayIn) {
        this.displayIn = displayIn;
        return this;
    }

    public void display()
    {
        displayIn.display();
    }

    public void run()
    {
        runIn.run();
    }

    public void attack()
    {
        attackIn.attack();
    }

    public void defend() {
        defendIn.defend();
    }
}
