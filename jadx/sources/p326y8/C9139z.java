package p326y8;

import p327y9.C9140a;
import p327y9.C9142b;

/* renamed from: y8.z */
class C9139z implements C9142b, C9140a {

    /* renamed from: c */
    private static final C9140a.C9141a f25333c = new C9136w();

    /* renamed from: d */
    private static final C9142b f25334d = new C9137x();

    /* renamed from: a */
    private C9140a.C9141a f25335a;

    /* renamed from: b */
    private volatile C9142b f25336b;

    private C9139z(C9140a.C9141a aVar, C9142b bVar) {
        this.f25335a = aVar;
        this.f25336b = bVar;
    }

    /* renamed from: e */
    static C9139z m33696e() {
        return new C9139z(f25333c, f25334d);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m33697f(C9142b bVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m33698g() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m33699h(C9140a.C9141a aVar, C9140a.C9141a aVar2, C9142b bVar) {
        aVar.mo123a(bVar);
        aVar2.mo123a(bVar);
    }

    /* renamed from: i */
    static C9139z m33700i(C9142b bVar) {
        return new C9139z((C9140a.C9141a) null, bVar);
    }

    /* renamed from: a */
    public void mo24710a(C9140a.C9141a aVar) {
        C9142b bVar;
        C9142b bVar2;
        C9142b bVar3 = this.f25336b;
        C9142b bVar4 = f25334d;
        if (bVar3 != bVar4) {
            aVar.mo123a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f25336b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                this.f25335a = new C9138y(this.f25335a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.mo123a(bVar);
        }
    }

    public Object get() {
        return this.f25336b.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo24711j(C9142b bVar) {
        C9140a.C9141a aVar;
        if (this.f25336b == f25334d) {
            synchronized (this) {
                aVar = this.f25335a;
                this.f25335a = null;
                this.f25336b = bVar;
            }
            aVar.mo123a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
