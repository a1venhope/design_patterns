package bridge;

public abstract class Player {
    Team team;
    public Team(Team team) {
        this.team = team;
    }
    public abstract void score();
    public abstract void defence();
    public abstract void end();
}

class LeBronJames extends Player {
    @Override
    public void score() {
        System.out.println("LeBron James made a Slam Dunk!!!");
        team.score();
    }

    @Override
    public void defence() {
        System.out.println("LeBron James block the shoot!");
        team.defence();
    }

    @Override
    public void end() {
        System.out.println("LeBron James get 36 points, 14 rebounds, and 11 assists");
        team.end();
    }
}

class KyrieIrving extends Player {
    @Override
    public void score() {
        System.out.println("Kyrie shoot a big three.");
        team.score();
    }

    @Override
    public void defence() {
        System.out.println("Kyrie steel the ball!!!");
        team.defence();
    }

    @Override
    public void end() {
        System.out.println("Kyrie get 53 points at the final of the game.");
        team.end();
    }
}