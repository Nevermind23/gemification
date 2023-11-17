package dv0;

import iv0.C36549a;
import iv0.C36552d;
import iv0.C36553e;
import iv0.C36554f;
import iv0.C36555g;
import iv0.C36556h;
import iv0.C36557i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.openbanking.data.model.BalanceAmountApiModel;
import p341ge.bog.mobilebank.openbanking.data.model.OpenBankAccountApiModel;
import p341ge.bog.mobilebank.openbanking.data.model.OpenBankAccountBalanceApiModel;
import p341ge.bog.mobilebank.openbanking.data.model.OpenBankAccountRowApiModel;
import p341ge.bog.mobilebank.openbanking.data.model.OpenBankAccountSummaryApiModel;
import p341ge.bog.mobilebank.openbanking.data.model.OpenBankProductApiModel;

/* renamed from: dv0.c */
public final class C31610c {
    /* renamed from: a */
    private final C36549a m93710a(BalanceAmountApiModel balanceAmountApiModel) {
        return new C36549a(balanceAmountApiModel.getCurrency(), balanceAmountApiModel.getAmount());
    }

    /* renamed from: b */
    private final C36552d m93711b(OpenBankAccountBalanceApiModel openBankAccountBalanceApiModel) {
        return new C36552d(m93710a(openBankAccountBalanceApiModel.getBalanceAmount()), openBankAccountBalanceApiModel.getBalanceType(), openBankAccountBalanceApiModel.getReferenceDate(), openBankAccountBalanceApiModel.getLastChangeDateTime());
    }

    /* renamed from: c */
    private final C36553e m93712c(OpenBankAccountApiModel openBankAccountApiModel) {
        C36555g e = m93714e(openBankAccountApiModel.getSummary());
        C36557i f = m93715f(openBankAccountApiModel.getAccountType());
        List<OpenBankAccountRowApiModel> accounts = openBankAccountApiModel.getAccounts();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(accounts, 10));
        for (OpenBankAccountRowApiModel d : accounts) {
            arrayList.add(m93713d(d));
        }
        return new C36553e(e, f, arrayList);
    }

    /* renamed from: d */
    private final C36554f m93713d(OpenBankAccountRowApiModel openBankAccountRowApiModel) {
        Double d;
        List list;
        String resourceId = openBankAccountRowApiModel.getResourceId();
        String iban = openBankAccountRowApiModel.getIban();
        BalanceAmountApiModel balanceSummary = openBankAccountRowApiModel.getBalanceSummary();
        ArrayList arrayList = null;
        if (balanceSummary != null) {
            d = Double.valueOf(balanceSummary.getAmount());
        } else {
            d = null;
        }
        String currency = openBankAccountRowApiModel.getCurrency();
        String product = openBankAccountRowApiModel.getProduct();
        String cashAccountType = openBankAccountRowApiModel.getCashAccountType();
        String name = openBankAccountRowApiModel.getName();
        List<OpenBankAccountBalanceApiModel> balances = openBankAccountRowApiModel.getBalances();
        if (balances != null) {
            arrayList = new ArrayList(C41343r.m119925u(balances, 10));
            for (OpenBankAccountBalanceApiModel b : balances) {
                arrayList.add(m93711b(b));
            }
        }
        if (arrayList == null) {
            list = C41341q.m119907j();
        } else {
            list = arrayList;
        }
        return new C36554f(resourceId, iban, d, currency, product, cashAccountType, name, list);
    }

    /* renamed from: e */
    private final C36555g m93714e(OpenBankAccountSummaryApiModel openBankAccountSummaryApiModel) {
        return new C36555g(openBankAccountSummaryApiModel.getCcy(), openBankAccountSummaryApiModel.getAmount());
    }

    /* renamed from: f */
    private final C36557i m93715f(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 2060606) {
            if (hashCode != 2342128) {
                if (hashCode == 2557583 && str.equals("SVGS")) {
                    return C36557i.DEPOSIT;
                }
            } else if (str.equals("LOAN")) {
                return C36557i.LOAN;
            }
        } else if (str.equals("CACC")) {
            return C36557i.ACCOUNT;
        }
        return C36557i.ACCOUNT;
    }

    /* renamed from: g */
    public final List mo72024g(List list) {
        C41536l.m120489i(list, "products");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OpenBankProductApiModel openBankProductApiModel = (OpenBankProductApiModel) it.next();
            String aspspId = openBankProductApiModel.getAspspId();
            String aspspName = openBankProductApiModel.getAspspName();
            String bankBic = openBankProductApiModel.getBankBic();
            String consentId = openBankProductApiModel.getConsentId();
            long lastUpdateTime = openBankProductApiModel.getLastUpdateTime();
            long expirationDate = openBankProductApiModel.getExpirationDate();
            boolean isExpired = openBankProductApiModel.isExpired();
            List<OpenBankAccountApiModel> data = openBankProductApiModel.getData();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(data, 10));
            for (OpenBankAccountApiModel c : data) {
                arrayList2.add(m93712c(c));
            }
            arrayList.add(new C36556h(aspspId, aspspName, bankBic, consentId, lastUpdateTime, expirationDate, isExpired, arrayList2));
        }
        return arrayList;
    }
}
