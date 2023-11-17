package p182n6;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p143k6.C6819b;
import p182n6.C7261h;
import p337z7.C9227g;

/* renamed from: n6.b0 */
final class C7248b0 implements C6819b.C6820a {

    /* renamed from: a */
    final /* synthetic */ C6819b f21433a;

    /* renamed from: b */
    final /* synthetic */ C9227g f21434b;

    /* renamed from: c */
    final /* synthetic */ C7261h.C7262a f21435c;

    /* renamed from: d */
    final /* synthetic */ C7253d0 f21436d;

    C7248b0(C6819b bVar, C9227g gVar, C7261h.C7262a aVar, C7253d0 d0Var) {
        this.f21433a = bVar;
        this.f21434b = gVar;
        this.f21435c = aVar;
        this.f21436d = d0Var;
    }

    /* renamed from: a */
    public final void mo12110a(Status status) {
        if (status.mo11905q0()) {
            this.f21434b.mo24885c(this.f21435c.mo11802a(this.f21433a.mo11971c(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f21434b.mo24884b(C7245a.m27851a(status));
    }
}
