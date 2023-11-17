package p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountItemApiEntity */
public final class TransferAccountItemApiEntity {
    private final String acctNo;
    private final String attachmentId;
    private final String attachmentUrl;
    private final BigDecimal availableAmount;
    private final TransferExternalFileApiEntity cardExternalFile;
    private final String ccy;
    private final TransferExternalFileApiEntity externalFile;
    private final TransferExternalFileApiEntity externalIcon;
    private final boolean hasDeposit;

    /* renamed from: id */
    private final long f56459id;
    private final boolean isCreditCard;
    private final YesNoApiEntity isDefault;
    private final boolean isForCreditSTO;
    private final long mainAcctKey;
    private final String name;
    private final String productCode;
    private final BigDecimal realAmount;
    private final List<TransferAccountItemApiEntity> subAccounts;

    public TransferAccountItemApiEntity(boolean z, boolean z2, long j, String str, String str2, String str3, BigDecimal bigDecimal, long j2, BigDecimal bigDecimal2, YesNoApiEntity yesNoApiEntity, String str4, boolean z3, String str5, List<TransferAccountItemApiEntity> list, String str6, TransferExternalFileApiEntity transferExternalFileApiEntity, TransferExternalFileApiEntity transferExternalFileApiEntity2, TransferExternalFileApiEntity transferExternalFileApiEntity3) {
        C41536l.m120489i(bigDecimal, "availableAmount");
        this.isCreditCard = z;
        this.isForCreditSTO = z2;
        this.f56459id = j;
        this.acctNo = str;
        this.name = str2;
        this.ccy = str3;
        this.availableAmount = bigDecimal;
        this.mainAcctKey = j2;
        this.realAmount = bigDecimal2;
        this.isDefault = yesNoApiEntity;
        this.attachmentId = str4;
        this.hasDeposit = z3;
        this.attachmentUrl = str5;
        this.subAccounts = list;
        this.productCode = str6;
        this.externalFile = transferExternalFileApiEntity;
        this.externalIcon = transferExternalFileApiEntity2;
        this.cardExternalFile = transferExternalFileApiEntity3;
    }

    public static /* synthetic */ TransferAccountItemApiEntity copy$default(TransferAccountItemApiEntity transferAccountItemApiEntity, boolean z, boolean z2, long j, String str, String str2, String str3, BigDecimal bigDecimal, long j2, BigDecimal bigDecimal2, YesNoApiEntity yesNoApiEntity, String str4, boolean z3, String str5, List list, String str6, TransferExternalFileApiEntity transferExternalFileApiEntity, TransferExternalFileApiEntity transferExternalFileApiEntity2, TransferExternalFileApiEntity transferExternalFileApiEntity3, int i, Object obj) {
        TransferAccountItemApiEntity transferAccountItemApiEntity2 = transferAccountItemApiEntity;
        int i2 = i;
        return transferAccountItemApiEntity.copy((i2 & 1) != 0 ? transferAccountItemApiEntity2.isCreditCard : z, (i2 & 2) != 0 ? transferAccountItemApiEntity2.isForCreditSTO : z2, (i2 & 4) != 0 ? transferAccountItemApiEntity2.f56459id : j, (i2 & 8) != 0 ? transferAccountItemApiEntity2.acctNo : str, (i2 & 16) != 0 ? transferAccountItemApiEntity2.name : str2, (i2 & 32) != 0 ? transferAccountItemApiEntity2.ccy : str3, (i2 & 64) != 0 ? transferAccountItemApiEntity2.availableAmount : bigDecimal, (i2 & 128) != 0 ? transferAccountItemApiEntity2.mainAcctKey : j2, (i2 & C11398b.f33139r) != 0 ? transferAccountItemApiEntity2.realAmount : bigDecimal2, (i2 & C11398b.f33140s) != 0 ? transferAccountItemApiEntity2.isDefault : yesNoApiEntity, (i2 & C11398b.f33141t) != 0 ? transferAccountItemApiEntity2.attachmentId : str4, (i2 & C11398b.f33142u) != 0 ? transferAccountItemApiEntity2.hasDeposit : z3, (i2 & C11398b.f33143v) != 0 ? transferAccountItemApiEntity2.attachmentUrl : str5, (i2 & 8192) != 0 ? transferAccountItemApiEntity2.subAccounts : list, (i2 & 16384) != 0 ? transferAccountItemApiEntity2.productCode : str6, (i2 & 32768) != 0 ? transferAccountItemApiEntity2.externalFile : transferExternalFileApiEntity, (i2 & 65536) != 0 ? transferAccountItemApiEntity2.externalIcon : transferExternalFileApiEntity2, (i2 & 131072) != 0 ? transferAccountItemApiEntity2.cardExternalFile : transferExternalFileApiEntity3);
    }

    public final boolean component1() {
        return this.isCreditCard;
    }

    public final YesNoApiEntity component10() {
        return this.isDefault;
    }

    public final String component11() {
        return this.attachmentId;
    }

    public final boolean component12() {
        return this.hasDeposit;
    }

    public final String component13() {
        return this.attachmentUrl;
    }

    public final List<TransferAccountItemApiEntity> component14() {
        return this.subAccounts;
    }

    public final String component15() {
        return this.productCode;
    }

    public final TransferExternalFileApiEntity component16() {
        return this.externalFile;
    }

    public final TransferExternalFileApiEntity component17() {
        return this.externalIcon;
    }

    public final TransferExternalFileApiEntity component18() {
        return this.cardExternalFile;
    }

    public final boolean component2() {
        return this.isForCreditSTO;
    }

    public final long component3() {
        return this.f56459id;
    }

    public final String component4() {
        return this.acctNo;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.ccy;
    }

    public final BigDecimal component7() {
        return this.availableAmount;
    }

    public final long component8() {
        return this.mainAcctKey;
    }

    public final BigDecimal component9() {
        return this.realAmount;
    }

    public final TransferAccountItemApiEntity copy(boolean z, boolean z2, long j, String str, String str2, String str3, BigDecimal bigDecimal, long j2, BigDecimal bigDecimal2, YesNoApiEntity yesNoApiEntity, String str4, boolean z3, String str5, List<TransferAccountItemApiEntity> list, String str6, TransferExternalFileApiEntity transferExternalFileApiEntity, TransferExternalFileApiEntity transferExternalFileApiEntity2, TransferExternalFileApiEntity transferExternalFileApiEntity3) {
        boolean z4 = z;
        C41536l.m120489i(bigDecimal, "availableAmount");
        return new TransferAccountItemApiEntity(z, z2, j, str, str2, str3, bigDecimal, j2, bigDecimal2, yesNoApiEntity, str4, z3, str5, list, str6, transferExternalFileApiEntity, transferExternalFileApiEntity2, transferExternalFileApiEntity3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferAccountItemApiEntity)) {
            return false;
        }
        TransferAccountItemApiEntity transferAccountItemApiEntity = (TransferAccountItemApiEntity) obj;
        return this.isCreditCard == transferAccountItemApiEntity.isCreditCard && this.isForCreditSTO == transferAccountItemApiEntity.isForCreditSTO && this.f56459id == transferAccountItemApiEntity.f56459id && C41536l.m120484d(this.acctNo, transferAccountItemApiEntity.acctNo) && C41536l.m120484d(this.name, transferAccountItemApiEntity.name) && C41536l.m120484d(this.ccy, transferAccountItemApiEntity.ccy) && C41536l.m120484d(this.availableAmount, transferAccountItemApiEntity.availableAmount) && this.mainAcctKey == transferAccountItemApiEntity.mainAcctKey && C41536l.m120484d(this.realAmount, transferAccountItemApiEntity.realAmount) && this.isDefault == transferAccountItemApiEntity.isDefault && C41536l.m120484d(this.attachmentId, transferAccountItemApiEntity.attachmentId) && this.hasDeposit == transferAccountItemApiEntity.hasDeposit && C41536l.m120484d(this.attachmentUrl, transferAccountItemApiEntity.attachmentUrl) && C41536l.m120484d(this.subAccounts, transferAccountItemApiEntity.subAccounts) && C41536l.m120484d(this.productCode, transferAccountItemApiEntity.productCode) && C41536l.m120484d(this.externalFile, transferAccountItemApiEntity.externalFile) && C41536l.m120484d(this.externalIcon, transferAccountItemApiEntity.externalIcon) && C41536l.m120484d(this.cardExternalFile, transferAccountItemApiEntity.cardExternalFile);
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final String getAttachmentId() {
        return this.attachmentId;
    }

    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final TransferExternalFileApiEntity getCardExternalFile() {
        return this.cardExternalFile;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final TransferExternalFileApiEntity getExternalFile() {
        return this.externalFile;
    }

    public final TransferExternalFileApiEntity getExternalIcon() {
        return this.externalIcon;
    }

    public final boolean getHasDeposit() {
        return this.hasDeposit;
    }

    public final long getId() {
        return this.f56459id;
    }

    public final long getMainAcctKey() {
        return this.mainAcctKey;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final BigDecimal getRealAmount() {
        return this.realAmount;
    }

    public final List<TransferAccountItemApiEntity> getSubAccounts() {
        return this.subAccounts;
    }

    public int hashCode() {
        boolean z = this.isCreditCard;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.isForCreditSTO;
        if (z3) {
            z3 = true;
        }
        int a = (((i + (z3 ? 1 : 0)) * 31) + C7397t.m28148a(this.f56459id)) * 31;
        String str = this.acctNo;
        int i2 = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ccy;
        int hashCode3 = (((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.availableAmount.hashCode()) * 31) + C7397t.m28148a(this.mainAcctKey)) * 31;
        BigDecimal bigDecimal = this.realAmount;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.isDefault;
        int hashCode5 = (hashCode4 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        String str4 = this.attachmentId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z4 = this.hasDeposit;
        if (!z4) {
            z2 = z4;
        }
        int i3 = (hashCode6 + (z2 ? 1 : 0)) * 31;
        String str5 = this.attachmentUrl;
        int hashCode7 = (i3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<TransferAccountItemApiEntity> list = this.subAccounts;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.productCode;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        TransferExternalFileApiEntity transferExternalFileApiEntity = this.externalFile;
        int hashCode10 = (hashCode9 + (transferExternalFileApiEntity == null ? 0 : transferExternalFileApiEntity.hashCode())) * 31;
        TransferExternalFileApiEntity transferExternalFileApiEntity2 = this.externalIcon;
        int hashCode11 = (hashCode10 + (transferExternalFileApiEntity2 == null ? 0 : transferExternalFileApiEntity2.hashCode())) * 31;
        TransferExternalFileApiEntity transferExternalFileApiEntity3 = this.cardExternalFile;
        if (transferExternalFileApiEntity3 != null) {
            i2 = transferExternalFileApiEntity3.hashCode();
        }
        return hashCode11 + i2;
    }

    public final boolean isCreditCard() {
        return this.isCreditCard;
    }

    public final YesNoApiEntity isDefault() {
        return this.isDefault;
    }

    public final boolean isForCreditSTO() {
        return this.isForCreditSTO;
    }

    public String toString() {
        boolean z = this.isCreditCard;
        boolean z2 = this.isForCreditSTO;
        long j = this.f56459id;
        String str = this.acctNo;
        String str2 = this.name;
        String str3 = this.ccy;
        BigDecimal bigDecimal = this.availableAmount;
        long j2 = this.mainAcctKey;
        BigDecimal bigDecimal2 = this.realAmount;
        YesNoApiEntity yesNoApiEntity = this.isDefault;
        String str4 = this.attachmentId;
        boolean z3 = this.hasDeposit;
        String str5 = this.attachmentUrl;
        List<TransferAccountItemApiEntity> list = this.subAccounts;
        String str6 = this.productCode;
        TransferExternalFileApiEntity transferExternalFileApiEntity = this.externalFile;
        TransferExternalFileApiEntity transferExternalFileApiEntity2 = this.externalIcon;
        TransferExternalFileApiEntity transferExternalFileApiEntity3 = this.cardExternalFile;
        return "TransferAccountItemApiEntity(isCreditCard=" + z + ", isForCreditSTO=" + z2 + ", id=" + j + ", acctNo=" + str + ", name=" + str2 + ", ccy=" + str3 + ", availableAmount=" + bigDecimal + ", mainAcctKey=" + j2 + ", realAmount=" + bigDecimal2 + ", isDefault=" + yesNoApiEntity + ", attachmentId=" + str4 + ", hasDeposit=" + z3 + ", attachmentUrl=" + str5 + ", subAccounts=" + list + ", productCode=" + str6 + ", externalFile=" + transferExternalFileApiEntity + ", externalIcon=" + transferExternalFileApiEntity2 + ", cardExternalFile=" + transferExternalFileApiEntity3 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransferAccountItemApiEntity(boolean r25, boolean r26, long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.math.BigDecimal r32, long r33, java.math.BigDecimal r35, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r36, java.lang.String r37, boolean r38, java.lang.String r39, java.util.List r40, java.lang.String r41, p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferExternalFileApiEntity r42, p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferExternalFileApiEntity r43, p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferExternalFileApiEntity r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
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
            r15 = r3
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
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0070
            r19 = r3
            goto L_0x0072
        L_0x0070:
            r19 = r40
        L_0x0072:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0079
            r20 = r3
            goto L_0x007b
        L_0x0079:
            r20 = r41
        L_0x007b:
            r3 = r24
            r6 = r8
            r8 = r1
            r9 = r10
            r10 = r11
            r11 = r32
            r21 = r42
            r22 = r43
            r23 = r44
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountItemApiEntity.<init>(boolean, boolean, long, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, long, java.math.BigDecimal, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, java.lang.String, boolean, java.lang.String, java.util.List, java.lang.String, ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferExternalFileApiEntity, ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferExternalFileApiEntity, ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferExternalFileApiEntity, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
