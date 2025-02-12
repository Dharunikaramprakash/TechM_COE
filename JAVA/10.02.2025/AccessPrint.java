package printex;

public class AccessPrint {
  // Class names should follow PascalCase
        public static void main(String[] args) {
            printMethod();
            printlnMethod();
            AccessPrint obj=new AccessPrint();
            obj.errorMethod();





        }
        public static void printMethod(){
            int integerValue = 102;
            float floatValue = 10.45F;
            System.out.print("Integer value: " + integerValue);
            System.out.print("Float value:" + floatValue +"\n");
        }
        public static void printlnMethod(){
            int integerValue = 102;
            float floatValue = 10.45F;
            System.out.println("Addition of integerValue and floatValue: " + (integerValue + floatValue));
            System.out.println("Multiplication of two: " + (integerValue * floatValue));
        }
        public void errorMethod(){
            int zeroValue = 0;
            System.err.println("zeroValue cannot be multiplied, which leads to an arithmetic error.");
            System.err.println("Division with zeroValue is not possible as it leads to an arithmetic error.");
        }
    }


