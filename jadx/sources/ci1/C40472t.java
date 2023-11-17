package ci1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ci1.t */
public @interface C40472t {
    boolean encoded() default false;

    String value();
}
