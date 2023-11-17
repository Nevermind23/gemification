package p945xt;

import g91.C32289b0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountItemApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferCurrencyItemApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferExternalFileApiEntity;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferCurrencyItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile;

/* renamed from: xt.a */
public final class C29858a {
    /* renamed from: a */
    private final TransferAccount m90650a(TransferAccountApiEntity transferAccountApiEntity) {
        List list;
        List list2;
        if (transferAccountApiEntity == null) {
            return null;
        }
        List<TransferAccountItemApiEntity> src = transferAccountApiEntity.getSrc();
        if (src != null) {
            list = new ArrayList(C41343r.m119925u(src, 10));
            for (TransferAccountItemApiEntity b : src) {
                list.add(mo70111b(b));
            }
        } else {
            list = C41341q.m119907j();
        }
        List<TransferAccountItemApiEntity> dst = transferAccountApiEntity.getDst();
        if (dst != null) {
            list2 = new ArrayList(C41343r.m119925u(dst, 10));
            for (TransferAccountItemApiEntity b2 : dst) {
                list2.add(mo70111b(b2));
            }
        } else {
            list2 = C41341q.m119907j();
        }
        return new TransferAccount(list, list2, transferAccountApiEntity.getAmountLimit());
    }

    /* renamed from: b */
    public final TransferAccountItem mo70111b(TransferAccountItemApiEntity transferAccountItemApiEntity) {
        boolean z;
        ArrayList arrayList;
        C41536l.m120489i(transferAccountItemApiEntity, "accountItem");
        boolean isCreditCard = transferAccountItemApiEntity.isCreditCard();
        boolean isForCreditSTO = transferAccountItemApiEntity.isForCreditSTO();
        long id = transferAccountItemApiEntity.getId();
        String acctNo = transferAccountItemApiEntity.getAcctNo();
        String name = transferAccountItemApiEntity.getName();
        String ccy = transferAccountItemApiEntity.getCcy();
        BigDecimal availableAmount = transferAccountItemApiEntity.getAvailableAmount();
        long mainAcctKey = transferAccountItemApiEntity.getMainAcctKey();
        BigDecimal realAmount = transferAccountItemApiEntity.getRealAmount();
        if (transferAccountItemApiEntity.isDefault() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String attachmentId = transferAccountItemApiEntity.getAttachmentId();
        boolean hasDeposit = transferAccountItemApiEntity.getHasDeposit();
        String attachmentUrl = transferAccountItemApiEntity.getAttachmentUrl();
        List<TransferAccountItemApiEntity> subAccounts = transferAccountItemApiEntity.getSubAccounts();
        if (subAccounts != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(subAccounts, 10));
            for (TransferAccountItemApiEntity b : subAccounts) {
                arrayList2.add(mo70111b(b));
            }
            arrayList = arrayList2;
        } else {
            arrayList = C41341q.m119907j();
        }
        return new TransferAccountItem(isCreditCard, isForCreditSTO, id, acctNo, name, ccy, availableAmount, mainAcctKey, realAmount, z2, attachmentId, hasDeposit, attachmentUrl, arrayList, transferAccountItemApiEntity.getProductCode(), mo70114e(transferAccountItemApiEntity.getExternalFile()), mo70114e(transferAccountItemApiEntity.getExternalIcon()), mo70114e(transferAccountItemApiEntity.getCardExternalFile()));
    }

    /* renamed from: c */
    public final TransferAccounts mo70112c(TransferAccountsApiEntity transferAccountsApiEntity) {
        C41536l.m120489i(transferAccountsApiEntity, "transferAccounts");
        return new TransferAccounts(m90650a(transferAccountsApiEntity.getBank()), m90650a(transferAccountsApiEntity.getDomestic()), m90650a(transferAccountsApiEntity.getConversion()), m90650a(transferAccountsApiEntity.getForeign()), m90650a(transferAccountsApiEntity.getGeorgia()), m90650a(transferAccountsApiEntity.getMoneyRequest()), m90650a(transferAccountsApiEntity.getGaltAndTaggart()));
    }

    /* renamed from: d */
    public final TransferCurrencyItem mo70113d(TransferCurrencyItemApiEntity transferCurrencyItemApiEntity) {
        C41536l.m120489i(transferCurrencyItemApiEntity, "currencyItem");
        return new TransferCurrencyItem(transferCurrencyItemApiEntity.getCcy(), transferCurrencyItemApiEntity.getRate(), transferCurrencyItemApiEntity.getRemittanceRate(), transferCurrencyItemApiEntity.getRateDisplay(), transferCurrencyItemApiEntity.getRemittanceRateDisplay(), transferCurrencyItemApiEntity.getTotalAmount(), transferCurrencyItemApiEntity.getCcyDictionaryKey(), transferCurrencyItemApiEntity.getOrderId());
    }

    /* renamed from: e */
    public final TransferExternalFile mo70114e(TransferExternalFileApiEntity transferExternalFileApiEntity) {
        boolean z;
        String str = null;
        if (transferExternalFileApiEntity == null) {
            return null;
        }
        if (transferExternalFileApiEntity.isDark() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        String fileUrl = transferExternalFileApiEntity.getFileUrl();
        if (fileUrl != null) {
            str = C32289b0.m95091c(fileUrl);
        }
        return new TransferExternalFile(z, str);
    }
}
