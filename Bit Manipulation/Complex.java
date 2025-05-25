public class Complex {
    int real;
    int imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }
    public static Complex diff(Complex a,Complex b){
        return new Complex(a.real-b.real, a.imag-b.imag);
    }
    public static Complex product(Complex a,Complex b){
        return new Complex(a.real*b.real-a.imag*b.imag, a.imag*b.real+a.real*b.imag);
    }
    public void printComplex(){
        if(real==0 && imag!=0) System.out.println(imag+"i");
        else if(real!=0 && imag==0) System.out.println(real);
        else System.out.println(real+"+"+imag+"i");
    }
    public static void main(String[] args) {
        Complex a = new Complex(5, 3);
        Complex b = new Complex(2, 4);
        Complex sum = Complex.add(a, b);
        Complex diff = Complex.diff(a, b);
        Complex product = Complex.product(a, b);
        sum.printComplex();
        diff.printComplex();
        product.printComplex();
    }
}


