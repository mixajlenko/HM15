package org.hillel.home_work15;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(value=RUNTIME)
@Target(value={CONSTRUCTOR, LOCAL_VARIABLE, METHOD, FIELD, TYPE})
 public @interface Analyzable{
    String value();
}

