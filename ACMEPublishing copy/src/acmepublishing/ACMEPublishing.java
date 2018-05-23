package acmepublishing;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ACMEPublishing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean moreAuthors = true;
        boolean moreBooks = true;
        String response;
        ArrayList<Author> authors = new ArrayList<Author>();
        ArrayList<Book> books = new ArrayList<Book>();
        while (moreAuthors) {
            System.out.println("Enter author first name, last name, "
                    + "address, email, and phone number");
            String authorData = in.nextLine();
            String[] authorInfo = authorData.split(",");
            Author a = new Author(authorInfo[0], authorInfo[1], authorInfo[2],
                    authorInfo[3], authorInfo[4]);
            authors.add(a);
            while (moreBooks) {
                System.out.println("Enter book information: Book Title, "
                        + "Book Type (h-hardcopy, e-ebook) "
                        + "and number of pages");
                String bookData = in.nextLine();
                String[] bookInfo = bookData.split(",");
                String bookType = bookInfo[1].replaceAll(" ", "");
                int numPages = Integer.parseInt(bookInfo[2].replaceAll(" ", ""));
                Book b = new Book(a.getID(), bookInfo[0],
                        bookType.charAt(0), numPages);
                books.add(b);
                System.out.println("Does this author have any more books? ");
                response = in.next();
                 in.nextLine();
                if (response.charAt(0) != 'Y' && response.charAt(0) != 'y') {
                    moreBooks = false;
                }
            }
            System.out.println("Is there another author? ");
            response = in.next();
            in.nextLine();
            if (response.charAt(0) != 'Y' && response.charAt(0) != 'y') {
                moreAuthors = false;
            }
            else
                moreBooks = true; //reset for next author
        }
        StringBuilder printInfo = new StringBuilder();
        for(Author a:authors) {
            printInfo.append(a.toString());
            for(Book b:books) {
                if(b.getAuthorID()==a.getID())
                    printInfo.append(b.toString());
            }
        }
        System.out.println(printInfo);
        

    }

}
