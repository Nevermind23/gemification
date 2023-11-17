package p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel */
public final class FinancialInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<FinancialInfoUiModel> CREATOR = new C14564a();

    /* renamed from: d */
    private final String f42427d;

    /* renamed from: e */
    private final String f42428e;

    /* renamed from: f */
    private final String f42429f;

    /* renamed from: g */
    private final String f42430g;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel$a */
    public static final class C14564a implements Parcelable.Creator {
        /* renamed from: a */
        public final FinancialInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new FinancialInfoUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final FinancialInfoUiModel[] newArray(int i) {
            return new FinancialInfoUiModel[i];
        }
    }

    public FinancialInfoUiModel(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(str2, "type");
        C41536l.m120489i(str3, "amount");
        C41536l.m120489i(str4, "ccy");
        this.f42427d = str;
        this.f42428e = str2;
        this.f42429f = str3;
        this.f42430g = str4;
    }

    /* renamed from: a */
    public final String mo40847a() {
        return this.f42429f;
    }

    /* renamed from: b */
    public final String mo40848b() {
        return this.f42430g;
    }

    /* renamed from: d */
    public final String mo40849d() {
        return this.f42427d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo40851e() {
        return this.f42428e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialInfoUiModel)) {
            return false;
        }
        FinancialInfoUiModel financialInfoUiModel = (FinancialInfoUiModel) obj;
        return C41536l.m120484d(this.f42427d, financialInfoUiModel.f42427d) && C41536l.m120484d(this.f42428e, financialInfoUiModel.f42428e) && C41536l.m120484d(this.f42429f, financialInfoUiModel.f42429f) && C41536l.m120484d(this.f42430g, financialInfoUiModel.f42430g);
    }

    public int hashCode() {
        return (((((this.f42427d.hashCode() * 31) + this.f42428e.hashCode()) * 31) + this.f42429f.hashCode()) * 31) + this.f42430g.hashCode();
    }

    public String toString() {
        String str = this.f42427d;
        String str2 = this.f42428e;
        String str3 = this.f42429f;
        String str4 = this.f42430g;
        return "FinancialInfoUiModel(name=" + str + ", type=" + str2 + ", amount=" + str3 + ", ccy=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f42427d);
        parcel.writeString(this.f42428e);
        parcel.writeString(this.f42429f);
        parcel.writeString(this.f42430g);
    }
}
