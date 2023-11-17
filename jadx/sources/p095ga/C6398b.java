package p095ga;

import android.content.Context;
import com.google.firebase.C5270e;
import com.google.firebase.C5298l;
import com.google.firebase.perf.application.C5374a;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

/* renamed from: ga.b */
public class C6398b {
    public C6398b(C5270e eVar, C5298l lVar, Executor executor) {
        Context j = eVar.mo17481j();
        C5380a.m21272g().mo17719O(j);
        C5374a b = C5374a.m21231b();
        b.mo17678i(j);
        b.mo17679j(new C6402f());
        if (lVar != null) {
            AppStartTrace n = AppStartTrace.m21418n();
            n.mo17775x(j);
            executor.execute(new AppStartTrace.C5409c(n));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
