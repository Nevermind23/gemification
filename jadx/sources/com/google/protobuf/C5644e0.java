package com.google.protobuf;

/* renamed from: com.google.protobuf.e0 */
abstract class C5644e0 {

    /* renamed from: a */
    private static final C5638c0 f17848a = m22519c();

    /* renamed from: b */
    private static final C5638c0 f17849b = new C5641d0();

    /* renamed from: a */
    static C5638c0 m22517a() {
        return f17848a;
    }

    /* renamed from: b */
    static C5638c0 m22518b() {
        return f17849b;
    }

    /* renamed from: c */
    private static C5638c0 m22519c() {
        try {
            return (C5638c0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
