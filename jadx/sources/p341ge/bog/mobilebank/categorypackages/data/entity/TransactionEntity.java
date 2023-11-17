package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.TransactionEntity */
public final class TransactionEntity {
    private final String acctNo;
    private final BigDecimal amount;
    private final String ccy;
    private final Object docKey;
    private final Long inpSysdate;
    private final String lastFour;
    private final String nomination;
    private final Long packageId;
    private final String postDate;
    private final String prodGroup;
    private final String prodGroupDesc;
    private final String tranStatus;

    public TransactionEntity(String str, BigDecimal bigDecimal, String str2, Object obj, Long l, String str3, String str4, Long l2, String str5, String str6, String str7, String str8) {
        this.acctNo = str;
        this.amount = bigDecimal;
        this.ccy = str2;
        this.docKey = obj;
        this.inpSysdate = l;
        this.lastFour = str3;
        this.nomination = str4;
        this.packageId = l2;
        this.postDate = str5;
        this.prodGroup = str6;
        this.prodGroupDesc = str7;
        this.tranStatus = str8;
    }

    public static /* synthetic */ TransactionEntity copy$default(TransactionEntity transactionEntity, String str, BigDecimal bigDecimal, String str2, Object obj, Long l, String str3, String str4, Long l2, String str5, String str6, String str7, String str8, int i, Object obj2) {
        TransactionEntity transactionEntity2 = transactionEntity;
        int i2 = i;
        return transactionEntity.copy((i2 & 1) != 0 ? transactionEntity2.acctNo : str, (i2 & 2) != 0 ? transactionEntity2.amount : bigDecimal, (i2 & 4) != 0 ? transactionEntity2.ccy : str2, (i2 & 8) != 0 ? transactionEntity2.docKey : obj, (i2 & 16) != 0 ? transactionEntity2.inpSysdate : l, (i2 & 32) != 0 ? transactionEntity2.lastFour : str3, (i2 & 64) != 0 ? transactionEntity2.nomination : str4, (i2 & 128) != 0 ? transactionEntity2.packageId : l2, (i2 & C11398b.f33139r) != 0 ? transactionEntity2.postDate : str5, (i2 & C11398b.f33140s) != 0 ? transactionEntity2.prodGroup : str6, (i2 & C11398b.f33141t) != 0 ? transactionEntity2.prodGroupDesc : str7, (i2 & C11398b.f33142u) != 0 ? transactionEntity2.tranStatus : str8);
    }

    public final String component1() {
        return this.acctNo;
    }

    public final String component10() {
        return this.prodGroup;
    }

    public final String component11() {
        return this.prodGroupDesc;
    }

    public final String component12() {
        return this.tranStatus;
    }

    public final BigDecimal component2() {
        return this.amount;
    }

    public final String component3() {
        return this.ccy;
    }

    public final Object component4() {
        return this.docKey;
    }

    public final Long component5() {
        return this.inpSysdate;
    }

    public final String component6() {
        return this.lastFour;
    }

    public final String component7() {
        return this.nomination;
    }

    public final Long component8() {
        return this.packageId;
    }

    public final String component9() {
        return this.postDate;
    }

    public final TransactionEntity copy(String str, BigDecimal bigDecimal, String str2, Object obj, Long l, String str3, String str4, Long l2, String str5, String str6, String str7, String str8) {
        return new TransactionEntity(str, bigDecimal, str2, obj, l, str3, str4, l2, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionEntity)) {
            return false;
        }
        TransactionEntity transactionEntity = (TransactionEntity) obj;
        return C41536l.m120484d(this.acctNo, transactionEntity.acctNo) && C41536l.m120484d(this.amount, transactionEntity.amount) && C41536l.m120484d(this.ccy, transactionEntity.ccy) && C41536l.m120484d(this.docKey, transactionEntity.docKey) && C41536l.m120484d(this.inpSysdate, transactionEntity.inpSysdate) && C41536l.m120484d(this.lastFour, transactionEntity.lastFour) && C41536l.m120484d(this.nomination, transactionEntity.nomination) && C41536l.m120484d(this.packageId, transactionEntity.packageId) && C41536l.m120484d(this.postDate, transactionEntity.postDate) && C41536l.m120484d(this.prodGroup, transactionEntity.prodGroup) && C41536l.m120484d(this.prodGroupDesc, transactionEntity.prodGroupDesc) && C41536l.m120484d(this.tranStatus, transactionEntity.tranStatus);
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Object getDocKey() {
        return this.docKey;
    }

    public final Long getInpSysdate() {
        return this.inpSysdate;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getNomination() {
        return this.nomination;
    }

    public final Long getPackageId() {
        return this.packageId;
    }

    public final String getPostDate() {
        return this.postDate;
    }

    public final String getProdGroup() {
        return this.prodGroup;
    }

    public final String getProdGroupDesc() {
        return this.prodGroupDesc;
    }

    public final String getTranStatus() {
        return this.tranStatus;
    }

    public int hashCode() {
        String str = this.acctNo;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.amount;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.ccy;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.docKey;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l = this.inpSysdate;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.lastFour;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nomination;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.packageId;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.postDate;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.prodGroup;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.prodGroupDesc;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tranStatus;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        String str = this.acctNo;
        BigDecimal bigDecimal = this.amount;
        String str2 = this.ccy;
        Object obj = this.docKey;
        Long l = this.inpSysdate;
        String str3 = this.lastFour;
        String str4 = this.nomination;
        Long l2 = this.packageId;
        String str5 = this.postDate;
        String str6 = this.prodGroup;
        String str7 = this.prodGroupDesc;
        String str8 = this.tranStatus;
        return "TransactionEntity(acctNo=" + str + ", amount=" + bigDecimal + ", ccy=" + str2 + ", docKey=" + obj + ", inpSysdate=" + l + ", lastFour=" + str3 + ", nomination=" + str4 + ", packageId=" + l2 + ", postDate=" + str5 + ", prodGroup=" + str6 + ", prodGroupDesc=" + str7 + ", tranStatus=" + str8 + ")";
    }
}
