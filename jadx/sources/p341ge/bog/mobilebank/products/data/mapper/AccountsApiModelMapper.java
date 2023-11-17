package p341ge.bog.mobilebank.products.data.mapper;

import com.github.mikephil.charting.utils.Utils;
import hd0.C24977a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import m70.C26148a;
import m70.C26149b;
import m70.C26150c;
import m70.C26151d;
import m70.C26152e;
import m70.C26153f;
import m70.C26154g;
import m70.C26155h;
import m70.C26156i;
import m70.C26157j;
import n70.C26374a;
import n70.C26375b;
import p341ge.bog.mobilebank.products.data.model.AccountAmountApiModel;
import p341ge.bog.mobilebank.products.data.model.AccountApiModel;
import p341ge.bog.mobilebank.products.data.model.AccountDetailsApiModel;
import p341ge.bog.mobilebank.products.data.model.AccountOverdraftParamsApiModel;
import p341ge.bog.mobilebank.products.data.model.AccountStudDepInfoApiModel;
import p341ge.bog.mobilebank.products.data.model.AccountSubAccountAmountSumsApiModel;
import p341ge.bog.mobilebank.products.data.model.AccountSubAccountsApiModel;
import p341ge.bog.mobilebank.products.data.model.AccountsAccountsApiModel;
import p341ge.bog.mobilebank.products.data.model.AccountsAndDetailsApiModel;
import p341ge.bog.mobilebank.products.data.model.ClosableAccountEntity;
import p341ge.bog.mobilebank.products.data.model.DeactivationAccountEntity;
import p341ge.bog.mobilebank.products.data.model.YesNoApiModel;

/* renamed from: ge.bog.mobilebank.products.data.mapper.AccountsApiModelMapper */
public final class AccountsApiModelMapper {
    private final List<C26375b> deactivationWarningsToDictionaryKeys(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String a : list) {
            C26375b a2 = C26375b.f66809f.mo65585a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public final C26156i convert(AccountsAndDetailsApiModel accountsAndDetailsApiModel) {
        C41536l.m120489i(accountsAndDetailsApiModel, "accountsAndDetailsAndDetails");
        C26155h convert = convert(accountsAndDetailsApiModel.getAccounts(), accountsAndDetailsApiModel.getDetails(), accountsAndDetailsApiModel.getOverdraftParams());
        List<AccountDetailsApiModel> details = accountsAndDetailsApiModel.getDetails();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(details, 10));
        for (AccountDetailsApiModel convert2 : details) {
            arrayList.add(convert(convert2, accountsAndDetailsApiModel.getOverdraftParams()));
        }
        List<AccountOverdraftParamsApiModel> overdraftParams = accountsAndDetailsApiModel.getOverdraftParams();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(overdraftParams, 10));
        for (AccountOverdraftParamsApiModel convert3 : overdraftParams) {
            arrayList2.add(convert(convert3));
        }
        return new C26156i(convert, arrayList, arrayList2);
    }

    private final C26155h convert(AccountsAccountsApiModel accountsAccountsApiModel, List<AccountDetailsApiModel> list, List<AccountOverdraftParamsApiModel> list2) {
        Double amount = accountsAccountsApiModel.getSummary().getAmount();
        double doubleValue = amount != null ? amount.doubleValue() : Utils.DOUBLE_EPSILON;
        String currency = accountsAccountsApiModel.getSummary().getCurrency();
        if (currency == null) {
            currency = "GEL";
        }
        C24977a aVar = new C24977a(doubleValue, currency);
        List<AccountApiModel> accounts = accountsAccountsApiModel.getAccounts();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(accounts, 10));
        for (AccountApiModel convert : accounts) {
            arrayList.add(convert(convert, list, list2));
        }
        Iterable subAccountRealAmountSums = accountsAccountsApiModel.getSubAccountRealAmountSums();
        if (subAccountRealAmountSums == null) {
            subAccountRealAmountSums = new ArrayList();
        }
        List<AccountSubAccountAmountSumsApiModel> t0 = C41358y.m120030t0(subAccountRealAmountSums, new AccountsApiModelMapper$convert$lambda$6$$inlined$sortedBy$1());
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(t0, 10));
        for (AccountSubAccountAmountSumsApiModel convert2 : t0) {
            arrayList2.add(convert(convert2));
        }
        return new C26155h(aVar, arrayList, arrayList2);
    }

    private final C26154g convert(AccountSubAccountAmountSumsApiModel accountSubAccountAmountSumsApiModel) {
        return new C26154g(accountSubAccountAmountSumsApiModel.getAmount(), accountSubAccountAmountSumsApiModel.getCcy(), accountSubAccountAmountSumsApiModel.getOrderNo());
    }

    private final C26148a convert(AccountApiModel accountApiModel, List<AccountDetailsApiModel> list, List<AccountOverdraftParamsApiModel> list2) {
        T t;
        long acctKey = accountApiModel.getAcctKey();
        String acctName = accountApiModel.getAcctName();
        String printAcctNo = accountApiModel.getPrintAcctNo();
        BigDecimal availableAmount = accountApiModel.getAvailableAmount();
        BigDecimal amount = accountApiModel.getAmount();
        String ccy = accountApiModel.getCcy();
        int orderNo = accountApiModel.getOrderNo();
        String productCode = accountApiModel.getProductCode();
        String productDictionaryKey = accountApiModel.getProductDictionaryKey();
        String subType = accountApiModel.getSubType();
        String ccyType = accountApiModel.getCcyType();
        long mainAcctKey = accountApiModel.getMainAcctKey();
        String productGroup = accountApiModel.getProductGroup();
        long productId = accountApiModel.getProductId();
        YesNoApiModel isDefault = accountApiModel.isDefault();
        String str = productGroup;
        YesNoApiModel yesNoApiModel = YesNoApiModel.YES;
        boolean z = isDefault == yesNoApiModel;
        boolean z2 = accountApiModel.isHidden() == yesNoApiModel;
        Long attachmentId = accountApiModel.getAttachmentId();
        BigDecimal overlimitAmountMc = accountApiModel.getOverlimitAmountMc();
        boolean z3 = accountApiModel.isCardExpiring() == yesNoApiModel;
        String isCardInactive = accountApiModel.isCardInactive();
        boolean z4 = accountApiModel.getHasDigitalCard() == yesNoApiModel;
        boolean paymentOwnAccounts = accountApiModel.getPaymentOwnAccounts();
        boolean paymentConversion = accountApiModel.getPaymentConversion();
        boolean paymentOwnAccountsDst = accountApiModel.getPaymentOwnAccountsDst();
        boolean paymentConversionDst = accountApiModel.getPaymentConversionDst();
        boolean paymentWithinBank = accountApiModel.getPaymentWithinBank();
        boolean paymentWithinGeorgia = accountApiModel.getPaymentWithinGeorgia();
        boolean paymentForeign = accountApiModel.getPaymentForeign();
        List<String> productFunctions = accountApiModel.getProductFunctions();
        String attachmentUrl = accountApiModel.getAttachmentUrl();
        Long pfmAcctId = accountApiModel.getPfmAcctId();
        String displayWarning = accountApiModel.getDisplayWarning();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            T next = it.next();
            Iterator<T> it2 = it;
            T t2 = next;
            if (C41536l.m120484d(((AccountDetailsApiModel) next).getAcctNo(), accountApiModel.getPrintAcctNo())) {
                t = t2;
                break;
            }
            it = it2;
        }
        AccountDetailsApiModel accountDetailsApiModel = (AccountDetailsApiModel) t;
        return new C26148a(acctKey, acctName, printAcctNo, availableAmount, amount, ccy, orderNo, productCode, productDictionaryKey, subType, ccyType, mainAcctKey, str, productId, z, z2, attachmentId, overlimitAmountMc, z3, isCardInactive, z4, paymentOwnAccounts, paymentConversion, paymentOwnAccountsDst, paymentConversionDst, paymentWithinBank, paymentWithinGeorgia, paymentForeign, productFunctions, attachmentUrl, pfmAcctId, displayWarning, accountDetailsApiModel != null ? convert(accountDetailsApiModel, list2) : null);
    }

    private final C26150c convert(AccountDetailsApiModel accountDetailsApiModel, List<AccountOverdraftParamsApiModel> list) {
        String acctNo = accountDetailsApiModel.getAcctNo();
        long acctKey = accountDetailsApiModel.getAcctKey();
        String acctName = accountDetailsApiModel.getAcctName();
        BigDecimal realAmount = accountDetailsApiModel.getRealAmount();
        String productDictionaryKey = accountDetailsApiModel.getProductDictionaryKey();
        String ccy = accountDetailsApiModel.getCcy();
        String productCode = accountDetailsApiModel.getProductCode();
        String acctBranch = accountDetailsApiModel.getAcctBranch();
        String ownerFirstName = accountDetailsApiModel.getOwnerFirstName();
        String ownerLastName = accountDetailsApiModel.getOwnerLastName();
        boolean isScoolcard = accountDetailsApiModel.isScoolcard();
        boolean z = accountDetailsApiModel.isCardExpiring() == YesNoApiModel.YES;
        String isCardInactive = accountDetailsApiModel.isCardInactive();
        List<AccountSubAccountsApiModel> subAccounts = accountDetailsApiModel.getSubAccounts();
        String str = isCardInactive;
        boolean z2 = z;
        boolean z3 = isScoolcard;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(subAccounts, 10));
        for (AccountSubAccountsApiModel convert : subAccounts) {
            arrayList.add(convert(convert, list));
        }
        List<AccountAmountApiModel> availableAmounts = accountDetailsApiModel.getAvailableAmounts();
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(availableAmounts, 10));
        for (AccountAmountApiModel convert2 : availableAmounts) {
            arrayList3.add(convert(convert2));
        }
        List<AccountAmountApiModel> availableAmountSums = accountDetailsApiModel.getAvailableAmountSums();
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(C41343r.m119925u(availableAmountSums, 10));
        for (AccountAmountApiModel convert3 : availableAmountSums) {
            arrayList5.add(convert(convert3));
        }
        List<AccountAmountApiModel> subAccountsSums = accountDetailsApiModel.getSubAccountsSums();
        ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList(C41343r.m119925u(subAccountsSums, 10));
        for (AccountAmountApiModel convert4 : subAccountsSums) {
            arrayList7.add(convert(convert4));
        }
        List<AccountStudDepInfoApiModel> studDepInfos = accountDetailsApiModel.getStudDepInfos();
        ArrayList arrayList8 = new ArrayList(C41343r.m119925u(studDepInfos, 10));
        for (AccountStudDepInfoApiModel convert5 : studDepInfos) {
            arrayList8.add(convert(convert5));
        }
        ArrayList arrayList9 = arrayList7;
        return new C26150c(acctNo, acctKey, acctName, realAmount, productDictionaryKey, ccy, productCode, acctBranch, ownerFirstName, ownerLastName, z3, z2, str, arrayList2, arrayList4, arrayList6, arrayList9, arrayList8, accountDetailsApiModel.getScoolas(), accountDetailsApiModel.getPfmAcctId(), accountDetailsApiModel.getDisplayWarning());
    }

    private final C26153f convert(AccountSubAccountsApiModel accountSubAccountsApiModel, List<AccountOverdraftParamsApiModel> list) {
        T t;
        boolean z;
        long acctKey = accountSubAccountsApiModel.getAcctKey();
        String printAcctNo = accountSubAccountsApiModel.getPrintAcctNo();
        BigDecimal availableAmount = accountSubAccountsApiModel.getAvailableAmount();
        BigDecimal realAmount = accountSubAccountsApiModel.getRealAmount();
        String ccy = accountSubAccountsApiModel.getCcy();
        boolean hasOverdraft = accountSubAccountsApiModel.getHasOverdraft();
        Long pfmAcctId = accountSubAccountsApiModel.getPfmAcctId();
        C26151d dVar = null;
        if (accountSubAccountsApiModel.getHasOverdraft()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((AccountOverdraftParamsApiModel) t).getAcctKey() == accountSubAccountsApiModel.getAcctKey()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            AccountOverdraftParamsApiModel accountOverdraftParamsApiModel = (AccountOverdraftParamsApiModel) t;
            if (accountOverdraftParamsApiModel != null) {
                dVar = convert(accountOverdraftParamsApiModel);
                return new C26153f(acctKey, printAcctNo, availableAmount, realAmount, ccy, hasOverdraft, pfmAcctId, dVar);
            }
        }
        return new C26153f(acctKey, printAcctNo, availableAmount, realAmount, ccy, hasOverdraft, pfmAcctId, dVar);
    }

    private final C26152e convert(AccountStudDepInfoApiModel accountStudDepInfoApiModel) {
        BigDecimal amount = accountStudDepInfoApiModel.getAmount();
        String ccy = accountStudDepInfoApiModel.getCcy();
        Double intAccrued = accountStudDepInfoApiModel.getIntAccrued();
        double d = Utils.DOUBLE_EPSILON;
        double doubleValue = intAccrued != null ? intAccrued.doubleValue() : 0.0d;
        Double intRate = accountStudDepInfoApiModel.getIntRate();
        if (intRate != null) {
            d = intRate.doubleValue();
        }
        double d2 = d;
        String intWithPeriodType = accountStudDepInfoApiModel.getIntWithPeriodType();
        Long maturityDate = accountStudDepInfoApiModel.getMaturityDate();
        return new C26152e(amount, ccy, doubleValue, d2, intWithPeriodType, maturityDate != null ? new Date(maturityDate.longValue()) : null, accountStudDepInfoApiModel.getIntWithPeriodTypeKey());
    }

    private final C26149b convert(AccountAmountApiModel accountAmountApiModel) {
        return new C26149b(accountAmountApiModel.getAmount(), accountAmountApiModel.getCurrency());
    }

    private final C26151d convert(AccountOverdraftParamsApiModel accountOverdraftParamsApiModel) {
        long acctKey = accountOverdraftParamsApiModel.getAcctKey();
        BigDecimal overdraftLimit = accountOverdraftParamsApiModel.getOverdraftLimit();
        double d = Utils.DOUBLE_EPSILON;
        double doubleValue = overdraftLimit != null ? overdraftLimit.doubleValue() : 0.0d;
        Double unusedOverdraftLimit = accountOverdraftParamsApiModel.getUnusedOverdraftLimit();
        double doubleValue2 = unusedOverdraftLimit != null ? unusedOverdraftLimit.doubleValue() : 0.0d;
        Double interestRate = accountOverdraftParamsApiModel.getInterestRate();
        double doubleValue3 = interestRate != null ? interestRate.doubleValue() : 0.0d;
        Double intAccruedOverdraft = accountOverdraftParamsApiModel.getIntAccruedOverdraft();
        if (intAccruedOverdraft != null) {
            d = intAccruedOverdraft.doubleValue();
        }
        double d2 = d;
        Long endDate = accountOverdraftParamsApiModel.getEndDate();
        return new C26151d(acctKey, doubleValue, doubleValue2, doubleValue3, d2, endDate != null ? endDate.longValue() : 0, accountOverdraftParamsApiModel.getFileId(), accountOverdraftParamsApiModel.getFileUrl());
    }

    public final C26374a convert(DeactivationAccountEntity deactivationAccountEntity) {
        C41536l.m120489i(deactivationAccountEntity, "entity");
        String result = deactivationAccountEntity.getResult();
        if (result == null) {
            result = "";
        }
        List<String> warningCodes = deactivationAccountEntity.getWarningCodes();
        if (warningCodes == null) {
            warningCodes = C41341q.m119907j();
        }
        return new C26374a(result, deactivationWarningsToDictionaryKeys(warningCodes));
    }

    public final List<C26157j> convert(List<ClosableAccountEntity> list) {
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (ClosableAccountEntity closableAccountEntity : list) {
            Long acctKey = closableAccountEntity.getAcctKey();
            long longValue = acctKey != null ? acctKey.longValue() : 0;
            String acctNo = closableAccountEntity.getAcctNo();
            if (acctNo == null) {
                acctNo = "";
            }
            String str = acctNo;
            Long clientKey = closableAccountEntity.getClientKey();
            arrayList.add(new C26157j(longValue, str, clientKey != null ? clientKey.longValue() : 0));
        }
        return arrayList;
    }
}
