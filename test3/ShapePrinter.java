package test3;

public class ShapePrinter {

    public void prinTriangle(int height){
        /*for(int i=0; i<height; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/
        /*
        String star="*";

        for(int i=0; i<height; i++){
            System.out.println(star);
            star +=" *";
        }*/
       /* int x = 1;
        for(int i=0; i<height; i++){
            for(int j=0; j<i+1; j++){
                if(x <= 9)
                System.out.print("  "+x+" ");
                else if(x <= 99){
                    System.out.print(" "+x+" ");
                } else {
                    System.out.print(x+" ");
                }
                ++x;
            }
            System.out.println("");
        }*/

        int bnum = height*(height+1) / 2;
        int len = String.valueOf(bnum).length();
        int num =1;
        for(int i=0; i<height; i++){
            for(int j=0; j<i+1; j++){
                System.out.printf("%"+len+"d ",num);
                num++;
            }
            System.out.println();
        }
    }
}
