package g91;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: g91.h0 */
public final class C32308h0 {

    /* renamed from: a */
    public static final C32308h0 f79724a = new C32308h0();

    /* renamed from: b */
    private static ArrayList f79725b = new ArrayList();

    private C32308h0() {
    }

    /* renamed from: a */
    public static final void m95236a() {
        m95238c();
    }

    /* renamed from: b */
    public static final List m95237b() {
        return f79725b;
    }

    /* renamed from: c */
    public static final void m95238c() {
        f79725b = new ArrayList();
    }

    /* renamed from: d */
    public static final void m95239d(List list) {
        C41536l.m120489i(list, "data");
        f79725b.clear();
        f79725b.addAll(list);
    }
}
