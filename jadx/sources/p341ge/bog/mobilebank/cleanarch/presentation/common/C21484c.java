package p341ge.bog.mobilebank.cleanarch.presentation.common;

import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.c */
public abstract class C21484c {
    /* renamed from: b */
    public static final boolean m69410b(C1644x xVar) {
        C41536l.m120489i(xVar, "<this>");
        if (xVar.mo4814f() == null || (!(xVar.mo4814f() instanceof C21503d.C21505b) && !(xVar.mo4814f() instanceof C21503d.C21506c))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final void m69411c(LiveData liveData, C1619q qVar, C43075l lVar, C43075l lVar2, C43075l lVar3) {
        C41536l.m120489i(liveData, "<this>");
        C41536l.m120489i(qVar, "owner");
        liveData.mo4819k(qVar, new C21483b(lVar2, lVar, lVar3, qVar));
    }

    /* renamed from: d */
    public static /* synthetic */ void m69412d(LiveData liveData, C1619q qVar, C43075l lVar, C43075l lVar2, C43075l lVar3, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            lVar2 = null;
        }
        if ((i & 8) != 0) {
            lVar3 = null;
        }
        m69411c(liveData, qVar, lVar, lVar2, lVar3);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m69413e(C43075l lVar, C43075l lVar2, C43075l lVar3, C1619q qVar, C21503d dVar) {
        C41536l.m120489i(qVar, "$owner");
        if (dVar instanceof C21503d.C21505b) {
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        } else if (dVar instanceof C21503d.C21506c) {
            if (lVar2 != null) {
                Object a = dVar.mo53701a();
                C41536l.m120486f(a);
                lVar2.invoke(a);
            }
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        } else if (dVar instanceof C21503d.C21504a) {
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
            if (lVar3 != null) {
                C41536l.m120488h(dVar, "it");
                lVar3.invoke(dVar);
            } else if (qVar instanceof C35388f2) {
                ((C35388f2) qVar).mo52674G1((C21503d.C21504a) dVar);
            } else if (qVar instanceof C35651n1) {
                ((C35651n1) qVar).handleError((C21503d.C21504a) dVar);
            }
        }
    }

    /* renamed from: f */
    public static final void m69414f(C1644x xVar, Throwable th, Object obj) {
        C41536l.m120489i(xVar, "<this>");
        xVar.mo4823o(new C21503d.C21504a(th, obj));
    }

    /* renamed from: g */
    public static /* synthetic */ void m69415g(C1644x xVar, Throwable th, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        m69414f(xVar, th, obj);
    }

    /* renamed from: h */
    public static final void m69416h(C1644x xVar, Object obj) {
        C41536l.m120489i(xVar, "<this>");
        xVar.mo4823o(new C21503d.C21505b(obj));
    }

    /* renamed from: i */
    public static /* synthetic */ void m69417i(C1644x xVar, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        m69416h(xVar, obj);
    }

    /* renamed from: j */
    public static final void m69418j(C1644x xVar, Object obj) {
        C41536l.m120489i(xVar, "<this>");
        xVar.mo4823o(new C21503d.C21506c(obj));
    }
}
