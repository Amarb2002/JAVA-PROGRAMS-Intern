public class Book 
{
  private String title;
  private String author;
  private double price;

  public Book(String title, String author, double price) 
{
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public void printInfo() 
{
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: $" + price);
  }

  public static void main(String[] args) 
{
    Book book1 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 12.99);
    Book book2 = new Book("Pride and Prejudice", "Jane Austen", 10.00);
    System.out.println("Book 1:");
    book1.printInfo();
    System.out.println("Book 2:");
    book2.printInfo();
  }
}
