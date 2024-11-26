import java.util.Scanner;

public class CobaSwitch {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        int mark;

        mark = nilai.nextInt();
        switch (mark){
            //For marks 85-100, Grade is HD
            case ((100>=mark>=85)):
                grade="HD";
                break;
            case (mark>=75 && mark<=84):
                grade="D";
                break;
            case (mark>=65 && mark<=74):
                grade="C";
                break;
            case (mark>=50 && mark<=64):
                grade="P";
                break;
            case (mark<=49 && mark>=0):
                grade="F";
                break;

                default:

        }    
    }
}
