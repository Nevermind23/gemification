package com.facetec.sdk;

import java.util.Map;
import java.util.Set;

/* renamed from: com.facetec.sdk.ed */
public final class C2999ed extends C3000ee {

    /* renamed from: d */
    private final C3040ex<String, C3000ee> f10130d = new C3040ex<>();

    /* renamed from: c */
    public final void mo9173c(String str, C3000ee eeVar) {
        C3040ex<String, C3000ee> exVar = this.f10130d;
        if (eeVar == null) {
            eeVar = C2996ea.f10129b;
        }
        exVar.put(str, eeVar);
    }

    /* renamed from: e */
    public final void mo9175e(String str, String str2) {
        mo9173c(str, str2 == null ? C2996ea.f10129b : new C3008ej(str2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2999ed) || !((C2999ed) obj).f10130d.equals(this.f10130d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10130d.hashCode();
    }

    /* renamed from: l */
    public final Set<Map.Entry<String, C3000ee>> mo9178l() {
        return this.f10130d.entrySet();
    }

    /* renamed from: c */
    public final void mo9174c(String str, Number number) {
        mo9173c(str, number == null ? C2996ea.f10129b : new C3008ej(number));
    }
}
