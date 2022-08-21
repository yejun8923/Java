package map;

public class Member {
    private  int memberId;
    private String name;

    public Member(int memberId, String name){
        this.memberId = memberId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString(){
        return name + "회원님의 아이디는"+memberId+"입니다";
    }
}
