package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex01 {

    /*
    Map
    - Map 인터페이스는 자료를 쌍으로 관리하는데 필요한 메소드가 정의되어 있다.
    - key-value 쌍으로 이루어진 객체,key값은 유일하며, value는 중복될 수 있다.


    HashMap 클래스
    - Map 인터페이스를 구현한 클래스 중 가장 많이 사용되는 클래스이다.
    - 해시 방식으로 자료를 관리한다.
    - 자료 추가 속도나 검색 속도가 상당히 빠르다는 장점이 있다.
    - Map 인터페이스에서 사용하는 key값은 중복될 수 없으므로 equals() 메소드와 hashcode() 메소드를 재정의하여 사용해야 한다.
     */

    HashMap<Integer, String> map1 = new HashMap<Integer, String>();
    HashMap<String, String> map2 = new HashMap<>();
    HashMap<String, String> map3 = new HashMap<>(map2); // map2의 모든 값을 가진 HashMap을 생성.
    HashMap<String, String> map4 = new HashMap<>(10); // 초기 용량을  지정 , 크기를 알고 있다면 미리 용량을 지정하는게 과부하 안걸릴확률이높다
    HashMap<String, String> map5 = new HashMap<>(){{ // 초기값 지정
      put("a","b");
    }};

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"사과");
        map.put(2,"바나나");
        map.put(3,"포도");
        map.put(4,"포도");

        System.out.println(map);
        System.out.println(map.get(2));

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("key : "+entry.getKey()+" value :"+entry.getValue());
        }
        map.remove(4);
        for(Integer i : map.keySet()){
            System.out.println("key : "+i+" value :"+map.get(i));
        }
        map.clear();
        System.out.println(map);

        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()){
            int key = keys.next();
            System.out.println("key : "+key+" value :"+map.get(key));
        }
    }
}
