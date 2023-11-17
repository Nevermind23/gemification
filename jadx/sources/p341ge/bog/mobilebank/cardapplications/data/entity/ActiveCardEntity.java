package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.ActiveCardEntity */
public final class ActiveCardEntity {
    private final long acctKey;
    private final String acctNo;
    private final CardExternalFileEntity cardExternalFile;
    private final long cardForTypeDescKeyId;
    private final long cardId;
    private final String cardNameKey;
    private final String cardNameValue;
    private final long clientKey;
    private final long expDate;

    /* renamed from: id */
    private final long f41303id;
    private final String lastFour;
    private final String subProductCode;

    public ActiveCardEntity(long j, long j2, String str, long j3, String str2, long j4, long j5, long j6, String str3, String str4, String str5, CardExternalFileEntity cardExternalFileEntity) {
        String str6 = str3;
        C41536l.m120489i(str, "lastFour");
        C41536l.m120489i(str2, "acctNo");
        C41536l.m120489i(str6, "subProductCode");
        this.f41303id = j;
        this.cardForTypeDescKeyId = j2;
        this.lastFour = str;
        this.expDate = j3;
        this.acctNo = str2;
        this.acctKey = j4;
        this.clientKey = j5;
        this.cardId = j6;
        this.subProductCode = str6;
        this.cardNameKey = str4;
        this.cardNameValue = str5;
        this.cardExternalFile = cardExternalFileEntity;
    }

    public static /* synthetic */ ActiveCardEntity copy$default(ActiveCardEntity activeCardEntity, long j, long j2, String str, long j3, String str2, long j4, long j5, long j6, String str3, String str4, String str5, CardExternalFileEntity cardExternalFileEntity, int i, Object obj) {
        ActiveCardEntity activeCardEntity2 = activeCardEntity;
        int i2 = i;
        return activeCardEntity.copy((i2 & 1) != 0 ? activeCardEntity2.f41303id : j, (i2 & 2) != 0 ? activeCardEntity2.cardForTypeDescKeyId : j2, (i2 & 4) != 0 ? activeCardEntity2.lastFour : str, (i2 & 8) != 0 ? activeCardEntity2.expDate : j3, (i2 & 16) != 0 ? activeCardEntity2.acctNo : str2, (i2 & 32) != 0 ? activeCardEntity2.acctKey : j4, (i2 & 64) != 0 ? activeCardEntity2.clientKey : j5, (i2 & 128) != 0 ? activeCardEntity2.cardId : j6, (i2 & C11398b.f33139r) != 0 ? activeCardEntity2.subProductCode : str3, (i2 & C11398b.f33140s) != 0 ? activeCardEntity2.cardNameKey : str4, (i2 & C11398b.f33141t) != 0 ? activeCardEntity2.cardNameValue : str5, (i2 & C11398b.f33142u) != 0 ? activeCardEntity2.cardExternalFile : cardExternalFileEntity);
    }

    public final long component1() {
        return this.f41303id;
    }

    public final String component10() {
        return this.cardNameKey;
    }

    public final String component11() {
        return this.cardNameValue;
    }

    public final CardExternalFileEntity component12() {
        return this.cardExternalFile;
    }

    public final long component2() {
        return this.cardForTypeDescKeyId;
    }

    public final String component3() {
        return this.lastFour;
    }

    public final long component4() {
        return this.expDate;
    }

    public final String component5() {
        return this.acctNo;
    }

    public final long component6() {
        return this.acctKey;
    }

    public final long component7() {
        return this.clientKey;
    }

    public final long component8() {
        return this.cardId;
    }

    public final String component9() {
        return this.subProductCode;
    }

    public final ActiveCardEntity copy(long j, long j2, String str, long j3, String str2, long j4, long j5, long j6, String str3, String str4, String str5, CardExternalFileEntity cardExternalFileEntity) {
        long j7 = j;
        C41536l.m120489i(str, "lastFour");
        C41536l.m120489i(str2, "acctNo");
        C41536l.m120489i(str3, "subProductCode");
        return new ActiveCardEntity(j, j2, str, j3, str2, j4, j5, j6, str3, str4, str5, cardExternalFileEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveCardEntity)) {
            return false;
        }
        ActiveCardEntity activeCardEntity = (ActiveCardEntity) obj;
        return this.f41303id == activeCardEntity.f41303id && this.cardForTypeDescKeyId == activeCardEntity.cardForTypeDescKeyId && C41536l.m120484d(this.lastFour, activeCardEntity.lastFour) && this.expDate == activeCardEntity.expDate && C41536l.m120484d(this.acctNo, activeCardEntity.acctNo) && this.acctKey == activeCardEntity.acctKey && this.clientKey == activeCardEntity.clientKey && this.cardId == activeCardEntity.cardId && C41536l.m120484d(this.subProductCode, activeCardEntity.subProductCode) && C41536l.m120484d(this.cardNameKey, activeCardEntity.cardNameKey) && C41536l.m120484d(this.cardNameValue, activeCardEntity.cardNameValue) && C41536l.m120484d(this.cardExternalFile, activeCardEntity.cardExternalFile);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final CardExternalFileEntity getCardExternalFile() {
        return this.cardExternalFile;
    }

    public final long getCardForTypeDescKeyId() {
        return this.cardForTypeDescKeyId;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final String getCardNameKey() {
        return this.cardNameKey;
    }

    public final String getCardNameValue() {
        return this.cardNameValue;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final long getExpDate() {
        return this.expDate;
    }

    public final long getId() {
        return this.f41303id;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        int a = ((((((((((((((((C7397t.m28148a(this.f41303id) * 31) + C7397t.m28148a(this.cardForTypeDescKeyId)) * 31) + this.lastFour.hashCode()) * 31) + C7397t.m28148a(this.expDate)) * 31) + this.acctNo.hashCode()) * 31) + C7397t.m28148a(this.acctKey)) * 31) + C7397t.m28148a(this.clientKey)) * 31) + C7397t.m28148a(this.cardId)) * 31) + this.subProductCode.hashCode()) * 31;
        String str = this.cardNameKey;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardNameValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CardExternalFileEntity cardExternalFileEntity = this.cardExternalFile;
        if (cardExternalFileEntity != null) {
            i = cardExternalFileEntity.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.f41303id;
        long j2 = this.cardForTypeDescKeyId;
        String str = this.lastFour;
        long j3 = this.expDate;
        String str2 = this.acctNo;
        long j4 = this.acctKey;
        long j5 = this.clientKey;
        long j6 = this.cardId;
        String str3 = this.subProductCode;
        String str4 = this.cardNameKey;
        String str5 = this.cardNameValue;
        CardExternalFileEntity cardExternalFileEntity = this.cardExternalFile;
        return "ActiveCardEntity(id=" + j + ", cardForTypeDescKeyId=" + j2 + ", lastFour=" + str + ", expDate=" + j3 + ", acctNo=" + str2 + ", acctKey=" + j4 + ", clientKey=" + j5 + ", cardId=" + j6 + ", subProductCode=" + str3 + ", cardNameKey=" + str4 + ", cardNameValue=" + str5 + ", cardExternalFile=" + cardExternalFileEntity + ")";
    }
}
