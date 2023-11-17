package p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoLookupUiModel */
public final class FinancialInfoLookupUiModel implements Parcelable {
    public static final Parcelable.Creator<FinancialInfoLookupUiModel> CREATOR = new C14563a();

    /* renamed from: d */
    private final String f42425d;

    /* renamed from: e */
    private final String f42426e;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoLookupUiModel$a */
    public static final class C14563a implements Parcelable.Creator {
        /* renamed from: a */
        public final FinancialInfoLookupUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new FinancialInfoLookupUiModel(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final FinancialInfoLookupUiModel[] newArray(int i) {
            return new FinancialInfoLookupUiModel[i];
        }
    }

    public FinancialInfoLookupUiModel(String str, String str2) {
        C41536l.m120489i(str, "titleKey");
        C41536l.m120489i(str2, "type");
        this.f42425d = str;
        this.f42426e = str2;
    }

    /* renamed from: a */
    public final String mo40836a() {
        return this.f42425d;
    }

    /* renamed from: b */
    public final String mo40837b() {
        return this.f42426e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialInfoLookupUiModel)) {
            return false;
        }
        FinancialInfoLookupUiModel financialInfoLookupUiModel = (FinancialInfoLookupUiModel) obj;
        return C41536l.m120484d(this.f42425d, financialInfoLookupUiModel.f42425d) && C41536l.m120484d(this.f42426e, financialInfoLookupUiModel.f42426e);
    }

    public int hashCode() {
        return (this.f42425d.hashCode() * 31) + this.f42426e.hashCode();
    }

    public String toString() {
        String str = this.f42425d;
        String str2 = this.f42426e;
        return "FinancialInfoLookupUiModel(titleKey=" + str + ", type=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f42425d);
        parcel.writeString(this.f42426e);
    }
}
