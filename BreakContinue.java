public class BreakContinue {
    public static void main(String[] args) {
  //continue statement      
int i;
for (i=1; i<=20; i++) {

   if (i%3==0) {
       continue;
   }
   System.out.println(i);

   //break statement
   int j;
for (j=1; j<=20; j++) {

   if (j == 11) {
       break;
   }
   System.out.println(j);
}

}

    }
}
