package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.medallia.digital.mobilesdk.p1 */
class C11046p1 extends C11034o5<String> {
    protected C11046p1(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: r */
    private String m40492r() {
        C11089s6 i = this.f31722g.mo28998i();
        if (i == null) {
            C10735b4.m39111c("Storage is null");
            return null;
        }
        C11089s6.C11090a aVar = C11089s6.C11090a.DEVICE_ID;
        String a = i.mo28975a(aVar, (String) null);
        if (a != null) {
            return a;
        }
        String uuid = UUID.randomUUID().toString();
        i.mo28984b(aVar, uuid);
        return uuid;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32210r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public String mo28122j() {
        String r = m40492r();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Device id : %s", new Object[]{r}));
        return r;
    }
}
