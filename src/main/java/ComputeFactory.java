/**
 * packageName PACKAGE_NAME
 *
 * @author 你的名字
 * @version JDK 8
 * @className ComputeFactory (此处以class为例)
 * @date 2024/4/14
 * @description TODO
 */
public class ComputeFactory {

    public static Computable getCompute(String symbol) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Computable) Class.forName(symbol).newInstance();
    }

}