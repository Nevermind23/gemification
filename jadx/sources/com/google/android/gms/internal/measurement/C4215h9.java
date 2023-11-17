package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h9 */
abstract class C4215h9 {

    /* renamed from: a */
    private static final C4181f9 f13278a = new C4198g9();

    /* renamed from: b */
    private static final C4181f9 f13279b;

    static {
        C4181f9 f9Var;
        try {
            f9Var = (C4181f9) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            f9Var = null;
        }
        f13279b = f9Var;
    }

    /* renamed from: a */
    static C4181f9 m15998a() {
        C4181f9 f9Var = f13279b;
        if (f9Var != null) {
            return f9Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C4181f9 m15999b() {
        return f13278a;
    }
}
