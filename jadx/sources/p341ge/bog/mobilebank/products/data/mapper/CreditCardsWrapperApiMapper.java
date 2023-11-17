package p341ge.bog.mobilebank.products.data.mapper;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.model.BillInfoApiModel;
import p341ge.bog.mobilebank.products.data.model.CreditCardAccountApiModel;
import p341ge.bog.mobilebank.products.data.model.CreditCardDetailApiModel;
import p341ge.bog.mobilebank.products.data.model.CreditCardSummeryApiModel;
import p341ge.bog.mobilebank.products.data.model.CreditCardsWrapperApiModel;
import p341ge.bog.mobilebank.products.data.model.CreditMrInsuranceApiModel;
import p341ge.bog.mobilebank.products.domain.model.BillInfo;
import p341ge.bog.mobilebank.products.domain.model.CreditCardAccount;
import p341ge.bog.mobilebank.products.domain.model.CreditMRInsurance;
import xy0.C39942f;
import xy0.C39946j;
import xy0.C39947k;
import xy0.C39948l;

/* renamed from: ge.bog.mobilebank.products.data.mapper.CreditCardsWrapperApiMapper */
public final class CreditCardsWrapperApiMapper {
    public final C39948l convert(CreditCardsWrapperApiModel creditCardsWrapperApiModel) {
        C41536l.m120489i(creditCardsWrapperApiModel, "creditCardsWrapperApiModel");
        C39947k convert = convert(creditCardsWrapperApiModel.getCardsContainer().getSummary());
        List<CreditCardAccountApiModel> accounts = creditCardsWrapperApiModel.getCardsContainer().getAccounts();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(accounts, 10));
        for (CreditCardAccountApiModel convert2 : accounts) {
            arrayList.add(convert(convert2));
        }
        C39942f fVar = new C39942f(convert, arrayList);
        List<BillInfoApiModel> billInfo = creditCardsWrapperApiModel.getBillInfo();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(billInfo, 10));
        for (BillInfoApiModel convert3 : billInfo) {
            arrayList2.add(convert(convert3));
        }
        List<CreditCardDetailApiModel> details = creditCardsWrapperApiModel.getDetails();
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(details, 10));
        for (CreditCardDetailApiModel convert4 : details) {
            arrayList3.add(convert(convert4));
        }
        return new C39948l(fVar, arrayList2, arrayList3);
    }

    private final BillInfo convert(BillInfoApiModel billInfoApiModel) {
        long id = billInfoApiModel.getId();
        long acctKey = billInfoApiModel.getAcctKey();
        String firstName = billInfoApiModel.getFirstName();
        String lastName = billInfoApiModel.getLastName();
        String cardAcctNo = billInfoApiModel.getCardAcctNo();
        String ccy = billInfoApiModel.getCcy();
        if (ccy == null) {
            ccy = "GEL";
        }
        String str = ccy;
        BigDecimal creditLimit = billInfoApiModel.getCreditLimit();
        Long startDate = billInfoApiModel.getStartDate();
        Double closingBalance = billInfoApiModel.getClosingBalance();
        Double minimumPaymentDue = billInfoApiModel.getMinimumPaymentDue();
        Double baseAmount = billInfoApiModel.getBaseAmount();
        Double interests = billInfoApiModel.getInterests();
        Double commissions = billInfoApiModel.getCommissions();
        Long dueDate = billInfoApiModel.getDueDate();
        Long inpSysdate = billInfoApiModel.getInpSysdate();
        Double overdraftLimit = billInfoApiModel.getOverdraftLimit();
        Double minimumPayment = billInfoApiModel.getMinimumPayment();
        double d = Utils.DOUBLE_EPSILON;
        double doubleValue = minimumPayment != null ? minimumPayment.doubleValue() : 0.0d;
        Double fullPaymentDue = billInfoApiModel.getFullPaymentDue();
        Double overusedLimit = billInfoApiModel.getOverusedLimit();
        if (overusedLimit != null) {
            d = overusedLimit.doubleValue();
        }
        return new BillInfo(id, acctKey, firstName, lastName, cardAcctNo, str, creditLimit, startDate, closingBalance, minimumPaymentDue, baseAmount, interests, commissions, dueDate, inpSysdate, overdraftLimit, doubleValue, fullPaymentDue, d, billInfoApiModel.getFullPaymentAmt());
    }

    private final C39946j convert(CreditCardDetailApiModel creditCardDetailApiModel) {
        return new C39946j(creditCardDetailApiModel.getAcctKey(), creditCardDetailApiModel.getAtmPercent(), creditCardDetailApiModel.getPosPercent(), creditCardDetailApiModel.getOverdraftLimit(), creditCardDetailApiModel.getFileUrl(), creditCardDetailApiModel.getFileId());
    }

    private final C39947k convert(CreditCardSummeryApiModel creditCardSummeryApiModel) {
        Long acctKey = creditCardSummeryApiModel.getAcctKey();
        String acctName = creditCardSummeryApiModel.getAcctName();
        String printAcctNo = creditCardSummeryApiModel.getPrintAcctNo();
        BigDecimal availableAmount = creditCardSummeryApiModel.getAvailableAmount();
        BigDecimal amount = creditCardSummeryApiModel.getAmount();
        if (amount == null) {
            amount = new BigDecimal(0);
        }
        BigDecimal bigDecimal = amount;
        String ccy = creditCardSummeryApiModel.getCcy();
        if (ccy == null) {
            ccy = "GEL";
        }
        return new C39947k(acctKey, acctName, printAcctNo, availableAmount, bigDecimal, ccy, creditCardSummeryApiModel.getOrderNo(), creditCardSummeryApiModel.getProductCode(), creditCardSummeryApiModel.getProductDictionaryKey(), creditCardSummeryApiModel.getCardTypes(), creditCardSummeryApiModel.getCardSubProduct(), creditCardSummeryApiModel.getCardSubProductGroups(), creditCardSummeryApiModel.getNameDictionaryKey(), creditCardSummeryApiModel.getCardTypeList(), creditCardSummeryApiModel.getCardSubProductGroupList());
    }

    private final CreditCardAccount convert(CreditCardAccountApiModel creditCardAccountApiModel) {
        ArrayList arrayList;
        String str;
        String str2;
        long acctKey = creditCardAccountApiModel.getAcctKey();
        String acctName = creditCardAccountApiModel.getAcctName();
        if (acctName == null) {
            acctName = "";
        }
        String str3 = acctName;
        String printAcctNo = creditCardAccountApiModel.getPrintAcctNo();
        double availableAmount = creditCardAccountApiModel.getAvailableAmount();
        BigDecimal amount = creditCardAccountApiModel.getAmount();
        if (amount == null) {
            amount = new BigDecimal(0);
        }
        BigDecimal bigDecimal = amount;
        String ccy = creditCardAccountApiModel.getCcy();
        int orderNo = creditCardAccountApiModel.getOrderNo();
        String productCode = creditCardAccountApiModel.getProductCode();
        String productDictionaryKey = creditCardAccountApiModel.getProductDictionaryKey();
        String cardTypes = creditCardAccountApiModel.getCardTypes();
        String cardSubProduct = creditCardAccountApiModel.getCardSubProduct();
        String cardSubProductGroups = creditCardAccountApiModel.getCardSubProductGroups();
        List<String> widgetList = creditCardAccountApiModel.getWidgetList();
        if (widgetList == null) {
            widgetList = C41341q.m119907j();
        }
        List<String> list = widgetList;
        long cardId = creditCardAccountApiModel.getCardId();
        String nameDictionaryKey = creditCardAccountApiModel.getNameDictionaryKey();
        List<String> cardTypeList = creditCardAccountApiModel.getCardTypeList();
        List<String> cardSubProductGroupList = creditCardAccountApiModel.getCardSubProductGroupList();
        if (cardSubProductGroupList == null) {
            cardSubProductGroupList = C41341q.m119907j();
        }
        List<String> list2 = cardSubProductGroupList;
        boolean isHasMR = creditCardAccountApiModel.isHasMR();
        boolean hasCashback = creditCardAccountApiModel.getHasCashback();
        boolean hasInstallment = creditCardAccountApiModel.getHasInstallment();
        BillInfo convert = creditCardAccountApiModel.getBillInfo() != null ? convert(creditCardAccountApiModel.getBillInfo()) : null;
        BigDecimal atmPercent = creditCardAccountApiModel.getAtmPercent();
        BigDecimal posPercent = creditCardAccountApiModel.getPosPercent();
        String attachmentUrl = creditCardAccountApiModel.getAttachmentUrl();
        List<String> productFunctions = creditCardAccountApiModel.getProductFunctions();
        if (productFunctions == null) {
            productFunctions = C41341q.m119907j();
        }
        List<String> list3 = productFunctions;
        long productId = creditCardAccountApiModel.getProductId();
        List<CreditMrInsuranceApiModel> mrInsurance = creditCardAccountApiModel.getMrInsurance();
        if (mrInsurance != null) {
            str2 = cardSubProductGroups;
            str = cardSubProduct;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(mrInsurance, 10));
            for (CreditMrInsuranceApiModel convert2 : mrInsurance) {
                arrayList2.add(convert(convert2));
            }
            arrayList = arrayList2;
        } else {
            str = cardSubProduct;
            str2 = cardSubProductGroups;
            arrayList = C41341q.m119907j();
        }
        return new CreditCardAccount(acctKey, str3, printAcctNo, availableAmount, bigDecimal, ccy, orderNo, productCode, productDictionaryKey, cardTypes, str, str2, list, cardId, nameDictionaryKey, cardTypeList, list2, isHasMR, hasCashback, hasInstallment, convert, atmPercent, posPercent, attachmentUrl, list3, productId, arrayList, creditCardAccountApiModel.getOverdraftLimit(), creditCardAccountApiModel.getCardPdfUrl());
    }

    private final CreditMRInsurance convert(CreditMrInsuranceApiModel creditMrInsuranceApiModel) {
        return new CreditMRInsurance(creditMrInsuranceApiModel.getAcctKey(), creditMrInsuranceApiModel.getCardId(), creditMrInsuranceApiModel.getLanguageCode(), creditMrInsuranceApiModel.getClientKey(), creditMrInsuranceApiModel.getCardClass(), creditMrInsuranceApiModel.getCardType(), creditMrInsuranceApiModel.getSubProductCode(), creditMrInsuranceApiModel.getLastFour(), creditMrInsuranceApiModel.getCardTypeName(), creditMrInsuranceApiModel.getInsuranceCode(), creditMrInsuranceApiModel.getExpDate(), creditMrInsuranceApiModel.getInsuranceText(), creditMrInsuranceApiModel.getProductUrl(), creditMrInsuranceApiModel.getCardConditionsUrl(), creditMrInsuranceApiModel.getPhoneNumber(), creditMrInsuranceApiModel.getExpDateMillis(), creditMrInsuranceApiModel.getAttachmentFileBase64());
    }
}
