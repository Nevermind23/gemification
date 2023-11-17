package p341ge.bog.mobilebank.cleanarch.presentation.offer.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p852ov.C27088c;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.model.LoanOfferLimitUiModel */
public final class LoanOfferLimitUiModel implements Parcelable {
    public static final Parcelable.Creator<LoanOfferLimitUiModel> CREATOR = new C21988a();

    /* renamed from: d */
    private final C27088c f58495d;

    /* renamed from: e */
    private final OfferProductCode f58496e;

    /* renamed from: f */
    private final String f58497f;

    /* renamed from: g */
    private final BigDecimal f58498g;

    /* renamed from: h */
    private final String f58499h;

    /* renamed from: i */
    private final String f58500i;

    /* renamed from: j */
    private final String f58501j;

    /* renamed from: k */
    private final String f58502k;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.model.LoanOfferLimitUiModel$a */
    public static final class C21988a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoanOfferLimitUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new LoanOfferLimitUiModel(C27088c.valueOf(parcel.readString()), (OfferProductCode) parcel.readParcelable(LoanOfferLimitUiModel.class.getClassLoader()), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final LoanOfferLimitUiModel[] newArray(int i) {
            return new LoanOfferLimitUiModel[i];
        }
    }

    public LoanOfferLimitUiModel(C27088c cVar, OfferProductCode offerProductCode, String str, BigDecimal bigDecimal, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(cVar, "operationType");
        C41536l.m120489i(offerProductCode, "productCode");
        C41536l.m120489i(str, "loanCcy");
        C41536l.m120489i(bigDecimal, "loanAmount");
        this.f58495d = cVar;
        this.f58496e = offerProductCode;
        this.f58497f = str;
        this.f58498g = bigDecimal;
        this.f58499h = str2;
        this.f58500i = str3;
        this.f58501j = str4;
        this.f58502k = str5;
    }

    /* renamed from: a */
    public final String mo54642a() {
        return this.f58502k;
    }

    /* renamed from: b */
    public final BigDecimal mo54643b() {
        return this.f58498g;
    }

    /* renamed from: d */
    public final String mo54644d() {
        return this.f58497f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final C27088c mo54646e() {
        return this.f58495d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanOfferLimitUiModel)) {
            return false;
        }
        LoanOfferLimitUiModel loanOfferLimitUiModel = (LoanOfferLimitUiModel) obj;
        return this.f58495d == loanOfferLimitUiModel.f58495d && C41536l.m120484d(this.f58496e, loanOfferLimitUiModel.f58496e) && C41536l.m120484d(this.f58497f, loanOfferLimitUiModel.f58497f) && C41536l.m120484d(this.f58498g, loanOfferLimitUiModel.f58498g) && C41536l.m120484d(this.f58499h, loanOfferLimitUiModel.f58499h) && C41536l.m120484d(this.f58500i, loanOfferLimitUiModel.f58500i) && C41536l.m120484d(this.f58501j, loanOfferLimitUiModel.f58501j) && C41536l.m120484d(this.f58502k, loanOfferLimitUiModel.f58502k);
    }

    /* renamed from: f */
    public final OfferProductCode mo54648f() {
        return this.f58496e;
    }

    /* renamed from: g */
    public final String mo54649g() {
        return this.f58500i;
    }

    public int hashCode() {
        int hashCode = ((((((this.f58495d.hashCode() * 31) + this.f58496e.hashCode()) * 31) + this.f58497f.hashCode()) * 31) + this.f58498g.hashCode()) * 31;
        String str = this.f58499h;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58500i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f58501j;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f58502k;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        C27088c cVar = this.f58495d;
        OfferProductCode offerProductCode = this.f58496e;
        String str = this.f58497f;
        BigDecimal bigDecimal = this.f58498g;
        String str2 = this.f58499h;
        String str3 = this.f58500i;
        String str4 = this.f58501j;
        String str5 = this.f58502k;
        return "LoanOfferLimitUiModel(operationType=" + cVar + ", productCode=" + offerProductCode + ", loanCcy=" + str + ", loanAmount=" + bigDecimal + ", titleDictionaryKey=" + str2 + ", titleDictionaryKeyValue=" + str3 + ", infoDictionaryKey=" + str4 + ", infoDictionaryKeyValue=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f58495d.name());
        parcel.writeParcelable(this.f58496e, i);
        parcel.writeString(this.f58497f);
        parcel.writeSerializable(this.f58498g);
        parcel.writeString(this.f58499h);
        parcel.writeString(this.f58500i);
        parcel.writeString(this.f58501j);
        parcel.writeString(this.f58502k);
    }
}
