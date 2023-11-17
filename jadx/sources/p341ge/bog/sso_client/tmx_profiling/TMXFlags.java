package p341ge.bog.sso_client.tmx_profiling;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.sso_client.tmx_profiling.TMXFlags */
public final class TMXFlags {
    public static final C41083a Companion = new C41083a((DefaultConstructorMarker) null);
    public static final String TMX_FLAG_ACTIVATE_CHANNEL_KEY = "ACTIVATE_CHANNEL";
    public static final String TMX_FLAG_ADD_FIN_CONTACT_KEY = "ADD_FIN_CONTACT";
    public static final String TMX_FLAG_ADD_FIN_PHONE_KEY = "ADD_FIN_PHONE";
    public static final String TMX_FLAG_CHANGE_USER_NAME_KEY = "CHANGE_USER_NAME";
    public static final String TMX_FLAG_FIN_CONTACT_KEY = "FIN_CONTACT";
    public static final String TMX_FLAG_FIN_PHONE_KEY = "FIN_PHONE";
    public static final String TMX_FLAG_LOGIN_KEY = "LOGIN";
    public static final String TMX_FLAG_REGISTRATION_KEY = "REGISTRATION";
    public static final String TMX_FLAG_RESET_KEY = "RESET";
    public static final String TMX_FLAG_SEC_PARAMS_KEY = "SEC_PARAMS";
    public static final String TMX_FLAG_TRUST_KEY = "TRUST";
    public static final String TMX_FLAG_UPDATE_PSWD_KEY = "UPDATE_PSWD";
    private final List<TMXFlag> forms;

    /* renamed from: ge.bog.sso_client.tmx_profiling.TMXFlags$a */
    public static final class C41083a {
        private C41083a() {
        }

        public /* synthetic */ C41083a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TMXFlags(List<TMXFlag> list) {
        C41536l.m120489i(list, "forms");
        this.forms = list;
    }

    public static /* synthetic */ TMXFlags copy$default(TMXFlags tMXFlags, List<TMXFlag> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tMXFlags.forms;
        }
        return tMXFlags.copy(list);
    }

    public final List<TMXFlag> component1() {
        return this.forms;
    }

    public final TMXFlags copy(List<TMXFlag> list) {
        C41536l.m120489i(list, "forms");
        return new TMXFlags(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TMXFlags) && C41536l.m120484d(this.forms, ((TMXFlags) obj).forms);
    }

    public final List<TMXFlag> getForms() {
        return this.forms;
    }

    public int hashCode() {
        return this.forms.hashCode();
    }

    public String toString() {
        return "TMXFlags(forms=" + this.forms + ')';
    }
}
