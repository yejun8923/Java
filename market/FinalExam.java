package market;

public class FinalExam {

        // final variable
        // 한 번 정한 값 변경 불가
        //선언과 동시에 초기화 또는 생성자 에서 값을 넣어 주어야 함.

        //case1 초기화 필요
        //public final int finalVar1;

        //case2 초기화 진행 오류 발생 x
        public final int finalVar2 = 10;

        //case3 생성자 에서 초기화 오류 발생 x
        public final int FinalVar3;

        //case4 생성자가 아닌곳(일반 메소드)에서 초기화 오류 발생
        // public final int finalVar4;

        // static variable


        public FinalExam() {
        this.FinalVar3 = 0;
        }

        // private void setVar4(){
        //     finalVar4 = 10;
        // }


}
