package com.grigorovich.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//тут пишем свою аннотацию
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {
    public String value() default "xyz.com";

    public String message() default "email must ends with xyz.com";

    public Class<?>[] groups() default {}; //это надо для написания собсвенной аннотации
    public Class<? extends Payload> [] payload() default {};

}
