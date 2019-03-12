package bridge;

public abstract class Team {
    public abstract void score();
    public abstract void defence();
    public abstract void end();
}

class Celtics extends Team {
    @Override
    public void score() {
        System.out.println("Celtics scores.");
    }

    @Override
    public void defence() {
        System.out.println("Celtics get the ball.");
    }

    @Override
    public void end() {
        System.out.println("Celtics loose the game.");
    }
}

class Lakers extends Team {
    @Override
    public void score() {
        System.out.println("Lakers made again!!!");
    }

    @Override
    public void defence() {
        System.out.println("Lakers take back the chance!");
    }

    @Override
    public void end() {
        System.out.println("Lakers win!!!");
    }
}