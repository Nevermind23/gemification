package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10859h4;

/* renamed from: com.medallia.digital.mobilesdk.a3 */
class C10718a3 implements C10769c8 {

    /* renamed from: c */
    private static C10718a3 f30624c;

    /* renamed from: a */
    private C11009n f30625a;

    /* renamed from: b */
    private C10730b f30626b;

    C10718a3() {
    }

    /* renamed from: c */
    protected static C10718a3 m39038c() {
        if (f30624c == null) {
            f30624c = new C10718a3();
        }
        return f30624c;
    }

    /* renamed from: a */
    public C10730b mo28069a() {
        return this.f30626b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11009n mo28073b() {
        return this.f30625a;
    }

    public void clearAndDisconnect() {
        this.f30625a = null;
        this.f30626b = null;
        f30624c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10859h4.C10860a mo28070a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C10730b createAccessToken = ModelFactory.getInstance().createAccessToken(str);
            this.f30626b = createAccessToken;
            if (createAccessToken == null) {
                return C10859h4.C10860a.ACCESS_TOKEN_PARSE;
            }
            return null;
        }
        this.f30626b = null;
        return C10859h4.C10860a.ACCESS_TOKEN_EMPTY;
    }

    /* renamed from: a */
    public void mo28071a(C10730b bVar) {
        this.f30626b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28072a(C11009n nVar) {
        this.f30625a = nVar;
    }
}
