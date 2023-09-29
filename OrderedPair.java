
/**
 * 在这里给出对类 OrderedPair 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class OrderedPair
{
    double X, Y;
    
    public OrderedPair(){
        X=0;
        Y=0;
    }
    
    public OrderedPair(double a, double b){
        X=a;
        Y=b;
    }
    
        public String toString(){
        return (X+","+Y);
    }
    
    public double getX(){
        return X;
    }
    
    public double getY(){
        return Y;
    }
}
