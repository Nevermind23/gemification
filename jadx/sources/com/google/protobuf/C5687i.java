package com.google.protobuf;

/* renamed from: com.google.protobuf.i */
abstract class C5687i {

    /* renamed from: a */
    static final Class f17940a = m22761c();

    /* renamed from: a */
    public static C5691j m22759a() {
        C5691j b = m22760b("getEmptyRegistry");
        if (b != null) {
            return b;
        }
        return C5691j.f17946d;
    }

    /* renamed from: b */
    private static final C5691j m22760b(String str) {
        Class cls = f17940a;
        if (cls == null) {
            return null;
        }
        try {
            return (C5691j) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Class m22761c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
