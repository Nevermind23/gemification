package p348ag;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p375cf.C10415c;
import p652we.C18532c;
import p652we.C18549h;
import uh1.C43107b;

/* renamed from: ag.a */
public final class C9854a implements C18532c {

    /* renamed from: d */
    private final C10415c f26712d;

    public C9854a(C10415c cVar) {
        C41536l.m120489i(cVar, "lifecycleRegistry");
        this.f26712d = cVar;
    }

    /* renamed from: a */
    public void mo26347a(C43107b bVar) {
        this.f26712d.mo26347a(bVar);
    }

    /* renamed from: b */
    public final void mo26348b() {
        this.f26712d.onNext(new C18532c.C18533a.C18536c.C18538b((C18549h) null, 1, (DefaultConstructorMarker) null));
    }

    /* renamed from: c */
    public final void mo26349c() {
        this.f26712d.onNext(C18532c.C18533a.C18535b.f52030a);
    }

    public C9854a() {
        this(new C10415c(0, 1, (DefaultConstructorMarker) null));
    }
}
