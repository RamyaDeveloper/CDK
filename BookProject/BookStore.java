
public class BookStore {
	Book[] b=new Book[2];
	public Book[] create()
	{
		Book[] books=new Book[5];
		books[0]=new Book(11111,"Java",500,"SRS","RAVISHSTRI");
		books[1]=new Book(22222,"Python",600,"MRM","MATHEW");
		books[2]=new Book(33333,"Swing",800,"VRS","SANJAY");
		books[3]=new Book(44444,"Spring",900,"CPB","TEJASWINI");
		books[4]=new Book(55555,"CN",1100,"MSRM","MATHEWSSSW");
		return books;
	}

	Book find(long isbn)
	{
		Book book=null;
		for (Book obj : create()) {
			if (obj.getIsbn() == isbn) {
				book = obj;
				break;
			}
		}
		return book;
	}			
	Book update(long id,double price)
	{
		Book book=find(id);
		if(book!=null)
			book.setPrice(price);	
		
	return book;}
}
