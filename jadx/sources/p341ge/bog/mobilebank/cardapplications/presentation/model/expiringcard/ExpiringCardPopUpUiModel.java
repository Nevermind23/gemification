package p341ge.bog.mobilebank.cardapplications.presentation.model.expiringcard;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.expiringcard.ExpiringCardPopUpUiModel */
public final class ExpiringCardPopUpUiModel implements Parcelable {
    public static final Parcelable.Creator<ExpiringCardPopUpUiModel> CREATOR = new C14238a();

    /* renamed from: d */
    private final long f41832d;

    /* renamed from: e */
    private final String f41833e;

    /* renamed from: f */
    private final int f41834f;

    /* renamed from: g */
    private final int f41835g;

    /* renamed from: h */
    private final String f41836h;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.expiringcard.ExpiringCardPopUpUiModel$a */
    public static final class C14238a implements Parcelable.Creator {
        /* renamed from: a */
        public final ExpiringCardPopUpUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ExpiringCardPopUpUiModel(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* renamed from: b */
        public final ExpiringCardPopUpUiModel[] newArray(int i) {
            return new ExpiringCardPopUpUiModel[i];
        }
    }

    public ExpiringCardPopUpUiModel(long j, String str, int i, int i2, String str2) {
        C41536l.m120489i(str, "title");
        this.f41832d = j;
        this.f41833e = str;
        this.f41834f = i;
        this.f41835g = i2;
        this.f41836h = str2;
    }

    /* renamed from: a */
    public final int mo39924a() {
        return this.f41835g;
    }

    /* renamed from: b */
    public final String mo39925b() {
        return this.f41836h;
    }

    /* renamed from: d */
    public final int mo39926d() {
        return this.f41834f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo39928e() {
        return this.f41833e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpiringCardPopUpUiModel)) {
            return false;
        }
        ExpiringCardPopUpUiModel expiringCardPopUpUiModel = (ExpiringCardPopUpUiModel) obj;
        return this.f41832d == expiringCardPopUpUiModel.f41832d && C41536l.m120484d(this.f41833e, expiringCardPopUpUiModel.f41833e) && this.f41834f == expiringCardPopUpUiModel.f41834f && this.f41835g == expiringCardPopUpUiModel.f41835g && C41536l.m120484d(this.f41836h, expiringCardPopUpUiModel.f41836h);
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.f41832d) * 31) + this.f41833e.hashCode()) * 31) + this.f41834f) * 31) + this.f41835g) * 31;
        String str = this.f41836h;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f41832d;
        String str = this.f41833e;
        int i = this.f41834f;
        int i2 = this.f41835g;
        String str2 = this.f41836h;
        return "ExpiringCardPopUpUiModel(cardId=" + j + ", title=" + str + ", placeHolderImageRes=" + i + ", daysUntilMonthEnd=" + i2 + ", imageUrl=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f41832d);
        parcel.writeString(this.f41833e);
        parcel.writeInt(this.f41834f);
        parcel.writeInt(this.f41835g);
        parcel.writeString(this.f41836h);
    }
}
