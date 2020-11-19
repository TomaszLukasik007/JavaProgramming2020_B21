package day29_Methods;

public class MethodWithoutParameters {
    public static void main(String[] args) {

    printHello5time();
        System.out.println("Tomasz");
    printHello5time();
        System.out.println("Cybertek");
    printHello5time();

      MethodWithoutParameters.printHello5time();

      MethodsWithoutParamters2.printOddNumbers1to100();

      MethodsWithoutParamters2.printEvenNumbers1to100();

    }
//AccessModifier  specifier  return  Type   MethodName   (Parameters)  { }
      public static void printHello5time() {

          for(int i=1; i<6; i++) {
              System.out.println("Hello");
          }

    }
}
/*
	    step1: print hello 5 times  (for loop)
		step2: print your name
		step3: print hello 5 times  (for loop)
		step4: print your school name
		step5: print hello 5 times   (for loop)
 */