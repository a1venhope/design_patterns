package factory.simple_factory;

public interface Product {
    void product();
}

class Product1 implements Product {
    private static String name = "product1";

    @Override
    public void product() {
        System.out.println("Reduce a " + name);
    }
}

class Product2 implements Product {
    private static String name = "product2";

    @Override
    public void product() {
        System.out.println("Reduce a " + name);
    }
}

class Product3 implements Product {
    private static String name = "product3";

    @Override
    public void product() {
        System.out.println("Reduce a " + name);
    }
}
