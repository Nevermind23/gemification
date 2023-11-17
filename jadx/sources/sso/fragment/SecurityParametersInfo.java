package sso.fragment;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7846k;
import p243s2.C8120m;
import p243s2.C8122n;
import p243s2.C8124o;

public final class SecurityParametersInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String FRAGMENT_DEFINITION = "fragment securityParametersInfo on SetupSecurityParametersResponse {\n  __typename\n  biometricAuthToken\n  passcodeAuthToken\n}";
    /* access modifiers changed from: private */
    public static final C7846k[] RESPONSE_FIELDS;
    private final String __typename;
    private final String biometricAuthToken;
    private final String passcodeAuthToken;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8120m Mapper() {
            C8120m.C8121a aVar = C8120m.f23272a;
            return new SecurityParametersInfo$Companion$Mapper$$inlined$invoke$1();
        }

        public final String getFRAGMENT_DEFINITION() {
            return SecurityParametersInfo.FRAGMENT_DEFINITION;
        }

        public final SecurityParametersInfo invoke(C8124o oVar) {
            C41536l.m120489i(oVar, "reader");
            String h = oVar.mo19025h(SecurityParametersInfo.RESPONSE_FIELDS[0]);
            C41536l.m120486f(h);
            return new SecurityParametersInfo(h, oVar.mo19025h(SecurityParametersInfo.RESPONSE_FIELDS[1]), oVar.mo19025h(SecurityParametersInfo.RESPONSE_FIELDS[2]));
        }
    }

    static {
        C7846k.C7847a aVar = C7846k.f22772g;
        RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("biometricAuthToken", "biometricAuthToken", (Map) null, true, (List) null), aVar.mo22817h("passcodeAuthToken", "passcodeAuthToken", (Map) null, true, (List) null)};
    }

    public SecurityParametersInfo(String str, String str2, String str3) {
        C41536l.m120489i(str, "__typename");
        this.__typename = str;
        this.biometricAuthToken = str2;
        this.passcodeAuthToken = str3;
    }

    public static /* synthetic */ SecurityParametersInfo copy$default(SecurityParametersInfo securityParametersInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = securityParametersInfo.__typename;
        }
        if ((i & 2) != 0) {
            str2 = securityParametersInfo.biometricAuthToken;
        }
        if ((i & 4) != 0) {
            str3 = securityParametersInfo.passcodeAuthToken;
        }
        return securityParametersInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.__typename;
    }

    public final String component2() {
        return this.biometricAuthToken;
    }

    public final String component3() {
        return this.passcodeAuthToken;
    }

    public final SecurityParametersInfo copy(String str, String str2, String str3) {
        C41536l.m120489i(str, "__typename");
        return new SecurityParametersInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityParametersInfo)) {
            return false;
        }
        SecurityParametersInfo securityParametersInfo = (SecurityParametersInfo) obj;
        return C41536l.m120484d(this.__typename, securityParametersInfo.__typename) && C41536l.m120484d(this.biometricAuthToken, securityParametersInfo.biometricAuthToken) && C41536l.m120484d(this.passcodeAuthToken, securityParametersInfo.passcodeAuthToken);
    }

    public final String getBiometricAuthToken() {
        return this.biometricAuthToken;
    }

    public final String getPasscodeAuthToken() {
        return this.passcodeAuthToken;
    }

    public final String get__typename() {
        return this.__typename;
    }

    public int hashCode() {
        int hashCode = this.__typename.hashCode() * 31;
        String str = this.biometricAuthToken;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.passcodeAuthToken;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public C8122n marshaller() {
        C8122n.C8123a aVar = C8122n.f23274a;
        return new SecurityParametersInfo$marshaller$$inlined$invoke$1(this);
    }

    public String toString() {
        return "SecurityParametersInfo(__typename=" + this.__typename + ", biometricAuthToken=" + this.biometricAuthToken + ", passcodeAuthToken=" + this.passcodeAuthToken + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SecurityParametersInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "SetupSecurityParametersResponse" : str, str2, str3);
    }
}
