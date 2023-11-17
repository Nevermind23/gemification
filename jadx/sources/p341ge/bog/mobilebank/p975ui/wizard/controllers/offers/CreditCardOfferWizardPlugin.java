package p341ge.bog.mobilebank.p975ui.wizard.controllers.offers;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.C1505h;
import c91.C31355y;
import g91.C32297d;
import g91.C32303f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.wizard.controllers.offers.CreditCardOfferWizardPlugin */
public final class CreditCardOfferWizardPlugin extends BaseWizardPlugin implements Parcelable {
    public static final Parcelable.Creator<CreditCardOfferWizardPlugin> CREATOR = new C35887a();

    /* renamed from: d */
    private final List f86821d;

    /* renamed from: e */
    private int f86822e;

    /* renamed from: f */
    private int f86823f;

    /* renamed from: ge.bog.mobilebank.ui.wizard.controllers.offers.CreditCardOfferWizardPlugin$a */
    public static final class C35887a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditCardOfferWizardPlugin createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(ServiceCenterUiModel.CREATOR.createFromParcel(parcel));
            }
            return new CreditCardOfferWizardPlugin(arrayList, parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final CreditCardOfferWizardPlugin[] newArray(int i) {
            return new CreditCardOfferWizardPlugin[i];
        }
    }

    public CreditCardOfferWizardPlugin(List list, int i, int i2) {
        C41536l.m120489i(list, "cities");
        this.f86821d = list;
        this.f86822e = i;
        this.f86823f = i2;
    }

    /* renamed from: a */
    private final List m106765a() {
        boolean z;
        List list = this.f86821d;
        String z1 = getWizardFragments().get(1).mo71611z1();
        C41536l.m120488h(z1, "wizardFragments[1].inputValue");
        long a = ((ServiceCenterUiModel) list.get(Integer.parseInt(z1))).mo55422a();
        Log.d("getRegions", String.valueOf(a));
        List<ServiceCenterUiModel> list2 = this.f86821d;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        for (ServiceCenterUiModel g : list2) {
            List g2 = g.mo55429g();
            C41536l.m120486f(g2);
            ArrayList<ServiceCenterUiModel> arrayList2 = new ArrayList<>();
            for (Object next : g2) {
                if (((ServiceCenterUiModel) next).mo55423b() == a) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
            for (ServiceCenterUiModel d : arrayList2) {
                arrayList3.add(d.mo55424d());
            }
            arrayList.add(arrayList3);
        }
        return C41343r.m119927w(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x008a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m106766b() {
        /*
            r18 = this;
            r0 = r18
            java.util.List r1 = r0.f86821d
            java.util.ArrayList r2 = r18.getWizardFragments()
            r3 = 1
            java.lang.Object r2 = r2.get(r3)
            c91.y r2 = (c91.C31355y) r2
            java.lang.String r2 = r2.mo71611z1()
            java.lang.String r4 = "wizardFragments[1].inputValue"
            kotlin.jvm.internal.C41536l.m120488h(r2, r4)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.Object r1 = r1.get(r2)
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r1 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r1
            long r1 = r1.mo55422a()
            java.util.List r5 = r0.f86821d
            java.util.ArrayList r6 = r18.getWizardFragments()
            java.lang.Object r6 = r6.get(r3)
            c91.y r6 = (c91.C31355y) r6
            java.lang.String r6 = r6.mo71611z1()
            kotlin.jvm.internal.C41536l.m120488h(r6, r4)
            int r4 = java.lang.Integer.parseInt(r6)
            java.lang.Object r4 = r5.get(r4)
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r4 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r4
            java.util.List r4 = r4.mo55429g()
            if (r4 == 0) goto L_0x0072
            java.util.ArrayList r5 = r18.getWizardFragments()
            r6 = 2
            java.lang.Object r5 = r5.get(r6)
            c91.y r5 = (c91.C31355y) r5
            java.lang.String r5 = r5.mo71611z1()
            java.lang.String r6 = "wizardFragments[2].inputValue"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            int r5 = java.lang.Integer.parseInt(r5)
            java.lang.Object r4 = r4.get(r5)
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r4 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r4
            if (r4 == 0) goto L_0x0072
            long r4 = r4.mo55422a()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0073
        L_0x0072:
            r4 = 0
        L_0x0073:
            java.util.List r5 = r0.f86821d
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = ie1.C41343r.m119925u(r5, r7)
            r6.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x0084:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0140
            java.lang.Object r8 = r5.next()
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r8 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r8
            java.util.List r8 = r8.mo55429g()
            kotlin.jvm.internal.C41536l.m120486f(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x00a0:
            boolean r10 = r8.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x00bd
            java.lang.Object r10 = r8.next()
            r12 = r10
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r12 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r12
            long r12 = r12.mo55423b()
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x00b7
            r11 = r3
        L_0x00b7:
            if (r11 == 0) goto L_0x00a0
            r9.add(r10)
            goto L_0x00a0
        L_0x00bd:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = ie1.C41343r.m119925u(r9, r7)
            r8.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
        L_0x00ca:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0137
            java.lang.Object r10 = r9.next()
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r10 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r10
            java.util.List r12 = r10.mo55429g()
            if (r12 == 0) goto L_0x012f
            java.util.List r10 = r10.mo55429g()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00e9:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x010e
            java.lang.Object r13 = r10.next()
            r14 = r13
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r14 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r14
            long r14 = r14.mo55423b()
            if (r4 != 0) goto L_0x00fd
            goto L_0x0107
        L_0x00fd:
            long r16 = r4.longValue()
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x0107
            r14 = r3
            goto L_0x0108
        L_0x0107:
            r14 = r11
        L_0x0108:
            if (r14 == 0) goto L_0x00e9
            r12.add(r13)
            goto L_0x00e9
        L_0x010e:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r13 = ie1.C41343r.m119925u(r12, r7)
            r10.<init>(r13)
            java.util.Iterator r12 = r12.iterator()
        L_0x011b:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0133
            java.lang.Object r13 = r12.next()
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r13 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r13
            java.lang.String r13 = r13.mo55424d()
            r10.add(r13)
            goto L_0x011b
        L_0x012f:
            java.util.List r10 = ie1.C41341q.m119907j()
        L_0x0133:
            r8.add(r10)
            goto L_0x00ca
        L_0x0137:
            java.util.List r8 = ie1.C41343r.m119927w(r8)
            r6.add(r8)
            goto L_0x0084
        L_0x0140:
            java.util.List r1 = ie1.C41343r.m119927w(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.controllers.offers.CreditCardOfferWizardPlugin.m106766b():java.util.List");
    }

    public int describeContents() {
        return 0;
    }

    public Intent getData() {
        Intent intent = new Intent();
        Iterator<C31355y> it = getWizardFragments().iterator();
        while (it.hasNext()) {
            C31355y next = it.next();
            WizardObject D1 = next.mo71707D1();
            C41536l.m120486f(D1);
            intent.putExtra(D1.getId(), next.mo71611z1());
        }
        return intent;
    }

    public void onInputVerificationRequired(int i) {
        super.onInputVerificationRequired(i);
        if (i == 1 && !C41536l.m120484d(getWizardFragments().get(1).mo71611z1(), String.valueOf(this.f86822e))) {
            getWizardFragments().get(2).mo71717U1("-1");
            String z1 = getWizardFragments().get(1).mo71611z1();
            C41536l.m120488h(z1, "wizardFragments[1].inputValue");
            this.f86822e = Integer.parseInt(z1);
        } else if (i == 2 && !C41536l.m120484d(getWizardFragments().get(2).mo71611z1(), String.valueOf(this.f86823f))) {
            getWizardFragments().get(3).mo71717U1("-1");
            String z12 = getWizardFragments().get(2).mo71611z1();
            C41536l.m120488h(z12, "wizardFragments[2].inputValue");
            this.f86823f = Integer.parseInt(z12);
        }
    }

    public void onNextClick(int i) {
        if (i == 0) {
            String z1 = getWizardFragments().get(0).mo71611z1();
            C41536l.m120488h(z1, "wizardFragments[0].inputValue");
            BigDecimal g = C40437u.m117095g(z1);
            if (getWizardFragments().get(0).getActivity() == null || g == null || (g.compareTo(getWizardFragments().get(0).mo71707D1().getMaxAmount()) <= 0 && g.compareTo(getWizardFragments().get(0).mo71707D1().getMinAmount()) >= 0)) {
                super.onNextClick(i);
                return;
            }
            C1505h activity = getWizardFragments().get(0).getActivity();
            C41524c0 c0Var = C41524c0.f97701a;
            String string = getWizardFragments().get(0).requireContext().getString(C10328q.offer_details_credit_card_limit_range_warning);
            C41536l.m120488h(string, "wizardFragments[0].requi…card_limit_range_warning)");
            String n = C32303f.m95203n(getWizardFragments().get(0).mo71707D1().getMinAmount(), "");
            String nonSelectableString = getWizardFragments().get(0).mo71707D1().getNonSelectableString();
            String n2 = C32303f.m95203n(getWizardFragments().get(0).mo71707D1().getMaxAmount(), "");
            String nonSelectableString2 = getWizardFragments().get(0).mo71707D1().getNonSelectableString();
            String format = String.format(string, Arrays.copyOf(new Object[]{n + nonSelectableString, n2 + nonSelectableString2}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            C32297d.m95154b(activity, format);
        } else if (i == 1) {
            getWizardFragments().get(2).mo71707D1().setSelectorOptionPreviews(m106765a());
            super.onNextClick(i);
        } else if (i != 2) {
            super.onNextClick(i);
        } else {
            getWizardFragments().get(3).mo71707D1().setSelectorOptionPreviews(m106766b());
            super.onNextClick(i);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<ServiceCenterUiModel> list = this.f86821d;
        parcel.writeInt(list.size());
        for (ServiceCenterUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f86822e);
        parcel.writeInt(this.f86823f);
    }
}
