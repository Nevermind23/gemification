package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10859h4;
import com.medallia.digital.mobilesdk.C10998m4;
import com.medallia.digital.mobilesdk.C11244z5;

/* renamed from: com.medallia.digital.mobilesdk.w0 */
class C11158w0 extends C11044p0<C11235z0> {

    /* renamed from: g */
    private final C11160b f32072g;

    /* renamed from: com.medallia.digital.mobilesdk.w0$a */
    class C11159a implements C10812f6.C10813a {
        C11159a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0055  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo28086a(com.medallia.digital.mobilesdk.C10739b6 r4) {
            /*
                r3 = this;
                java.lang.String r0 = r4.mo28125b()
                if (r0 == 0) goto L_0x0026
                com.medallia.digital.mobilesdk.ModelFactory r0 = com.medallia.digital.mobilesdk.ModelFactory.getInstance()
                java.lang.String r4 = r4.mo28125b()
                com.medallia.digital.mobilesdk.ConfigurationUUID r4 = r0.createUUID(r4)
                com.medallia.digital.mobilesdk.y0 r0 = com.medallia.digital.mobilesdk.C11208y0.m41106c()
                r0.mo29206a((com.medallia.digital.mobilesdk.ConfigurationUUID) r4)
                if (r4 == 0) goto L_0x0026
                com.medallia.digital.mobilesdk.z7$b r0 = com.medallia.digital.mobilesdk.C11247z7.C11249b.CONFIGURATION_UUID
                java.lang.String r4 = r4.getUuid()
                boolean r4 = com.medallia.digital.mobilesdk.C11247z7.m41222a(r0, r4)
                goto L_0x0027
            L_0x0026:
                r4 = 0
            L_0x0027:
                if (r4 == 0) goto L_0x0055
                java.lang.String r4 = "Fetch uuid success - using offline configuration"
                com.medallia.digital.mobilesdk.C10735b4.m39109b(r4)
                long r0 = java.lang.System.currentTimeMillis()
                com.medallia.digital.mobilesdk.s6 r4 = com.medallia.digital.mobilesdk.C11089s6.m40668b()
                com.medallia.digital.mobilesdk.s6$a r2 = com.medallia.digital.mobilesdk.C11089s6.C11090a.LOCAL_CONFIGURATION_TIMESTAMP
                r4.mo28983b((com.medallia.digital.mobilesdk.C11089s6.C11090a) r2, (long) r0)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r2 = "Local configuration timestamp was updated to: "
                r4.append(r2)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                com.medallia.digital.mobilesdk.C10735b4.m39109b(r4)
                com.medallia.digital.mobilesdk.w0 r4 = com.medallia.digital.mobilesdk.C11158w0.this
                r4.mo29102e()
                goto L_0x005f
            L_0x0055:
                java.lang.String r4 = "Fetch uuid success - Uuid changed generate remote configuration"
                com.medallia.digital.mobilesdk.C10735b4.m39109b(r4)
                com.medallia.digital.mobilesdk.w0 r4 = com.medallia.digital.mobilesdk.C11158w0.this
                r4.mo29103f()
            L_0x005f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11158w0.C11159a.mo28086a(com.medallia.digital.mobilesdk.b6):void");
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C10735b4.m39109b("Fetch uuid failed fetching remote configuration");
            C11158w0.this.mo29103f();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.w0$b */
    protected interface C11160b {
        /* renamed from: a */
        C11063q0 mo28758a();
    }

    C11158w0(C10812f6 f6Var, C11063q0 q0Var, C11160b bVar, C10796e6<C11235z0> e6Var) {
        super(f6Var, q0Var, e6Var);
        this.f32072g = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10859h4 mo28253a(C11244z5 z5Var) {
        C11161w1 w1Var = C11244z5.C11245a.NO_CONNECTION.equals(z5Var.mo29258a()) ? new C11161w1(C10859h4.C10860a.AUTH_NETWORK_ERROR) : C11244z5.C11245a.TIMEOUT.equals(z5Var.mo29258a()) ? new C11161w1(C10859h4.C10860a.CONFIGURATION_TIMEOUT) : new C11161w1(C10859h4.C10860a.GET_CONFIG_ERROR);
        C10735b4.m39111c(w1Var.getMessage());
        return w1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28254b() {
        if (mo28255d() != null) {
            C10735b4.m39109b("Get config - Error trying to fetch offline configuration");
            mo29102e();
            return;
        }
        new C10728a8(this.f31740a, this.f31741b.mo28933e()).mo28091a((C10812f6.C10813a) new C11159a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10859h4 mo28255d() {
        if (C10718a3.m39038c().mo28069a() == null) {
            C10859h4.C10860a aVar = C10859h4.C10860a.ACCESS_TOKEN_EMPTY;
            C10735b4.m39111c(aVar.toString());
            return new C11161w1(aVar);
        } else if (!TextUtils.isEmpty(C10718a3.m39038c().mo28069a().mo28094c())) {
            return null;
        } else {
            C10859h4.C10860a aVar2 = C10859h4.C10860a.GET_CONFIG_EMPTY_ENDPOINT;
            C10735b4.m39111c(aVar2.toString());
            return new C11161w1(aVar2);
        }
    }

    /* renamed from: e */
    public void mo29102e() {
        new C11202x3().mo29052a(this.f31743d);
    }

    /* renamed from: f */
    public void mo29103f() {
        C11160b bVar = this.f32072g;
        if (bVar != null) {
            this.f31741b = bVar.mo28758a();
        }
        new C11226y5(this.f31740a, this.f31741b.mo28933e(), this.f31741b.mo28931c(), mo28873a(C10998m4.C11001c.ACCESS_TOKEN)).mo29052a((C10796e6<C11235z0>) this.f31743d);
    }
}
