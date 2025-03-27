package Patterns;

public class Simple {
    public static void main(String[] args) {
      /*   *****
           *****
           *****
           *****
    
    for(int i =1;i<=4;i++) {
        for(int j = 1;j <=5;j++) {
            System.out.print("*");
        }
        System.out.println();
    }
        */

  /* 
        1111
        2222
        3333
        4444
        
        for(int i =1;i<=4;i++) {
            for(int j=1;j<=4;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
            */

            /*
             *
             **
             ***
             ****
             ***** 
            
            for(int i=0;i<5;i++) {
                for(int j =0;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
                */
        /*
         1
         12
         123
         1234
         12345
         
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */

        /*
         12345
         1234
         123
         12
         1
         
        for(int i=5;i >= 1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
            */

            /*
             1234
             1234
             1234
             
            for(int i=1;i<=3;i++) {
                for(int j=1;j<=4;j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
                */

                /*
                 *****
                  ****
                   ***
                    **
                     *
                 

                 for(int i=5;i>=1;i--) {
                    for(int j=1;j<=5-i;j++) {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                 }
                 */

                 /*
                  *****
                  ****
                  ***
                  **
                  *

                  for(int i=5;i>=1;i--) {
                    for(int j=1;j<=i;j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                  }
                  */

    /*
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     

     for(int i=1; i<=5;i++) {
        for(int j=1;j<=i;j++) {
            System.out.print(j + " ");
        }
        System.out.println();
     }
        */

    /*
           *
          **
         ***
        ****
       ***** 

    for(int i=1;i<=5;i++) {
        for(int j=5;j>i;j--) {
            System.out.print(" ");
        }
        for(int j=1;j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
        */

        /*
               *
              * * 
             * * *
            * * * *
           * * * * * 
         

         for(int i=1;i<=5;i++) {
            for(int j=5;j>i;j--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
                if(j<i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
            */

    /*
               *
              * * 
             * * *
            * * * *
           * * * * * 
            * * * *
             * * *
              * *
               * 

    for(int i=1;i<=5;i++) {
        for(int j= 5-i;j>0; j--) {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i = 5-1; i >0;i--) {
        for(int j=5-i;j>0;j--) {
            System.out.print(" ");
        }
        for(int j=1;j<= i;j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    */

    /*
     *****
     *   *
     *   *
     *   *
     *****

     
    for(int i = 1;i<= 5;i++) {
        for(int j=1;j<=5;j++) {
            if(i==1 || i==5 || j==1|| j==5) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
        */

        /*
              *
             * *
            *   *
           *     *
          * * * * *       
          
        
        for(int i=0;i<5;i++) {
            for(int j=0;j<5-i-1;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                if(i == 5-1 || j==0 || j==i) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
            */

            
    }
}
