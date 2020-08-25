
public class MainBook {

	public static void main(String[] args) {
		BookStore store=new BookStore();
		Book[] books=store.create();
		for(Book var:books)
		{
			var.display();
		}
		
		Book book=store.find(11111);
		 if(book!=null)
		 {
			 System.out.println("Book found");
			 book.display();
			 
		 }
		 else
		 System.out.println("Book not found");
       book =store.update(44444, 3566);
       if(book!=null)
       {
    	   System.out.println("price updated");
    	   book.display();
       }
       else
    	   System.out.println("book not found");
       

	}

}
