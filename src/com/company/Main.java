package com.company;
import java.util.Date;
public class Main {
    public static void main(String[] args)
    {
        Thread1 th2 = new Thread1 (); // Создание потока
        System.out.println("Сравним, какой же из двух потоков завершит работу раньше ?");

        th2.start(); // Запуск потока
        for(int i = 0; i < 5; i++) {
            try {
                // Приостанавливаем поток
                Thread.sleep(Thread2.getTimeSleep());
                System.out.println("Поток 1");

                // Инициализация объекта date
                Date date = new Date();

                // Вывод текущей даты и времени с использованием toString()
                System.out.println(date.toString());

            }catch(InterruptedException e){}
        }
        if(th2.isAlive()) { // Сделал ли th2 последнее действие?
            try{
                th2.join(); // Ждем, пока th2 закончит действия
            }catch(InterruptedException e){}

            System.out.println("Первым завершил работу второй поток!");

            Date date = new Date();
            System.out.println(date.toString());

        } else {
            //если th2 уже закончил действия
            System.out.println("Первым завершил работу первый поток!");

            Date date = new Date();
            System.out.println(date.toString());
        }
        System.out.println("Сравнение потоков завершено");

        Date date = new Date();
        System.out.println(date.toString());
    }
}

