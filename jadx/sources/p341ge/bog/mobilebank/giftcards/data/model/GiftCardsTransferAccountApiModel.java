package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiftCardsTransferAccountApiModel */
public final class GiftCardsTransferAccountApiModel {
    private final String acctNo;
    private final String attachmentId;
    private final String attachmentUrl;
    private final BigDecimal availableAmount;
    private final ExternalFileEntity cardExternalFile;
    private final String ccy;
    private final ExternalFileEntity externalFile;
    private final ExternalFileEntity externalIcon;
    private final Boolean hasDeposit;

    /* renamed from: id */
    private final long f62391id;
    private final YesNoApiEntity isDefault;
    private final YesNoApiEntity isScoolCardAccount;
    private final Long mainAcctKey;
    private final String name;
    private final String productCode;
    private final String productGroup;
    private final Long productId;
    private final BigDecimal realAmount;
    private final List<GiftCardsTransferAccountApiModel> subAccounts;
    private final String subProductCode;

    public GiftCardsTransferAccountApiModel(long j, String str, String str2, String str3, BigDecimal bigDecimal, ExternalFileEntity externalFileEntity, String str4, ExternalFileEntity externalFileEntity2, ExternalFileEntity externalFileEntity3, Boolean bool, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, Long l, String str5, String str6, String str7, Long l2, BigDecimal bigDecimal2, List<GiftCardsTransferAccountApiModel> list, String str8) {
        this.f62391id = j;
        this.acctNo = str;
        this.attachmentId = str2;
        this.attachmentUrl = str3;
        this.availableAmount = bigDecimal;
        this.cardExternalFile = externalFileEntity;
        this.ccy = str4;
        this.externalFile = externalFileEntity2;
        this.externalIcon = externalFileEntity3;
        this.hasDeposit = bool;
        this.isDefault = yesNoApiEntity;
        this.isScoolCardAccount = yesNoApiEntity2;
        this.mainAcctKey = l;
        this.name = str5;
        this.productCode = str6;
        this.productGroup = str7;
        this.productId = l2;
        this.realAmount = bigDecimal2;
        this.subAccounts = list;
        this.subProductCode = str8;
    }

    public static /* synthetic */ GiftCardsTransferAccountApiModel copy$default(GiftCardsTransferAccountApiModel giftCardsTransferAccountApiModel, long j, String str, String str2, String str3, BigDecimal bigDecimal, ExternalFileEntity externalFileEntity, String str4, ExternalFileEntity externalFileEntity2, ExternalFileEntity externalFileEntity3, Boolean bool, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, Long l, String str5, String str6, String str7, Long l2, BigDecimal bigDecimal2, List list, String str8, int i, Object obj) {
        GiftCardsTransferAccountApiModel giftCardsTransferAccountApiModel2 = giftCardsTransferAccountApiModel;
        int i2 = i;
        return giftCardsTransferAccountApiModel.copy((i2 & 1) != 0 ? giftCardsTransferAccountApiModel2.f62391id : j, (i2 & 2) != 0 ? giftCardsTransferAccountApiModel2.acctNo : str, (i2 & 4) != 0 ? giftCardsTransferAccountApiModel2.attachmentId : str2, (i2 & 8) != 0 ? giftCardsTransferAccountApiModel2.attachmentUrl : str3, (i2 & 16) != 0 ? giftCardsTransferAccountApiModel2.availableAmount : bigDecimal, (i2 & 32) != 0 ? giftCardsTransferAccountApiModel2.cardExternalFile : externalFileEntity, (i2 & 64) != 0 ? giftCardsTransferAccountApiModel2.ccy : str4, (i2 & 128) != 0 ? giftCardsTransferAccountApiModel2.externalFile : externalFileEntity2, (i2 & C11398b.f33139r) != 0 ? giftCardsTransferAccountApiModel2.externalIcon : externalFileEntity3, (i2 & C11398b.f33140s) != 0 ? giftCardsTransferAccountApiModel2.hasDeposit : bool, (i2 & C11398b.f33141t) != 0 ? giftCardsTransferAccountApiModel2.isDefault : yesNoApiEntity, (i2 & C11398b.f33142u) != 0 ? giftCardsTransferAccountApiModel2.isScoolCardAccount : yesNoApiEntity2, (i2 & C11398b.f33143v) != 0 ? giftCardsTransferAccountApiModel2.mainAcctKey : l, (i2 & 8192) != 0 ? giftCardsTransferAccountApiModel2.name : str5, (i2 & 16384) != 0 ? giftCardsTransferAccountApiModel2.productCode : str6, (i2 & 32768) != 0 ? giftCardsTransferAccountApiModel2.productGroup : str7, (i2 & 65536) != 0 ? giftCardsTransferAccountApiModel2.productId : l2, (i2 & 131072) != 0 ? giftCardsTransferAccountApiModel2.realAmount : bigDecimal2, (i2 & 262144) != 0 ? giftCardsTransferAccountApiModel2.subAccounts : list, (i2 & 524288) != 0 ? giftCardsTransferAccountApiModel2.subProductCode : str8);
    }

    public final long component1() {
        return this.f62391id;
    }

    public final Boolean component10() {
        return this.hasDeposit;
    }

    public final YesNoApiEntity component11() {
        return this.isDefault;
    }

    public final YesNoApiEntity component12() {
        return this.isScoolCardAccount;
    }

    public final Long component13() {
        return this.mainAcctKey;
    }

    public final String component14() {
        return this.name;
    }

    public final String component15() {
        return this.productCode;
    }

    public final String component16() {
        return this.productGroup;
    }

    public final Long component17() {
        return this.productId;
    }

    public final BigDecimal component18() {
        return this.realAmount;
    }

    public final List<GiftCardsTransferAccountApiModel> component19() {
        return this.subAccounts;
    }

    public final String component2() {
        return this.acctNo;
    }

    public final String component20() {
        return this.subProductCode;
    }

    public final String component3() {
        return this.attachmentId;
    }

    public final String component4() {
        return this.attachmentUrl;
    }

    public final BigDecimal component5() {
        return this.availableAmount;
    }

    public final ExternalFileEntity component6() {
        return this.cardExternalFile;
    }

    public final String component7() {
        return this.ccy;
    }

    public final ExternalFileEntity component8() {
        return this.externalFile;
    }

    public final ExternalFileEntity component9() {
        return this.externalIcon;
    }

    public final GiftCardsTransferAccountApiModel copy(long j, String str, String str2, String str3, BigDecimal bigDecimal, ExternalFileEntity externalFileEntity, String str4, ExternalFileEntity externalFileEntity2, ExternalFileEntity externalFileEntity3, Boolean bool, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, Long l, String str5, String str6, String str7, Long l2, BigDecimal bigDecimal2, List<GiftCardsTransferAccountApiModel> list, String str8) {
        return new GiftCardsTransferAccountApiModel(j, str, str2, str3, bigDecimal, externalFileEntity, str4, externalFileEntity2, externalFileEntity3, bool, yesNoApiEntity, yesNoApiEntity2, l, str5, str6, str7, l2, bigDecimal2, list, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardsTransferAccountApiModel)) {
            return false;
        }
        GiftCardsTransferAccountApiModel giftCardsTransferAccountApiModel = (GiftCardsTransferAccountApiModel) obj;
        return this.f62391id == giftCardsTransferAccountApiModel.f62391id && C41536l.m120484d(this.acctNo, giftCardsTransferAccountApiModel.acctNo) && C41536l.m120484d(this.attachmentId, giftCardsTransferAccountApiModel.attachmentId) && C41536l.m120484d(this.attachmentUrl, giftCardsTransferAccountApiModel.attachmentUrl) && C41536l.m120484d(this.availableAmount, giftCardsTransferAccountApiModel.availableAmount) && C41536l.m120484d(this.cardExternalFile, giftCardsTransferAccountApiModel.cardExternalFile) && C41536l.m120484d(this.ccy, giftCardsTransferAccountApiModel.ccy) && C41536l.m120484d(this.externalFile, giftCardsTransferAccountApiModel.externalFile) && C41536l.m120484d(this.externalIcon, giftCardsTransferAccountApiModel.externalIcon) && C41536l.m120484d(this.hasDeposit, giftCardsTransferAccountApiModel.hasDeposit) && this.isDefault == giftCardsTransferAccountApiModel.isDefault && this.isScoolCardAccount == giftCardsTransferAccountApiModel.isScoolCardAccount && C41536l.m120484d(this.mainAcctKey, giftCardsTransferAccountApiModel.mainAcctKey) && C41536l.m120484d(this.name, giftCardsTransferAccountApiModel.name) && C41536l.m120484d(this.productCode, giftCardsTransferAccountApiModel.productCode) && C41536l.m120484d(this.productGroup, giftCardsTransferAccountApiModel.productGroup) && C41536l.m120484d(this.productId, giftCardsTransferAccountApiModel.productId) && C41536l.m120484d(this.realAmount, giftCardsTransferAccountApiModel.realAmount) && C41536l.m120484d(this.subAccounts, giftCardsTransferAccountApiModel.subAccounts) && C41536l.m120484d(this.subProductCode, giftCardsTransferAccountApiModel.subProductCode);
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

    public final ExternalFileEntity getCardExternalFile() {
        return this.cardExternalFile;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final ExternalFileEntity getExternalFile() {
        return this.externalFile;
    }

    public final ExternalFileEntity getExternalIcon() {
        return this.externalIcon;
    }

    public final Boolean getHasDeposit() {
        return this.hasDeposit;
    }

    public final long getId() {
        return this.f62391id;
    }

    public final Long getMainAcctKey() {
        return this.mainAcctKey;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductGroup() {
        return this.productGroup;
    }

    public final Long getProductId() {
        return this.productId;
    }

    public final BigDecimal getRealAmount() {
        return this.realAmount;
    }

    public final List<GiftCardsTransferAccountApiModel> getSubAccounts() {
        return this.subAccounts;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f62391id) * 31;
        String str = this.acctNo;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.attachmentId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.attachmentUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.availableAmount;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        ExternalFileEntity externalFileEntity = this.cardExternalFile;
        int hashCode5 = (hashCode4 + (externalFileEntity == null ? 0 : externalFileEntity.hashCode())) * 31;
        String str4 = this.ccy;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ExternalFileEntity externalFileEntity2 = this.externalFile;
        int hashCode7 = (hashCode6 + (externalFileEntity2 == null ? 0 : externalFileEntity2.hashCode())) * 31;
        ExternalFileEntity externalFileEntity3 = this.externalIcon;
        int hashCode8 = (hashCode7 + (externalFileEntity3 == null ? 0 : externalFileEntity3.hashCode())) * 31;
        Boolean bool = this.hasDeposit;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.isDefault;
        int hashCode10 = (hashCode9 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.isScoolCardAccount;
        int hashCode11 = (hashCode10 + (yesNoApiEntity2 == null ? 0 : yesNoApiEntity2.hashCode())) * 31;
        Long l = this.mainAcctKey;
        int hashCode12 = (hashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.name;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.productCode;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.productGroup;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.productId;
        int hashCode16 = (hashCode15 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.realAmount;
        int hashCode17 = (hashCode16 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        List<GiftCardsTransferAccountApiModel> list = this.subAccounts;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.subProductCode;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode18 + i;
    }

    public final YesNoApiEntity isDefault() {
        return this.isDefault;
    }

    public final YesNoApiEntity isScoolCardAccount() {
        return this.isScoolCardAccount;
    }

    public String toString() {
        long j = this.f62391id;
        String str = this.acctNo;
        String str2 = this.attachmentId;
        String str3 = this.attachmentUrl;
        BigDecimal bigDecimal = this.availableAmount;
        ExternalFileEntity externalFileEntity = this.cardExternalFile;
        String str4 = this.ccy;
        ExternalFileEntity externalFileEntity2 = this.externalFile;
        ExternalFileEntity externalFileEntity3 = this.externalIcon;
        Boolean bool = this.hasDeposit;
        YesNoApiEntity yesNoApiEntity = this.isDefault;
        YesNoApiEntity yesNoApiEntity2 = this.isScoolCardAccount;
        Long l = this.mainAcctKey;
        String str5 = this.name;
        String str6 = this.productCode;
        String str7 = this.productGroup;
        Long l2 = this.productId;
        BigDecimal bigDecimal2 = this.realAmount;
        List<GiftCardsTransferAccountApiModel> list = this.subAccounts;
        String str8 = this.subProductCode;
        return "GiftCardsTransferAccountApiModel(id=" + j + ", acctNo=" + str + ", attachmentId=" + str2 + ", attachmentUrl=" + str3 + ", availableAmount=" + bigDecimal + ", cardExternalFile=" + externalFileEntity + ", ccy=" + str4 + ", externalFile=" + externalFileEntity2 + ", externalIcon=" + externalFileEntity3 + ", hasDeposit=" + bool + ", isDefault=" + yesNoApiEntity + ", isScoolCardAccount=" + yesNoApiEntity2 + ", mainAcctKey=" + l + ", name=" + str5 + ", productCode=" + str6 + ", productGroup=" + str7 + ", productId=" + l2 + ", realAmount=" + bigDecimal2 + ", subAccounts=" + list + ", subProductCode=" + str8 + ")";
    }
}
