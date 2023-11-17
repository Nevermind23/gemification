package com.facetec.sdk;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.facetec.sdk.el */
public @interface C3010el {
    /* renamed from: c */
    boolean mo9194c() default true;

    /* renamed from: d */
    boolean mo9195d() default true;
}
