package p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel */
public final class AccumulateOnSpecificDateModel implements Parcelable {
    public static final Parcelable.Creator<AccumulateOnSpecificDateModel> CREATOR = new C22977a();

    /* renamed from: d */
    private final BigDecimal f60420d;

    /* renamed from: e */
    private final String f60421e;

    /* renamed from: f */
    private final String f60422f;

    /* renamed from: g */
    private final Long f60423g;

    /* renamed from: h */
    private final String f60424h;

    /* renamed from: i */
    private final boolean f60425i;

    /* renamed from: j */
    private final String f60426j;

    /* renamed from: k */
    private final Long f60427k;

    /* renamed from: l */
    private final String f60428l;

    /* renamed from: m */
    private final String f60429m;

    /* renamed from: n */
    private final Integer f60430n;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel$a */
    public static final class C22977a implements Parcelable.Creator {
        /* renamed from: a */
        public final AccumulateOnSpecificDateModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new AccumulateOnSpecificDateModel((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* renamed from: b */
        public final AccumulateOnSpecificDateModel[] newArray(int i) {
            return new AccumulateOnSpecificDateModel[i];
        }
    }

    public AccumulateOnSpecificDateModel() {
        this((BigDecimal) null, (String) null, (String) null, (Long) null, (String) null, false, (String) null, (Long) null, (String) null, (String) null, (Integer) null, 2047, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ AccumulateOnSpecificDateModel m74487b(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel, BigDecimal bigDecimal, String str, String str2, Long l, String str3, boolean z, String str4, Long l2, String str5, String str6, Integer num, int i, Object obj) {
        AccumulateOnSpecificDateModel accumulateOnSpecificDateModel2 = accumulateOnSpecificDateModel;
        int i2 = i;
        return accumulateOnSpecificDateModel.mo57134a((i2 & 1) != 0 ? accumulateOnSpecificDateModel2.f60420d : bigDecimal, (i2 & 2) != 0 ? accumulateOnSpecificDateModel2.f60421e : str, (i2 & 4) != 0 ? accumulateOnSpecificDateModel2.f60422f : str2, (i2 & 8) != 0 ? accumulateOnSpecificDateModel2.f60423g : l, (i2 & 16) != 0 ? accumulateOnSpecificDateModel2.f60424h : str3, (i2 & 32) != 0 ? accumulateOnSpecificDateModel2.f60425i : z, (i2 & 64) != 0 ? accumulateOnSpecificDateModel2.f60426j : str4, (i2 & 128) != 0 ? accumulateOnSpecificDateModel2.f60427k : l2, (i2 & C11398b.f33139r) != 0 ? accumulateOnSpecificDateModel2.f60428l : str5, (i2 & C11398b.f33140s) != 0 ? accumulateOnSpecificDateModel2.f60429m : str6, (i2 & C11398b.f33141t) != 0 ? accumulateOnSpecificDateModel2.f60430n : num);
    }

    /* renamed from: a */
    public final AccumulateOnSpecificDateModel mo57134a(BigDecimal bigDecimal, String str, String str2, Long l, String str3, boolean z, String str4, Long l2, String str5, String str6, Integer num) {
        return new AccumulateOnSpecificDateModel(bigDecimal, str, str2, l, str3, z, str4, l2, str5, str6, num);
    }

    /* renamed from: d */
    public final BigDecimal mo57135d() {
        return this.f60420d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo57137e() {
        return this.f60426j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccumulateOnSpecificDateModel)) {
            return false;
        }
        AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = (AccumulateOnSpecificDateModel) obj;
        return C41536l.m120484d(this.f60420d, accumulateOnSpecificDateModel.f60420d) && C41536l.m120484d(this.f60421e, accumulateOnSpecificDateModel.f60421e) && C41536l.m120484d(this.f60422f, accumulateOnSpecificDateModel.f60422f) && C41536l.m120484d(this.f60423g, accumulateOnSpecificDateModel.f60423g) && C41536l.m120484d(this.f60424h, accumulateOnSpecificDateModel.f60424h) && this.f60425i == accumulateOnSpecificDateModel.f60425i && C41536l.m120484d(this.f60426j, accumulateOnSpecificDateModel.f60426j) && C41536l.m120484d(this.f60427k, accumulateOnSpecificDateModel.f60427k) && C41536l.m120484d(this.f60428l, accumulateOnSpecificDateModel.f60428l) && C41536l.m120484d(this.f60429m, accumulateOnSpecificDateModel.f60429m) && C41536l.m120484d(this.f60430n, accumulateOnSpecificDateModel.f60430n);
    }

    /* renamed from: f */
    public final Integer mo57139f() {
        return this.f60430n;
    }

    /* renamed from: g */
    public final String mo57140g() {
        return this.f60428l;
    }

    /* renamed from: h */
    public final String mo57141h() {
        return this.f60429m;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f60420d;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.f60421e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60422f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f60423g;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f60424h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.f60425i;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str4 = this.f60426j;
        int hashCode6 = (i2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f60427k;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.f60428l;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f60429m;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f60430n;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final Long mo57143i() {
        return this.f60423g;
    }

    /* renamed from: j */
    public final String mo57144j() {
        return this.f60421e;
    }

    /* renamed from: k */
    public final String mo57145k() {
        return this.f60424h;
    }

    /* renamed from: l */
    public final boolean mo57146l() {
        return this.f60425i;
    }

    /* renamed from: m */
    public final String mo57147m() {
        return this.f60422f;
    }

    /* renamed from: p */
    public final Long mo57148p() {
        return this.f60427k;
    }

    /* renamed from: q */
    public final boolean mo57149q() {
        BigDecimal bigDecimal = this.f60420d;
        return (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) <= 0 || this.f60430n == null || this.f60423g == null) ? false : true;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f60420d;
        String str = this.f60421e;
        String str2 = this.f60422f;
        Long l = this.f60423g;
        String str3 = this.f60424h;
        boolean z = this.f60425i;
        String str4 = this.f60426j;
        Long l2 = this.f60427k;
        String str5 = this.f60428l;
        String str6 = this.f60429m;
        Integer num = this.f60430n;
        return "AccumulateOnSpecificDateModel(amount=" + bigDecimal + ", srcAcctNo=" + str + ", srcName=" + str2 + ", srcAcctId=" + l + ", srcAttachmentId=" + str3 + ", srcIsFavorite=" + z + ", ccy=" + str4 + ", startDate=" + l2 + ", periodType=" + str5 + ", srcAcctCcy=" + str6 + ", day=" + num + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.f60420d);
        parcel.writeString(this.f60421e);
        parcel.writeString(this.f60422f);
        Long l = this.f60423g;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f60424h);
        parcel.writeInt(this.f60425i ? 1 : 0);
        parcel.writeString(this.f60426j);
        Long l2 = this.f60427k;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f60428l);
        parcel.writeString(this.f60429m);
        Integer num = this.f60430n;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public AccumulateOnSpecificDateModel(BigDecimal bigDecimal, String str, String str2, Long l, String str3, boolean z, String str4, Long l2, String str5, String str6, Integer num) {
        this.f60420d = bigDecimal;
        this.f60421e = str;
        this.f60422f = str2;
        this.f60423g = l;
        this.f60424h = str3;
        this.f60425i = z;
        this.f60426j = str4;
        this.f60427k = l2;
        this.f60428l = str5;
        this.f60429m = str6;
        this.f60430n = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AccumulateOnSpecificDateModel(java.math.BigDecimal r13, java.lang.String r14, java.lang.String r15, java.lang.Long r16, java.lang.String r17, boolean r18, java.lang.String r19, java.lang.Long r20, java.lang.String r21, java.lang.String r22, java.lang.Integer r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = 0
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            java.lang.String r8 = "GEL"
            goto L_0x0039
        L_0x0037:
            r8 = r19
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r2
            goto L_0x0041
        L_0x003f:
            r9 = r20
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r2
            goto L_0x0049
        L_0x0047:
            r10 = r21
        L_0x0049:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004f
            r11 = r2
            goto L_0x0051
        L_0x004f:
            r11 = r22
        L_0x0051:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r2 = r23
        L_0x0058:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel.<init>(java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, boolean, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
