package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test.
*
*@author Vitaly Solonets (solonets.80@mail.ru)
*@version $1.0$
*since 01.06.2019
*/

public class CalculateTest {
/**
*Test echo.
*/

@Test
 public void whenTakeNameThenThreeEchoPlusName() {
	 String input = "Solonets Vitaly";
	 String expect = "Echo, echo, echo :Solonets Vitaly";
	 Calculate calc = new Calculate();
	 String result = calc.echo(input);
	 assertThat(result, is(expect));
 }
	 
}