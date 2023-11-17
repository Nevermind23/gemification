package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.na */
abstract class C4318na {

    /* renamed from: a */
    private static final C4301ma f13549a;

    /* renamed from: b */
    private static final C4301ma f13550b = new C4301ma();

    static {
        C4301ma maVar;
        try {
            maVar = (C4301ma) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            maVar = null;
        }
        f13549a = maVar;
    }

    /* renamed from: a */
    static C4301ma m16352a() {
        return f13549a;
    }

    /* renamed from: b */
    static C4301ma m16353b() {
        return f13550b;
    }
}
