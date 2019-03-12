package adapter;

public interface Alien {
    void talk();
}

class HumanAdapter implements Alien {
    Human human;

    public HumanAdapter(Human human) {
        this.human = human;
    }

    public void talk() {
        human.speak();
    }
}