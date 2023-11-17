package sso.fragment;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7846k;
import p243s2.C8120m;
import p243s2.C8122n;
import p243s2.C8124o;

public final class LoginInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String FRAGMENT_DEFINITION = "fragment loginInfo on LoginResponseContent {\n  __typename\n  isChannelActive\n  isPasswordExpired\n  isUsernameChangeRequired\n  passwordChangeRequired\n  processReference\n}";
    /* access modifiers changed from: private */
    public static final C7846k[] RESPONSE_FIELDS;
    private final String __typename;
    private final Boolean isChannelActive;
    private final Boolean isPasswordExpired;
    private final Boolean isUsernameChangeRequired;
    private final Boolean passwordChangeRequired;
    private final String processReference;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8120m Mapper() {
            C8120m.C8121a aVar = C8120m.f23272a;
            return new LoginInfo$Companion$Mapper$$inlined$invoke$1();
        }

        public final String getFRAGMENT_DEFINITION() {
            return LoginInfo.FRAGMENT_DEFINITION;
        }

        public final LoginInfo invoke(C8124o oVar) {
            C41536l.m120489i(oVar, "reader");
            String h = oVar.mo19025h(LoginInfo.RESPONSE_FIELDS[0]);
            C41536l.m120486f(h);
            return new LoginInfo(h, oVar.mo19027j(LoginInfo.RESPONSE_FIELDS[1]), oVar.mo19027j(LoginInfo.RESPONSE_FIELDS[2]), oVar.mo19027j(LoginInfo.RESPONSE_FIELDS[3]), oVar.mo19027j(LoginInfo.RESPONSE_FIELDS[4]), oVar.mo19025h(LoginInfo.RESPONSE_FIELDS[5]));
        }
    }

    static {
        C7846k.C7847a aVar = C7846k.f22772g;
        RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22810a("isChannelActive", "isChannelActive", (Map) null, true, (List) null), aVar.mo22810a("isPasswordExpired", "isPasswordExpired", (Map) null, true, (List) null), aVar.mo22810a("isUsernameChangeRequired", "isUsernameChangeRequired", (Map) null, true, (List) null), aVar.mo22810a("passwordChangeRequired", "passwordChangeRequired", (Map) null, true, (List) null), aVar.mo22817h("processReference", "processReference", (Map) null, true, (List) null)};
    }

    public LoginInfo(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2) {
        C41536l.m120489i(str, "__typename");
        this.__typename = str;
        this.isChannelActive = bool;
        this.isPasswordExpired = bool2;
        this.isUsernameChangeRequired = bool3;
        this.passwordChangeRequired = bool4;
        this.processReference = str2;
    }

    public static /* synthetic */ LoginInfo copy$default(LoginInfo loginInfo, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginInfo.__typename;
        }
        if ((i & 2) != 0) {
            bool = loginInfo.isChannelActive;
        }
        Boolean bool5 = bool;
        if ((i & 4) != 0) {
            bool2 = loginInfo.isPasswordExpired;
        }
        Boolean bool6 = bool2;
        if ((i & 8) != 0) {
            bool3 = loginInfo.isUsernameChangeRequired;
        }
        Boolean bool7 = bool3;
        if ((i & 16) != 0) {
            bool4 = loginInfo.passwordChangeRequired;
        }
        Boolean bool8 = bool4;
        if ((i & 32) != 0) {
            str2 = loginInfo.processReference;
        }
        return loginInfo.copy(str, bool5, bool6, bool7, bool8, str2);
    }

    public final String component1() {
        return this.__typename;
    }

    public final Boolean component2() {
        return this.isChannelActive;
    }

    public final Boolean component3() {
        return this.isPasswordExpired;
    }

    public final Boolean component4() {
        return this.isUsernameChangeRequired;
    }

    public final Boolean component5() {
        return this.passwordChangeRequired;
    }

    public final String component6() {
        return this.processReference;
    }

    public final LoginInfo copy(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2) {
        C41536l.m120489i(str, "__typename");
        return new LoginInfo(str, bool, bool2, bool3, bool4, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) obj;
        return C41536l.m120484d(this.__typename, loginInfo.__typename) && C41536l.m120484d(this.isChannelActive, loginInfo.isChannelActive) && C41536l.m120484d(this.isPasswordExpired, loginInfo.isPasswordExpired) && C41536l.m120484d(this.isUsernameChangeRequired, loginInfo.isUsernameChangeRequired) && C41536l.m120484d(this.passwordChangeRequired, loginInfo.passwordChangeRequired) && C41536l.m120484d(this.processReference, loginInfo.processReference);
    }

    public final Boolean getPasswordChangeRequired() {
        return this.passwordChangeRequired;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final String get__typename() {
        return this.__typename;
    }

    public int hashCode() {
        int hashCode = this.__typename.hashCode() * 31;
        Boolean bool = this.isChannelActive;
        int i = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPasswordExpired;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isUsernameChangeRequired;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.passwordChangeRequired;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.processReference;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode5 + i;
    }

    public final Boolean isChannelActive() {
        return this.isChannelActive;
    }

    public final Boolean isPasswordExpired() {
        return this.isPasswordExpired;
    }

    public final Boolean isUsernameChangeRequired() {
        return this.isUsernameChangeRequired;
    }

    public C8122n marshaller() {
        C8122n.C8123a aVar = C8122n.f23274a;
        return new LoginInfo$marshaller$$inlined$invoke$1(this);
    }

    public String toString() {
        return "LoginInfo(__typename=" + this.__typename + ", isChannelActive=" + this.isChannelActive + ", isPasswordExpired=" + this.isPasswordExpired + ", isUsernameChangeRequired=" + this.isUsernameChangeRequired + ", passwordChangeRequired=" + this.passwordChangeRequired + ", processReference=" + this.processReference + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginInfo(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "LoginResponseContent" : str, bool, bool2, bool3, bool4, str2);
    }
}
