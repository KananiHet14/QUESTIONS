import java.util.*;

public class AllPatterns {
        public static void main(String[] args) {

            // solid rectangle
            // int n=4;
            // int m=5;

            // for(int i=0; i<=n; i++) {
            //     for(int j=0; j<=m; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            
            
            // hollow rectangle
            // int n=4;
            // int m=5;

            // for(int i=0; i<=n; i++) {
            //     for(int j=0; j<=m; j++) {
            //         if(i==0 || j==0 || i==n-1 || j==m) {
            //             System.out.print("*");
            //         } else {
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }


            // half pyramid
            // int n=4;

            // for(int i=0; i<=n; i++) {
            //     for(int j=0; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }


            // inverted half pyramid
            // int n=4;

            // for(int i=n; i>=0; i--) {
            //     for(int j=0; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }



            // inverted half pyramid rotated by 180 degree
            // int n=4;

            // for(int i=1; i<=n; i++) {
            //     for(int j=1; j<=n-i; j++) {
            //         System.out.print(" ");
            //     }

            //     for(int j=1; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }



            // number half pyramid
            // int n=5;

            // for(int i=0; i<=n; i++) {
            //     for(int j=1; j<=i; j++) {
            //         System.out.print(j + " ");
            //     }
            //     System.out.println();
            // }

            
            
            // inverted number half pyramid 
            // int n=5;

            // for(int i=n; i>=0; i--) {
            //     for(int j=1; j<=i; j++) {
            //         System.out.print(j + " ");
            //     }
            //     System.out.println();
            // }


            // Floyd's triangle
            // int n = 5;
            // int number = 1;

            // for(int i=0; i<=n; i++) {
            //     for(int j=1; j<=i; j++) {
            //         System.out.print(number + " ");
            //         number++;
            //     }
            //     System.out.println();
            // }

            
            
            // 0 - 1 pyramid
            // int n = 5;

            // for(int i=1; i<=n; i++) {
            //     for(int j=1; j<=i; j++) {
            //         if((i+j) % 2 == 0) {
            //             System.out.print("1" + " ");
            //         } else {
            //             System.out.print("0" + " ");
            //         }
            //     }
            //     System.out.println();
            // }


            
            // butter fly pattern
            // int n=5;

            // for(int i=0; i<=n; i++) {
            //     // first half
            //     for(int j=0; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     // spaces
            //     for(int j=1; j<=2*(n-i); j++) {
            //         System.out.print(" ");
            //     }
            //     // secpond half
            //     for(int j=0; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for(int i=n; i>=0; i--) {
            //     // first halff
            //     for(int j=0; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     // spaces
            //     for(int j=1; j<=2*(n-i); j++) {
            //         System.out.print(" ");
            //     }
            //     // second half
            //     for(int j=0; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }



            // hollow butter fly
            // int n=5;

            // for(int i=0; i<=n; i++) {
            //     // first half
            //     for(int j=1; j<=i; j++) {
            //         if(j==1 || j==i) {
            //             System.out.print("*");
            //         } else {
            //             System.out.print(" ");
            //         }
            //     }
            //     // spaces
            //     for(int j=1; j<=2*(n-i); j++) {
            //         System.out.print(" ");
            //     }
            //     // secpond half
            //     for(int j=1; j<=i; j++) {
            //         if(j==1 || j==i) {
            //             System.out.print("*");
            //         } else {
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }
            // for(int i=n; i>=0; i--) {
            //     // first halff
            //     for(int j=1; j<=i; j++) {
            //         if(j==1 || j==i) {
            //             System.out.print("*");
            //         } else {
            //             System.out.print(" ");
            //         }
            //     }
            //     // spaces
            //     for(int j=1; j<=2*(n-i); j++) {
            //         System.out.print(" ");
            //     }
            //     // second half
            //     for(int j=1; j<=i; j++) {
            //         if(j==1 || j==i) {
            //             System.out.print("*");
            //         } else {
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }

            
            
            // number pyramid
            // int n=5;

            // for(int i=1; i<=n; i++) {
            //     // spaces
            //     for(int j=1; j<=n-i; j++) {
            //         System.out.print(" ");
            //     }

            //     for(int j=1; j<=i; j++) {
            //         System.out.print(j + " ");
            //     }
            //     System.out.println();
            // }


            // pyldromic pyramid
            // int n=5;

            // for(int i=1; i<=n; i++) {
            //     // spaces
            //     for(int j=1; j<=n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     // first part
            //     for(int j=i; j>=1; j--) {
            //         System.out.print(j);
            //     }
            //     // second part
            //     for(int j=2; j<=i; j++) {
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            
            
            // // solid rhombus
            // int n=5;
            // for(int i=1; i<=n; i++) {
            //     // spaces
            //     for(int j=1; j<=n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     // stars
            //     for(int j=1; j<=5; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            // hollow rhombus
            // int n=5;
            // for(int i=1; i<=n; i++) {
            //     // spaces
            //     for(int j=1; j<=n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     // stars
            //     for(int j=1; j<=5; j++) {
            //        if(i==1 || j==1 || i==n || j==n) {
            //          System.out.print("*");
            //        } else {
            //          System.out.print(" ");
            //        }
            //     }
            //     System.out.println();
            // }


            // daimond pattern
            // int n=5;

            // for(int i=1; i<=n; i++) {
            //     // spaces
            //     for(int j=1; j<=n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     // first part
            //     for(int j=i; j>=1; j--) {
            //         System.out.print("*");
            //     }
            //     // second part
            //     for(int j=2; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for(int i=n; i>=1; i--) {
            //     // spaces
            //     for(int j=1; j<=n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     // inverted first part
            //     for(int j=i; j>=1; j--) {
            //         System.out.print("*");
            //     }
            //     // inverted second part
            //     for(int j=2; j<=i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

        }
}
