package acmepublishing;
public class HardCopy implements Print, Comparable{
  
    

    @Override
    public void printBook() {
        System.out.println("This class prints a hardcopy book\nThe logic"
                + "to create a print book goes here");
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    
}
