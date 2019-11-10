package duhuafei.function.active;

/** sigmoid激活函数
 * Created by Duhuafei on 11/09/2019.
 */
public class Sigmoid {
    public static double eval(Double x){
        if (null == x){
            x = 0.0;
        }
        return 1.0 / (1 + Math.exp(-x));
    }
}
