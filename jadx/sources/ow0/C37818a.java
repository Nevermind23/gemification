package ow0;

import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import ba1.C10146d0;
import g91.C32297d;
import g91.C32315k0;
import g91.C32359z0;
import hc1.C41185v;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import nw0.C37486a;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.DDProvidersListEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyDDEvent;
import p341ge.bog.mobilebank.eventbus.events.PaymentDebtEvent;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentAccount;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentDetails;
import p341ge.bog.mobilebank.model.ddsto.DDProviderItem;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.DDSTODetailsWrapper;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.payment.activities.DDFormActivity;
import p341ge.bog.mobilebank.payment.controllers.wizard.DDPaymentWizardPlugin;
import p341ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin;
import p341ge.bog.mobilebank.payment.model.ParameterType;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.otpparameter.CreateNewPaymentParams;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import p380ck.C10469j;
import p745er.C20288a;
import pc0.C27494a;
import qw0.C38252a;
import qw0.C38256d;
import rw0.C38374a;
import rw0.C38375b;
import rw0.C38380g;

/* renamed from: ow0.a */
public class C37818a extends C37821b implements C37486a {

    /* renamed from: n */
    private DDSTO f90760n;

    /* renamed from: o */
    private DDPaymentDetails f90761o;

    /* renamed from: p */
    private boolean f90762p;

    /* renamed from: q */
    private ArrayList f90763q;

    /* renamed from: r */
    private DDProviderItem f90764r;

    /* renamed from: s */
    private DDPaymentDetails f90765s;

    /* renamed from: t */
    private ArrayList f90766t;

    /* renamed from: u */
    private String f90767u;

    /* renamed from: v */
    private C27494a f90768v;

    /* renamed from: ow0.a$a */
    class C37819a implements Runnable {
        C37819a() {
        }

        public void run() {
            C37818a.this.mo91076r().finish();
        }
    }

    /* renamed from: ow0.a$b */
    class C37820b implements Runnable {
        C37820b() {
        }

        public void run() {
            C37818a.this.mo91076r().finish();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37818a(DDFormActivity dDFormActivity, String str, boolean z, boolean z2, DDSTO ddsto, ArrayList arrayList, DDProviderItem dDProviderItem, String str2, String str3, C27494a aVar) {
        super(dDFormActivity, str, z, str2, (String) null, (String) null, (String) null, (String) null);
        DDSTODetailsWrapper dDSTODetailsWrapper;
        boolean z3;
        DDSTO ddsto2 = ddsto;
        DDProviderItem dDProviderItem2 = dDProviderItem;
        C38252a aVar2 = new C38252a(this);
        this.f90763q = arrayList;
        this.f90764r = dDProviderItem2;
        this.f90768v = aVar;
        this.f90767u = str3;
        if (ddsto2 == null || (dDSTODetailsWrapper = ddsto2.details) == null) {
            this.f90762p = z2;
        } else {
            this.f90760n = ddsto2;
            DDPaymentDetails dDPaymentDetails = dDSTODetailsWrapper.paymentDetails;
            this.f90761o = dDPaymentDetails;
            if (dDPaymentDetails == null || !dDPaymentDetails.isTopup()) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.f90762p = z3;
            aVar2.f91739l = ddsto2.paymentId;
        }
        C38256d dVar = this.f90776f;
        aVar2.f91747h = dVar.f91747h;
        dVar.mo91796d();
        this.f90776f = aVar2;
        aVar2.mo91795c();
        if (dDProviderItem2 == null) {
            this.f90776f.mo91794b().requestDDProviders(false);
            return;
        }
        this.f90776f.mo91794b().requestDDPeriodTypes();
        this.f90776f.mo91794b().requestDDAccounts();
    }

    /* renamed from: L */
    private void m111105L() {
        PaymentCustomParameter paymentCustomParameter = null;
        PaymentCustomParameter paymentCustomParameter2 = null;
        for (PaymentCustomParameter next : this.f90775e.getParameters()) {
            if (next.getId().equalsIgnoreCase("DD_START_DATE_ID")) {
                paymentCustomParameter = next;
            }
            if (next.getId().equalsIgnoreCase("DD_END_DATE_ID")) {
                paymentCustomParameter2 = next;
            }
        }
        if (paymentCustomParameter != null && paymentCustomParameter2 != null && paymentCustomParameter.getValue() != null && paymentCustomParameter2.getValue() != null && !paymentCustomParameter.getValue().equals("") && !paymentCustomParameter2.getValue().equals("") && Long.parseLong(paymentCustomParameter.getValue()) > Long.parseLong(paymentCustomParameter2.getValue())) {
            paymentCustomParameter2.setValue("");
            paymentCustomParameter2.setValueToDisplay("");
            paymentCustomParameter2.setValueToDisplayInForm("");
        }
    }

    /* renamed from: N */
    private void m111106N() {
        C38374a.m112684f("amount", this.f90775e);
        C38374a.m112684f("DD_MIN_LIMIT_ID", this.f90775e);
    }

    /* renamed from: Q */
    private CreateNewPaymentParams m111107Q(String str, String str2, String str3) {
        Long l;
        Long l2;
        Long l3;
        String str4;
        String str5;
        DDPaymentDetails dDPaymentDetails = this.f90765s;
        String str6 = dDPaymentDetails.orderName;
        Long l4 = dDPaymentDetails.providerId;
        String str7 = dDPaymentDetails.subServiceId;
        String str8 = dDPaymentDetails.customerIdentification;
        if (dDPaymentDetails.paymentAccounts.size() > 0) {
            l = Long.valueOf(this.f90765s.paymentAccounts.get(0).acctKey);
        } else {
            l = null;
        }
        if (this.f90765s.paymentAccounts.size() > 1) {
            l2 = Long.valueOf(this.f90765s.paymentAccounts.get(1).acctKey);
        } else {
            l2 = null;
        }
        if (this.f90765s.paymentAccounts.size() > 2) {
            l3 = Long.valueOf(this.f90765s.paymentAccounts.get(2).acctKey);
        } else {
            l3 = null;
        }
        DDPaymentDetails dDPaymentDetails2 = this.f90765s;
        String str9 = dDPaymentDetails2.type;
        BigDecimal bigDecimal = dDPaymentDetails2.amount;
        if (bigDecimal != null) {
            str4 = bigDecimal.toString();
        } else {
            str4 = null;
        }
        DDPaymentDetails dDPaymentDetails3 = this.f90765s;
        String str10 = dDPaymentDetails3.periodType;
        Long l5 = dDPaymentDetails3.nextSentDate;
        Long l6 = dDPaymentDetails3.endDate;
        BigDecimal bigDecimal2 = dDPaymentDetails3.thresholdAmount;
        if (bigDecimal2 != null) {
            str5 = bigDecimal2.toString();
        } else {
            str5 = null;
        }
        DDPaymentDetails dDPaymentDetails4 = this.f90765s;
        return new CreateNewPaymentParams(str6, l4, str7, str8, l, l2, l3, str9, str4, str10, l5, l6, str5, dDPaymentDetails4.isoverlimitaction, dDPaymentDetails4.paymentId, C10146d0.C10177h.m37232a(), BankApi.SERVICE_DEBITS_CREATE_NEW_PAYMENT, str, str2, str3);
    }

    /* renamed from: R */
    private void m111108R() {
        String name = this.f90775e.getName();
        if (name != null) {
            new C10469j.C10476g(name).mo27161b(C36546y.m108282F());
        }
    }

    /* renamed from: U */
    private void m111109U(String str, HashMap hashMap) {
        C41185v.m119403r2(str, hashMap).mo4576A1(mo91076r().getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public PaymentWizardPlugin mo91065D() {
        DDPaymentWizardPlugin dDPaymentWizardPlugin = new DDPaymentWizardPlugin();
        dDPaymentWizardPlugin.setPaymentCustomConfigurations(this.f90775e);
        dDPaymentWizardPlugin.isTopup = this.f90762p;
        return dDPaymentWizardPlugin;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public ArrayList mo91066E(BaseWizardPlugin baseWizardPlugin) {
        return C38380g.m112743j(this.f90775e, baseWizardPlugin);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo91067H() {
        mo91076r().mo79603Y2(this.f90775e.getParameters());
        mo91076r().mo79619Z2(this.f90775e.getName(), this.f90775e.getLogoUrl());
        mo91076r().mo86425J1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo91068J() {
        boolean z;
        for (PaymentCustomParameter next : this.f90775e.getParameters()) {
            if (!next.isMandatory()) {
                if (this.f90775e.getResultListItems() == null) {
                    z = true;
                } else {
                    z = false;
                }
                next.setVisibleInForm(z);
            }
        }
    }

    /* renamed from: M */
    public void mo91069M() {
        this.f90776f.mo91794b().terminatePayment(this.f90760n.paymentId, "DEB");
    }

    /* renamed from: O */
    public DDFormActivity mo91076r() {
        return (DDFormActivity) this.f90777g;
    }

    /* renamed from: P */
    public C41185v mo91071P() {
        return C20288a.m66329d(mo91076r().getSupportFragmentManager());
    }

    /* renamed from: S */
    public void mo91072S() {
        this.f90776f.mo91794b().requestTerminateDDSTOEvent();
    }

    /* renamed from: T */
    public void mo91073T(String str, String str2, String str3) {
        mo91076r().mo86441o2();
        this.f90776f.mo91793a().createOrUpdateDDPayment(this.f90768v.mo66809a(m111107Q(str, str2, str3)), this);
    }

    /* renamed from: e */
    public void mo90623e(ModifyDDEvent modifyDDEvent) {
        m111108R();
        C32297d.m95160h(mo91076r(), C32359z0.m95557a0(C10328q.f28956f2));
        mo91076r().setResult(-1);
        this.f90776f.mo91794b().forceUpdateData();
        this.f90776f.mo91794b().requestDDSTO(true);
        mo91076r().mo79605o3();
    }

    /* renamed from: f */
    public void mo90624f() {
        mo91085F();
    }

    /* renamed from: h */
    public void mo90625h() {
        C32297d.m95160h(mo91076r(), C32359z0.m95557a0(C10328q.f28956f2));
        Handler handler = new Handler();
        this.f90776f.mo91794b().forceUpdateData();
        this.f90776f.mo91794b().requestDDSTO(true);
        handler.postDelayed(new C37819a(), 2000);
    }

    /* renamed from: j */
    public void mo90626j(DDProvidersListEvent dDProvidersListEvent) {
        PaymentCustomConfiguration paymentCustomConfiguration = this.f90775e;
        if (paymentCustomConfiguration != null && paymentCustomConfiguration.getServiceId() != null) {
            this.f90766t = dDProvidersListEvent.providerItems;
            DDProviderItem o = C38374a.m112693o(this.f90775e.getServiceId(), dDProvidersListEvent.providerItems);
            this.f90764r = o;
            if (o != null) {
                this.f90776f.mo91794b().requestDDPeriodTypes();
                this.f90776f.mo91794b().requestDDAccounts();
                return;
            }
            mo90627k(C32359z0.m95557a0(C10328q.f28955d2));
        }
    }

    /* renamed from: k */
    public void mo90627k(String str) {
        if (str != null) {
            C32297d.m95154b(mo91076r(), str);
        }
        new Handler().postDelayed(new C37820b(), 2000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo91074n() {
        PaymentCustomConfiguration paymentCustomConfiguration = this.f90775e;
        if (paymentCustomConfiguration == null || paymentCustomConfiguration.getParameters() == null || this.f90775e.getParameters().size() <= 0) {
            return false;
        }
        for (PaymentCustomParameter next : this.f90775e.getParameters()) {
            if (!"DD_NAME_ID".equals(next.getId()) && !"DD_END_DATE_ID".equals(next.getId())) {
                if (next.isMandatory() && next.isVisibleInForm() && TextUtils.isEmpty(next.getValue())) {
                    return false;
                }
                if (next.getStyle().getParameterType() == ParameterType.SELECT_MULTIPLE && BankApiResponse.SUCCESSFUL_RESPONSE_CODE.equals(next.getValue())) {
                    return false;
                }
            }
        }
        return true;
    }

    public void onDataError(String str) {
        this.f90777g.mo86425J1();
        C32297d.m95154b(mo91076r(), str);
    }

    public void onDebtEventSuccess(PaymentDebtEvent paymentDebtEvent) {
        C38375b.m112706b(this.f90775e, paymentDebtEvent.getPaymentDebt(), false);
        mo91067H();
    }

    public void onNetworkError() {
        this.f90777g.mo86425J1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo91075q() {
        ArrayList<KeyValue> arrayList;
        mo91076r().mo79619Z2(this.f90775e.getName(), this.f90775e.getLogoUrl());
        if (this.f90760n != null) {
            arrayList = C32315k0.m95257f(this.f90775e);
        } else {
            ArrayList arrayList2 = this.f90763q;
            if (arrayList2 != null) {
                arrayList = C32315k0.m95254c(arrayList2, this.f90775e.getBaseConfiguration().getServiceConfigJson());
            } else if (this.f90771a != null) {
                arrayList = this.f90776f.f91746g.getOperationHistory().getParameters();
            } else {
                arrayList = null;
            }
        }
        if (!this.f90775e.isDebtVerifiable() || arrayList == null) {
            mo91067H();
        } else {
            C38375b.m112716l(arrayList, this.f90776f.mo91794b(), this.f90775e.getDebtServiceId(), this);
        }
    }

    /* renamed from: w */
    public void mo91077w(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 10001) {
            this.f90776f.mo91795c();
            this.f90775e = (PaymentCustomConfiguration) C42035e.m122119a(intent.getParcelableExtra(BaseWizardPlugin.WIZARD_DATA));
            m111105L();
            m111106N();
            mo91068J();
            mo91076r().mo79613J2(mo91074n());
            mo91067H();
        }
    }

    /* renamed from: y */
    public void mo91078y() {
        boolean z;
        DDPaymentDetails dDPaymentDetails;
        BigDecimal bigDecimal;
        Long l;
        if (mo91074n()) {
            String u = C38374a.m112699u(this.f90775e.getBaseConfiguration());
            DDProviderItem dDProviderItem = this.f90764r;
            if (!(dDProviderItem == null || dDProviderItem.providerOptionId == null || u == null)) {
                PaymentCustomParameter customParamByKey = this.f90775e.getCustomParamByKey(u);
                if (customParamByKey == null || TextUtils.isEmpty(customParamByKey.getValue())) {
                    this.f90764r = null;
                } else {
                    this.f90764r = C38374a.m112694p(this.f90764r.providerServiceId, this.f90766t, customParamByKey.getValue());
                }
            }
            DDProviderItem dDProviderItem2 = this.f90764r;
            if (dDProviderItem2 != null) {
                this.f90765s = C38374a.m112691m(this.f90775e, dDProviderItem2, this.f90762p);
                Iterator<DDPaymentAccount> it = this.f90776f.mo91794b().getDDPaymentAccounts().iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    DDPaymentAccount next = it.next();
                    if (next.orderNo == 1 && next.acctKey == this.f90765s.paymentAccounts.get(0).acctKey) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    C32297d.m95154b(mo91076r(), C32359z0.m95557a0(C10328q.dd_account_error));
                    return;
                }
                DDPaymentDetails dDPaymentDetails2 = this.f90765s;
                if (dDPaymentDetails2.type == null || (l = dDPaymentDetails2.endDate) == null || l.longValue() > this.f90765s.nextSentDate.longValue()) {
                    DDPaymentDetails dDPaymentDetails3 = this.f90765s;
                    if ((dDPaymentDetails3.type != null || dDPaymentDetails3.thresholdAmount.compareTo(BigDecimal.ZERO) == 1) && ("V".equals(this.f90765s.type) || "M".equals(this.f90765s.type) || this.f90765s.amount.compareTo(BigDecimal.ZERO) == 1)) {
                        DDSTO ddsto = this.f90760n;
                        if (ddsto != null) {
                            this.f90765s.paymentId = Long.valueOf(ddsto.paymentId);
                            if (("V".equals(this.f90765s.type) || "M".equals(this.f90765s.type)) && (bigDecimal = dDPaymentDetails.amount) != null) {
                                DDPaymentDetails dDPaymentDetails4 = this.f90765s;
                                dDPaymentDetails4.isoverlimitaction = (dDPaymentDetails = this.f90760n.details.paymentDetails).isoverlimitaction;
                                dDPaymentDetails4.amount = bigDecimal;
                            }
                        }
                        m111109U(BankApi.SERVICE_DEBITS_CREATE_NEW_PAYMENT, this.f90768v.mo66809a(m111107Q((String) null, (String) null, (String) null)));
                        return;
                    }
                    C32297d.m95154b(mo91076r(), C32359z0.m95557a0(C10328q.dd_amount_error));
                    return;
                }
                C32297d.m95154b(mo91076r(), C32359z0.m95557a0(C10328q.dd_end_date_error));
                return;
            }
            C32297d.m95154b(mo91076r(), C32359z0.m95557a0(C10328q.f28955d2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo91079z(PaymentProviderConfiguration paymentProviderConfiguration) {
        ArrayList arrayList;
        mo91094v(paymentProviderConfiguration);
        ArrayMap q = C38374a.m112695q(paymentProviderConfiguration, this.f90761o, this.f90764r);
        if (q == null && (arrayList = this.f90763q) != null) {
            q = C32315k0.m95273v(arrayList, paymentProviderConfiguration.getServiceConfigJson(), paymentProviderConfiguration.isHasDebt());
        }
        if (q != null) {
            this.f90780j = q;
        }
        this.f90775e = C38374a.m112685g(this.f90776f.mo91794b(), paymentProviderConfiguration, this.f90775e, this.f90780j, (TemplateBasketItem) null, this.f90762p, this.f90764r, this.f90767u);
        if (this.f90761o != null) {
            mo91076r().mo79606p3(true);
            C38374a.m112681c(this.f90775e, this.f90761o);
            m111106N();
            if (!this.f90762p) {
                C38374a.m112683e(this.f90775e);
            }
        }
        mo91075q();
    }
}
