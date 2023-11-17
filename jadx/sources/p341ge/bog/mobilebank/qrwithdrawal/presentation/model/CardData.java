package p341ge.bog.mobilebank.qrwithdrawal.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.model.CardData */
public final class CardData implements Parcelable {
    public static final Parcelable.Creator<CardData> CREATOR = new C34427a();

    /* renamed from: d */
    private final String f83419d;

    /* renamed from: e */
    private final Integer f83420e;

    /* renamed from: f */
    private final String f83421f;

    /* renamed from: g */
    private final String f83422g;

    /* renamed from: h */
    private final boolean f83423h;

    /* renamed from: i */
    private final String f83424i;

    /* renamed from: j */
    private final String f83425j;

    /* renamed from: k */
    private final boolean f83426k;

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.model.CardData$a */
    public static final class C34427a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardData(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final CardData[] newArray(int i) {
            return new CardData[i];
        }
    }

    public CardData(String str, Integer num, String str2, String str3, boolean z, String str4, String str5, boolean z2) {
        C41536l.m120489i(str4, "cardId");
        C41536l.m120489i(str5, "lastFour");
        this.f83419d = str;
        this.f83420e = num;
        this.f83421f = str2;
        this.f83422g = str3;
        this.f83423h = z;
        this.f83424i = str4;
        this.f83425j = str5;
        this.f83426k = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ CardData m101221b(CardData cardData, String str, Integer num, String str2, String str3, boolean z, String str4, String str5, boolean z2, int i, Object obj) {
        CardData cardData2 = cardData;
        int i2 = i;
        return cardData.mo82954a((i2 & 1) != 0 ? cardData2.f83419d : str, (i2 & 2) != 0 ? cardData2.f83420e : num, (i2 & 4) != 0 ? cardData2.f83421f : str2, (i2 & 8) != 0 ? cardData2.f83422g : str3, (i2 & 16) != 0 ? cardData2.f83423h : z, (i2 & 32) != 0 ? cardData2.f83424i : str4, (i2 & 64) != 0 ? cardData2.f83425j : str5, (i2 & 128) != 0 ? cardData2.f83426k : z2);
    }

    /* renamed from: a */
    public final CardData mo82954a(String str, Integer num, String str2, String str3, boolean z, String str4, String str5, boolean z2) {
        String str6 = str4;
        C41536l.m120489i(str6, "cardId");
        String str7 = str5;
        C41536l.m120489i(str7, "lastFour");
        return new CardData(str, num, str2, str3, z, str6, str7, z2);
    }

    /* renamed from: d */
    public final String mo82955d() {
        return this.f83422g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo82957e() {
        return this.f83424i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardData)) {
            return false;
        }
        CardData cardData = (CardData) obj;
        return C41536l.m120484d(this.f83419d, cardData.f83419d) && C41536l.m120484d(this.f83420e, cardData.f83420e) && C41536l.m120484d(this.f83421f, cardData.f83421f) && C41536l.m120484d(this.f83422g, cardData.f83422g) && this.f83423h == cardData.f83423h && C41536l.m120484d(this.f83424i, cardData.f83424i) && C41536l.m120484d(this.f83425j, cardData.f83425j) && this.f83426k == cardData.f83426k;
    }

    /* renamed from: f */
    public final Integer mo82959f() {
        return this.f83420e;
    }

    /* renamed from: g */
    public final String mo82960g() {
        return this.f83419d;
    }

    /* renamed from: h */
    public final String mo82961h() {
        return this.f83425j;
    }

    public int hashCode() {
        String str = this.f83419d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f83420e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f83421f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83422g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f83423h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode4 = (((((i2 + (z ? 1 : 0)) * 31) + this.f83424i.hashCode()) * 31) + this.f83425j.hashCode()) * 31;
        boolean z3 = this.f83426k;
        if (!z3) {
            z2 = z3;
        }
        return hashCode4 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo82963i() {
        return this.f83421f;
    }

    /* renamed from: j */
    public final boolean mo82964j() {
        return this.f83426k;
    }

    public String toString() {
        String str = this.f83419d;
        Integer num = this.f83420e;
        String str2 = this.f83421f;
        String str3 = this.f83422g;
        boolean z = this.f83423h;
        String str4 = this.f83424i;
        String str5 = this.f83425j;
        boolean z2 = this.f83426k;
        return "CardData(imageLink=" + str + ", image=" + num + ", title=" + str2 + ", amount=" + str3 + ", isDefault=" + z + ", cardId=" + str4 + ", lastFour=" + str5 + ", isCreditCard=" + z2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f83419d);
        Integer num = this.f83420e;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f83421f);
        parcel.writeString(this.f83422g);
        parcel.writeInt(this.f83423h ? 1 : 0);
        parcel.writeString(this.f83424i);
        parcel.writeString(this.f83425j);
        parcel.writeInt(this.f83426k ? 1 : 0);
    }
}
