package com.wesley.bean.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
public @interface Hints {
    Hint [] value();
}