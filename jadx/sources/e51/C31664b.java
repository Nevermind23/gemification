package e51;

import af1.C40303i;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared2.environment.EnvironmentType;
import w41.C39515a;
import w41.C39516b;
import w41.C39517c;
import w41.C39519d;
import w41.C39522g;

/* renamed from: e51.b */
public final class C31664b implements C31663a, C39517c.C39518a {

    /* renamed from: h */
    public static final C31665a f78249h = new C31665a((DefaultConstructorMarker) null);

    /* renamed from: i */
    static final /* synthetic */ C40303i[] f78250i;

    /* renamed from: d */
    private final SharedPreferences f78251d;

    /* renamed from: e */
    private final C39516b f78252e = new C39516b("debug_server_environment_type", (Enum) null, EnvironmentType.class);

    /* renamed from: f */
    private final C39522g f78253f = C39519d.m114857d("last_user_id", (String) null, 2, (Object) null);

    /* renamed from: g */
    private final C39515a f78254g = C39519d.m114854a("is_night_mode_on", false);

    /* renamed from: e51.b$a */
    public static final class C31665a {
        private C31665a() {
        }

        public /* synthetic */ C31665a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<C31664b> cls = C31664b.class;
        f78250i = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "debugServerEnvironmentType", "getDebugServerEnvironmentType()Lge/bog/mobilebank/shared2/environment/EnvironmentType;", 0)), C41520a0.m120439e(new C41539o(cls, "lastUserId", "getLastUserId()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "isInNightMode", "isInNightMode()Z", 0))};
    }

    public C31664b(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f78251d = sharedPreferences;
    }

    /* renamed from: a */
    public void mo72086a(boolean z) {
        this.f78254g.mo93151c(this, f78250i[2], z);
    }

    /* renamed from: b */
    public void mo72087b(EnvironmentType environmentType) {
        this.f78252e.setValue(this, f78250i[0], environmentType);
    }

    /* renamed from: c */
    public boolean mo72088c() {
        return this.f78254g.getValue(this, f78250i[2]).booleanValue();
    }

    /* renamed from: d */
    public EnvironmentType mo72089d() {
        return (EnvironmentType) this.f78252e.getValue(this, f78250i[0]);
    }

    public SharedPreferences getSharedPreferences() {
        return this.f78251d;
    }
}
