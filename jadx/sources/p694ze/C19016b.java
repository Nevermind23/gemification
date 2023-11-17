package p694ze;

import fe1.C40940a;
import kotlin.jvm.internal.C41536l;
import p652we.C18523b;
import p680ye.C18881a;

/* renamed from: ze.b */
public final class C19016b extends C40940a {

    /* renamed from: e */
    private final C18881a.C18884b f53118e;

    public C19016b(C18881a.C18884b bVar) {
        C41536l.m120490j(bVar, "stateManager");
        this.f53118e = bVar;
    }

    /* renamed from: e */
    public Void onError(Throwable th) {
        C41536l.m120490j(th, "throwable");
        throw th;
    }

    /* renamed from: f */
    public void mo47179f(long j) {
        this.f53118e.mo46882n(C18523b.C18527b.f52025a);
    }

    public void onComplete() {
    }

    public /* bridge */ /* synthetic */ void onNext(Object obj) {
        mo47179f(((Number) obj).longValue());
    }
}
