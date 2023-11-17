package p341ge.bog.mobilebank.deposits.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.DepositBondEntity */
public final class DepositBondEntity {
    private final Long accountKey;
    private final Number accrualBalance;
    private final Long acctKey;
    private final String acctNo;
    private final String agrPurpose;
    private final Long agrPurposeId;
    private final Long agreeKey;
    private final String agreeNo;
    private final Long applicationId;
    private final String attachmentId;
    private final String attachmentUrl;
    private final Number availableAmount;
    private final Number bcBalance;
    private final String bondPdfUrl;
    private final Number casAmount;
    private final String ccy;
    private final Number cdAmount;
    private final Long cdGroupId;
    private final String cdType;
    private final String cdTypeDictionaryKey;
    private final String cdTypeDictionaryValue;
    private final List<CdsDetailsEntity> cdsDetails;
    private final String class2;
    private final Long clientKey;
    private final Long closeDate;
    private final CollectionTypeEntity collectionType;
    private final String currencyCode;
    private final Number currentBalance;
    private final String dataSource;
    private final String depositPdfUrl;
    private final String depositProdType;
    private final String depositType;
    private final String dictionaryKey;
    private final String dictionaryValue;
    private final Number discount;
    private final ExternalFileEntity externalFile;
    private final Long fileId;
    private final String firstName;
    private final YesNoApiEntity hasClientProlAgreement;

    /* renamed from: id */
    private final Number f60513id;
    private final Number intAccrued;
    private final String intWithPeriodType;
    private final String intWithPeriodTypeKey;
    private final String intWithPeriodTypeValue;
    private final Number interestAccrued;
    private final Number interestRate;
    private final String interestWithdrawnTotal;
    private final YesNoApiEntity isBreakable;
    private final YesNoApiEntity isDefault;
    private final YesNoApiEntity isHidden;
    private final YesNoApiEntity isProlongAllowed;
    private final Long issueDate;
    private final String issuer;
    private final String lastName;
    private final Long mainAccountKey;
    private final Number marketValue;
    private final Number marketValueBase;
    private final Long maturityDate;
    private final Number minAccrualBalance;
    private final String name;
    private final Long nextWithdrawalDate;
    private final Number nominalValue;
    private final String periodType;
    private final String periodTypeNameDctKey;
    private final String periodTypeNameDctValue;
    private final Number pfmAcctBalance;
    private final Long pfmAcctId;
    private final Number principalValueTotal;
    private final String prodType;
    private final List<String> productFunctions;
    private final String productGroup;
    private final Long productId;
    private final YesNoApiEntity prolongable;
    private final String purposeDictionaryKey;
    private final String purposeDictionaryValue;
    private final List<SavingGoalEntity> savingGoals;
    private final YesNoApiEntity showCasAmount;
    private final Long startDate;
    private final String status;
    private final YesNoApiEntity stoExists;
    private final String subType;
    private final Long techAcctKey;
    private final Number totalBalance;

    public DepositBondEntity(CollectionTypeEntity collectionTypeEntity, Number number, Long l, Long l2, String str, String str2, String str3, String str4, Long l3, Number number2, Long l4, Long l5, Long l6, String str5, Number number3, Number number4, Number number5, Long l7, String str6, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, String str7, Long l8, YesNoApiEntity yesNoApiEntity3, Long l9, String str8, Number number6, String str9, String str10, String str11, List<String> list, String str12, String str13, List<SavingGoalEntity> list2, Long l12, Number number7, ExternalFileEntity externalFileEntity, String str14, Long l13, Long l14, Number number8, String str15, Long l15, String str16, Long l16, String str17, String str18, Number number9, Number number10, Number number11, YesNoApiEntity yesNoApiEntity4, String str19, String str20, String str21, String str22, Long l17, String str23, Long l18, Number number12, String str24, Number number13, Number number14, Number number15, Number number16, Number number17, Number number18, String str25, String str26, String str27, Long l19, String str28, String str29, List<CdsDetailsEntity> list3, String str30, String str31, String str32, String str33, YesNoApiEntity yesNoApiEntity5, String str34, String str35, YesNoApiEntity yesNoApiEntity6, YesNoApiEntity yesNoApiEntity7, YesNoApiEntity yesNoApiEntity8) {
        String str36 = str10;
        C41536l.m120489i(collectionTypeEntity, "collectionType");
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str36, "dictionaryKey");
        this.collectionType = collectionTypeEntity;
        this.f60513id = number;
        this.agreeKey = l;
        this.clientKey = l2;
        this.prodType = str;
        this.name = str2;
        this.ccy = str3;
        this.depositType = str4;
        this.nextWithdrawalDate = l3;
        this.accrualBalance = number2;
        this.accountKey = l4;
        this.techAcctKey = l5;
        this.mainAccountKey = l6;
        this.acctNo = str5;
        this.currentBalance = number3;
        this.bcBalance = number4;
        this.availableAmount = number5;
        this.productId = l7;
        this.productGroup = str6;
        this.isHidden = yesNoApiEntity;
        this.isDefault = yesNoApiEntity2;
        this.attachmentId = str7;
        this.fileId = l8;
        this.isBreakable = yesNoApiEntity3;
        this.applicationId = l9;
        this.class2 = str8;
        this.minAccrualBalance = number6;
        this.subType = str9;
        this.dictionaryKey = str36;
        this.dictionaryValue = str11;
        this.productFunctions = list;
        this.attachmentUrl = str12;
        this.depositPdfUrl = str13;
        this.savingGoals = list2;
        this.pfmAcctId = l12;
        this.pfmAcctBalance = number7;
        this.externalFile = externalFileEntity;
        this.depositProdType = str14;
        this.maturityDate = l13;
        this.startDate = l14;
        this.intAccrued = number8;
        this.status = str15;
        this.closeDate = l15;
        this.agrPurpose = str16;
        this.agrPurposeId = l16;
        this.periodType = str17;
        this.agreeNo = str18;
        this.interestRate = number9;
        this.totalBalance = number10;
        this.casAmount = number11;
        this.showCasAmount = yesNoApiEntity4;
        this.periodTypeNameDctKey = str19;
        this.periodTypeNameDctValue = str20;
        this.purposeDictionaryKey = str21;
        this.purposeDictionaryValue = str22;
        this.cdGroupId = l17;
        this.cdType = str23;
        this.issueDate = l18;
        this.nominalValue = number12;
        this.currencyCode = str24;
        this.discount = number13;
        this.interestAccrued = number14;
        this.marketValue = number15;
        this.principalValueTotal = number16;
        this.marketValueBase = number17;
        this.cdAmount = number18;
        this.issuer = str25;
        this.dataSource = str26;
        this.intWithPeriodType = str27;
        this.acctKey = l19;
        this.cdTypeDictionaryKey = str28;
        this.cdTypeDictionaryValue = str29;
        this.cdsDetails = list3;
        this.bondPdfUrl = str30;
        this.intWithPeriodTypeKey = str31;
        this.intWithPeriodTypeValue = str32;
        this.interestWithdrawnTotal = str33;
        this.stoExists = yesNoApiEntity5;
        this.firstName = str34;
        this.lastName = str35;
        this.prolongable = yesNoApiEntity6;
        this.hasClientProlAgreement = yesNoApiEntity7;
        this.isProlongAllowed = yesNoApiEntity8;
    }

    public static /* synthetic */ DepositBondEntity copy$default(DepositBondEntity depositBondEntity, CollectionTypeEntity collectionTypeEntity, Number number, Long l, Long l2, String str, String str2, String str3, String str4, Long l3, Number number2, Long l4, Long l5, Long l6, String str5, Number number3, Number number4, Number number5, Long l7, String str6, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, String str7, Long l8, YesNoApiEntity yesNoApiEntity3, Long l9, String str8, Number number6, String str9, String str10, String str11, List list, String str12, String str13, List list2, Long l12, Number number7, ExternalFileEntity externalFileEntity, String str14, Long l13, Long l14, Number number8, String str15, Long l15, String str16, Long l16, String str17, String str18, Number number9, Number number10, Number number11, YesNoApiEntity yesNoApiEntity4, String str19, String str20, String str21, String str22, Long l17, String str23, Long l18, Number number12, String str24, Number number13, Number number14, Number number15, Number number16, Number number17, Number number18, String str25, String str26, String str27, Long l19, String str28, String str29, List list3, String str30, String str31, String str32, String str33, YesNoApiEntity yesNoApiEntity5, String str34, String str35, YesNoApiEntity yesNoApiEntity6, YesNoApiEntity yesNoApiEntity7, YesNoApiEntity yesNoApiEntity8, int i, int i2, int i3, Object obj) {
        DepositBondEntity depositBondEntity2 = depositBondEntity;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        return depositBondEntity.copy((i4 & 1) != 0 ? depositBondEntity2.collectionType : collectionTypeEntity, (i4 & 2) != 0 ? depositBondEntity2.f60513id : number, (i4 & 4) != 0 ? depositBondEntity2.agreeKey : l, (i4 & 8) != 0 ? depositBondEntity2.clientKey : l2, (i4 & 16) != 0 ? depositBondEntity2.prodType : str, (i4 & 32) != 0 ? depositBondEntity2.name : str2, (i4 & 64) != 0 ? depositBondEntity2.ccy : str3, (i4 & 128) != 0 ? depositBondEntity2.depositType : str4, (i4 & C11398b.f33139r) != 0 ? depositBondEntity2.nextWithdrawalDate : l3, (i4 & C11398b.f33140s) != 0 ? depositBondEntity2.accrualBalance : number2, (i4 & C11398b.f33141t) != 0 ? depositBondEntity2.accountKey : l4, (i4 & C11398b.f33142u) != 0 ? depositBondEntity2.techAcctKey : l5, (i4 & C11398b.f33143v) != 0 ? depositBondEntity2.mainAccountKey : l6, (i4 & 8192) != 0 ? depositBondEntity2.acctNo : str5, (i4 & 16384) != 0 ? depositBondEntity2.currentBalance : number3, (i4 & 32768) != 0 ? depositBondEntity2.bcBalance : number4, (i4 & 65536) != 0 ? depositBondEntity2.availableAmount : number5, (i4 & 131072) != 0 ? depositBondEntity2.productId : l7, (i4 & 262144) != 0 ? depositBondEntity2.productGroup : str6, (i4 & 524288) != 0 ? depositBondEntity2.isHidden : yesNoApiEntity, (i4 & 1048576) != 0 ? depositBondEntity2.isDefault : yesNoApiEntity2, (i4 & 2097152) != 0 ? depositBondEntity2.attachmentId : str7, (i4 & 4194304) != 0 ? depositBondEntity2.fileId : l8, (i4 & 8388608) != 0 ? depositBondEntity2.isBreakable : yesNoApiEntity3, (i4 & 16777216) != 0 ? depositBondEntity2.applicationId : l9, (i4 & 33554432) != 0 ? depositBondEntity2.class2 : str8, (i4 & 67108864) != 0 ? depositBondEntity2.minAccrualBalance : number6, (i4 & 134217728) != 0 ? depositBondEntity2.subType : str9, (i4 & 268435456) != 0 ? depositBondEntity2.dictionaryKey : str10, (i4 & 536870912) != 0 ? depositBondEntity2.dictionaryValue : str11, (i4 & 1073741824) != 0 ? depositBondEntity2.productFunctions : list, (i4 & Integer.MIN_VALUE) != 0 ? depositBondEntity2.attachmentUrl : str12, (i5 & 1) != 0 ? depositBondEntity2.depositPdfUrl : str13, (i5 & 2) != 0 ? depositBondEntity2.savingGoals : list2, (i5 & 4) != 0 ? depositBondEntity2.pfmAcctId : l12, (i5 & 8) != 0 ? depositBondEntity2.pfmAcctBalance : number7, (i5 & 16) != 0 ? depositBondEntity2.externalFile : externalFileEntity, (i5 & 32) != 0 ? depositBondEntity2.depositProdType : str14, (i5 & 64) != 0 ? depositBondEntity2.maturityDate : l13, (i5 & 128) != 0 ? depositBondEntity2.startDate : l14, (i5 & C11398b.f33139r) != 0 ? depositBondEntity2.intAccrued : number8, (i5 & C11398b.f33140s) != 0 ? depositBondEntity2.status : str15, (i5 & C11398b.f33141t) != 0 ? depositBondEntity2.closeDate : l15, (i5 & C11398b.f33142u) != 0 ? depositBondEntity2.agrPurpose : str16, (i5 & C11398b.f33143v) != 0 ? depositBondEntity2.agrPurposeId : l16, (i5 & 8192) != 0 ? depositBondEntity2.periodType : str17, (i5 & 16384) != 0 ? depositBondEntity2.agreeNo : str18, (i5 & 32768) != 0 ? depositBondEntity2.interestRate : number9, (i5 & 65536) != 0 ? depositBondEntity2.totalBalance : number10, (i5 & 131072) != 0 ? depositBondEntity2.casAmount : number11, (i5 & 262144) != 0 ? depositBondEntity2.showCasAmount : yesNoApiEntity4, (i5 & 524288) != 0 ? depositBondEntity2.periodTypeNameDctKey : str19, (i5 & 1048576) != 0 ? depositBondEntity2.periodTypeNameDctValue : str20, (i5 & 2097152) != 0 ? depositBondEntity2.purposeDictionaryKey : str21, (i5 & 4194304) != 0 ? depositBondEntity2.purposeDictionaryValue : str22, (i5 & 8388608) != 0 ? depositBondEntity2.cdGroupId : l17, (i5 & 16777216) != 0 ? depositBondEntity2.cdType : str23, (i5 & 33554432) != 0 ? depositBondEntity2.issueDate : l18, (i5 & 67108864) != 0 ? depositBondEntity2.nominalValue : number12, (i5 & 134217728) != 0 ? depositBondEntity2.currencyCode : str24, (i5 & 268435456) != 0 ? depositBondEntity2.discount : number13, (i5 & 536870912) != 0 ? depositBondEntity2.interestAccrued : number14, (i5 & 1073741824) != 0 ? depositBondEntity2.marketValue : number15, (i5 & Integer.MIN_VALUE) != 0 ? depositBondEntity2.principalValueTotal : number16, (i6 & 1) != 0 ? depositBondEntity2.marketValueBase : number17, (i6 & 2) != 0 ? depositBondEntity2.cdAmount : number18, (i6 & 4) != 0 ? depositBondEntity2.issuer : str25, (i6 & 8) != 0 ? depositBondEntity2.dataSource : str26, (i6 & 16) != 0 ? depositBondEntity2.intWithPeriodType : str27, (i6 & 32) != 0 ? depositBondEntity2.acctKey : l19, (i6 & 64) != 0 ? depositBondEntity2.cdTypeDictionaryKey : str28, (i6 & 128) != 0 ? depositBondEntity2.cdTypeDictionaryValue : str29, (i6 & C11398b.f33139r) != 0 ? depositBondEntity2.cdsDetails : list3, (i6 & C11398b.f33140s) != 0 ? depositBondEntity2.bondPdfUrl : str30, (i6 & C11398b.f33141t) != 0 ? depositBondEntity2.intWithPeriodTypeKey : str31, (i6 & C11398b.f33142u) != 0 ? depositBondEntity2.intWithPeriodTypeValue : str32, (i6 & C11398b.f33143v) != 0 ? depositBondEntity2.interestWithdrawnTotal : str33, (i6 & 8192) != 0 ? depositBondEntity2.stoExists : yesNoApiEntity5, (i6 & 16384) != 0 ? depositBondEntity2.firstName : str34, (i6 & 32768) != 0 ? depositBondEntity2.lastName : str35, (i6 & 65536) != 0 ? depositBondEntity2.prolongable : yesNoApiEntity6, (i6 & 131072) != 0 ? depositBondEntity2.hasClientProlAgreement : yesNoApiEntity7, (i6 & 262144) != 0 ? depositBondEntity2.isProlongAllowed : yesNoApiEntity8);
    }

    public final CollectionTypeEntity component1() {
        return this.collectionType;
    }

    public final Number component10() {
        return this.accrualBalance;
    }

    public final Long component11() {
        return this.accountKey;
    }

    public final Long component12() {
        return this.techAcctKey;
    }

    public final Long component13() {
        return this.mainAccountKey;
    }

    public final String component14() {
        return this.acctNo;
    }

    public final Number component15() {
        return this.currentBalance;
    }

    public final Number component16() {
        return this.bcBalance;
    }

    public final Number component17() {
        return this.availableAmount;
    }

    public final Long component18() {
        return this.productId;
    }

    public final String component19() {
        return this.productGroup;
    }

    public final Number component2() {
        return this.f60513id;
    }

    public final YesNoApiEntity component20() {
        return this.isHidden;
    }

    public final YesNoApiEntity component21() {
        return this.isDefault;
    }

    public final String component22() {
        return this.attachmentId;
    }

    public final Long component23() {
        return this.fileId;
    }

    public final YesNoApiEntity component24() {
        return this.isBreakable;
    }

    public final Long component25() {
        return this.applicationId;
    }

    public final String component26() {
        return this.class2;
    }

    public final Number component27() {
        return this.minAccrualBalance;
    }

    public final String component28() {
        return this.subType;
    }

    public final String component29() {
        return this.dictionaryKey;
    }

    public final Long component3() {
        return this.agreeKey;
    }

    public final String component30() {
        return this.dictionaryValue;
    }

    public final List<String> component31() {
        return this.productFunctions;
    }

    public final String component32() {
        return this.attachmentUrl;
    }

    public final String component33() {
        return this.depositPdfUrl;
    }

    public final List<SavingGoalEntity> component34() {
        return this.savingGoals;
    }

    public final Long component35() {
        return this.pfmAcctId;
    }

    public final Number component36() {
        return this.pfmAcctBalance;
    }

    public final ExternalFileEntity component37() {
        return this.externalFile;
    }

    public final String component38() {
        return this.depositProdType;
    }

    public final Long component39() {
        return this.maturityDate;
    }

    public final Long component4() {
        return this.clientKey;
    }

    public final Long component40() {
        return this.startDate;
    }

    public final Number component41() {
        return this.intAccrued;
    }

    public final String component42() {
        return this.status;
    }

    public final Long component43() {
        return this.closeDate;
    }

    public final String component44() {
        return this.agrPurpose;
    }

    public final Long component45() {
        return this.agrPurposeId;
    }

    public final String component46() {
        return this.periodType;
    }

    public final String component47() {
        return this.agreeNo;
    }

    public final Number component48() {
        return this.interestRate;
    }

    public final Number component49() {
        return this.totalBalance;
    }

    public final String component5() {
        return this.prodType;
    }

    public final Number component50() {
        return this.casAmount;
    }

    public final YesNoApiEntity component51() {
        return this.showCasAmount;
    }

    public final String component52() {
        return this.periodTypeNameDctKey;
    }

    public final String component53() {
        return this.periodTypeNameDctValue;
    }

    public final String component54() {
        return this.purposeDictionaryKey;
    }

    public final String component55() {
        return this.purposeDictionaryValue;
    }

    public final Long component56() {
        return this.cdGroupId;
    }

    public final String component57() {
        return this.cdType;
    }

    public final Long component58() {
        return this.issueDate;
    }

    public final Number component59() {
        return this.nominalValue;
    }

    public final String component6() {
        return this.name;
    }

    public final String component60() {
        return this.currencyCode;
    }

    public final Number component61() {
        return this.discount;
    }

    public final Number component62() {
        return this.interestAccrued;
    }

    public final Number component63() {
        return this.marketValue;
    }

    public final Number component64() {
        return this.principalValueTotal;
    }

    public final Number component65() {
        return this.marketValueBase;
    }

    public final Number component66() {
        return this.cdAmount;
    }

    public final String component67() {
        return this.issuer;
    }

    public final String component68() {
        return this.dataSource;
    }

    public final String component69() {
        return this.intWithPeriodType;
    }

    public final String component7() {
        return this.ccy;
    }

    public final Long component70() {
        return this.acctKey;
    }

    public final String component71() {
        return this.cdTypeDictionaryKey;
    }

    public final String component72() {
        return this.cdTypeDictionaryValue;
    }

    public final List<CdsDetailsEntity> component73() {
        return this.cdsDetails;
    }

    public final String component74() {
        return this.bondPdfUrl;
    }

    public final String component75() {
        return this.intWithPeriodTypeKey;
    }

    public final String component76() {
        return this.intWithPeriodTypeValue;
    }

    public final String component77() {
        return this.interestWithdrawnTotal;
    }

    public final YesNoApiEntity component78() {
        return this.stoExists;
    }

    public final String component79() {
        return this.firstName;
    }

    public final String component8() {
        return this.depositType;
    }

    public final String component80() {
        return this.lastName;
    }

    public final YesNoApiEntity component81() {
        return this.prolongable;
    }

    public final YesNoApiEntity component82() {
        return this.hasClientProlAgreement;
    }

    public final YesNoApiEntity component83() {
        return this.isProlongAllowed;
    }

    public final Long component9() {
        return this.nextWithdrawalDate;
    }

    public final DepositBondEntity copy(CollectionTypeEntity collectionTypeEntity, Number number, Long l, Long l2, String str, String str2, String str3, String str4, Long l3, Number number2, Long l4, Long l5, Long l6, String str5, Number number3, Number number4, Number number5, Long l7, String str6, YesNoApiEntity yesNoApiEntity, YesNoApiEntity yesNoApiEntity2, String str7, Long l8, YesNoApiEntity yesNoApiEntity3, Long l9, String str8, Number number6, String str9, String str10, String str11, List<String> list, String str12, String str13, List<SavingGoalEntity> list2, Long l12, Number number7, ExternalFileEntity externalFileEntity, String str14, Long l13, Long l14, Number number8, String str15, Long l15, String str16, Long l16, String str17, String str18, Number number9, Number number10, Number number11, YesNoApiEntity yesNoApiEntity4, String str19, String str20, String str21, String str22, Long l17, String str23, Long l18, Number number12, String str24, Number number13, Number number14, Number number15, Number number16, Number number17, Number number18, String str25, String str26, String str27, Long l19, String str28, String str29, List<CdsDetailsEntity> list3, String str30, String str31, String str32, String str33, YesNoApiEntity yesNoApiEntity5, String str34, String str35, YesNoApiEntity yesNoApiEntity6, YesNoApiEntity yesNoApiEntity7, YesNoApiEntity yesNoApiEntity8) {
        CollectionTypeEntity collectionTypeEntity2 = collectionTypeEntity;
        C41536l.m120489i(collectionTypeEntity2, "collectionType");
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str10, "dictionaryKey");
        return new DepositBondEntity(collectionTypeEntity2, number, l, l2, str, str2, str3, str4, l3, number2, l4, l5, l6, str5, number3, number4, number5, l7, str6, yesNoApiEntity, yesNoApiEntity2, str7, l8, yesNoApiEntity3, l9, str8, number6, str9, str10, str11, list, str12, str13, list2, l12, number7, externalFileEntity, str14, l13, l14, number8, str15, l15, str16, l16, str17, str18, number9, number10, number11, yesNoApiEntity4, str19, str20, str21, str22, l17, str23, l18, number12, str24, number13, number14, number15, number16, number17, number18, str25, str26, str27, l19, str28, str29, list3, str30, str31, str32, str33, yesNoApiEntity5, str34, str35, yesNoApiEntity6, yesNoApiEntity7, yesNoApiEntity8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositBondEntity)) {
            return false;
        }
        DepositBondEntity depositBondEntity = (DepositBondEntity) obj;
        return this.collectionType == depositBondEntity.collectionType && C41536l.m120484d(this.f60513id, depositBondEntity.f60513id) && C41536l.m120484d(this.agreeKey, depositBondEntity.agreeKey) && C41536l.m120484d(this.clientKey, depositBondEntity.clientKey) && C41536l.m120484d(this.prodType, depositBondEntity.prodType) && C41536l.m120484d(this.name, depositBondEntity.name) && C41536l.m120484d(this.ccy, depositBondEntity.ccy) && C41536l.m120484d(this.depositType, depositBondEntity.depositType) && C41536l.m120484d(this.nextWithdrawalDate, depositBondEntity.nextWithdrawalDate) && C41536l.m120484d(this.accrualBalance, depositBondEntity.accrualBalance) && C41536l.m120484d(this.accountKey, depositBondEntity.accountKey) && C41536l.m120484d(this.techAcctKey, depositBondEntity.techAcctKey) && C41536l.m120484d(this.mainAccountKey, depositBondEntity.mainAccountKey) && C41536l.m120484d(this.acctNo, depositBondEntity.acctNo) && C41536l.m120484d(this.currentBalance, depositBondEntity.currentBalance) && C41536l.m120484d(this.bcBalance, depositBondEntity.bcBalance) && C41536l.m120484d(this.availableAmount, depositBondEntity.availableAmount) && C41536l.m120484d(this.productId, depositBondEntity.productId) && C41536l.m120484d(this.productGroup, depositBondEntity.productGroup) && this.isHidden == depositBondEntity.isHidden && this.isDefault == depositBondEntity.isDefault && C41536l.m120484d(this.attachmentId, depositBondEntity.attachmentId) && C41536l.m120484d(this.fileId, depositBondEntity.fileId) && this.isBreakable == depositBondEntity.isBreakable && C41536l.m120484d(this.applicationId, depositBondEntity.applicationId) && C41536l.m120484d(this.class2, depositBondEntity.class2) && C41536l.m120484d(this.minAccrualBalance, depositBondEntity.minAccrualBalance) && C41536l.m120484d(this.subType, depositBondEntity.subType) && C41536l.m120484d(this.dictionaryKey, depositBondEntity.dictionaryKey) && C41536l.m120484d(this.dictionaryValue, depositBondEntity.dictionaryValue) && C41536l.m120484d(this.productFunctions, depositBondEntity.productFunctions) && C41536l.m120484d(this.attachmentUrl, depositBondEntity.attachmentUrl) && C41536l.m120484d(this.depositPdfUrl, depositBondEntity.depositPdfUrl) && C41536l.m120484d(this.savingGoals, depositBondEntity.savingGoals) && C41536l.m120484d(this.pfmAcctId, depositBondEntity.pfmAcctId) && C41536l.m120484d(this.pfmAcctBalance, depositBondEntity.pfmAcctBalance) && C41536l.m120484d(this.externalFile, depositBondEntity.externalFile) && C41536l.m120484d(this.depositProdType, depositBondEntity.depositProdType) && C41536l.m120484d(this.maturityDate, depositBondEntity.maturityDate) && C41536l.m120484d(this.startDate, depositBondEntity.startDate) && C41536l.m120484d(this.intAccrued, depositBondEntity.intAccrued) && C41536l.m120484d(this.status, depositBondEntity.status) && C41536l.m120484d(this.closeDate, depositBondEntity.closeDate) && C41536l.m120484d(this.agrPurpose, depositBondEntity.agrPurpose) && C41536l.m120484d(this.agrPurposeId, depositBondEntity.agrPurposeId) && C41536l.m120484d(this.periodType, depositBondEntity.periodType) && C41536l.m120484d(this.agreeNo, depositBondEntity.agreeNo) && C41536l.m120484d(this.interestRate, depositBondEntity.interestRate) && C41536l.m120484d(this.totalBalance, depositBondEntity.totalBalance) && C41536l.m120484d(this.casAmount, depositBondEntity.casAmount) && this.showCasAmount == depositBondEntity.showCasAmount && C41536l.m120484d(this.periodTypeNameDctKey, depositBondEntity.periodTypeNameDctKey) && C41536l.m120484d(this.periodTypeNameDctValue, depositBondEntity.periodTypeNameDctValue) && C41536l.m120484d(this.purposeDictionaryKey, depositBondEntity.purposeDictionaryKey) && C41536l.m120484d(this.purposeDictionaryValue, depositBondEntity.purposeDictionaryValue) && C41536l.m120484d(this.cdGroupId, depositBondEntity.cdGroupId) && C41536l.m120484d(this.cdType, depositBondEntity.cdType) && C41536l.m120484d(this.issueDate, depositBondEntity.issueDate) && C41536l.m120484d(this.nominalValue, depositBondEntity.nominalValue) && C41536l.m120484d(this.currencyCode, depositBondEntity.currencyCode) && C41536l.m120484d(this.discount, depositBondEntity.discount) && C41536l.m120484d(this.interestAccrued, depositBondEntity.interestAccrued) && C41536l.m120484d(this.marketValue, depositBondEntity.marketValue) && C41536l.m120484d(this.principalValueTotal, depositBondEntity.principalValueTotal) && C41536l.m120484d(this.marketValueBase, depositBondEntity.marketValueBase) && C41536l.m120484d(this.cdAmount, depositBondEntity.cdAmount) && C41536l.m120484d(this.issuer, depositBondEntity.issuer) && C41536l.m120484d(this.dataSource, depositBondEntity.dataSource) && C41536l.m120484d(this.intWithPeriodType, depositBondEntity.intWithPeriodType) && C41536l.m120484d(this.acctKey, depositBondEntity.acctKey) && C41536l.m120484d(this.cdTypeDictionaryKey, depositBondEntity.cdTypeDictionaryKey) && C41536l.m120484d(this.cdTypeDictionaryValue, depositBondEntity.cdTypeDictionaryValue) && C41536l.m120484d(this.cdsDetails, depositBondEntity.cdsDetails) && C41536l.m120484d(this.bondPdfUrl, depositBondEntity.bondPdfUrl) && C41536l.m120484d(this.intWithPeriodTypeKey, depositBondEntity.intWithPeriodTypeKey) && C41536l.m120484d(this.intWithPeriodTypeValue, depositBondEntity.intWithPeriodTypeValue) && C41536l.m120484d(this.interestWithdrawnTotal, depositBondEntity.interestWithdrawnTotal) && this.stoExists == depositBondEntity.stoExists && C41536l.m120484d(this.firstName, depositBondEntity.firstName) && C41536l.m120484d(this.lastName, depositBondEntity.lastName) && this.prolongable == depositBondEntity.prolongable && this.hasClientProlAgreement == depositBondEntity.hasClientProlAgreement && this.isProlongAllowed == depositBondEntity.isProlongAllowed;
    }

    public final Long getAccountKey() {
        return this.accountKey;
    }

    public final Number getAccrualBalance() {
        return this.accrualBalance;
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final String getAgrPurpose() {
        return this.agrPurpose;
    }

    public final Long getAgrPurposeId() {
        return this.agrPurposeId;
    }

    public final Long getAgreeKey() {
        return this.agreeKey;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final Long getApplicationId() {
        return this.applicationId;
    }

    public final String getAttachmentId() {
        return this.attachmentId;
    }

    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public final Number getAvailableAmount() {
        return this.availableAmount;
    }

    public final Number getBcBalance() {
        return this.bcBalance;
    }

    public final String getBondPdfUrl() {
        return this.bondPdfUrl;
    }

    public final Number getCasAmount() {
        return this.casAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Number getCdAmount() {
        return this.cdAmount;
    }

    public final Long getCdGroupId() {
        return this.cdGroupId;
    }

    public final String getCdType() {
        return this.cdType;
    }

    public final String getCdTypeDictionaryKey() {
        return this.cdTypeDictionaryKey;
    }

    public final String getCdTypeDictionaryValue() {
        return this.cdTypeDictionaryValue;
    }

    public final List<CdsDetailsEntity> getCdsDetails() {
        return this.cdsDetails;
    }

    public final String getClass2() {
        return this.class2;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final Long getCloseDate() {
        return this.closeDate;
    }

    public final CollectionTypeEntity getCollectionType() {
        return this.collectionType;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final Number getCurrentBalance() {
        return this.currentBalance;
    }

    public final String getDataSource() {
        return this.dataSource;
    }

    public final String getDepositPdfUrl() {
        return this.depositPdfUrl;
    }

    public final String getDepositProdType() {
        return this.depositProdType;
    }

    public final String getDepositType() {
        return this.depositType;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getDictionaryValue() {
        return this.dictionaryValue;
    }

    public final Number getDiscount() {
        return this.discount;
    }

    public final ExternalFileEntity getExternalFile() {
        return this.externalFile;
    }

    public final Long getFileId() {
        return this.fileId;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final YesNoApiEntity getHasClientProlAgreement() {
        return this.hasClientProlAgreement;
    }

    public final Number getId() {
        return this.f60513id;
    }

    public final Number getIntAccrued() {
        return this.intAccrued;
    }

    public final String getIntWithPeriodType() {
        return this.intWithPeriodType;
    }

    public final String getIntWithPeriodTypeKey() {
        return this.intWithPeriodTypeKey;
    }

    public final String getIntWithPeriodTypeValue() {
        return this.intWithPeriodTypeValue;
    }

    public final Number getInterestAccrued() {
        return this.interestAccrued;
    }

    public final Number getInterestRate() {
        return this.interestRate;
    }

    public final String getInterestWithdrawnTotal() {
        return this.interestWithdrawnTotal;
    }

    public final Long getIssueDate() {
        return this.issueDate;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final Long getMainAccountKey() {
        return this.mainAccountKey;
    }

    public final Number getMarketValue() {
        return this.marketValue;
    }

    public final Number getMarketValueBase() {
        return this.marketValueBase;
    }

    public final Long getMaturityDate() {
        return this.maturityDate;
    }

    public final Number getMinAccrualBalance() {
        return this.minAccrualBalance;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getNextWithdrawalDate() {
        return this.nextWithdrawalDate;
    }

    public final Number getNominalValue() {
        return this.nominalValue;
    }

    public final String getPeriodType() {
        return this.periodType;
    }

    public final String getPeriodTypeNameDctKey() {
        return this.periodTypeNameDctKey;
    }

    public final String getPeriodTypeNameDctValue() {
        return this.periodTypeNameDctValue;
    }

    public final Number getPfmAcctBalance() {
        return this.pfmAcctBalance;
    }

    public final Long getPfmAcctId() {
        return this.pfmAcctId;
    }

    public final Number getPrincipalValueTotal() {
        return this.principalValueTotal;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final List<String> getProductFunctions() {
        return this.productFunctions;
    }

    public final String getProductGroup() {
        return this.productGroup;
    }

    public final Long getProductId() {
        return this.productId;
    }

    public final YesNoApiEntity getProlongable() {
        return this.prolongable;
    }

    public final String getPurposeDictionaryKey() {
        return this.purposeDictionaryKey;
    }

    public final String getPurposeDictionaryValue() {
        return this.purposeDictionaryValue;
    }

    public final List<SavingGoalEntity> getSavingGoals() {
        return this.savingGoals;
    }

    public final YesNoApiEntity getShowCasAmount() {
        return this.showCasAmount;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public final YesNoApiEntity getStoExists() {
        return this.stoExists;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final Long getTechAcctKey() {
        return this.techAcctKey;
    }

    public final Number getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        int hashCode = this.collectionType.hashCode() * 31;
        Number number = this.f60513id;
        int i = 0;
        int hashCode2 = (hashCode + (number == null ? 0 : number.hashCode())) * 31;
        Long l = this.agreeKey;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.clientKey;
        int hashCode4 = (((hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.prodType.hashCode()) * 31;
        String str = this.name;
        int hashCode5 = (((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.ccy.hashCode()) * 31;
        String str2 = this.depositType;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.nextWithdrawalDate;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Number number2 = this.accrualBalance;
        int hashCode8 = (hashCode7 + (number2 == null ? 0 : number2.hashCode())) * 31;
        Long l4 = this.accountKey;
        int hashCode9 = (hashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.techAcctKey;
        int hashCode10 = (hashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.mainAccountKey;
        int hashCode11 = (hashCode10 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str3 = this.acctNo;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Number number3 = this.currentBalance;
        int hashCode13 = (hashCode12 + (number3 == null ? 0 : number3.hashCode())) * 31;
        Number number4 = this.bcBalance;
        int hashCode14 = (hashCode13 + (number4 == null ? 0 : number4.hashCode())) * 31;
        Number number5 = this.availableAmount;
        int hashCode15 = (hashCode14 + (number5 == null ? 0 : number5.hashCode())) * 31;
        Long l7 = this.productId;
        int hashCode16 = (hashCode15 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str4 = this.productGroup;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.isHidden;
        int hashCode18 = (hashCode17 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.isDefault;
        int hashCode19 = (hashCode18 + (yesNoApiEntity2 == null ? 0 : yesNoApiEntity2.hashCode())) * 31;
        String str5 = this.attachmentId;
        int hashCode20 = (hashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l8 = this.fileId;
        int hashCode21 = (hashCode20 + (l8 == null ? 0 : l8.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity3 = this.isBreakable;
        int hashCode22 = (hashCode21 + (yesNoApiEntity3 == null ? 0 : yesNoApiEntity3.hashCode())) * 31;
        Long l9 = this.applicationId;
        int hashCode23 = (hashCode22 + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str6 = this.class2;
        int hashCode24 = (hashCode23 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Number number6 = this.minAccrualBalance;
        int hashCode25 = (hashCode24 + (number6 == null ? 0 : number6.hashCode())) * 31;
        String str7 = this.subType;
        int hashCode26 = (((hashCode25 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.dictionaryKey.hashCode()) * 31;
        String str8 = this.dictionaryValue;
        int hashCode27 = (hashCode26 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list = this.productFunctions;
        int hashCode28 = (hashCode27 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.attachmentUrl;
        int hashCode29 = (hashCode28 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.depositPdfUrl;
        int hashCode30 = (hashCode29 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<SavingGoalEntity> list2 = this.savingGoals;
        int hashCode31 = (hashCode30 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l12 = this.pfmAcctId;
        int hashCode32 = (hashCode31 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Number number7 = this.pfmAcctBalance;
        int hashCode33 = (hashCode32 + (number7 == null ? 0 : number7.hashCode())) * 31;
        ExternalFileEntity externalFileEntity = this.externalFile;
        int hashCode34 = (hashCode33 + (externalFileEntity == null ? 0 : externalFileEntity.hashCode())) * 31;
        String str11 = this.depositProdType;
        int hashCode35 = (hashCode34 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l13 = this.maturityDate;
        int hashCode36 = (hashCode35 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.startDate;
        int hashCode37 = (hashCode36 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Number number8 = this.intAccrued;
        int hashCode38 = (hashCode37 + (number8 == null ? 0 : number8.hashCode())) * 31;
        String str12 = this.status;
        int hashCode39 = (hashCode38 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Long l15 = this.closeDate;
        int hashCode40 = (hashCode39 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str13 = this.agrPurpose;
        int hashCode41 = (hashCode40 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l16 = this.agrPurposeId;
        int hashCode42 = (hashCode41 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str14 = this.periodType;
        int hashCode43 = (hashCode42 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.agreeNo;
        int hashCode44 = (hashCode43 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Number number9 = this.interestRate;
        int hashCode45 = (hashCode44 + (number9 == null ? 0 : number9.hashCode())) * 31;
        Number number10 = this.totalBalance;
        int hashCode46 = (hashCode45 + (number10 == null ? 0 : number10.hashCode())) * 31;
        Number number11 = this.casAmount;
        int hashCode47 = (hashCode46 + (number11 == null ? 0 : number11.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity4 = this.showCasAmount;
        int hashCode48 = (hashCode47 + (yesNoApiEntity4 == null ? 0 : yesNoApiEntity4.hashCode())) * 31;
        String str16 = this.periodTypeNameDctKey;
        int hashCode49 = (hashCode48 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.periodTypeNameDctValue;
        int hashCode50 = (hashCode49 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.purposeDictionaryKey;
        int hashCode51 = (hashCode50 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.purposeDictionaryValue;
        int hashCode52 = (hashCode51 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Long l17 = this.cdGroupId;
        int hashCode53 = (hashCode52 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str20 = this.cdType;
        int hashCode54 = (hashCode53 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Long l18 = this.issueDate;
        int hashCode55 = (hashCode54 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Number number12 = this.nominalValue;
        int hashCode56 = (hashCode55 + (number12 == null ? 0 : number12.hashCode())) * 31;
        String str21 = this.currencyCode;
        int hashCode57 = (hashCode56 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Number number13 = this.discount;
        int hashCode58 = (hashCode57 + (number13 == null ? 0 : number13.hashCode())) * 31;
        Number number14 = this.interestAccrued;
        int hashCode59 = (hashCode58 + (number14 == null ? 0 : number14.hashCode())) * 31;
        Number number15 = this.marketValue;
        int hashCode60 = (hashCode59 + (number15 == null ? 0 : number15.hashCode())) * 31;
        Number number16 = this.principalValueTotal;
        int hashCode61 = (hashCode60 + (number16 == null ? 0 : number16.hashCode())) * 31;
        Number number17 = this.marketValueBase;
        int hashCode62 = (hashCode61 + (number17 == null ? 0 : number17.hashCode())) * 31;
        Number number18 = this.cdAmount;
        int hashCode63 = (hashCode62 + (number18 == null ? 0 : number18.hashCode())) * 31;
        String str22 = this.issuer;
        int hashCode64 = (hashCode63 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.dataSource;
        int hashCode65 = (hashCode64 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.intWithPeriodType;
        int hashCode66 = (hashCode65 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Long l19 = this.acctKey;
        int hashCode67 = (hashCode66 + (l19 == null ? 0 : l19.hashCode())) * 31;
        String str25 = this.cdTypeDictionaryKey;
        int hashCode68 = (hashCode67 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.cdTypeDictionaryValue;
        int hashCode69 = (hashCode68 + (str26 == null ? 0 : str26.hashCode())) * 31;
        List<CdsDetailsEntity> list3 = this.cdsDetails;
        int hashCode70 = (hashCode69 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str27 = this.bondPdfUrl;
        int hashCode71 = (hashCode70 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.intWithPeriodTypeKey;
        int hashCode72 = (hashCode71 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.intWithPeriodTypeValue;
        int hashCode73 = (hashCode72 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.interestWithdrawnTotal;
        int hashCode74 = (hashCode73 + (str30 == null ? 0 : str30.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity5 = this.stoExists;
        int hashCode75 = (hashCode74 + (yesNoApiEntity5 == null ? 0 : yesNoApiEntity5.hashCode())) * 31;
        String str31 = this.firstName;
        int hashCode76 = (hashCode75 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.lastName;
        int hashCode77 = (hashCode76 + (str32 == null ? 0 : str32.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity6 = this.prolongable;
        int hashCode78 = (hashCode77 + (yesNoApiEntity6 == null ? 0 : yesNoApiEntity6.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity7 = this.hasClientProlAgreement;
        int hashCode79 = (hashCode78 + (yesNoApiEntity7 == null ? 0 : yesNoApiEntity7.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity8 = this.isProlongAllowed;
        if (yesNoApiEntity8 != null) {
            i = yesNoApiEntity8.hashCode();
        }
        return hashCode79 + i;
    }

    public final YesNoApiEntity isBreakable() {
        return this.isBreakable;
    }

    public final YesNoApiEntity isDefault() {
        return this.isDefault;
    }

    public final YesNoApiEntity isHidden() {
        return this.isHidden;
    }

    public final YesNoApiEntity isProlongAllowed() {
        return this.isProlongAllowed;
    }

    public String toString() {
        CollectionTypeEntity collectionTypeEntity = this.collectionType;
        Number number = this.f60513id;
        Long l = this.agreeKey;
        Long l2 = this.clientKey;
        String str = this.prodType;
        String str2 = this.name;
        String str3 = this.ccy;
        String str4 = this.depositType;
        Long l3 = this.nextWithdrawalDate;
        Number number2 = this.accrualBalance;
        Long l4 = this.accountKey;
        Long l5 = this.techAcctKey;
        Long l6 = this.mainAccountKey;
        String str5 = this.acctNo;
        Number number3 = this.currentBalance;
        Number number4 = this.bcBalance;
        Number number5 = this.availableAmount;
        Long l7 = this.productId;
        String str6 = this.productGroup;
        YesNoApiEntity yesNoApiEntity = this.isHidden;
        YesNoApiEntity yesNoApiEntity2 = this.isDefault;
        String str7 = this.attachmentId;
        Long l8 = this.fileId;
        YesNoApiEntity yesNoApiEntity3 = this.isBreakable;
        Long l9 = this.applicationId;
        String str8 = this.class2;
        Number number6 = this.minAccrualBalance;
        String str9 = this.subType;
        String str10 = this.dictionaryKey;
        String str11 = this.dictionaryValue;
        List<String> list = this.productFunctions;
        String str12 = this.attachmentUrl;
        String str13 = this.depositPdfUrl;
        List<SavingGoalEntity> list2 = this.savingGoals;
        Long l12 = this.pfmAcctId;
        Number number7 = this.pfmAcctBalance;
        ExternalFileEntity externalFileEntity = this.externalFile;
        String str14 = this.depositProdType;
        Long l13 = this.maturityDate;
        Long l14 = this.startDate;
        Number number8 = this.intAccrued;
        String str15 = this.status;
        Long l15 = this.closeDate;
        String str16 = this.agrPurpose;
        Long l16 = this.agrPurposeId;
        String str17 = this.periodType;
        String str18 = this.agreeNo;
        Number number9 = this.interestRate;
        Number number10 = this.totalBalance;
        Number number11 = this.casAmount;
        YesNoApiEntity yesNoApiEntity4 = this.showCasAmount;
        String str19 = this.periodTypeNameDctKey;
        String str20 = this.periodTypeNameDctValue;
        String str21 = this.purposeDictionaryKey;
        String str22 = this.purposeDictionaryValue;
        Long l17 = this.cdGroupId;
        String str23 = this.cdType;
        Long l18 = this.issueDate;
        Number number12 = this.nominalValue;
        String str24 = this.currencyCode;
        Number number13 = this.discount;
        Number number14 = this.interestAccrued;
        Number number15 = this.marketValue;
        Number number16 = this.principalValueTotal;
        Number number17 = this.marketValueBase;
        Number number18 = this.cdAmount;
        String str25 = this.issuer;
        String str26 = this.dataSource;
        String str27 = this.intWithPeriodType;
        Long l19 = this.acctKey;
        String str28 = this.cdTypeDictionaryKey;
        String str29 = this.cdTypeDictionaryValue;
        List<CdsDetailsEntity> list3 = this.cdsDetails;
        String str30 = this.bondPdfUrl;
        String str31 = this.intWithPeriodTypeKey;
        String str32 = this.intWithPeriodTypeValue;
        String str33 = this.interestWithdrawnTotal;
        YesNoApiEntity yesNoApiEntity5 = this.stoExists;
        String str34 = this.firstName;
        String str35 = this.lastName;
        YesNoApiEntity yesNoApiEntity6 = this.prolongable;
        YesNoApiEntity yesNoApiEntity7 = this.hasClientProlAgreement;
        YesNoApiEntity yesNoApiEntity8 = this.isProlongAllowed;
        return "DepositBondEntity(collectionType=" + collectionTypeEntity + ", id=" + number + ", agreeKey=" + l + ", clientKey=" + l2 + ", prodType=" + str + ", name=" + str2 + ", ccy=" + str3 + ", depositType=" + str4 + ", nextWithdrawalDate=" + l3 + ", accrualBalance=" + number2 + ", accountKey=" + l4 + ", techAcctKey=" + l5 + ", mainAccountKey=" + l6 + ", acctNo=" + str5 + ", currentBalance=" + number3 + ", bcBalance=" + number4 + ", availableAmount=" + number5 + ", productId=" + l7 + ", productGroup=" + str6 + ", isHidden=" + yesNoApiEntity + ", isDefault=" + yesNoApiEntity2 + ", attachmentId=" + str7 + ", fileId=" + l8 + ", isBreakable=" + yesNoApiEntity3 + ", applicationId=" + l9 + ", class2=" + str8 + ", minAccrualBalance=" + number6 + ", subType=" + str9 + ", dictionaryKey=" + str10 + ", dictionaryValue=" + str11 + ", productFunctions=" + list + ", attachmentUrl=" + str12 + ", depositPdfUrl=" + str13 + ", savingGoals=" + list2 + ", pfmAcctId=" + l12 + ", pfmAcctBalance=" + number7 + ", externalFile=" + externalFileEntity + ", depositProdType=" + str14 + ", maturityDate=" + l13 + ", startDate=" + l14 + ", intAccrued=" + number8 + ", status=" + str15 + ", closeDate=" + l15 + ", agrPurpose=" + str16 + ", agrPurposeId=" + l16 + ", periodType=" + str17 + ", agreeNo=" + str18 + ", interestRate=" + number9 + ", totalBalance=" + number10 + ", casAmount=" + number11 + ", showCasAmount=" + yesNoApiEntity4 + ", periodTypeNameDctKey=" + str19 + ", periodTypeNameDctValue=" + str20 + ", purposeDictionaryKey=" + str21 + ", purposeDictionaryValue=" + str22 + ", cdGroupId=" + l17 + ", cdType=" + str23 + ", issueDate=" + l18 + ", nominalValue=" + number12 + ", currencyCode=" + str24 + ", discount=" + number13 + ", interestAccrued=" + number14 + ", marketValue=" + number15 + ", principalValueTotal=" + number16 + ", marketValueBase=" + number17 + ", cdAmount=" + number18 + ", issuer=" + str25 + ", dataSource=" + str26 + ", intWithPeriodType=" + str27 + ", acctKey=" + l19 + ", cdTypeDictionaryKey=" + str28 + ", cdTypeDictionaryValue=" + str29 + ", cdsDetails=" + list3 + ", bondPdfUrl=" + str30 + ", intWithPeriodTypeKey=" + str31 + ", intWithPeriodTypeValue=" + str32 + ", interestWithdrawnTotal=" + str33 + ", stoExists=" + yesNoApiEntity5 + ", firstName=" + str34 + ", lastName=" + str35 + ", prolongable=" + yesNoApiEntity6 + ", hasClientProlAgreement=" + yesNoApiEntity7 + ", isProlongAllowed=" + yesNoApiEntity8 + ")";
    }
}
