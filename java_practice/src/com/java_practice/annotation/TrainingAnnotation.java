package com.java_practice.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR}) // If we need only one target then we can provide like @Target(ElementType.METHOD, ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.SOURCE) //if we don't define retention then the java consider this as a CLASS.
public @interface TrainingAnnotation {
	int id();
	String desc();
}
