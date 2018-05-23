package acmepublishing;
public class EBook implements Print, Comparable{

    @Override
    public void printBook() {
        System.out.println("This class creates an ebook\nThe logic to create "
                + "an ebook goes in this class");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    
}
