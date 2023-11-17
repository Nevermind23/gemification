package p276u9;

/* renamed from: u9.d */
public @interface C8653d {

    /* renamed from: u9.d$a */
    public enum C8654a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    C8654a intEncoding() default C8654a.DEFAULT;

    int tag();
}
