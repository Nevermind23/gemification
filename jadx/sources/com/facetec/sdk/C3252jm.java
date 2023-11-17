package com.facetec.sdk;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: com.facetec.sdk.jm */
public final class C3252jm {

    /* renamed from: a */
    public static final C3252jm f10628a = new C3253b(false).mo9477d();

    /* renamed from: c */
    public static final C3252jm f10629c;

    /* renamed from: f */
    private static final C3242jg[] f10630f;

    /* renamed from: g */
    private static final C3242jg[] f10631g;

    /* renamed from: b */
    final boolean f10632b;

    /* renamed from: d */
    final String[] f10633d;

    /* renamed from: e */
    final boolean f10634e;

    /* renamed from: h */
    final String[] f10635h;

    static {
        C3242jg jgVar = C3242jg.f10591o;
        C3242jg jgVar2 = C3242jg.f10595t;
        C3242jg jgVar3 = C3242jg.f10593q;
        C3242jg jgVar4 = C3242jg.f10592p;
        C3242jg jgVar5 = C3242jg.f10594s;
        C3242jg jgVar6 = C3242jg.f10586j;
        C3242jg jgVar7 = C3242jg.f10588l;
        C3242jg jgVar8 = C3242jg.f10583g;
        C3242jg jgVar9 = C3242jg.f10587k;
        C3242jg jgVar10 = C3242jg.f10589m;
        C3242jg jgVar11 = C3242jg.f10590n;
        C3242jg[] jgVarArr = {jgVar, jgVar2, jgVar3, jgVar4, jgVar5, jgVar6, jgVar7, jgVar8, jgVar9, jgVar10, jgVar11};
        f10630f = jgVarArr;
        C3242jg[] jgVarArr2 = {jgVar, jgVar2, jgVar3, jgVar4, jgVar5, jgVar6, jgVar7, jgVar8, jgVar9, jgVar10, jgVar11, C3242jg.f10585i, C3242jg.f10584h, C3242jg.f10580d, C3242jg.f10582f, C3242jg.f10577a, C3242jg.f10579c, C3242jg.f10581e};
        f10631g = jgVarArr2;
        C3253b c = new C3253b(true).mo9475c(jgVarArr);
        C3299ke keVar = C3299ke.TLS_1_3;
        C3299ke keVar2 = C3299ke.TLS_1_2;
        c.mo9476c(keVar, keVar2).mo9473a().mo9477d();
        C3253b c2 = new C3253b(true).mo9475c(jgVarArr2);
        C3299ke keVar3 = C3299ke.TLS_1_0;
        f10629c = c2.mo9476c(keVar, keVar2, C3299ke.TLS_1_1, keVar3).mo9473a().mo9477d();
        new C3253b(true).mo9475c(jgVarArr2).mo9476c(keVar3).mo9473a().mo9477d();
    }

    C3252jm(C3253b bVar) {
        this.f10632b = bVar.f10637b;
        this.f10633d = bVar.f10638c;
        this.f10635h = bVar.f10639e;
        this.f10634e = bVar.f10636a;
    }

    /* renamed from: b */
    public final boolean mo9467b() {
        return this.f10632b;
    }

    /* renamed from: c */
    public final boolean mo9468c() {
        return this.f10634e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3252jm)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C3252jm jmVar = (C3252jm) obj;
        boolean z = this.f10632b;
        if (z != jmVar.f10632b) {
            return false;
        }
        if (!z || (Arrays.equals(this.f10633d, jmVar.f10633d) && Arrays.equals(this.f10635h, jmVar.f10635h) && this.f10634e == jmVar.f10634e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10632b) {
            return ((((Arrays.hashCode(this.f10633d) + 527) * 31) + Arrays.hashCode(this.f10635h)) * 31) + (this.f10634e ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        List<C3242jg> list;
        if (!this.f10632b) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f10633d;
        List<C3299ke> list2 = null;
        String str2 = "[all enabled]";
        if (strArr != null) {
            if (strArr != null) {
                list = C3242jg.m13013a(strArr);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = str2;
        }
        String[] strArr2 = this.f10635h;
        if (strArr2 != null) {
            if (strArr2 != null) {
                list2 = C3299ke.m13222a(strArr2);
            }
            str2 = list2.toString();
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(str);
        sb.append(", tlsVersions=");
        sb.append(str2);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f10634e);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: com.facetec.sdk.jm$b */
    public static final class C3253b {

        /* renamed from: a */
        boolean f10636a;

        /* renamed from: b */
        boolean f10637b;

        /* renamed from: c */
        String[] f10638c;

        /* renamed from: e */
        String[] f10639e;

        C3253b(boolean z) {
            this.f10637b = z;
        }

        /* renamed from: a */
        public final C3253b mo9473a() {
            if (this.f10637b) {
                this.f10636a = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: b */
        public final C3253b mo9474b(String... strArr) {
            if (!this.f10637b) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f10639e = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: c */
        public final C3253b mo9475c(C3242jg... jgVarArr) {
            if (this.f10637b) {
                String[] strArr = new String[jgVarArr.length];
                for (int i = 0; i < jgVarArr.length; i++) {
                    strArr[i] = jgVarArr[i].f10597r;
                }
                return mo9478e(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: d */
        public final C3252jm mo9477d() {
            return new C3252jm(this);
        }

        /* renamed from: e */
        public final C3253b mo9478e(String... strArr) {
            if (!this.f10637b) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f10638c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public C3253b(C3252jm jmVar) {
            this.f10637b = jmVar.f10632b;
            this.f10638c = jmVar.f10633d;
            this.f10639e = jmVar.f10635h;
            this.f10636a = jmVar.f10634e;
        }

        /* renamed from: c */
        public final C3253b mo9476c(C3299ke... keVarArr) {
            if (this.f10637b) {
                String[] strArr = new String[keVarArr.length];
                for (int i = 0; i < keVarArr.length; i++) {
                    strArr[i] = keVarArr[i].f10831a;
                }
                return mo9474b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    /* renamed from: c */
    public final boolean mo9469c(SSLSocket sSLSocket) {
        if (!this.f10632b) {
            return false;
        }
        String[] strArr = this.f10635h;
        if (strArr != null && !C3303ki.m13269d(C3303ki.f10848j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f10633d;
        if (strArr2 == null || C3303ki.m13269d(C3242jg.f10578b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }
}
