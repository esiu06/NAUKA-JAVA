public class Znaki {
    public static void main(String[] args) {
    String fruit = "banan";
    char letter = fruit.charAt(0);
        System.out.println(fruit);
        System.out.println(letter);

        if (letter == 'a'){
            System.out.println('?');
        }

        System.out.print("Alfabet łaciński ");
        for (int c = 'A'; c <= 'Z' ; c++) {
            System.out.print(c);
        }
        System.out.println();
        NewLine.newLine();
        System.out.print("Alfabet grecki ");
        for (int i = 913; i <= 937 ; i++) {
            System.out.print((char) i);
        }
        System.out.println();
        NewLine.newLine();
        String name = "Alan Turing";
        String upperName = name.toUpperCase();
        System.out.println(upperName);
        NewLine.newLine();
        String text = "Programowanie komputerów jest zabawne!";
        text = text.replace("Programowanie komputerów", "Pk");
        System.out.println(text);
        NewLine.newLine();
        for (int i = 0; i < fruit.length(); i++) {
            char letter2 = fruit.charAt(i);
            System.out.println(letter2);
        }
        NewLine.newLine();
        for (char letter3 : fruit.toCharArray()) {
            System.out.println(letter3);
        }
        NewLine.newLine();
        int length = fruit.length();
        char last = fruit.charAt(length - 1);
        System.out.println(last);
        NewLine.newLine();

        String s = "Programowanie komputerowe";
        System.out.println(reverse(s));
        NewLine.newLine();

        System.out.println(fruit.substring(0));
        System.out.println(fruit.substring(2));
        System.out.println(fruit.substring(5));
        System.out.println(fruit.substring(1, 3));
        NewLine.newLine();

        String fruit2 = "pomarańcza";
        int index = fruit2.indexOf('a');
        System.out.println(index);
        int index2 = fruit2.indexOf('a', 4);
        System.out.println(index2);
        int index3 = fruit2.indexOf("mar");
        System.out.println(index3);
        NewLine.newLine();

        String name1 = "Alan Turing";
        String name2 = "Ada Lovelace";
        if (name1.equals(name2)){
            System.out.println("Nazwiska są takie same");
        }else{
            System.out.println("Nazwiska są inne");
        }
        NewLine.newLine();

        int driff = name1.compareTo(name2);
        if (driff == 0){
            System.out.println("Nazwiska są takie same");
        }else if (driff < 0){
            System.out.println("name1 wystepuje przed name2");
        }else if (driff > 0){
            System.out.println("name2 występuje przed name1");
        }
        NewLine.newLine();
        System.out.println(timeString(17,28));
        NewLine.newLine();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        NewLine.newLine();

        String str = "12345";
        int num = Integer.parseInt(str);
        System.out.println(str);
        System.out.println(num);
        NewLine.newLine();
        int num2 = 67890;
        String str2 = Integer.toString(num2);
        System.out.println(num2);
        System.out.println(str2);
        NewLine.newLine();

    }
    public static String timeString (int hour, int minute){
        String ampm;
        if (hour < 12){
            ampm = "AM";
            if (hour == 0){
                hour = 12;
            }
        }else{
            ampm = "PM";
            hour = hour - 12;
        }
        return String.format("%02d:%02d %s", hour, minute, ampm);
    }
    public static String reverse (String s){
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }
}
