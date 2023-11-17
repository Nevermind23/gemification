package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardSubTypeUiModel */
public final class CardSubTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<CardSubTypeUiModel> CREATOR = new C14207a();

    /* renamed from: d */
    private final String f41664d;

    /* renamed from: e */
    private final String f41665e;

    /* renamed from: f */
    private final String f41666f;

    /* renamed from: g */
    private final String f41667g;

    /* renamed from: h */
    private final boolean f41668h;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardSubTypeUiModel$a */
    public static final class C14207a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardSubTypeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardSubTypeUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final CardSubTypeUiModel[] newArray(int i) {
            return new CardSubTypeUiModel[i];
        }
    }

    public CardSubTypeUiModel(String str, String str2, String str3, String str4, boolean z) {
        C41536l.m120489i(str, "product");
        C41536l.m120489i(str2, "subProductCode");
        C41536l.m120489i(str3, "orderNumber");
        C41536l.m120489i(str4, "regionId");
        this.f41664d = str;
        this.f41665e = str2;
        this.f41666f = str3;
        this.f41667g = str4;
        this.f41668h = z;
    }

    /* renamed from: a */
    public final String mo39463a() {
        return this.f41664d;
    }

    /* renamed from: b */
    public final String mo39464b() {
        return this.f41667g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSubTypeUiModel)) {
            return false;
        }
        CardSubTypeUiModel cardSubTypeUiModel = (CardSubTypeUiModel) obj;
        return C41536l.m120484d(this.f41664d, cardSubTypeUiModel.f41664d) && C41536l.m120484d(this.f41665e, cardSubTypeUiModel.f41665e) && C41536l.m120484d(this.f41666f, cardSubTypeUiModel.f41666f) && C41536l.m120484d(this.f41667g, cardSubTypeUiModel.f41667g) && this.f41668h == cardSubTypeUiModel.f41668h;
    }

    public int hashCode() {
        int hashCode = ((((((this.f41664d.hashCode() * 31) + this.f41665e.hashCode()) * 31) + this.f41666f.hashCode()) * 31) + this.f41667g.hashCode()) * 31;
        boolean z = this.f41668h;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f41664d;
        String str2 = this.f41665e;
        String str3 = this.f41666f;
        String str4 = this.f41667g;
        boolean z = this.f41668h;
        return "CardSubTypeUiModel(product=" + str + ", subProductCode=" + str2 + ", orderNumber=" + str3 + ", regionId=" + str4 + ", digitalCardFlag=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41664d);
        parcel.writeString(this.f41665e);
        parcel.writeString(this.f41666f);
        parcel.writeString(this.f41667g);
        parcel.writeInt(this.f41668h ? 1 : 0);
    }
}
