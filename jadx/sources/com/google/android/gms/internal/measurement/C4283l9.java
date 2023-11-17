package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l9 */
final class C4283l9 implements C4352pa {

    /* renamed from: a */
    private static final C4283l9 f13452a = new C4283l9();

    private C4283l9() {
    }

    /* renamed from: c */
    public static C4283l9 m16225c() {
        return f13452a;
    }

    /* renamed from: a */
    public final C4335oa mo13209a(Class cls) {
        Class<C4351p9> cls2 = C4351p9.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C4335oa) C4351p9.m16434k(cls.asSubclass(cls2)).mo12903z(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo13210b(Class cls) {
        return C4351p9.class.isAssignableFrom(cls);
    }
}
