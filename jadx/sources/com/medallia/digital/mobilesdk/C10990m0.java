package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11138v2;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.m0 */
class C10990m0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10945l0 f31558a;

    public C10990m0(C10945l0 l0Var) {
        this.f31558a = l0Var;
    }

    /* renamed from: com.medallia.digital.mobilesdk.m0$a */
    class C10991a implements C11138v2.C11144f<JSONObject> {
        C10991a() {
        }

        /* renamed from: a */
        public void mo28689a() {
        }

        /* renamed from: a */
        public void mo28690a(JSONObject jSONObject) {
            if (jSONObject != null) {
                C10714a1.m39027b(jSONObject.toString());
                C11208y0.m41106c().mo29207a(new PropertyConfigurationContract(jSONObject));
            }
            if (!C11164w3.m40939b().mo29114a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") && !C11164w3.m40939b().mo29114a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity")) {
                C11007m8.m40311b().mo28773b(MedalliaWebView.C10705f.preload);
                C10990m0.this.f31558a.mo28649a(C11138v2.m40821f().mo29078g());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28721a(String str) {
        C11138v2.m40821f().mo29060a(str, (C11138v2.C11144f<JSONObject>) new C10991a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28722a(Locale locale, boolean z) {
        if (locale != null) {
            C11221y3.m41127d().mo29212a(locale);
            if (z) {
                mo28721a(locale.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28723a() {
        if (C11221y3.m41127d().mo29217c() != null) {
            return false;
        }
        return C11221y3.m41127d().mo29222h();
    }
}
