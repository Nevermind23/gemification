package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.C2068l;
import androidx.work.C2073m;
import androidx.work.WorkerParameters;
import androidx.work.impl.C2007e0;
import androidx.work.impl.utils.futures.C2059c;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p151l1.C6863c;
import p151l1.C6865e;
import p177n1.C7215o;
import p190o1.C7399v;
import p190o1.C7402w;
import p229r1.C8040a;
import p229r1.C8041b;
import p229r1.C8042c;
import p262t8.C8421a;

public final class ConstraintTrackingWorker extends C2068l implements C6863c {

    /* renamed from: f */
    private final WorkerParameters f6198f;

    /* renamed from: g */
    private final Object f6199g = new Object();

    /* renamed from: h */
    private volatile boolean f6200h;

    /* renamed from: i */
    private final C2059c f6201i = C2059c.m8028t();

    /* renamed from: j */
    private C2068l f6202j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C41536l.m120489i(context, "appContext");
        C41536l.m120489i(workerParameters, "workerParameters");
        this.f6198f = workerParameters;
    }

    /* renamed from: d */
    private final void m8040d() {
        boolean z;
        if (!this.f6201i.isCancelled()) {
            String j = getInputData().mo6730j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            C2073m e = C2073m.m8071e();
            C41536l.m120488h(e, "get()");
            if (j == null || j.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                e.mo6961c(C8042c.f23190a, "No worker to delegate to.");
                C2059c cVar = this.f6201i;
                C41536l.m120488h(cVar, "future");
                boolean unused = C8042c.m30538d(cVar);
                return;
            }
            C2068l b = getWorkerFactory().mo6996b(getApplicationContext(), j, this.f6198f);
            this.f6202j = b;
            if (b == null) {
                e.mo6959a(C8042c.f23190a, "No worker to delegate to.");
                C2059c cVar2 = this.f6201i;
                C41536l.m120488h(cVar2, "future");
                boolean unused2 = C8042c.m30538d(cVar2);
                return;
            }
            C2007e0 n = C2007e0.m7860n(getApplicationContext());
            C41536l.m120488h(n, "getInstance(applicationContext)");
            C7402w N = n.mo6828s().mo6751N();
            String uuid = getId().toString();
            C41536l.m120488h(uuid, "id.toString()");
            C7399v i = N.mo21808i(uuid);
            if (i == null) {
                C2059c cVar3 = this.f6201i;
                C41536l.m120488h(cVar3, "future");
                boolean unused3 = C8042c.m30538d(cVar3);
                return;
            }
            C7215o r = n.mo6827r();
            C41536l.m120488h(r, "workManagerImpl.trackers");
            C6865e eVar = new C6865e(r, (C6863c) this);
            eVar.mo20942b(C41339p.m119900e(i));
            String uuid2 = getId().toString();
            C41536l.m120488h(uuid2, "id.toString()");
            if (eVar.mo20945e(uuid2)) {
                String a = C8042c.f23190a;
                e.mo6959a(a, "Constraints met for delegate " + j);
                try {
                    C2068l lVar = this.f6202j;
                    C41536l.m120486f(lVar);
                    C8421a startWork = lVar.startWork();
                    C41536l.m120488h(startWork, "delegate!!.startWork()");
                    startWork.mo2810c(new C8041b(this, startWork), getBackgroundExecutor());
                } catch (Throwable th) {
                    String a2 = C8042c.f23190a;
                    e.mo6960b(a2, "Delegated worker " + j + " threw exception in startWork.", th);
                    synchronized (this.f6199g) {
                        if (this.f6200h) {
                            e.mo6959a(C8042c.f23190a, "Constraints were unmet, Retrying.");
                            C2059c cVar4 = this.f6201i;
                            C41536l.m120488h(cVar4, "future");
                            boolean unused4 = C8042c.m30539e(cVar4);
                        } else {
                            C2059c cVar5 = this.f6201i;
                            C41536l.m120488h(cVar5, "future");
                            boolean unused5 = C8042c.m30538d(cVar5);
                        }
                    }
                }
            } else {
                String a3 = C8042c.f23190a;
                e.mo6959a(a3, "Constraints not met for delegate " + j + ". Requesting retry.");
                C2059c cVar6 = this.f6201i;
                C41536l.m120488h(cVar6, "future");
                boolean unused6 = C8042c.m30539e(cVar6);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m8041e(ConstraintTrackingWorker constraintTrackingWorker, C8421a aVar) {
        C41536l.m120489i(constraintTrackingWorker, "this$0");
        C41536l.m120489i(aVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f6199g) {
            if (constraintTrackingWorker.f6200h) {
                C2059c cVar = constraintTrackingWorker.f6201i;
                C41536l.m120488h(cVar, "future");
                boolean unused = C8042c.m30539e(cVar);
            } else {
                constraintTrackingWorker.f6201i.mo6898r(aVar);
            }
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m8042g(ConstraintTrackingWorker constraintTrackingWorker) {
        C41536l.m120489i(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.m8040d();
    }

    /* renamed from: b */
    public void mo6783b(List list) {
        C41536l.m120489i(list, "workSpecs");
        C2073m e = C2073m.m8071e();
        String a = C8042c.f23190a;
        e.mo6959a(a, "Constraints changed for " + list);
        synchronized (this.f6199g) {
            this.f6200h = true;
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: f */
    public void mo6784f(List list) {
        C41536l.m120489i(list, "workSpecs");
    }

    public void onStopped() {
        super.onStopped();
        C2068l lVar = this.f6202j;
        if (lVar != null && !lVar.isStopped()) {
            lVar.stop();
        }
    }

    public C8421a startWork() {
        getBackgroundExecutor().execute(new C8040a(this));
        C2059c cVar = this.f6201i;
        C41536l.m120488h(cVar, "future");
        return cVar;
    }
}
