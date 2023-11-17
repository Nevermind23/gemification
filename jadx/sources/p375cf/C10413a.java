package p375cf;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p652we.C18532c;
import uh1.C43107b;

/* renamed from: cf.a */
public final class C10413a implements C18532c {

    /* renamed from: d */
    private final C10415c f29619d;

    public C10413a(C10415c cVar) {
        C41536l.m120490j(cVar, "lifecycleRegistry");
        this.f29619d = cVar;
        cVar.onNext(C18532c.C18533a.C18535b.f52030a);
    }

    /* renamed from: a */
    public void mo26347a(C43107b bVar) {
        this.f29619d.mo26347a(bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10413a(C10415c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C10415c(0, 1, (DefaultConstructorMarker) null) : cVar);
    }
}
