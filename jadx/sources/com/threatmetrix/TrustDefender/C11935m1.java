package com.threatmetrix.TrustDefender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p585re.C17592i;

/* renamed from: com.threatmetrix.TrustDefender.m1 */
public abstract class C11935m1 {

    /* renamed from: f */
    private static final String f34975f = C11907h.m43615j(C11935m1.class);

    /* renamed from: a */
    private final long f34976a;

    /* renamed from: b */
    private final boolean f34977b;

    /* renamed from: c */
    private final boolean f34978c;

    /* renamed from: d */
    private List f34979d;

    /* renamed from: e */
    private String f34980e;

    /* renamed from: com.threatmetrix.TrustDefender.m1$a */
    public enum C11936a {
        COLLECTOR_TYPE_LOCALE_INFO("li"),
        COLLECTOR_TYPE_TIMEZONE_INFO("ti"),
        COLLECTOR_TYPE_DEVICE_NAME("dn"),
        COLLECTOR_TYPE_COOKIE("ci"),
        COLLECTOR_TYPE_SIM("si"),
        COLLECTOR_TYPE_DISPLAY("di"),
        COLLECTOR_TYPE_FINGERPRINT("dfi"),
        COLLECTOR_TYPE_SELF_HASH("shi"),
        COLLECTOR_TYPE_FONT("fi"),
        COLLECTOR_TYPE_DEVICE_STATE("dsi"),
        COLLECTOR_TYPE_NETWORK("ni"),
        COLLECTOR_TYPE_SUBSCRIBER("sin"),
        COLLECTOR_TYPE_ADVERTISING_ID("ai"),
        COLLECTOR_TYPE_SELINUX_MODE("sm"),
        COLLECTOR_TYPE_SHARED_LIB("sli"),
        COLLECTOR_TYPE_CONNECTIONS("cin"),
        COLLECTOR_TYPE_APP_INSTALLATION("ini"),
        COLLECTOR_TYPE_SYSTEM_PROXY("pi"),
        COLLECTOR_TYPE_CPU_CORE("cpi"),
        COLLECTOR_TYPE_MALICIOUS_APPS("mai"),
        COLLECTOR_TYPE_DEVICE("dei"),
        COLLECTOR_TYPE_DEVICE_ENCRYPT_AND_STATUS("den"),
        COLLECTOR_TYPE_PLUGIN_DETECTION("pdi"),
        COLLECTOR_TYPE_TAMPER_CODE("tc"),
        COLLECTOR_TYPE_EMULATOR("epi"),
        COLLECTOR_TYPE_LOCATION("loi"),
        COLLECTOR_TYPE_ROOT_DETECTION("rdi"),
        COLLECTOR_TYPE_PUSH_TOKEN("pti"),
        COLLECTOR_TYPE_FINGERPRINT_CAPS("fci"),
        COLLECTOR_TYPE_STRONG_ID("sii"),
        COLLECTOR_TYPE_PHONE_CALL("pci");
        

        /* renamed from: d */
        private final String f35013d;

        private C11936a(String str) {
            this.f35013d = str;
        }

        /* renamed from: a */
        public String mo31990a() {
            return this.f35013d;
        }
    }

    public C11935m1(long j) {
        this(j, false, true);
    }

    /* renamed from: e */
    private void m43801e(C17592i iVar) {
        if (iVar != null && iVar.mo45152j()) {
            throw new InterruptedException();
        }
    }

    /* renamed from: a */
    public void mo31986a(long j, C11994t1 t1Var, boolean z, boolean z2) {
        HashMap hashMap;
        if (t1Var != null) {
            this.f34980e = "";
            try {
                List list = this.f34979d;
                if (list == null || list.isEmpty()) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    for (C11935m1 m1Var : this.f34979d) {
                        if (m1Var != null) {
                            m1Var.mo31986a(j, t1Var, z, z2);
                            m1Var.mo31988c(j, hashMap, z2);
                            if (C11921k0.m43732o(m1Var.mo31989f())) {
                                this.f34980e += m1Var.mo31989f();
                            }
                        }
                    }
                }
                boolean z3 = this.f34977b == z;
                if (z2) {
                    z3 &= this.f34978c;
                }
                if (z3) {
                    m43801e(t1Var.mo32053c());
                    long j2 = this.f34976a;
                    if (j2 == 0 || (j & j2) != 0) {
                        mo31919g(t1Var, hashMap);
                        if (t1Var.mo32054d() != null) {
                            t1Var.mo32054d().mo32108c(mo31918d().name(), mo31918d().mo31990a());
                        }
                    }
                }
            } catch (InterruptedException e) {
                throw e;
            } catch (Throwable th) {
                this.f34980e += th.toString() + "(" + mo31918d().mo31990a() + ");";
                C11907h.m43609d(f34975f, "exception occurred: " + th.toString());
            }
        }
    }

    /* renamed from: b */
    public void mo31987b(C11935m1 m1Var) {
        if (m1Var != null) {
            if (this.f34979d == null) {
                this.f34979d = new ArrayList();
            }
            this.f34979d.add(m1Var);
        }
    }

    /* renamed from: c */
    public void mo31988c(long j, Map map, boolean z) {
        if (map != null) {
            List list = this.f34979d;
            if (list != null && !list.isEmpty()) {
                for (C11935m1 c : this.f34979d) {
                    c.mo31988c(j, map, z);
                }
            }
            if (!z || this.f34978c) {
                long j2 = this.f34976a;
                if (j2 == 0 || (j & j2) != 0) {
                    mo31920h(map);
                }
            }
        }
    }

    /* renamed from: d */
    public abstract C11936a mo31918d();

    /* renamed from: f */
    public String mo31989f() {
        return this.f34980e;
    }

    /* renamed from: g */
    public abstract void mo31919g(C11994t1 t1Var, Map map);

    /* renamed from: h */
    public abstract void mo31920h(Map map);

    public C11935m1(long j, boolean z, boolean z2) {
        this.f34976a = j;
        this.f34977b = z;
        this.f34978c = z2;
    }
}
