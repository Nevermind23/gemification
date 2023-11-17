package cf1;

import java.nio.charset.Charset;
import kotlin.jvm.internal.C41536l;

/* renamed from: cf1.d */
public final class C40407d {

    /* renamed from: a */
    public static final C40407d f95988a = new C40407d();

    /* renamed from: b */
    public static final Charset f95989b;

    /* renamed from: c */
    public static final Charset f95990c;

    /* renamed from: d */
    public static final Charset f95991d;

    /* renamed from: e */
    public static final Charset f95992e;

    /* renamed from: f */
    public static final Charset f95993f;

    /* renamed from: g */
    public static final Charset f95994g;

    /* renamed from: h */
    private static volatile Charset f95995h;

    /* renamed from: i */
    private static volatile Charset f95996i;

    static {
        Charset forName = Charset.forName("UTF-8");
        C41536l.m120488h(forName, "forName(\"UTF-8\")");
        f95989b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C41536l.m120488h(forName2, "forName(\"UTF-16\")");
        f95990c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C41536l.m120488h(forName3, "forName(\"UTF-16BE\")");
        f95991d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C41536l.m120488h(forName4, "forName(\"UTF-16LE\")");
        f95992e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C41536l.m120488h(forName5, "forName(\"US-ASCII\")");
        f95993f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C41536l.m120488h(forName6, "forName(\"ISO-8859-1\")");
        f95994g = forName6;
    }

    private C40407d() {
    }

    /* renamed from: a */
    public final Charset mo94457a() {
        Charset charset = f95996i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C41536l.m120488h(forName, "forName(\"UTF-32BE\")");
        f95996i = forName;
        return forName;
    }

    /* renamed from: b */
    public final Charset mo94458b() {
        Charset charset = f95995h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C41536l.m120488h(forName, "forName(\"UTF-32LE\")");
        f95995h = forName;
        return forName;
    }
}
