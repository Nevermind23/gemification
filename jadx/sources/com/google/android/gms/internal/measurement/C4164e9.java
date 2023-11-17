package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.session.C0125b;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e9 */
public final class C4164e9 {

    /* renamed from: b */
    private static volatile C4164e9 f13211b;

    /* renamed from: c */
    static final C4164e9 f13212c = new C4164e9(true);

    /* renamed from: a */
    private final Map f13213a = Collections.emptyMap();

    C4164e9(boolean z) {
    }

    /* renamed from: a */
    public static C4164e9 m15717a() {
        C4164e9 e9Var = f13211b;
        if (e9Var != null) {
            return e9Var;
        }
        synchronized (C4164e9.class) {
            C4164e9 e9Var2 = f13211b;
            if (e9Var2 != null) {
                return e9Var2;
            }
            C4164e9 a = C4266k9.m16201a(C4164e9.class);
            f13211b = a;
            return a;
        }
    }

    /* renamed from: b */
    public final C4317n9 mo13069b(C4386ra raVar, int i) {
        C0125b.m366a(this.f13213a.get(new C4147d9(raVar, i)));
        return null;
    }
}
