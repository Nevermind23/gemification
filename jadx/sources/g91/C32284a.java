package g91;

import kotlin.jvm.internal.C41536l;

/* renamed from: g91.a */
public final class C32284a {

    /* renamed from: a */
    public static final C32284a f79683a = new C32284a();

    /* renamed from: b */
    private static boolean f79684b;

    /* renamed from: c */
    private static C32288b f79685c = C32288b.None;

    /* renamed from: d */
    private static Class f79686d;

    private C32284a() {
    }

    /* renamed from: a */
    public final Class mo72804a() {
        return f79686d;
    }

    /* renamed from: b */
    public final C32288b mo72805b() {
        return f79685c;
    }

    /* renamed from: c */
    public final boolean mo72806c() {
        return f79684b;
    }

    /* renamed from: d */
    public final void mo72807d(Class cls, C32288b bVar) {
        C41536l.m120489i(cls, "activity");
        C41536l.m120489i(bVar, "param");
        f79684b = true;
        f79686d = cls;
        f79685c = bVar;
    }

    /* renamed from: e */
    public final void mo72808e() {
        f79684b = false;
        f79686d = null;
        f79685c = C32288b.None;
    }
}
