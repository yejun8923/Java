package Bank;

public class SuperExam {
    /*
    자식 클래스 에서 super 키워드 를 사 용하는 경우
    1. 자식 클래스 가 부모 클래스 변수,메소드 를 사용할 때
    2. 자식 클래스 가 부모 클래스 의 생성자 를 사용할 때
     */


    /*
    2번
    자식 클래스의 인스턴스가 생성되기 위해서는 부모클래스와 자식클래스의 초기 설정을 모두 해주어야 함
    부모 클래스의 생성자는 super 키워드를 사용해서 부를 수 있음

    1. 자식 클래스의 인스턴스 생성시 부모 클래스의 생성자는 반드시 불러진다.
    2. 부모 클래스의 기본 생서자가 없는 경우 즉 파라미터가 없는 생성자가 없는 경우 자식 클래스에서
    반드시 직접 부모클래스의 생성자 호출을 시켜줘야함
    3. 부모 클래스의 생성자를 호출할 때는 자식 클래스의 생성자 맨 윗줄에 적어야 함.
    */
}