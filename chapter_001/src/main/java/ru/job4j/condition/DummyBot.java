package ru.job4j.condition;

/**
 * @author Vitaly Solonets (solonets.80@mail.ru).
 * @version $1$
 * @since 08.06.2019.
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     *
     * @param question Вопрос от клиента.
     * @return Ответю
     */
    public String answer(String question) {
        String rls = "Это ставит меня в тупик.Задайте другой вопрос.";
        if ("Привет,Бот.".equals(question)) {
            rls = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rls = "До скорой встречи.";
        }
        return rls;
    }
}
