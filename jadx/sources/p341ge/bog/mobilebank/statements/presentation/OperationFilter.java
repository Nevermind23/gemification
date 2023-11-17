package p341ge.bog.mobilebank.statements.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.statements.presentation.OperationFilter */
public final class OperationFilter implements Parcelable {
    public static final Parcelable.Creator<OperationFilter> CREATOR = new C34718a();

    /* renamed from: d */
    private final long f83901d;

    /* renamed from: e */
    private final long f83902e;

    /* renamed from: f */
    private final List f83903f;

    /* renamed from: g */
    private final List f83904g;

    /* renamed from: h */
    private final List f83905h;

    /* renamed from: i */
    private final String f83906i;

    /* renamed from: j */
    private final BigDecimal f83907j;

    /* renamed from: k */
    private final BigDecimal f83908k;

    /* renamed from: l */
    private final List f83909l;

    /* renamed from: m */
    private final Integer f83910m;

    /* renamed from: n */
    private final List f83911n;

    /* renamed from: ge.bog.mobilebank.statements.presentation.OperationFilter$a */
    public static final class C34718a implements Parcelable.Creator {
        /* renamed from: a */
        public final OperationFilter createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
            }
            return new OperationFilter(readLong, readLong2, arrayList, arrayList2, arrayList3, parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList());
        }

        /* renamed from: b */
        public final OperationFilter[] newArray(int i) {
            return new OperationFilter[i];
        }
    }

    public OperationFilter(long j, long j2, List list, List list2, List list3, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list4, Integer num, List list5) {
        this.f83901d = j;
        this.f83902e = j2;
        this.f83903f = list;
        this.f83904g = list2;
        this.f83905h = list3;
        this.f83906i = str;
        this.f83907j = bigDecimal;
        this.f83908k = bigDecimal2;
        this.f83909l = list4;
        this.f83910m = num;
        this.f83911n = list5;
    }

    /* renamed from: a */
    public final List mo84790a() {
        return this.f83903f;
    }

    /* renamed from: b */
    public final List mo84791b() {
        return this.f83904g;
    }

    /* renamed from: d */
    public final List mo84792d() {
        return this.f83905h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo84794e() {
        return this.f83909l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperationFilter)) {
            return false;
        }
        OperationFilter operationFilter = (OperationFilter) obj;
        return this.f83901d == operationFilter.f83901d && this.f83902e == operationFilter.f83902e && C41536l.m120484d(this.f83903f, operationFilter.f83903f) && C41536l.m120484d(this.f83904g, operationFilter.f83904g) && C41536l.m120484d(this.f83905h, operationFilter.f83905h) && C41536l.m120484d(this.f83906i, operationFilter.f83906i) && C41536l.m120484d(this.f83907j, operationFilter.f83907j) && C41536l.m120484d(this.f83908k, operationFilter.f83908k) && C41536l.m120484d(this.f83909l, operationFilter.f83909l) && C41536l.m120484d(this.f83910m, operationFilter.f83910m) && C41536l.m120484d(this.f83911n, operationFilter.f83911n);
    }

    /* renamed from: f */
    public final long mo84796f() {
        return this.f83902e;
    }

    /* renamed from: g */
    public final List mo84797g() {
        return this.f83911n;
    }

    /* renamed from: h */
    public final BigDecimal mo84798h() {
        return this.f83908k;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f83901d) * 31) + C7397t.m28148a(this.f83902e)) * 31;
        List list = this.f83903f;
        int i = 0;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f83904g;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f83905h;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.f83906i;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.f83907j;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f83908k;
        int hashCode6 = (hashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        List list4 = this.f83909l;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.f83910m;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List list5 = this.f83911n;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public final BigDecimal mo84800i() {
        return this.f83907j;
    }

    /* renamed from: j */
    public final Integer mo84801j() {
        return this.f83910m;
    }

    /* renamed from: k */
    public final String mo84802k() {
        return this.f83906i;
    }

    /* renamed from: l */
    public final long mo84803l() {
        return this.f83901d;
    }

    public String toString() {
        long j = this.f83901d;
        long j2 = this.f83902e;
        List list = this.f83903f;
        List list2 = this.f83904g;
        List list3 = this.f83905h;
        String str = this.f83906i;
        BigDecimal bigDecimal = this.f83907j;
        BigDecimal bigDecimal2 = this.f83908k;
        List list4 = this.f83909l;
        Integer num = this.f83910m;
        List list5 = this.f83911n;
        return "OperationFilter(startDate=" + j + ", endDate=" + j2 + ", accountKeys=" + list + ", cardIds=" + list2 + ", categoryIds=" + list3 + ", searchWord=" + str + ", minAmount=" + bigDecimal + ", maxAmount=" + bigDecimal2 + ", ccys=" + list4 + ", months=" + num + ", keyWords=" + list5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f83901d);
        parcel.writeLong(this.f83902e);
        List<Number> list = this.f83903f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Number longValue : list) {
                parcel.writeLong(longValue.longValue());
            }
        }
        List<Number> list2 = this.f83904g;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Number longValue2 : list2) {
                parcel.writeLong(longValue2.longValue());
            }
        }
        List<Number> list3 = this.f83905h;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (Number longValue3 : list3) {
                parcel.writeLong(longValue3.longValue());
            }
        }
        parcel.writeString(this.f83906i);
        parcel.writeSerializable(this.f83907j);
        parcel.writeSerializable(this.f83908k);
        parcel.writeStringList(this.f83909l);
        Integer num = this.f83910m;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.f83911n);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OperationFilter(long r18, long r20, java.util.List r22, java.util.List r23, java.util.List r24, java.lang.String r25, java.math.BigDecimal r26, java.math.BigDecimal r27, java.util.List r28, java.lang.Integer r29, java.util.List r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r22
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r23
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r10 = r2
            goto L_0x001b
        L_0x0019:
            r10 = r24
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r11 = r2
            goto L_0x0023
        L_0x0021:
            r11 = r25
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r12 = r2
            goto L_0x002b
        L_0x0029:
            r12 = r26
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r13 = r2
            goto L_0x0033
        L_0x0031:
            r13 = r27
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r14 = r2
            goto L_0x003b
        L_0x0039:
            r14 = r28
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r15 = r2
            goto L_0x0043
        L_0x0041:
            r15 = r29
        L_0x0043:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x004a
            r16 = r2
            goto L_0x004c
        L_0x004a:
            r16 = r30
        L_0x004c:
            r3 = r17
            r4 = r18
            r6 = r20
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.statements.presentation.OperationFilter.<init>(long, long, java.util.List, java.util.List, java.util.List, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.util.List, java.lang.Integer, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
