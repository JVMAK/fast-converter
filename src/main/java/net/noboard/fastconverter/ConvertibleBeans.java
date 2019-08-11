package net.noboard.fastconverter;

import net.noboard.fastconverter.parser.ConvertibleBeanParser;
import net.noboard.fastconverter.parser.ImportParser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Convertible
@ImportParser(clazz = ConvertibleBeanParser.class)
public @interface ConvertibleBeans {
    ConvertibleBean[] value();
}
