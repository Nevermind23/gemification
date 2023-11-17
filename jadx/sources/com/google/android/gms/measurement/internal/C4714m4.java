package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4488xb;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
final class C4714m4 implements C4488xb {

    /* renamed from: a */
    final /* synthetic */ String f14611a;

    /* renamed from: b */
    final /* synthetic */ C4725n4 f14612b;

    C4714m4(C4725n4 n4Var, String str) {
        this.f14612b = n4Var;
        this.f14611a = str;
    }

    /* renamed from: a */
    public final String mo13814a(String str) {
        Map map = (Map) this.f14612b.f14662d.get(this.f14611a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
