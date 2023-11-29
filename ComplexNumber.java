public class ComplexNumber {
   private double realPart;
   private double imaginaryPart;

   public ComplexNumber(double realPart, double imaginaryPart) {
      this.realPart = realPart;
      this.imaginaryPart = imaginaryPart;
   }

   public double real() {
      return realPart;
   }

   public double imag() {
      return imaginaryPart;
   }

   public double abs() {
      return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
   }

   public double arg() {
      double theta = Math.atan(imaginaryPart / realPart);

      if (realPart < 0) {
         if (imaginaryPart > 0) {
            return theta + Math.PI;
         } else {
            return theta - Math.PI;
         }
      } else {
         return theta;
      }

   }

   public ComplexNumber conj() {
      ComplexNumber result = new ComplexNumber(realPart, -imaginaryPart);
      return result;
   }

   public ComplexNumber add(ComplexNumber in) {
      double newRe = realPart + in.real();
      double newIm = imaginaryPart + in.imag();
      ComplexNumber result = new ComplexNumber(newRe, newIm);
      return result;
   }

   public ComplexNumber subtract(ComplexNumber in) {
      double newRe = realPart - in.real();
      double newIm = imaginaryPart - in.imag();
      ComplexNumber result = new ComplexNumber(newRe, newIm);
      return result;
   }

   public ComplexNumber multiply(ComplexNumber in) {
      // z1*z2=(x1x2-y1y2)+i(x1y2+x2y1)
      double x1 = realPart;
      double x2 = in.real();
      double y1 = imaginaryPart;
      double y2 = in.imag();

      double newRe = x1 * x2 - y1 * y2;
      double newIm = x1 * y2 + x2 * y1;
      ComplexNumber result = new ComplexNumber(newRe, newIm);
      return result;
   }

   public ComplexNumber divide(ComplexNumber in) {
      // z1/z2=(x1x2+y1y2)/(x2**2+y2**2)+i(x2y1-x1y2)/(x2**2+y2**2)
      double x1 = realPart;
      double x2 = in.real();
      double y1 = imaginaryPart;
      double y2 = in.imag();

      double newRe = (x1 * x2 + y1 * y2) / (x2 * x2 + y2 * y2);
      double newIm = (x2 * y1 - x1 * y2) / (x2 * x2 + y2 * y2);
      ComplexNumber result = new ComplexNumber(newRe, newIm);
      return result;
   }

   public ComplexNumber pow(int n) {
      if (n <= 0) {
         throw new IllegalArgumentException("You cannot use a nonpositive n");
      }

      // Using De Moivre's theorem, z**n = r**n * exp(n*theta)
      double r = abs();
      double theta = arg();
      ComplexNumber result = polar(Math.pow(r, n), n * theta);
      return result;
   }

   public static ComplexNumber polar(double r, double theta) {
      double newRe = r * Math.cos(theta);
      double newIm = r * Math.sin(theta);
      ComplexNumber result = new ComplexNumber(newRe, newIm);
      return result;
   }

   public String toString() {
      return "(" + realPart + ", " + imaginaryPart + ")";
   }
}
