package ci1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ci1.q */
public @interface C40469q {
    String encoding() default "binary";

    String value() default "";
}
