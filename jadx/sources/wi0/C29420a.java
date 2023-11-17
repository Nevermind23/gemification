package wi0;

import ii0.C25217c;
import java.math.BigDecimal;
import java.util.List;
import kj0.C25740a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel;

/* renamed from: wi0.a */
public final class C29420a {

    /* renamed from: a */
    private final C25217c f74508a;

    public C29420a(C25217c cVar) {
        C41536l.m120489i(cVar, "defineLanguage");
        this.f74508a = cVar;
    }

    /* renamed from: a */
    public final GiftCardsMerchantAnimationsModel mo69259a(C25740a aVar) {
        List list;
        String str;
        C41536l.m120489i(aVar, "model");
        long f = aVar.mo64319f();
        String g = aVar.mo64320g();
        if (this.f74508a.mo63742a()) {
            list = aVar.mo64317e();
        } else {
            list = aVar.mo64316d();
        }
        List list2 = list;
        if (this.f74508a.mo63742a()) {
            str = aVar.mo64323i();
        } else {
            str = aVar.mo64321h();
        }
        return new GiftCardsMerchantAnimationsModel((Long) null, (BigDecimal) null, (Long) null, f, str, g, list2, 7, (DefaultConstructorMarker) null);
    }
}
