package p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel */
public final class CardInsSecCardModel implements Parcelable {
    public static final Parcelable.Creator<CardInsSecCardModel> CREATOR = new C22546a();

    /* renamed from: d */
    private final long f59612d;

    /* renamed from: e */
    private final long f59613e;

    /* renamed from: f */
    private final String f59614f;

    /* renamed from: g */
    private final String f59615g;

    /* renamed from: h */
    private final String f59616h;

    /* renamed from: i */
    private final String f59617i;

    /* renamed from: j */
    private final String f59618j;

    /* renamed from: k */
    private final Long f59619k;

    /* renamed from: l */
    private final String f59620l;

    /* renamed from: m */
    private final String f59621m;

    /* renamed from: n */
    private final boolean f59622n;

    /* renamed from: o */
    private final boolean f59623o;

    /* renamed from: p */
    private final String f59624p;

    /* renamed from: q */
    private final boolean f59625q;

    /* renamed from: r */
    private final boolean f59626r;

    /* renamed from: s */
    private final boolean f59627s;

    /* renamed from: t */
    private final String f59628t;

    /* renamed from: u */
    private final boolean f59629u;

    /* renamed from: v */
    private final String f59630v;

    /* renamed from: w */
    private final Long f59631w;

    /* renamed from: ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel$a */
    public static final class C22546a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardInsSecCardModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardInsSecCardModel(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* renamed from: b */
        public final CardInsSecCardModel[] newArray(int i) {
            return new CardInsSecCardModel[i];
        }
    }

    public CardInsSecCardModel(long j, long j2, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, boolean z, boolean z2, String str8, boolean z3, boolean z4, boolean z5, String str9, boolean z6, String str10, Long l2) {
        C41536l.m120489i(str2, "subProductCode");
        this.f59612d = j;
        this.f59613e = j2;
        this.f59614f = str;
        this.f59615g = str2;
        this.f59616h = str3;
        this.f59617i = str4;
        this.f59618j = str5;
        this.f59619k = l;
        this.f59620l = str6;
        this.f59621m = str7;
        this.f59622n = z;
        this.f59623o = z2;
        this.f59624p = str8;
        this.f59625q = z3;
        this.f59626r = z4;
        this.f59627s = z5;
        this.f59628t = str9;
        this.f59629u = z6;
        this.f59630v = str10;
        this.f59631w = l2;
    }

    /* renamed from: a */
    public final long mo55704a() {
        return this.f59613e;
    }

    /* renamed from: b */
    public final String mo55705b() {
        return this.f59630v;
    }

    /* renamed from: d */
    public final long mo55706d() {
        return this.f59612d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo55708e() {
        return this.f59614f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardInsSecCardModel)) {
            return false;
        }
        CardInsSecCardModel cardInsSecCardModel = (CardInsSecCardModel) obj;
        return this.f59612d == cardInsSecCardModel.f59612d && this.f59613e == cardInsSecCardModel.f59613e && C41536l.m120484d(this.f59614f, cardInsSecCardModel.f59614f) && C41536l.m120484d(this.f59615g, cardInsSecCardModel.f59615g) && C41536l.m120484d(this.f59616h, cardInsSecCardModel.f59616h) && C41536l.m120484d(this.f59617i, cardInsSecCardModel.f59617i) && C41536l.m120484d(this.f59618j, cardInsSecCardModel.f59618j) && C41536l.m120484d(this.f59619k, cardInsSecCardModel.f59619k) && C41536l.m120484d(this.f59620l, cardInsSecCardModel.f59620l) && C41536l.m120484d(this.f59621m, cardInsSecCardModel.f59621m) && this.f59622n == cardInsSecCardModel.f59622n && this.f59623o == cardInsSecCardModel.f59623o && C41536l.m120484d(this.f59624p, cardInsSecCardModel.f59624p) && this.f59625q == cardInsSecCardModel.f59625q && this.f59626r == cardInsSecCardModel.f59626r && this.f59627s == cardInsSecCardModel.f59627s && C41536l.m120484d(this.f59628t, cardInsSecCardModel.f59628t) && this.f59629u == cardInsSecCardModel.f59629u && C41536l.m120484d(this.f59630v, cardInsSecCardModel.f59630v) && C41536l.m120484d(this.f59631w, cardInsSecCardModel.f59631w);
    }

    /* renamed from: f */
    public final boolean mo55710f() {
        return this.f59625q;
    }

    /* renamed from: g */
    public final String mo55711g() {
        return this.f59617i;
    }

    /* renamed from: h */
    public final String mo55712h() {
        return this.f59628t;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f59612d) * 31) + C7397t.m28148a(this.f59613e)) * 31;
        String str = this.f59614f;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f59615g.hashCode()) * 31;
        String str2 = this.f59616h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59617i;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59618j;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f59619k;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.f59620l;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59621m;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z = this.f59622n;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f59623o;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        String str7 = this.f59624p;
        int hashCode8 = (i3 + (str7 == null ? 0 : str7.hashCode())) * 31;
        boolean z4 = this.f59625q;
        if (z4) {
            z4 = true;
        }
        int i4 = (hashCode8 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f59626r;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f59627s;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        String str8 = this.f59628t;
        int hashCode9 = (i6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        boolean z7 = this.f59629u;
        if (!z7) {
            z2 = z7;
        }
        int i7 = (hashCode9 + (z2 ? 1 : 0)) * 31;
        String str9 = this.f59630v;
        int hashCode10 = (i7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l2 = this.f59631w;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode10 + i;
    }

    /* renamed from: i */
    public final boolean mo55714i() {
        return this.f59629u;
    }

    /* renamed from: j */
    public final boolean mo55715j() {
        return this.f59622n;
    }

    /* renamed from: k */
    public final String mo55716k() {
        return this.f59618j;
    }

    /* renamed from: l */
    public final Long mo55717l() {
        return this.f59619k;
    }

    /* renamed from: m */
    public final String mo55718m() {
        return this.f59620l;
    }

    /* renamed from: p */
    public final String mo55719p() {
        return this.f59621m;
    }

    /* renamed from: q */
    public final String mo55720q() {
        return this.f59616h;
    }

    /* renamed from: r */
    public final String mo55721r() {
        return this.f59624p;
    }

    /* renamed from: s */
    public final Long mo55722s() {
        return this.f59631w;
    }

    /* renamed from: t */
    public final boolean mo55723t() {
        return this.f59623o;
    }

    public String toString() {
        long j = this.f59612d;
        long j2 = this.f59613e;
        String str = this.f59614f;
        String str2 = this.f59615g;
        String str3 = this.f59616h;
        String str4 = this.f59617i;
        String str5 = this.f59618j;
        Long l = this.f59619k;
        String str6 = this.f59620l;
        String str7 = this.f59621m;
        boolean z = this.f59622n;
        boolean z2 = this.f59623o;
        String str8 = this.f59624p;
        boolean z3 = this.f59625q;
        boolean z4 = this.f59626r;
        boolean z5 = this.f59627s;
        String str9 = this.f59628t;
        boolean z6 = this.f59629u;
        String str10 = this.f59630v;
        Long l2 = this.f59631w;
        return "CardInsSecCardModel(cardId=" + j + ", acctKey=" + j2 + ", cardName=" + str + ", subProductCode=" + str2 + ", lastFour=" + str3 + ", dictionaryKey=" + str4 + ", insuranceId=" + str5 + ", insuranceNo=" + l + ", insuranceType=" + str6 + ", insuranceTypeKey=" + str7 + ", insAllow=" + z + ", sec3D=" + z2 + ", mobile=" + str8 + ", dgPassYN=" + z3 + ", secAllow=" + z4 + ", isScoolcard=" + z5 + ", dictionaryValue=" + str9 + ", digipassAllow=" + z6 + ", attachmentFileBase64=" + str10 + ", nextChargeDate=" + l2 + ")";
    }

    /* renamed from: u */
    public final boolean mo55725u() {
        return this.f59626r;
    }

    /* renamed from: v */
    public final String mo55726v() {
        return this.f59615g;
    }

    /* renamed from: w */
    public final boolean mo55727w() {
        return this.f59627s;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f59612d);
        parcel.writeLong(this.f59613e);
        parcel.writeString(this.f59614f);
        parcel.writeString(this.f59615g);
        parcel.writeString(this.f59616h);
        parcel.writeString(this.f59617i);
        parcel.writeString(this.f59618j);
        Long l = this.f59619k;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f59620l);
        parcel.writeString(this.f59621m);
        parcel.writeInt(this.f59622n ? 1 : 0);
        parcel.writeInt(this.f59623o ? 1 : 0);
        parcel.writeString(this.f59624p);
        parcel.writeInt(this.f59625q ? 1 : 0);
        parcel.writeInt(this.f59626r ? 1 : 0);
        parcel.writeInt(this.f59627s ? 1 : 0);
        parcel.writeString(this.f59628t);
        parcel.writeInt(this.f59629u ? 1 : 0);
        parcel.writeString(this.f59630v);
        Long l2 = this.f59631w;
        if (l2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l2.longValue());
    }
}
