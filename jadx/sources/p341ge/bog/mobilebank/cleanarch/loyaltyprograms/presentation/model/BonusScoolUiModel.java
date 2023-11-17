package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel */
public final class BonusScoolUiModel implements Parcelable {
    public static final Parcelable.Creator<BonusScoolUiModel> CREATOR = new C21141a();

    /* renamed from: d */
    private final Long f56775d;

    /* renamed from: e */
    private final Long f56776e;

    /* renamed from: f */
    private final Long f56777f;

    /* renamed from: g */
    private final Integer f56778g;

    /* renamed from: h */
    private final String f56779h;

    /* renamed from: i */
    private final String f56780i;

    /* renamed from: j */
    private final String f56781j;

    /* renamed from: k */
    private final String f56782k;

    /* renamed from: l */
    private final Long f56783l;

    /* renamed from: m */
    private final String f56784m;

    /* renamed from: n */
    private final String f56785n;

    /* renamed from: o */
    private final String f56786o;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel$a */
    public static final class C21141a implements Parcelable.Creator {
        /* renamed from: a */
        public final BonusScoolUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BonusScoolUiModel(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BonusScoolUiModel[] newArray(int i) {
            return new BonusScoolUiModel[i];
        }
    }

    public BonusScoolUiModel(Long l, Long l2, Long l3, Integer num, String str, String str2, String str3, String str4, Long l4, String str5, String str6, String str7) {
        this.f56775d = l;
        this.f56776e = l2;
        this.f56777f = l3;
        this.f56778g = num;
        this.f56779h = str;
        this.f56780i = str2;
        this.f56781j = str3;
        this.f56782k = str4;
        this.f56783l = l4;
        this.f56784m = str5;
        this.f56785n = str6;
        this.f56786o = str7;
    }

    /* renamed from: a */
    public final String mo52777a() {
        return this.f56782k;
    }

    /* renamed from: b */
    public final Long mo52778b() {
        return this.f56777f;
    }

    /* renamed from: d */
    public final Integer mo52779d() {
        return this.f56778g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo52781e() {
        return this.f56781j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusScoolUiModel)) {
            return false;
        }
        BonusScoolUiModel bonusScoolUiModel = (BonusScoolUiModel) obj;
        return C41536l.m120484d(this.f56775d, bonusScoolUiModel.f56775d) && C41536l.m120484d(this.f56776e, bonusScoolUiModel.f56776e) && C41536l.m120484d(this.f56777f, bonusScoolUiModel.f56777f) && C41536l.m120484d(this.f56778g, bonusScoolUiModel.f56778g) && C41536l.m120484d(this.f56779h, bonusScoolUiModel.f56779h) && C41536l.m120484d(this.f56780i, bonusScoolUiModel.f56780i) && C41536l.m120484d(this.f56781j, bonusScoolUiModel.f56781j) && C41536l.m120484d(this.f56782k, bonusScoolUiModel.f56782k) && C41536l.m120484d(this.f56783l, bonusScoolUiModel.f56783l) && C41536l.m120484d(this.f56784m, bonusScoolUiModel.f56784m) && C41536l.m120484d(this.f56785n, bonusScoolUiModel.f56785n) && C41536l.m120484d(this.f56786o, bonusScoolUiModel.f56786o);
    }

    public int hashCode() {
        Long l = this.f56775d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f56776e;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f56777f;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f56778g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f56779h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f56780i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56781j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f56782k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l4 = this.f56783l;
        int hashCode9 = (hashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str5 = this.f56784m;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f56785n;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f56786o;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        Long l = this.f56775d;
        Long l2 = this.f56776e;
        Long l3 = this.f56777f;
        Integer num = this.f56778g;
        String str = this.f56779h;
        String str2 = this.f56780i;
        String str3 = this.f56781j;
        String str4 = this.f56782k;
        Long l4 = this.f56783l;
        String str5 = this.f56784m;
        String str6 = this.f56785n;
        String str7 = this.f56786o;
        return "BonusScoolUiModel(cardId=" + l + ", acctKey=" + l2 + ", childClientKey=" + l3 + ", sclPoints=" + num + ", cardName=" + str + ", productCode=" + str2 + ", subProductCode=" + str3 + ", cardHolder=" + str4 + ", expDate=" + l4 + ", lastFour=" + str5 + ", mainCcy=" + str6 + ", dictionaryKey=" + str7 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f56775d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f56776e;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.f56777f;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Integer num = this.f56778g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f56779h);
        parcel.writeString(this.f56780i);
        parcel.writeString(this.f56781j);
        parcel.writeString(this.f56782k);
        Long l4 = this.f56783l;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        parcel.writeString(this.f56784m);
        parcel.writeString(this.f56785n);
        parcel.writeString(this.f56786o);
    }
}
