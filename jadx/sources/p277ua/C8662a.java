package p277ua;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ua.a */
public @interface C8662a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
