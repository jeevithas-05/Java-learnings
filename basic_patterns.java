//pattern 1 : rectangle
class RectanglePattern {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++) {
            for (int j = 1;j<=5;j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}

//inerted triangle
class InvertedTriangle {
    public static void main(String[] args) {
        for(int i = 5; i>=1; i--) {
            for(int j = 1; j<=1; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}

//pascal's triangle
class PascalsTriangle {
    public static void main(String[]  args) {
        int n =5;

        for (int i = 0 ; i<n; i++) {
            //print spaces
            for(int j = 0;j<n-i;j++) {
                System.out.print(" ");
            }

            //print numbers
            int num = 1;
            for(int j = 0; j<=1; j++) {
                System.out.print(num + " ");
                num = num * (i-j) / (j+1);
            }
            System.out.println();
        }
}
}

//butterfly pattern
class ButterflyPattern {
    public static void main(String[]  args) {
        int n =5;

        // upper half
        for(int i = 1; i<=n; i++) {
            // Left stars
            for(int j = 1; j<=i;j++) {
                System.out.print("*");
            }
            //spaces
            for(int j = 1;j<=2 * (n-i); j++) {
                System.out.print(" ");
            }
            //Right stars
            for (int j = 1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}