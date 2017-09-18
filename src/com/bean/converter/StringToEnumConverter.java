package com.bean.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/**
 * Created on 2017/9/15.
 *
 * 使用spring提供的ConverterFactory类构造公共转换方法
 */
public class StringToEnumConverter implements ConverterFactory<String,Enum> {

    @Override
    public <T extends Enum> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToConverter<T>(targetType);
    }

    private class StringToConverter<T extends Enum> implements  Converter<String,T>{

        public Class<T> enumType;

        public StringToConverter(Class<T> enumType){
            this.enumType=enumType;
        }

        @Override
        public T convert(String source) {
            return (T) Enum.valueOf(this.enumType,source.trim());
        }
    }

    public static void main(String[] args) {
        StringToEnumConverter stringToEnumConverter=new StringToEnumConverter();
        TestEnum testEnum=stringToEnumConverter.getConverter(TestEnum.class).convert("Java");
    }
}
