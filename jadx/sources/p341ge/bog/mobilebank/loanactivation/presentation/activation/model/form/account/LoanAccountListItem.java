package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem */
public final class LoanAccountListItem implements Parcelable {
    public static final Parcelable.Creator<LoanAccountListItem> CREATOR = new C32478a();

    /* renamed from: d */
    private final String f79985d;

    /* renamed from: e */
    private final String f79986e;

    /* renamed from: f */
    private final Long f79987f;

    /* renamed from: g */
    private final String f79988g;

    /* renamed from: h */
    private final BigDecimal f79989h;

    /* renamed from: i */
    private final TransferExternalFile f79990i;

    /* renamed from: j */
    private final TransferExternalFile f79991j;

    /* renamed from: k */
    private final String f79992k;

    /* renamed from: l */
    private final String f79993l;

    /* renamed from: m */
    private final boolean f79994m;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem$a */
    public static final class C32478a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoanAccountListItem createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Class<LoanAccountListItem> cls = LoanAccountListItem.class;
            return new LoanAccountListItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (BigDecimal) parcel.readSerializable(), (TransferExternalFile) parcel.readParcelable(cls.getClassLoader()), (TransferExternalFile) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final LoanAccountListItem[] newArray(int i) {
            return new LoanAccountListItem[i];
        }
    }

    public LoanAccountListItem(String str, String str2, Long l, String str3, BigDecimal bigDecimal, TransferExternalFile transferExternalFile, TransferExternalFile transferExternalFile2, String str4, String str5, boolean z) {
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(str4, "ccy");
        this.f79985d = str;
        this.f79986e = str2;
        this.f79987f = l;
        this.f79988g = str3;
        this.f79989h = bigDecimal;
        this.f79990i = transferExternalFile;
        this.f79991j = transferExternalFile2;
        this.f79992k = str4;
        this.f79993l = str5;
        this.f79994m = z;
    }

    /* renamed from: a */
    public final Long mo73337a() {
        return this.f79987f;
    }

    /* renamed from: b */
    public final String mo73338b() {
        return this.f79988g;
    }

    /* renamed from: d */
    public final BigDecimal mo73339d() {
        return this.f79989h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final TransferExternalFile mo73341e() {
        return this.f79991j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanAccountListItem)) {
            return false;
        }
        LoanAccountListItem loanAccountListItem = (LoanAccountListItem) obj;
        return C41536l.m120484d(this.f79985d, loanAccountListItem.f79985d) && C41536l.m120484d(this.f79986e, loanAccountListItem.f79986e) && C41536l.m120484d(this.f79987f, loanAccountListItem.f79987f) && C41536l.m120484d(this.f79988g, loanAccountListItem.f79988g) && C41536l.m120484d(this.f79989h, loanAccountListItem.f79989h) && C41536l.m120484d(this.f79990i, loanAccountListItem.f79990i) && C41536l.m120484d(this.f79991j, loanAccountListItem.f79991j) && C41536l.m120484d(this.f79992k, loanAccountListItem.f79992k) && C41536l.m120484d(this.f79993l, loanAccountListItem.f79993l) && this.f79994m == loanAccountListItem.f79994m;
    }

    /* renamed from: f */
    public final TransferExternalFile mo73343f() {
        return this.f79990i;
    }

    /* renamed from: g */
    public final String mo73344g() {
        return this.f79993l;
    }

    /* renamed from: h */
    public final String mo73345h() {
        return this.f79992k;
    }

    public int hashCode() {
        String str = this.f79985d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f79986e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f79987f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f79988g;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f79989h.hashCode()) * 31;
        TransferExternalFile transferExternalFile = this.f79990i;
        int hashCode5 = (hashCode4 + (transferExternalFile == null ? 0 : transferExternalFile.hashCode())) * 31;
        TransferExternalFile transferExternalFile2 = this.f79991j;
        int hashCode6 = (((hashCode5 + (transferExternalFile2 == null ? 0 : transferExternalFile2.hashCode())) * 31) + this.f79992k.hashCode()) * 31;
        String str4 = this.f79993l;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z = this.f79994m;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo73347i() {
        return this.f79985d;
    }

    /* renamed from: j */
    public final boolean mo73348j() {
        return this.f79994m;
    }

    public String toString() {
        String str = this.f79985d;
        String str2 = this.f79986e;
        Long l = this.f79987f;
        String str3 = this.f79988g;
        BigDecimal bigDecimal = this.f79989h;
        TransferExternalFile transferExternalFile = this.f79990i;
        TransferExternalFile transferExternalFile2 = this.f79991j;
        String str4 = this.f79992k;
        String str5 = this.f79993l;
        boolean z = this.f79994m;
        return "LoanAccountListItem(name=" + str + ", desc=" + str2 + ", acctKey=" + l + ", acctNo=" + str3 + ", availableAmount=" + bigDecimal + ", cardIcon=" + transferExternalFile + ", cardBackground=" + transferExternalFile2 + ", ccy=" + str4 + ", cardPan=" + str5 + ", isSelected=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f79985d);
        parcel.writeString(this.f79986e);
        Long l = this.f79987f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f79988g);
        parcel.writeSerializable(this.f79989h);
        parcel.writeParcelable(this.f79990i, i);
        parcel.writeParcelable(this.f79991j, i);
        parcel.writeString(this.f79992k);
        parcel.writeString(this.f79993l);
        parcel.writeInt(this.f79994m ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LoanAccountListItem(java.lang.String r14, java.lang.String r15, java.lang.Long r16, java.lang.String r17, java.math.BigDecimal r18, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r19, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r20, java.lang.String r21, java.lang.String r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r11 = r1
            goto L_0x000b
        L_0x0009:
            r11 = r22
        L_0x000b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r12 = r0
            goto L_0x0014
        L_0x0012:
            r12 = r23
        L_0x0014:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.math.BigDecimal, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
