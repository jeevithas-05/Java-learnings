//simple for loop
class ForLoopExample {
    public static void main(String[] args) {
        for (int i=1; i<=5;i++) {
            System.out.println(i);
        }
    }
}

//for loop counting down
class ForLoopCountdown{
    public static void main(String[]  args) {
        for(int i = 5; i>=1; i--) {
            System.out.println(i);
        }
    }
}

//even numbers
class EvenNumbers{
    public static void main(String[] args) {
        for(int i = 1;i<=50;i++) {
            if(i % 2 == 0) {
                System.out.println(i);         
                   }
        }
    }
}

//sum
class ForLoopExample2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=10;i++) {
            sum=sum+1;
        }
        System.out.println(sum);
    }
}

//do while loop
class DoWhileExample{
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println(i);
            i++;
            while(i<=5);
        }
    }
}

/