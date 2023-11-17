package p259t5;

import java.util.concurrent.Executor;
import p168m5.C7129p;
import p272u5.C8587d;
import p285v5.C8702a;

/* renamed from: t5.v */
public class C8396v {

    /* renamed from: a */
    private final Executor f23842a;

    /* renamed from: b */
    private final C8587d f23843b;

    /* renamed from: c */
    private final C8398x f23844c;

    /* renamed from: d */
    private final C8702a f23845d;

    C8396v(Executor executor, C8587d dVar, C8398x xVar, C8702a aVar) {
        this.f23842a = executor;
        this.f23843b = dVar;
        this.f23844c = xVar;
        this.f23845d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m31515d() {
        for (C7129p b : this.f23843b.mo23949S()) {
            this.f23844c.mo23577b(b, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m31516e() {
        this.f23845d.mo23960c(new C8395u(this));
    }

    /* renamed from: c */
    public void mo23592c() {
        this.f23842a.execute(new C8394t(this));
    }
}
