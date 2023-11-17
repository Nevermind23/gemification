package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10895j0;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.n0 */
class C11010n0 extends C10895j0<byte[]> {

    /* renamed from: com.medallia.digital.mobilesdk.n0$a */
    class C11011a extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ byte[] f31620a;

        C11011a(byte[] bArr) {
            this.f31620a = bArr;
        }

        /* renamed from: a */
        public void mo27617a() {
            C10735b4.m39109b("Status: " + C11010n0.this.mo28514h());
            if (C11010n0.this.mo28513g() != null) {
                try {
                    C11010n0.this.mo28513g().mo28086a(new C10739b6(C11010n0.this.mo28514h(), this.f31620a));
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    protected C11010n0(C10895j0.C10899d dVar, String str, HashMap<String, String> hashMap, int i, C10812f6.C10813a aVar) {
        super(dVar, str, hashMap, (JSONObject) null, i, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public byte[] mo28511b(InputStream inputStream) {
        try {
            return C10988l8.m40230a(inputStream).toByteArray();
        } catch (Exception unused) {
            mo28508a(-44);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28509a(byte[] bArr) {
        C11004m7.m40304b().mo28763a().execute(new C11011a(bArr));
    }
}
