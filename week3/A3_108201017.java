import java.util.Vector;
class Book{
    private String Name;
    private String ISBN;
    private Vector<String> Content;
    public Book(String NAME , String iSBN , Vector<String> CONTENT) {
        this.Name = NAME;
        this.ISBN = iSBN;
        this.Content = CONTENT;
    }
    //methods
    public String getName(){
        return Name;
    }
    public String getISBN(){
        return ISBN;
    }
    public String getContent(int PAGE){
        if(PAGE >= Content.size()){
            return "Error";
        }
        else{
            return Content.elementAt(PAGE);
        }
    }
    void addPage(String SENTENCE){
        Content.add(SENTENCE);
    }
}
class BookShelf{
    private Vector<Book> Shelf;
    public BookShelf(){
        
    }
    void addBook( Book MYBook ){
        Shelf.addElement(MYBook);
    }
    void showBookShelf(){
        int i = 0;
        while( i <= Shelf.size() ){
            System.out.println("\n");
            i++;
        }
    }
}
public class A3_108201017  {
    //Book1 information
    static private String N1="book1";
    static private String iSBN1="978-3-14-131238-2";
    static Vector<String> CONTENT1= new Vector<>();
    //Book2 information
    static private String N2="book2";
    static private String iSBN2="278-33-4-133238-0";
    static Vector<String> CONTENT2= new Vector<>();
    public static void main(String[] args)
    {
        CONTENT1.add("book1p1");
        CONTENT1.add("book1p2");
        CONTENT1.add("book1p3");

        CONTENT2.add("book2p1");
        CONTENT2.add("book2p2");

        Book myBook1 = new Book(N1,iSBN1,CONTENT1);
        Book myBook2 = new Book(N2,iSBN2,CONTENT2);

        //Testing
        System.out.println(myBook1.getName()+" "+myBook1.getISBN());
        System.out.println(myBook2.getName()+" "+myBook2.getISBN());
        System.out.println(myBook1.getContent(0)+" "+myBook1.getContent(3));
        myBook1.addPage("book1p4");
        System.out.println(myBook1.getContent(0)+" "+myBook1.getContent(3));

        BookShelf myBookShelf = new BookShelf();
        myBookShelf.addBook(myBook1);
        myBookShelf.addBook(myBook1);
        myBookShelf.addBook(myBook2);
        myBookShelf.showBookShelf();
    } 
}
 