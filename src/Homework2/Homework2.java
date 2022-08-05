package Homework2;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        // Домашка
        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        for (int i = 1; i < 101; i++) {
            System.out.print (i + "a ");
        }
        //
        // Задание №2
        // Дано:
        int ageChildren = 18;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        if (ageChildren < 6)
            System.out.println("Ребенок идет в сад");
        else if (ageChildren < 11)
            System.out.println("Ребенок идет в младшую школу");
        else if (ageChildren < 17)
            System.out.println("Ребенок идет в среднюю школу");
        else
            System.out.println("Поступает в университет");

        //
        // Задание №3
        // Дано:
        boolean chicken = false;
        boolean vegetables = true;
        boolean sour = false;
        boolean toast = false;
        boolean sausage = true;
        boolean eggs = false;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        if (chicken && vegetables && sour && toast)
            System.out.println("Салат Цезарь");
        else if (vegetables && eggs && sausage || chicken)
            System.out.println("Салат Оливье");
        else if (vegetables)
            System.out.println("Овощной салат");
        else
            System.out.println("У меня ничего нет");


        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.

        CatPet kshiska = new CatPet("Kshiska", 3.4);
        CatPet marik = new CatPet("Marik", 5.8);
        System.out.println(marik.getCalling());
        System.out.println(marik.getWeight());
        CatPet.calling = " kis kis";
        System.out.println(kshiska.getCalling());
        kshiska.setWeight(4.0);
        System.out.println(kshiska.getWeight());

        RatPet grey = new RatPet("grey", 1);
        RatPet white = new RatPet("white", 3);
        System.out.println(grey.getAge());
        System.out.println(grey.getColor());
        System.out.println(white.getColor());
        grey.setColor("black");
        System.out.println(grey.getColor());



        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        int finale = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        while (result < 1000000 ) {
            if (result < 0) {
                break;
            }
            result = result + increment;
            finale++ ;
        }
        System.out.println(finale);

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] numbers = {2, 3, 4, 5, 6, 7, 10, 111, 98};
//        System.out.println(numbers.length);
        for (int i = 0;  i < 9; i++) {
            if (i % 2 == 0) {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));




        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        double price = 0;
        int countProblems = 0;

        if (!hasFuel && !(hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem)) {
            price = 1000;
        } else {
            if (hasMotorProblem) {
                price += 10_000;
                countProblems++;
            }
            if (hasElectricsProblem) {
                price += 5_000;
                countProblems++;
            }
            if (hasTransmissionProblem) {
                price += 4_000;
                countProblems++;
            }
            if (hasWheelsProblem) {
                price += 2_000;
                countProblems++;
            }
            if (countProblems >= 2) {
                price *= 0.9;
            }
            if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
                price *= 0.8;
            }
        }
        System.out.println(price);

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
        Storage storage = new Storage();
        Employee emp1 = new Employee(storage);
        Employee emp2 = new Employee(storage);
        Employee emp3 = new Employee(storage);

        emp1.brokenVodka();
        emp2.brokenVodka();
        emp3.brokenVodka();
        System.out.println(emp1.getCountBrokenProd());
        System.out.println(storage.getProductCount());
        emp1.setCountBrokenProd(12);
        System.out.println(emp1.getCountBrokenProd());
        emp1.brokenVodka();
        System.out.println(emp1.getCountBrokenProd());
    }
}
