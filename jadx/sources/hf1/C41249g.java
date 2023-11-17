package hf1;

import gf1.C41097e;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C41556a;
import kotlinx.coroutines.flow.C41557b;
import me1.C41752f;
import me1.C41758g;

/* renamed from: hf1.g */
public final class C41249g extends C41247f {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41249g(C41556a aVar, C41752f fVar, int i, C41097e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i2 & 2) != 0 ? C41758g.f98029d : fVar, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? C41097e.SUSPEND : eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C41243d mo95711h(C41752f fVar, int i, C41097e eVar) {
        return new C41249g(this.f97242d, fVar, i, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Object mo95718o(C41557b bVar, Continuation continuation) {
        Object a = this.f97242d.mo95707a(bVar, continuation);
        return a == C41793d.m121157c() ? a : C41238w.f97225a;
    }

    public C41249g(C41556a aVar, C41752f fVar, int i, C41097e eVar) {
        super(aVar, fVar, i, eVar);
    }
}
