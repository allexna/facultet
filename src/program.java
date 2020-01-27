import java.util.Scanner;

public class program {
    public static void main(String[]args){
        System.out.println("Ведите имя");



        try {
            Scanner in = new Scanner(System.in);
            String name = in.next();

            char[] strToArray = name.toCharArray();//Преобразование строки в массив char
            char c;
            for (int i = 0; i < strToArray.length; i++) {
                c = strToArray[i];
                if (c >= '0' && c <= '9'){

                    System.out.println("Поле имя  должно содержать буквы"); break;
                }


            }





        } catch (NumberFormatException ex) {
            System.out.println("Программа завершена, тк введены цифры, а должны буквы");

        }
        System.out.println("Программа завершена ");


    }


}

