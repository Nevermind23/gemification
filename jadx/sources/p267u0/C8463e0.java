package p267u0;

import he1.C41217g;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p318y0.C9008m;
import ue1.C43064a;

/* renamed from: u0.e0 */
public abstract class C8463e0 {

    /* renamed from: a */
    private final C8503w f24056a;

    /* renamed from: b */
    private final AtomicBoolean f24057b = new AtomicBoolean(false);

    /* renamed from: c */
    private final C41217g f24058c = C41219i.m119470b(new C8464a(this));

    /* renamed from: u0.e0$a */
    static final class C8464a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C8463e0 f24059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8464a(C8463e0 e0Var) {
            super(0);
            this.f24059d = e0Var;
        }

        /* renamed from: b */
        public final C9008m invoke() {
            return this.f24059d.m31731d();
        }
    }

    public C8463e0(C8503w wVar) {
        C41536l.m120489i(wVar, "database");
        this.f24056a = wVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C9008m m31731d() {
        return this.f24056a.mo23808f(mo21745e());
    }

    /* renamed from: f */
    private final C9008m m31732f() {
        return (C9008m) this.f24058c.getValue();
    }

    /* renamed from: g */
    private final C9008m m31733g(boolean z) {
        if (z) {
            return m31732f();
        }
        return m31731d();
    }

    /* renamed from: b */
    public C9008m mo23725b() {
        mo23726c();
        return m31733g(this.f24057b.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo23726c() {
        this.f24056a.mo23805c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo21745e();

    /* renamed from: h */
    public void mo23727h(C9008m mVar) {
        C41536l.m120489i(mVar, "statement");
        if (mVar == m31732f()) {
            this.f24057b.set(false);
        }
    }
}
