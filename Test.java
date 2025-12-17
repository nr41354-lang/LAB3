package hotel;

public class Test {
    public static void main(String[] args){
        // создаем гостинницу
        Hotel hot = new Hotel(15);
        // заселяем человека в номер
        hot.check("Ann", 5);
        hot.svobRooms();
        System.out.println();
        // заселяем в первый свободный номер
        hot.checkFirst("Vlad");
        hot.svobRooms();
        System.out.println();
        // заселение группы людей

        String[] group = {"Alice", "Jon", "German"};
        hot.checkGroup(group);
        hot.svobRooms();
        System.out.println();
        // заселение группы, начиная с заданного номера

        String[] group2 ={"Goga", "Max", "Liza", "Sergey"};
        hot.checkGroupFr(group2, 7);
        hot.svobRooms();
        System.out.println();
        // выселение человека

        hot.out(1);
        hot.svobRooms();
        System.out.println();
        // заселение семьи

        String[] family= {"Lev","Igor", "Egor"};
        hot.checkFamily(family);
        hot.svobRooms();
        System.out.println();
        // выселение человека с семьей

        hot.outFamily("Lev");
        hot.svobRooms();
        System.out.println();
        // заселение человека с животным

        hot.checkPet("Oleg", 4);
        hot.svobRooms();
        System.out.println();
        // заселение группы с животным
        String[]  grouppet={"Lika", "Alla", "Alena", "Vika"};
        hot.checkGroupPet(grouppet);
        hot.svobRooms();
        System.out.println();
        // заселение семьи с животным
        String[] familypet={"Inessa", "Katya", "Danya"};
        hot.checkFamilyPet(familypet);
        hot.svobRooms();
        System.out.println();
    }
}
