package dh0;

import android.content.SharedPreferences;
import ih0.C25208a;
import j51.C36735g;
import java.util.concurrent.TimeUnit;
import jh0.C25455a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;
import p341ge.bog.mobilebank.model.Client;
import w41.C39517c;
import w41.C39521f;

/* renamed from: dh0.a */
public final class C20007a implements C25455a, C39517c.C39518a {

    /* renamed from: g */
    public static final C20008a f54597g = new C20008a((DefaultConstructorMarker) null);

    /* renamed from: h */
    private static final long f54598h = TimeUnit.DAYS.toMillis(14);

    /* renamed from: d */
    private final SharedPreferences f54599d;

    /* renamed from: e */
    private final C36735g f54600e;

    /* renamed from: f */
    private final Client f54601f;

    /* renamed from: dh0.a$a */
    public static final class C20008a {
        private C20008a() {
        }

        public /* synthetic */ C20008a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20007a(SharedPreferences sharedPreferences, C36735g gVar, Client client) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(client, "client");
        this.f54599d = sharedPreferences;
        this.f54600e = gVar;
        this.f54601f = client;
    }

    /* renamed from: i */
    private final long m65914i() {
        C37228a a = this.f54600e.mo89562a();
        if (a != null) {
            return a.mo90305b();
        }
        return -1;
    }

    /* renamed from: a */
    public String mo48379a() {
        String string = getSharedPreferences().getString("KEY_GAMIFICATION_TOKEN", (String) null);
        if (string == null || !(!C40439w.m117118v(string))) {
            return null;
        }
        return string;
    }

    /* renamed from: b */
    public void mo48380b() {
        C39521f.m114877h(C39521f.f93966a, getSharedPreferences(), m65914i(), "KEY_GAMIFICATION_POPUP_DISMISSED", true, false, 8, (Object) null);
    }

    /* renamed from: c */
    public void mo48381c(String str) {
        C39521f fVar = C39521f.f93966a;
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (str == null) {
            str = "";
        }
        C39521f.m114879l(fVar, sharedPreferences, "KEY_GAMIFICATION_TOKEN", str, false, 4, (Object) null);
    }

    /* renamed from: d */
    public boolean mo48382d(C25208a aVar) {
        C41536l.m120489i(aVar, "location");
        C39521f fVar = C39521f.f93966a;
        SharedPreferences sharedPreferences = getSharedPreferences();
        long i = m65914i();
        String b = aVar.mo63720b();
        long c = fVar.mo93167c(sharedPreferences, i, "KEY_BANNER_LAST_HIDDEN|" + b, -1);
        if (c == -1 || (System.currentTimeMillis() - c > f54598h && !this.f54601f.getUserInfo().isWealth())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo48383e(C25208a aVar) {
        C41536l.m120489i(aVar, "location");
        C39521f fVar = C39521f.f93966a;
        SharedPreferences sharedPreferences = getSharedPreferences();
        long i = m65914i();
        String b = aVar.mo63720b();
        C39521f.m114878j(fVar, sharedPreferences, i, "KEY_BANNER_LAST_HIDDEN|" + b, System.currentTimeMillis(), false, 8, (Object) null);
    }

    /* renamed from: f */
    public String mo48384f() {
        return C39521f.f93966a.mo93168d(getSharedPreferences(), m65914i(), "KEY_GAMIFICATION_TOKEN", (String) null);
    }

    /* renamed from: g */
    public boolean mo48385g() {
        return C39521f.f93966a.mo93166a(getSharedPreferences(), m65914i(), "KEY_GAMIFICATION_POPUP_DISMISSED", false);
    }

    public SharedPreferences getSharedPreferences() {
        return this.f54599d;
    }

    /* renamed from: h */
    public void mo48387h(String str) {
        C41536l.m120489i(str, "token");
        C39521f.m114880n(C39521f.f93966a, getSharedPreferences(), m65914i(), "KEY_GAMIFICATION_TOKEN", str, false, 8, (Object) null);
    }
}
