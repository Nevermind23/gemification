package xx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import g91.C32289b0;
import g91.C32307h;
import g91.C32343x;
import java.util.List;
import jx0.C36818e0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import o31.C37603j;
import o31.C37626z;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.mobilebank.payments.domain.model.CardImage;
import p341ge.bog.mobilebank.payments.domain.model.PaymentCard;
import p669xh.C18763a;
import ue1.C43075l;

/* renamed from: xx0.d */
public final class C39925d extends C1819o {

    /* renamed from: f */
    private final C43075l f94717f;

    /* renamed from: g */
    private Long f94718g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39925d(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onCardSelected");
        this.f94717f = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m115774m(C39925d dVar, PaymentCard paymentCard, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.f94717f.invoke(Long.valueOf(paymentCard.mo80147d()));
    }

    /* renamed from: i */
    public void mo6029i(List list) {
        mo6030j(list, (Runnable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: ge.bog.mobilebank.payments.domain.model.PaymentCard} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ge.bog.mobilebank.payments.domain.model.PaymentCard} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ge.bog.mobilebank.payments.domain.model.PaymentCard} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.mobilebank.payments.domain.model.PaymentCard} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ge.bog.mobilebank.payments.domain.model.PaymentCard} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6030j(java.util.List r9, java.lang.Runnable r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0008
            java.util.List r9 = ie1.C41358y.m119991B0(r9)
            goto L_0x0009
        L_0x0008:
            r9 = r0
        L_0x0009:
            r1 = 0
            if (r9 == 0) goto L_0x0036
            java.util.Iterator r2 = r9.iterator()
        L_0x0010:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r2.next()
            r4 = r3
            ge.bog.mobilebank.payments.domain.model.PaymentCard r4 = (p341ge.bog.mobilebank.payments.domain.model.PaymentCard) r4
            long r4 = r4.mo80147d()
            java.lang.Long r6 = r8.f94718g
            if (r6 != 0) goto L_0x0026
            goto L_0x0030
        L_0x0026:
            long r6 = r6.longValue()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            r4 = r1
        L_0x0031:
            if (r4 == 0) goto L_0x0010
            r0 = r3
        L_0x0034:
            ge.bog.mobilebank.payments.domain.model.PaymentCard r0 = (p341ge.bog.mobilebank.payments.domain.model.PaymentCard) r0
        L_0x0036:
            if (r0 == 0) goto L_0x003e
            r9.remove(r0)
            r9.add(r1, r0)
        L_0x003e:
            super.mo6030j(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.C39925d.mo6030j(java.util.List, java.lang.Runnable):void");
    }

    /* renamed from: l */
    public void onBindViewHolder(C37626z zVar, int i) {
        String str;
        boolean z;
        String str2;
        C18763a aVar;
        CreditCardView.C13273e eVar;
        boolean z2;
        String g;
        String a;
        C41536l.m120489i(zVar, "holder");
        PaymentCard paymentCard = (PaymentCard) mo6027g(i);
        CardImage e = paymentCard.mo80149e();
        if (e == null || (a = e.mo80115a()) == null) {
            str = null;
        } else {
            str = C32289b0.m95091c(a);
        }
        String str3 = str;
        CardImage e2 = paymentCard.mo80149e();
        if (e2 == null || !e2.mo80116b()) {
            z = false;
        } else {
            z = true;
        }
        C6201a h = zVar.mo90806h();
        if (h instanceof C36818e0) {
            C36818e0 e0Var = (C36818e0) h;
            CreditCardView creditCardView = e0Var.f88849e;
            String valueOf = String.valueOf(paymentCard.mo80147d());
            String f = paymentCard.mo80151f();
            if (f == null && (((g = paymentCard.mo80152g()) == null || (f = C32343x.m95388F(g, new Object[0])) == null) && (f = paymentCard.mo80146b()) == null)) {
                str2 = "";
            } else {
                str2 = f;
            }
            String O = C32343x.m95406O(String.valueOf(paymentCard.mo80145a()), "");
            String i2 = C32307h.m95232i(paymentCard.mo80156j());
            C41536l.m120488h(i2, "getMaskedCardNo(lastFour)");
            String b = paymentCard.mo80146b();
            if (b == null || (aVar = C37603j.m110584g(b)) == null) {
                aVar = C18763a.DIGITAL_CARD;
            }
            C18763a aVar2 = aVar;
            if (z) {
                eVar = CreditCardView.C13273e.BLACK;
            } else {
                eVar = CreditCardView.C13273e.WHITE;
            }
            CreditCardView.C13270b bVar = r4;
            CreditCardView.C13270b bVar2 = new CreditCardView.C13270b(valueOf, str2, O, "GEL", i2, aVar2, 0, str3, false, false, eVar, (String) null, 2304, (DefaultConstructorMarker) null);
            creditCardView.setCreditCard(bVar);
            CreditCardView creditCardView2 = e0Var.f88849e;
            long d = paymentCard.mo80147d();
            Long l = this.f94718g;
            if (l != null && d == l.longValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            creditCardView2.setCreditCardActive(z2);
            e0Var.mo3946b().setOnClickListener(new C39924c(this, paymentCard));
        }
    }

    /* renamed from: n */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        return new C37626z(C36818e0.m109088d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }

    /* renamed from: o */
    public final void mo93658o(Long l) {
        this.f94718g = l;
    }
}
