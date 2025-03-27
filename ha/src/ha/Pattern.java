package ha;
import java.util.Scanner;
//*****
//
//public class Pattern {
//	public static void main(String[] args) {
//		for(int i=0;i<=5;i++) {
//			System.out.print("*"+" ");
//
//		}
//	}
//}
//____________________________________________________________________
// *
// *
// *
// *
// *
//public class Pattern {
//	public static void main(String[] args) {
//		for(int i=0;i<=5;i++) {
//			System.out.println("*"+" ");
//		}
//	}
//}
//__________________________________________________________________
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//
//public class Pattern {
//	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//			System.out.print("*"+" ");
//		}
//		System.out.println("");
//	}
//		}
//}
//___________________________________________________________________
//1 1 1 1 1
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4
//5 5 5 5 5
//
//
//public class Pattern {
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//			System.out.print(i + " ");
//		}
//		System.out.println(" ");
//	}
//		}
//}
//____________________________________________________________________
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5 
//1 2 3 4 5
//
//public class Pattern {
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//			System.out.print(j + " ");
//		}
//			System.out.println();
//	}
//  }
//}
//________________________________________________________________
// *
// * *
// * * * 
// * * * * 
// * * * * *
//public class Pattern {
//public static void main(String[] args) {
//	for(int i=0;i<=5;i++) {
//		for(int j=0;j<=i;j++) {
//		System.out.print("* ");
//	}
//		System.out.println();
//}
//}
//}
//_________________________________________________________________
//
//1 
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
//public class Pattern {
//public static void main(String[] args) {
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=i;j++) {
//		System.out.print(i + " ");
//	}
//		System.out.println();
//}
//}
//}
//________________________________________________________________________________
//5 5 5 5 5 
//4 4 4 4 4
//3 3 3 3 3
//2 2 2 2 2
//1 1 1 1 1
//
//public class Pattern {
//public static void main(String[] args) {
//	for(int i=5;i>=1;i--) {
//		for(int j=1;j<=5;j++) {
//		System.out.print(i + " ");
//	}
//		System.out.println();
//}
//}
//}
//_____________________________________________________________________
//5 4 3 2 1
//5 4 3 2 1
//5 4 3 2 1 
//5 4 3 2 1
//5 4 3 2 1
//public class Pattern {
//public static void main(String[] args) {
//	for(int i=5;i>=1;i--) {
//		for(int j=5;j>=1;j--) {
//		System.out.print(j + " ");
//	}
//		System.out.println();
//}
//}
//}
//___________________________________________________________________________________________________________________________________________________
//5 5 5 5 5 
//4 4 4 4
//3 3 3 
//2 2 
//1
//
//public class Pattern {
//public static void main(String[] args) {
//	for(int i=5;i>=1;i--) {
//		for(int j=1;j<=i;j++) {
//		System.out.print(i + " ");
//	}
//		System.out.println();
//}
//}
//}
//_________________________________________________________________________________
//0 1 0 1 0
//1 0 1 0 1
//0 1 0 1 0
//1 0 1 0 1
//0 1 0 1 0
//public class Pattern {
//	public static void main(String []args) {
//		int n =5;
//		for(int i=1;i<=n;i++) {
//			for(int j =1;j<=n;j++) {
//				System.out.print(((i+j)%2)+" ");
//			}
//			System.out.println();
//		}
//	}
//}
//__________________________________________________________________________________
//____________________________________________________________________________________
//1 1 1 1 1
//0 0 0 0 0
//1 1 1 1 1
//0 0 0 0 0
//1 1 1 1 1
//public class Pattern {
//public static void main(String []args) {
//	for(int i=1;i<=5;i++) {
//		for(int j =1;j<=5;j++) {
//			if(i%2==0) {
//				System.out.print(0 +" ");
//			}
//			else {
//				System.out.print(1+" ");
//			}
//
//		}
//		System.out.println();
//	}
//}
//}
//_______________________________________________________________________________________
//0 0 0 0 0
//1 1 1 1 1
//0 0 0 0 0
//1 1 1 1 1
//0 0 0 0 0
//
//public class Pattern {
//public static void main(String []args) {
//	for(int i=1;i<=5;i++) {
//		for(int j =1;j<=5;j++) {
//			if(i%2!=0) {
//				System.out.print(0 +" ");
//			}
//			else {
//				System.out.print(1+" ");
//			}
//
//		}
//		System.out.println();
//	}
//}
//}
//_____________________________________________________________________________________________
//PRINT:
//* * * * *
//*       *
//* * * * *
//*       *
//* * * * *
//public class Pattern{
// public static void main(String[] args) {
//						for(int i=1;i<=5;i++) {
//							for(int j=1;j<=5;j++) {
//						if(i==1 || i==3 || i==5 || j==1 ||j==5 )
//							System.out.print("* ");
//						else
//							System.out.print("  ");
//						}
//					System.out.println();
//				}}}
//_________________________________________________________________________________________________
//* * * * *
//*   *   *
//*   *   *
//*   *   *
//* * * * *
//public class Pattern{
//public static void main(String[] args) {
//						for(int i=1;i<=5;i++) {
//							for(int j=1;j<=5;j++) {
//						if(i==1 || i==5 || j==1 || j==3 ||j==5 )
//							System.out.print("* ");
//						else
//							System.out.print("  ");
//						}
//					System.out.println();
//				}}}
//__________________________________________________________________________________________________
//* * * * *
//*   *   *
//* * * * *
//*   *   *
//* * * * *
//public class Pattern{
//public static void main(String[] args) {
//						for(int i=1;i<=5;i++) {
//							for(int j=1;j<=5;j++) {
//						if(i==1 || i==5||i==3 || j==1 || j==3 ||j==5 )
//							System.out.print("* ");
//						else
//							System.out.print("  ");
//						}
//					System.out.println();
//				}}}
//__________________________________________________________________________________________________
//PRINT
//    * * * * *
//    
//    
//    
//    * * * * *
//public class Pattern{
//public static void main(String[] args) {
//						for(int i=1;i<=5;i++) {
//							for(int j=1;j<=5;j++) {
//						if(i==1||i==5 )
//							System.out.print("* ");
//						else
//							System.out.print("  ");
//						}
//					System.out.println();
//				}}}
//__________________________________________________________________________________________________
//*       *
//*       *
//*       *
//*       *
//*       *
//public class Pattern{
//public static void main(String[] args) {
//						for(int i=1;i<=5;i++) {
//							for(int j=1;j<=5;j++) {
//						if(j==1||j==5 )
//							System.out.print("* ");
//						else
//							System.out.print("  ");
//						}
//					System.out.println();
//				}}}
//_________________________________________________________________________________________________
//PRINT
//*      * 
//* *    *
//*   *  *
//*    * *
//*      *
//public class Pattern{
//public static void main(String[] args) {
//	int n =5;
//						for(int i=1;i<=5;i++) {
//							for(int j=1;j<=5;j++) {
//						if(j==1||j==n||i==j)
//							System.out.print("* ");
//						else
//							System.out.print("  ");
//						}
//					System.out.println();
//				}}}
//_____________________________________________________________________
//*      * 
//*    * *
//*  *   *
//* *    *
//*      *
//wrong
//
//public class Pattern{
//public static void main(String[] args) {
//	int n =5;
//						for(int i=1;i<=5;i++) {
//							for(int j=1;j<=5;j++) {
//						if(j==1||j==n||j==i||j+i==1)
//							System.out.print("* ");
//						else
//							System.out.print("  ");
//						}
//					System.out.println();
//				}}}
//
//__________________________________________________________________
//* * * * *
//  *
//    *
//      *
//* * * * *
//public class Pattern{
//public static void main(String[] args) {
//	int n =5;
//						for(int i=1;i<=5;i++) {
//							for(int j=1;j<=5;j++) {
//						if(i==1||i==n||i==j)
//							System.out.print("* ");
//						else
//							System.out.print("  ");
//						}
//					System.out.println();
//				}}}
//____________________________________________________________________
//* * * * *
//      *
//    *
//  *
//* * * * *
//public class Pattern{
//public static void main(String[] args) {
//int n =5;
//					for(int i=1;i<=5;i++) {
//						for(int j=1;j<=5;j++) {
//					if(i==1||i==n||j==n-i+1)
//						System.out.print("* ");
//					else
//						System.out.print("  ");
//					}
//				System.out.println();
//			}}}
//___________________________________________________________________
//
//  * * * * *
//      *
//      *
//      *
//  * * * * *
//public class Pattern{
//public static void main(String[] args) {
//int n =5;
//					for(int i=1;i<=5;i++) {
//						for(int j=1;j<=5;j++) {
//					if(i==1||i==5||j==3)
//						System.out.print("* ");
//					else
//						System.out.print("  ");
//					}
//				System.out.println();
//			}}}
//
//__________________________________________________________________________-
//* * * * *
//
//* * * * *
//
//* * * * *
//
//public class Pattern{
//public static void main(String[] args) {
//int n =5;
//					for(int i=1;i<=5;i++) {
//						for(int j=1;j<=5;j++) {
//					if(i==1||i==3||i==5)
//						System.out.print("* ");
//					else
//						System.out.print("  ");
//					}
//				System.out.println();
//			}}}
//__________________________________________________________________________________
//* * * * *
//    *
//* * * * *
//    *
//* * * * *
//public class Pattern{
//public static void main(String[] args) {
//int n =5;
//					for(int i=1;i<=5;i++) {
//						for(int j=1;j<=5;j++) {
//					if(i==1||i==3||i==5||j==3)
//						System.out.print("* ");
//					else
//						System.out.print("  ");
//					}
//				System.out.println();
//			}}}
//_____________________________________________________________________________________
//* * * * *
// *     *
//    *
// *     *
//* * * * * 
//___________________________________________________
//PRINT
//A A A A A
//B B B B B
//C C C C C
//D D D D D
//E E E E E
//public class Pattern{
//public static void main(String[] args) {
//					for(char i='A';i<='E';i++) {
//						for(char j='A';j<='E';j++) {
//						System.out.print(i+" ");
//						}
//						System.out.println();
//					}
//			}}
//_____________________________________________________________
//A B C D E
//A B C D E
//A B C D E
//A B C D E
//A B C D E
//public class Pattern{
//public static void main(String[] args) {
//					for(char i='A';i<='E';i++) {
//						for(char j='A';j<='E';j++) {
//						System.out.print(j+" ");
//						}
//						System.out.println();
//					}
//			}}
//___________________________________________________________
//E D C B A
//E D C B A
//E D C B A
//E D C B A
//E D C B A
//public class Pattern{
//public static void main(String[] args) {
//					for(char i='E';i>='A';i--) {
//						for(char j='E';j>='A';j--) {
//						System.out.print(j+" ");
//						}
//						System.out.println();
//					}
//			}}
//____________________________________________________________________
//PRINT
//E E E E E
//D D D D D
//C C C C C
//B B B B B
//A A A A A
//
//public class Pattern{
//public static void main(String[] args) {
//					for(char i='E';i>='A';i--) {
//						for(char j='E';j>='A';j--) {
//						System.out.print(i+" ");
//						}
//						System.out.println();
//					}
//			}}
//___________________________________________________________________
//Z Y X W V
//Z Y X W V
//Z Y X W V
//Z Y X W V
//Z Y X W V
//public class Pattern{
//public static void main(String[] args) {
//					for(char i='Z';i>='V';i--) {
//						for(char j='Z';j>='V';j--) {
//						System.out.print(j+" ");
//						}
//						System.out.println();
//					}
//			}}
//____________________________________________________________________
//Z Z Z Z Z
//Y Y Y Y Y
//X X X X X
//W W W W W
//V V V V V
//public class Pattern{
//public static void main(String[] args) {
//					for(char i='Z';i>='V';i--) {
//						for(char j='Z';j>='V';j--) {
//						System.out.print(i+" ");
//						}
//						System.out.println();
//					}
//			}}
//_____________________________________________________________________
//
//1  2  3  4  5 
//6  7  8  9  10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25
//
//public class Pattern{
//public static void main(String[] args) {
//	int n=5;
//	int num=1;
//					for(int i=1;i<=5;i++) {
//						for(int j=1;j<=5;j++) {
//						System.out.print(num+" ");
//						num++;
//						}
//						System.out.println();
//					}}}
//_______________________________________________________________________
//
//print
//* * * * *
//*       *
//*       *
//*       *
//* * * * *
//public class Pattern{
//public static void main(String[] args) {
//						for(int i=1;i<=5;i++) {
//							for(int j=1;j<=5;j++) {
//						if(i==1  || i==5 || j==1 ||j==5 )
//							System.out.print("* ");
//						else
//							System.out.print("  ");
//						}
//					System.out.println();
//				}}}
//____________________________________________________________________
//___________________________________TRIANGLE PATTERN__________________________________________
//* * * * *
//* * * *
//* * *
//* *
//* 
//public class Pattern {
//public static void main(String[] args) {
//	for(int i=5;i>=1;i--) {
//		for(int j=1;j<=i;j++) {
//		System.out.print("* ");
//	}
//		System.out.println();
//}
//}
//}
//_________________________________________________________________________________________________
//5
//5 4
//5 4 3 
//5 4 3 2 
//5 4 3 2 1
//
//public class Pattern {
//public static void main(String[] args) {
//	int n=5;
//	for(int i=1;i<=n;i++) {
//		for(int j=5;j>=i;j--) {
//		System.out.print(j+" ");
//	}
//		System.out.println();
//}
//}
//}
//____________________________________________________________________________________________________
//1 
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//public class Pattern {
//public static void main(String[] args) {
//	int n = 5;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//		System.out.print(j+" ");
//	}
//		System.out.println();
//}
//}
//}
//_____________________________________________________________________________________________________
//PRINT
//5 
//4 5 
//3 4 5
//2 3 4 5
//1 2 3 4 5
//
//public class Pattern {
//public static void main(String[] args) {
//	int n = 5;
//	for(int i=n;i>=1;i--) {
//		for(int j=i;j<=n;j++) {
//		System.out.print(j+" ");
//	}
//		System.out.println();
//}
//}}
//___________________________________________________________________________________________________
//print
//5 
//4 4
//3 3 3
//2 2 2 2
//1 1 1 1 1
//
//public class Pattern {
//public static void main(String[] args) {
//	int n = 5;
//	for(int i=n;i>=1;i--) {
//		for(int j=n;j>=i;j--) {
//		System.out.print(i+" ");
//	}
//		System.out.println();
//}
//}}
//__________________________________________________________________________________________________________________
//1 
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
//public class Pattern {
//public static void main(String[] args) {
//	int num =1;
//	int n = 5;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(num + " ");
//			num++;
//	}
//		System.out.println();
//}
//}}
//_____________________________________________________________________________________________
//A
//B B
//C C C
//D D D D
//E E E E E
//public class Pattern {
//public static void main(String[] args) {
//	for(char i='A';i<='E';i++) {
//		for(char j='A';j<=i;j++) {
//			System.out.print(i+ " ");
//	}
//		System.out.println();
//}
//}}
//______________________________________________________________________________________________
//1 0 1 0 1
//1 0 1 0
//1 0 1
//1 0
//1
//public class Pattern {
//public static void main(String[] args) {
//	int n=5;
//	for(int i=n;i>=1;i--) {
//		for(int j=1;j<=i;j++) {
//			System.out.print((j%2) + " ");
//	}
//		System.out.println();
//}
//}}
//__________________________________________________________________________________________________
//1 0 1 0 1
//0 1 0 1
//1 0 1
//0 1
//1
//public class Pattern {
//public static void main(String[] args) {
//	int n=5;
//	for(int i=n;i>=1;i--) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(((i+j)%2) + " ");
//	}
//		System.out.println();
//}
//}}
//______________________________________________________________________________________________________
//1 1 1 1 1
//0 0 0 0
//1 1 1 
//0 0 
//1
//public class Pattern {
//public static void main(String[] args) {
//	int n=5;
//	for(int i=1;i<=n;i++) {
//		for(int j=n;j>=i;j--) {
//			System.out.print(i%2+ " ");
//	}
//		System.out.println();
//}
//}}
//______________________________________________________________________________________________________
//1 2 3 4 5
//2     5
//3   5
//4 5
//5
//Wrong
//public class Pattern {
//public static void main(String[] args) {
//	int n=5;
//	for(int i=1;i<=n;i++) {
//		for(int j=n;j<=n;j++) {
//			if(i==1||j==1||i+j==n+1) {
//				System.out.print(j+" ");
//			}
//			else {
//				System.out.print(1);
//			}
//	}
//		System.out.println();
//}
//}}
//_____________________________________________________________________________________________________________
//1 2 1 4 1
//2 1 4 1
//1 4 1
//4 1
//1
//public class Pattern {
//public static void main(String[] args) {
//	int n=5;
//	for(int i=1;i<=n;i++) {
//		for(int j=i;j<=n;j++) {
//			if(j%2==0) {
//				System.out.print(j+" ");
//			}
//			else {
//				System.out.print("1 ");
//			}
//	}
//		System.out.println();
//}
//}}
//_______________________________________________________________________________________________
//5 
//4 5
//3 4 5
//2 3 4 5
//1 2 3 4 5
//public class Pattern {
//public static void main(String[] args) {
//	int n=5;
//	for(int i=n;i>=1;i++) {
//		for(int j=i;j<=n;j--) {
//			System.out.print(j + " ");
//	}
//		System.out.println();
//}
//}}
//_________________________________________________________________________________________________
//5
//4 4 
//3 3 3 
//2 2 2 2
//1 1 1 1 1
//public class Pattern {
//public static void main(String[] args) {
//	int n=5;
//	for(int i=n;i>=1;i--) {
//		for(int j=n;j>=i;j--) {
//			System.out.print(i + " ");
//	}
//		System.out.println();
//}
//}}
//_____________________________________________________________________________________________________
//1 
//1 2 
//1 2 3
//1 2 3 4
//1 2 3 4 5
//public class Pattern {
//public static void main(String[] args) {
//	int n=5;
//	for(int i=1;i<=n;i++) {
//		for(int j=i;j<=n;j++) {
//			System.out.print(j + " ");
//	}
//		System.out.println();
//}
//}}
//_____________________________________________________________________________________________________
//1 
//2 3
//4 5 6
//7 8 9 1
//2 3 4 5 6
//public class Pattern {
//public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);
//	int n = sc.nextInt();
//	int num=1;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(num++ + " ");
//			if(num==10) {
//				num=1;
//			}
//	}
//		System.out.println();
//}
//}}
//______________________________________________________________________________________________________
//1 2 3 4 5
//6 7 8 9
//1 2 3
//4 5
//6
//public class Pattern {
//public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);
//	int n = 5;
//	int num=1;
//	for(int i=n;i>=1;i--) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(num++ + " ");
//			if(num==10) {
//				num=1;
//			}
//	}
//		System.out.println();
//}
//}}
//___________________________________________________________________________________________________________
//PRINT
//* * * * *
//*     *
//*   *
//* *   *
//*       *
//__________________________________________________________________________________________
//PRINT
//             1
//         1   2
//      1  2   3
//   1  2  3   4
//1  2  3  4   5
//public class Pattern {
//public static void main(String[] args) {
//	int n=5;
//	for(int i=1;i<=n;i++) {
//		for(int j=i;j>=n;j--) {
//			System.out.print("  ");
//			for(int k=1;k<=i;k++) {
//				System.out.print(k);
//			}
//	}
//		System.out.println();
//}
//}}
//____________________________________________________________________________________________________________
//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
//public class Pattern {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	for(int i=1;i<=n;i++) {
//		for(int j=i;j<n;j++) {
//			System.out.print("  ");
//			for(j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//	}}
//		System.out.println();
//}}
//_______________________________________________________________________________________________________________
//PRINT
//           *
//         *   *
//       *   *   *
//     *   *   *   *
//   *   *   *   *   *
//public class Pattern{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the row numbers ");
//		int n = sc.nextInt();
//		for(int r=1;r<=n;r++) {
//			for(int c=r;c<n;c++) {
//				System.out.print("  ");
//			}
//			for(int c=1;c<=r;c++) {
//				System.out.print("*   ");
//			}
//			System.out.println();
//			}
//	}	
//}
//___________________________________________________________________________________________________________________
//               1
//            2     3
//         4     5    6
//       7    8     9   10
//    11   12    13   14   15
//public class Pattern{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the row numbers ");
//	int n = sc.nextInt();
//	int num =1;
//	for(int r=1;r<=n;r++) {
//		for(int c=r;c<n;c++) {
//			System.out.print("  ");
//		}
//		for(int c=1;c<=r;c++) {
//			System.out.print(num++ +"  ");
//		}
//		System.out.println();
//		}
//}	
//}
//_______________________________________________________________________________________________________________-
//                *
//              * * *
//            * * * * *
//          * * * * * * *
//        * * * * * * * * * 
//          * * * * * * *
//            * * * * *
//              * * *
//                *
//public class Pattern{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the row numbers ");
//	int n = sc.nextInt();
//	for(int r=1;r<=n;r++) {
//		for(int c=r;c<n;c++) {
//			System.out.print("  ");
//		}
//		for(int c=1;c<=r;c++) {
//			System.out.print("* ");
//		}
//		for(int c=1;c<r;c++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//		}
//	for(int r=1;r<n;r++){
//		for(int c=1;c<=r;c++) {
//			System.out.print("  ");
//	}
//		for(int c=r;c<n-1;c++) {
//			System.out.print("* ");
//		}
//		for(int c=r;c<=n-1;c++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//}	
//}
//_______________________________________________________________________________________________________________________________
//
//               1 
//             1 2 1
//           1 2 3 2 1
//         1 2 3 4 3 2 1
//       1 2 3 4 5 4 3 2 1
//public class Pattern{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the row numbers ");
//	int n = sc.nextInt();
//	for(int r=1;r<=n;r++) {
//		for(int c=r;c<n;c++) { 
//			System.out.print("   ");
//		}
//		for(int c=1;c<=r;c++) {
//			System.out.print(c +"  ");
//		}
//		for(int c=r-1;c>=1;c--) {
//			System.out.print(c+"  ");
//		}
//		System.out.println();
//		}
//}	
//}
//____________________________METHOD 2  wrong_________________________________
//public class Pattern{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the row numbers ");
//	int n = sc.nextInt();
//	for(int r=1;r<=n;r++) {
//		for(int c=r;c<n;c++) { 
//			System.out.print("   ");
//		}
//		int num=1;
//		for(int c=1;c==r*2-1;c++) {
//			System.out.print(num +"  ");
//		if(c<r) {
//			num++;
//		}
//		else {
//			num--;
//		}}
//		System.out.println();
//}	
//}}
//_____________________METHOD 3 wrong
//public class Pattern{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the row numbers ");
//	int num=1;
//	int n = sc.nextInt();
//	for(int r=1;r<=n;r++) {
//		for(int c=r;c<n+r-1;c++) {
//			if(c<=n-r) {
//				System.out.print(" ");
//			}
//			else {
//				System.out.print(num+" ");
//				if(c<n) {
//					num++;
//				}
//				else {
//					num--;
//				}}
//		}
//		System.out.println();
//		}}	
//}
//___________________________________________________________________________________________________________
//                        1
//                      1 * 2
//                    1 * 2 * 3
//                  1 * 2 * 3 * 4
//                1 * 2 * 3 * 4 * 5
//public class Pattern{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the row numbers ");
//	int n = sc.nextInt();
//	for(int r=1;r<=n;r++) {
//		for(int c=r;c<n;c++) { 
//			System.out.print(" ");
//		}
//		for(int c=1;c<=r;c++) {
//			if(c==r) {
//				System.out.print(c);
//			}
//			else {
//				System.out.print(c +" * ");
//			}
//		}
//		System.out.println();
//		}
//}	}
//___________________________________________________________________________________________________________
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          *
//public class Pattern{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the row numbers ");
//	int n = sc.nextInt();
//	for(int r=1;r<=n;r++) {
//		for(int c=1;c<=r-1;c++) { 
//			System.out.print("   ");
//		}
//		for(int c=r;c<n;c++) {
//			System.out.print("*  ");
//		}
//		for(int c=n;c>=r;c--) {
//			System.out.print("*  ");
//		}
//		System.out.println();
//		}
//}	
//}
//____________________________________________________________________________________________________________
//PRINT
//# - # - #
//- 1 2 3 
//# 4 5
//- 6
//#
//public class Pattern{
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the row numbers ");
//	int n = sc.nextInt();
//	int num =1;
//	for(int r=1;r<=n;r++) {
//		for(int c=r;c<=n;c++) { 
//			if(r==1||c==r) {
//				System.out.print(c%2==0 ?"- ":"# ");
//			}
//			else {
//				System.out.print(num++ +" ");
//			}
//		}
//		System.out.println();
//		}
//	}
//}
////______________________________________________________________________________________________________
//1 2 3 4 5 
//2 $ 5 $
//3 10 $
//4 20
//5
//public class Pattern{
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the row numbers ");
//	int n = sc.nextInt();
//	int num =1,a=5;
//	for(int r=1;r<=n;r++) {
//		for(int c=r;c<=n;c++) { 
//			if(r==1 || c==r) {
//				System.out.print(c + " ");
//			}
//			else {
//				if(num%2!=0) {
//					System.out.print("$ ");
//				}
//			else {
//				System.out.print(a+" ");
//				a*=2;
//			}
//			num++;
//		}
//		}
//		System.out.println();
//		}
//	}}
//\___________________________________________________________________________
//
//* * * * * * * *
//*             *
//*             *
//* * * * * * * *
//*             *
//*             *
//* * * * * * * *
//*             *
//*             *
//* * * * * * * *
//*             *
//*             * 
//* * * * * * * *
//wrong
//public class Pattern{
//public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);
//System.out.println("Enter the row numbers ");
//int n = sc.nextInt();
////int m =sc.nextInt();
//for(int r=1;r<=n;r++) {
//	for(int c=1;c<=n;c++) { 
//		if(c==1||c==7) {
//			System.out.print("* ");
//			r+=2;
//		}
//		else {
//			if()
//		System.out.print(" ");
//		}}
//	System.out.println();
//	}
//}
//}
//_____________________________________________________________________________________________
//                    1
//                 0  0  0
//              1  1  1  1  1
//           0  0  0  0  0  0  0
//        1  1  1  1  1  1  1  1  1
//_________________________________________________________________________________________________
//1 2 3 4 5
//2     5
//3   5
//4 5
//5
//
//__-----------------------------------
//
//
//import java.util.Scanner;
//
//public class Pattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the first number");
//        int m = sc.nextInt();
//        System.out.print("Enter the second number ");
//        int n = sc.nextInt();
//        for (int r = 1; r <= n; r++) {
//            for (int c = 1; c <= m; c++) {
//                if (r == 1 || r == n || r % (n / 3) == 0) {
//                    System.out.print("* ");
//                } else {
//                    if (c == 1 || c == m) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class Pattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter m: ");
//        int m = sc.nextInt();
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (i % (n / 3) == 0 || j == 1 || j == m) {
//                    System.out.print("*\t");
//                } else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//    }
//}



public class Pattern {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = sumOfDivisior(n);
        if(sum==n) {
        	System.out.println("perfect Number");
        }
        else {
        	System.out.println("Not a Perfect number");
        }
	}
	public static int sumOfDivisior(int n) {
		int sum=1;
		for(int i=2;i<=n;i++) {
			if(n%2==0) {
				sum+=i;
			}}
			return sum;
		}
	}


