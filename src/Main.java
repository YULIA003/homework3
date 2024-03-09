public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание.");
        System.out.println("Задача 1.");
        int a = 1234599;
        System.out.println(a);
        System.out.println("Значение переменной a" + " с типом int" + " равно " + a);
        byte me = 1;
        System.out.println(me);
        System.out.println("Значение переменной me" + " с типом byte" + " равно " + me);
        short youCool = 31898;
        System.out.println(youCool);
        System.out.println("Значение переменной youCool" + " с типом short" + " равно " + youCool);
        long money = 912356789;
        System.out.println(money);
        System.out.println("Значение переменной money" + " с типом long" + " равно " + money);
        float home = 7.5443f;
        System.out.println(home);
        System.out.println("Значение переменной home" + " с типом float" + " равно " + home);
        double key = 89.3857357f;
        System.out.println(key);
        System.out.println("Значение переменной key" + " с типом double" + " равно " + key);
        System.out.println("Задача 2.");
        float q = 27.12f;
        System.out.println("Тип переменной для " + q + " - float");
        long w = 987678965549L;
        System.out.println("Тип переменной для " + w + " - long");
        double e = 2.786;
        System.out.println("Тип переменной для " + e + " - double");
        int r = 569;
        System.out.println("Тип переменной для " + r + " - int");
        short t = -159;
        System.out.println("Тип переменной для " + t + " - short");
        int y = 27897;
        System.out.println("Тип переменной для " + y + " - int");
        byte u = 67;
        System.out.println("Тип переменной для " + u + " - byte");
        System.out.println("Задача 3.");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        int totalStudents = teacher1 + teacher2 + teacher3;
        System.out.println("Всего учеников в трех классах - " + totalStudents);
        int paper = 480;
        System.out.println("Всего закуплено бумаги - " + paper + " листов");
        int paperOfPerson = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperOfPerson + " листов бумаги.");
        System.out.println("Задача 4.");
        byte bottlesInTwoMinutes = 16;
        byte time = 2;
        int bottlesInOneMinutes = bottlesInTwoMinutes / time;
        System.out.println("Производительность машины для изготовления бутылок — " + bottlesInOneMinutes + " бутылок за минуту.");

    }
}