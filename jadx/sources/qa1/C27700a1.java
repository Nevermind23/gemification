package qa1;

import af1.C40303i;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import gb1.C32369e;
import gb1.C32374f;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p316xa.C8982a;
import p341ge.bog.sso_client.models.DeviceIdentifier;

/* renamed from: qa1.a1 */
public final class C27700a1 implements C32374f {

    /* renamed from: j */
    public static final C27701a f70810j = new C27701a((DefaultConstructorMarker) null);

    /* renamed from: k */
    static final /* synthetic */ C40303i[] f70811k;

    /* renamed from: a */
    private SharedPreferences f70812a;

    /* renamed from: b */
    private final C32369e.C32373c f70813b;

    /* renamed from: c */
    private final C32369e.C32373c f70814c;

    /* renamed from: d */
    private final C32369e.C32371b f70815d;

    /* renamed from: e */
    private final C32369e.C32371b f70816e;

    /* renamed from: f */
    private final C32369e.C32373c f70817f;

    /* renamed from: g */
    private final C32369e.C32370a f70818g;

    /* renamed from: h */
    private final C32369e.C32373c f70819h;

    /* renamed from: i */
    private final Object f70820i = new Object();

    /* renamed from: qa1.a1$a */
    public static final class C27701a {
        private C27701a() {
        }

        public /* synthetic */ C27701a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: qa1.a1$b */
    public static final class C27702b extends C8982a<HashMap<String, Map<String, Object>>> {
    }

    /* renamed from: qa1.a1$c */
    public static final class C27703c extends C8982a<DeviceIdentifier> {
    }

    static {
        Class<C27700a1> cls = C27700a1.class;
        f70811k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "lastLoggedUser", "getLastLoggedUser()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "lastLoggedUserIsTrusted", "getLastLoggedUserIsTrusted()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "userSessions", "getUserSessions()Ljava/util/HashMap;", 0)), C41520a0.m120439e(new C41539o(cls, "deviceIdentifier", "getDeviceIdentifier()Lge/bog/sso_client/models/DeviceIdentifier;", 0)), C41520a0.m120439e(new C41539o(cls, "faceTecAppKey", "getFaceTecAppKey()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "forceDeviceSave", "getForceDeviceSave()Z", 0)), C41520a0.m120439e(new C41539o(cls, "savedTMXSessionId", "getSavedTMXSessionId()Ljava/lang/String;", 0))};
    }

    public C27700a1(SharedPreferences sharedPreferences, Gson gson) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        C41536l.m120489i(gson, "gson");
        this.f70812a = sharedPreferences;
        C32369e eVar = C32369e.f79813a;
        this.f70813b = eVar.mo72867b("last_logged_user", (String) null);
        this.f70814c = eVar.mo72867b("last_logged_user_trusted", (String) null);
        Type type = new C27702b().getType();
        C41536l.m120488h(type, "object : TypeToken<T>() {}.type");
        this.f70815d = new C32369e.C32371b("user_sessions", (Object) null, type, gson);
        Type type2 = new C27703c().getType();
        C41536l.m120488h(type2, "object : TypeToken<T>() {}.type");
        this.f70816e = new C32369e.C32371b("device_identifier", (Object) null, type2, gson);
        this.f70817f = eVar.mo72867b("facetec_app_key", (String) null);
        this.f70818g = eVar.mo72866a("force_save_davice", true);
        this.f70819h = eVar.mo72867b("tmx_session_id", "");
    }

    /* renamed from: a */
    public final void mo67240a() {
        mo67256p((HashMap) null);
        mo67253m((String) null);
        mo67254n((String) null);
        mo67251k((String) null);
        mo67250j((DeviceIdentifier) null);
    }

    /* renamed from: b */
    public final void mo67241b() {
        mo67253m((String) null);
        mo67254n((String) null);
    }

    /* renamed from: c */
    public final DeviceIdentifier mo67242c() {
        return (DeviceIdentifier) this.f70816e.getValue(this, f70811k[3]);
    }

    /* renamed from: d */
    public final String mo67243d() {
        return this.f70817f.getValue(this, f70811k[4]);
    }

    /* renamed from: e */
    public final boolean mo67244e() {
        return this.f70818g.getValue(this, f70811k[5]).booleanValue();
    }

    /* renamed from: f */
    public final String mo67245f() {
        return this.f70813b.getValue(this, f70811k[0]);
    }

    /* renamed from: g */
    public final String mo67246g() {
        return this.f70814c.getValue(this, f70811k[1]);
    }

    public SharedPreferences getSharedPreferences() {
        return this.f70812a;
    }

    /* renamed from: h */
    public final String mo67248h() {
        return this.f70819h.getValue(this, f70811k[6]);
    }

    /* renamed from: i */
    public final HashMap mo67249i() {
        return (HashMap) this.f70815d.getValue(this, f70811k[2]);
    }

    /* renamed from: j */
    public final void mo67250j(DeviceIdentifier deviceIdentifier) {
        this.f70816e.setValue(this, f70811k[3], deviceIdentifier);
    }

    /* renamed from: k */
    public final void mo67251k(String str) {
        this.f70817f.setValue(this, f70811k[4], str);
    }

    /* renamed from: l */
    public final void mo67252l(boolean z) {
        this.f70818g.mo72869b(this, f70811k[5], z);
    }

    /* renamed from: m */
    public final void mo67253m(String str) {
        this.f70813b.setValue(this, f70811k[0], str);
    }

    /* renamed from: n */
    public final void mo67254n(String str) {
        this.f70814c.setValue(this, f70811k[1], str);
    }

    /* renamed from: o */
    public final void mo67255o(String str) {
        this.f70819h.setValue(this, f70811k[6], str);
    }

    /* renamed from: p */
    public final void mo67256p(HashMap hashMap) {
        this.f70815d.setValue(this, f70811k[2], hashMap);
    }
}
