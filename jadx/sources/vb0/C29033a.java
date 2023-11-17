package vb0;

import android.content.SharedPreferences;
import jy0.C36845a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w41.C39517c;
import w41.C39520e;

/* renamed from: vb0.a */
public final class C29033a implements C36845a, C39517c.C39518a {

    /* renamed from: e */
    public static final C29034a f74019e = new C29034a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final SharedPreferences f74020d;

    /* renamed from: vb0.a$a */
    public static final class C29034a {
        private C29034a() {
        }

        public /* synthetic */ C29034a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C29033a(SharedPreferences sharedPreferences) {
        C41536l.m120489i(sharedPreferences, "sharedPreferences");
        this.f74020d = sharedPreferences;
    }

    /* renamed from: a */
    public long mo68900a(long j, long j2) {
        C39520e eVar = C39520e.f93965a;
        return eVar.mo93157d(this, j2, "PREFERENCE_KEY_HIDE_STO_BANNER_DATE:" + j, -1);
    }

    /* renamed from: b */
    public void mo68901b(long j, long j2) {
        C39520e eVar = C39520e.f93965a;
        C39520e.m114862n(eVar, this, j2, "PREFERENCE_KEY_HIDE_PIGGY_BANK_BANNER_DATE:" + j, System.currentTimeMillis(), false, 8, (Object) null);
    }

    /* renamed from: c */
    public long mo68902c(long j, long j2) {
        C39520e eVar = C39520e.f93965a;
        return eVar.mo93157d(this, j2, "PREFERENCE_KEY_HIDE_PIGGY_BANK_BANNER_DATE:" + j, -1);
    }

    /* renamed from: d */
    public void mo68903d(long j, long j2) {
        C39520e eVar = C39520e.f93965a;
        C39520e.m114862n(eVar, this, j2, "PREFERENCE_KEY_HIDE_STO_BANNER_DATE:" + j, System.currentTimeMillis(), false, 8, (Object) null);
    }

    public SharedPreferences getSharedPreferences() {
        return this.f74020d;
    }
}
