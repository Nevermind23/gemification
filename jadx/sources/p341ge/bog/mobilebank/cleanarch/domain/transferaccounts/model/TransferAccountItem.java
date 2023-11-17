package p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem */
public final class TransferAccountItem implements Parcelable {
    public static final Parcelable.Creator<TransferAccountItem> CREATOR = new C21041a();

    /* renamed from: d */
    private final boolean f56502d;

    /* renamed from: e */
    private final boolean f56503e;

    /* renamed from: f */
    private final long f56504f;

    /* renamed from: g */
    private final String f56505g;

    /* renamed from: h */
    private final String f56506h;

    /* renamed from: i */
    private final String f56507i;

    /* renamed from: j */
    private final BigDecimal f56508j;

    /* renamed from: k */
    private final long f56509k;

    /* renamed from: l */
    private final BigDecimal f56510l;

    /* renamed from: m */
    private final boolean f56511m;

    /* renamed from: n */
    private final String f56512n;

    /* renamed from: o */
    private final boolean f56513o;

    /* renamed from: p */
    private final String f56514p;

    /* renamed from: q */
    private final List f56515q;

    /* renamed from: r */
    private final String f56516r;

    /* renamed from: s */
    private final TransferExternalFile f56517s;

    /* renamed from: t */
    private final TransferExternalFile f56518t;

    /* renamed from: u */
    private final TransferExternalFile f56519u;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem$a */
    public static final class C21041a implements Parcelable.Creator {
        /* renamed from: a */
        public final TransferAccountItem createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            long readLong2 = parcel.readLong();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            boolean z3 = parcel.readInt() != 0;
            String readString4 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(TransferAccountItem.CREATOR.createFromParcel(parcel2));
            }
            String readString6 = parcel.readString();
            TransferExternalFile transferExternalFile = null;
            TransferExternalFile createFromParcel = parcel.readInt() == 0 ? null : TransferExternalFile.CREATOR.createFromParcel(parcel2);
            TransferExternalFile createFromParcel2 = parcel.readInt() == 0 ? null : TransferExternalFile.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() != 0) {
                transferExternalFile = TransferExternalFile.CREATOR.createFromParcel(parcel2);
            }
            return new TransferAccountItem(z, z2, readLong, readString, readString2, readString3, bigDecimal, readLong2, bigDecimal2, z3, readString4, z4, readString5, arrayList, readString6, createFromParcel, createFromParcel2, transferExternalFile);
        }

        /* renamed from: b */
        public final TransferAccountItem[] newArray(int i) {
            return new TransferAccountItem[i];
        }
    }

    public TransferAccountItem(boolean z, boolean z2, long j, String str, String str2, String str3, BigDecimal bigDecimal, long j2, BigDecimal bigDecimal2, boolean z3, String str4, boolean z4, String str5, List list, String str6, TransferExternalFile transferExternalFile, TransferExternalFile transferExternalFile2, TransferExternalFile transferExternalFile3) {
        List list2 = list;
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(list2, "subAccounts");
        this.f56502d = z;
        this.f56503e = z2;
        this.f56504f = j;
        this.f56505g = str;
        this.f56506h = str2;
        this.f56507i = str3;
        this.f56508j = bigDecimal;
        this.f56509k = j2;
        this.f56510l = bigDecimal2;
        this.f56511m = z3;
        this.f56512n = str4;
        this.f56513o = z4;
        this.f56514p = str5;
        this.f56515q = list2;
        this.f56516r = str6;
        this.f56517s = transferExternalFile;
        this.f56518t = transferExternalFile2;
        this.f56519u = transferExternalFile3;
    }

    /* renamed from: b */
    public static /* synthetic */ TransferAccountItem m68075b(TransferAccountItem transferAccountItem, boolean z, boolean z2, long j, String str, String str2, String str3, BigDecimal bigDecimal, long j2, BigDecimal bigDecimal2, boolean z3, String str4, boolean z4, String str5, List list, String str6, TransferExternalFile transferExternalFile, TransferExternalFile transferExternalFile2, TransferExternalFile transferExternalFile3, int i, Object obj) {
        TransferAccountItem transferAccountItem2 = transferAccountItem;
        int i2 = i;
        return transferAccountItem.mo52133a((i2 & 1) != 0 ? transferAccountItem2.f56502d : z, (i2 & 2) != 0 ? transferAccountItem2.f56503e : z2, (i2 & 4) != 0 ? transferAccountItem2.f56504f : j, (i2 & 8) != 0 ? transferAccountItem2.f56505g : str, (i2 & 16) != 0 ? transferAccountItem2.f56506h : str2, (i2 & 32) != 0 ? transferAccountItem2.f56507i : str3, (i2 & 64) != 0 ? transferAccountItem2.f56508j : bigDecimal, (i2 & 128) != 0 ? transferAccountItem2.f56509k : j2, (i2 & C11398b.f33139r) != 0 ? transferAccountItem2.f56510l : bigDecimal2, (i2 & C11398b.f33140s) != 0 ? transferAccountItem2.f56511m : z3, (i2 & C11398b.f33141t) != 0 ? transferAccountItem2.f56512n : str4, (i2 & C11398b.f33142u) != 0 ? transferAccountItem2.f56513o : z4, (i2 & C11398b.f33143v) != 0 ? transferAccountItem2.f56514p : str5, (i2 & 8192) != 0 ? transferAccountItem2.f56515q : list, (i2 & 16384) != 0 ? transferAccountItem2.f56516r : str6, (i2 & 32768) != 0 ? transferAccountItem2.f56517s : transferExternalFile, (i2 & 65536) != 0 ? transferAccountItem2.f56518t : transferExternalFile2, (i2 & 131072) != 0 ? transferAccountItem2.f56519u : transferExternalFile3);
    }

    /* renamed from: a */
    public final TransferAccountItem mo52133a(boolean z, boolean z2, long j, String str, String str2, String str3, BigDecimal bigDecimal, long j2, BigDecimal bigDecimal2, boolean z3, String str4, boolean z4, String str5, List list, String str6, TransferExternalFile transferExternalFile, TransferExternalFile transferExternalFile2, TransferExternalFile transferExternalFile3) {
        boolean z5 = z;
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(list, "subAccounts");
        return new TransferAccountItem(z, z2, j, str, str2, str3, bigDecimal, j2, bigDecimal2, z3, str4, z4, str5, list, str6, transferExternalFile, transferExternalFile2, transferExternalFile3);
    }

    /* renamed from: d */
    public final String mo52134d() {
        return this.f56505g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo52136e() {
        return this.f56512n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferAccountItem)) {
            return false;
        }
        TransferAccountItem transferAccountItem = (TransferAccountItem) obj;
        return this.f56502d == transferAccountItem.f56502d && this.f56503e == transferAccountItem.f56503e && this.f56504f == transferAccountItem.f56504f && C41536l.m120484d(this.f56505g, transferAccountItem.f56505g) && C41536l.m120484d(this.f56506h, transferAccountItem.f56506h) && C41536l.m120484d(this.f56507i, transferAccountItem.f56507i) && C41536l.m120484d(this.f56508j, transferAccountItem.f56508j) && this.f56509k == transferAccountItem.f56509k && C41536l.m120484d(this.f56510l, transferAccountItem.f56510l) && this.f56511m == transferAccountItem.f56511m && C41536l.m120484d(this.f56512n, transferAccountItem.f56512n) && this.f56513o == transferAccountItem.f56513o && C41536l.m120484d(this.f56514p, transferAccountItem.f56514p) && C41536l.m120484d(this.f56515q, transferAccountItem.f56515q) && C41536l.m120484d(this.f56516r, transferAccountItem.f56516r) && C41536l.m120484d(this.f56517s, transferAccountItem.f56517s) && C41536l.m120484d(this.f56518t, transferAccountItem.f56518t) && C41536l.m120484d(this.f56519u, transferAccountItem.f56519u);
    }

    /* renamed from: f */
    public final String mo52138f() {
        return this.f56514p;
    }

    /* renamed from: g */
    public final BigDecimal mo52139g() {
        return this.f56508j;
    }

    /* renamed from: h */
    public final TransferExternalFile mo52140h() {
        return this.f56519u;
    }

    public int hashCode() {
        boolean z = this.f56502d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f56503e;
        if (z3) {
            z3 = true;
        }
        int a = (((i + (z3 ? 1 : 0)) * 31) + C7397t.m28148a(this.f56504f)) * 31;
        String str = this.f56505g;
        int i2 = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f56506h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56507i;
        int hashCode3 = (((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f56508j.hashCode()) * 31) + C7397t.m28148a(this.f56509k)) * 31;
        BigDecimal bigDecimal = this.f56510l;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        boolean z4 = this.f56511m;
        if (z4) {
            z4 = true;
        }
        int i3 = (hashCode4 + (z4 ? 1 : 0)) * 31;
        String str4 = this.f56512n;
        int hashCode5 = (i3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z5 = this.f56513o;
        if (!z5) {
            z2 = z5;
        }
        int i4 = (hashCode5 + (z2 ? 1 : 0)) * 31;
        String str5 = this.f56514p;
        int hashCode6 = (((i4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f56515q.hashCode()) * 31;
        String str6 = this.f56516r;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        TransferExternalFile transferExternalFile = this.f56517s;
        int hashCode8 = (hashCode7 + (transferExternalFile == null ? 0 : transferExternalFile.hashCode())) * 31;
        TransferExternalFile transferExternalFile2 = this.f56518t;
        int hashCode9 = (hashCode8 + (transferExternalFile2 == null ? 0 : transferExternalFile2.hashCode())) * 31;
        TransferExternalFile transferExternalFile3 = this.f56519u;
        if (transferExternalFile3 != null) {
            i2 = transferExternalFile3.hashCode();
        }
        return hashCode9 + i2;
    }

    /* renamed from: i */
    public final String mo52142i() {
        return this.f56507i;
    }

    /* renamed from: j */
    public final TransferExternalFile mo52143j() {
        return this.f56517s;
    }

    /* renamed from: k */
    public final TransferExternalFile mo52144k() {
        return this.f56518t;
    }

    /* renamed from: l */
    public final boolean mo52145l() {
        return this.f56513o;
    }

    /* renamed from: m */
    public final long mo52146m() {
        return this.f56504f;
    }

    /* renamed from: p */
    public final long mo52147p() {
        return this.f56509k;
    }

    /* renamed from: q */
    public final String mo52148q() {
        return this.f56506h;
    }

    /* renamed from: r */
    public final String mo52149r() {
        return this.f56516r;
    }

    /* renamed from: s */
    public final BigDecimal mo52150s() {
        return this.f56510l;
    }

    /* renamed from: t */
    public final List mo52151t() {
        return this.f56515q;
    }

    public String toString() {
        boolean z = this.f56502d;
        boolean z2 = this.f56503e;
        long j = this.f56504f;
        String str = this.f56505g;
        String str2 = this.f56506h;
        String str3 = this.f56507i;
        BigDecimal bigDecimal = this.f56508j;
        long j2 = this.f56509k;
        BigDecimal bigDecimal2 = this.f56510l;
        boolean z3 = this.f56511m;
        String str4 = this.f56512n;
        boolean z4 = this.f56513o;
        String str5 = this.f56514p;
        List list = this.f56515q;
        String str6 = this.f56516r;
        TransferExternalFile transferExternalFile = this.f56517s;
        TransferExternalFile transferExternalFile2 = this.f56518t;
        TransferExternalFile transferExternalFile3 = this.f56519u;
        return "TransferAccountItem(isCreditCard=" + z + ", isForCreditSTO=" + z2 + ", id=" + j + ", acctNo=" + str + ", name=" + str2 + ", ccy=" + str3 + ", availableAmount=" + bigDecimal + ", mainAcctKey=" + j2 + ", realAmount=" + bigDecimal2 + ", isDefault=" + z3 + ", attachmentId=" + str4 + ", hasDeposit=" + z4 + ", attachmentUrl=" + str5 + ", subAccounts=" + list + ", productCode=" + str6 + ", externalFile=" + transferExternalFile + ", externalIcon=" + transferExternalFile2 + ", cardExternalIcon=" + transferExternalFile3 + ")";
    }

    /* renamed from: u */
    public final boolean mo52153u() {
        return this.f56502d;
    }

    /* renamed from: v */
    public final boolean mo52154v() {
        return this.f56511m;
    }

    /* renamed from: w */
    public final boolean mo52155w() {
        return this.f56503e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f56502d ? 1 : 0);
        parcel.writeInt(this.f56503e ? 1 : 0);
        parcel.writeLong(this.f56504f);
        parcel.writeString(this.f56505g);
        parcel.writeString(this.f56506h);
        parcel.writeString(this.f56507i);
        parcel.writeSerializable(this.f56508j);
        parcel.writeLong(this.f56509k);
        parcel.writeSerializable(this.f56510l);
        parcel.writeInt(this.f56511m ? 1 : 0);
        parcel.writeString(this.f56512n);
        parcel.writeInt(this.f56513o ? 1 : 0);
        parcel.writeString(this.f56514p);
        List<TransferAccountItem> list = this.f56515q;
        parcel.writeInt(list.size());
        for (TransferAccountItem writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f56516r);
        TransferExternalFile transferExternalFile = this.f56517s;
        if (transferExternalFile == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferExternalFile.writeToParcel(parcel, i);
        }
        TransferExternalFile transferExternalFile2 = this.f56518t;
        if (transferExternalFile2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferExternalFile2.writeToParcel(parcel, i);
        }
        TransferExternalFile transferExternalFile3 = this.f56519u;
        if (transferExternalFile3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        transferExternalFile3.writeToParcel(parcel, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransferAccountItem(boolean r25, boolean r26, long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.math.BigDecimal r32, long r33, java.math.BigDecimal r35, boolean r36, java.lang.String r37, boolean r38, java.lang.String r39, java.util.List r40, java.lang.String r41, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r42, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r43, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r25
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r26
        L_0x0013:
            r1 = r0 & 4
            r6 = 0
            if (r1 == 0) goto L_0x001b
            r8 = r6
            goto L_0x001d
        L_0x001b:
            r8 = r27
        L_0x001d:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x0024
            r1 = r3
            goto L_0x0026
        L_0x0024:
            r1 = r29
        L_0x0026:
            r10 = r0 & 16
            if (r10 == 0) goto L_0x002c
            r10 = r3
            goto L_0x002e
        L_0x002c:
            r10 = r30
        L_0x002e:
            r11 = r0 & 32
            if (r11 == 0) goto L_0x0034
            r11 = r3
            goto L_0x0036
        L_0x0034:
            r11 = r31
        L_0x0036:
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x003c
            r12 = r6
            goto L_0x003e
        L_0x003c:
            r12 = r33
        L_0x003e:
            r6 = r0 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0044
            r14 = r3
            goto L_0x0046
        L_0x0044:
            r14 = r35
        L_0x0046:
            r6 = r0 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x004c
            r15 = r2
            goto L_0x004e
        L_0x004c:
            r15 = r36
        L_0x004e:
            r6 = r0 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0055
            r16 = r3
            goto L_0x0057
        L_0x0055:
            r16 = r37
        L_0x0057:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x005e
            r17 = r2
            goto L_0x0060
        L_0x005e:
            r17 = r38
        L_0x0060:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0067
            r18 = r3
            goto L_0x0069
        L_0x0067:
            r18 = r39
        L_0x0069:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0070
            r20 = r3
            goto L_0x0072
        L_0x0070:
            r20 = r41
        L_0x0072:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x007b
            r21 = r3
            goto L_0x007d
        L_0x007b:
            r21 = r42
        L_0x007d:
            r2 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0085
            r22 = r3
            goto L_0x0087
        L_0x0085:
            r22 = r43
        L_0x0087:
            r2 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x008f
            r23 = r3
            goto L_0x0091
        L_0x008f:
            r23 = r44
        L_0x0091:
            r3 = r24
            r6 = r8
            r8 = r1
            r9 = r10
            r10 = r11
            r11 = r32
            r19 = r40
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem.<init>(boolean, boolean, long, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, long, java.math.BigDecimal, boolean, java.lang.String, boolean, java.lang.String, java.util.List, java.lang.String, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
