package com.company;
import java.util.Date;

import java.util.Random;

class Thread1 extends Thread
{
    @Override //переопределение метода в базовом классе
    public void run()
    {
        for(int i = 0; i < 5; i++) {
            try {
                // Приостанавливаем поток
                sleep(Thread2.getTimeSleep());
                System.out.println("Поток 2");

                // Инициализация объекта date
                Date date = new Date();

                // Вывод текущей даты и времени с использованием toString()
                System.out.println(date.toString());

            }catch(InterruptedException e){}
        }
    }
}
