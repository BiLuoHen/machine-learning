package duhuafei.function.active;

/**
 * @author Duhuafei
 * @date 11/12/2019
 */
public class PReLU {
    public static double eval(Double x, double a){
        if (null == x){
            x = 0.0;
        }
        return Math.max(a*x, x);
    }
}
