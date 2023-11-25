import org.apache.commons.math3.complex.Complex;

public class ComplexNumberTestDrive {
   public static void main(String[] args) {
      ComplexNumber z = new ComplexNumber(1, Math.sqrt(3));
      ComplexNumber result = z.pow(4);
      System.out.println("z = " + z);
      System.out.println("z**4 = " + result); // answer: -8 - 13.856i
      ComplexNumber zzbar = z.multiply(z.conj());
      System.out.println("z * conj_z = " + zzbar);
      Complex zxComplex = new Complex(1, Math.sqrt(3));
      System.out.println("zx = " + zxComplex);
      System.out.println(zxComplex.pow(4));
      Complex zyComplex = zxComplex.conjugate();
      System.out.println("zx * zx_conj = " + zxComplex.multiply(zyComplex));
      ComplexNumber a = new ComplexNumber(2, -3);
      ComplexNumber b = new ComplexNumber(-5, 1);
      ComplexNumber c = a.add(b);
      ComplexNumber d = a.subtract(b);
      ComplexNumber e = a.multiply(b);
      ComplexNumber f = a.multiply(a);
      ComplexNumber g = b.multiply(b);
      ComplexNumber h = a.divide(b);
      Complex ax = new Complex(2, -3);
      Complex bx = new Complex(-5, 1);
      Complex cx = ax.add(bx);
      Complex dx = ax.subtract(bx);
      Complex ex = ax.multiply(bx);
      Complex fx = ax.multiply(ax);
      Complex gx = bx.multiply(bx);
      Complex hx = ax.divide(bx);
      System.out.println("a = " + a);
      System.out.println("ax = " + ax);
      System.out.println("b = " + b);
      System.out.println("bx = " + bx);
      System.out.println("Real part of a: " + a.real());
      System.out.println("Real part of ax: " + ax.getReal());
      System.out.println("Imaginary part of a: " + a.imag());
      System.out.println("Imaginary part of ax: " + ax.getImaginary());
      System.out.println("Modulus of a: " + a.abs());
      System.out.println("Modulus of ax: " + ax.abs());
      System.out.println("Conjugate of a: " + a.conj());
      System.out.println("Conjugate of ax: " + ax.conjugate());
      System.out.println("a + b = " + c);
      System.out.println("ax + bx = " + cx);
      System.out.println("a - b = " + d);
      System.out.println("ax - bx = " + dx);
      System.out.println("a * b = " + e);
      System.out.println("ax * bx = " + ex);
      System.out.println("a * a = " + f);
      System.out.println("ax * ax = " + fx);
      System.out.println("b * b = " + g);
      System.out.println("bx * bx = " + gx);
      System.out.println("a / b = " + h);
      System.out.println("ax / bx = " + hx);
      System.out.println("a + conj_a = " + a.add(a.conj()));
      System.out.println("ax + conj_ax = " + ax.add(ax.conjugate()));
   }
}
