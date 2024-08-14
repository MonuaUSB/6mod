package task1618;

/* 
Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().


Requirements:
1. Класс TestThread должен быть унаследован от Thread.
2. Класс TestThread должен иметь public void метод run.
3. Метод main должен создавать объект типа TestThread.
4. Метод main должен вызывать метод start у объекта типа TestThread.
5. Метод main должен вызывать метод interrupt у объекта типа TestThread.*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread hello = new TestThread();
        hello.start();
        Thread.sleep(3);
        hello.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        public void run(){
            for(int i= 0; i< 10; i++){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Поток перванн!");
                    return;
                }
                System.out.println("Поток плывет, иттерация "+i);
            }

        }
    }
}