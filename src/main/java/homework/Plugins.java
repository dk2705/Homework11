package homework;

public class Plugins {
    
    Plugin plugin;
    
    public Plugins(){
        super();
    }

    public Plugins(
        Plugin plugin
        ){
            this.plugin = plugin;
    }
    
    @Override
    public String toString() {
        return "{"
                + "plugin=" + this.plugin + ""
                + "}";
    }

    public Plugin getPlugin() {
        return plugin;
    }

    public void setPlugin(Plugin plugin) {
        this.plugin = plugin;
    }

    
}