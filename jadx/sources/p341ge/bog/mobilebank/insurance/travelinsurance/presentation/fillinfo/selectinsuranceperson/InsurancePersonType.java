package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType */
public enum InsurancePersonType implements Parcelable {
    ME("N", "text.travel.insurance.dialog.insured.person.choice.myself", "me"),
    OTHER("Y", "text.travel.insurance.dialog.insured.person.choice.else", "someone else");
    
    public static final Parcelable.Creator<InsurancePersonType> CREATOR = null;

    /* renamed from: d */
    private final String f63339d;

    /* renamed from: e */
    private final String f63340e;

    /* renamed from: f */
    private final String f63341f;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType$a */
    public static final class C24558a implements Parcelable.Creator {
        /* renamed from: a */
        public final InsurancePersonType createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return InsurancePersonType.valueOf(parcel.readString());
        }

        /* renamed from: b */
        public final InsurancePersonType[] newArray(int i) {
            return new InsurancePersonType[i];
        }
    }

    static {
        CREATOR = new C24558a();
    }

    private InsurancePersonType(String str, String str2, String str3) {
        this.f63339d = str;
        this.f63340e = str2;
        this.f63341f = str3;
    }

    /* renamed from: b */
    public final String mo62747b() {
        return this.f63341f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo62749e() {
        return this.f63340e;
    }

    /* renamed from: f */
    public final String mo62750f() {
        return this.f63339d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(name());
    }
}
