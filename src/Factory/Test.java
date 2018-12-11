package Factory;

import Factory.abstractFactory.AbstractFactory;
import Factory.abstractFactory.FactoryA;
import Factory.abstractFactory.FactoryB;
import Factory.staticFactory.Iproduct;
import Factory.staticFactory.StaticFactory;

public class Test {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Iproduct productA = StaticFactory.getProduct("productA");
        Iproduct productB = StaticFactory.getProduct("productB");

        System.out.println("productA's  price is "+ productA.getPrice());
        System.out.println("productB's  price is "+ productB.getPrice());

        AbstractFactory factory1 = null;
        factory1 = new FactoryA();
        Iproduct proa = factory1.createProduct();
        System.out.println("proa's  price is "+ proa.getPrice());
        AbstractFactory factory2= null;
        factory2 = new FactoryB();
        Iproduct prob = factory2.createProduct();
        System.out.println("prob's  price is "+ prob.getPrice());

    }

}
