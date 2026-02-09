import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        int age = 30;
        int phy = 40;
        int chem = 50;
        int bio = 20;

      int[] marks = new int[3];
      marks[0]= 76;
      marks[1]= 65;
      marks[2]= 54;

     System.out.println(age);
     System.out.println(phy);
     System.out.println(chem);
     System.out.println(bio);


      
    //   System.out.println(marks[0]);
    //Sort
    System.out.println(marks[0]);
    Arrays.sort(marks);
    System.out.println(marks[0]);
    }
}
