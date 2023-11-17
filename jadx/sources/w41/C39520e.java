package w41;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import w41.C39517c;

/* renamed from: w41.e */
public final class C39520e {

    /* renamed from: a */
    public static final C39520e f93965a = new C39520e();

    private C39520e() {
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m114858b(C39520e eVar, C39517c.C39518a aVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return eVar.mo93155a(aVar, str, z);
    }

    /* renamed from: f */
    public static /* synthetic */ String m114859f(C39520e eVar, C39517c.C39518a aVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return eVar.mo93158e(aVar, str, str2);
    }

    /* renamed from: j */
    public static /* synthetic */ void m114860j(C39520e eVar, C39517c.C39518a aVar, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        eVar.mo93161i(aVar, str, z, z2);
    }

    /* renamed from: l */
    public static /* synthetic */ void m114861l(C39520e eVar, C39517c.C39518a aVar, long j, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        eVar.mo93162k(aVar, j, str, z, z2);
    }

    /* renamed from: n */
    public static /* synthetic */ void m114862n(C39520e eVar, C39517c.C39518a aVar, long j, String str, long j2, boolean z, int i, Object obj) {
        eVar.mo93163m(aVar, j, str, j2, (i & 8) != 0 ? false : z);
    }

    /* renamed from: p */
    public static /* synthetic */ void m114863p(C39520e eVar, C39517c.C39518a aVar, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        eVar.mo93164o(aVar, str, str2, z);
    }

    /* renamed from: r */
    public static /* synthetic */ void m114864r(C39520e eVar, C39517c.C39518a aVar, long j, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        eVar.mo93165q(aVar, j, str, str2, z);
    }

    /* renamed from: a */
    public final boolean mo93155a(C39517c.C39518a aVar, String str, boolean z) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        return aVar.getSharedPreferences().getBoolean(str, z);
    }

    /* renamed from: c */
    public final boolean mo93156c(C39517c.C39518a aVar, long j, String str, boolean z) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        return C39521f.f93966a.mo93166a(aVar.getSharedPreferences(), j, str, z);
    }

    /* renamed from: d */
    public final long mo93157d(C39517c.C39518a aVar, long j, String str, long j2) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        return C39521f.f93966a.mo93167c(aVar.getSharedPreferences(), j, str, j2);
    }

    /* renamed from: e */
    public final String mo93158e(C39517c.C39518a aVar, String str, String str2) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        String string = aVar.getSharedPreferences().getString(str, str2);
        if (string == null) {
            return str2;
        }
        return string;
    }

    /* renamed from: g */
    public final void mo93159g(C39517c.C39518a aVar, String str) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        C39521f.f93966a.mo93169e(aVar.getSharedPreferences(), str);
    }

    /* renamed from: h */
    public final void mo93160h(C39517c.C39518a aVar, long j, String str) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        mo93159g(aVar, j + ":" + str);
    }

    /* renamed from: i */
    public final void mo93161i(C39517c.C39518a aVar, String str, boolean z, boolean z2) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        C39521f.f93966a.mo93170f(aVar.getSharedPreferences(), str, z, z2);
    }

    /* renamed from: k */
    public final void mo93162k(C39517c.C39518a aVar, long j, String str, boolean z, boolean z2) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        C39521f.f93966a.mo93171g(aVar.getSharedPreferences(), j, str, z, z2);
    }

    /* renamed from: m */
    public final void mo93163m(C39517c.C39518a aVar, long j, String str, long j2, boolean z) {
        C39517c.C39518a aVar2 = aVar;
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        C39521f fVar = C39521f.f93966a;
        C39521f fVar2 = fVar;
        fVar2.mo93172i(aVar.getSharedPreferences(), j, str, j2, z);
    }

    /* renamed from: o */
    public final void mo93164o(C39517c.C39518a aVar, String str, String str2, boolean z) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        C39521f.f93966a.mo93173k(aVar.getSharedPreferences(), str, str2, z);
    }

    /* renamed from: q */
    public final void mo93165q(C39517c.C39518a aVar, long j, String str, String str2, boolean z) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(str, "prefKey");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        C39521f.f93966a.mo93174m(aVar.getSharedPreferences(), j, str, str2, z);
    }
}
