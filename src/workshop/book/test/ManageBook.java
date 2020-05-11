package workshop.book.test;

import workshop.book.entity.Magazine;
import workshop.book.entity.Novel;
import workshop.book.entity.Publication;
import workshop.book.entity.ReferenceBook;


public class ManageBook {

    public static void main( String[] args ) {
        ManageBook manager = new ManageBook();
        
        Publication[] publications = new Publication[5];
        publications[0] = new Magazine( "����ũ�μ���Ʈ", "2007-10-01", 328 , 9900, "�ſ�" );
        publications[1] = new Magazine( "�濵�� ��ǻ��", "2007-10-03", 316, 9000, "�ſ�" );
        publications[2] = new Novel( "���ǿ�", "2007-07-01", 396, 9800, "�������� ��������", "������ ����Ҽ�" );
        publications[3] = new Novel( "���ѻ꼺", "2007-04-14", 383, 11000, "����", "���ϼҼ�" );
        publications[4] = new ReferenceBook( "�ǿ����� ���α׷���", "2006-01-20", 496, 25000, "����Ʈ���� ����" );

        System.out.println( "===== �迭 ���� ��� =====" );
        for ( int inx = 0 ; inx < publications.length ; inx++ ) {
            System.out.println( publications[inx] );
        }
        
        System.out.println( "===== ���� ���� ������ =====" );
        System.out.println( publications[2].getTitle() + ":" + publications[2].getPrice() );
        System.out.println( "===== ���� ���� ������ =====" );
        
        //modifyPrice ȣ��
        manager.modifyPrice( publications[2] );
        //new ManageBook().modifyPrice(publications[2]);

		System.out.println( publications[2].getTitle() + ":" + publications[2].getPrice() );
		
		for (Publication publication : publications) {
			manager.printSubInfo(publication);
		}
    }
    
    /*
     * SubClass ���� �ܵ����� ������ �ִ� ������ ����ϴ� �޼���
     */
    public void printSubInfo(Publication pub) {
    	if(pub instanceof Magazine) {
    		Magazine mag = (Magazine)pub;
    		System.out.println(mag.getPublishingPeriod());
    	}else if(pub instanceof Novel){
    		Novel nov = (Novel)pub;
    		System.out.println(nov.getAuthor()+ "  " + nov.getGenre());
    	}else if(pub instanceof ReferenceBook){
    		ReferenceBook rBook = (ReferenceBook)pub;
    		System.out.println(rBook.getField());
    	}
    }
    
    
    public void modifyPrice( Publication pub ) {
        int price = pub.getPrice();
        double rate = 0.0;
     
        //instanceof Ÿ�Ժ� ������
        if ( pub instanceof Magazine ) {
        	rate = 0.4;
        } else if ( pub instanceof Novel ) {
        	rate = 0.2;
        } else if ( pub instanceof ReferenceBook ) {
        	rate = 0.1;
        } 
        
        pub.setPrice( price - (int)(price*rate) );

    }
    


}
