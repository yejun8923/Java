package Array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){

        ArrayList<String> strs = new ArrayList<>();
        /*
            ArrayList<E> 배열 이름 = new ArrayList<>();
            배열을 선언하는 부분의 <>안에 사용할 객체의 자료형(E)을 쓰면된다.

         */

        ArrayList<Book> Library = new ArrayList<>();

        Library.add(new Book("태백산맥","조정래"));
        Library.add(new Book("데미안","헤르만 헤세"));
        Library.add(new Book("토지","박경리"));
        Library.add(new Book("어린왕자","생택쥐페리"));

        for(int i=0; i<Library.size(); i++){
            Book book = Library.get(i);
            book.showBookInfo();
        }

        for(Book book: Library){
            book.showBookInfo();
        }

    }
}
