package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xa */
abstract class C4487xa {

    /* renamed from: a */
    private static final C4471wa f13821a;

    /* renamed from: b */
    private static final C4471wa f13822b = new C4471wa();

    static {
        C4471wa waVar;
        try {
            waVar = (C4471wa) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            waVar = null;
        }
        f13821a = waVar;
    }

    /* renamed from: a */
    static C4471wa m17150a() {
        return f13821a;
    }

    /* renamed from: b */
    static C4471wa m17151b() {
        return f13822b;
    }
}
