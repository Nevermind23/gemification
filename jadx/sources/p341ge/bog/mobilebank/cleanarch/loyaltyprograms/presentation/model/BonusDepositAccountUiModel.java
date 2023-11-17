package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusDepositAccountUiModel */
public final class BonusDepositAccountUiModel implements Parcelable {
    public static final Parcelable.Creator<BonusDepositAccountUiModel> CREATOR = new C21139a();

    /* renamed from: d */
    private final String f56751d;

    /* renamed from: e */
    private final String f56752e;

    /* renamed from: f */
    private final Long f56753f;

    /* renamed from: g */
    private final String f56754g;

    /* renamed from: h */
    private final Long f56755h;

    /* renamed from: i */
    private final String f56756i;

    /* renamed from: j */
    private final String f56757j;

    /* renamed from: k */
    private final String f56758k;

    /* renamed from: l */
    private final String f56759l;

    /* renamed from: m */
    private final Double f56760m;

    /* renamed from: n */
    private final String f56761n;

    /* renamed from: o */
    private final String f56762o;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusDepositAccountUiModel$a */
    public static final class C21139a implements Parcelable.Creator {
        /* renamed from: a */
        public final BonusDepositAccountUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BonusDepositAccountUiModel(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BonusDepositAccountUiModel[] newArray(int i) {
            return new BonusDepositAccountUiModel[i];
        }
    }

    public BonusDepositAccountUiModel(String str, String str2, Long l, String str3, Long l2, String str4, String str5, String str6, String str7, Double d, String str8, String str9) {
        this.f56751d = str;
        this.f56752e = str2;
        this.f56753f = l;
        this.f56754g = str3;
        this.f56755h = l2;
        this.f56756i = str4;
        this.f56757j = str5;
        this.f56758k = str6;
        this.f56759l = str7;
        this.f56760m = d;
        this.f56761n = str8;
        this.f56762o = str9;
    }

    /* renamed from: a */
    public final Long mo52745a() {
        return this.f56755h;
    }

    /* renamed from: b */
    public final String mo52746b() {
        return this.f56757j;
    }

    /* renamed from: d */
    public final String mo52747d() {
        return this.f56754g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Long mo52749e() {
        return this.f56753f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusDepositAccountUiModel)) {
            return false;
        }
        BonusDepositAccountUiModel bonusDepositAccountUiModel = (BonusDepositAccountUiModel) obj;
        return C41536l.m120484d(this.f56751d, bonusDepositAccountUiModel.f56751d) && C41536l.m120484d(this.f56752e, bonusDepositAccountUiModel.f56752e) && C41536l.m120484d(this.f56753f, bonusDepositAccountUiModel.f56753f) && C41536l.m120484d(this.f56754g, bonusDepositAccountUiModel.f56754g) && C41536l.m120484d(this.f56755h, bonusDepositAccountUiModel.f56755h) && C41536l.m120484d(this.f56756i, bonusDepositAccountUiModel.f56756i) && C41536l.m120484d(this.f56757j, bonusDepositAccountUiModel.f56757j) && C41536l.m120484d(this.f56758k, bonusDepositAccountUiModel.f56758k) && C41536l.m120484d(this.f56759l, bonusDepositAccountUiModel.f56759l) && C41536l.m120484d(this.f56760m, bonusDepositAccountUiModel.f56760m) && C41536l.m120484d(this.f56761n, bonusDepositAccountUiModel.f56761n) && C41536l.m120484d(this.f56762o, bonusDepositAccountUiModel.f56762o);
    }

    /* renamed from: f */
    public final String mo52751f() {
        return this.f56762o;
    }

    public int hashCode() {
        String str = this.f56751d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f56752e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f56753f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f56754g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f56755h;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.f56756i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f56757j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f56758k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f56759l;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d = this.f56760m;
        int hashCode10 = (hashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        String str8 = this.f56761n;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f56762o;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        String str = this.f56751d;
        String str2 = this.f56752e;
        Long l = this.f56753f;
        String str3 = this.f56754g;
        Long l2 = this.f56755h;
        String str4 = this.f56756i;
        String str5 = this.f56757j;
        String str6 = this.f56758k;
        String str7 = this.f56759l;
        Double d = this.f56760m;
        String str8 = this.f56761n;
        String str9 = this.f56762o;
        return "BonusDepositAccountUiModel(clientKey=" + str + ", agreeType=" + str2 + ", agreeKey=" + l + ", agreeCcy=" + str3 + ", acctKey=" + l2 + ", name=" + str4 + ", acctNo=" + str5 + ", acctDesc=" + str6 + ", depositAgreeType=" + str7 + ", agreeBalance=" + d + ", depositTypeDictionaryKey=" + str8 + ", agreeNo=" + str9 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f56751d);
        parcel.writeString(this.f56752e);
        Long l = this.f56753f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f56754g);
        Long l2 = this.f56755h;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f56756i);
        parcel.writeString(this.f56757j);
        parcel.writeString(this.f56758k);
        parcel.writeString(this.f56759l);
        Double d = this.f56760m;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f56761n);
        parcel.writeString(this.f56762o);
    }
}
