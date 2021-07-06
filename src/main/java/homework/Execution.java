package homework;

public class Execution {
    
    String id;
    String phase;
    Goals goals;
    
    public Execution(){
        super();
    }

    public Execution(
        String id,
        String phase,
        Goals goals
        ){
            this.id = id;
            this.phase = phase;
            this.goals = goals;
    }
    
    @Override
    public String toString() {
        return "{"
                + "id='" + this.id + "'"
                + ", phase='" + this.phase + "'"
                + ", goals=" + this.goals + ""
                + "}";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }
    

}