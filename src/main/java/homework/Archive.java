package homework;

public class Archive {
    
    Manifest manifest;
    
    public Archive(){
        super();
    }

    public Archive(
        Manifest manifest
        ){
            this.manifest = manifest;
    }
    
    @Override
    public String toString() {
        return "{"
                + "manifest=" + this.manifest + ""
                + "}";
    }

    public Manifest getManifest() {
        return manifest;
    }

    public void setManifest(Manifest manifest) {
        this.manifest = manifest;
    }

    
}