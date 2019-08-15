package ru.job4j.array;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru)
 * @version $1.0$
 * @since 28.06.2019
 *
 * Обертка над строкой
 */

public class ArrayChar {
    /**
     * Проверяет что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинается с префикса.
     */
    public boolean startsWith(String words, String prefix) {

        char[] pref = prefix.toCharArray();
        char[] wrd = words.toCharArray();
        for (int index = 0; index <= pref.length - 1; index++) {
            if (pref[index] != wrd[index]) {
                return false;
            }
        }
        return true;
    }
}
