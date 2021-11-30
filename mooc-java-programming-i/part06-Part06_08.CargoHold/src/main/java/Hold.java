import java.util.ArrayList;

public class Hold {
private int maximum;
private int sum = 0;
private ArrayList <Suitcase> list = new ArrayList<>();

public Hold(int max) {
this.maximum = max;
}

public void addSuitcase(Suitcase suitcase) {
this.sum = this.sum + suitcase.totalWeight();
if(this.sum <= this.maximum) {
list.add(suitcase); }
}

public String toString() {
int size = list.size();
int weight = 0;
for (Suitcase a: list) {
weight = weight + a.totalWeight();
}
    return Integer.toString(size) + " suitcases (" + weight + "kg)";
}

public void printItems() {
for (Suitcase a: list) {
a.printItems();
}
}


}
