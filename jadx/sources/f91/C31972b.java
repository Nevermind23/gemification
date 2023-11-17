package f91;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.model.account.AccountDebitLoveWrapper;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.account.AccountLovContainer;
import p341ge.bog.mobilebank.model.account.AccountLovHolder;
import p341ge.bog.mobilebank.model.account.AccountLoveDebit;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentAccount;

/* renamed from: f91.b */
public abstract class C31972b {
    /* renamed from: a */
    public static ArrayList m94376a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AccountLov accountLov = (AccountLov) it.next();
            if (accountLov.getCcy().equals("GEL")) {
                AccountLov accountLov2 = new AccountLov(accountLov);
                if (accountLov2.getSubAccounts() != null) {
                    accountLov2.setSubAccounts(m94376a(accountLov2.getSubAccounts()));
                }
                arrayList2.add(accountLov2);
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static String m94377b(AccountDebitLoveWrapper accountDebitLoveWrapper, long j) {
        try {
            Iterator<AccountLoveDebit> it = accountDebitLoveWrapper.cardDebits.iterator();
            while (it.hasNext()) {
                AccountLoveDebit next = it.next();
                if (next.acctKey == j) {
                    return m94382g(next, false);
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static C31971a m94378c(AccountLovContainer accountLovContainer, long j, int i, boolean z) {
        C31971a aVar = new C31971a();
        ArrayList e = m94380e(accountLovContainer, i, z);
        AccountLov accountLov = null;
        int i2 = -1;
        int i3 = -1;
        AccountLov accountLov2 = null;
        for (int i4 = 0; i4 < e.size(); i4++) {
            AccountLov accountLov3 = (AccountLov) e.get(i4);
            for (int i5 = 0; i5 < accountLov3.getSubAccounts().size(); i5++) {
                AccountLov accountLov4 = accountLov3.getSubAccounts().get(i5);
                if (j == accountLov4.getId()) {
                    i2 = i4;
                    accountLov2 = accountLov3;
                    i3 = i5;
                    accountLov = accountLov4;
                }
                if (accountLov != null) {
                    break;
                }
            }
        }
        aVar.mo72462e(accountLov);
        aVar.mo72464g(accountLov2);
        aVar.mo72465h(i2);
        aVar.mo72463f(i3);
        return aVar;
    }

    /* renamed from: d */
    public static C31971a m94379d(AccountLovContainer accountLovContainer, String str, String str2, int i, boolean z) {
        if (str2 != null) {
            str = str.replace(str2, "");
        }
        ArrayList e = m94380e(accountLovContainer, i, z);
        long j = -1;
        for (int i2 = 0; i2 < e.size(); i2++) {
            AccountLov accountLov = (AccountLov) e.get(i2);
            if (accountLov.getAcctNo() != null && ((accountLov.getAcctNo().length() >= 22 && str.equals(accountLov.getAcctNo().substring(0, 22))) || str.equals(accountLov.getAcctNo()))) {
                for (int i3 = 0; i3 < accountLov.getSubAccounts().size(); i3++) {
                    AccountLov accountLov2 = accountLov.getSubAccounts().get(i3);
                    if (accountLov2.getCcy().equals(str2)) {
                        j = accountLov2.getId();
                    }
                }
            }
        }
        return m94378c(accountLovContainer, j, i, z);
    }

    /* renamed from: e */
    public static ArrayList m94380e(AccountLovContainer accountLovContainer, int i, boolean z) {
        AccountLovHolder accountLovHolder;
        if (accountLovContainer == null) {
            return new ArrayList();
        }
        if (i == 0) {
            accountLovHolder = accountLovContainer.getDomestic();
        } else if (i == 1) {
            accountLovHolder = accountLovContainer.getBank();
        } else if (i == 2) {
            accountLovHolder = accountLovContainer.getGeorgia();
        } else {
            accountLovHolder = accountLovContainer.getConversion();
        }
        ArrayList<AccountLov> src = accountLovHolder.getSrc();
        if ((i == 0 || i == 3) && !z) {
            return accountLovHolder.getDst();
        }
        return src;
    }

    /* renamed from: f */
    public static BigDecimal m94381f(AccountLovContainer accountLovContainer, int i) {
        if (i == 1) {
            return accountLovContainer.getBank().amountLimit;
        }
        if (i == 2) {
            return accountLovContainer.getGeorgia().amountLimit;
        }
        if (i == 3) {
            return accountLovContainer.getConversion().amountLimit;
        }
        return accountLovContainer.getDomestic().amountLimit;
    }

    /* renamed from: g */
    public static String m94382g(AccountLoveDebit accountLoveDebit, boolean z) {
        String str;
        if (TextUtils.isEmpty(accountLoveDebit.acctDesc)) {
            return accountLoveDebit.acctNo;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(accountLoveDebit.acctDesc);
        if (z) {
            str = " - " + accountLoveDebit.ccy;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: h */
    public static String m94383h(DDPaymentAccount dDPaymentAccount) {
        if (TextUtils.isEmpty(dDPaymentAccount.acctDesc)) {
            return dDPaymentAccount.acctNo;
        }
        return dDPaymentAccount.acctDesc + " - " + dDPaymentAccount.ccy;
    }
}
