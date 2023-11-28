package arrayList.listEx;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<Book> lst=new ArrayList<Book>();
        Book b1=new Book(1,"java","Arif",200);
        Book b2=new Book(2,"java","Arif",200);
        Book b3=new Book(3,"java","Arif",200);
        Book b4=new Book(4,"java","Arif",200);
        Book b5=new Book(5,"java","Arif",200);

        lst.add(b1);
        lst.add(b2);
        lst.add(b3);
        lst.add(b4);
        lst.add(b5);
        for (Book details:lst){
            System.out.println("book information is:" +
                    " "+details.id +" name : "+details.name+ " author: "+details.author+" price: "+details.price);
        }

    }
}
