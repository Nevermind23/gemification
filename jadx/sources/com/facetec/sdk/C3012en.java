package com.facetec.sdk;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.facetec.sdk.en */
public @interface C3012en {
    /* renamed from: a */
    boolean mo9198a() default true;

    /* renamed from: d */
    Class<?> mo9199d();
}
