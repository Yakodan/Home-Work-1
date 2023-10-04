import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      // Объявляем объект класса сканер для ввода строки
        String str = scan.nextLine();


        char[] punctuation = {'!','?',',','.',':','-','_','(',')','[',']','{','}','<','>'};     /* Создаём массив строк,
                                                                                                содержащий знаки
                                                                                                пунктуации */

        for(char punct : punctuation){
            str = str.replace(punct,' ');       /* Убираем из строки все знаки пунктуации,
                                                        перечисленные в массиве */
        }

        str = str.replaceAll(" ","").toLowerCase();    /* Убираем из строки все пробелы и
                                                                        делаем все буквы строчными, чтобы
                                                                        мы могли сравнивать их без помех */


        boolean flag = true;    /* Создаём флаг, сигнализирующий о том, что фраза не палиндром
                                По-умолчанию считаем любуя фразу палиндромом */

        for (int i = 0; i <= (str.length()-1)/2;i++){           // Запускаем i от начала строки до её середины
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){    // Если находятся неодинаковые зеркальные буквы
                flag = false;                                   // То флаг опускается вниз, сигнализируя о НЕ палиндроме
                break;                                          // И мы выходим из цикла
            }
        }
        if(flag){
            System.out.println("This is palindrome!");
        }                                                       // Выводим ответ в зависимости от положения флага
        else{
            System.out.println("This is NOT palindrome!");
        }
    }
}