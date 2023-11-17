package p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.model.CreditAppLoanDetails */
public final class CreditAppLoanDetails implements Parcelable {
    public static final Parcelable.Creator<CreditAppLoanDetails> CREATOR = new C21406a();

    /* renamed from: d */
    private final String f57245d;

    /* renamed from: e */
    private final String f57246e;

    /* renamed from: f */
    private final BigDecimal f57247f;

    /* renamed from: g */
    private final String f57248g;

    /* renamed from: h */
    private final String f57249h;

    /* renamed from: i */
    private final String f57250i;

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.model.CreditAppLoanDetails$a */
    public static final class C21406a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditAppLoanDetails createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CreditAppLoanDetails(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CreditAppLoanDetails[] newArray(int i) {
            return new CreditAppLoanDetails[i];
        }
    }

    public CreditAppLoanDetails(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5) {
        this.f57245d = str;
        this.f57246e = str2;
        this.f57247f = bigDecimal;
        this.f57248g = str3;
        this.f57249h = str4;
        this.f57250i = str5;
    }

    /* renamed from: a */
    public final BigDecimal mo53430a() {
        return this.f57247f;
    }

    /* renamed from: b */
    public final String mo53431b() {
        return this.f57250i;
    }

    /* renamed from: d */
    public final String mo53432d() {
        return this.f57248g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo53434e() {
        return this.f57245d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditAppLoanDetails)) {
            return false;
        }
        CreditAppLoanDetails creditAppLoanDetails = (CreditAppLoanDetails) obj;
        return C41536l.m120484d(this.f57245d, creditAppLoanDetails.f57245d) && C41536l.m120484d(this.f57246e, creditAppLoanDetails.f57246e) && C41536l.m120484d(this.f57247f, creditAppLoanDetails.f57247f) && C41536l.m120484d(this.f57248g, creditAppLoanDetails.f57248g) && C41536l.m120484d(this.f57249h, creditAppLoanDetails.f57249h) && C41536l.m120484d(this.f57250i, creditAppLoanDetails.f57250i);
    }

    /* renamed from: f */
    public final String mo53436f() {
        return this.f57246e;
    }

    /* renamed from: g */
    public final String mo53437g() {
        return this.f57249h;
    }

    public int hashCode() {
        String str = this.f57245d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57246e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.f57247f;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.f57248g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57249h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f57250i;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.f57245d;
        String str2 = this.f57246e;
        BigDecimal bigDecimal = this.f57247f;
        String str3 = this.f57248g;
        String str4 = this.f57249h;
        String str5 = this.f57250i;
        return "CreditAppLoanDetails(loanStatusKey=" + str + ", resultCodeDictionaryKey=" + str2 + ", amount=" + bigDecimal + ", currency=" + str3 + ", term=" + str4 + ", condition=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f57245d);
        parcel.writeString(this.f57246e);
        parcel.writeSerializable(this.f57247f);
        parcel.writeString(this.f57248g);
        parcel.writeString(this.f57249h);
        parcel.writeString(this.f57250i);
    }
}
