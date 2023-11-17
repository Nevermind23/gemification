package da1;

import ba1.C10146d0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35962r;

/* renamed from: da1.b */
public abstract class C12030b {

    /* renamed from: a */
    private final C12038f f35401a;

    /* renamed from: b */
    private C12030b f35402b;

    public C12030b(C12038f fVar) {
        C41536l.m120489i(fVar, "context");
        this.f35401a = fVar;
    }

    /* renamed from: a */
    public abstract void mo32123a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo32124b() {
        if (C41536l.m120484d(C10146d0.C10159c.m37143b(), C35962r.m107006d())) {
            throw new IllegalArgumentException("Invalid session");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C12038f mo32125c() {
        return this.f35401a;
    }

    /* renamed from: d */
    public final C12030b mo32126d(C12030b bVar) {
        if (bVar == null) {
            return this;
        }
        this.f35402b = bVar;
        return bVar;
    }

    /* renamed from: e */
    public final void mo32127e() {
        C12030b bVar = this.f35402b;
        if (bVar != null) {
            bVar.mo32123a();
        }
    }
}
