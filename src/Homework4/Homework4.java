package Homework4;

import java.sql.SQLOutput;

public class Homework4 {
    public static void main(String[] args) throws FlyException{
        //Базовый уровень
        //Задача №1
        //1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
        // атрибут самолета: countPassengers.
        //2. Создать интерфейс, который объединяет эти два класса.
        //3. Имплементировать его в двух классах
        //4. Реализовать метод летать:
        // Для утки:
        // Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
        // иначе печатать на экран "утка летит"
        // Для самолета:
        // Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
        // Иначе печать "самолет летит"
        //5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
        //6. Положить их всех в массив
        //7. Перебрать массив и вызвать у каждого элемента метод летать
        // Перехватить исключения: вывести на экран message ошибки
        // Ожидание:
        // утка летит
        // Ошибка: утка ранена
        // самолет летит
        // Ошибка: пассажиров в самолете меньше 0
        Duck duck = new Duck(false);
        duck.fly();
        Duck duck1 = new Duck(true);
        duck1.fly();
        Plane plane = new Plane(10);
        plane.fly();
        Plane plane1 = new Plane(-1);
        plane1.fly();


        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        // растение -> роза (умеет цвести, умеет пахнуть)
        // растение -> папоротник (умеет цвести)
        // Создать у каждого класса по объекту, распределить по массивам интерфейсов
        // И у каждого массива вызвать характерный метод
        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести


        //Задача №2
        //2. Создать следующую структуру из классов и интерфейсов
        // магазин (обладает работниками)
        // работник (обладает часами - (часы одни))
        // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        // Бренд (обладает массивом магазинов)
        // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
        // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
        // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
        // обработать ошибку сломанных часов.
        // Ожидание вывода на экран:
        // Часы тикают
        // Ошибка: Часы сломались.

        //Экспертный уровень:
        //Задача №1
        // Реализовать шаблон Builder для класса Human (атрибуты - возраст, имя, вес. Метод: инфо о человеке):
        // Для этого шаблона характерно:
        // 1. приватный конструктор,
        // 2. вложенный статический класс (HumanBuilder)
        // 3. статический метод builder() у Human, который возврашает экземпляр типа HumanBuilder.
        // Во время инициализации HumanBuilder, создается объект класса Human, и записывается в приватный атрибут.
        // 4. Класс HumanBuilder имеет методы, которые имеют тоже самое название, что и атрибуты класса Human,
        // которые вызывают сеттеры у экземпляра класса Human.
        // 5. HumanBuilder имеет метод build, который возвращает готовый объект типа Human.
        // Ожидаемый результат
        // Human human = Human.builder().name("Петр").age(20).weight(80).build();
        // human.info()
        // Петр - возраст 20, вес 80

        //Задача №2
        // Реализовать паттерн Decorator для класса Car (атрибут - стоимость, метод - вывести на экран стоимость).
        // Метод вывести на экран стоимость - выкидывает ошибку, если стоимость меньше 0
        // Для этого шаблона характерно:
        // 1. Класс основа (Car), и класс декоратор (CarShop), который принимает в себя экземпляр класса основы
        // 2. Вызов всех методов происходит у декоратора
        // Необходимо вызвать у декоратора метод продать машину, который выведет на экран для машины со стоимостью 5000
        // Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
        // 5000 - (вызванно из объекта Car)
        // Хочешь купить авто? (Вызвано из объекта CarShop)

        // Если стоимость машины меньше нуля:
        // Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
        // Неизвестна мне - (вызванно из объекта Car)
        // Давайте посмотрим другое авто? (Вызвано из объекта CarShop)
    }
}
