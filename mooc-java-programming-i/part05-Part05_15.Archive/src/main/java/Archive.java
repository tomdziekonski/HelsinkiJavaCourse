public class Archive {

    private String identifier;
    private String name;

    public Archive(String ident, String name) {
        this.identifier = ident;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getIdent() {
        return this.identifier;
    }

    public String toString() {
        return this.identifier + ":" + " " + this.name;
    }
    
    public boolean equals(Object compared) {
    final Archive other = (Archive) compared;
        if (!this.identifier.equals(other.identifier) ){
            return false;
        }
       
        return true;
    }

   
    
    
    

}
