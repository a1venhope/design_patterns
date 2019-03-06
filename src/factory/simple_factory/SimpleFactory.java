package factory.simple_factory;

public class SimpleFactory {

    public Product produce(String productName) {
        switch (productName) {
            case "product1":
                return new Product1();
            case "product2":
                return new Product2();
            case "product3":
                return new Product3();
        }
        return null;
    }
}
