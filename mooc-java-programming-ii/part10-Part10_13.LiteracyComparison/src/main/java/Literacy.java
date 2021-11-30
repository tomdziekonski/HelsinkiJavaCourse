public class Literacy implements Comparable <Literacy> {

    private String theme;
    private String population;
    private String sex;
    private String country;
    private int year;
    private double rate;

    public Literacy(String theme, String population, String sex, String country, int year, double rate) {
        this.theme = theme;
        this.population = population;
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.rate = rate;
    }

    public String getTheme() {
        return this.theme;
    }

    public String population() {
        return this.population;
    }

    public String getSex() {
        return this.sex;
    }

    public String getCountry() {
        return this.country;
    }

    public int getYear() {
        return this.year;
    }

    public double getRate() {
        return this.rate;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.rate;
    }
    
    @Override
    public int compareTo(Literacy lit) {
        if (this.rate == lit.getRate()) {
            return 0;
        } else if (this.rate > lit.getRate()) {
            return 1;
        } else {
            return -1;
        }
    } 
}
