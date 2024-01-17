package AnotherProject;
public class StarPattern {

    public void invertedStar(){
        for(int i=1;i<=4;i++){
            for (int j = 1; j <= (4-i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void halfPyramid(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void starPattern(){
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void charPattern(){
        char ch = 'A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StarPattern p = new StarPattern();
        p.charPattern();
    }
}
