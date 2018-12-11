package Factory.abstractFactory;

import Factory.staticFactory.Iproduct;
import Factory.staticFactory.ProductB;

public class FactoryB implements AbstractFactory{
    @Override
    public Iproduct createProduct() {
        return new ProductB();
    }
}
