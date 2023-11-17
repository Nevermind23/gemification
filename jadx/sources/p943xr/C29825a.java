package p943xr;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p316xa.C8982a;
import p341ge.bog.mobilebank.cleanarch.data.appsettings.entity.AppSettingApiEntity;

/* renamed from: xr.a */
public final class C29825a {

    /* renamed from: d */
    public static final C29826a f75517d = new C29826a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f75518a;

    /* renamed from: b */
    private final SharedPreferences.Editor f75519b;

    /* renamed from: c */
    private final Gson f75520c = new Gson();

    /* renamed from: xr.a$a */
    public static final class C29826a {
        private C29826a() {
        }

        public /* synthetic */ C29826a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: xr.a$b */
    public static final class C29827b extends C8982a<List<? extends AppSettingApiEntity>> {
        C29827b() {
        }
    }

    /* renamed from: xr.a$c */
    public static final class C29828c extends C8982a<List<? extends AppSettingApiEntity>> {
        C29828c() {
        }
    }

    public C29825a(C36546y yVar) {
        C41536l.m120489i(yVar, "app");
        SharedPreferences sharedPreferences = yVar.getSharedPreferences("shared_preferences_app_settings", 0);
        C41536l.m120488h(sharedPreferences, "app.getSharedPreferences…ME, Context.MODE_PRIVATE)");
        this.f75518a = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C41536l.m120488h(edit, "sharedPreferences.edit()");
        this.f75519b = edit;
    }

    /* renamed from: a */
    public final void mo70089a() {
        this.f75519b.remove("INTERNAL_USER_ID");
        this.f75519b.remove("INTERNAL_SETTINGS");
        this.f75519b.commit();
    }

    /* renamed from: b */
    public final List mo70090b() {
        String string = this.f75518a.getString("EXTERNAL_SETTINGS", (String) null);
        if (string == null) {
            return null;
        }
        return (List) this.f75520c.mo18171m(string, new C29827b().getType());
    }

    /* renamed from: c */
    public final List mo70091c(long j) {
        if (j != this.f75518a.getLong("INTERNAL_USER_ID", -1)) {
            mo70089a();
            return null;
        }
        String string = this.f75518a.getString("INTERNAL_SETTINGS", (String) null);
        if (string == null) {
            return null;
        }
        return (List) this.f75520c.mo18171m(string, new C29828c().getType());
    }

    /* renamed from: d */
    public final void mo70092d(List list) {
        C41536l.m120489i(list, "settings");
        this.f75519b.putString("EXTERNAL_SETTINGS", this.f75520c.mo18181w(list));
        this.f75519b.commit();
    }

    /* renamed from: e */
    public final void mo70093e(List list, long j) {
        C41536l.m120489i(list, "settings");
        this.f75519b.putLong("INTERNAL_USER_ID", j);
        this.f75519b.putString("INTERNAL_SETTINGS", this.f75520c.mo18181w(list));
        this.f75519b.commit();
    }
}
