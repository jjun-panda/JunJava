package java05_stu;

class Converter {

}

public class PyeongConverter extends Converter {

   public PyeongConverter(double m2) {
      this.m2 = m2;
   }

   public static void main(String[] args) {
      PyeongConverter toMM = new PyeongConverter(3.3);
      toMM.run();
   }

   @Override
   protected double convert(double src) {
      return 0;
   }

   @Override
   protected String getSrcString() {
      return null;
   }

   @Override
   protected String getDestString() {
      return null;
   }

}