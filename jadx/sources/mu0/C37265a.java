package mu0;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import su0.C38536a;
import uu0.C39103a;
import w41.C39517c;
import w41.C39520e;

/* renamed from: mu0.a */
public final class C37265a implements C39103a, C39517c.C39518a {

    /* renamed from: e */
    public static final C37266a f89713e = new C37266a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final SharedPreferences f89714d;

    /* renamed from: mu0.a$a */
    public static final class C37266a {
        private C37266a() {
        }

        public /* synthetic */ C37266a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C37265a(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f89714d = sharedPreferences;
    }

    /* renamed from: e */
    private final String m110032e(C38536a aVar) {
        String a = aVar.mo92150y().mo92152a();
        String a2 = aVar.mo92144t().mo92159a();
        if (a2 == null) {
            a2 = "";
        }
        return "PREFERENCE_KEY_NBO_BANNER_HIDE_DATE" + a + a2;
    }

    /* renamed from: a */
    public void mo90382a(C38536a aVar, long j) {
        C41536l.m120489i(aVar, "offer");
        C39520e.m114862n(C39520e.f93965a, this, j, m110032e(aVar), System.currentTimeMillis(), false, 8, (Object) null);
    }

    /* renamed from: b */
    public boolean mo90383b(long j) {
        return C39520e.f93965a.mo93156c(this, j, "PREFERENCE_KEY_CHAT_BOT_NBO_BANNER_HIDDEN", false);
    }

    /* renamed from: c */
    public void mo90384c(long j) {
        C39520e.m114861l(C39520e.f93965a, this, j, "PREFERENCE_KEY_CHAT_BOT_NBO_BANNER_HIDDEN", true, false, 8, (Object) null);
    }

    /* renamed from: d */
    public long mo90385d(C38536a aVar, long j) {
        C41536l.m120489i(aVar, "offer");
        return C39520e.f93965a.mo93157d(this, j, m110032e(aVar), -1);
    }

    public SharedPreferences getSharedPreferences() {
        return this.f89714d;
    }
}
