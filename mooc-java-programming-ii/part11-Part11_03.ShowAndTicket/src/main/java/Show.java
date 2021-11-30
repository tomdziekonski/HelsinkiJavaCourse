public class Show {

    private String movie;
    private String time;

    public Show(String title, String time){
        this.movie = title;
        this.time = time;
    }
    
    public String toString(){
        return this.movie + ", filmed in " + this.time;
    }
}
