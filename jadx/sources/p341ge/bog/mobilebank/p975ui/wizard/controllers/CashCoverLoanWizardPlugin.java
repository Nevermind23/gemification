package p341ge.bog.mobilebank.p975ui.wizard.controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c91.C31312k;
import c91.C31355y;
import d91.C31550a;
import g91.C32297d;
import g91.C32303f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import jg1.C41438c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.DepLoanAgreement;
import p341ge.bog.mobilebank.model.DepLoanCalculation;
import p341ge.bog.mobilebank.p975ui.activities.CashCoverLoanActivity;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.RetrofitApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.wizard.controllers.CashCoverLoanWizardPlugin */
public final class CashCoverLoanWizardPlugin extends BaseWizardPlugin implements Parcelable {
    public static final Parcelable.Creator<CashCoverLoanWizardPlugin> CREATOR = new C35881a();

    /* renamed from: d */
    private final ArrayList f86803d;

    /* renamed from: e */
    private final transient RetrofitApi f86804e = RetrofitApi.getInstance();

    /* renamed from: f */
    private final transient C41438c f86805f = C41438c.m120237c();

    /* renamed from: g */
    private final int f86806g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f86807h = 1;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String f86808i = "GEL";
    /* access modifiers changed from: private */

    /* renamed from: j */
    public CashCoverLoanActivity.C35167a f86809j = new CashCoverLoanActivity.C35167a((DepLoanCalculation) null, false, false, false, 14, (DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.ui.wizard.controllers.CashCoverLoanWizardPlugin$a */
    public static final class C35881a implements Parcelable.Creator {
        /* renamed from: a */
        public final CashCoverLoanWizardPlugin createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(DepLoanAgreement.CREATOR.createFromParcel(parcel));
            }
            return new CashCoverLoanWizardPlugin(arrayList);
        }

        /* renamed from: b */
        public final CashCoverLoanWizardPlugin[] newArray(int i) {
            return new CashCoverLoanWizardPlugin[i];
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.controllers.CashCoverLoanWizardPlugin$b */
    public static final class C35882b extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ CashCoverLoanWizardPlugin f86810a;

        C35882b(CashCoverLoanWizardPlugin cashCoverLoanWizardPlugin) {
            this.f86810a = cashCoverLoanWizardPlugin;
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            C35886a aVar = this.f86810a.wizardCallback;
            C41536l.m120487g(aVar, "null cannot be cast to non-null type android.app.Activity");
            C32297d.m95153a((Activity) aVar);
            this.f86810a.f86809j.mo86092f(true);
            this.f86810a.wizardCallback.mo87831D();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "response");
            super.onResponse(bankApiResponse);
            this.f86810a.wizardCallback.mo87831D();
            if (bankApiResponse.isSuccess()) {
                this.f86810a.f86809j.mo86090e((DepLoanCalculation) bankApiResponse.getResult());
                C31355y yVar = this.f86810a.getWizardFragments().get(this.f86810a.f86807h);
                CashCoverLoanWizardPlugin cashCoverLoanWizardPlugin = this.f86810a;
                C31355y yVar2 = yVar;
                Object result = bankApiResponse.getResult();
                if (result != null) {
                    DepLoanCalculation depLoanCalculation = (DepLoanCalculation) result;
                    yVar2.mo71717U1(depLoanCalculation.getMaxAmount().toString());
                    yVar2.mo71707D1().setNonSelectableString(C32303f.m95198i(cashCoverLoanWizardPlugin.f86808i, true));
                    WizardObject D1 = yVar2.mo71707D1();
                    C35886a aVar = cashCoverLoanWizardPlugin.wizardCallback;
                    C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.mobilebank.ui.wizard.activities.AdvancedWizardActivity");
                    D1.setInputTitle(((AdvancedWizardActivity) aVar).getString(C10328q.loan_amount_from, new Object[]{depLoanCalculation.getMinAmount().toString(), depLoanCalculation.getMaxAmount().toString()}));
                    yVar2.mo71707D1().setMinAmount(depLoanCalculation.getMinAmount());
                    yVar2.mo71707D1().setMaxAmount(depLoanCalculation.getMaxAmount());
                    C35886a aVar2 = this.f86810a.wizardCallback;
                    C41536l.m120487g(aVar2, "null cannot be cast to non-null type ge.bog.mobilebank.ui.wizard.activities.AdvancedWizardActivity");
                    ((AdvancedWizardActivity) aVar2).mo87963n3(this.f86810a.f86807h, true);
                    return;
                }
                throw new IllegalArgumentException("BankApiResponse<DepLoanCalculation>.result shouldn't be null".toString());
            }
            C35886a aVar3 = this.f86810a.wizardCallback;
            C41536l.m120487g(aVar3, "null cannot be cast to non-null type android.app.Activity");
            C32297d.m95154b((Activity) aVar3, C27950a.m86287d(bankApiResponse.getKey(), false, 2, (Object) null));
            this.f86810a.f86809j.mo86092f(true);
            this.f86810a.wizardCallback.mo87831D();
        }
    }

    public CashCoverLoanWizardPlugin(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "deposits");
        this.f86803d = arrayList;
    }

    /* renamed from: e */
    private final void m106740e() {
        String z1 = getWizardFragments().get(this.f86806g).mo71611z1();
        C41536l.m120488h(z1, "wizardFragments[depositPos].inputValue");
        if (Integer.parseInt(z1) != -1) {
            ArrayList arrayList = this.f86803d;
            String z12 = getWizardFragments().get(this.f86806g).mo71611z1();
            C41536l.m120488h(z12, "wizardFragments[depositPos].inputValue");
            Object obj = arrayList.get(Integer.parseInt(z12));
            C41536l.m120488h(obj, "deposits[wizardFragments…tPos].inputValue.toInt()]");
            DepLoanAgreement depLoanAgreement = (DepLoanAgreement) obj;
            this.f86804e.getDepLoanCalculation(Long.valueOf(depLoanAgreement.getAgreeKey()), depLoanAgreement.getCcy(), new C35882b(this));
        }
    }

    /* renamed from: f */
    private final boolean m106741f() {
        boolean z;
        C31355y yVar = getWizardFragments().get(this.f86807h);
        String z1 = yVar.mo71611z1();
        C41536l.m120488h(z1, "amount");
        if (z1.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        BigDecimal bigDecimal = new BigDecimal(z1);
        BigDecimal minAmount = yVar.mo71707D1().getMinAmount();
        BigDecimal maxAmount = yVar.mo71707D1().getMaxAmount();
        if (minAmount == null || maxAmount == null) {
            if (minAmount != null) {
                if (bigDecimal.subtract(minAmount).compareTo(BigDecimal.ZERO) >= 0) {
                    return true;
                }
            } else if (maxAmount == null || maxAmount.subtract(bigDecimal).compareTo(BigDecimal.ZERO) >= 0) {
                return true;
            }
        } else if (bigDecimal.subtract(minAmount).compareTo(BigDecimal.ZERO) >= 0 && maxAmount.subtract(bigDecimal).compareTo(BigDecimal.ZERO) >= 0) {
            return true;
        }
        return false;
    }

    public C31355y createFragment(WizardObject wizardObject, int i) {
        C41536l.m120489i(wizardObject, "wo");
        if (wizardObject.getInputStyle() == 6) {
            C31312k kVar = new C31312k();
            kVar.mo71713P1(i);
            kVar.mo71569j2(this.f86803d);
            kVar.mo71717U1(wizardObject.getValue());
            kVar.mo71709L1(wizardObject);
            return kVar;
        } else if (wizardObject.getInputStyle() == 4) {
            C31550a aVar = new C31550a();
            aVar.mo71709L1(wizardObject);
            return aVar;
        } else {
            C31355y createFragment = super.createFragment(wizardObject, i);
            C41536l.m120488h(createFragment, "super.createFragment(wo, index)");
            return createFragment;
        }
    }

    public int describeContents() {
        return 0;
    }

    public Intent getData() {
        Intent intent = new Intent();
        Iterator<C31355y> it = getWizardFragments().iterator();
        while (it.hasNext()) {
            C31355y next = it.next();
            if (!C41536l.m120484d(next, getWizardFragments().get(this.f86807h)) || m106741f()) {
                WizardObject D1 = next.mo71707D1();
                C41536l.m120486f(D1);
                intent.putExtra(D1.getId(), next.mo71611z1());
            } else {
                WizardObject D12 = next.mo71707D1();
                C41536l.m120486f(D12);
                intent.putExtra(D12.getId(), "");
            }
        }
        return intent;
    }

    public void onInputVerificationRequired(int i) {
        super.onInputVerificationRequired(i);
        if (i == this.f86806g) {
            this.f86809j.mo86094h(true);
        }
    }

    public void onNextClick(int i) {
        if (i == 0 && this.f86809j.mo86089d()) {
            this.f86809j.mo86093g(true);
            this.wizardCallback.mo87847q();
            m106740e();
        } else if (i != this.f86807h || m106741f()) {
            super.onNextClick(i);
        } else {
            C35886a aVar = this.wizardCallback;
            C41536l.m120487g(aVar, "null cannot be cast to non-null type android.app.Activity");
            C35886a aVar2 = this.wizardCallback;
            C41536l.m120487g(aVar2, "null cannot be cast to non-null type android.app.Activity");
            C32297d.m95154b((Activity) aVar, ((Activity) aVar2).getString(C10328q.offer_details_credit_card_limit_range_warning, new Object[]{getWizardFragments().get(this.f86807h).mo71707D1().getMinAmount(), getWizardFragments().get(this.f86807h).mo71707D1().getMaxAmount()}));
        }
    }

    public void onStop() {
        super.onStop();
        this.f86805f.mo96184m(this.f86809j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        ArrayList arrayList = this.f86803d;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((DepLoanAgreement) it.next()).writeToParcel(parcel, i);
        }
    }
}
