package l01;

import ed1.C40749p;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import md0.C26186e;
import n01.C37342a;
import ty0.C38894u;
import ue1.C43075l;
import xy0.C39948l;

/* renamed from: l01.h */
public final class C37054h {

    /* renamed from: a */
    private final C38894u f89207a;

    /* renamed from: b */
    private final C37342a f89208b;

    /* renamed from: l01.h$a */
    /* synthetic */ class C37055a extends C41535k implements C43075l {
        C37055a(Object obj) {
            super(1, obj, C37342a.class, "convert", "convert(Lge/bog/mobilebank/products/domain/model/CreditCardsWrapper;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(C39948l lVar) {
            C41536l.m120489i(lVar, "p0");
            return ((C37342a) this.receiver).mo90424a(lVar);
        }
    }

    public C37054h(C38894u uVar, C37342a aVar) {
        C41536l.m120489i(uVar, "getCreditCardsAndDetailsUseCase");
        C41536l.m120489i(aVar, "mapper");
        this.f89207a = uVar;
        this.f89208b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m109578c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40749p mo89971b() {
        C40749p k0 = C26186e.m81987e(C38894u.m113714b(this.f89207a, false, 1, (Object) null)).mo95026k0(new C37053g(new C37055a(this.f89208b)));
        C41536l.m120488h(k0, "getCreditCardsAndDetails…ap().map(mapper::convert)");
        return k0;
    }
}
