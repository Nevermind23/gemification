package p694ze;

import fe1.C40940a;
import kotlin.jvm.internal.C41536l;
import p652we.C18523b;
import p652we.C18561l;
import p680ye.C18881a;

/* renamed from: ze.c */
public final class C19017c extends C40940a {

    /* renamed from: e */
    private final C18881a.C18884b f53119e;

    public C19017c(C18881a.C18884b bVar) {
        C41536l.m120490j(bVar, "stateManager");
        this.f53119e = bVar;
    }

    /* renamed from: e */
    public Void onError(Throwable th) {
        C41536l.m120490j(th, "throwable");
        throw th;
    }

    /* renamed from: f */
    public void onNext(C18561l.C18562a aVar) {
        C41536l.m120490j(aVar, "webSocketEvent");
        this.f53119e.mo46882n(new C18523b.C18529d.C18530a(aVar));
    }

    public void onComplete() {
        this.f53119e.mo46882n(C18523b.C18529d.C18531b.f52028a);
    }
}
