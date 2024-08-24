package task1824;

import java.io.*;

/* 
Файлы и исключения
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используй System.exit();


Requirements:
1. Программа должна считывать имена файлов с консоли.
2. Для каждого файла нужно создавать поток для чтения.
3. Если файл не существует, программа должна перехватывать исключение FileNotFoundException.
4. После перехвата исключения, программа должна вывести имя файла в консоль и завершить работу.
5. Потоки для чтения из файла должны быть закрыты.
6. Команду "System.exit();" использовать нельзя.*/

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String filename;
            while ((filename = br.readLine())!=null){
                try(FileInputStream impil = new FileInputStream(filename)) {
                } catch (FileNotFoundException e){
                    System.out.println("Кажется вы ввели неправильно имя файла = "+filename);
                    return;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
