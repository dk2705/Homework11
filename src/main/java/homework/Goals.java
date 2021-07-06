package homework;

public class Goals {

    String goal;
    
    public Goals(){
        super();
    }

    public Goals (String goal){
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "{"
                + "goal='" + this.goal + "'"
                + "}";
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    
}
