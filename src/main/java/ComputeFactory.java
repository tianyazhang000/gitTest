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

    public static final Add add = new Add();

    public static final Sub sub = new Sub();

    public static Computable getCompute(char symbol) {
        switch (symbol) {
            case '+':
                return add;
            case '-':
                return sub;
            default:
                throw new IllegalArgumentException();
        }
    }

}