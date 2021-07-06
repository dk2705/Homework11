package homework;

public class Configuration {
    
    DescriptorRefs descriptorRefs;
    Archive archive;
    
    public Configuration(){
        super();
    }

    public Configuration(
        DescriptorRefs descriptorRefs,
        Archive archive    
        ){
            this.descriptorRefs = descriptorRefs;
            this.archive = archive;
    }
    
    @Override
    public String toString() {
        return "{"
                + "descriptorRefs=" + this.descriptorRefs + ""
                + ", archive=" + this.archive + ""
                + "}";
    }

    public DescriptorRefs getDescriptorRefs() {
        return descriptorRefs;
    }

    public void setDescriptorRefs(DescriptorRefs descriptorRefs) {
        this.descriptorRefs = descriptorRefs;
    }

    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    
}