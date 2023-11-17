package p306x0;

import android.os.Bundle;
import androidx.lifecycle.C1593j;
import androidx.savedstate.C1846a;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: x0.c */
public final class C8931c {

    /* renamed from: d */
    public static final C8932a f24933d = new C8932a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C8933d f24934a;

    /* renamed from: b */
    private final C1846a f24935b;

    /* renamed from: c */
    private boolean f24936c;

    /* renamed from: x0.c$a */
    public static final class C8932a {
        private C8932a() {
        }

        public /* synthetic */ C8932a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C8931c mo24352a(C8933d dVar) {
            C41536l.m120489i(dVar, "owner");
            return new C8931c(dVar, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C8931c(C8933d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar);
    }

    /* renamed from: a */
    public static final C8931c m33145a(C8933d dVar) {
        return f24933d.mo24352a(dVar);
    }

    /* renamed from: b */
    public final C1846a mo24348b() {
        return this.f24935b;
    }

    /* renamed from: c */
    public final void mo24349c() {
        boolean z;
        C1593j lifecycle = this.f24934a.getLifecycle();
        if (lifecycle.mo4907b() == C1593j.C1598b.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lifecycle.mo4906a(new Recreator(this.f24934a));
            this.f24935b.mo6113e(lifecycle);
            this.f24936c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    /* renamed from: d */
    public final void mo24350d(Bundle bundle) {
        if (!this.f24936c) {
            mo24349c();
        }
        C1593j lifecycle = this.f24934a.getLifecycle();
        if (!lifecycle.mo4907b().mo4914b(C1593j.C1598b.STARTED)) {
            this.f24935b.mo6114f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo4907b()).toString());
    }

    /* renamed from: e */
    public final void mo24351e(Bundle bundle) {
        C41536l.m120489i(bundle, "outBundle");
        this.f24935b.mo6115g(bundle);
    }

    private C8931c(C8933d dVar) {
        this.f24934a = dVar;
        this.f24935b = new C1846a();
    }
}
