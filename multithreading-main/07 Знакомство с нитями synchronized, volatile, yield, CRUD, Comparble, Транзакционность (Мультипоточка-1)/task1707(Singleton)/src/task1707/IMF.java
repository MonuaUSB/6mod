package task1707;
//Requirements:
//        1. Класс IMF должен содержать приватное статическое поле IMF imf.
//2. Класс IMF должен содержать приватный конструктор.
//        3. Класс IMF должен содержать публичный статический метод IMF getFund().
//        4. Метод getFund() должен содержать синхронизированный блок.
//        5. Внутри синхронизированного блока должно быть проинициализировано поле imf.
//        6. Метод getFund() должен всегда возвращать один и тот же объект.

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        synchronized (IMF.class){
            if(imf==null){
                imf = new IMF();

            }
        }
        return imf;
    }

    private IMF() {
    }
}
