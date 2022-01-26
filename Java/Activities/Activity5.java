//Abstract class Book
abstract class Book {
    String title;
    //Abstract method setTitle
    abstract void setTitle(String s);

    //Concrete method getTitle
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    //Define abstract method
    public void setTitle(String s) {
        title = s;
    }
}

public class Activity5 {

    public static void main(String []args) {
        //Initialize title of the book
        String title = "NEW CAR RACER";
        //Create object for MyBook
        Book newNovel = new MyBook();
        //Set title "NEW CAR RACER"
        newNovel.setTitle(title);
        //Print result
        System.out.println("The title is: " + newNovel.getTitle());
    }
}