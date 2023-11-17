package p229r1;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import p262t8.C8421a;

/* renamed from: r1.b */
public final /* synthetic */ class C8041b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ConstraintTrackingWorker f23188d;

    /* renamed from: e */
    public final /* synthetic */ C8421a f23189e;

    public /* synthetic */ C8041b(ConstraintTrackingWorker constraintTrackingWorker, C8421a aVar) {
        this.f23188d = constraintTrackingWorker;
        this.f23189e = aVar;
    }

    public final void run() {
        ConstraintTrackingWorker.m8041e(this.f23188d, this.f23189e);
    }
}
