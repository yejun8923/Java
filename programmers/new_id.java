package programmers;

public class new_id {
    public String solution(String new_id) {
        String answer = "";

        String id = new_id.toLowerCase();
        id = id.replaceAll("[^a-z0-9-_.]","");
        id = id.replaceAll("\\.+",".");
        id = id.replaceAll("^[.]|[.]$","");
        if(id.isEmpty()) id = "a";
        if(id.length()>=16) {
            id = id.substring(0,15);
            id = id.replaceAll("[.]$","");
        }
        if(id.length()<=2) {
            char cha = id.charAt(id.length()-1);
            while (id.length() != 3){
                id+=cha;
            }
        }
        answer = id;
        return answer;
    }

    public static void main(String[] args) {
        new_id id = new new_id();

        System.out.println(id.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(id.solution("z-+.^."));
        System.out.println(id.solution("=.="));
        System.out.println(id.solution("123_.def"));
        System.out.println(id.solution("abcdefghijklmn.p"));


    }
}
