package p341ge.bog.mobilebank.cardapplications.presentation.actionsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p380ck.C10464h;
import p411em.C12487d;
import p481jm.C16222d;
import p481jm.C16246y;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.i */
public final class C13962i extends C19788a {

    /* renamed from: I */
    public static final C13963a f41351I = new C13963a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C16222d f41352H;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.i$a */
    public static final class C13963a {
        private C13963a() {
        }

        public /* synthetic */ C13963a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13962i mo39058a(OrderDebitCardData orderDebitCardData) {
            C41536l.m120489i(orderDebitCardData, "data");
            C13962i iVar = new C13962i();
            iVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_DATA", orderDebitCardData)));
            return iVar;
        }
    }

    /* renamed from: g2 */
    private final void m51935g2() {
        OrderDebitCardData orderDebitCardData;
        Bundle arguments = getArguments();
        if (arguments != null) {
            orderDebitCardData = (OrderDebitCardData) arguments.getParcelable("ARG_DATA");
        } else {
            orderDebitCardData = null;
        }
        m51941m2().f45786e.f46010k.setOnClickListener(new C13960g(this, orderDebitCardData));
        m51941m2().f45787f.f46010k.setOnClickListener(new C13961h(this, orderDebitCardData));
    }

    /* renamed from: h2 */
    private static final void m51936h2(C13962i iVar, OrderDebitCardData orderDebitCardData, boolean z) {
        C1533o.m5445b(iVar, "REQUEST_KEY_INSTANT_DELIVERY_OPTION", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_INSTANT_DELIVERY_IS_INSTANT", Boolean.valueOf(z)), C41233s.m119492a("RESULT_KEY_ORDER_DATA", orderDebitCardData)));
        iVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m51937i2(C13962i iVar, OrderDebitCardData orderDebitCardData, View view) {
        C41536l.m120489i(iVar, "this$0");
        m51936h2(iVar, orderDebitCardData, true);
        C32343x.m95395I0(iVar, "Instant_Delivery", "instant", "Choose_delivery_type", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m51938j2(C13962i iVar, OrderDebitCardData orderDebitCardData, View view) {
        C41536l.m120489i(iVar, "this$0");
        m51936h2(iVar, orderDebitCardData, false);
        C32343x.m95395I0(iVar, "Instant_Delivery", "standard", "Choose_delivery_type", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* renamed from: k2 */
    private final void m51939k2(C16246y yVar, StringSource stringSource, StringSource stringSource2, StringSource stringSource3, int i, boolean z) {
        yVar.f46007h.setText(C34646b.m101752f(stringSource, (Context) null, 1, (Object) null));
        yVar.f46006g.setText(C34646b.m101752f(stringSource2, (Context) null, 1, (Object) null));
        yVar.f46004e.setText(C34646b.m101752f(stringSource3, (Context) null, 1, (Object) null));
        yVar.f46013n.setImageResource(i);
        CurrencyBadgeView currencyBadgeView = yVar.f46011l;
        C41536l.m120488h(currencyBadgeView, "newBadge");
        C32343x.m95483r1(currencyBadgeView, z, false, 2, (Object) null);
    }

    /* renamed from: l2 */
    static /* synthetic */ void m51940l2(C13962i iVar, C16246y yVar, StringSource stringSource, StringSource stringSource2, StringSource stringSource3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z = false;
        }
        iVar.m51939k2(yVar, stringSource, stringSource2, stringSource3, i, z);
    }

    /* renamed from: m2 */
    private final C16222d m51941m2() {
        C16222d dVar = this.f41352H;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: n2 */
    private final void m51942n2() {
        C16246y yVar = m51941m2().f45786e;
        C41536l.m120488h(yVar, "binding.instantOption");
        m51939k2(yVar, C34646b.m101748b("card.instant.delivery.actionsheet.instant", new Object[0]), C34646b.m101748b("card.instant.delivery.actionsheet.instant.time", new Object[0]), C34646b.m101748b("card.instant.delivery.actionsheet.instant.desc", new Object[0]), C12487d.icons_24_payment_category_courier, true);
        C16246y yVar2 = m51941m2().f45787f;
        C41536l.m120488h(yVar2, "binding.standardOption");
        m51940l2(this, yVar2, C34646b.m101748b("card.instant.delivery.actionsheet.standard", new Object[0]), C34646b.m101748b("card.instant.delivery.actionsheet.standard.time", new Object[0]), C34646b.m101748b("card.instant.delivery.actionsheet.standard.desc", new Object[0]), C12487d.f37161c, false, 32, (Object) null);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f41352H = C16222d.m57817d(layoutInflater, viewGroup, true);
        mo4586v1(false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("card.instant.delivery.actionsheet.title", new Object[0]));
        m51942n2();
        m51935g2();
    }
}
