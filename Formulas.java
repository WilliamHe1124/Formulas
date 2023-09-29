
/**
 * Sorry I did not notice the requirement for the names of the classes until
 * I finished, so the name of each class is different from the problem set.
 */
public class Formulas {
    public static OrderedPair quadr(double a, double b, double c){
        double ans1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a));
        double ans2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c)/(2*a));
        OrderedPair quans=new OrderedPair(ans1, ans2);
        return quans;
    }
    
    public static double slope(OrderedPair xy1, OrderedPair xy2){
        double slp=(xy1.getY()-xy2.getY())/(xy1.getX()-xy2.getX());
        return slp;
    }
    
    public static OrderedPair mid(OrderedPair yx1, OrderedPair yx2){
        double midx=(yx1.getX()+yx2.getX())/2;
        double midy=(yx1.getY()+yx2.getY())/2;
        OrderedPair midpoint=new OrderedPair(midx, midy);
        return midpoint;
    }
    
    public static double SeriesSum(double firnum, double rate, int terms){
        double sum=(terms/2.0)*(2*firnum+rate*(terms-1));
        return sum;
    }
    
    public static double SeriesProduct(double anum, double r, int k){
        double prod=anum*((1-Math.pow(r, k))/(1-r));
        return prod;
    }
    
    public static int rollDie (int sides){
        int result=(int)(Math.random()*sides)+1;
        return result;
    }

} 


