package generators;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class FioGenerator {

    private String name;

    /**
     * ФИО берутся из соответствующих файлов по индексу в листе:
     * Фамилия - сумма цифр в коде
     * Имя - сумма первых двух цифр
     * Отчество - сумма последних двух цифр.
     *
     * @param code код для генерации
     */
    public final void generateParams(final int code) {
        final int lastNameIndex = getDigitsSum(code);
        final String sex = (lastNameIndex % 2 == 0) ? "f" : "m";
        setnameFromFile(lastNameIndex, getDigitsSum(code / 100), getDigitsSum(code % 100), sex);
    }

    public final String getName() {
        return name;
    }

    private void setnameFromFile(final int i, final int j, final int k, final String sex) {
        name = getLinesFromFile("lastNames_" + sex).get(i)
                + " " + getLinesFromFile("names_" + sex).get(j)
                + " " + getLinesFromFile("middleNames_" + sex).get(k);
    }
}