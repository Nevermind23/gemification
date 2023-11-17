package p341ge.bog.mobilebank.products.data.mapper;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.CreditCardDetail;
import p341ge.bog.mobilebank.model.CreditMRInsurance;
import p341ge.bog.mobilebank.model.credit.BillInfo;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.credit.CreditCardSummery;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import xy0.C39942f;
import xy0.C39946j;
import xy0.C39947k;
import xy0.C39948l;

/* renamed from: ge.bog.mobilebank.products.data.mapper.CreditCardsLegacyWrapperMapper */
public final class CreditCardsLegacyWrapperMapper {
    public final C39948l convert(CreditCardsWrapper creditCardsWrapper) {
        C41536l.m120489i(creditCardsWrapper, "creditCardsWrapperApiModel");
        CreditCardSummery summary = creditCardsWrapper.getCardsContainer().getSummary();
        C41536l.m120488h(summary, "creditCardsWrapperApiModel.cardsContainer.summary");
        C39947k convert = convert(summary);
        ArrayList<CreditCardAccount> accounts = creditCardsWrapper.getCardsContainer().getAccounts();
        C41536l.m120488h(accounts, "creditCardsWrapperApiModel.cardsContainer.accounts");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(accounts, 10));
        for (CreditCardAccount convert2 : accounts) {
            arrayList.add(convert(convert2));
        }
        C39942f fVar = new C39942f(convert, arrayList);
        ArrayList<BillInfo> billInfo = creditCardsWrapper.getBillInfo();
        C41536l.m120488h(billInfo, "creditCardsWrapperApiModel.billInfo");
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(billInfo, 10));
        for (BillInfo convert3 : billInfo) {
            arrayList2.add(convert(convert3));
        }
        ArrayList<CreditCardDetail> details = creditCardsWrapper.getDetails();
        C41536l.m120488h(details, "creditCardsWrapperApiModel.details");
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(details, 10));
        for (CreditCardDetail convert4 : details) {
            arrayList3.add(convert(convert4));
        }
        return new C39948l(fVar, arrayList2, arrayList3);
    }

    private final p341ge.bog.mobilebank.products.domain.model.BillInfo convert(BillInfo billInfo) {
        BillInfo billInfo2 = billInfo;
        long j = billInfo2.f81308id;
        long j2 = billInfo2.acctKey;
        String str = billInfo2.firstName;
        String str2 = billInfo2.lastName;
        String str3 = billInfo2.cardAcctNo;
        String str4 = billInfo2.ccy;
        if (str4 == null) {
            str4 = "GEL";
        }
        BigDecimal bigDecimal = billInfo2.creditLimit;
        Long l = billInfo2.startDate;
        Double d = billInfo2.closingBalance;
        Double d2 = billInfo2.minimumPaymentDue;
        Double d3 = billInfo2.baseAmount;
        Double d4 = billInfo2.interests;
        Double d5 = billInfo2.commissions;
        Long l2 = billInfo2.dueDate;
        Long l3 = billInfo2.inpSysdate;
        Double d6 = billInfo2.overdraftLimit;
        Double d7 = billInfo2.minimumPayment;
        double d8 = Utils.DOUBLE_EPSILON;
        double doubleValue = d7 == null ? 0.0d : d7.doubleValue();
        Double d9 = billInfo2.fullPaymentDue;
        Double d12 = billInfo2.overusedLimit;
        if (d12 != null) {
            d8 = d12.doubleValue();
        }
        return new p341ge.bog.mobilebank.products.domain.model.BillInfo(j, j2, str, str2, str3, str4, bigDecimal, l, d, d2, d3, d4, d5, l2, l3, d6, doubleValue, d9, d8, billInfo2.fullPaymentAmt);
    }

    private final C39946j convert(CreditCardDetail creditCardDetail) {
        return new C39946j(creditCardDetail.getAcctKey(), creditCardDetail.getAtmPercent(), creditCardDetail.getPosPercent(), creditCardDetail.getOverdraftLimit(), creditCardDetail.fileUrl, creditCardDetail.fileId);
    }

    private final C39947k convert(CreditCardSummery creditCardSummery) {
        CreditCardSummery creditCardSummery2 = creditCardSummery;
        Long acctKey = creditCardSummery.getAcctKey();
        String str = creditCardSummery2.acctName;
        String str2 = creditCardSummery2.printAcctNo;
        BigDecimal bigDecimal = creditCardSummery2.availableAmount;
        BigDecimal bigDecimal2 = creditCardSummery2.amount;
        if (bigDecimal2 == null) {
            bigDecimal2 = new BigDecimal(0);
        }
        String str3 = creditCardSummery2.ccy;
        if (str3 == null) {
            str3 = "GEL";
        }
        return new C39947k(acctKey, str, str2, bigDecimal, bigDecimal2, str3, creditCardSummery2.orderNo, creditCardSummery2.productCode, creditCardSummery2.productDictionaryKey, creditCardSummery2.cardTypes, creditCardSummery2.cardSubProduct, creditCardSummery2.cardSubProductGroups, creditCardSummery2.nameDictionaryKey, creditCardSummery2.cardTypeList, creditCardSummery2.cardSubProductGroupList);
    }

    private final p341ge.bog.mobilebank.products.domain.model.CreditCardAccount convert(CreditCardAccount creditCardAccount) {
        p341ge.bog.mobilebank.products.domain.model.BillInfo billInfo;
        ArrayList arrayList;
        CreditCardAccount creditCardAccount2 = creditCardAccount;
        long j = creditCardAccount2.acctKey;
        String str = creditCardAccount2.acctName;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = creditCardAccount2.printAcctNo;
        C41536l.m120488h(str3, "creditCardAccountApiModel.printAcctNo");
        double doubleValue = creditCardAccount2.availableAmount.doubleValue();
        BigDecimal bigDecimal = creditCardAccount2.amount;
        if (bigDecimal == null) {
            bigDecimal = new BigDecimal(0);
        }
        BigDecimal bigDecimal2 = bigDecimal;
        String str4 = creditCardAccount2.ccy;
        C41536l.m120488h(str4, "creditCardAccountApiModel.ccy");
        int i = creditCardAccount2.orderNo;
        String str5 = creditCardAccount2.productCode;
        String str6 = creditCardAccount2.productDictionaryKey;
        String str7 = creditCardAccount2.cardTypes;
        String str8 = creditCardAccount2.cardSubProduct;
        String str9 = creditCardAccount2.cardSubProductGroups;
        List list = creditCardAccount2.widgetList;
        if (list == null) {
            list = C41341q.m119907j();
        }
        List list2 = list;
        String str10 = str7;
        String str11 = str8;
        long j2 = creditCardAccount2.cardId;
        String str12 = creditCardAccount2.nameDictionaryKey;
        long j3 = j2;
        C41536l.m120488h(str12, "creditCardAccountApiModel.nameDictionaryKey");
        ArrayList<String> arrayList2 = creditCardAccount2.cardTypeList;
        List list3 = creditCardAccount2.cardSubProductGroupList;
        if (list3 == null) {
            list3 = C41341q.m119907j();
        }
        List list4 = list3;
        boolean isHasMR = creditCardAccount.isHasMR();
        boolean z = creditCardAccount2.hasCashback;
        ArrayList<String> arrayList3 = arrayList2;
        boolean z2 = creditCardAccount2.hasInstallment;
        String str13 = str12;
        BillInfo billInfo2 = creditCardAccount2.billInfo;
        boolean z3 = z;
        if (billInfo2 != null) {
            C41536l.m120488h(billInfo2, "creditCardAccountApiModel.billInfo");
            billInfo = convert(billInfo2);
        } else {
            billInfo = null;
        }
        p341ge.bog.mobilebank.products.domain.model.BillInfo billInfo3 = billInfo;
        BigDecimal bigDecimal3 = creditCardAccount2.atmPercent;
        BigDecimal bigDecimal4 = creditCardAccount2.posPercent;
        boolean z4 = z2;
        String str14 = creditCardAccount2.attachmentUrl;
        BigDecimal bigDecimal5 = bigDecimal4;
        List list5 = creditCardAccount2.productFunctions;
        if (list5 == null) {
            list5 = C41341q.m119907j();
        }
        List list6 = list5;
        BigDecimal bigDecimal6 = bigDecimal3;
        String str15 = str14;
        long j4 = creditCardAccount2.productId;
        ArrayList<CreditMRInsurance> arrayList4 = creditCardAccount2.mrInsurance;
        long j5 = j4;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(C41343r.m119925u(arrayList4, 10));
            for (CreditMRInsurance convert : arrayList4) {
                arrayList5.add(convert(convert));
            }
            arrayList = arrayList5;
        } else {
            arrayList = C41341q.m119907j();
        }
        return new p341ge.bog.mobilebank.products.domain.model.CreditCardAccount(j, str2, str3, doubleValue, bigDecimal2, str4, i, str5, str6, str10, str11, str9, list2, j3, str13, arrayList3, list4, isHasMR, z3, z4, billInfo3, bigDecimal6, bigDecimal5, str15, list6, j5, arrayList, creditCardAccount2.overdraftLimit, creditCardAccount2.cardPdfUrl);
    }

    private final p341ge.bog.mobilebank.products.domain.model.CreditMRInsurance convert(CreditMRInsurance creditMRInsurance) {
        CreditMRInsurance creditMRInsurance2 = creditMRInsurance;
        return new p341ge.bog.mobilebank.products.domain.model.CreditMRInsurance(creditMRInsurance2.acctKey, creditMRInsurance2.cardId, creditMRInsurance2.languageCode, creditMRInsurance2.clientKey, creditMRInsurance2.cardClass, creditMRInsurance2.cardType, creditMRInsurance2.subProductCode, creditMRInsurance2.lastFour, creditMRInsurance2.cardTypeName, creditMRInsurance2.insuranceCode, creditMRInsurance2.expDate, creditMRInsurance2.insuranceText, creditMRInsurance2.productUrl, creditMRInsurance2.cardConditionsUrl, creditMRInsurance2.phoneNumber, creditMRInsurance2.expDateMillis, creditMRInsurance2.attachmentFileBase64);
    }
}
