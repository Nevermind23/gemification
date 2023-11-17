package we0;

import ed1.C40762x;
import hf0.C24982a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.galtandtaggart.data.model.MarketStatus;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.MarketInfo;
import ue1.C43075l;

/* renamed from: we0.u */
public final class C29362u {

    /* renamed from: a */
    private final C24982a f74446a;

    /* renamed from: we0.u$a */
    static final class C29363a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29363a f74447d = new C29363a();

        C29363a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(MarketInfo marketInfo) {
            boolean z;
            C41536l.m120489i(marketInfo, "it");
            if (marketInfo.getStatus() == MarketStatus.OPEN) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C29362u(C24982a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f74446a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final Boolean m89441c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo69210b() {
        C40762x A = this.f74446a.mo59121z2().mo95062A(new C29361t(C29363a.f74447d));
        C41536l.m120488h(A, "repository.getMarketInfo…us == MarketStatus.OPEN }");
        return A;
    }
}
