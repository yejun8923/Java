package Student;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectlist;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
        subjectlist = new ArrayList<>();
    }


    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subjectlist.add(subject);
    }

    public void showStudentInfo(){
        int total =0;
        for(Subject s : subjectlist){
            total += s.getScore();
            System.out.println("학생" + studentName+"의 " + s.getName()+"과목 성적은 "+s.getScore()+"입니다");
        }
        System.out.println("학생" + studentName+"의 총점은" + total + "입니다");
    }

}
