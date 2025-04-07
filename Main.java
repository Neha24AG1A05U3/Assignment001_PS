public class Main {
    public static void main(String[] args) {
          for(int i=1;i<=4;i++){
              for(int j=0;j<4-i;j++){
                  System.out.print(" ");
              }
              for(int m=0;m<i;m++){
                  System.out.print("*");
              }
              System.out.println();
          }
          }
}