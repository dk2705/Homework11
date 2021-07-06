package homework;

public class Executions {
    
    Execution execution;
    
    public Executions(){
        super();
    }

    public Executions(
        Execution execution
        ){
            this.execution = execution;
    }
    
    @Override
    public String toString() {
        return "{"
                + "execution=" + this.execution + ""
                + "}";
    }

    public Execution getExecution() {
        return execution;
    }

    public void setExecution(Execution execution) {
        this.execution = execution;
    }


    
}