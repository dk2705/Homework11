package homework;

public class Project {
    
    String modelVersion;
    String groupId;
    String artifactId;
    String version;
    String packaging;
    Properties properties;
    Build build;
    
    String xmlns;
    String xmlnsXsi;
    String xsiSchemaLocation;
    
    public Project(){
        super();
    }

    public Project(
        String modelVersion,
        String groupId,
        String artifactId,
        String version,
        String packaging,
        Properties properties,
        Build build
        ){
            this.modelVersion = modelVersion;
            this.groupId = groupId;
            this.artifactId = artifactId;
            this.version = version;
            this.packaging = packaging;
            this.properties = properties;
            this.build = build;
    }
    
    private String projectAttributesToString(){
        return "xmlns=\"" + this.xmlns
                + "\" xmlns:Xsi=\"" + this.xmlnsXsi
                + "\" xsi:SchemaLocation=\"" + this.xsiSchemaLocation + "\"";
    }
    
    @Override
    public String toString() {
        return "project"
                + " " + projectAttributesToString()
                + "\n{"
                + "modelVersion='" + this.modelVersion + "'"
                + ", groupId='" + this.groupId + "'"
                + ", artifactId='" + this.artifactId + "'"
                + ", version='" + this.version + "'"
                + ", packaging='" + this.packaging + "'"
                + ", properties=" + this.properties + ""
                + ", build=" + this.build + ""
                + "}";
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    public String getXsiSchemaLocation() {
        return xsiSchemaLocation;
    }

    public void setXsiSchemaLocation(String xsiSchemaLocation) {
        this.xsiSchemaLocation = xsiSchemaLocation;
    }

    
}