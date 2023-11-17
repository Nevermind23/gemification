package com.facetec.sdk;

/* renamed from: com.facetec.sdk.mz */
final class C3447mz {

    /* renamed from: c */
    private static C3459na f11292c;

    /* renamed from: e */
    private static long f11293e;

    private C3447mz() {
    }

    /* renamed from: a */
    static C3459na m13830a() {
        synchronized (C3447mz.class) {
            C3459na naVar = f11292c;
            if (naVar == null) {
                return new C3459na();
            }
            f11292c = naVar.f11311j;
            naVar.f11311j = null;
            f11293e -= 8192;
            return naVar;
        }
    }

    /* renamed from: b */
    static void m13831b(C3459na naVar) {
        if (naVar.f11311j != null || naVar.f11310h != null) {
            throw new IllegalArgumentException();
        } else if (!naVar.f11306b) {
            synchronized (C3447mz.class) {
                long j = f11293e;
                if (j + 8192 <= 65536) {
                    f11293e = j + 8192;
                    naVar.f11311j = f11292c;
                    naVar.f11307c = 0;
                    naVar.f11309e = 0;
                    f11292c = naVar;
                }
            }
        }
    }
}
