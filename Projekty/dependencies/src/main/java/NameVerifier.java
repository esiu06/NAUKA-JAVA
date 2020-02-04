import org.apache.commons.lang3.StringUtils;

/**
 * klasa testowa dla zarządzania zależnościami
 * wpinania pluginów do cyklu
 * esiu
 */
public class NameVerifier {
    public static void main(String[] args) {
        String name = "Paweł";
        System.out.println(StringUtils.isAlpha(name));
    }
    /**
     * MetodA DODAJĄCA DWIE liczby
     * @param a
     * @param b
     * @return suma parametrów a i b
     */
    public int add(int a, int b){
        return a+b;
    }
}
