package com.google.protobuf;

/* renamed from: com.google.protobuf.d */
abstract class C5640d {

    /* renamed from: a */
    private static boolean f17845a;

    /* renamed from: b */
    private static final Class f17846b = m22491a("libcore.io.Memory");

    /* renamed from: c */
    private static final boolean f17847c;

    static {
        boolean z;
        if (f17845a || m22491a("org.robolectric.Robolectric") == null) {
            z = false;
        } else {
            z = true;
        }
        f17847c = z;
    }

    /* renamed from: a */
    private static Class m22491a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static Class m22492b() {
        return f17846b;
    }

    /* renamed from: c */
    static boolean m22493c() {
        return f17845a || (f17846b != null && !f17847c);
    }
}
