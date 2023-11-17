package p341ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits;

import android.os.Parcel;
import android.os.Parcelable;
import fu0.C32010a;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits.BenefitUiModel */
public final class BenefitUiModel implements Parcelable {
    public static final Parcelable.Creator<BenefitUiModel> CREATOR = new C33172a();

    /* renamed from: d */
    private final String f81253d;

    /* renamed from: e */
    private final String f81254e;

    /* renamed from: f */
    private final String f81255f;

    /* renamed from: g */
    private final String f81256g;

    /* renamed from: h */
    private final C32010a f81257h;

    /* renamed from: i */
    private final String f81258i;

    /* renamed from: j */
    private final String f81259j;

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits.BenefitUiModel$a */
    public static final class C33172a implements Parcelable.Creator {
        /* renamed from: a */
        public final BenefitUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BenefitUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C32010a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BenefitUiModel[] newArray(int i) {
            return new BenefitUiModel[i];
        }
    }

    public BenefitUiModel(String str, String str2, String str3, String str4, C32010a aVar, String str5, String str6) {
        C41536l.m120489i(str, "clientKey");
        C41536l.m120489i(str2, "labelType");
        C41536l.m120489i(str3, "labelDesc");
        C41536l.m120489i(str4, "benefitValue");
        C41536l.m120489i(str5, "orderValue");
        C41536l.m120489i(str6, "benefitDesc");
        this.f81253d = str;
        this.f81254e = str2;
        this.f81255f = str3;
        this.f81256g = str4;
        this.f81257h = aVar;
        this.f81258i = str5;
        this.f81259j = str6;
    }

    /* renamed from: a */
    public final String mo75430a() {
        return this.f81259j;
    }

    /* renamed from: b */
    public final C32010a mo75431b() {
        return this.f81257h;
    }

    /* renamed from: d */
    public final String mo75432d() {
        return this.f81256g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitUiModel)) {
            return false;
        }
        BenefitUiModel benefitUiModel = (BenefitUiModel) obj;
        return C41536l.m120484d(this.f81253d, benefitUiModel.f81253d) && C41536l.m120484d(this.f81254e, benefitUiModel.f81254e) && C41536l.m120484d(this.f81255f, benefitUiModel.f81255f) && C41536l.m120484d(this.f81256g, benefitUiModel.f81256g) && this.f81257h == benefitUiModel.f81257h && C41536l.m120484d(this.f81258i, benefitUiModel.f81258i) && C41536l.m120484d(this.f81259j, benefitUiModel.f81259j);
    }

    public int hashCode() {
        int hashCode = ((((((this.f81253d.hashCode() * 31) + this.f81254e.hashCode()) * 31) + this.f81255f.hashCode()) * 31) + this.f81256g.hashCode()) * 31;
        C32010a aVar = this.f81257h;
        return ((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f81258i.hashCode()) * 31) + this.f81259j.hashCode();
    }

    public String toString() {
        String str = this.f81253d;
        String str2 = this.f81254e;
        String str3 = this.f81255f;
        String str4 = this.f81256g;
        C32010a aVar = this.f81257h;
        String str5 = this.f81258i;
        String str6 = this.f81259j;
        return "BenefitUiModel(clientKey=" + str + ", labelType=" + str2 + ", labelDesc=" + str3 + ", benefitValue=" + str4 + ", benefitState=" + aVar + ", orderValue=" + str5 + ", benefitDesc=" + str6 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81253d);
        parcel.writeString(this.f81254e);
        parcel.writeString(this.f81255f);
        parcel.writeString(this.f81256g);
        C32010a aVar = this.f81257h;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeString(this.f81258i);
        parcel.writeString(this.f81259j);
    }
}
