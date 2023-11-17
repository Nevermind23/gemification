package p160la;

import p134ja.C6763a;
import p225qa.C7953c;

/* renamed from: la.a */
public class C7030a extends C7034e {

    /* renamed from: b */
    private static final C6763a f20937b = C6763a.m26371e();

    /* renamed from: a */
    private final C7953c f20938a;

    C7030a(C7953c cVar) {
        this.f20938a = cVar;
    }

    /* renamed from: g */
    private boolean m27209g() {
        C7953c cVar = this.f20938a;
        if (cVar == null) {
            f20937b.mo20812j("ApplicationInfo is null");
            return false;
        } else if (!cVar.mo23039e0()) {
            f20937b.mo20812j("GoogleAppId is null");
            return false;
        } else if (!this.f20938a.mo23037c0()) {
            f20937b.mo20812j("AppInstanceId is null");
            return false;
        } else if (!this.f20938a.mo23038d0()) {
            f20937b.mo20812j("ApplicationProcessState is null");
            return false;
        } else if (!this.f20938a.mo23036b0()) {
            return true;
        } else {
            if (!this.f20938a.mo23035Y().mo23028X()) {
                f20937b.mo20812j("AndroidAppInfo.packageName is null");
                return false;
            } else if (this.f20938a.mo23035Y().mo23029Y()) {
                return true;
            } else {
                f20937b.mo20812j("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        }
    }

    /* renamed from: c */
    public boolean mo21243c() {
        if (m27209g()) {
            return true;
        }
        f20937b.mo20812j("ApplicationInfo is invalid");
        return false;
    }
}
