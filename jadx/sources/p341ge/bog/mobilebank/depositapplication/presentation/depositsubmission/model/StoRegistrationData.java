package p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.StoRegistrationData */
public final class StoRegistrationData implements Parcelable {
    public static final Parcelable.Creator<StoRegistrationData> CREATOR = new C22981a();

    /* renamed from: d */
    private final BigDecimal f60450d;

    /* renamed from: e */
    private final long f60451e;

    /* renamed from: f */
    private final Integer f60452f;

    /* renamed from: g */
    private final Long f60453g;

    /* renamed from: h */
    private final String f60454h;

    /* renamed from: i */
    private final String f60455i;

    /* renamed from: j */
    private final TransferAccountItem f60456j;

    /* renamed from: k */
    private final Long f60457k;

    /* renamed from: l */
    private final String f60458l;

    /* renamed from: m */
    private final String f60459m;

    /* renamed from: n */
    private final String f60460n;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.StoRegistrationData$a */
    public static final class C22981a implements Parcelable.Creator {
        /* renamed from: a */
        public final StoRegistrationData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new StoRegistrationData((BigDecimal) parcel.readSerializable(), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), (TransferAccountItem) parcel.readParcelable(StoRegistrationData.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final StoRegistrationData[] newArray(int i) {
            return new StoRegistrationData[i];
        }
    }

    public StoRegistrationData() {
        this((BigDecimal) null, 0, (Integer) null, (Long) null, (String) null, (String) null, (TransferAccountItem) null, (Long) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoRegistrationData)) {
            return false;
        }
        StoRegistrationData stoRegistrationData = (StoRegistrationData) obj;
        return C41536l.m120484d(this.f60450d, stoRegistrationData.f60450d) && this.f60451e == stoRegistrationData.f60451e && C41536l.m120484d(this.f60452f, stoRegistrationData.f60452f) && C41536l.m120484d(this.f60453g, stoRegistrationData.f60453g) && C41536l.m120484d(this.f60454h, stoRegistrationData.f60454h) && C41536l.m120484d(this.f60455i, stoRegistrationData.f60455i) && C41536l.m120484d(this.f60456j, stoRegistrationData.f60456j) && C41536l.m120484d(this.f60457k, stoRegistrationData.f60457k) && C41536l.m120484d(this.f60458l, stoRegistrationData.f60458l) && C41536l.m120484d(this.f60459m, stoRegistrationData.f60459m) && C41536l.m120484d(this.f60460n, stoRegistrationData.f60460n);
    }

    public int hashCode() {
        int hashCode = ((this.f60450d.hashCode() * 31) + C7397t.m28148a(this.f60451e)) * 31;
        Integer num = this.f60452f;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f60453g;
        int hashCode3 = (((hashCode2 + (l == null ? 0 : l.hashCode())) * 31) + this.f60454h.hashCode()) * 31;
        String str = this.f60455i;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        TransferAccountItem transferAccountItem = this.f60456j;
        int hashCode5 = (hashCode4 + (transferAccountItem == null ? 0 : transferAccountItem.hashCode())) * 31;
        Long l2 = this.f60457k;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.f60458l;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60459m;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode7 + i) * 31) + this.f60460n.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f60450d;
        long j = this.f60451e;
        Integer num = this.f60452f;
        Long l = this.f60453g;
        String str = this.f60454h;
        String str2 = this.f60455i;
        TransferAccountItem transferAccountItem = this.f60456j;
        Long l2 = this.f60457k;
        String str3 = this.f60458l;
        String str4 = this.f60459m;
        String str5 = this.f60460n;
        return "StoRegistrationData(amount=" + bigDecimal + ", agreeKey=" + j + ", day=" + num + ", startDate=" + l + ", ccy=" + str + ", srcAcctCcy=" + str2 + ", srcAcct=" + transferAccountItem + ", dstAccountKey=" + l2 + ", dstAccountNo=" + str3 + ", nomination=" + str4 + ", periodType=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.f60450d);
        parcel.writeLong(this.f60451e);
        Integer num = this.f60452f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.f60453g;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f60454h);
        parcel.writeString(this.f60455i);
        parcel.writeParcelable(this.f60456j, i);
        Long l2 = this.f60457k;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f60458l);
        parcel.writeString(this.f60459m);
        parcel.writeString(this.f60460n);
    }

    public StoRegistrationData(BigDecimal bigDecimal, long j, Integer num, Long l, String str, String str2, TransferAccountItem transferAccountItem, Long l2, String str3, String str4, String str5) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str5, "periodType");
        this.f60450d = bigDecimal;
        this.f60451e = j;
        this.f60452f = num;
        this.f60453g = l;
        this.f60454h = str;
        this.f60455i = str2;
        this.f60456j = transferAccountItem;
        this.f60457k = l2;
        this.f60458l = str3;
        this.f60459m = str4;
        this.f60460n = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoRegistrationData(java.math.BigDecimal r14, long r15, java.lang.Integer r17, java.lang.Long r18, java.lang.String r19, java.lang.String r20, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem r21, java.lang.Long r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000e
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
            java.lang.String r2 = "ZERO"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            goto L_0x000f
        L_0x000e:
            r1 = r14
        L_0x000f:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0016
            r2 = -1
            goto L_0x0017
        L_0x0016:
            r2 = r15
        L_0x0017:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x001e
            r4 = r5
            goto L_0x0020
        L_0x001e:
            r4 = r17
        L_0x0020:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0026
            r6 = r5
            goto L_0x0028
        L_0x0026:
            r6 = r18
        L_0x0028:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002f
            java.lang.String r7 = "GEL"
            goto L_0x0031
        L_0x002f:
            r7 = r19
        L_0x0031:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0037
            r8 = r5
            goto L_0x0039
        L_0x0037:
            r8 = r20
        L_0x0039:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003f
            r9 = r5
            goto L_0x0041
        L_0x003f:
            r9 = r21
        L_0x0041:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r5
            goto L_0x0049
        L_0x0047:
            r10 = r22
        L_0x0049:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004f
            r11 = r5
            goto L_0x0051
        L_0x004f:
            r11 = r23
        L_0x0051:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r5 = r24
        L_0x0058:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "1M"
            goto L_0x0061
        L_0x005f:
            r0 = r25
        L_0x0061:
            r14 = r13
            r15 = r1
            r16 = r2
            r18 = r4
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r5
            r26 = r0
            r14.<init>(r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.StoRegistrationData.<init>(java.math.BigDecimal, long, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
