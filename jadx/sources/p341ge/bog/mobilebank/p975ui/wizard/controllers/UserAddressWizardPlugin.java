package p341ge.bog.mobilebank.p975ui.wizard.controllers;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c91.C31355y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.BogCountry;
import p341ge.bog.mobilebank.model.BogRegion;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ge.bog.mobilebank.ui.wizard.controllers.UserAddressWizardPlugin */
public final class UserAddressWizardPlugin extends BaseWizardPlugin implements Parcelable {
    public static final Parcelable.Creator<UserAddressWizardPlugin> CREATOR = new C35885a();

    /* renamed from: d */
    private final ArrayList f86812d;

    /* renamed from: e */
    private int f86813e;

    /* renamed from: f */
    private int f86814f;

    /* renamed from: g */
    private int f86815g;

    /* renamed from: h */
    private String f86816h;

    /* renamed from: i */
    private final int f86817i;

    /* renamed from: j */
    private final int f86818j = 1;

    /* renamed from: k */
    private final int f86819k = 2;

    /* renamed from: l */
    private final int f86820l = 3;

    /* renamed from: ge.bog.mobilebank.ui.wizard.controllers.UserAddressWizardPlugin$a */
    public static final class C35885a implements Parcelable.Creator {
        /* renamed from: a */
        public final UserAddressWizardPlugin createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(BogCountry.CREATOR.createFromParcel(parcel));
            }
            return new UserAddressWizardPlugin(arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* renamed from: b */
        public final UserAddressWizardPlugin[] newArray(int i) {
            return new UserAddressWizardPlugin[i];
        }
    }

    public UserAddressWizardPlugin(ArrayList arrayList, int i, int i2, int i3, String str) {
        C41536l.m120489i(arrayList, "countries");
        this.f86812d = arrayList;
        this.f86813e = i;
        this.f86814f = i2;
        this.f86815g = i3;
        this.f86816h = str;
    }

    /* renamed from: a */
    private final void m106748a(int i) {
        if (i == this.f86817i || i == this.f86818j) {
            getWizardFragments().get(this.f86819k).mo71707D1().setSelectorOptionPreviews(m106749b());
        }
    }

    /* renamed from: b */
    private final List m106749b() {
        ArrayList arrayList = this.f86812d;
        String z1 = getWizardFragments().get(this.f86817i).mo71611z1();
        C41536l.m120488h(z1, "wizardFragments[countryIndex].inputValue");
        String countryCode = ((BogCountry) arrayList.get(Integer.parseInt(z1))).getCountryCode();
        ArrayList<BogCountry> arrayList2 = this.f86812d;
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
        for (BogCountry regions : arrayList2) {
            ArrayList<BogRegion> regions2 = regions.getRegions();
            C41536l.m120486f(regions2);
            ArrayList<BogRegion> arrayList4 = new ArrayList<>();
            for (T next : regions2) {
                if (C41536l.m120484d(((BogRegion) next).getCountryCode(), countryCode)) {
                    arrayList4.add(next);
                }
            }
            ArrayList arrayList5 = new ArrayList(C41343r.m119925u(arrayList4, 10));
            for (BogRegion displayName : arrayList4) {
                arrayList5.add(displayName.getDisplayName());
            }
            arrayList3.add(arrayList5);
        }
        return C41343r.m119927w(arrayList3);
    }

    /* renamed from: d */
    private final void m106750d(int i) {
        if (i == this.f86817i) {
            C35886a aVar = this.wizardCallback;
            C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.mobilebank.ui.wizard.activities.AdvancedWizardActivity");
            ((AdvancedWizardActivity) aVar).mo87963n3(this.f86818j, true);
            m106748a(i);
        } else if (i == this.f86818j) {
            if (C41536l.m120484d(BankApiResponse.SUCCESSFUL_RESPONSE_CODE, getWizardFragments().get(this.f86818j).mo71611z1())) {
                C35886a aVar2 = this.wizardCallback;
                C41536l.m120487g(aVar2, "null cannot be cast to non-null type ge.bog.mobilebank.ui.wizard.activities.AdvancedWizardActivity");
                ((AdvancedWizardActivity) aVar2).mo87963n3(this.f86819k, true);
            } else {
                C35886a aVar3 = this.wizardCallback;
                C41536l.m120487g(aVar3, "null cannot be cast to non-null type ge.bog.mobilebank.ui.wizard.activities.AdvancedWizardActivity");
                ((AdvancedWizardActivity) aVar3).mo87963n3(this.f86820l, true);
            }
            m106748a(i);
        } else if (i == this.f86819k) {
            C35886a aVar4 = this.wizardCallback;
            C41536l.m120487g(aVar4, "null cannot be cast to non-null type ge.bog.mobilebank.ui.wizard.activities.AdvancedWizardActivity");
            ((AdvancedWizardActivity) aVar4).mo87963n3(this.f86820l, true);
        } else if (i == this.f86820l) {
            this.wizardCallback.mo87830B(true);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo88014e() {
        getWizardFragments().get(this.f86819k).mo71717U1("-1");
        this.f86815g = -1;
        getWizardFragments().get(this.f86820l).mo71717U1("");
        this.f86816h = "";
    }

    public Intent getData() {
        String str;
        super.getData();
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        Iterator<C31355y> it = getWizardFragments().iterator();
        while (it.hasNext()) {
            C31355y next = it.next();
            if (next.mo71611z1() == null) {
                str = "";
            } else {
                str = next.mo71611z1();
            }
            arrayList.add(str);
        }
        intent.putStringArrayListExtra("WIZARD_COLLECTED_VALUES", arrayList);
        return intent;
    }

    public void onInputVerificationRequired(int i) {
        super.onInputVerificationRequired(i);
        if (i == this.f86818j && !C41536l.m120484d(getWizardFragments().get(this.f86818j).mo71611z1(), String.valueOf(this.f86814f))) {
            mo88014e();
            m106748a(i);
        } else if (i == this.f86817i && !C41536l.m120484d(getWizardFragments().get(this.f86817i).mo71611z1(), String.valueOf(this.f86813e))) {
            getWizardFragments().get(this.f86818j).mo71717U1("-1");
            this.f86814f = -1;
            mo88014e();
            m106748a(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if ("-1".equals(getWizardFragments().get(r5.f86817i).mo71611z1()) == false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNextClick(int r6) {
        /*
            r5 = this;
            int r0 = r5.f86817i
            if (r6 == r0) goto L_0x0008
            int r1 = r5.f86818j
            if (r6 != r1) goto L_0x007d
        L_0x0008:
            java.lang.String r1 = "-1"
            r2 = 1
            r3 = 0
            if (r6 != r0) goto L_0x0044
            java.util.ArrayList r0 = r5.getWizardFragments()
            int r4 = r5.f86817i
            java.lang.Object r0 = r0.get(r4)
            c91.y r0 = (c91.C31355y) r0
            java.lang.String r0 = r0.mo71611z1()
            java.lang.String r4 = "wizardFragments[countryIndex].inputValue"
            kotlin.jvm.internal.C41536l.m120488h(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002b
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r0 = r3
        L_0x002c:
            if (r0 != 0) goto L_0x0044
            java.util.ArrayList r0 = r5.getWizardFragments()
            int r4 = r5.f86817i
            java.lang.Object r0 = r0.get(r4)
            c91.y r0 = (c91.C31355y) r0
            java.lang.String r0 = r0.mo71611z1()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
        L_0x0044:
            int r0 = r5.f86818j
            if (r6 != r0) goto L_0x0080
            java.util.ArrayList r0 = r5.getWizardFragments()
            int r4 = r5.f86818j
            java.lang.Object r0 = r0.get(r4)
            c91.y r0 = (c91.C31355y) r0
            java.lang.String r0 = r0.mo71611z1()
            java.lang.String r4 = "wizardFragments[regionTypeIndex].inputValue"
            kotlin.jvm.internal.C41536l.m120488h(r0, r4)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r2 = r3
        L_0x0065:
            if (r2 != 0) goto L_0x0080
            java.util.ArrayList r0 = r5.getWizardFragments()
            int r2 = r5.f86818j
            java.lang.Object r0 = r0.get(r2)
            c91.y r0 = (c91.C31355y) r0
            java.lang.String r0 = r0.mo71611z1()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0080
        L_0x007d:
            r5.m106750d(r6)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.controllers.UserAddressWizardPlugin.onNextClick(int):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        ArrayList arrayList = this.f86812d;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BogCountry) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f86813e);
        parcel.writeInt(this.f86814f);
        parcel.writeInt(this.f86815g);
        parcel.writeString(this.f86816h);
    }
}
