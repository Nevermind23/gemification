package p341ge.bog.mobilebank.payments.presentation.resultpage.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.data.model.CodeStatus;
import p341ge.bog.mobilebank.payments.domain.model.PaymentPayParameter;

/* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.model.PaymentResultObjectUiModel */
public final class PaymentResultObjectUiModel implements Parcelable {
    public static final Parcelable.Creator<PaymentResultObjectUiModel> CREATOR = new C33780a();

    /* renamed from: d */
    private final CodeStatus f82273d;

    /* renamed from: e */
    private final String f82274e;

    /* renamed from: f */
    private final String f82275f;

    /* renamed from: g */
    private final String f82276g;

    /* renamed from: h */
    private final String f82277h;

    /* renamed from: i */
    private final String f82278i;

    /* renamed from: j */
    private final String f82279j;

    /* renamed from: k */
    private final String f82280k;

    /* renamed from: l */
    private final String f82281l;

    /* renamed from: m */
    private final Long f82282m;

    /* renamed from: n */
    private final boolean f82283n;

    /* renamed from: o */
    private final boolean f82284o;

    /* renamed from: p */
    private final boolean f82285p;

    /* renamed from: q */
    private final PaymentPayParameter f82286q;

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.model.PaymentResultObjectUiModel$a */
    public static final class C33780a implements Parcelable.Creator {
        /* renamed from: a */
        public final PaymentResultObjectUiModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            return new PaymentResultObjectUiModel(CodeStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, PaymentPayParameter.CREATOR.createFromParcel(parcel2));
        }

        /* renamed from: b */
        public final PaymentResultObjectUiModel[] newArray(int i) {
            return new PaymentResultObjectUiModel[i];
        }
    }

    public PaymentResultObjectUiModel(CodeStatus codeStatus, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, boolean z, boolean z2, boolean z3, PaymentPayParameter paymentPayParameter) {
        C41536l.m120489i(codeStatus, "paymentStatus");
        C41536l.m120489i(str2, "serviceName");
        C41536l.m120489i(str3, "serviceLogo");
        C41536l.m120489i(str5, "amountParamId");
        C41536l.m120489i(str7, "cardClass");
        C41536l.m120489i(str8, "lastFour");
        C41536l.m120489i(paymentPayParameter, "paymentParams");
        this.f82273d = codeStatus;
        this.f82274e = str;
        this.f82275f = str2;
        this.f82276g = str3;
        this.f82277h = str4;
        this.f82278i = str5;
        this.f82279j = str6;
        this.f82280k = str7;
        this.f82281l = str8;
        this.f82282m = l;
        this.f82283n = z;
        this.f82284o = z2;
        this.f82285p = z3;
        this.f82286q = paymentPayParameter;
    }

    /* renamed from: a */
    public final String mo80458a() {
        return this.f82278i;
    }

    /* renamed from: b */
    public final String mo80459b() {
        return this.f82280k;
    }

    /* renamed from: d */
    public final String mo80460d() {
        return this.f82279j;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo80462e() {
        return this.f82277h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentResultObjectUiModel)) {
            return false;
        }
        PaymentResultObjectUiModel paymentResultObjectUiModel = (PaymentResultObjectUiModel) obj;
        return this.f82273d == paymentResultObjectUiModel.f82273d && C41536l.m120484d(this.f82274e, paymentResultObjectUiModel.f82274e) && C41536l.m120484d(this.f82275f, paymentResultObjectUiModel.f82275f) && C41536l.m120484d(this.f82276g, paymentResultObjectUiModel.f82276g) && C41536l.m120484d(this.f82277h, paymentResultObjectUiModel.f82277h) && C41536l.m120484d(this.f82278i, paymentResultObjectUiModel.f82278i) && C41536l.m120484d(this.f82279j, paymentResultObjectUiModel.f82279j) && C41536l.m120484d(this.f82280k, paymentResultObjectUiModel.f82280k) && C41536l.m120484d(this.f82281l, paymentResultObjectUiModel.f82281l) && C41536l.m120484d(this.f82282m, paymentResultObjectUiModel.f82282m) && this.f82283n == paymentResultObjectUiModel.f82283n && this.f82284o == paymentResultObjectUiModel.f82284o && this.f82285p == paymentResultObjectUiModel.f82285p && C41536l.m120484d(this.f82286q, paymentResultObjectUiModel.f82286q);
    }

    /* renamed from: f */
    public final String mo80464f() {
        return this.f82274e;
    }

    /* renamed from: g */
    public final String mo80465g() {
        return this.f82281l;
    }

    /* renamed from: h */
    public final Long mo80466h() {
        return this.f82282m;
    }

    public int hashCode() {
        int hashCode = this.f82273d.hashCode() * 31;
        String str = this.f82274e;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f82275f.hashCode()) * 31) + this.f82276g.hashCode()) * 31;
        String str2 = this.f82277h;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f82278i.hashCode()) * 31;
        String str3 = this.f82279j;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f82280k.hashCode()) * 31) + this.f82281l.hashCode()) * 31;
        Long l = this.f82282m;
        if (l != null) {
            i = l.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.f82283n;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f82284o;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f82285p;
        if (!z4) {
            z2 = z4;
        }
        return ((i4 + (z2 ? 1 : 0)) * 31) + this.f82286q.hashCode();
    }

    /* renamed from: i */
    public final PaymentPayParameter mo80468i() {
        return this.f82286q;
    }

    /* renamed from: j */
    public final CodeStatus mo80469j() {
        return this.f82273d;
    }

    /* renamed from: k */
    public final String mo80470k() {
        return this.f82276g;
    }

    /* renamed from: l */
    public final String mo80471l() {
        return this.f82275f;
    }

    /* renamed from: m */
    public final boolean mo80472m() {
        return this.f82285p;
    }

    /* renamed from: p */
    public final boolean mo80473p() {
        return this.f82283n;
    }

    /* renamed from: q */
    public final boolean mo80474q() {
        return this.f82284o;
    }

    public String toString() {
        CodeStatus codeStatus = this.f82273d;
        String str = this.f82274e;
        String str2 = this.f82275f;
        String str3 = this.f82276g;
        String str4 = this.f82277h;
        String str5 = this.f82278i;
        String str6 = this.f82279j;
        String str7 = this.f82280k;
        String str8 = this.f82281l;
        Long l = this.f82282m;
        boolean z = this.f82283n;
        boolean z2 = this.f82284o;
        boolean z3 = this.f82285p;
        PaymentPayParameter paymentPayParameter = this.f82286q;
        return "PaymentResultObjectUiModel(paymentStatus=" + codeStatus + ", errorKey=" + str + ", serviceName=" + str2 + ", serviceLogo=" + str3 + ", customerId=" + str4 + ", amountParamId=" + str5 + ", cardImage=" + str6 + ", cardClass=" + str7 + ", lastFour=" + str8 + ", paymentDate=" + l + ", isDDAllowed=" + z + ", isTemplateAllowed=" + z2 + ", isCarTemplateAllowed=" + z3 + ", paymentParams=" + paymentPayParameter + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f82273d.name());
        parcel.writeString(this.f82274e);
        parcel.writeString(this.f82275f);
        parcel.writeString(this.f82276g);
        parcel.writeString(this.f82277h);
        parcel.writeString(this.f82278i);
        parcel.writeString(this.f82279j);
        parcel.writeString(this.f82280k);
        parcel.writeString(this.f82281l);
        Long l = this.f82282m;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.f82283n ? 1 : 0);
        parcel.writeInt(this.f82284o ? 1 : 0);
        parcel.writeInt(this.f82285p ? 1 : 0);
        this.f82286q.writeToParcel(parcel, i);
    }
}
