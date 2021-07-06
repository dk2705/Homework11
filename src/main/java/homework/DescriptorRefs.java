package homework;

public class DescriptorRefs {

    String descriptorRef;
    
    public DescriptorRefs(){
        super();
    }

    public DescriptorRefs (String descriptorRef){
        this.descriptorRef = descriptorRef;
    }

    @Override
    public String toString() {
        return "{"
                + "descriptorRef='" + this.descriptorRef + "'"
                + "}";
    }

    public String getDescriptorRef() {
        return descriptorRef;
    }

    public void setDescriptorRef(String descriptorRef) {
        this.descriptorRef = descriptorRef;
    }
    
    
    
}
