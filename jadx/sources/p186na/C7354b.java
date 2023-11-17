package p186na;

import android.content.Context;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;

/* renamed from: na.b */
public final /* synthetic */ class C7354b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SessionManager f21560d;

    /* renamed from: e */
    public final /* synthetic */ Context f21561e;

    /* renamed from: f */
    public final /* synthetic */ PerfSession f21562f;

    public /* synthetic */ C7354b(SessionManager sessionManager, Context context, PerfSession perfSession) {
        this.f21560d = sessionManager;
        this.f21561e = context;
        this.f21562f = perfSession;
    }

    public final void run() {
        this.f21560d.lambda$setApplicationContext$0(this.f21561e, this.f21562f);
    }
}
