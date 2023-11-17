package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.h6 */
class C10862h6 extends C10773d2<C10863a> {

    /* renamed from: com.medallia.digital.mobilesdk.h6$a */
    enum C10863a {
        V1("V1"),
        V2("V2"),
        Unspecified("Unspecified");

        private C10863a(String str) {
            mo28418a(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10863a mo28418a(String str) {
            if (str == null || str.isEmpty()) {
                return Unspecified;
            }
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            return !upperCase.equals("V1") ? !upperCase.equals("V2") ? Unspecified : V2 : V1;
        }
    }

    C10862h6(C11083s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28117a(C10863a aVar) {
        super.mo28117a(aVar);
        C10735b4.m39109b(String.format(Locale.US, "Collectors > set SDK Analytics Version : %s", new Object[]{aVar.toString()}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32186U;
    }
}
