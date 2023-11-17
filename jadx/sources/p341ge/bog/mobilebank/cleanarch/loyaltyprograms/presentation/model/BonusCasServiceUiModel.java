package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel */
public final class BonusCasServiceUiModel implements Parcelable {
    public static final Parcelable.Creator<BonusCasServiceUiModel> CREATOR = new C21137a();

    /* renamed from: d */
    private final Long f56719d;

    /* renamed from: e */
    private final Long f56720e;

    /* renamed from: f */
    private final String f56721f;

    /* renamed from: g */
    private final Long f56722g;

    /* renamed from: h */
    private final Double f56723h;

    /* renamed from: i */
    private final String f56724i;

    /* renamed from: j */
    private final Long f56725j;

    /* renamed from: k */
    private final String f56726k;

    /* renamed from: l */
    private final String f56727l;

    /* renamed from: m */
    private final String f56728m;

    /* renamed from: n */
    private final String f56729n;

    /* renamed from: o */
    private final String f56730o;

    /* renamed from: p */
    private final String f56731p;

    /* renamed from: q */
    private final Double f56732q;

    /* renamed from: r */
    private final Double f56733r;

    /* renamed from: s */
    private final String f56734s;

    /* renamed from: t */
    private final List f56735t;

    /* renamed from: u */
    private final List f56736u;

    /* renamed from: v */
    private final Double f56737v;

    /* renamed from: w */
    private final String f56738w;

    /* renamed from: x */
    private String f56739x;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel$a */
    public static final class C21137a implements Parcelable.Creator {
        /* renamed from: a */
        public final BonusCasServiceUiModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString = parcel.readString();
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString2 = parcel.readString();
            Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            Double valueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    arrayList.add(BonusAccountUiModel.CREATOR.createFromParcel(parcel2));
                    i++;
                    readInt = readInt;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                arrayList2 = arrayList;
                int i2 = 0;
                while (i2 != readInt2) {
                    arrayList4.add(BonusDepositAccountUiModel.CREATOR.createFromParcel(parcel2));
                    i2++;
                    readInt2 = readInt2;
                }
                arrayList3 = arrayList4;
            }
            return new BonusCasServiceUiModel(valueOf, valueOf2, readString, valueOf3, valueOf4, readString2, valueOf5, readString3, readString4, readString5, readString6, readString7, readString8, valueOf6, valueOf7, readString9, arrayList2, arrayList3, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BonusCasServiceUiModel[] newArray(int i) {
            return new BonusCasServiceUiModel[i];
        }
    }

    public BonusCasServiceUiModel(Long l, Long l2, String str, Long l3, Double d, String str2, Long l4, String str3, String str4, String str5, String str6, String str7, String str8, Double d2, Double d3, String str9, List list, List list2, Double d4, String str10, String str11) {
        this.f56719d = l;
        this.f56720e = l2;
        this.f56721f = str;
        this.f56722g = l3;
        this.f56723h = d;
        this.f56724i = str2;
        this.f56725j = l4;
        this.f56726k = str3;
        this.f56727l = str4;
        this.f56728m = str5;
        this.f56729n = str6;
        this.f56730o = str7;
        this.f56731p = str8;
        this.f56732q = d2;
        this.f56733r = d3;
        this.f56734s = str9;
        this.f56735t = list;
        this.f56736u = list2;
        this.f56737v = d4;
        this.f56738w = str10;
        this.f56739x = str11;
    }

    /* renamed from: a */
    public final List mo52710a() {
        return this.f56735t;
    }

    /* renamed from: b */
    public final Long mo52711b() {
        return this.f56725j;
    }

    /* renamed from: d */
    public final String mo52712d() {
        return this.f56734s;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Long mo52714e() {
        return this.f56719d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusCasServiceUiModel)) {
            return false;
        }
        BonusCasServiceUiModel bonusCasServiceUiModel = (BonusCasServiceUiModel) obj;
        return C41536l.m120484d(this.f56719d, bonusCasServiceUiModel.f56719d) && C41536l.m120484d(this.f56720e, bonusCasServiceUiModel.f56720e) && C41536l.m120484d(this.f56721f, bonusCasServiceUiModel.f56721f) && C41536l.m120484d(this.f56722g, bonusCasServiceUiModel.f56722g) && C41536l.m120484d(this.f56723h, bonusCasServiceUiModel.f56723h) && C41536l.m120484d(this.f56724i, bonusCasServiceUiModel.f56724i) && C41536l.m120484d(this.f56725j, bonusCasServiceUiModel.f56725j) && C41536l.m120484d(this.f56726k, bonusCasServiceUiModel.f56726k) && C41536l.m120484d(this.f56727l, bonusCasServiceUiModel.f56727l) && C41536l.m120484d(this.f56728m, bonusCasServiceUiModel.f56728m) && C41536l.m120484d(this.f56729n, bonusCasServiceUiModel.f56729n) && C41536l.m120484d(this.f56730o, bonusCasServiceUiModel.f56730o) && C41536l.m120484d(this.f56731p, bonusCasServiceUiModel.f56731p) && C41536l.m120484d(this.f56732q, bonusCasServiceUiModel.f56732q) && C41536l.m120484d(this.f56733r, bonusCasServiceUiModel.f56733r) && C41536l.m120484d(this.f56734s, bonusCasServiceUiModel.f56734s) && C41536l.m120484d(this.f56735t, bonusCasServiceUiModel.f56735t) && C41536l.m120484d(this.f56736u, bonusCasServiceUiModel.f56736u) && C41536l.m120484d(this.f56737v, bonusCasServiceUiModel.f56737v) && C41536l.m120484d(this.f56738w, bonusCasServiceUiModel.f56738w) && C41536l.m120484d(this.f56739x, bonusCasServiceUiModel.f56739x);
    }

    /* renamed from: f */
    public final Double mo52716f() {
        return this.f56737v;
    }

    /* renamed from: g */
    public final List mo52717g() {
        return this.f56736u;
    }

    /* renamed from: h */
    public final String mo52718h() {
        return this.f56724i;
    }

    public int hashCode() {
        Long l = this.f56719d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f56720e;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f56721f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.f56722g;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d = this.f56723h;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f56724i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.f56725j;
        int hashCode7 = (hashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.f56726k;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f56727l;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f56728m;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f56729n;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f56730o;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f56731p;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d2 = this.f56732q;
        int hashCode14 = (hashCode13 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f56733r;
        int hashCode15 = (hashCode14 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str9 = this.f56734s;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.f56735t;
        int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f56736u;
        int hashCode18 = (hashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d4 = this.f56737v;
        int hashCode19 = (hashCode18 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str10 = this.f56738w;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f56739x;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode20 + i;
    }

    /* renamed from: i */
    public final Long mo52720i() {
        return this.f56722g;
    }

    /* renamed from: j */
    public final Double mo52721j() {
        return this.f56723h;
    }

    public String toString() {
        Long l = this.f56719d;
        Long l2 = this.f56720e;
        String str = this.f56721f;
        Long l3 = this.f56722g;
        Double d = this.f56723h;
        String str2 = this.f56724i;
        Long l4 = this.f56725j;
        String str3 = this.f56726k;
        String str4 = this.f56727l;
        String str5 = this.f56728m;
        String str6 = this.f56729n;
        String str7 = this.f56730o;
        String str8 = this.f56731p;
        Double d2 = this.f56732q;
        Double d3 = this.f56733r;
        String str9 = this.f56734s;
        List list = this.f56735t;
        List list2 = this.f56736u;
        Double d4 = this.f56737v;
        String str10 = this.f56738w;
        String str11 = this.f56739x;
        return "BonusCasServiceUiModel(clientServiceId=" + l + ", clientKey=" + l2 + ", scheme=" + str + ", schemeTariffId=" + l3 + ", schemeTariffValue=" + d + ", schemeTariffCcy=" + str2 + ", agreeKey=" + l4 + ", agreeType=" + str3 + ", status=" + str4 + ", name=" + str5 + ", agreeNo=" + str6 + ", prodType=" + str7 + ", agreeCcy=" + str8 + ", totalAmount=" + d2 + ", agreeBalance=" + d3 + ", agreeTypeDictionaryKey=" + str9 + ", accounts=" + list + ", depositAccounts=" + list2 + ", currentMonthTotalAmount=" + d4 + ", depositTypeDictionaryKey=" + str10 + ", imageUrl=" + str11 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f56719d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f56720e;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f56721f);
        Long l3 = this.f56722g;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Double d = this.f56723h;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f56724i);
        Long l4 = this.f56725j;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        parcel.writeString(this.f56726k);
        parcel.writeString(this.f56727l);
        parcel.writeString(this.f56728m);
        parcel.writeString(this.f56729n);
        parcel.writeString(this.f56730o);
        parcel.writeString(this.f56731p);
        Double d2 = this.f56732q;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f56733r;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        parcel.writeString(this.f56734s);
        List<BonusAccountUiModel> list = this.f56735t;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (BonusAccountUiModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        List<BonusDepositAccountUiModel> list2 = this.f56736u;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (BonusDepositAccountUiModel writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i);
            }
        }
        Double d4 = this.f56737v;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        parcel.writeString(this.f56738w);
        parcel.writeString(this.f56739x);
    }
}
