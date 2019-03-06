package factory.factory_method;

public abstract class Factory {
    public abstract Product getProduct();

    public void useProduct() {
        Product product = getProduct();

        // use Product do something
    }
}

class Factory1 extends Factory {

    @Override
    public Product getProduct() {
        return new Product1();
    }
}

class Factory2 extends Factory {

    @Override
    public Product getProduct() {
        return new Product2();
    }
}

class Factory3 extends Factory {

    @Override
    public Product getProduct() {
        return new Product3();
    }
}
