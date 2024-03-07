public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            double a, b, c;
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
            
            double x1 = ((-b)+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
            double x2 = ((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
            
            System.out.println("X1: "+x1);
            System.out.println("X2: "+x2);
            
        } catch (NumberFormatException nfe) {
            System.out.println("Please input data in number format only.");
        } catch (ArrayIndexOutOfBoundsException aibe){
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
}
