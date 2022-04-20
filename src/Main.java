public class Main {
    public static void main(String[] args) {
        //Задание1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Фамилия Имя Отчество";
        fullName = lastName +" "+ firstName +" "+ middleName;
        System.out.println("fullName = " + fullName);

        //Задание2
        String fullName1 = "Фамилия Имя Отчество";
        fullName1 = lastName +" "+ firstName +" "+ middleName;
        String fullName2 = fullName1.toUpperCase();
        System.out.println("fullName2 = " + fullName2);

        //Задание3
        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё","е");
        System.out.println("fullName3 = " + fullName3);


    }
}