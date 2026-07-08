package calc;

class c1 extends SimpleCalculator {
  void proSol() {
    System.out.println(proInt);
    System.out.println(defInt);
  }
}

public class UseOfSubclassInAccessModifier {
  public static void main(String args[]) {
    System.out.println("I am Main Method.");
    c1 work = new c1();
    System.out.println(work.defInt);
    System.out.println(work.proInt);
  }
}
