package workshop.book.test;

import workshop.book.entity.Magazine;
import workshop.book.entity.Novel;
import workshop.book.entity.Publication;
import workshop.book.entity.ReferenceBook;


public class ManageBook {

    public static void main( String[] args ) {
        ManageBook manager = new ManageBook();
        
        Publication[] publications = new Publication[5];
        publications[0] = new Magazine( "마이크로소프트", "2007-10-01", 328 , 9900, "매월" );
        publications[1] = new Magazine( "경영과 컴퓨터", "2007-10-03", 316, 9000, "매월" );
        publications[2] = new Novel( "파피용", "2007-07-01", 396, 9800, "베르나르 베르베르", "프랑스 현대소설" );
        publications[3] = new Novel( "남한산성", "2007-04-14", 383, 11000, "김훈", "대하소설" );
        publications[4] = new ReferenceBook( "실용주의 프로그래머", "2006-01-20", 496, 25000, "소프트웨어 개발" );

        System.out.println( "===== 배열 정보 출력 =====" );
        for ( int inx = 0 ; inx < publications.length ; inx++ ) {
            System.out.println( publications[inx] );
        }
        
        System.out.println( "===== 가격 정보 변경전 =====" );
        System.out.println( publications[2].getTitle() + ":" + publications[2].getPrice() );
        System.out.println( "===== 가격 정보 변경후 =====" );
        
        //modifyPrice 호출
        manager.modifyPrice( publications[2] );
        //new ManageBook().modifyPrice(publications[2]);

		System.out.println( publications[2].getTitle() + ":" + publications[2].getPrice() );
		
		for (Publication publication : publications) {
			manager.printSubInfo(publication);
		}
    }
    
    /*
     * SubClass 들이 단독으로 가지고 있는 정보를 출력하는 메서드
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
     
        //instanceof 타입비교 연산자
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
