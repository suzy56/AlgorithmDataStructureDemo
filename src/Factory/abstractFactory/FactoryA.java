package Factory.abstractFactory;

import Factory.staticFactory.Iproduct;
import Factory.staticFactory.ProductA;

public class FactoryA implements AbstractFactory{
    @Override
    public Iproduct createProduct() {
        return new ProductA();
    }
}
