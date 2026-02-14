class Exception1{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero"+e.getMessage());
        }
        System.out.println("program continues after handling the exception.");
    }
}

class Exception2{
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("string is null"+e.getMessage());
        }
        System.out.println("program continues after handling exception.");
    }
}

class Exception3{
  public static void main(String[] args){
    int[] arr = new int[5];
    try{
      System.out.println(arr[10]);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array index is out of bounds "+e.getMessage());
    }
    System.out.println("Program continues after handling the exception");
  }
}

class Exception4{
  public static void main(String[] args){
    String str = "abc";
    try{
      int num = Integer.parseInt(str);
      System.out.println(num);
    }
    catch(NumberFormatException e){
      System.out.println("String cannot be converted to integer "+e.getMessage());
    }
    System.out.println("Program continues after handling the exception");
  }
}

class Exception5{
  public static void main(String[] args){
    try{
      int result = 10/0;
    }
    catch(ArithmeticException e){
      System.out.println("Caught an arthmetic exception "+e.getMessage());
    }
    finally{
      System.out.println("This block will always execute");
    }
    System.out.println("Program continues after handling the exception");
  }
}

//throw and throws
class Exceptionthrow{
    public static void main(String[] args) {
        int a = -1;

        if (a<0) {
            throw new IllegalArgumentException("value cannot be negative"+a);
        }
        System.out.println("value is:" + a);

    }
}
class Exceptionthrows{
    public static void main(String[] args) {
        try{
            methodThatThrowsException();
        } catch(Exception e) {
            System.out.println("caught an exception:" +e.getMessage());
        }
    }

        public static void methodThatThrowsException()throws Exception {
            throw new Exception("this is a custom exception message");
        }
}
class myexception extends Exception{
  public myexception(String message){
    super(message);
  }
}

class ExceptionMyException{
  public static void main(String[] args){
    try{
      validateAge(15);
    }
    catch(myexception e){
      System.out.println("caught my custom exception "+e.getMessage());
    }
  }

  public static void validateAge(int age) throws myexception{
    if(age<18){
      throw new myexception("Age must be at least 18.Provided age is "+age);
    }
    System.out.println("Age is valid "+age);
  }
}
        
