public class Plane {
    private String ID;
    private String model;
    private int yearOfIntroduction;
    
    public Plane(String id, String model, int year){
        this.ID = id;
        this.model = model;
        this.yearOfIntroduction = year;
    }
    
    public String toString(){
    return ID + ", " + model + ", " + yearOfIntroduction;
    }
}
