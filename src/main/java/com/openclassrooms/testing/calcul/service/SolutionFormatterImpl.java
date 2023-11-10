package com.openclassrooms.testing.calcul.service;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.inject.Named;

@Named
public class SolutionFormatterImpl implements SolutionFormatter {

	@Override
	public String format(int solution) {
		DecimalFormatSymbols fmt = DecimalFormatSymbols.getInstance(Locale.FRENCH);
		fmt.setGroupingSeparator(' '); 		
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setDecimalFormatSymbols(fmt);		
		return decimalFormat.format(solution);
	}
}
