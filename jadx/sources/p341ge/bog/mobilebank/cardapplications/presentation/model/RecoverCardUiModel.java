package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel */
public final class RecoverCardUiModel implements Parcelable {
    public static final Parcelable.Creator<RecoverCardUiModel> CREATOR = new C14230a();

    /* renamed from: A */
    private final boolean f41756A;

    /* renamed from: d */
    private final long f41757d;

    /* renamed from: e */
    private final long f41758e;

    /* renamed from: f */
    private final long f41759f;

    /* renamed from: g */
    private final String f41760g;

    /* renamed from: h */
    private final String f41761h;

    /* renamed from: i */
    private final String f41762i;

    /* renamed from: j */
    private final String f41763j;

    /* renamed from: k */
    private final String f41764k;

    /* renamed from: l */
    private final String f41765l;

    /* renamed from: m */
    private final String f41766m;

    /* renamed from: n */
    private final Date f41767n;

    /* renamed from: o */
    private final String f41768o;

    /* renamed from: p */
    private final boolean f41769p;

    /* renamed from: q */
    private final String f41770q;

    /* renamed from: r */
    private final String f41771r;

    /* renamed from: s */
    private final boolean f41772s;

    /* renamed from: t */
    private final boolean f41773t;

    /* renamed from: u */
    private final Long f41774u;

    /* renamed from: v */
    private final String f41775v;

    /* renamed from: w */
    private final String f41776w;

    /* renamed from: x */
    private final String f41777x;

    /* renamed from: y */
    private final CardExternalFile f41778y;

    /* renamed from: z */
    private final CardExternalFile f41779z;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel$a */
    public static final class C14230a implements Parcelable.Creator {
        /* renamed from: a */
        public final RecoverCardUiModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            Class<RecoverCardUiModel> cls = RecoverCardUiModel.class;
            return new RecoverCardUiModel(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), (CardExternalFile) parcel2.readParcelable(cls.getClassLoader()), (CardExternalFile) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final RecoverCardUiModel[] newArray(int i) {
            return new RecoverCardUiModel[i];
        }
    }

    public RecoverCardUiModel(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, String str8, boolean z, String str9, String str10, boolean z2, boolean z3, Long l, String str11, String str12, String str13, CardExternalFile cardExternalFile, CardExternalFile cardExternalFile2, boolean z4) {
        String str14 = str;
        String str15 = str3;
        String str16 = str5;
        String str17 = str6;
        Date date2 = date;
        String str18 = str8;
        String str19 = str9;
        String str20 = str11;
        String str21 = str12;
        String str22 = str13;
        C41536l.m120489i(str14, "cardClass");
        C41536l.m120489i(str15, "cardType");
        C41536l.m120489i(str16, "productCode");
        C41536l.m120489i(str17, "subProductCode");
        C41536l.m120489i(date2, "expDate");
        C41536l.m120489i(str18, "ccy");
        C41536l.m120489i(str19, "pan2");
        C41536l.m120489i(str20, "nameDictionaryKey");
        C41536l.m120489i(str21, "nameDictionaryValue");
        C41536l.m120489i(str22, "lastFour");
        this.f41757d = j;
        this.f41758e = j2;
        this.f41759f = j3;
        this.f41760g = str14;
        this.f41761h = str2;
        this.f41762i = str15;
        this.f41763j = str4;
        this.f41764k = str16;
        this.f41765l = str17;
        this.f41766m = str7;
        this.f41767n = date2;
        this.f41768o = str18;
        this.f41769p = z;
        this.f41770q = str19;
        this.f41771r = str10;
        this.f41772s = z2;
        this.f41773t = z3;
        this.f41774u = l;
        this.f41775v = str20;
        this.f41776w = str21;
        this.f41777x = str22;
        this.f41778y = cardExternalFile;
        this.f41779z = cardExternalFile2;
        this.f41756A = z4;
    }

    /* renamed from: a */
    public final long mo39811a() {
        return this.f41758e;
    }

    /* renamed from: b */
    public final String mo39812b() {
        return this.f41760g;
    }

    /* renamed from: d */
    public final String mo39813d() {
        return this.f41761h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long mo39815e() {
        return this.f41757d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecoverCardUiModel)) {
            return false;
        }
        RecoverCardUiModel recoverCardUiModel = (RecoverCardUiModel) obj;
        return this.f41757d == recoverCardUiModel.f41757d && this.f41758e == recoverCardUiModel.f41758e && this.f41759f == recoverCardUiModel.f41759f && C41536l.m120484d(this.f41760g, recoverCardUiModel.f41760g) && C41536l.m120484d(this.f41761h, recoverCardUiModel.f41761h) && C41536l.m120484d(this.f41762i, recoverCardUiModel.f41762i) && C41536l.m120484d(this.f41763j, recoverCardUiModel.f41763j) && C41536l.m120484d(this.f41764k, recoverCardUiModel.f41764k) && C41536l.m120484d(this.f41765l, recoverCardUiModel.f41765l) && C41536l.m120484d(this.f41766m, recoverCardUiModel.f41766m) && C41536l.m120484d(this.f41767n, recoverCardUiModel.f41767n) && C41536l.m120484d(this.f41768o, recoverCardUiModel.f41768o) && this.f41769p == recoverCardUiModel.f41769p && C41536l.m120484d(this.f41770q, recoverCardUiModel.f41770q) && C41536l.m120484d(this.f41771r, recoverCardUiModel.f41771r) && this.f41772s == recoverCardUiModel.f41772s && this.f41773t == recoverCardUiModel.f41773t && C41536l.m120484d(this.f41774u, recoverCardUiModel.f41774u) && C41536l.m120484d(this.f41775v, recoverCardUiModel.f41775v) && C41536l.m120484d(this.f41776w, recoverCardUiModel.f41776w) && C41536l.m120484d(this.f41777x, recoverCardUiModel.f41777x) && C41536l.m120484d(this.f41778y, recoverCardUiModel.f41778y) && C41536l.m120484d(this.f41779z, recoverCardUiModel.f41779z) && this.f41756A == recoverCardUiModel.f41756A;
    }

    /* renamed from: f */
    public final String mo39817f() {
        return this.f41763j;
    }

    /* renamed from: g */
    public final Date mo39818g() {
        return this.f41767n;
    }

    /* renamed from: h */
    public final boolean mo39819h() {
        return this.f41772s;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.f41757d) * 31) + C7397t.m28148a(this.f41758e)) * 31) + C7397t.m28148a(this.f41759f)) * 31) + this.f41760g.hashCode()) * 31;
        String str = this.f41761h;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f41762i.hashCode()) * 31;
        String str2 = this.f41763j;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f41764k.hashCode()) * 31) + this.f41765l.hashCode()) * 31;
        String str3 = this.f41766m;
        int hashCode3 = (((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f41767n.hashCode()) * 31) + this.f41768o.hashCode()) * 31;
        boolean z = this.f41769p;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode4 = (((hashCode3 + (z ? 1 : 0)) * 31) + this.f41770q.hashCode()) * 31;
        String str4 = this.f41771r;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z3 = this.f41772s;
        if (z3) {
            z3 = true;
        }
        int i2 = (hashCode5 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f41773t;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        Long l = this.f41774u;
        int hashCode6 = (((((((i3 + (l == null ? 0 : l.hashCode())) * 31) + this.f41775v.hashCode()) * 31) + this.f41776w.hashCode()) * 31) + this.f41777x.hashCode()) * 31;
        CardExternalFile cardExternalFile = this.f41778y;
        int hashCode7 = (hashCode6 + (cardExternalFile == null ? 0 : cardExternalFile.hashCode())) * 31;
        CardExternalFile cardExternalFile2 = this.f41779z;
        if (cardExternalFile2 != null) {
            i = cardExternalFile2.hashCode();
        }
        int i4 = (hashCode7 + i) * 31;
        boolean z5 = this.f41756A;
        if (!z5) {
            z2 = z5;
        }
        return i4 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final CardExternalFile mo39821i() {
        return this.f41778y;
    }

    /* renamed from: j */
    public final String mo39822j() {
        return this.f41777x;
    }

    /* renamed from: k */
    public final String mo39823k() {
        return this.f41775v;
    }

    /* renamed from: l */
    public final Long mo39824l() {
        return this.f41774u;
    }

    /* renamed from: m */
    public final boolean mo39825m() {
        return this.f41773t;
    }

    /* renamed from: p */
    public final String mo39826p() {
        return this.f41765l;
    }

    /* renamed from: q */
    public final boolean mo39827q() {
        return this.f41756A;
    }

    public String toString() {
        long j = this.f41757d;
        long j2 = this.f41758e;
        long j3 = this.f41759f;
        String str = this.f41760g;
        String str2 = this.f41761h;
        String str3 = this.f41762i;
        String str4 = this.f41763j;
        String str5 = this.f41764k;
        String str6 = this.f41765l;
        String str7 = this.f41766m;
        Date date = this.f41767n;
        String str8 = this.f41768o;
        boolean z = this.f41769p;
        String str9 = this.f41770q;
        String str10 = this.f41771r;
        boolean z2 = this.f41772s;
        boolean z3 = this.f41773t;
        Long l = this.f41774u;
        String str11 = this.f41775v;
        String str12 = this.f41776w;
        String str13 = this.f41777x;
        CardExternalFile cardExternalFile = this.f41778y;
        CardExternalFile cardExternalFile2 = this.f41779z;
        boolean z4 = this.f41756A;
        return "RecoverCardUiModel(cardId=" + j + ", acctKey=" + j2 + ", clientKey=" + j3 + ", cardClass=" + str + ", cardClassCode=" + str2 + ", cardType=" + str3 + ", cardName=" + str4 + ", productCode=" + str5 + ", subProductCode=" + str6 + ", cardHolder=" + str7 + ", expDate=" + date + ", ccy=" + str8 + ", isMainCurrency=" + z + ", pan2=" + str9 + ", cardMask=" + str10 + ", expFlag=" + z2 + ", recoverFlag=" + z3 + ", orgId=" + l + ", nameDictionaryKey=" + str11 + ", nameDictionaryValue=" + str12 + ", lastFour=" + str13 + ", externalFile=" + cardExternalFile + ", cardExternalFile=" + cardExternalFile2 + ", isDigitalCard=" + z4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f41757d);
        parcel.writeLong(this.f41758e);
        parcel.writeLong(this.f41759f);
        parcel.writeString(this.f41760g);
        parcel.writeString(this.f41761h);
        parcel.writeString(this.f41762i);
        parcel.writeString(this.f41763j);
        parcel.writeString(this.f41764k);
        parcel.writeString(this.f41765l);
        parcel.writeString(this.f41766m);
        parcel.writeSerializable(this.f41767n);
        parcel.writeString(this.f41768o);
        parcel.writeInt(this.f41769p ? 1 : 0);
        parcel.writeString(this.f41770q);
        parcel.writeString(this.f41771r);
        parcel.writeInt(this.f41772s ? 1 : 0);
        parcel.writeInt(this.f41773t ? 1 : 0);
        Long l = this.f41774u;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f41775v);
        parcel.writeString(this.f41776w);
        parcel.writeString(this.f41777x);
        parcel.writeParcelable(this.f41778y, i);
        parcel.writeParcelable(this.f41779z, i);
        parcel.writeInt(this.f41756A ? 1 : 0);
    }
}
