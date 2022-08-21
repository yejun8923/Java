package market;

public class Person {
    private final String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //this.name = name;
    }

    public static void main(String[] args){
        Person p1 = new Person("홍길동");

        System.out.println(p1.getName());
        p1.setName("장발장");
        System.out.println(p1.getName());

        int[] number_list = new int[7];
        System.out.println(number_list.length);
    }
}
