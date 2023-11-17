package com.google.protobuf;

/* renamed from: com.google.protobuf.o0 */
abstract class C5706o0 {

    /* renamed from: a */
    private static final C5698m0 f18047a = m22927c();

    /* renamed from: b */
    private static final C5698m0 f18048b = new C5702n0();

    /* renamed from: a */
    static C5698m0 m22925a() {
        return f18047a;
    }

    /* renamed from: b */
    static C5698m0 m22926b() {
        return f18048b;
    }

    /* renamed from: c */
    private static C5698m0 m22927c() {
        try {
            return (C5698m0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
