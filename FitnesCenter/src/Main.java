import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        System.out.println("добро  пожаловать в 1Fit center");
        chooseUsers();
    }

    public static String chooseUsers() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите вашу специальность :");
        System.out.println("(1) директор");
        System.out.println("(2) работник");
        System.out.println("(3) менеджер");
        System.out.println("(4) посетител");
        do {
            System.out.print("Ваш выбор: ");
            String choose = sc.nextLine();
            switch (choose) {
                case "director":
                case "Director":
                case "1":
                    System.out.println("Добро пожаловать директор");
                    System.out.println("Введите логин и пароль");
                    directorInputLgPw();
                    break;
                case "worker":
                case "Worker":
                case "2":
                    System.out.println("Добро пожаловать работник");
                    System.out.println("Введите логин и пароль");
                    workerInputLgPw();
                    break;
                case "manager":
                case "Manager":
                case "3":
                    System.out.println("Добро пожаловать менеджер");
                    System.out.println("Введите логин и пароль");
                    managerInputLgPw();
                    break;
                case "visitor":
                case "Visitor":
                case "4":
                    System.out.println("Добро пожаловать посетител");
                    System.out.println("Введите логин и пароль");
                    visitorInputLgPw();
                    break;
                default:
                    System.out.println("Кто ты воин?");
                    System.out.print("Желаете выйти[1] или повторить[0]? ");
                    int ex = sc.nextInt();
                    if (ex == 0) {
                        chooseUsers();
                    } else if (ex == 1) {
                        System.exit(0);
                    }
            }
            break;
        } while (true);
        return "";
    }


    public static void directorInputLgPw() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("director");
        loginArrayList.add("worker");
        loginArrayList.add("manager");
        loginArrayList.add("visitor");
        passwordArrayList.add("director1");
        passwordArrayList.add("worker1");
        passwordArrayList.add("manager1");
        passwordArrayList.add("visitor1");
        loginArrayList.add("dir");
        passwordArrayList.add("dir1");
        loginArrayList.add("wor");
        passwordArrayList.add("wor1");

        do {
            System.out.print("Введите логин: ");
            String input_login = sc.next();
            sc.nextLine();
            System.out.print("Введите пароль: ");
            String input_password = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_login.equals(loginArrayList.get(indexArray)) &&
                        input_password.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Директор, вы успешно вошли!");
                directorActions();
                break;
            } else {
                System.out.println("Попытайтесь снова");
            }
        } while (true);
    }

    public static void workerInputLgPw() throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("Wor");
        passwordArrayList.add("Wor1");

        do {
            System.out.print("Введите логин: ");
            String input_login = sc.next();
            sc.nextLine();
            System.out.print("Введите пароль: ");
            String input_password = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_login.equals(loginArrayList.get(indexArray)) &&
                        input_password.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Работник,вы успешно вошли!");
//                Menu();
                break;
            } else {
                System.out.println("Попытайтесь снова");
            }
        } while (true);
    }

    public static void managerInputLgPw() throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("manager");

        passwordArrayList.add("manager1");

        do {
            System.out.print("Введите логин: ");
            String input_login = sc.next();
            sc.nextLine();
            System.out.print("Введите пароль: ");
            String input_password = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_login.equals(loginArrayList.get(indexArray)) &&
                        input_password.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Приветствую дорогой менеджер");
//                managerActions();
                break;
            } else {
                System.out.println("Попытайтесь снова.");
            }
        } while (true);
    }

    public static void visitorInputLgPw() throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("visitor");
        passwordArrayList.add("visitor1");

        do {
            System.out.print("Введите логин: ");
            String input_login = sc.next();
            sc.nextLine();
            System.out.print("Введите пароль: ");
            String input_password = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_login.equals(loginArrayList.get(indexArray)) &&
                        input_password.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("посетитель ,вы успешно вошли!");
//                Menu();
                break;
            } else {
                System.out.println("Попытайтесь снова");
            }
        } while (true);
    }

    public static void directorActions() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Меню:");
        System.out.println("(1)Показать список все");
        System.out.println("(2)Показать количество абонемента");
        System.out.println("(3)Максимальное цена на абонемент");
        System.out.println("(4)Минимальное цена на абонемент");
        System.out.println("(5)Отчет по закупкам абонемента");
        System.out.println("(0)Выход");
        do {
            System.out.print("Ваш выбор: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction) {
                case "action1":
                case "Action1":
                case "1":
                    System.out.println("Действие 1");
//                    action1();
                    directorActions();
                    break;
                case "action2":
                case "Action2":
                case "2":
                    System.out.println("Действие 2");
//                    action2();
                    directorActions();
                    break;
                case "action3":
                case "Action3":
                case "3":
                    System.out.println("Действие 3");
//                    action3();
                    directorActions();
                    break;
                case "action4":
                case "Action4":
                case "4":
                    System.out.println("Действие 4");
//                    action4();
                    directorActions();
                    break;
                case "action5":
                case "Action5":
                case "5":
                    System.out.println("Действие 5");
//                    action5();
                    directorActions();
                    break;
                default:
                    System.out.println("Такого действия нет в программе!");
                    directorActions();
                    break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "action0":
                case "Action0":
                case "0":
                    System.out.println("Выход");
                    break;
            }
            break;
        } while (true);
    }
}
