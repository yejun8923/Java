package map;

public class Word {
    public static void main(String[] args) {

        WordDictionary dic = new WordDictionary();
        dic.addWord("Movie","영화");
        dic.addWord("cat","고양이");
        dic.addWord("dog","강아지");
        dic.addWord("book","책");

        System.out.println(dic.find("Movie"));
    }
}
