package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10812f6;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.a8 */
class C10728a8 {

    /* renamed from: a */
    private final C10812f6 f30660a;

    /* renamed from: b */
    private final String f30661b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10812f6.C10813a f30662c;

    /* renamed from: com.medallia.digital.mobilesdk.a8$a */
    class C10729a implements C10812f6.C10813a {
        C10729a() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            if (C10728a8.this.f30662c != null) {
                C10728a8.this.f30662c.mo28086a(b6Var);
            }
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            if (C10728a8.this.f30662c != null) {
                C10728a8.this.f30662c.mo28087a(z5Var);
            }
        }
    }

    C10728a8(C10812f6 f6Var, String str) {
        this.f30660a = f6Var;
        this.f30661b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28091a(C10812f6.C10813a aVar) {
        this.f30662c = aVar;
        if (TextUtils.isEmpty(this.f30661b)) {
            C10812f6.C10813a aVar2 = this.f30662c;
            if (aVar2 != null) {
                aVar2.mo28087a((C11244z5) null);
                return;
            }
            return;
        }
        this.f30660a.mo28310a(this.f30661b, (HashMap<String, String>) null, (HashMap<String, String>) null, new C10729a());
    }
}
