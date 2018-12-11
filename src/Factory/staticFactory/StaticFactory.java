package Factory.staticFactory;

public class StaticFactory {


    public static Iproduct product = null;

    public static Iproduct getProduct(String productType) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if(productType.trim().equals("productA")){
            //product = (Iproduct)Class.forName("Factory.staticFactory.ProductA").newInstance();
            product =   ProductA.class.newInstance();


        }
        if(productType.trim().equals("productB")){
            //product = (Iproduct)Class.forName("Factory.staticFactory.ProductB").newInstance();
            product =   ProductB.class.newInstance();
        }

        return product;
    }

}
