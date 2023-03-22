package formulageneral;
public class FormulaGralClass {
    public double a, b, c;

        public FormulaGralClass(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double solSum(){
            return ( (-b) - Math.sqrt( Math.pow( b, 2 ) - (4*a*c) ) ) / (2*a);
        }

        public double solRes(){
            return ( (-b) + Math.sqrt( Math.pow( b, 2 ) - (4*a*c) ) ) / (2*a);
        }
}
