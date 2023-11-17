package of1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf1.C42197d;

/* renamed from: of1.l */
public final class C41904l {

    /* renamed from: e */
    public static final C41906b f98490e = new C41906b((DefaultConstructorMarker) null);

    /* renamed from: f */
    private static final C41898i[] f98491f;

    /* renamed from: g */
    private static final C41898i[] f98492g;

    /* renamed from: h */
    public static final C41904l f98493h;

    /* renamed from: i */
    public static final C41904l f98494i;

    /* renamed from: j */
    public static final C41904l f98495j;

    /* renamed from: k */
    public static final C41904l f98496k = new C41905a(false).mo96843a();

    /* renamed from: a */
    private final boolean f98497a;

    /* renamed from: b */
    private final boolean f98498b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String[] f98499c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String[] f98500d;

    /* renamed from: of1.l$b */
    public static final class C41906b {
        private C41906b() {
        }

        public /* synthetic */ C41906b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C41898i iVar = C41898i.f98461o1;
        C41898i iVar2 = C41898i.f98464p1;
        C41898i iVar3 = C41898i.f98467q1;
        C41898i iVar4 = C41898i.f98419a1;
        C41898i iVar5 = C41898i.f98431e1;
        C41898i iVar6 = C41898i.f98422b1;
        C41898i iVar7 = C41898i.f98434f1;
        C41898i iVar8 = C41898i.f98452l1;
        C41898i iVar9 = C41898i.f98449k1;
        C41898i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f98491f = iVarArr;
        C41898i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, C41898i.f98389L0, C41898i.f98391M0, C41898i.f98445j0, C41898i.f98448k0, C41898i.f98380H, C41898i.f98388L, C41898i.f98450l};
        f98492g = iVarArr2;
        C41905a c = new C41905a(true).mo96845c((C41898i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        C41894g0 g0Var = C41894g0.TLS_1_3;
        C41894g0 g0Var2 = C41894g0.TLS_1_2;
        f98493h = c.mo96852j(g0Var, g0Var2).mo96850h(true).mo96843a();
        f98494i = new C41905a(true).mo96845c((C41898i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).mo96852j(g0Var, g0Var2).mo96850h(true).mo96843a();
        f98495j = new C41905a(true).mo96845c((C41898i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).mo96852j(g0Var, g0Var2, C41894g0.TLS_1_1, C41894g0.TLS_1_0).mo96850h(true).mo96843a();
    }

    public C41904l(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f98497a = z;
        this.f98498b = z2;
        this.f98499c = strArr;
        this.f98500d = strArr2;
    }

    /* renamed from: g */
    private final C41904l m121492g(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f98499c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            C41536l.m120488h(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = C42197d.m122511E(enabledCipherSuites, this.f98499c, C41898i.f98420b.mo96831c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f98500d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            C41536l.m120488h(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = C42197d.m122511E(enabledProtocols, this.f98500d, C41506d.m120408g());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C41536l.m120488h(supportedCipherSuites, "supportedCipherSuites");
        int x = C42197d.m122558x(supportedCipherSuites, "TLS_FALLBACK_SCSV", C41898i.f98420b.mo96831c());
        if (z && x != -1) {
            C41536l.m120488h(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[x];
            C41536l.m120488h(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = C42197d.m122549o(strArr, str);
        }
        C41905a aVar = new C41905a(this);
        C41536l.m120488h(strArr, "cipherSuitesIntersection");
        C41905a b = aVar.mo96844b((String[]) Arrays.copyOf(strArr, strArr.length));
        C41536l.m120488h(strArr2, "tlsVersionsIntersection");
        return b.mo96851i((String[]) Arrays.copyOf(strArr2, strArr2.length)).mo96843a();
    }

    /* renamed from: c */
    public final void mo96834c(SSLSocket sSLSocket, boolean z) {
        C41536l.m120489i(sSLSocket, "sslSocket");
        C41904l g = m121492g(sSLSocket, z);
        if (g.mo96841i() != null) {
            sSLSocket.setEnabledProtocols(g.f98500d);
        }
        if (g.mo96835d() != null) {
            sSLSocket.setEnabledCipherSuites(g.f98499c);
        }
    }

    /* renamed from: d */
    public final List mo96835d() {
        String[] strArr = this.f98499c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b : strArr) {
            arrayList.add(C41898i.f98420b.mo96830b(b));
        }
        return C41358y.m120036z0(arrayList);
    }

    /* renamed from: e */
    public final boolean mo96836e(SSLSocket sSLSocket) {
        C41536l.m120489i(sSLSocket, "socket");
        if (!this.f98497a) {
            return false;
        }
        String[] strArr = this.f98500d;
        if (strArr != null && !C42197d.m122555u(strArr, sSLSocket.getEnabledProtocols(), C41506d.m120408g())) {
            return false;
        }
        String[] strArr2 = this.f98499c;
        if (strArr2 == null || C42197d.m122555u(strArr2, sSLSocket.getEnabledCipherSuites(), C41898i.f98420b.mo96831c())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C41904l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f98497a;
        C41904l lVar = (C41904l) obj;
        if (z != lVar.f98497a) {
            return false;
        }
        if (!z || (Arrays.equals(this.f98499c, lVar.f98499c) && Arrays.equals(this.f98500d, lVar.f98500d) && this.f98498b == lVar.f98498b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo96838f() {
        return this.f98497a;
    }

    /* renamed from: h */
    public final boolean mo96839h() {
        return this.f98498b;
    }

    public int hashCode() {
        int i;
        if (!this.f98497a) {
            return 17;
        }
        String[] strArr = this.f98499c;
        int i2 = 0;
        if (strArr == null) {
            i = 0;
        } else {
            i = Arrays.hashCode(strArr);
        }
        int i3 = (527 + i) * 31;
        String[] strArr2 = this.f98500d;
        if (strArr2 != null) {
            i2 = Arrays.hashCode(strArr2);
        }
        return ((i3 + i2) * 31) + (this.f98498b ^ true ? 1 : 0);
    }

    /* renamed from: i */
    public final List mo96841i() {
        String[] strArr = this.f98500d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C41894g0.f98356e.mo96819a(a));
        }
        return C41358y.m120036z0(arrayList);
    }

    public String toString() {
        if (!this.f98497a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(mo96835d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(mo96841i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f98498b + ')';
    }

    /* renamed from: of1.l$a */
    public static final class C41905a {

        /* renamed from: a */
        private boolean f98501a;

        /* renamed from: b */
        private String[] f98502b;

        /* renamed from: c */
        private String[] f98503c;

        /* renamed from: d */
        private boolean f98504d;

        public C41905a(boolean z) {
            this.f98501a = z;
        }

        /* renamed from: a */
        public final C41904l mo96843a() {
            return new C41904l(this.f98501a, this.f98504d, this.f98502b, this.f98503c);
        }

        /* renamed from: b */
        public final C41905a mo96844b(String... strArr) {
            boolean z;
            C41536l.m120489i(strArr, "cipherSuites");
            if (mo96846d()) {
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    mo96847e((String[]) strArr.clone());
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: c */
        public final C41905a mo96845c(C41898i... iVarArr) {
            C41536l.m120489i(iVarArr, "cipherSuites");
            if (mo96846d()) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (C41898i c : iVarArr) {
                    arrayList.add(c.mo96826c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return mo96844b((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: d */
        public final boolean mo96846d() {
            return this.f98501a;
        }

        /* renamed from: e */
        public final void mo96847e(String[] strArr) {
            this.f98502b = strArr;
        }

        /* renamed from: f */
        public final void mo96848f(boolean z) {
            this.f98504d = z;
        }

        /* renamed from: g */
        public final void mo96849g(String[] strArr) {
            this.f98503c = strArr;
        }

        /* renamed from: h */
        public final C41905a mo96850h(boolean z) {
            if (mo96846d()) {
                mo96848f(z);
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: i */
        public final C41905a mo96851i(String... strArr) {
            boolean z;
            C41536l.m120489i(strArr, "tlsVersions");
            if (mo96846d()) {
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    mo96849g((String[]) strArr.clone());
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        /* renamed from: j */
        public final C41905a mo96852j(C41894g0... g0VarArr) {
            C41536l.m120489i(g0VarArr, "tlsVersions");
            if (mo96846d()) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (C41894g0 b : g0VarArr) {
                    arrayList.add(b.mo96818b());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return mo96851i((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C41905a(C41904l lVar) {
            C41536l.m120489i(lVar, "connectionSpec");
            this.f98501a = lVar.mo96838f();
            this.f98502b = lVar.f98499c;
            this.f98503c = lVar.f98500d;
            this.f98504d = lVar.mo96839h();
        }
    }
}
