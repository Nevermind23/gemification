package p843nw;

import ed1.C40749p;
import j70.C25341c;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import md0.C26186e;
import o70.C26766e;
import p853ow.C27092a;
import p863pw.C27637o;
import ue1.C43075l;

/* renamed from: nw.o */
public final class C26633o {

    /* renamed from: a */
    private final C25341c f67257a;

    /* renamed from: b */
    private final C27092a f67258b;

    /* renamed from: nw.o$a */
    /* synthetic */ class C26634a extends C41535k implements C43075l {
        C26634a(Object obj) {
            super(1, obj, C27092a.class, "convert", "convert(Lge/bog/mobilebank/cleanarch/shareddomain/model/cards/CardsAndDetailsModel;)Lge/bog/mobilebank/cleanarch/domain/products/model/CardsAndDetails;", 0);
        }

        /* renamed from: b */
        public final C27637o invoke(C26766e eVar) {
            C41536l.m120489i(eVar, "p0");
            return ((C27092a) this.receiver).mo66375n(eVar);
        }
    }

    public C26633o(C25341c cVar, C27092a aVar) {
        C41536l.m120489i(cVar, "getCardsAndDetails");
        C41536l.m120489i(aVar, "mapper");
        this.f67257a = cVar;
        this.f67258b = aVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C40749p m83102d(C26633o oVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return oVar.mo65886c(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C27637o m83103e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27637o) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40749p mo65885b() {
        return m83102d(this, false, 1, (Object) null);
    }

    /* renamed from: c */
    public final C40749p mo65886c(boolean z) {
        C40749p k0 = C26186e.m81987e(this.f67257a.mo63909a(z)).mo95026k0(new C26632n(new C26634a(this.f67258b)));
        C41536l.m120488h(k0, "getCardsAndDetails(refre…ap().map(mapper::convert)");
        return k0;
    }
}
