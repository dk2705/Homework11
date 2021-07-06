package homework;

public class Plugin {
    
    String artifactId;
    String version;
    Configuration configuration;
    Executions executions;
    
    public Plugin(){
        super();
    }

    public Plugin(
        String artifactId,
        String version,
        Configuration configuration,
        Executions executions
        ){
            this.artifactId = artifactId;
            this.version = version;
            this.configuration = configuration;
            this.executions = executions;
    }
    
    @Override
    public String toString() {
        return "{"
                + "artifactId='" + this.artifactId + "'"
                + ", version='" + this.version + "'"
                + ", configuration=" + this.configuration + ""
                + ", executions=" + this.executions + ""
                + "}";
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public Executions getExecutions() {
        return executions;
    }

    public void setExecutions(Executions executions) {
        this.executions = executions;
    }

    
}