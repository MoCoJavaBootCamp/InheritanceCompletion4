public final class Software extends Product {
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    @Override
    public String toString(){
        return "Software written by " + programmer;
    }

    //compares count with hashCode
    @Override
    public boolean equals(Object obj) {
        return this.count == obj.hashCode();
    }

    @Override
    public String myAbstractMethod() {
        return "This is the abstract method for Software.";
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

}