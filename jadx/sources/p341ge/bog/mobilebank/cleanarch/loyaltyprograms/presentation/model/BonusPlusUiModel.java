package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel */
public final class BonusPlusUiModel implements Parcelable {
    public static final Parcelable.Creator<BonusPlusUiModel> CREATOR = new C21140a();

    /* renamed from: d */
    private final Long f56763d;

    /* renamed from: e */
    private final Double f56764e;

    /* renamed from: f */
    private final Double f56765f;

    /* renamed from: g */
    private final Double f56766g;

    /* renamed from: h */
    private final Integer f56767h;

    /* renamed from: i */
    private final String f56768i;

    /* renamed from: j */
    private final String f56769j;

    /* renamed from: k */
    private final String f56770k;

    /* renamed from: l */
    private final Long f56771l;

    /* renamed from: m */
    private final Double f56772m;

    /* renamed from: n */
    private final Long f56773n;

    /* renamed from: o */
    private final Double f56774o;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel$a */
    public static final class C21140a implements Parcelable.Creator {
        /* renamed from: a */
        public final BonusPlusUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BonusPlusUiModel(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* renamed from: b */
        public final BonusPlusUiModel[] newArray(int i) {
            return new BonusPlusUiModel[i];
        }
    }

    public BonusPlusUiModel(Long l, Double d, Double d2, Double d3, Integer num, String str, String str2, String str3, Long l2, Double d4, Long l3, Double d5) {
        this.f56763d = l;
        this.f56764e = d;
        this.f56765f = d2;
        this.f56766g = d3;
        this.f56767h = num;
        this.f56768i = str;
        this.f56769j = str2;
        this.f56770k = str3;
        this.f56771l = l2;
        this.f56772m = d4;
        this.f56773n = l3;
        this.f56774o = d5;
    }

    /* renamed from: a */
    public final Double mo52759a() {
        return this.f56774o;
    }

    /* renamed from: b */
    public final Double mo52760b() {
        return this.f56766g;
    }

    /* renamed from: d */
    public final Long mo52761d() {
        return this.f56773n;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Double mo52763e() {
        return this.f56772m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusPlusUiModel)) {
            return false;
        }
        BonusPlusUiModel bonusPlusUiModel = (BonusPlusUiModel) obj;
        return C41536l.m120484d(this.f56763d, bonusPlusUiModel.f56763d) && C41536l.m120484d(this.f56764e, bonusPlusUiModel.f56764e) && C41536l.m120484d(this.f56765f, bonusPlusUiModel.f56765f) && C41536l.m120484d(this.f56766g, bonusPlusUiModel.f56766g) && C41536l.m120484d(this.f56767h, bonusPlusUiModel.f56767h) && C41536l.m120484d(this.f56768i, bonusPlusUiModel.f56768i) && C41536l.m120484d(this.f56769j, bonusPlusUiModel.f56769j) && C41536l.m120484d(this.f56770k, bonusPlusUiModel.f56770k) && C41536l.m120484d(this.f56771l, bonusPlusUiModel.f56771l) && C41536l.m120484d(this.f56772m, bonusPlusUiModel.f56772m) && C41536l.m120484d(this.f56773n, bonusPlusUiModel.f56773n) && C41536l.m120484d(this.f56774o, bonusPlusUiModel.f56774o);
    }

    /* renamed from: f */
    public final String mo52765f() {
        return this.f56768i;
    }

    /* renamed from: g */
    public final String mo52766g() {
        return this.f56769j;
    }

    /* renamed from: h */
    public final Integer mo52767h() {
        return this.f56767h;
    }

    public int hashCode() {
        Long l = this.f56763d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.f56764e;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f56765f;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f56766g;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f56767h;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f56768i;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f56769j;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56770k;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f56771l;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d4 = this.f56772m;
        int hashCode10 = (hashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Long l3 = this.f56773n;
        int hashCode11 = (hashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d5 = this.f56774o;
        if (d5 != null) {
            i = d5.hashCode();
        }
        return hashCode11 + i;
    }

    /* renamed from: i */
    public final Long mo52769i() {
        return this.f56763d;
    }

    /* renamed from: j */
    public final Double mo52770j() {
        return this.f56765f;
    }

    public String toString() {
        Long l = this.f56763d;
        Double d = this.f56764e;
        Double d2 = this.f56765f;
        Double d3 = this.f56766g;
        Integer num = this.f56767h;
        String str = this.f56768i;
        String str2 = this.f56769j;
        String str3 = this.f56770k;
        Long l2 = this.f56771l;
        Double d4 = this.f56772m;
        Long l3 = this.f56773n;
        Double d5 = this.f56774o;
        return "BonusPlusUiModel(regDate=" + l + ", collected=" + d + ", spent=" + d2 + ", available=" + d3 + ", prizeCount=" + num + ", plusCategory=" + str + ", plusCategoryLabel=" + str2 + ", plusStatus=" + str3 + ", plusExpDateMillis=" + l2 + ", expiredBonus=" + d4 + ", expirationDate=" + l3 + ", amountInGel=" + d5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f56763d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Double d = this.f56764e;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f56765f;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f56766g;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Integer num = this.f56767h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f56768i);
        parcel.writeString(this.f56769j);
        parcel.writeString(this.f56770k);
        Long l2 = this.f56771l;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Double d4 = this.f56772m;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Long l3 = this.f56773n;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Double d5 = this.f56774o;
        if (d5 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d5.doubleValue());
    }
}
