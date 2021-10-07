package com.grigorovich.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> { //джененрики сама аннотация, типа данных к которому мы будем применять аннотацию
    private String endOfEmails;
    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmails = checkEmail.value(); //получаем конец эмейла
    }
    //enteredValue тот эмейл  что пользователь вносит
    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfEmails);
    }
}
