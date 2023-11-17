package ty0;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.payment.UpcomingPayment;
import sy0.C38606b;

/* renamed from: ty0.c */
public final class C38853c {

    /* renamed from: a */
    private final C38606b f92931a;

    public C38853c(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92931a = bVar;
    }

    /* renamed from: a */
    public final C40734b mo92561a(String str, boolean z) {
        String str2;
        C41536l.m120489i(str, "cardId");
        C38606b bVar = this.f92931a;
        if (z) {
            str2 = "Y";
        } else {
            str2 = "N";
        }
        return bVar.changeProductDefault(UpcomingPayment.PROD_GROUP_TYPE_CREDIT_CARD_BILL, str, str2);
    }
}
