package re0;

import android.content.SharedPreferences;
import gf0.C24711a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w41.C39517c;
import w41.C39520e;

/* renamed from: re0.a */
public final class C28003a implements C24711a, C39517c.C39518a {

    /* renamed from: e */
    public static final C28004a f71364e = new C28004a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final SharedPreferences f71365d;

    /* renamed from: re0.a$a */
    public static final class C28004a {
        private C28004a() {
        }

        public /* synthetic */ C28004a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C28003a(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f71365d = sharedPreferences;
    }

    /* renamed from: a */
    public void mo63111a(long j) {
        C39520e.m114862n(C39520e.f93965a, this, j, "PREF_KEY_GT_KYC_POPUP_SHOWN", System.currentTimeMillis(), false, 8, (Object) null);
    }

    /* renamed from: b */
    public long mo63112b(long j) {
        return C39520e.f93965a.mo93157d(this, j, "PREF_KEY_GT_KYC_POPUP_SHOWN", -1);
    }

    public SharedPreferences getSharedPreferences() {
        return this.f71365d;
    }
}
