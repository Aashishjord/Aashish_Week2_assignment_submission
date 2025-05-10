class Book {
    String title;
    String author;
    
    Book(String title,String author){
       this.title=title;
       this.author=author;
    }
    void showBook(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
       
    }
    public class Qn7_simple {
        public static void main(String[] args) {
            Book book1=new Book("Title:Rich Dad Poor Dad", "Author; Robert kiyoskai");
            book1.showBook();
            
        }
    }
    
   }