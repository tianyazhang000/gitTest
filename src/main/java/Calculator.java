/**
 * packageName PACKAGE_NAME
 *
 * @author 你的名字
 * @version JDK 8
 * @className Calculator (此处以class为例)
 * @date 2024/4/13
 * @description TODO
 */
public class Calculator {

    public int compute(int num1, int num2, String symbol) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Computable computable = ComputeFactory.getCompute(symbol);
        return computable.compute(num1, num2);
    }

}