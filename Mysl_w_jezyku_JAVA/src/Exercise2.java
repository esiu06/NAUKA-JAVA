public class Exercise2 {
    public static void loop(int n){
        int i = n;
        while (i >1){
            System.out.println(i);
            if (i % 2 == 0){
                i = i /2;
            }else{
                i = i + 1;
            }
        }
    }

    public static void printTable(int n){

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            loop(n);

        }
    }

    public static void main(String[] args) {
        loop(10);
        System.out.println("---------------------");
        printTable(10);
    }
}
