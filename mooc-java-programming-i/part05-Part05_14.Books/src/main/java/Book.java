import java.util.Objects;

 public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.publicationYear;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
      //  if (this == obj) {
        //    return true;
       // }
       // if (obj == null) {
       //     return false;
      //  }
      //  if (getClass() != obj.getClass()) {
     //       return false;
     //   }
        final Book other = (Book) obj;
        if (this.publicationYear != other.publicationYear) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}
