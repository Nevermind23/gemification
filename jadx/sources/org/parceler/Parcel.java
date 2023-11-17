package org.parceler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Parcel {

    /* renamed from: org.parceler.Parcel$a */
    public enum C42026a {
        FIELD,
        BEAN,
        VALUE
    }
}
