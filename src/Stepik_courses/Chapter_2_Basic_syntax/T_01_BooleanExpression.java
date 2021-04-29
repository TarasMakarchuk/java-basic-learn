package Stepik_courses.Chapter_2_Basic_syntax;

/**
 * Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
 * Во всех остальных случаях метод должен возвращать false.
 * <p>
 * Воспользуйтесь шаблоном кода, который предлагает система. Ввод-вывод будет сделан за вас.
 * Вам надо только проанализировать переданные в метод booleanExpression значения (a, b, c, d) и вернуть результат.
 * Попробуйте составить формулу с  использованием булевых операторов.
 * Если не получается, вернитесь к этому заданию после просмотра степов про условные операторы и циклы.
 * <p>
 * При записи сложных выражений рекомендуется использовать скобки, чтобы не запутаться в порядке применения операторов.
 * <p>
 * В качестве примера уже указано заведомо некорректное решение задачи. Исправьте его.
 * <p>
 * Совет тем, у кого не проходит какой-то из тестов.
 * В данной задаче возможно всего 16 комбинаций значений входных параметров.
 * Их можно выписать на бумажку, посчитать для них правильные ответы и сравнить с тем, что выдает ваше решение.
 * Попробуйте самостоятельно проделать это, найти ошибку и исправить решение.
 */


public class T_01_BooleanExpression {
    public static void main(String[] args) {
        System.out.println(compare(true, true, false, false));
    }

    public static boolean compare(boolean a, boolean b, boolean c, boolean d) {

        if (a & b & c & d) {
            return false;
        }
        if ((a & b & c) | (b & c & d) | (a & c & d)) {
            return false;
        }

        return (a & b) | (a & c) | (a & d) | (b & c) | (b & d) | (c & d);
    }
}

