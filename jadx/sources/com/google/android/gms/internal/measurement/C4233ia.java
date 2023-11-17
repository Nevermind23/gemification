package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ia */
final class C4233ia implements C4352pa {

    /* renamed from: a */
    private final C4352pa[] f13334a;

    C4233ia(C4352pa... paVarArr) {
        this.f13334a = paVarArr;
    }

    /* renamed from: a */
    public final C4335oa mo13209a(Class cls) {
        C4352pa[] paVarArr = this.f13334a;
        for (int i = 0; i < 2; i++) {
            C4352pa paVar = paVarArr[i];
            if (paVar.mo13210b(cls)) {
                return paVar.mo13209a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo13210b(Class cls) {
        C4352pa[] paVarArr = this.f13334a;
        for (int i = 0; i < 2; i++) {
            if (paVarArr[i].mo13210b(cls)) {
                return true;
            }
        }
        return false;
    }
}
