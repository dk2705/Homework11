package homework;

public class Build {
    
    Plugins plugins;
    
    public Build(){
        super();
    }

    public Build(
        Plugins plugins
        ){
            this.plugins = plugins;
    }
    
    @Override
    public String toString() {
        return "{"
                + "plugins=" + this.plugins + ""
                + "}";
    }

    public Plugins getPlugins() {
        return plugins;
    }

    public void setPlugins(Plugins plugins) {
        this.plugins = plugins;
    }

    
}