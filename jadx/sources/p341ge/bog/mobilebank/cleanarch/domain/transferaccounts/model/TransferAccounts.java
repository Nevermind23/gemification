package p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts */
public final class TransferAccounts implements Parcelable {
    public static final Parcelable.Creator<TransferAccounts> CREATOR = new C21042a();

    /* renamed from: d */
    private final TransferAccount f56520d;

    /* renamed from: e */
    private final TransferAccount f56521e;

    /* renamed from: f */
    private final TransferAccount f56522f;

    /* renamed from: g */
    private final TransferAccount f56523g;

    /* renamed from: h */
    private final TransferAccount f56524h;

    /* renamed from: i */
    private final TransferAccount f56525i;

    /* renamed from: j */
    private final TransferAccount f56526j;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts$a */
    public static final class C21042a implements Parcelable.Creator {
        /* renamed from: a */
        public final TransferAccounts createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            TransferAccount transferAccount = null;
            TransferAccount createFromParcel = parcel.readInt() == 0 ? null : TransferAccount.CREATOR.createFromParcel(parcel);
            TransferAccount createFromParcel2 = parcel.readInt() == 0 ? null : TransferAccount.CREATOR.createFromParcel(parcel);
            TransferAccount createFromParcel3 = parcel.readInt() == 0 ? null : TransferAccount.CREATOR.createFromParcel(parcel);
            TransferAccount createFromParcel4 = parcel.readInt() == 0 ? null : TransferAccount.CREATOR.createFromParcel(parcel);
            TransferAccount createFromParcel5 = parcel.readInt() == 0 ? null : TransferAccount.CREATOR.createFromParcel(parcel);
            TransferAccount createFromParcel6 = parcel.readInt() == 0 ? null : TransferAccount.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                transferAccount = TransferAccount.CREATOR.createFromParcel(parcel);
            }
            return new TransferAccounts(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, transferAccount);
        }

        /* renamed from: b */
        public final TransferAccounts[] newArray(int i) {
            return new TransferAccounts[i];
        }
    }

    public TransferAccounts() {
        this((TransferAccount) null, (TransferAccount) null, (TransferAccount) null, (TransferAccount) null, (TransferAccount) null, (TransferAccount) null, (TransferAccount) null, C11051p3.f31760d, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final TransferAccount mo52161a() {
        return this.f56520d;
    }

    /* renamed from: b */
    public final TransferAccount mo52162b() {
        return this.f56521e;
    }

    /* renamed from: d */
    public final TransferAccount mo52163d() {
        return this.f56526j;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final TransferAccount mo52165e() {
        return this.f56525i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferAccounts)) {
            return false;
        }
        TransferAccounts transferAccounts = (TransferAccounts) obj;
        return C41536l.m120484d(this.f56520d, transferAccounts.f56520d) && C41536l.m120484d(this.f56521e, transferAccounts.f56521e) && C41536l.m120484d(this.f56522f, transferAccounts.f56522f) && C41536l.m120484d(this.f56523g, transferAccounts.f56523g) && C41536l.m120484d(this.f56524h, transferAccounts.f56524h) && C41536l.m120484d(this.f56525i, transferAccounts.f56525i) && C41536l.m120484d(this.f56526j, transferAccounts.f56526j);
    }

    public int hashCode() {
        TransferAccount transferAccount = this.f56520d;
        int i = 0;
        int hashCode = (transferAccount == null ? 0 : transferAccount.hashCode()) * 31;
        TransferAccount transferAccount2 = this.f56521e;
        int hashCode2 = (hashCode + (transferAccount2 == null ? 0 : transferAccount2.hashCode())) * 31;
        TransferAccount transferAccount3 = this.f56522f;
        int hashCode3 = (hashCode2 + (transferAccount3 == null ? 0 : transferAccount3.hashCode())) * 31;
        TransferAccount transferAccount4 = this.f56523g;
        int hashCode4 = (hashCode3 + (transferAccount4 == null ? 0 : transferAccount4.hashCode())) * 31;
        TransferAccount transferAccount5 = this.f56524h;
        int hashCode5 = (hashCode4 + (transferAccount5 == null ? 0 : transferAccount5.hashCode())) * 31;
        TransferAccount transferAccount6 = this.f56525i;
        int hashCode6 = (hashCode5 + (transferAccount6 == null ? 0 : transferAccount6.hashCode())) * 31;
        TransferAccount transferAccount7 = this.f56526j;
        if (transferAccount7 != null) {
            i = transferAccount7.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        TransferAccount transferAccount = this.f56520d;
        TransferAccount transferAccount2 = this.f56521e;
        TransferAccount transferAccount3 = this.f56522f;
        TransferAccount transferAccount4 = this.f56523g;
        TransferAccount transferAccount5 = this.f56524h;
        TransferAccount transferAccount6 = this.f56525i;
        TransferAccount transferAccount7 = this.f56526j;
        return "TransferAccounts(bank=" + transferAccount + ", domestic=" + transferAccount2 + ", conversion=" + transferAccount3 + ", foreign=" + transferAccount4 + ", georgia=" + transferAccount5 + ", moneyRequest=" + transferAccount6 + ", galtAndTaggart=" + transferAccount7 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        TransferAccount transferAccount = this.f56520d;
        if (transferAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferAccount.writeToParcel(parcel, i);
        }
        TransferAccount transferAccount2 = this.f56521e;
        if (transferAccount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferAccount2.writeToParcel(parcel, i);
        }
        TransferAccount transferAccount3 = this.f56522f;
        if (transferAccount3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferAccount3.writeToParcel(parcel, i);
        }
        TransferAccount transferAccount4 = this.f56523g;
        if (transferAccount4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferAccount4.writeToParcel(parcel, i);
        }
        TransferAccount transferAccount5 = this.f56524h;
        if (transferAccount5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferAccount5.writeToParcel(parcel, i);
        }
        TransferAccount transferAccount6 = this.f56525i;
        if (transferAccount6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferAccount6.writeToParcel(parcel, i);
        }
        TransferAccount transferAccount7 = this.f56526j;
        if (transferAccount7 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        transferAccount7.writeToParcel(parcel, i);
    }

    public TransferAccounts(TransferAccount transferAccount, TransferAccount transferAccount2, TransferAccount transferAccount3, TransferAccount transferAccount4, TransferAccount transferAccount5, TransferAccount transferAccount6, TransferAccount transferAccount7) {
        this.f56520d = transferAccount;
        this.f56521e = transferAccount2;
        this.f56522f = transferAccount3;
        this.f56523g = transferAccount4;
        this.f56524h = transferAccount5;
        this.f56525i = transferAccount6;
        this.f56526j = transferAccount7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransferAccounts(p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount r7, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount r8, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount r9, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount r10, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount r11, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount r12, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts.<init>(ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
