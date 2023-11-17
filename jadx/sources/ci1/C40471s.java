package ci1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ci1.s */
public @interface C40471s {
    boolean encoded() default false;

    String value();
}
