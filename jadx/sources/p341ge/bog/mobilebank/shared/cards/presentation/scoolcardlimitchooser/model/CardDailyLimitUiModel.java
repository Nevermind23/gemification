package p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel */
public final class CardDailyLimitUiModel implements Parcelable {
    public static final Parcelable.Creator<CardDailyLimitUiModel> CREATOR = new C34632a();

    /* renamed from: d */
    private final long f83694d;

    /* renamed from: e */
    private final String f83695e;

    /* renamed from: f */
    private final String f83696f;

    /* renamed from: g */
    private final String f83697g;

    /* renamed from: h */
    private final boolean f83698h;

    /* renamed from: ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel$a */
    public static final class C34632a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardDailyLimitUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardDailyLimitUiModel(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final CardDailyLimitUiModel[] newArray(int i) {
            return new CardDailyLimitUiModel[i];
        }
    }

    public CardDailyLimitUiModel(long j, String str, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "dailyLimitType");
        C41536l.m120489i(str3, "limitTypeDesc");
        this.f83694d = j;
        this.f83695e = str;
        this.f83696f = str2;
        this.f83697g = str3;
        this.f83698h = z;
    }

    /* renamed from: a */
    public final String mo84222a() {
        return this.f83696f;
    }

    /* renamed from: b */
    public final String mo84223b() {
        return this.f83697g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDailyLimitUiModel)) {
            return false;
        }
        CardDailyLimitUiModel cardDailyLimitUiModel = (CardDailyLimitUiModel) obj;
        return this.f83694d == cardDailyLimitUiModel.f83694d && C41536l.m120484d(this.f83695e, cardDailyLimitUiModel.f83695e) && C41536l.m120484d(this.f83696f, cardDailyLimitUiModel.f83696f) && C41536l.m120484d(this.f83697g, cardDailyLimitUiModel.f83697g) && this.f83698h == cardDailyLimitUiModel.f83698h;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.f83694d) * 31) + this.f83695e.hashCode()) * 31) + this.f83696f.hashCode()) * 31) + this.f83697g.hashCode()) * 31;
        boolean z = this.f83698h;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public String toString() {
        long j = this.f83694d;
        String str = this.f83695e;
        String str2 = this.f83696f;
        String str3 = this.f83697g;
        boolean z = this.f83698h;
        return "CardDailyLimitUiModel(id=" + j + ", prodType=" + str + ", dailyLimitType=" + str2 + ", limitTypeDesc=" + str3 + ", showFlag=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f83694d);
        parcel.writeString(this.f83695e);
        parcel.writeString(this.f83696f);
        parcel.writeString(this.f83697g);
        parcel.writeInt(this.f83698h ? 1 : 0);
    }
}
