package opencc;

import java.util.ArrayList;
import java.util.List;

/**
 * OpenCC
 */
public class OpenCC {

	private List<Converter> converterList = new ArrayList<>();
	private boolean isConversionSet;

	public void setConversion(String conversionCode) {
		loadConfig(conversionCode);
		isConversionSet = true;
	}

	public void setConversion(ConversionType conversionType) {
		loadConfig(conversionType);
		isConversionSet = true;
	}

	private void loadConfig(ConversionType conversionType) {
		List<String>[] dictGroup = conversionType.getDictGroup();

		converterList.clear();
		for (List<String> dictNameList : dictGroup) {
			Converter converter = new Converter(dictNameList);
			converterList.add(converter);
		}
	}

	private void loadConfig(String conversionCode) {
		loadConfig(ConversionType.valueOf(conversionCode));
	}

	public String convert(String input) {
		if (!isConversionSet) {
			setConversion("s2t");
		}
		
		StringBuilder stringBuilder = new StringBuilder(input);
		for(Converter converter : converterList) {
			stringBuilder = converter.convert(stringBuilder);
		}
		return stringBuilder.toString();
	}
}