package adapter;

public interface Human {
    void speak();
}

class American implements Human {
    @Override
    public void speak() {
        System.out.println("hello this a jack");
    }
}

class Chinese implements Human {
    @Override
    public void speak() {
        System.out.println("我是李桑");        
    }
}