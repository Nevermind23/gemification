package com.facetec.sdk;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.facetec.sdk.em */
public @interface C3011em {
    /* renamed from: a */
    String[] mo9196a() default {};

    /* renamed from: c */
    String mo9197c();
}
