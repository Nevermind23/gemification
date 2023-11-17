package p781ht;

import ci1.C40458f;
import ci1.C40472t;
import com.salesforce.marketingcloud.C11398b;
import ed1.C40762x;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsSumApiEntity;

/* renamed from: ht.a */
public interface C25057a {

    /* renamed from: ht.a$a */
    public static final class C25058a {
        /* renamed from: a */
        public static /* synthetic */ C40762x m80009a(C25057a aVar, String str, String str2, String str3, int i, Integer num, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i2, Object obj) {
            Integer num3;
            Integer num4;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            int i3 = i2;
            if (obj == null) {
                if ((i3 & 16) != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if ((i3 & 32) != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if ((i3 & 64) != 0) {
                    str13 = null;
                } else {
                    str13 = str4;
                }
                if ((i3 & 128) != 0) {
                    str14 = null;
                } else {
                    str14 = str5;
                }
                if ((i3 & C11398b.f33139r) != 0) {
                    str15 = null;
                } else {
                    str15 = str6;
                }
                if ((i3 & C11398b.f33140s) != 0) {
                    str16 = null;
                } else {
                    str16 = str7;
                }
                if ((i3 & C11398b.f33141t) != 0) {
                    str17 = null;
                } else {
                    str17 = str8;
                }
                if ((i3 & C11398b.f33142u) != 0) {
                    str18 = null;
                } else {
                    str18 = str9;
                }
                if ((i3 & C11398b.f33143v) != 0) {
                    str19 = null;
                } else {
                    str19 = str10;
                }
                if ((i3 & 16384) != 0) {
                    str20 = "canSplitUntil,clientKey,prodGroup,docKey,entryId,essId,operationTitle,nominationOriginal,beneficiary,docNomination,nomination,merchantId,essServiceId,groupImageId,postDate,authDate,operationDate,bonusPoint,status,canCopy,amount,ccy,merchantName,entryGroupNameId,sourceEntryGroup,cashbackAmount,productName,prodGroup,entryType,printSwift,isInternalOperation,transferBankBic,printFormType,sourceEntryGroup,merchantNameInt,counterPartyClient,hasTransferBack,essId,bonusInfo,essServiceId,bonusPoint,amountBase,pfmId,pfmTags,pfmSplit,pfmTagId,pfmTagName,pfmCatName,pfmForecast,pfmRecurring,pfmComputable,pfmParentCatId,pfmParentCatName,pfmCatId,bonusType,accountKey,bonusPoint,bonusType,beneficiaryAccount,bonusType,bonusPoint,authDate,merchantClientId,printAccountNo";
                } else {
                    str20 = str12;
                }
                return aVar.mo63494b(str, str2, str3, i, num3, num4, str13, str14, str15, str16, str17, str18, str19, str11, str20);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransactions");
        }

        /* renamed from: b */
        public static /* synthetic */ C40762x m80010b(C25057a aVar, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, String str12, String str13, int i2, String str14, int i3, Object obj) {
            Integer num3;
            Integer num4;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            int i4;
            String str22;
            String str23;
            int i5;
            String str24;
            int i6 = i3;
            if (obj == null) {
                if ((i6 & 8) != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if ((i6 & 16) != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if ((i6 & 32) != 0) {
                    str15 = null;
                } else {
                    str15 = str4;
                }
                if ((i6 & 64) != 0) {
                    str16 = null;
                } else {
                    str16 = str5;
                }
                if ((i6 & 128) != 0) {
                    str17 = null;
                } else {
                    str17 = str6;
                }
                if ((i6 & C11398b.f33139r) != 0) {
                    str18 = null;
                } else {
                    str18 = str7;
                }
                if ((i6 & C11398b.f33140s) != 0) {
                    str19 = null;
                } else {
                    str19 = str8;
                }
                if ((i6 & C11398b.f33141t) != 0) {
                    str20 = null;
                } else {
                    str20 = str9;
                }
                if ((i6 & C11398b.f33142u) != 0) {
                    str21 = null;
                } else {
                    str21 = str10;
                }
                if ((i6 & 8192) != 0) {
                    i4 = 1;
                } else {
                    i4 = i;
                }
                if ((i6 & 16384) != 0) {
                    str22 = "N";
                } else {
                    str22 = str12;
                }
                if ((32768 & i6) != 0) {
                    str23 = "docDirection";
                } else {
                    str23 = str13;
                }
                if ((65536 & i6) != 0) {
                    i5 = 1;
                } else {
                    i5 = i2;
                }
                if ((i6 & 131072) != 0) {
                    str24 = "canSplitUntil,clientKey,prodGroup,docKey,entryId,essId,operationTitle,nominationOriginal,beneficiary,docNomination,nomination,merchantId,essServiceId,groupImageId,postDate,authDate,operationDate,bonusPoint,status,canCopy,amount,ccy,merchantName,entryGroupNameId,sourceEntryGroup,cashbackAmount,productName,prodGroup,entryType,printSwift,isInternalOperation,transferBankBic,printFormType,sourceEntryGroup,merchantNameInt,counterPartyClient,hasTransferBack,essId,bonusInfo,essServiceId,bonusPoint,amountBase,pfmId,pfmTags,pfmSplit,pfmTagId,pfmTagName,pfmCatName,pfmForecast,pfmRecurring,pfmComputable,pfmParentCatId,pfmParentCatName,pfmCatId,bonusType,accountKey,bonusPoint,bonusType,beneficiaryAccount,bonusType,bonusPoint,authDate,merchantClientId,printAccountNo";
                } else {
                    str24 = str14;
                }
                return aVar.mo63493a(str, str2, str3, num3, num4, str15, str16, str17, str18, str19, str20, str21, str11, i4, str22, str23, i5, str24);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransactionsSum");
        }
    }

    @C40458f("statements")
    /* renamed from: a */
    C40762x<TransactionsSumApiEntity> mo63493a(@C40472t("clientKey") String str, @C40472t("operationDateTimeUpperBound") String str2, @C40472t("operationDateTimeLowerBound") String str3, @C40472t("amountLowerBound") Integer num, @C40472t("amountUpperBound") Integer num2, @C40472t("nomination") String str4, @C40472t("accountKeys") String str5, @C40472t("cardIds") String str6, @C40472t("pfmCatIds") String str7, @C40472t("ccys") String str8, @C40472t("searchAndSort") String str9, @C40472t("printAccountNos") String str10, @C40472t("lastOperationsFlag") String str11, @C40472t("limit") int i, @C40472t("isInternalOperation") String str12, @C40472t("includeAggregations") String str13, @C40472t("pfmComputable") int i2, @C40472t("includeFields") String str14);

    @C40458f("statements")
    /* renamed from: b */
    C40762x<TransactionsApiEntity> mo63494b(@C40472t("clientKey") String str, @C40472t("operationDateTimeUpperBound") String str2, @C40472t("operationDateTimeLowerBound") String str3, @C40472t("limit") int i, @C40472t("amountLowerBound") Integer num, @C40472t("amountUpperBound") Integer num2, @C40472t("nomination") String str4, @C40472t("accountKeys") String str5, @C40472t("cardIds") String str6, @C40472t("pfmCatIds") String str7, @C40472t("ccys") String str8, @C40472t("searchAndSort") String str9, @C40472t("printAccountNos") String str10, @C40472t("lastOperationsFlag") String str11, @C40472t("includeFields") String str12);
}
