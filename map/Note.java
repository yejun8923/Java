package map;

import java.util.HashMap;

public class Note {
    /*
    HASHMAP
    'value(원소)'와 그 원소를 가르키는 'key' 값을 같이 저장한다.
    순서만 있는 ArrayList와 달리 key와 value가 쌍으로 저장된다.

    key값은 String을 쓰는 것이 일반적이다, 직관적이기도 하고, 구조상 String이 적합 하기도함
     */

    public static void main(String[] args) {


        HashMap<String, Pokemon> pokedex = new HashMap<String, Pokemon>();

        pokedex.put("피카츄",new Pokemon("피카츄"));
        pokedex.put("라이츄",new Pokemon("라이츄"));


    }




}
