package p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import hd0.C24978b;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionApiEntity */
public final class TransactionApiEntity {
    private final String amount;
    private final String amountBase;
    private final String bonusInfo;
    private final Double bonusPoint;
    private final String bonusType;
    private final String canCopy;
    private final Boolean canSplit;
    private final String ccy;
    private final String clientKey;
    private final Long counterPartyClient;
    private final String deviceType;
    private final Long docKey;
    private final String entryGroupDValue;
    private final String entryGroupNameId;
    private final String entryId;
    private final String entryType;
    private final String essId;
    private final String essServiceId;
    private final String groupImageId;
    private final Long groupImageIdSolo;
    private final Long groupImageIdWm;
    private final C24978b hasTransferBack;
    private final Boolean isDDSTOAlllowed;
    private final String isInternalOperation;
    private final Boolean isRepeatAllowed;
    private final Boolean isStatementAllowed;
    private final Boolean isTemplateAllowed;
    private final String language;
    private final String merchantId;
    private final String merchantName;
    private final String merchantNameInt;
    private final String nomination;
    private final String nominationOriginal;
    private final String operationDate;
    private final String operationTitle;
    private final String oppositeAmount;
    private final Long pfmCatId;
    private final String pfmCatName;
    private final Integer pfmComputable;
    private final String pfmForecast;
    private final Long pfmId;
    private final Long pfmParentCatId;
    private final String pfmParentCatName;
    private final Long pfmParentOpId;
    private final String pfmRecurring;
    private final String pfmSplit;
    private final Long pfmTagId;
    private final String pfmTagName;
    private final String postDate;
    private final String printForm;
    private final String printFormType;
    private final String printSwift;
    private final String prodGroup;
    private final ArrayList<String> sort;
    private final String sourceEntryGroup;
    private final String status;

    public TransactionApiEntity() {
        this((String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C24978b) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (Integer) null, (Long) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (Long) null, (Long) null, (Long) null, -1, 16777215, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TransactionApiEntity copy$default(TransactionApiEntity transactionApiEntity, String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, C24978b bVar, String str21, String str22, String str23, String str24, ArrayList arrayList, Boolean bool, Boolean bool2, String str25, String str26, Long l2, Long l3, String str27, Integer num, Long l4, String str28, String str29, String str30, Boolean bool3, Boolean bool4, Boolean bool5, Double d, String str31, String str32, String str33, String str34, String str35, String str36, Long l5, Long l6, String str37, String str38, Long l7, Long l8, Long l9, int i, int i2, Object obj) {
        TransactionApiEntity transactionApiEntity2 = transactionApiEntity;
        int i3 = i;
        int i4 = i2;
        return transactionApiEntity.copy((i3 & 1) != 0 ? transactionApiEntity2.entryId : str, (i3 & 2) != 0 ? transactionApiEntity2.docKey : l, (i3 & 4) != 0 ? transactionApiEntity2.clientKey : str2, (i3 & 8) != 0 ? transactionApiEntity2.language : str3, (i3 & 16) != 0 ? transactionApiEntity2.sourceEntryGroup : str4, (i3 & 32) != 0 ? transactionApiEntity2.nomination : str5, (i3 & 64) != 0 ? transactionApiEntity2.postDate : str6, (i3 & 128) != 0 ? transactionApiEntity2.operationDate : str7, (i3 & C11398b.f33139r) != 0 ? transactionApiEntity2.amount : str8, (i3 & C11398b.f33140s) != 0 ? transactionApiEntity2.oppositeAmount : str9, (i3 & C11398b.f33141t) != 0 ? transactionApiEntity2.ccy : str10, (i3 & C11398b.f33142u) != 0 ? transactionApiEntity2.canCopy : str11, (i3 & C11398b.f33143v) != 0 ? transactionApiEntity2.status : str12, (i3 & 8192) != 0 ? transactionApiEntity2.amountBase : str13, (i3 & 16384) != 0 ? transactionApiEntity2.nominationOriginal : str14, (i3 & 32768) != 0 ? transactionApiEntity2.prodGroup : str15, (i3 & 65536) != 0 ? transactionApiEntity2.entryType : str16, (i3 & 131072) != 0 ? transactionApiEntity2.printSwift : str17, (i3 & 262144) != 0 ? transactionApiEntity2.isInternalOperation : str18, (i3 & 524288) != 0 ? transactionApiEntity2.entryGroupNameId : str19, (i3 & 1048576) != 0 ? transactionApiEntity2.groupImageId : str20, (i3 & 2097152) != 0 ? transactionApiEntity2.hasTransferBack : bVar, (i3 & 4194304) != 0 ? transactionApiEntity2.printFormType : str21, (i3 & 8388608) != 0 ? transactionApiEntity2.printForm : str22, (i3 & 16777216) != 0 ? transactionApiEntity2.entryGroupDValue : str23, (i3 & 33554432) != 0 ? transactionApiEntity2.operationTitle : str24, (i3 & 67108864) != 0 ? transactionApiEntity2.sort : arrayList, (i3 & 134217728) != 0 ? transactionApiEntity2.isStatementAllowed : bool, (i3 & 268435456) != 0 ? transactionApiEntity2.canSplit : bool2, (i3 & 536870912) != 0 ? transactionApiEntity2.essId : str25, (i3 & 1073741824) != 0 ? transactionApiEntity2.bonusInfo : str26, (i3 & Integer.MIN_VALUE) != 0 ? transactionApiEntity2.pfmId : l2, (i4 & 1) != 0 ? transactionApiEntity2.pfmCatId : l3, (i4 & 2) != 0 ? transactionApiEntity2.pfmCatName : str27, (i4 & 4) != 0 ? transactionApiEntity2.pfmComputable : num, (i4 & 8) != 0 ? transactionApiEntity2.pfmParentCatId : l4, (i4 & 16) != 0 ? transactionApiEntity2.pfmSplit : str28, (i4 & 32) != 0 ? transactionApiEntity2.essServiceId : str29, (i4 & 64) != 0 ? transactionApiEntity2.bonusType : str30, (i4 & 128) != 0 ? transactionApiEntity2.isRepeatAllowed : bool3, (i4 & C11398b.f33139r) != 0 ? transactionApiEntity2.isTemplateAllowed : bool4, (i4 & C11398b.f33140s) != 0 ? transactionApiEntity2.isDDSTOAlllowed : bool5, (i4 & C11398b.f33141t) != 0 ? transactionApiEntity2.bonusPoint : d, (i4 & C11398b.f33142u) != 0 ? transactionApiEntity2.deviceType : str31, (i4 & C11398b.f33143v) != 0 ? transactionApiEntity2.merchantName : str32, (i4 & 8192) != 0 ? transactionApiEntity2.merchantNameInt : str33, (i4 & 16384) != 0 ? transactionApiEntity2.pfmForecast : str34, (i4 & 32768) != 0 ? transactionApiEntity2.pfmParentCatName : str35, (i4 & 65536) != 0 ? transactionApiEntity2.pfmRecurring : str36, (i4 & 131072) != 0 ? transactionApiEntity2.pfmParentOpId : l5, (i4 & 262144) != 0 ? transactionApiEntity2.pfmTagId : l6, (i4 & 524288) != 0 ? transactionApiEntity2.pfmTagName : str37, (i4 & 1048576) != 0 ? transactionApiEntity2.merchantId : str38, (i4 & 2097152) != 0 ? transactionApiEntity2.counterPartyClient : l7, (i4 & 4194304) != 0 ? transactionApiEntity2.groupImageIdSolo : l8, (i4 & 8388608) != 0 ? transactionApiEntity2.groupImageIdWm : l9);
    }

    public final String component1() {
        return this.entryId;
    }

    public final String component10() {
        return this.oppositeAmount;
    }

    public final String component11() {
        return this.ccy;
    }

    public final String component12() {
        return this.canCopy;
    }

    public final String component13() {
        return this.status;
    }

    public final String component14() {
        return this.amountBase;
    }

    public final String component15() {
        return this.nominationOriginal;
    }

    public final String component16() {
        return this.prodGroup;
    }

    public final String component17() {
        return this.entryType;
    }

    public final String component18() {
        return this.printSwift;
    }

    public final String component19() {
        return this.isInternalOperation;
    }

    public final Long component2() {
        return this.docKey;
    }

    public final String component20() {
        return this.entryGroupNameId;
    }

    public final String component21() {
        return this.groupImageId;
    }

    public final C24978b component22() {
        return this.hasTransferBack;
    }

    public final String component23() {
        return this.printFormType;
    }

    public final String component24() {
        return this.printForm;
    }

    public final String component25() {
        return this.entryGroupDValue;
    }

    public final String component26() {
        return this.operationTitle;
    }

    public final ArrayList<String> component27() {
        return this.sort;
    }

    public final Boolean component28() {
        return this.isStatementAllowed;
    }

    public final Boolean component29() {
        return this.canSplit;
    }

    public final String component3() {
        return this.clientKey;
    }

    public final String component30() {
        return this.essId;
    }

    public final String component31() {
        return this.bonusInfo;
    }

    public final Long component32() {
        return this.pfmId;
    }

    public final Long component33() {
        return this.pfmCatId;
    }

    public final String component34() {
        return this.pfmCatName;
    }

    public final Integer component35() {
        return this.pfmComputable;
    }

    public final Long component36() {
        return this.pfmParentCatId;
    }

    public final String component37() {
        return this.pfmSplit;
    }

    public final String component38() {
        return this.essServiceId;
    }

    public final String component39() {
        return this.bonusType;
    }

    public final String component4() {
        return this.language;
    }

    public final Boolean component40() {
        return this.isRepeatAllowed;
    }

    public final Boolean component41() {
        return this.isTemplateAllowed;
    }

    public final Boolean component42() {
        return this.isDDSTOAlllowed;
    }

    public final Double component43() {
        return this.bonusPoint;
    }

    public final String component44() {
        return this.deviceType;
    }

    public final String component45() {
        return this.merchantName;
    }

    public final String component46() {
        return this.merchantNameInt;
    }

    public final String component47() {
        return this.pfmForecast;
    }

    public final String component48() {
        return this.pfmParentCatName;
    }

    public final String component49() {
        return this.pfmRecurring;
    }

    public final String component5() {
        return this.sourceEntryGroup;
    }

    public final Long component50() {
        return this.pfmParentOpId;
    }

    public final Long component51() {
        return this.pfmTagId;
    }

    public final String component52() {
        return this.pfmTagName;
    }

    public final String component53() {
        return this.merchantId;
    }

    public final Long component54() {
        return this.counterPartyClient;
    }

    public final Long component55() {
        return this.groupImageIdSolo;
    }

    public final Long component56() {
        return this.groupImageIdWm;
    }

    public final String component6() {
        return this.nomination;
    }

    public final String component7() {
        return this.postDate;
    }

    public final String component8() {
        return this.operationDate;
    }

    public final String component9() {
        return this.amount;
    }

    public final TransactionApiEntity copy(String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, C24978b bVar, String str21, String str22, String str23, String str24, ArrayList<String> arrayList, Boolean bool, Boolean bool2, String str25, String str26, Long l2, Long l3, String str27, Integer num, Long l4, String str28, String str29, String str30, Boolean bool3, Boolean bool4, Boolean bool5, Double d, String str31, String str32, String str33, String str34, String str35, String str36, Long l5, Long l6, String str37, String str38, Long l7, Long l8, Long l9) {
        String str39 = str;
        C41536l.m120489i(arrayList, "sort");
        return new TransactionApiEntity(str, l, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, bVar, str21, str22, str23, str24, arrayList, bool, bool2, str25, str26, l2, l3, str27, num, l4, str28, str29, str30, bool3, bool4, bool5, d, str31, str32, str33, str34, str35, str36, l5, l6, str37, str38, l7, l8, l9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionApiEntity)) {
            return false;
        }
        TransactionApiEntity transactionApiEntity = (TransactionApiEntity) obj;
        return C41536l.m120484d(this.entryId, transactionApiEntity.entryId) && C41536l.m120484d(this.docKey, transactionApiEntity.docKey) && C41536l.m120484d(this.clientKey, transactionApiEntity.clientKey) && C41536l.m120484d(this.language, transactionApiEntity.language) && C41536l.m120484d(this.sourceEntryGroup, transactionApiEntity.sourceEntryGroup) && C41536l.m120484d(this.nomination, transactionApiEntity.nomination) && C41536l.m120484d(this.postDate, transactionApiEntity.postDate) && C41536l.m120484d(this.operationDate, transactionApiEntity.operationDate) && C41536l.m120484d(this.amount, transactionApiEntity.amount) && C41536l.m120484d(this.oppositeAmount, transactionApiEntity.oppositeAmount) && C41536l.m120484d(this.ccy, transactionApiEntity.ccy) && C41536l.m120484d(this.canCopy, transactionApiEntity.canCopy) && C41536l.m120484d(this.status, transactionApiEntity.status) && C41536l.m120484d(this.amountBase, transactionApiEntity.amountBase) && C41536l.m120484d(this.nominationOriginal, transactionApiEntity.nominationOriginal) && C41536l.m120484d(this.prodGroup, transactionApiEntity.prodGroup) && C41536l.m120484d(this.entryType, transactionApiEntity.entryType) && C41536l.m120484d(this.printSwift, transactionApiEntity.printSwift) && C41536l.m120484d(this.isInternalOperation, transactionApiEntity.isInternalOperation) && C41536l.m120484d(this.entryGroupNameId, transactionApiEntity.entryGroupNameId) && C41536l.m120484d(this.groupImageId, transactionApiEntity.groupImageId) && this.hasTransferBack == transactionApiEntity.hasTransferBack && C41536l.m120484d(this.printFormType, transactionApiEntity.printFormType) && C41536l.m120484d(this.printForm, transactionApiEntity.printForm) && C41536l.m120484d(this.entryGroupDValue, transactionApiEntity.entryGroupDValue) && C41536l.m120484d(this.operationTitle, transactionApiEntity.operationTitle) && C41536l.m120484d(this.sort, transactionApiEntity.sort) && C41536l.m120484d(this.isStatementAllowed, transactionApiEntity.isStatementAllowed) && C41536l.m120484d(this.canSplit, transactionApiEntity.canSplit) && C41536l.m120484d(this.essId, transactionApiEntity.essId) && C41536l.m120484d(this.bonusInfo, transactionApiEntity.bonusInfo) && C41536l.m120484d(this.pfmId, transactionApiEntity.pfmId) && C41536l.m120484d(this.pfmCatId, transactionApiEntity.pfmCatId) && C41536l.m120484d(this.pfmCatName, transactionApiEntity.pfmCatName) && C41536l.m120484d(this.pfmComputable, transactionApiEntity.pfmComputable) && C41536l.m120484d(this.pfmParentCatId, transactionApiEntity.pfmParentCatId) && C41536l.m120484d(this.pfmSplit, transactionApiEntity.pfmSplit) && C41536l.m120484d(this.essServiceId, transactionApiEntity.essServiceId) && C41536l.m120484d(this.bonusType, transactionApiEntity.bonusType) && C41536l.m120484d(this.isRepeatAllowed, transactionApiEntity.isRepeatAllowed) && C41536l.m120484d(this.isTemplateAllowed, transactionApiEntity.isTemplateAllowed) && C41536l.m120484d(this.isDDSTOAlllowed, transactionApiEntity.isDDSTOAlllowed) && C41536l.m120484d(this.bonusPoint, transactionApiEntity.bonusPoint) && C41536l.m120484d(this.deviceType, transactionApiEntity.deviceType) && C41536l.m120484d(this.merchantName, transactionApiEntity.merchantName) && C41536l.m120484d(this.merchantNameInt, transactionApiEntity.merchantNameInt) && C41536l.m120484d(this.pfmForecast, transactionApiEntity.pfmForecast) && C41536l.m120484d(this.pfmParentCatName, transactionApiEntity.pfmParentCatName) && C41536l.m120484d(this.pfmRecurring, transactionApiEntity.pfmRecurring) && C41536l.m120484d(this.pfmParentOpId, transactionApiEntity.pfmParentOpId) && C41536l.m120484d(this.pfmTagId, transactionApiEntity.pfmTagId) && C41536l.m120484d(this.pfmTagName, transactionApiEntity.pfmTagName) && C41536l.m120484d(this.merchantId, transactionApiEntity.merchantId) && C41536l.m120484d(this.counterPartyClient, transactionApiEntity.counterPartyClient) && C41536l.m120484d(this.groupImageIdSolo, transactionApiEntity.groupImageIdSolo) && C41536l.m120484d(this.groupImageIdWm, transactionApiEntity.groupImageIdWm);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getAmountBase() {
        return this.amountBase;
    }

    public final String getBonusInfo() {
        return this.bonusInfo;
    }

    public final Double getBonusPoint() {
        return this.bonusPoint;
    }

    public final String getBonusType() {
        return this.bonusType;
    }

    public final String getCanCopy() {
        return this.canCopy;
    }

    public final Boolean getCanSplit() {
        return this.canSplit;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final Long getCounterPartyClient() {
        return this.counterPartyClient;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final Long getDocKey() {
        return this.docKey;
    }

    public final String getEntryGroupDValue() {
        return this.entryGroupDValue;
    }

    public final String getEntryGroupNameId() {
        return this.entryGroupNameId;
    }

    public final String getEntryId() {
        return this.entryId;
    }

    public final String getEntryType() {
        return this.entryType;
    }

    public final String getEssId() {
        return this.essId;
    }

    public final String getEssServiceId() {
        return this.essServiceId;
    }

    public final String getGroupImageId() {
        return this.groupImageId;
    }

    public final Long getGroupImageIdSolo() {
        return this.groupImageIdSolo;
    }

    public final Long getGroupImageIdWm() {
        return this.groupImageIdWm;
    }

    public final C24978b getHasTransferBack() {
        return this.hasTransferBack;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getMerchantNameInt() {
        return this.merchantNameInt;
    }

    public final String getNomination() {
        return this.nomination;
    }

    public final String getNominationOriginal() {
        return this.nominationOriginal;
    }

    public final String getOperationDate() {
        return this.operationDate;
    }

    public final String getOperationTitle() {
        return this.operationTitle;
    }

    public final String getOppositeAmount() {
        return this.oppositeAmount;
    }

    public final Long getPfmCatId() {
        return this.pfmCatId;
    }

    public final String getPfmCatName() {
        return this.pfmCatName;
    }

    public final Integer getPfmComputable() {
        return this.pfmComputable;
    }

    public final String getPfmForecast() {
        return this.pfmForecast;
    }

    public final Long getPfmId() {
        return this.pfmId;
    }

    public final Long getPfmParentCatId() {
        return this.pfmParentCatId;
    }

    public final String getPfmParentCatName() {
        return this.pfmParentCatName;
    }

    public final Long getPfmParentOpId() {
        return this.pfmParentOpId;
    }

    public final String getPfmRecurring() {
        return this.pfmRecurring;
    }

    public final String getPfmSplit() {
        return this.pfmSplit;
    }

    public final Long getPfmTagId() {
        return this.pfmTagId;
    }

    public final String getPfmTagName() {
        return this.pfmTagName;
    }

    public final String getPostDate() {
        return this.postDate;
    }

    public final String getPrintForm() {
        return this.printForm;
    }

    public final String getPrintFormType() {
        return this.printFormType;
    }

    public final String getPrintSwift() {
        return this.printSwift;
    }

    public final String getProdGroup() {
        return this.prodGroup;
    }

    public final ArrayList<String> getSort() {
        return this.sort;
    }

    public final String getSourceEntryGroup() {
        return this.sourceEntryGroup;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.entryId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.docKey;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.clientKey;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sourceEntryGroup;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nomination;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.postDate;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.operationDate;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.amount;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.oppositeAmount;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ccy;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.canCopy;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.status;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.amountBase;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.nominationOriginal;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.prodGroup;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.entryType;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.printSwift;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.isInternalOperation;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.entryGroupNameId;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.groupImageId;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        C24978b bVar = this.hasTransferBack;
        int hashCode22 = (hashCode21 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str21 = this.printFormType;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.printForm;
        int hashCode24 = (hashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.entryGroupDValue;
        int hashCode25 = (hashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.operationTitle;
        int hashCode26 = (((hashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31) + this.sort.hashCode()) * 31;
        Boolean bool = this.isStatementAllowed;
        int hashCode27 = (hashCode26 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canSplit;
        int hashCode28 = (hashCode27 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str25 = this.essId;
        int hashCode29 = (hashCode28 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.bonusInfo;
        int hashCode30 = (hashCode29 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Long l2 = this.pfmId;
        int hashCode31 = (hashCode30 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.pfmCatId;
        int hashCode32 = (hashCode31 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str27 = this.pfmCatName;
        int hashCode33 = (hashCode32 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Integer num = this.pfmComputable;
        int hashCode34 = (hashCode33 + (num == null ? 0 : num.hashCode())) * 31;
        Long l4 = this.pfmParentCatId;
        int hashCode35 = (hashCode34 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str28 = this.pfmSplit;
        int hashCode36 = (hashCode35 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.essServiceId;
        int hashCode37 = (hashCode36 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.bonusType;
        int hashCode38 = (hashCode37 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Boolean bool3 = this.isRepeatAllowed;
        int hashCode39 = (hashCode38 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isTemplateAllowed;
        int hashCode40 = (hashCode39 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isDDSTOAlllowed;
        int hashCode41 = (hashCode40 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Double d = this.bonusPoint;
        int hashCode42 = (hashCode41 + (d == null ? 0 : d.hashCode())) * 31;
        String str31 = this.deviceType;
        int hashCode43 = (hashCode42 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.merchantName;
        int hashCode44 = (hashCode43 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.merchantNameInt;
        int hashCode45 = (hashCode44 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.pfmForecast;
        int hashCode46 = (hashCode45 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.pfmParentCatName;
        int hashCode47 = (hashCode46 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.pfmRecurring;
        int hashCode48 = (hashCode47 + (str36 == null ? 0 : str36.hashCode())) * 31;
        Long l5 = this.pfmParentOpId;
        int hashCode49 = (hashCode48 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.pfmTagId;
        int hashCode50 = (hashCode49 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str37 = this.pfmTagName;
        int hashCode51 = (hashCode50 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.merchantId;
        int hashCode52 = (hashCode51 + (str38 == null ? 0 : str38.hashCode())) * 31;
        Long l7 = this.counterPartyClient;
        int hashCode53 = (hashCode52 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.groupImageIdSolo;
        int hashCode54 = (hashCode53 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.groupImageIdWm;
        if (l9 != null) {
            i = l9.hashCode();
        }
        return hashCode54 + i;
    }

    public final Boolean isDDSTOAlllowed() {
        return this.isDDSTOAlllowed;
    }

    public final String isInternalOperation() {
        return this.isInternalOperation;
    }

    public final Boolean isRepeatAllowed() {
        return this.isRepeatAllowed;
    }

    public final Boolean isStatementAllowed() {
        return this.isStatementAllowed;
    }

    public final Boolean isTemplateAllowed() {
        return this.isTemplateAllowed;
    }

    public String toString() {
        String str = this.entryId;
        Long l = this.docKey;
        String str2 = this.clientKey;
        String str3 = this.language;
        String str4 = this.sourceEntryGroup;
        String str5 = this.nomination;
        String str6 = this.postDate;
        String str7 = this.operationDate;
        String str8 = this.amount;
        String str9 = this.oppositeAmount;
        String str10 = this.ccy;
        String str11 = this.canCopy;
        String str12 = this.status;
        String str13 = this.amountBase;
        String str14 = this.nominationOriginal;
        String str15 = this.prodGroup;
        String str16 = this.entryType;
        String str17 = this.printSwift;
        String str18 = this.isInternalOperation;
        String str19 = this.entryGroupNameId;
        String str20 = this.groupImageId;
        C24978b bVar = this.hasTransferBack;
        String str21 = this.printFormType;
        String str22 = this.printForm;
        String str23 = this.entryGroupDValue;
        String str24 = this.operationTitle;
        ArrayList<String> arrayList = this.sort;
        Boolean bool = this.isStatementAllowed;
        Boolean bool2 = this.canSplit;
        String str25 = this.essId;
        String str26 = this.bonusInfo;
        Long l2 = this.pfmId;
        Long l3 = this.pfmCatId;
        String str27 = this.pfmCatName;
        Integer num = this.pfmComputable;
        Long l4 = this.pfmParentCatId;
        String str28 = this.pfmSplit;
        String str29 = this.essServiceId;
        String str30 = this.bonusType;
        Boolean bool3 = this.isRepeatAllowed;
        Boolean bool4 = this.isTemplateAllowed;
        Boolean bool5 = this.isDDSTOAlllowed;
        Double d = this.bonusPoint;
        String str31 = this.deviceType;
        String str32 = this.merchantName;
        String str33 = this.merchantNameInt;
        String str34 = this.pfmForecast;
        String str35 = this.pfmParentCatName;
        String str36 = this.pfmRecurring;
        Long l5 = this.pfmParentOpId;
        Long l6 = this.pfmTagId;
        String str37 = this.pfmTagName;
        String str38 = this.merchantId;
        Long l7 = this.counterPartyClient;
        Long l8 = this.groupImageIdSolo;
        Long l9 = this.groupImageIdWm;
        return "TransactionApiEntity(entryId=" + str + ", docKey=" + l + ", clientKey=" + str2 + ", language=" + str3 + ", sourceEntryGroup=" + str4 + ", nomination=" + str5 + ", postDate=" + str6 + ", operationDate=" + str7 + ", amount=" + str8 + ", oppositeAmount=" + str9 + ", ccy=" + str10 + ", canCopy=" + str11 + ", status=" + str12 + ", amountBase=" + str13 + ", nominationOriginal=" + str14 + ", prodGroup=" + str15 + ", entryType=" + str16 + ", printSwift=" + str17 + ", isInternalOperation=" + str18 + ", entryGroupNameId=" + str19 + ", groupImageId=" + str20 + ", hasTransferBack=" + bVar + ", printFormType=" + str21 + ", printForm=" + str22 + ", entryGroupDValue=" + str23 + ", operationTitle=" + str24 + ", sort=" + arrayList + ", isStatementAllowed=" + bool + ", canSplit=" + bool2 + ", essId=" + str25 + ", bonusInfo=" + str26 + ", pfmId=" + l2 + ", pfmCatId=" + l3 + ", pfmCatName=" + str27 + ", pfmComputable=" + num + ", pfmParentCatId=" + l4 + ", pfmSplit=" + str28 + ", essServiceId=" + str29 + ", bonusType=" + str30 + ", isRepeatAllowed=" + bool3 + ", isTemplateAllowed=" + bool4 + ", isDDSTOAlllowed=" + bool5 + ", bonusPoint=" + d + ", deviceType=" + str31 + ", merchantName=" + str32 + ", merchantNameInt=" + str33 + ", pfmForecast=" + str34 + ", pfmParentCatName=" + str35 + ", pfmRecurring=" + str36 + ", pfmParentOpId=" + l5 + ", pfmTagId=" + l6 + ", pfmTagName=" + str37 + ", merchantId=" + str38 + ", counterPartyClient=" + l7 + ", groupImageIdSolo=" + l8 + ", groupImageIdWm=" + l9 + ")";
    }

    public TransactionApiEntity(String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, C24978b bVar, String str21, String str22, String str23, String str24, ArrayList<String> arrayList, Boolean bool, Boolean bool2, String str25, String str26, Long l2, Long l3, String str27, Integer num, Long l4, String str28, String str29, String str30, Boolean bool3, Boolean bool4, Boolean bool5, Double d, String str31, String str32, String str33, String str34, String str35, String str36, Long l5, Long l6, String str37, String str38, Long l7, Long l8, Long l9) {
        ArrayList<String> arrayList2 = arrayList;
        C41536l.m120489i(arrayList2, "sort");
        this.entryId = str;
        this.docKey = l;
        this.clientKey = str2;
        this.language = str3;
        this.sourceEntryGroup = str4;
        this.nomination = str5;
        this.postDate = str6;
        this.operationDate = str7;
        this.amount = str8;
        this.oppositeAmount = str9;
        this.ccy = str10;
        this.canCopy = str11;
        this.status = str12;
        this.amountBase = str13;
        this.nominationOriginal = str14;
        this.prodGroup = str15;
        this.entryType = str16;
        this.printSwift = str17;
        this.isInternalOperation = str18;
        this.entryGroupNameId = str19;
        this.groupImageId = str20;
        this.hasTransferBack = bVar;
        this.printFormType = str21;
        this.printForm = str22;
        this.entryGroupDValue = str23;
        this.operationTitle = str24;
        this.sort = arrayList2;
        this.isStatementAllowed = bool;
        this.canSplit = bool2;
        this.essId = str25;
        this.bonusInfo = str26;
        this.pfmId = l2;
        this.pfmCatId = l3;
        this.pfmCatName = str27;
        this.pfmComputable = num;
        this.pfmParentCatId = l4;
        this.pfmSplit = str28;
        this.essServiceId = str29;
        this.bonusType = str30;
        this.isRepeatAllowed = bool3;
        this.isTemplateAllowed = bool4;
        this.isDDSTOAlllowed = bool5;
        this.bonusPoint = d;
        this.deviceType = str31;
        this.merchantName = str32;
        this.merchantNameInt = str33;
        this.pfmForecast = str34;
        this.pfmParentCatName = str35;
        this.pfmRecurring = str36;
        this.pfmParentOpId = l5;
        this.pfmTagId = l6;
        this.pfmTagName = str37;
        this.merchantId = str38;
        this.counterPartyClient = l7;
        this.groupImageIdSolo = l8;
        this.groupImageIdWm = l9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransactionApiEntity(java.lang.String r57, java.lang.Long r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, hd0.C24978b r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.util.ArrayList r83, java.lang.Boolean r84, java.lang.Boolean r85, java.lang.String r86, java.lang.String r87, java.lang.Long r88, java.lang.Long r89, java.lang.String r90, java.lang.Integer r91, java.lang.Long r92, java.lang.String r93, java.lang.String r94, java.lang.String r95, java.lang.Boolean r96, java.lang.Boolean r97, java.lang.Boolean r98, java.lang.Double r99, java.lang.String r100, java.lang.String r101, java.lang.String r102, java.lang.String r103, java.lang.String r104, java.lang.String r105, java.lang.Long r106, java.lang.Long r107, java.lang.String r108, java.lang.String r109, java.lang.Long r110, java.lang.Long r111, java.lang.Long r112, int r113, int r114, kotlin.jvm.internal.DefaultConstructorMarker r115) {
        /*
            r56 = this;
            r0 = r113
            r1 = r114
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = r57
        L_0x000c:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r58
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 0
            goto L_0x001c
        L_0x001a:
            r5 = r59
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = 0
            goto L_0x0024
        L_0x0022:
            r6 = r60
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r61
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r62
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r63
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r64
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r65
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = 0
            goto L_0x0054
        L_0x0052:
            r12 = r66
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = 0
            goto L_0x005c
        L_0x005a:
            r13 = r67
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = 0
            goto L_0x0064
        L_0x0062:
            r14 = r68
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = 0
            goto L_0x006c
        L_0x006a:
            r15 = r69
        L_0x006c:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0072
            r3 = 0
            goto L_0x0074
        L_0x0072:
            r3 = r70
        L_0x0074:
            r16 = r3
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x007c
            r3 = 0
            goto L_0x007e
        L_0x007c:
            r3 = r71
        L_0x007e:
            r17 = 32768(0x8000, float:4.5918E-41)
            r18 = r0 & r17
            if (r18 == 0) goto L_0x0088
            r18 = 0
            goto L_0x008a
        L_0x0088:
            r18 = r72
        L_0x008a:
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r19
            if (r20 == 0) goto L_0x0093
            r20 = 0
            goto L_0x0095
        L_0x0093:
            r20 = r73
        L_0x0095:
            r21 = 131072(0x20000, float:1.83671E-40)
            r22 = r0 & r21
            if (r22 == 0) goto L_0x009e
            r22 = 0
            goto L_0x00a0
        L_0x009e:
            r22 = r74
        L_0x00a0:
            r23 = 262144(0x40000, float:3.67342E-40)
            r24 = r0 & r23
            if (r24 == 0) goto L_0x00a9
            r24 = 0
            goto L_0x00ab
        L_0x00a9:
            r24 = r75
        L_0x00ab:
            r25 = 524288(0x80000, float:7.34684E-40)
            r26 = r0 & r25
            if (r26 == 0) goto L_0x00b4
            r26 = 0
            goto L_0x00b6
        L_0x00b4:
            r26 = r76
        L_0x00b6:
            r27 = 1048576(0x100000, float:1.469368E-39)
            r28 = r0 & r27
            if (r28 == 0) goto L_0x00bf
            r28 = 0
            goto L_0x00c1
        L_0x00bf:
            r28 = r77
        L_0x00c1:
            r29 = 2097152(0x200000, float:2.938736E-39)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x00ca
            r29 = 0
            goto L_0x00cc
        L_0x00ca:
            r29 = r78
        L_0x00cc:
            r30 = 4194304(0x400000, float:5.877472E-39)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x00d5
            r30 = 0
            goto L_0x00d7
        L_0x00d5:
            r30 = r79
        L_0x00d7:
            r31 = 8388608(0x800000, float:1.17549435E-38)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x00e0
            r31 = 0
            goto L_0x00e2
        L_0x00e0:
            r31 = r80
        L_0x00e2:
            r32 = 16777216(0x1000000, float:2.3509887E-38)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x00eb
            r32 = 0
            goto L_0x00ed
        L_0x00eb:
            r32 = r81
        L_0x00ed:
            r33 = 33554432(0x2000000, float:9.403955E-38)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x00f6
            r33 = 0
            goto L_0x00f8
        L_0x00f6:
            r33 = r82
        L_0x00f8:
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x0104
            java.util.ArrayList r34 = new java.util.ArrayList
            r34.<init>()
            goto L_0x0106
        L_0x0104:
            r34 = r83
        L_0x0106:
            r35 = 134217728(0x8000000, float:3.85186E-34)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x010f
            r35 = 0
            goto L_0x0111
        L_0x010f:
            r35 = r84
        L_0x0111:
            r36 = 268435456(0x10000000, float:2.5243549E-29)
            r36 = r0 & r36
            if (r36 == 0) goto L_0x011a
            r36 = 0
            goto L_0x011c
        L_0x011a:
            r36 = r85
        L_0x011c:
            r37 = 536870912(0x20000000, float:1.0842022E-19)
            r37 = r0 & r37
            if (r37 == 0) goto L_0x0125
            r37 = 0
            goto L_0x0127
        L_0x0125:
            r37 = r86
        L_0x0127:
            r38 = 1073741824(0x40000000, float:2.0)
            r38 = r0 & r38
            if (r38 == 0) goto L_0x0130
            r38 = 0
            goto L_0x0132
        L_0x0130:
            r38 = r87
        L_0x0132:
            r39 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r39
            if (r0 == 0) goto L_0x013a
            r0 = 0
            goto L_0x013c
        L_0x013a:
            r0 = r88
        L_0x013c:
            r39 = r1 & 1
            if (r39 == 0) goto L_0x0143
            r39 = 0
            goto L_0x0145
        L_0x0143:
            r39 = r89
        L_0x0145:
            r40 = r1 & 2
            if (r40 == 0) goto L_0x014c
            r40 = 0
            goto L_0x014e
        L_0x014c:
            r40 = r90
        L_0x014e:
            r41 = r1 & 4
            if (r41 == 0) goto L_0x0155
            r41 = 0
            goto L_0x0157
        L_0x0155:
            r41 = r91
        L_0x0157:
            r42 = r1 & 8
            if (r42 == 0) goto L_0x015e
            r42 = 0
            goto L_0x0160
        L_0x015e:
            r42 = r92
        L_0x0160:
            r43 = r1 & 16
            if (r43 == 0) goto L_0x0167
            r43 = 0
            goto L_0x0169
        L_0x0167:
            r43 = r93
        L_0x0169:
            r44 = r1 & 32
            if (r44 == 0) goto L_0x0170
            r44 = 0
            goto L_0x0172
        L_0x0170:
            r44 = r94
        L_0x0172:
            r45 = r1 & 64
            if (r45 == 0) goto L_0x0179
            r45 = 0
            goto L_0x017b
        L_0x0179:
            r45 = r95
        L_0x017b:
            r113 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0183
            r0 = 0
            goto L_0x0185
        L_0x0183:
            r0 = r96
        L_0x0185:
            r46 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x018d
            r0 = 0
            goto L_0x018f
        L_0x018d:
            r0 = r97
        L_0x018f:
            r47 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0197
            r0 = 0
            goto L_0x0199
        L_0x0197:
            r0 = r98
        L_0x0199:
            r48 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01a1
            r0 = 0
            goto L_0x01a3
        L_0x01a1:
            r0 = r99
        L_0x01a3:
            r49 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01ab
            r0 = 0
            goto L_0x01ad
        L_0x01ab:
            r0 = r100
        L_0x01ad:
            r50 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01b5
            r0 = 0
            goto L_0x01b7
        L_0x01b5:
            r0 = r101
        L_0x01b7:
            r51 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01bf
            r0 = 0
            goto L_0x01c1
        L_0x01bf:
            r0 = r102
        L_0x01c1:
            r52 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01c9
            r0 = 0
            goto L_0x01cb
        L_0x01c9:
            r0 = r103
        L_0x01cb:
            r17 = r1 & r17
            if (r17 == 0) goto L_0x01d2
            r17 = 0
            goto L_0x01d4
        L_0x01d2:
            r17 = r104
        L_0x01d4:
            r19 = r1 & r19
            if (r19 == 0) goto L_0x01db
            r19 = 0
            goto L_0x01dd
        L_0x01db:
            r19 = r105
        L_0x01dd:
            r21 = r1 & r21
            if (r21 == 0) goto L_0x01e4
            r21 = 0
            goto L_0x01e6
        L_0x01e4:
            r21 = r106
        L_0x01e6:
            r23 = r1 & r23
            if (r23 == 0) goto L_0x01ed
            r23 = 0
            goto L_0x01ef
        L_0x01ed:
            r23 = r107
        L_0x01ef:
            r25 = r1 & r25
            if (r25 == 0) goto L_0x01f6
            r25 = 0
            goto L_0x01f8
        L_0x01f6:
            r25 = r108
        L_0x01f8:
            r27 = r1 & r27
            if (r27 == 0) goto L_0x01ff
            r27 = 0
            goto L_0x0201
        L_0x01ff:
            r27 = r109
        L_0x0201:
            r53 = 2097152(0x200000, float:2.938736E-39)
            r53 = r1 & r53
            if (r53 == 0) goto L_0x020a
            r53 = 0
            goto L_0x020c
        L_0x020a:
            r53 = r110
        L_0x020c:
            r54 = 4194304(0x400000, float:5.877472E-39)
            r54 = r1 & r54
            if (r54 == 0) goto L_0x0215
            r54 = 0
            goto L_0x0217
        L_0x0215:
            r54 = r111
        L_0x0217:
            r55 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r55
            if (r1 == 0) goto L_0x021f
            r1 = 0
            goto L_0x0221
        L_0x021f:
            r1 = r112
        L_0x0221:
            r57 = r56
            r58 = r2
            r59 = r4
            r60 = r5
            r61 = r6
            r62 = r7
            r63 = r8
            r64 = r9
            r65 = r10
            r66 = r11
            r67 = r12
            r68 = r13
            r69 = r14
            r70 = r15
            r71 = r16
            r72 = r3
            r73 = r18
            r74 = r20
            r75 = r22
            r76 = r24
            r77 = r26
            r78 = r28
            r79 = r29
            r80 = r30
            r81 = r31
            r82 = r32
            r83 = r33
            r84 = r34
            r85 = r35
            r86 = r36
            r87 = r37
            r88 = r38
            r89 = r113
            r90 = r39
            r91 = r40
            r92 = r41
            r93 = r42
            r94 = r43
            r95 = r44
            r96 = r45
            r97 = r46
            r98 = r47
            r99 = r48
            r100 = r49
            r101 = r50
            r102 = r51
            r103 = r52
            r104 = r0
            r105 = r17
            r106 = r19
            r107 = r21
            r108 = r23
            r109 = r25
            r110 = r27
            r111 = r53
            r112 = r54
            r113 = r1
            r57.<init>(r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionApiEntity.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, hd0.b, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
