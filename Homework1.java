package lesson2;

import java.util.Arrays;

/**
 * Домашка №1
 */
public class Homework1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
        world = world.toLowerCase();
        String oneString = hi + world.trim() ;
        oneString = oneString.trim() + newLine;
        System.out.println(oneString.repeat(3));
//        for (int i = 0; i < 3; i++) {
//            System.out.println(oneString);
//        }


        //Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645
        double height = 1.57;
        double weight = 52;
        double index = weight / (height * 2);
        System.out.println(index);

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche
        char[] letters = new char[]{'a', 'b', 'с', 'd', 'e'};
        System.out.println(letters);
        letters[3] = 'h';
        System.out.println(letters);


        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String number = "234";
        String text = "some_text";
        int numberNew = Integer.parseInt(number);
        int all = numberNew + text.length();
        System.out.println(all);


        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        byte a = 3;
        byte b = 5;
        System.out.println(Math.pow((a+b),2));
        System.out.println("Скорей всего правильней выбрать int, он чаще используется.\n" +
                "Но если все таки использовать разные типы данных, какие могут быть последствия?");

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] numbers = new int[]{1,2,5,7,10};
        int[] numbers2 = new int[]{2,3,2,17,15};
//        System.out.println(numbers.length);
        int[] numbers3 = new int[5];
        for (int i=0; i<numbers.length; i++) {
            numbers3[i] = numbers[i] * numbers2[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(numbers3));


        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        String helloWorld = "Hello world!";
        String withR = helloWorld.replaceAll("l","r");
        String upper = withR.toUpperCase();
        System.out.println(upper.substring(0,8));

        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //Входящий стринг <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
        //Вернет - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //Входящий - <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>
        //Вернет - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
    }
}

