package bh1;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1630r0;
import kotlin.jvm.internal.C41536l;
import p163m0.C7047a;
import ph1.C42203a;
import yg1.C43401b;

/* renamed from: bh1.a */
public final class C40385a implements C1620q0.C1624b {

    /* renamed from: a */
    private final C42203a f95962a;

    /* renamed from: b */
    private final C43401b f95963b;

    public C40385a(C42203a aVar, C43401b bVar) {
        C41536l.m120489i(aVar, "scope");
        C41536l.m120489i(bVar, "parameters");
        this.f95962a = aVar;
        this.f95963b = bVar;
    }

    /* renamed from: a */
    public /* synthetic */ C1613n0 mo4803a(Class cls, C7047a aVar) {
        return C1630r0.m5685b(this, cls, aVar);
    }

    /* renamed from: b */
    public C1613n0 mo4804b(Class cls) {
        C41536l.m120489i(cls, "modelClass");
        Object g = this.f95962a.mo97675g(this.f95963b.mo102077a(), this.f95963b.mo102080d(), this.f95963b.mo102079c());
        if (g != null) {
            return (C1613n0) g;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }
}
