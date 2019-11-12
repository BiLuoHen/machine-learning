package duhuafei.function.active;

/**
 * @author Duhuafei
 * @date 11/12/2019
 */
public class ReLU {
    public static double eval(Double x){
        if (null == x){
            x = 0.0;
        }
        return Math.max(0, x);
    }
}
