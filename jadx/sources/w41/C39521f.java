package w41;

import android.content.SharedPreferences;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;

/* renamed from: w41.f */
public final class C39521f {

    /* renamed from: a */
    public static final C39521f f93966a = new C39521f();

    private C39521f() {
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m114876b(C39521f fVar, SharedPreferences sharedPreferences, long j, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return fVar.mo93166a(sharedPreferences, j, str, z);
    }

    /* renamed from: h */
    public static /* synthetic */ void m114877h(C39521f fVar, SharedPreferences sharedPreferences, long j, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        fVar.mo93171g(sharedPreferences, j, str, z, z2);
    }

    /* renamed from: j */
    public static /* synthetic */ void m114878j(C39521f fVar, SharedPreferences sharedPreferences, long j, String str, long j2, boolean z, int i, Object obj) {
        fVar.mo93172i(sharedPreferences, j, str, j2, (i & 8) != 0 ? false : z);
    }

    /* renamed from: l */
    public static /* synthetic */ void m114879l(C39521f fVar, SharedPreferences sharedPreferences, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        fVar.mo93173k(sharedPreferences, str, str2, z);
    }

    /* renamed from: n */
    public static /* synthetic */ void m114880n(C39521f fVar, SharedPreferences sharedPreferences, long j, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        fVar.mo93174m(sharedPreferences, j, str, str2, z);
    }

    /* renamed from: a */
    public final boolean mo93166a(SharedPreferences sharedPreferences, long j, String str, boolean z) {
        C41536l.m120489i(sharedPreferences, "<this>");
        C41536l.m120489i(str, "prefKey");
        return sharedPreferences.getBoolean(j + ":" + str, z);
    }

    /* renamed from: c */
    public final long mo93167c(SharedPreferences sharedPreferences, long j, String str, long j2) {
        C41536l.m120489i(sharedPreferences, "<this>");
        C41536l.m120489i(str, "prefKey");
        return sharedPreferences.getLong(j + ":" + str, j2);
    }

    /* renamed from: d */
    public final String mo93168d(SharedPreferences sharedPreferences, long j, String str, String str2) {
        C41536l.m120489i(sharedPreferences, "<this>");
        C41536l.m120489i(str, "prefKey");
        String string = sharedPreferences.getString(j + ":" + str, str2);
        if (string == null) {
            return str2;
        }
        return string;
    }

    /* renamed from: e */
    public final void mo93169e(SharedPreferences sharedPreferences, String str) {
        C41536l.m120489i(sharedPreferences, "<this>");
        C41536l.m120489i(str, "prefKey");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C41536l.m120488h(edit, "editor");
        edit.remove(str);
        edit.apply();
    }

    /* renamed from: f */
    public final void mo93170f(SharedPreferences sharedPreferences, String str, boolean z, boolean z2) {
        C41536l.m120489i(sharedPreferences, "<this>");
        C41536l.m120489i(str, "prefKey");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C41536l.m120488h(edit, "editor");
        edit.putBoolean(str, z);
        if (z2) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    /* renamed from: g */
    public final void mo93171g(SharedPreferences sharedPreferences, long j, String str, boolean z, boolean z2) {
        C41536l.m120489i(sharedPreferences, "<this>");
        C41536l.m120489i(str, "prefKey");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C41536l.m120488h(edit, "editor");
        edit.putBoolean(j + ":" + str, z);
        if (z2) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    /* renamed from: i */
    public final void mo93172i(SharedPreferences sharedPreferences, long j, String str, long j2, boolean z) {
        C41536l.m120489i(sharedPreferences, "<this>");
        C41536l.m120489i(str, "prefKey");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C41536l.m120488h(edit, "editor");
        edit.putLong(j + ":" + str, j2);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    /* renamed from: k */
    public final void mo93173k(SharedPreferences sharedPreferences, String str, String str2, boolean z) {
        C41536l.m120489i(sharedPreferences, "<this>");
        C41536l.m120489i(str, "prefKey");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C41536l.m120488h(edit, "editor");
        edit.putString(str, str2);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    /* renamed from: m */
    public final void mo93174m(SharedPreferences sharedPreferences, long j, String str, String str2, boolean z) {
        C41536l.m120489i(sharedPreferences, "<this>");
        C41536l.m120489i(str, "prefKey");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C41536l.m120488h(edit, "editor");
        edit.putString(j + ":" + str, str2);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
