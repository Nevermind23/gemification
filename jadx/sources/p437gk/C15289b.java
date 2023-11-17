package p437gk;

import android.app.Activity;
import android.content.Intent;
import g91.C32343x;
import he1.C41238w;
import j41.C36728a;
import j51.C36741m;
import j51.C36742n;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.p975ui.activities.LauncherActivity;
import p341ge.bog.mobilebank.shared2.session.SessionManager;
import ue1.C43075l;

/* renamed from: gk.b */
public final class C15289b implements C36728a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final SessionManager f43675a;

    /* renamed from: b */
    private final C36741m f43676b;

    /* renamed from: gk.b$a */
    static final class C15290a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15289b f43677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15290a(C15289b bVar) {
            super(1);
            this.f43677d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "loggedIn");
            if (bool.booleanValue()) {
                this.f43677d.f43675a.mo84764w(true);
            }
        }
    }

    public C15289b(SessionManager sessionManager, C36741m mVar, C36742n nVar) {
        C41536l.m120489i(sessionManager, "sessionManager");
        C41536l.m120489i(mVar, "logOut");
        C41536l.m120489i(nVar, "loginObservable");
        this.f43675a = sessionManager;
        this.f43676b = mVar;
        C32343x.m95413R0(nVar.mo89567a()).mo94981F0(new C15288a(new C15290a(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m55683d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: a */
    public void mo42368a(Activity activity) {
        C41536l.m120489i(activity, "caller");
        this.f43676b.mo89566a();
        Intent intent = new Intent(activity, LauncherActivity.class);
        intent.setFlags(268468224);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: b */
    public void mo42369b(Activity activity, int i, int i2, Intent intent) {
        C41536l.m120489i(activity, "caller");
        if (i == 421) {
            if (i2 == -1) {
                this.f43675a.mo84764w(true);
            } else {
                mo42368a(activity);
            }
        }
    }
}
