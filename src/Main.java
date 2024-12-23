//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static char[] replaceAll(char[] original, char[] oldStr, char[] newStr) {
        // Создаем новый массив для результата
        char[] result = new char[original.length];
        int i = 0; // Индекс для массива original
        int k = 0; // Индекс для результирующего массива

        // Проходим по массиву original
        while (i < original.length) {
            boolean match = true;
            int j = 0;

            // Проверяем, совпадает ли подстрока oldStr с текущей позицией
            while (j < oldStr.length && (i + j) < original.length) {
                if (original[i + j] != oldStr[j]) {
                    match = false;
                    break;
                }
                j++;
            }

            if (match) {
                // Копируем newStr в результирующий массив
                int n = 0;
                while (n < newStr.length) {
                    result[k++] = newStr[n++];
                }
                i += oldStr.length; // Пропускаем замененную часть
            } else {
                // Копируем текущий символ, если совпадения нет
                result[k++] = original[i++];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        char[] original = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        char[] oldStr = {'o'}; // Что заменяем
        char[] newStr = {'a'}; // На что заменяем

        char[] result = replaceAll(original, oldStr, newStr);

        System.out.println("Результат замены:");
        int i = 0;
        while (i < result.length) {
            System.out.print(result[i++]);
        }
    }

    //реализовать этот метод используя ( либо while ) (либо   do while)
}