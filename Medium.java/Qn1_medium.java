//Create a Book class with attributes: title, author, ISBN. In the main() method, create 5 different Book objects manually and display their details using a method showDetails().


class Book{  
    String title;
    int ISBN;
    String author;

   Book(String title, int ISBN, String author) { 
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
     void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: "+author);
         System.out.println("\n");
    }
}
    public class Qn1_medium { 
        public static void main(String[] args) {
            Book b1=new Book("Rich Dad Poor Dad", 40 ,"Robert Kiyosaki");
            Book b2=new Book("Attitude is Everything", 50 ,"Kevin Smith");
            Book b3=new Book("Art of War", 90 ,"Adam Smith");
            Book b4=new Book("Intelligence in vein", 30 ,"Robert benx");
            Book b5=new Book("The Prince who never Become King", 82 ,"Neymar Jr");
            b1.printInfo();
            b2.printInfo();
            b3.printInfo();
            b4.printInfo();
            b5.printInfo();
        }
    }
