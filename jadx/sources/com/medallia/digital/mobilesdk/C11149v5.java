package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10859h4;
import com.medallia.digital.mobilesdk.C10998m4;
import com.medallia.digital.mobilesdk.C11125u5;
import com.medallia.digital.mobilesdk.C11244z5;
import com.medallia.digital.mobilesdk.C11247z7;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.v5 */
public class C11149v5 extends C11044p0<C11174w5> {

    /* renamed from: g */
    public static final String f32053g = "CUUID file does not exist";

    /* renamed from: h */
    public static final int f32054h = 403;

    /* renamed from: com.medallia.digital.mobilesdk.v5$a */
    class C11150a implements C10812f6.C10813a {
        C11150a() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10735b4.m39109b("Fetch cUuid finish successfully");
            if (b6Var == null || b6Var.mo28125b() == null) {
                C10735b4.m39109b("CUuid fetch response is null");
                C11149v5.this.mo29092c((String) null);
                return;
            }
            String cUuid = ModelFactory.getInstance().getCUuid(b6Var.mo28125b());
            if (!C11149v5.this.mo29093d(cUuid)) {
                C10735b4.m39109b("should not validate rules - using local rules");
                C11149v5.this.f31743d.mo27797a(new C11174w5());
                return;
            }
            C10735b4.m39109b("should validate rules - calling rules validation");
            C11149v5.this.mo29092c(cUuid);
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C11149v5 v5Var;
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Fetch cUuid failed ");
            sb.append(z5Var != null ? z5Var.mo29258a() : "");
            C10735b4.m39109b(sb.toString());
            if (z5Var == null || z5Var.mo29259b() != 403) {
                v5Var = C11149v5.this;
                str = null;
            } else {
                C11149v5 v5Var2 = C11149v5.this;
                str = C11149v5.f32053g;
                if (!v5Var2.mo29093d(str)) {
                    C10735b4.m39109b("should not validate rules - using local rules");
                    C11149v5.this.f31743d.mo27797a(new C11174w5());
                    return;
                }
                C10735b4.m39109b("should validate rules - calling rules validation");
                v5Var = C11149v5.this;
            }
            v5Var.mo29092c(str);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.v5$b */
    class C11151b implements C10812f6.C10813a {

        /* renamed from: a */
        final /* synthetic */ String f32056a;

        /* renamed from: com.medallia.digital.mobilesdk.v5$b$a */
        class C11152a implements C10812f6.C10813a {

            /* renamed from: a */
            final /* synthetic */ C11174w5 f32058a;

            C11152a(C11174w5 w5Var) {
                this.f32058a = w5Var;
            }

            /* renamed from: a */
            public void mo28086a(C10739b6 b6Var) {
                if (b6Var == null || b6Var.mo28125b() == null) {
                    C10735b4.m39109b("CUuid fetch response is null");
                } else {
                    String cUuid = ModelFactory.getInstance().getCUuid(b6Var.mo28125b());
                    C10735b4.m39109b("CUuid fetched successfully");
                    this.f32058a.mo29149a(cUuid);
                }
                C11149v5.this.f31743d.mo27797a(this.f32058a);
            }

            /* renamed from: a */
            public void mo28087a(C11244z5 z5Var) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fetch cUuid failed ");
                sb.append(z5Var != null ? z5Var.mo29258a() : "");
                C10735b4.m39109b(sb.toString());
                if (z5Var != null && z5Var.mo29259b() == 403) {
                    this.f32058a.mo29149a(C11149v5.f32053g);
                }
                C11149v5.this.f31743d.mo27797a(this.f32058a);
            }
        }

        C11151b(String str) {
            this.f32056a = str;
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10735b4.m39109b("QuarantineValidationClient success");
            if (b6Var != null) {
                C11174w5 createQuarantineValidation = ModelFactory.getInstance().createQuarantineValidation(b6Var.mo28125b());
                createQuarantineValidation.mo29150a(true);
                String str = this.f32056a;
                if (str == null) {
                    C11247z7.m41226c(C11247z7.C11249b.C_UUID, createQuarantineValidation.mo29151b());
                    C11149v5.this.m40875a((C10812f6.C10813a) new C11152a(createQuarantineValidation));
                    return;
                }
                createQuarantineValidation.mo29149a(str);
                C11149v5.this.f31743d.mo27797a(createQuarantineValidation);
            }
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            if (!(z5Var == null || z5Var.mo29258a() == null)) {
                C10735b4.m39111c("QuarantineValidationClient error " + z5Var.mo29258a().name());
            }
            C11149v5 v5Var = C11149v5.this;
            v5Var.f31743d.mo27796a(v5Var.mo28253a(z5Var));
        }
    }

    C11149v5(C10812f6 f6Var, C11063q0 q0Var, C10796e6<C11174w5> e6Var) {
        super(f6Var, q0Var, e6Var);
        this.f31741b = q0Var;
        this.f31743d = e6Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10859h4 mo28253a(C11244z5 z5Var) {
        C11161w1 w1Var = new C11161w1(C10859h4.C10860a.QUARANTINE_VALIDATION_ERROR);
        if (z5Var != null) {
            if (C11244z5.C11245a.NO_CONNECTION.equals(z5Var.mo29258a())) {
                w1Var = new C11161w1(C10859h4.C10860a.QUARANTINE_NETWORK_ERROR);
            } else if (C11244z5.C11245a.TIMEOUT.equals(z5Var.mo29258a())) {
                w1Var = new C11161w1(C10859h4.C10860a.QUARANTINE_VALIDATION_TIMEOUT);
            }
        }
        C10735b4.m39111c(w1Var.getMessage());
        return w1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28254b() {
        C10859h4 d = mo28255d();
        if (d != null) {
            C10735b4.m39109b("Quarantine Validation - validation Error");
            this.f31743d.mo27796a(d);
            return;
        }
        C11247z7.C11249b bVar = C11247z7.C11249b.C_UUID;
        if (C11247z7.m41223b(bVar) == null && C11247z7.m41225c(bVar) == null) {
            C10735b4.m39109b("CUuid and CUuid Url are both null - Probably first quarantine validation");
            mo29092c((String) null);
            return;
        }
        m40875a((C10812f6.C10813a) new C11150a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo29092c(String str) {
        String e = this.f31741b.mo28933e();
        if (e == null || e.isEmpty()) {
            C10859h4.C10860a aVar = C10859h4.C10860a.QUARANTINE_VALIDATION_EMPTY_ENDPOINT;
            C10735b4.m39111c(aVar.toString());
            this.f31743d.mo27796a((C10859h4) new C11161w1(aVar));
            return;
        }
        this.f31740a.mo28314b(e, (HashMap<String, String>) null, mo28873a(C10998m4.C11001c.ACCESS_TOKEN), this.f31741b.mo28929a(), new C11151b(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10859h4 mo28255d() {
        if (C10718a3.m39038c().mo28069a() == null) {
            C10859h4.C10860a aVar = C10859h4.C10860a.ACCESS_TOKEN_EMPTY;
            C10735b4.m39111c(aVar.toString());
            return new C11161w1(aVar);
        } else if (C10988l8.m40232b()) {
            return null;
        } else {
            C10859h4.C10860a aVar2 = C10859h4.C10860a.QUARANTINE_NETWORK_ERROR;
            C10735b4.m39111c(aVar2.toString());
            return new C11161w1(aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo29094e() {
        if (C11208y0.m41106c() == null || C11208y0.m41106c().mo29208b() == null) {
            C10735b4.m39109b("can't get OcqUuid value");
            return true;
        }
        boolean a = C11247z7.m41222a(C11247z7.C11249b.OCQ_UUID, C11208y0.m41106c().mo29208b().getOcqUuid());
        C10735b4.m39109b("OcqUuids are equals: " + a);
        return !a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40875a(C10812f6.C10813a aVar) {
        String c = C11247z7.m41225c(C11247z7.C11249b.C_UUID);
        if (c == null || c.isEmpty()) {
            C10735b4.m39111c(C10859h4.C10860a.QUARANTINE_C_UUID_EMPTY_ENDPOINT.mo28414b());
            aVar.mo28087a((C11244z5) null);
            return;
        }
        new C10728a8(this.f31740a, c).mo28091a(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo29091b(String str) {
        boolean a = C11247z7.m41222a(C11247z7.C11249b.C_UUID, str);
        C10735b4.m39109b("cUuids are equals: " + a);
        return !a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo29093d(String str) {
        String str2;
        Long l;
        if (mo29094e()) {
            str2 = "Should validate quarantine - OCQ UUID changed";
        } else if (mo29091b(str)) {
            str2 = "Should validate quarantine - CUuid changed";
        } else {
            C10876i1 a = C10876i1.m39698a();
            C10785e0.C10786a aVar = C10785e0.C10786a.QuarantineRule;
            ArrayList<? extends C10785e0> c = a.mo28471c(aVar, new Object[0]);
            if (c == null || c.isEmpty()) {
                str2 = "Should validate quarantine - DB rules are not valid";
            } else {
                C11204x5 x5Var = (C11204x5) C10876i1.m39698a().mo28467b(aVar, C11125u5.C11129d.ASC_EXPIRATION);
                if (x5Var == null || (l = x5Var.f32241b) == null || l.longValue() == 0 || x5Var.f32241b.longValue() >= System.currentTimeMillis()) {
                    return false;
                }
                str2 = "Should validate quarantine - DB rules expired: " + x5Var.f32241b;
            }
        }
        C10735b4.m39113e(str2);
        return true;
    }
}
