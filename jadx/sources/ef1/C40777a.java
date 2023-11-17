package ef1;

import kotlin.coroutines.Continuation;
import me1.C41752f;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ef1.a */
public abstract class C40777a extends C40871v1 implements Continuation, C40814h0 {

    /* renamed from: e */
    private final C41752f f96510e;

    public C40777a(C41752f fVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo95237g0((C40845o1) fVar.mo23736c(C40845o1.f96561d3));
        }
        this.f96510e = fVar.mo23741u(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo95125K0(Object obj) {
        mo95157G(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public void mo95126L0(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public String mo95127M() {
        return C40832l0.m118329a(this) + " was cancelled";
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public void mo95128M0(Object obj) {
    }

    /* renamed from: N0 */
    public final void mo95129N0(C40822j0 j0Var, Object obj, C43079p pVar) {
        j0Var.mo95171b(pVar, obj, this);
    }

    /* renamed from: Q */
    public C41752f mo4808Q() {
        return this.f96510e;
    }

    /* renamed from: b */
    public final C41752f mo94380b() {
        return this.f96510e;
    }

    /* renamed from: f0 */
    public final void mo95130f0(Throwable th) {
        C40810g0.m118295a(this.f96510e, th);
    }

    /* renamed from: h */
    public final void mo94382h(Object obj) {
        Object n0 = mo95240n0(C40782b0.m118255d(obj, (C43075l) null, 1, (Object) null));
        if (n0 != C40877w1.f96588b) {
            mo95125K0(n0);
        }
    }

    /* renamed from: k */
    public boolean mo95131k() {
        return super.mo95131k();
    }

    /* renamed from: p0 */
    public String mo95132p0() {
        String b = C40786c0.m118259b(this.f96510e);
        if (b == null) {
            return super.mo95132p0();
        }
        return '\"' + b + "\":" + super.mo95132p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public final void mo95133u0(Object obj) {
        if (obj instanceof C40881y) {
            C40881y yVar = (C40881y) obj;
            mo95126L0(yVar.f96602a, yVar.mo95265a());
            return;
        }
        mo95128M0(obj);
    }
}
