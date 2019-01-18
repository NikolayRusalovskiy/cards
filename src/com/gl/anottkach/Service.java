package com.gl.anottkach;

import java.lang.annotation.*;




@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Documented
public @interface Service {
    String name();
    boolean lazyload() default false;
}
