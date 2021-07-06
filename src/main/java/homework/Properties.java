package homework;

public class Properties {
    
    String projectBuildSourceEncodingListElement;
    String mavenCompilerSourceListElement;
    String mavenCompilerTargetListElement;
    
    public Properties(){
        super();
    }
    
    public Properties(
        String projectBuildSourceEncodingListElement,
        String mavenCompilerSourceListElement,
        String mavenCompilerTargetListElement
        ){
            this.projectBuildSourceEncodingListElement = projectBuildSourceEncodingListElement;
            this.mavenCompilerSourceListElement = mavenCompilerSourceListElement;
            this.mavenCompilerTargetListElement = mavenCompilerTargetListElement;
    }
    
    @Override
    public String toString() {
        return "{"
                + "project.build.sourceEncoding='" + this.projectBuildSourceEncodingListElement + "'"
                + ", maven.compiler.source='" + this.mavenCompilerSourceListElement + "'"
                + ", maven.compiler.target='" + this.mavenCompilerTargetListElement + "'"
                + "}";
    }
    
    public String getProjectBuildSourceEncodingListElement() {
        return projectBuildSourceEncodingListElement;
    }

    public void setProjectBuildSourceEncodingListElement(String projectBuildSourceEncodingListElement) {
        this.projectBuildSourceEncodingListElement = projectBuildSourceEncodingListElement;
    }

    public String getMavenCompilerSourceListElement() {
        return mavenCompilerSourceListElement;
    }

    public void setMavenCompilerSourceListElement(String mavenCompilerSourceListElement) {
        this.mavenCompilerSourceListElement = mavenCompilerSourceListElement;
    }

    public String getMavenCompilerTargetListElement() {
        return mavenCompilerTargetListElement;
    }

    public void setMavenCompilerTargetListElement(String mavenCompilerTargetListElement) {
        this.mavenCompilerTargetListElement = mavenCompilerTargetListElement;
    }
    
    
}