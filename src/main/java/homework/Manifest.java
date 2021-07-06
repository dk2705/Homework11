package homework;

public class Manifest {

    String mainClass;
    
    public Manifest(){
        super();
    }

    public Manifest (String mainClass){
        this.mainClass = mainClass;
    }

    @Override
    public String toString() {
        return "{"
                + "mainClass='" + this.mainClass + "'"
                + "}";
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    
}
