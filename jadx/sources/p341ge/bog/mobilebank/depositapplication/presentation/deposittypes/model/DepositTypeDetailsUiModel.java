package p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model;

import android.os.Parcel;
import android.os.Parcelable;
import g91.C32343x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import ka0.C25695d;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel */
public final class DepositTypeDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<DepositTypeDetailsUiModel> CREATOR = new C22992a();

    /* renamed from: d */
    private final String f60477d;

    /* renamed from: e */
    private final C25695d f60478e;

    /* renamed from: f */
    private final String f60479f;

    /* renamed from: g */
    private final Boolean f60480g;

    /* renamed from: h */
    private final Boolean f60481h;

    /* renamed from: i */
    private final String f60482i;

    /* renamed from: j */
    private final String f60483j;

    /* renamed from: k */
    private final String f60484k;

    /* renamed from: l */
    private final String f60485l;

    /* renamed from: m */
    private final BigDecimal f60486m;

    /* renamed from: n */
    private final BigDecimal f60487n;

    /* renamed from: o */
    private final String f60488o;

    /* renamed from: p */
    private final String f60489p;

    /* renamed from: q */
    private final long f60490q;

    /* renamed from: r */
    private final long f60491r;

    /* renamed from: s */
    private final String f60492s;

    /* renamed from: t */
    private final String f60493t;

    /* renamed from: u */
    private final String f60494u;

    /* renamed from: v */
    private final List f60495v;

    /* renamed from: w */
    private final List f60496w;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel$a */
    public static final class C22992a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositTypeDetailsUiModel createFromParcel(Parcel parcel) {
            Boolean bool;
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            C25695d valueOf = C25695d.valueOf(parcel.readString());
            String readString2 = parcel.readString();
            Boolean bool2 = null;
            boolean z = true;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            }
            Boolean bool3 = bool2;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                arrayList.add(DepositFeatureUiModel.CREATOR.createFromParcel(parcel2));
                i++;
                readInt = readInt;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            ArrayList arrayList3 = arrayList;
            int i2 = 0;
            while (i2 != readInt2) {
                arrayList2.add(DepositFeatureUiModel.CREATOR.createFromParcel(parcel2));
                i2++;
                readInt2 = readInt2;
            }
            return new DepositTypeDetailsUiModel(readString, valueOf, readString2, bool, bool3, readString3, readString4, readString5, readString6, bigDecimal, bigDecimal2, readString7, readString8, readLong, readLong2, readString9, readString10, readString11, arrayList3, arrayList2);
        }

        /* renamed from: b */
        public final DepositTypeDetailsUiModel[] newArray(int i) {
            return new DepositTypeDetailsUiModel[i];
        }
    }

    public DepositTypeDetailsUiModel(String str, C25695d dVar, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str7, String str8, long j, long j2, String str9, String str10, String str11, List list, List list2) {
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        String str12 = str9;
        String str13 = str10;
        String str14 = str11;
        List list3 = list;
        List list4 = list2;
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(dVar, "depositType");
        C41536l.m120489i(bigDecimal3, "preContractIrrMinAmount");
        C41536l.m120489i(bigDecimal4, "preContractIrrMaxAmount");
        C41536l.m120489i(str12, "minIntRate");
        C41536l.m120489i(str13, "maxIntRate");
        C41536l.m120489i(str14, "effectiveRate");
        C41536l.m120489i(list3, "advantages");
        C41536l.m120489i(list4, "disAdvantages");
        this.f60477d = str;
        this.f60478e = dVar;
        this.f60479f = str2;
        this.f60480g = bool;
        this.f60481h = bool2;
        this.f60482i = str3;
        this.f60483j = str4;
        this.f60484k = str5;
        this.f60485l = str6;
        this.f60486m = bigDecimal3;
        this.f60487n = bigDecimal4;
        this.f60488o = str7;
        this.f60489p = str8;
        this.f60490q = j;
        this.f60491r = j2;
        this.f60492s = str12;
        this.f60493t = str13;
        this.f60494u = str14;
        this.f60495v = list3;
        this.f60496w = list4;
    }

    /* renamed from: a */
    public final List mo57214a() {
        return this.f60495v;
    }

    /* renamed from: b */
    public final long mo57215b() {
        return this.f60491r;
    }

    /* renamed from: d */
    public final long mo57216d() {
        return this.f60490q;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final C25695d mo57218e() {
        return this.f60478e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositTypeDetailsUiModel)) {
            return false;
        }
        DepositTypeDetailsUiModel depositTypeDetailsUiModel = (DepositTypeDetailsUiModel) obj;
        return C41536l.m120484d(this.f60477d, depositTypeDetailsUiModel.f60477d) && this.f60478e == depositTypeDetailsUiModel.f60478e && C41536l.m120484d(this.f60479f, depositTypeDetailsUiModel.f60479f) && C41536l.m120484d(this.f60480g, depositTypeDetailsUiModel.f60480g) && C41536l.m120484d(this.f60481h, depositTypeDetailsUiModel.f60481h) && C41536l.m120484d(this.f60482i, depositTypeDetailsUiModel.f60482i) && C41536l.m120484d(this.f60483j, depositTypeDetailsUiModel.f60483j) && C41536l.m120484d(this.f60484k, depositTypeDetailsUiModel.f60484k) && C41536l.m120484d(this.f60485l, depositTypeDetailsUiModel.f60485l) && C41536l.m120484d(this.f60486m, depositTypeDetailsUiModel.f60486m) && C41536l.m120484d(this.f60487n, depositTypeDetailsUiModel.f60487n) && C41536l.m120484d(this.f60488o, depositTypeDetailsUiModel.f60488o) && C41536l.m120484d(this.f60489p, depositTypeDetailsUiModel.f60489p) && this.f60490q == depositTypeDetailsUiModel.f60490q && this.f60491r == depositTypeDetailsUiModel.f60491r && C41536l.m120484d(this.f60492s, depositTypeDetailsUiModel.f60492s) && C41536l.m120484d(this.f60493t, depositTypeDetailsUiModel.f60493t) && C41536l.m120484d(this.f60494u, depositTypeDetailsUiModel.f60494u) && C41536l.m120484d(this.f60495v, depositTypeDetailsUiModel.f60495v) && C41536l.m120484d(this.f60496w, depositTypeDetailsUiModel.f60496w);
    }

    /* renamed from: f */
    public final String mo57220f() {
        return this.f60479f;
    }

    /* renamed from: g */
    public final List mo57221g() {
        return this.f60496w;
    }

    /* renamed from: h */
    public final String mo57222h() {
        return this.f60494u;
    }

    public int hashCode() {
        int hashCode = ((this.f60477d.hashCode() * 31) + this.f60478e.hashCode()) * 31;
        String str = this.f60479f;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f60480g;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f60481h;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f60482i;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60483j;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f60484k;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f60485l;
        int hashCode8 = (((((hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f60486m.hashCode()) * 31) + this.f60487n.hashCode()) * 31;
        String str6 = this.f60488o;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f60489p;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return ((((((((((((((hashCode9 + i) * 31) + C7397t.m28148a(this.f60490q)) * 31) + C7397t.m28148a(this.f60491r)) * 31) + this.f60492s.hashCode()) * 31) + this.f60493t.hashCode()) * 31) + this.f60494u.hashCode()) * 31) + this.f60495v.hashCode()) * 31) + this.f60496w.hashCode();
    }

    /* renamed from: i */
    public final String mo57224i() {
        String str = this.f60484k;
        if (str == null) {
            return null;
        }
        String F = C32343x.m95388F(str, new Object[0]);
        String F2 = C32343x.m95388F("applications.deposits.main.page.deposit.card.min.amount.type", new Object[0]);
        return F + " " + F2;
    }

    /* renamed from: j */
    public final String mo57225j() {
        return this.f60493t;
    }

    /* renamed from: k */
    public final String mo57226k() {
        return this.f60484k;
    }

    /* renamed from: l */
    public final BigDecimal mo57227l() {
        return this.f60487n;
    }

    /* renamed from: m */
    public final BigDecimal mo57228m() {
        return this.f60486m;
    }

    /* renamed from: p */
    public final String mo57229p() {
        return this.f60477d;
    }

    /* renamed from: q */
    public final boolean mo57230q() {
        return C41536l.m120484d(this.f60489p, "1");
    }

    public String toString() {
        String str = this.f60477d;
        C25695d dVar = this.f60478e;
        String str2 = this.f60479f;
        Boolean bool = this.f60480g;
        Boolean bool2 = this.f60481h;
        String str3 = this.f60482i;
        String str4 = this.f60483j;
        String str5 = this.f60484k;
        String str6 = this.f60485l;
        BigDecimal bigDecimal = this.f60486m;
        BigDecimal bigDecimal2 = this.f60487n;
        String str7 = this.f60488o;
        String str8 = this.f60489p;
        long j = this.f60490q;
        long j2 = this.f60491r;
        String str9 = this.f60492s;
        String str10 = this.f60493t;
        String str11 = this.f60494u;
        List list = this.f60495v;
        List list2 = this.f60496w;
        return "DepositTypeDetailsUiModel(prodType=" + str + ", depositType=" + dVar + ", dictionaryKey=" + str2 + ", hasPrimaryAccount=" + bool + ", hasInterestAccount=" + bool2 + ", advantagesKey=" + str3 + ", conditionsKey=" + str4 + ", minAmountKey=" + str5 + ", minMaxTermsKey=" + str6 + ", preContractIrrMinAmount=" + bigDecimal + ", preContractIrrMaxAmount=" + bigDecimal2 + ", commissionAmountKey=" + str7 + ", hasCampaign=" + str8 + ", depositMinEndDate=" + j + ", depositMaxEndDate=" + j2 + ", minIntRate=" + str9 + ", maxIntRate=" + str10 + ", effectiveRate=" + str11 + ", advantages=" + list + ", disAdvantages=" + list2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60477d);
        parcel.writeString(this.f60478e.name());
        parcel.writeString(this.f60479f);
        Boolean bool = this.f60480g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f60481h;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f60482i);
        parcel.writeString(this.f60483j);
        parcel.writeString(this.f60484k);
        parcel.writeString(this.f60485l);
        parcel.writeSerializable(this.f60486m);
        parcel.writeSerializable(this.f60487n);
        parcel.writeString(this.f60488o);
        parcel.writeString(this.f60489p);
        parcel.writeLong(this.f60490q);
        parcel.writeLong(this.f60491r);
        parcel.writeString(this.f60492s);
        parcel.writeString(this.f60493t);
        parcel.writeString(this.f60494u);
        List<DepositFeatureUiModel> list = this.f60495v;
        parcel.writeInt(list.size());
        for (DepositFeatureUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<DepositFeatureUiModel> list2 = this.f60496w;
        parcel.writeInt(list2.size());
        for (DepositFeatureUiModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }
}
