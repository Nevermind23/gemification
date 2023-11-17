package p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel */
public final class InsuranceProviderUiModel implements Parcelable {
    public static final Parcelable.Creator<InsuranceProviderUiModel> CREATOR = new C20938a();

    /* renamed from: d */
    private final String f56268d;

    /* renamed from: e */
    private final String f56269e;

    /* renamed from: f */
    private final String f56270f;

    /* renamed from: g */
    private final String f56271g;

    /* renamed from: h */
    private final boolean f56272h;

    /* renamed from: i */
    private final boolean f56273i;

    /* renamed from: j */
    private boolean f56274j;

    /* renamed from: k */
    private final boolean f56275k;

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel$a */
    public static final class C20938a implements Parcelable.Creator {
        /* renamed from: a */
        public final InsuranceProviderUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new InsuranceProviderUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final InsuranceProviderUiModel[] newArray(int i) {
            return new InsuranceProviderUiModel[i];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r4 == r7) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InsuranceProviderUiModel(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6, boolean r7, boolean r8) {
        /*
            r1 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            r1.<init>()
            r1.f56268d = r2
            r1.f56269e = r3
            r1.f56270f = r4
            r1.f56271g = r5
            r1.f56272h = r6
            r1.f56273i = r7
            r1.f56274j = r8
            r2 = 1
            r3 = 0
            if (r4 == 0) goto L_0x0021
            r4 = r2
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            if (r4 != r6) goto L_0x002c
            if (r5 == 0) goto L_0x0028
            r4 = r2
            goto L_0x0029
        L_0x0028:
            r4 = r3
        L_0x0029:
            if (r4 != r7) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = r3
        L_0x002d:
            r1.f56275k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    /* renamed from: a */
    public final String mo49825a() {
        return this.f56271g;
    }

    /* renamed from: b */
    public final String mo49826b() {
        return this.f56268d;
    }

    /* renamed from: d */
    public final String mo49827d() {
        return this.f56270f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo49829e() {
        return this.f56269e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceProviderUiModel)) {
            return false;
        }
        InsuranceProviderUiModel insuranceProviderUiModel = (InsuranceProviderUiModel) obj;
        return C41536l.m120484d(this.f56268d, insuranceProviderUiModel.f56268d) && C41536l.m120484d(this.f56269e, insuranceProviderUiModel.f56269e) && C41536l.m120484d(this.f56270f, insuranceProviderUiModel.f56270f) && C41536l.m120484d(this.f56271g, insuranceProviderUiModel.f56271g) && this.f56272h == insuranceProviderUiModel.f56272h && this.f56273i == insuranceProviderUiModel.f56273i && this.f56274j == insuranceProviderUiModel.f56274j;
    }

    /* renamed from: f */
    public final boolean mo49831f() {
        return this.f56274j;
    }

    /* renamed from: g */
    public final boolean mo49832g() {
        return this.f56273i;
    }

    /* renamed from: h */
    public final boolean mo49833h() {
        return this.f56275k;
    }

    public int hashCode() {
        int hashCode = ((this.f56268d.hashCode() * 31) + this.f56269e.hashCode()) * 31;
        String str = this.f56270f;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f56271g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f56272h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f56273i;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f56274j;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo49835i() {
        return this.f56272h;
    }

    /* renamed from: j */
    public final void mo49836j(boolean z) {
        this.f56274j = z;
    }

    public String toString() {
        String str = this.f56268d;
        String str2 = this.f56269e;
        String str3 = this.f56270f;
        String str4 = this.f56271g;
        boolean z = this.f56272h;
        boolean z2 = this.f56273i;
        boolean z3 = this.f56274j;
        return "InsuranceProviderUiModel(id=" + str + ", title=" + str2 + ", lifeInsurance=" + str3 + ", creditInsurance=" + str4 + ", isLifeInsuranceEnabled=" + z + ", isCreditInsuranceEnabled=" + z2 + ", isChecked=" + z3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f56268d);
        parcel.writeString(this.f56269e);
        parcel.writeString(this.f56270f);
        parcel.writeString(this.f56271g);
        parcel.writeInt(this.f56272h ? 1 : 0);
        parcel.writeInt(this.f56273i ? 1 : 0);
        parcel.writeInt(this.f56274j ? 1 : 0);
    }
}
