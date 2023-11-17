package ci1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ci1.h */
public @interface C40460h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
