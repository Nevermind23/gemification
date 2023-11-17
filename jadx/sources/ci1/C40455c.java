package ci1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ci1.c */
public @interface C40455c {
    boolean encoded() default false;

    String value();
}
