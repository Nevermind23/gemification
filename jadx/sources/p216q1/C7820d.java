package p216q1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p203p1.C7657u;

/* renamed from: q1.d */
public class C7820d implements C7819c {

    /* renamed from: a */
    private final C7657u f22741a;

    /* renamed from: b */
    final Handler f22742b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f22743c = new C7821a();

    /* renamed from: q1.d$a */
    class C7821a implements Executor {
        C7821a() {
        }

        public void execute(Runnable runnable) {
            C7820d.this.f22742b.post(runnable);
        }
    }

    public C7820d(Executor executor) {
        this.f22741a = new C7657u(executor);
    }

    /* renamed from: a */
    public Executor mo22737a() {
        return this.f22743c;
    }

    /* renamed from: c */
    public /* synthetic */ void mo22739c(Runnable runnable) {
        C7818b.m29736a(this, runnable);
    }

    /* renamed from: d */
    public C7657u mo22738b() {
        return this.f22741a;
    }
}
