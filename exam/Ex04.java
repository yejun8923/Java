package exam;

public class Ex04 {
    public static void main(String[] agrs) {
        int[] a = new int[2];
        System.out.println(a[0]);   // 1번

        Person[] people = new Person[2];
        System.out.println(people[0]);   // 2번

        Person person = new Person();
        people[0] = person;
        person.setAge(a[0]);
        a[0] = 26;
        System.out.println(person.getAge());   // 3번

        a[0]++;
        people[1] = people[0];
        people[1].setAge(a[0]);
        a[0] = 28;
        System.out.println(people[0].getAge());   // 4번
    }
}

