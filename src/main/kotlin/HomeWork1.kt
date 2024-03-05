//TIP Написать программу, которая обрабатывает введённые пользователем в консоль команды:
//exit
//help
//add <Имя> phone <Номер телефона>
//add <Имя> email <Адрес электронной почты>
//
//После выполнения команды, кроме команды exit, программа ждёт следующую команду.
fun main() {
    var userInput: String = ""

    while (userInput != "exit") {
        println("Введите команду:")
        println("-- help - помощь по программе.")
        println("-- add userName phone numberPhone - добавить пользователю номер телефона.")
        println("-- add userName email emailAddress - добавить пользователю адрес электронной почты.")
        println("-- exit - выход из программы.")
        print(">>: ")
        userInput = readLine().toString();
        when (userInput) {
            "help" -> println(
                "В командах add вместо userName необходимо вводить 1 имя.\n" +
                        "Телефон должен быть в формате: +70000000000, без пробелов и других знаков, кроме ' + '.\n" +
                        "Email должен быть формата userName@example.ru, без пробелов и лишних знаков ' @ ' и ' . '"
            );
            "exit" -> println("Программа закрывается.");
            else -> {
                val parts = userInput.split(" ");
                if (parts.size != 4) {
                    println("Неверная команда!");
                    continue;
                }
                when (parts[2]) {
                    "phone" -> {
                        if (parts[3].contains('+') && parts[3].toCharArray().size == 12)
                            println("К пользователю ${parts[1]} добавлен телефон ${parts[3]}")
                        else println("Ошибка в номере телефона.")
                    }
                    "email" -> {
                        if (parts[3].contains('@') && parts[3].contains('.')) {
                            if (parts[3].split('@', '.').size == 3)
                                println("К пользователю ${parts[1]} добавлен email ${parts[3]}")
                            else
                                println("Ошибка в электронной почте.")
                        }
                    }
                }
            }
        }
    }
}