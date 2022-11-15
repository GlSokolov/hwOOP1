public class Main {
    public static void space() {
        System.out.println("____________________________________________________________________________");
    }
    public static void main(String[] args) {
        //_______________________ Задание 1,2 (class Person) ____________________
        Person dude1 = new Person();
        Person dude2 = new Person();
        Person dude3 = new Person();
        Person dude4 = new Person();

        dude1.name = "Максим";
        dude1.town = "Минск";
        dude1.yearOfBirth = 1988;
        dude1.jobTitle = "бренд-менеджер";

        dude2.name = "Аня";
        dude2.town = "Москва";
        dude2.yearOfBirth = 1993;
        dude2.jobTitle = "методист";

        dude3.name = "Катя";
        dude3.town = "Калининград";
        dude3.yearOfBirth = 1992;
        dude3.jobTitle = "продакт-менеджер";

        dude4.name = "Артем";
        dude4.town = "Москва";
        dude4.yearOfBirth = 1995;
        dude4.jobTitle = "директор";

        System.out.println("Привет! Меня зовут "+dude1.name+". Я из города "+dude1.town+". Я родился в "+dude1.yearOfBirth+" году. Я работаю на должности "+dude1.jobTitle+". Будем знакомы!");
        System.out.println("Привет! Меня зовут "+dude2.name+". Я из города "+dude2.town+". Я родился в "+dude2.yearOfBirth+" году. Я работаю на должности "+dude2.jobTitle+". Будем знакомы!");
        System.out.println("Привет! Меня зовут "+dude3.name+". Я из города "+dude3.town+". Я родился в "+dude3.yearOfBirth+" году. Я работаю на должности "+dude3.jobTitle+". Будем знакомы!");
        System.out.println("Привет! Меня зовут "+dude4.name+". Я из города "+dude4.town+". Я родился в "+dude4.yearOfBirth+" году. Я работаю на должности "+dude4.jobTitle+". Будем знакомы!");
        space();
    //________________________ Новый проект типа. Задание 3 (class Auto) ________________________
        Auto zalupaNerealnaya = new Auto("Lada (очко)", "Granta (санкционочка)", 1.7, "желтый", 2022, "Россия");
        Auto audiA8 = new Auto("Audi", "A8 50L TDI quattro", 3.0, "черный", 2020, "Германия");
        Auto bmwZ8 = new Auto(" ", "Z8", 3.0, "черный", 0, "Германия");
        Auto kiaSportage = new Auto("KIA", "Sportage 4", 2.4, "красный", 2018, "Южная Корея");
        Auto hyundaiAvante = new Auto("Hyundai", "Avante", 1.6, "оранджевый", 2016, "Южная Корея");

        System.out.println(zalupaNerealnaya);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}