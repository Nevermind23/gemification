package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.C2068l;
import androidx.work.C2073m;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C2007e0;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import p190o1.C7362a0;
import p190o1.C7379j;
import p190o1.C7388o;
import p190o1.C7402w;
import p229r1.C8043d;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(workerParameters, "parameters");
    }

    public C2068l.C2069a doWork() {
        C2007e0 n = C2007e0.m7860n(getApplicationContext());
        C41536l.m120488h(n, "getInstance(applicationContext)");
        WorkDatabase s = n.mo6828s();
        C41536l.m120488h(s, "workManager.workDatabase");
        C7402w N = s.mo6751N();
        C7388o L = s.mo6749L();
        C7362a0 O = s.mo6752O();
        C7379j K = s.mo6748K();
        List c = N.mo21802c(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List t = N.mo21819t();
        List m = N.mo21812m(BogInputLayout.INPUT_NORMAL_STATE);
        if (!c.isEmpty()) {
            C2073m.m8071e().mo6963f(C8043d.f23191a, "Recently completed work:\n\n");
            C2073m.m8071e().mo6963f(C8043d.f23191a, C8043d.m30543d(L, O, K, c));
        }
        if (!t.isEmpty()) {
            C2073m.m8071e().mo6963f(C8043d.f23191a, "Running work:\n\n");
            C2073m.m8071e().mo6963f(C8043d.f23191a, C8043d.m30543d(L, O, K, t));
        }
        if (!m.isEmpty()) {
            C2073m.m8071e().mo6963f(C8043d.f23191a, "Enqueued work:\n\n");
            C2073m.m8071e().mo6963f(C8043d.f23191a, C8043d.m30543d(L, O, K, m));
        }
        C2068l.C2069a c2 = C2068l.C2069a.m8067c();
        C41536l.m120488h(c2, "success()");
        return c2;
    }
}
