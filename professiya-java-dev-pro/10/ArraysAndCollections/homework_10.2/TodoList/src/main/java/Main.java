import java.util.Scanner;

public class Main {
    private static final TodoList todoList = new TodoList();

    // TODO: написать консольное приложение для работы со списком дел todoList
                                                                                            //Цвета для шрифта в console
    static String ANSI_RESET = "\u001B[0m";
    static String ANSI_RED = "\u001B[31m";
    static String ANSI_GREEN = "\u001B[32m";
    static String ANSI_PURPLE = "\u001B[35m";

    private static String result;
    private static String[] input;

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nКоманды которые Вы можете использовать: " + ANSI_GREEN + "LIST, ADD, EDIT, "
                    + ANSI_RED + "DELETE(DEL)." + ANSI_RESET);
            System.out.print(ANSI_GREEN + "Введите команду: " + ANSI_RESET);

            input = scanner.nextLine().split("\\s+");

            StringBuilder builder = new StringBuilder();
            for (int i = 2; i < input.length; i++) {
                builder.append(input[i]).append(" ");
            }
            result = builder.toString();

            switch (input[0].toUpperCase()) {
                case "LIST":
                    viewToDoList();
                    break;
                case "ADD":
                    addToDoList();
                    break;
                case "EDIT":
                    editToDoList();
                    break;
                case "DEL":
                case "DELETE":
                    delToDoList();
                    break;
                default:
                    if (!input[0].isEmpty()) {                                                     //Проверка на пустоту
                        System.out.println(ANSI_RED + "\n\tТакой команды нет" + ANSI_RESET);
                    } else System.out.println(ANSI_RED + "\n\tВы ничего не ввели!" + ANSI_RESET);
            }
        }
    }

    private static void viewToDoList() {
        if (todoList.getTodos().isEmpty()) {
            System.out.println(ANSI_RED + "\n\tСписок дел пуст!" + ANSI_RESET);
        } else {
            System.out.println("\nСписок дел:");
            for (int j = 0; j < todoList.getTodos().size(); j++) {
                System.out.println("\tДело №:" + (j + 1) + " - " + todoList.getTodos().get(j));
            }
        }
    }

    private static void addToDoList() {
        if (input.length == 1) {
            Scanner scan1 = new Scanner(System.in);
            System.out.print("\tВведите " + ANSI_PURPLE + "описание" + ANSI_RESET + " дела: ");
            String text1 = scan1.nextLine();
            if (!text1.isEmpty()) {                                                                 //Проверка на пустоту
                todoList.add(text1);
                System.out.println("\n\t\tДело №:" + (todoList.getTodos().size()) + " Текст: " + ANSI_RED + text1 + ANSI_RESET + " - ДОБАВЛЕНО!");
            } else {
                System.out.println(ANSI_RED + "\n\tВы ничего не ввели!" + ANSI_RESET);
            }
        } else {
            if (input.length == 2) {
                Scanner scan2 = new Scanner(System.in);
                System.out.print("\tДобавьте " + ANSI_PURPLE + "описание" + ANSI_RESET + " дела: ");
                String text2 = scan2.nextLine();
                if (!text2.isEmpty()) {
                    if (input.length == 2 && Integer.parseInt(input[1]) <= todoList.getTodos().size()) {
                        System.out.println("\n\t\tДело №:" + input[1] + " Текст: " + ANSI_RED + text2 + ANSI_RESET + " - ДОБАВЛЕНО!" + ANSI_RESET);
                        todoList.add(Integer.parseInt(input[1]) - 1, text2);
                    } else {
                        System.out.println("\n\tТакого № в списке дел нет, оно добавлено в конец списка!");
                        todoList.add(Integer.parseInt(input[1]) - 1, text2);
                        System.out.print("\n\t\tВаше дело №:" + todoList.getTodos().size() + " Текст: " + ANSI_RED + text2 + ANSI_RESET + " - ДОБАВЛЕНО!" + ANSI_RESET);
                    }
                } else {
                    System.out.println(ANSI_RED + "\n\tВы ничего не ввели!" + ANSI_RESET);
                }
            } else {
                if (input.length >= 3 && !result.isEmpty()) {
                    if (Integer.parseInt(input[1]) <= todoList.getTodos().size()) {
                        System.out.print("\t\tДело №:" + input[1] + " Текст: " + ANSI_RED + result + ANSI_RESET + " - ДОБАВЛЕНО!");
                        todoList.add(Integer.parseInt(input[1]) - 1, result);
                    } else {
                        System.out.println("\n\tТакого № в списке дел нет, оно добавлено в конец списка!");
                        todoList.add(Integer.parseInt(input[1]) - 1, result);
                        System.out.print("\n\t\tВаше дело №:" + todoList.getTodos().size() + " Текст: " + ANSI_RED + result + ANSI_RESET + " - ДОБАВЛЕНО!" + ANSI_RESET);
                    }
                } else {
                    System.out.println(ANSI_RED + "\n\tВы ничего не ввели!" + ANSI_RESET);
                }
            }
        }
    }

    private static void editToDoList() {
        viewToDoList();
        if (input.length == 1 && !todoList.getTodos().isEmpty()) {
            Scanner scan1 = new Scanner(System.in);
            System.out.print("\n\tНомер какого дела Вы хотите изменить: ");
            String number = scan1.nextLine();
            if (!number.isEmpty()) {                                                                 //Проверка на пустоту
                if (Integer.parseInt(number) <= todoList.getTodos().size()) {
                    Scanner scanText = new Scanner(System.in);
                    System.out.print("\n\tИзмените описание дела: ");
                    String text = scanText.nextLine();
                    System.out.print("\n\t\tДело №:" + Integer.parseInt(number) + " Текст: "
                            + todoList.getTodos().get(Integer.parseInt(number) - 1));
                    todoList.edit(text, Integer.parseInt(number) - 1);
                    System.out.println(ANSI_RED + " - ИЗМЕНЕНО " + ANSI_RESET + "на: " + ANSI_RED + text + ANSI_RESET);
                    viewToDoList();
                } else {
                    System.out.println(ANSI_RED + "\n\tДело №:" + number + " в списке нет!" + ANSI_RESET);
                }
            } else {
                System.out.println(ANSI_RED + "\n\tВы ничего не ввели!" + ANSI_RESET);
            }
        } else {
            if (input.length == 2 && !todoList.getTodos().isEmpty()) {
                if (Integer.parseInt(input[1]) <= todoList.getTodos().size()) {
                    viewToDoList();
                    Scanner scanText2 = new Scanner(System.in);
                    System.out.print("\n\tИзмените описание дела: ");
                    String text2 = scanText2.nextLine();
                    System.out.print("\n\t\tДело №:" + Integer.parseInt(input[1]) + " Текст: "
                            + todoList.getTodos().get(Integer.parseInt(input[1]) - 1));
                    todoList.edit(text2, Integer.parseInt(input[1]) - 1);
                    System.out.println(ANSI_RED + " - ИЗМЕНЕНО " + ANSI_RESET + "на: " + ANSI_RED + text2 + ANSI_RESET);
                    viewToDoList();
                } else {
                    System.out.println(ANSI_RED + "\n\tДело №:" + input[1] + " в списке нет!" + ANSI_RESET);
                }
            } else {
                if (input.length >= 3 && !result.isEmpty() && !todoList.getTodos().isEmpty()) {
                    if (Integer.parseInt(input[1]) <= todoList.getTodos().size()) {
                        System.out.print("\n\t\tДело №:" + Integer.parseInt(input[1]) + " Текст: "
                                + todoList.getTodos().get(Integer.parseInt(input[1]) - 1));
                        todoList.edit(result, Integer.parseInt(input[1]) - 1);
                        System.out.println(ANSI_RED + " - ИЗМЕНЕНО " + ANSI_RESET + "на: " + ANSI_RED + result + ANSI_RESET);
                        viewToDoList();
                    } else {
                        System.out.println(ANSI_RED + "\n\tДело №:" + input[1] + " в списке нет!" + ANSI_RESET);
                    }
                } else {
                    if (!todoList.getTodos().isEmpty()) {
                        System.out.println(ANSI_RED + "\n\tВы не ввели описание!" + ANSI_RESET);
                    }
                }
            }
        }
    }

    private static void delToDoList() {
        if (todoList.getTodos().isEmpty()) {
            viewToDoList();
            System.out.println(ANSI_RED + "\tУдалять нечего!" + ANSI_RESET);
        } else {
            if (input.length == 1) {
                viewToDoList();
                Scanner scan2 = new Scanner(System.in);
                System.out.print("\n\tНомер какого дела Вы хотите" + ANSI_RED + " УДАЛИТЬ?: " + ANSI_RESET);
                String number2 = scan2.nextLine();
                if (!number2.isEmpty()) {                                                                 //Проверка на пустоту
                    if (Integer.parseInt(number2) <= todoList.getTodos().size()) {
                        System.out.println("\n\t\tДело №:" + Integer.parseInt(number2) + " Текст: "
                                + todoList.getTodos().get(Integer.parseInt(number2) - 1) + ANSI_RED + " - УДАЛЕНО!" + ANSI_RESET);
                        todoList.delete(Integer.parseInt(number2) - 1);
                        viewToDoList();
                    } else {
                        System.out.println(ANSI_RED + "\n\tДело №:" + number2 + " в списке нет!" + ANSI_RESET);
                    }
                } else {
                    System.out.println(ANSI_RED + "\n\tВы ничего не ввели!" + ANSI_RESET);
                }
            } else {
                if (input.length == 2) {
                    if (Integer.parseInt(input[1]) <= todoList.getTodos().size()) {
                        viewToDoList();
                        System.out.println("\n\t\tДело №:" + Integer.parseInt(input[1]) + " Текст: "
                                + todoList.getTodos().get(Integer.parseInt(input[1]) - 1) + ANSI_RED + " - УДАЛЕНО!" + ANSI_RESET);
                        todoList.delete(Integer.parseInt(input[1]) - 1);
                        viewToDoList();
                    } else {
                        System.out.println(ANSI_RED + "\n\tДело №:" + input[1] + " в списке нет!" + ANSI_RESET);
                    }
                }
            }
        }
    }
}