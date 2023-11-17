package gb1;

import android.app.Activity;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10220y;
import ha1.C15454a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.network.ConnectionFailedException;
import p420fh.C12902d;
import p434gh.C15278a;
import ue1.C43075l;

/* renamed from: gb1.v */
public abstract class C32392v {
    /* renamed from: c */
    public static final void m95651c(C1639v vVar, C1619q qVar, Activity activity) {
        C41536l.m120489i(vVar, "<this>");
        C41536l.m120489i(qVar, "owner");
        C41536l.m120489i(activity, "activity");
        vVar.mo4819k(qVar, new C32390t(activity));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m95652d(Activity activity, Throwable th) {
        String str;
        C41536l.m120489i(activity, "$activity");
        C12902d e = C12902d.C12903a.m48771e(C12902d.f38098b, activity, false, 2, (Object) null);
        if (th instanceof ConnectionFailedException) {
            str = activity.getString(C10220y.no_internet);
        } else if (th instanceof ApiException) {
            str = ((ApiException) th).getErrorMessage();
        } else {
            str = "Something went wrong\n" + th.getMessage();
        }
        if (str == null) {
            str = "";
        }
        e.mo33652k(str, C15278a.NEGATIVE, C12902d.C12905b.C12907b.f38104a);
    }

    /* renamed from: e */
    public static final void m95653e(LiveData liveData, C1619q qVar, C43075l lVar, C43075l lVar2, C43075l lVar3) {
        C41536l.m120489i(liveData, "<this>");
        C41536l.m120489i(qVar, "owner");
        liveData.mo4819k(qVar, new C32391u(lVar2, lVar, lVar3, qVar, liveData));
    }

    /* renamed from: f */
    public static /* synthetic */ void m95654f(LiveData liveData, C1619q qVar, C43075l lVar, C43075l lVar2, C43075l lVar3, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            lVar2 = null;
        }
        if ((i & 8) != 0) {
            lVar3 = null;
        }
        m95653e(liveData, qVar, lVar, lVar2, lVar3);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m95655g(C43075l lVar, C43075l lVar2, C43075l lVar3, C1619q qVar, LiveData liveData, C35947l lVar4) {
        C41536l.m120489i(qVar, "$owner");
        C41536l.m120489i(liveData, "$this_observe");
        if (lVar4 instanceof C35947l.C35950c) {
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        } else if (lVar4 instanceof C35947l.C35951d) {
            if (lVar2 != null) {
                Object a = ((C35947l.C35951d) lVar4).mo88520a();
                C41536l.m120486f(a);
                lVar2.invoke(a);
            }
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        } else if (lVar4 instanceof C35947l.C35949b) {
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
            if (lVar3 != null) {
                C41536l.m120488h(lVar4, "it");
                lVar3.invoke(lVar4);
            } else if (qVar instanceof C15454a) {
                ((C15454a) qVar).mo42539S0(liveData);
            }
        }
    }

    /* renamed from: h */
    public static final void m95656h(C1644x xVar, Throwable th) {
        C41536l.m120489i(xVar, "<this>");
        if (th == null) {
            th = new Exception();
        }
        xVar.mo4823o(new C35947l.C35949b(th));
    }

    /* renamed from: i */
    public static final void m95657i(C1644x xVar) {
        C41536l.m120489i(xVar, "<this>");
        xVar.mo4823o(C35947l.C35950c.f86976a);
    }

    /* renamed from: j */
    public static final void m95658j(C1644x xVar) {
        C41536l.m120489i(xVar, "<this>");
        xVar.mo4823o(new C35947l.C35951d(C41238w.f97225a));
    }

    /* renamed from: k */
    public static final void m95659k(C1644x xVar, Object obj) {
        C41536l.m120489i(xVar, "<this>");
        xVar.mo4823o(new C35947l.C35951d(obj));
    }
}
