package pw0;

import android.view.View;
import g81.C32205k0;
import g91.C32359z0;
import j81.C36772n;
import java.math.BigDecimal;
import java.util.ArrayList;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p366bk.C10328q;
import p748eu.C20292b;
import r90.C27950a;

/* renamed from: pw0.a */
public class C38025a implements C36772n {

    /* renamed from: d */
    private C32205k0 f91363d;

    /* renamed from: e */
    private ArrayList f91364e;

    /* renamed from: f */
    private PaymentFormActivity f91365f;

    /* renamed from: g */
    private BigDecimal f91366g;

    /* renamed from: h */
    private BigDecimal f91367h;

    public C38025a(PaymentFormActivity paymentFormActivity, Client client, ArrayList arrayList, PaymentProviderConfiguration paymentProviderConfiguration) {
        this.f91364e = arrayList;
        this.f91365f = paymentFormActivity;
        m111808d(paymentFormActivity, client, arrayList, paymentProviderConfiguration);
    }

    /* renamed from: d */
    private void m111808d(PaymentFormActivity paymentFormActivity, Client client, ArrayList arrayList, PaymentProviderConfiguration paymentProviderConfiguration) {
        boolean z;
        String str;
        String format = String.format(paymentFormActivity.getString(C10328q.payments_details_car_penalties_title), new Object[]{Integer.valueOf(arrayList.size())});
        if (paymentProviderConfiguration.getServiceConfigJson() == null || !PaymentServiceConfig.TYPE_GIFT_CARD.equals(paymentProviderConfiguration.getServiceConfigJson().getType())) {
            if ("bog-comp-glcleasing".equals(paymentProviderConfiguration.getServiceId()) || "bog-comp-glcturbo".equals(paymentProviderConfiguration.getServiceId())) {
                format = paymentFormActivity.getString(C10328q.agreements);
            }
            str = format;
            z = true;
        } else {
            str = C27950a.m86284a("text.payments.service.result.list.header.giftcards").replace("%i", String.valueOf(arrayList.size()));
            z = false;
        }
        C32205k0 k0Var = new C32205k0(50, paymentFormActivity, client, this, (View) null, (C20292b) null);
        this.f91363d = k0Var;
        k0Var.mo72744T(arrayList, paymentProviderConfiguration);
        paymentFormActivity.mo79616O2(str, this.f91363d);
        paymentFormActivity.mo79620b3();
        this.f91363d.mo72745U(z);
    }

    /* renamed from: G */
    public void mo86321G(TemplateBasketItem templateBasketItem) {
    }

    /* renamed from: T */
    public void mo86323T(TemplateBasketItem templateBasketItem) {
        C32205k0 k0Var = this.f91363d;
        if (k0Var != null) {
            k0Var.mo72740L(templateBasketItem.getId());
        }
    }

    /* renamed from: a */
    public void mo86324a(TemplateBasketItem templateBasketItem, int i) {
    }

    /* renamed from: b */
    public BigDecimal mo91396b() {
        return this.f91366g;
    }

    /* renamed from: c */
    public ArrayList mo91397c() {
        ArrayList arrayList = this.f91364e;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return this.f91363d.mo72734C();
    }

    /* renamed from: n */
    public void mo86325n() {
        this.f91366g = new BigDecimal(this.f91363d.mo72736E());
        BigDecimal bigDecimal = new BigDecimal(this.f91363d.mo72735D());
        this.f91367h = bigDecimal;
        BigDecimal add = this.f91366g.add(bigDecimal);
        PaymentFormActivity paymentFormActivity = this.f91365f;
        boolean z = true;
        String P = C32359z0.m95545P(add.toString(), true);
        String P2 = C32359z0.m95545P(this.f91367h.toString(), true);
        if (this.f91366g.compareTo(BigDecimal.ZERO) != 1) {
            z = false;
        }
        paymentFormActivity.mo79602X2(P, P2, z);
    }
}
