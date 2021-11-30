public class Book {
    private String name;
    private String author;
    private int pageCount;
    
    public Book(String name, String author, int page){
    this.author = author;
    this.name = name;
    this.pageCount = page;
    }
    
    public String toString(){
    return author + ", " + name + ", " + pageCount;
    }
}
