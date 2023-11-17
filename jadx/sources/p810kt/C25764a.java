package p810kt;

import hd0.C24978b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountAmountApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountAmountCcyApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountDetailsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountOverdraftParamsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountStudDepInfoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountSubAccountAmountSumsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountSubAccountsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountsAccountsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountsApiEntity;
import p717bs.C19401a;
import p863pw.C27624b;
import p863pw.C27625c;
import p863pw.C27626d;
import p863pw.C27627e;
import p863pw.C27628f;
import p863pw.C27629g;
import p863pw.C27630h;
import p863pw.C27631i;
import p863pw.C27632j;

/* renamed from: kt.a */
public final class C25764a {

    /* renamed from: kt.a$a */
    public static final class C25765a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((AccountSubAccountAmountSumsApiEntity) obj).getOrderNo()), Integer.valueOf(((AccountSubAccountAmountSumsApiEntity) obj2).getOrderNo()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: ge.bog.mobilebank.cleanarch.data.products.entity.AccountDetailsApiEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: ge.bog.mobilebank.cleanarch.data.products.entity.AccountDetailsApiEntity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p863pw.C27623a mo64347a(p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountApiEntity r42, java.util.List r43, java.util.List r44) {
        /*
            r41 = this;
            r0 = r44
            java.lang.String r1 = "accountsEntity"
            r2 = r42
            kotlin.jvm.internal.C41536l.m120489i(r2, r1)
            java.lang.String r1 = "details"
            r3 = r43
            kotlin.jvm.internal.C41536l.m120489i(r3, r1)
            java.lang.String r1 = "overdraftParams"
            kotlin.jvm.internal.C41536l.m120489i(r0, r1)
            long r4 = r42.getAcctKey()
            java.lang.String r1 = r42.getAcctName()
            java.lang.String r6 = r42.getPrintAcctNo()
            java.math.BigDecimal r7 = r42.getAvailableAmount()
            java.math.BigDecimal r8 = r42.getAmount()
            java.lang.String r9 = r42.getCcy()
            int r10 = r42.getOrderNo()
            java.lang.String r11 = r42.getProductCode()
            java.lang.String r12 = r42.getProductDictionaryKey()
            java.lang.String r13 = r42.getSubType()
            java.lang.String r14 = r42.getCcyType()
            long r15 = r42.getMainAcctKey()
            java.lang.String r17 = r42.getProductGroup()
            long r18 = r42.getProductId()
            ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r2 = r42.isDefault()
            ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r3 = p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity.YES
            r20 = 1
            r21 = 0
            if (r2 != r3) goto L_0x005c
            r22 = r20
            goto L_0x005e
        L_0x005c:
            r22 = r21
        L_0x005e:
            ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r2 = r42.isHidden()
            if (r2 != r3) goto L_0x0067
            r23 = r20
            goto L_0x0069
        L_0x0067:
            r23 = r21
        L_0x0069:
            java.lang.Long r24 = r42.getAttachmentId()
            java.math.BigDecimal r25 = r42.getOverlimitAmountMc()
            ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r2 = r42.isCardExpiring()
            if (r2 != r3) goto L_0x007a
            r26 = r20
            goto L_0x007c
        L_0x007a:
            r26 = r21
        L_0x007c:
            java.lang.String r27 = r42.isCardInactive()
            ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r2 = r42.getHasDigitalCard()
            if (r2 != r3) goto L_0x0089
            r28 = r20
            goto L_0x008b
        L_0x0089:
            r28 = r21
        L_0x008b:
            boolean r29 = r42.getPaymentOwnAccounts()
            boolean r30 = r42.getPaymentConversion()
            boolean r31 = r42.getPaymentOwnAccountsDst()
            boolean r32 = r42.getPaymentConversionDst()
            boolean r33 = r42.getPaymentWithinBank()
            boolean r34 = r42.getPaymentWithinGeorgia()
            boolean r35 = r42.getPaymentForeign()
            java.util.List r36 = r42.getProductFunctions()
            java.lang.String r37 = r42.getAttachmentUrl()
            java.lang.Long r38 = r42.getPfmAcctId()
            java.lang.String r39 = r42.getDisplayWarning()
            java.util.Iterator r2 = r43.iterator()
        L_0x00bb:
            boolean r3 = r2.hasNext()
            r20 = 0
            if (r3 == 0) goto L_0x00e3
            java.lang.Object r3 = r2.next()
            r21 = r3
            ge.bog.mobilebank.cleanarch.data.products.entity.AccountDetailsApiEntity r21 = (p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountDetailsApiEntity) r21
            r43 = r2
            java.lang.String r2 = r21.getAcctNo()
            r21 = r3
            java.lang.String r3 = r42.getPrintAcctNo()
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)
            if (r2 == 0) goto L_0x00e0
            r3 = r21
            goto L_0x00e5
        L_0x00e0:
            r2 = r43
            goto L_0x00bb
        L_0x00e3:
            r3 = r20
        L_0x00e5:
            ge.bog.mobilebank.cleanarch.data.products.entity.AccountDetailsApiEntity r3 = (p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountDetailsApiEntity) r3
            r2 = r41
            if (r3 == 0) goto L_0x00f0
            pw.d r0 = r2.mo64350d(r3, r0)
            goto L_0x00f2
        L_0x00f0:
            r0 = r20
        L_0x00f2:
            pw.a r40 = new pw.a
            r2 = r40
            r3 = r4
            r5 = r1
            r20 = r22
            r21 = r23
            r22 = r24
            r23 = r25
            r24 = r26
            r25 = r27
            r26 = r28
            r27 = r29
            r28 = r30
            r29 = r31
            r30 = r32
            r31 = r33
            r32 = r34
            r33 = r35
            r34 = r36
            r35 = r37
            r36 = r38
            r37 = r39
            r38 = r0
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r40
        */
        throw new UnsupportedOperationException("Method not decompiled: p810kt.C25764a.mo64347a(ge.bog.mobilebank.cleanarch.data.products.entity.AccountApiEntity, java.util.List, java.util.List):pw.a");
    }

    /* renamed from: b */
    public final C27624b mo64348b(AccountAmountApiEntity accountAmountApiEntity) {
        C41536l.m120489i(accountAmountApiEntity, "amountWrapper");
        return new C27624b(accountAmountApiEntity.getAmount(), accountAmountApiEntity.getCurrency());
    }

    /* renamed from: c */
    public final C27625c mo64349c(AccountAmountCcyApiEntity accountAmountCcyApiEntity) {
        C41536l.m120489i(accountAmountCcyApiEntity, "amountWrapper");
        return new C27625c(accountAmountCcyApiEntity.getAmount(), accountAmountCcyApiEntity.getCcy());
    }

    /* renamed from: d */
    public final C27626d mo64350d(AccountDetailsApiEntity accountDetailsApiEntity, List list) {
        List list2 = list;
        C41536l.m120489i(accountDetailsApiEntity, "details");
        C41536l.m120489i(list2, "overdraftParams");
        String acctNo = accountDetailsApiEntity.getAcctNo();
        String acctName = accountDetailsApiEntity.getAcctName();
        BigDecimal realAmount = accountDetailsApiEntity.getRealAmount();
        String productDictionaryKey = accountDetailsApiEntity.getProductDictionaryKey();
        String ccy = accountDetailsApiEntity.getCcy();
        String productCode = accountDetailsApiEntity.getProductCode();
        String acctBranch = accountDetailsApiEntity.getAcctBranch();
        String ownerFirstName = accountDetailsApiEntity.getOwnerFirstName();
        String ownerLastName = accountDetailsApiEntity.getOwnerLastName();
        boolean isScoolcard = accountDetailsApiEntity.isScoolcard();
        C24978b a = C19401a.m64892a(accountDetailsApiEntity.isCardExpiring());
        String isCardInactive = accountDetailsApiEntity.isCardInactive();
        List<AccountSubAccountsApiEntity> subAccounts = accountDetailsApiEntity.getSubAccounts();
        C24978b bVar = a;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(subAccounts, 10));
        for (AccountSubAccountsApiEntity g : subAccounts) {
            arrayList.add(mo64353g(g, list2));
        }
        List<AccountAmountApiEntity> availableAmounts = accountDetailsApiEntity.getAvailableAmounts();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(availableAmounts, 10));
        for (AccountAmountApiEntity b : availableAmounts) {
            arrayList2.add(mo64348b(b));
        }
        List<AccountAmountApiEntity> availableAmountSums = accountDetailsApiEntity.getAvailableAmountSums();
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(availableAmountSums, 10));
        for (AccountAmountApiEntity b2 : availableAmountSums) {
            arrayList4.add(mo64348b(b2));
        }
        List<AccountAmountApiEntity> subAccountsSums = accountDetailsApiEntity.getSubAccountsSums();
        ArrayList arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(C41343r.m119925u(subAccountsSums, 10));
        for (AccountAmountApiEntity b3 : subAccountsSums) {
            arrayList6.add(mo64348b(b3));
        }
        List<AccountStudDepInfoApiEntity> studDepInfos = accountDetailsApiEntity.getStudDepInfos();
        ArrayList arrayList7 = new ArrayList(C41343r.m119925u(studDepInfos, 10));
        for (AccountStudDepInfoApiEntity f : studDepInfos) {
            arrayList7.add(mo64352f(f));
        }
        ArrayList arrayList8 = arrayList7;
        return new C27626d(acctNo, acctName, realAmount, productDictionaryKey, ccy, productCode, acctBranch, ownerFirstName, ownerLastName, isScoolcard, bVar, isCardInactive, arrayList3, arrayList2, arrayList5, arrayList6, arrayList8, accountDetailsApiEntity.getScoolas(), accountDetailsApiEntity.getPfmAcctId(), accountDetailsApiEntity.getDisplayWarning());
    }

    /* renamed from: e */
    public final C27627e mo64351e(AccountOverdraftParamsApiEntity accountOverdraftParamsApiEntity) {
        C41536l.m120489i(accountOverdraftParamsApiEntity, "params");
        return new C27627e(accountOverdraftParamsApiEntity.getAcctKey(), accountOverdraftParamsApiEntity.getOverdraftLimit(), accountOverdraftParamsApiEntity.getUnusedOverdraftLimit(), accountOverdraftParamsApiEntity.getInterestRate(), accountOverdraftParamsApiEntity.getIntAccruedOverdraft(), accountOverdraftParamsApiEntity.getEndDate());
    }

    /* renamed from: f */
    public final C27628f mo64352f(AccountStudDepInfoApiEntity accountStudDepInfoApiEntity) {
        C41536l.m120489i(accountStudDepInfoApiEntity, "studDepInfo");
        return new C27628f(accountStudDepInfoApiEntity.getAmount(), accountStudDepInfoApiEntity.getCcy(), accountStudDepInfoApiEntity.getIntAccrued(), accountStudDepInfoApiEntity.getIntRate());
    }

    /* renamed from: g */
    public final C27629g mo64353g(AccountSubAccountsApiEntity accountSubAccountsApiEntity, List list) {
        C27627e eVar;
        Object obj;
        boolean z;
        C41536l.m120489i(accountSubAccountsApiEntity, "subAccounts");
        C41536l.m120489i(list, "overdraftParams");
        long acctKey = accountSubAccountsApiEntity.getAcctKey();
        String printAcctNo = accountSubAccountsApiEntity.getPrintAcctNo();
        BigDecimal availableAmount = accountSubAccountsApiEntity.getAvailableAmount();
        BigDecimal realAmount = accountSubAccountsApiEntity.getRealAmount();
        String ccy = accountSubAccountsApiEntity.getCcy();
        boolean hasOverdraft = accountSubAccountsApiEntity.getHasOverdraft();
        Long pfmAcctId = accountSubAccountsApiEntity.getPfmAcctId();
        if (accountSubAccountsApiEntity.getHasOverdraft()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AccountOverdraftParamsApiEntity) obj).getAcctKey() == accountSubAccountsApiEntity.getAcctKey()) {
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
            AccountOverdraftParamsApiEntity accountOverdraftParamsApiEntity = (AccountOverdraftParamsApiEntity) obj;
            if (accountOverdraftParamsApiEntity != null) {
                eVar = mo64351e(accountOverdraftParamsApiEntity);
                return new C27629g(acctKey, printAcctNo, availableAmount, realAmount, ccy, hasOverdraft, pfmAcctId, eVar);
            }
        }
        eVar = null;
        return new C27629g(acctKey, printAcctNo, availableAmount, realAmount, ccy, hasOverdraft, pfmAcctId, eVar);
    }

    /* renamed from: h */
    public final C27630h mo64354h(AccountSubAccountAmountSumsApiEntity accountSubAccountAmountSumsApiEntity) {
        C41536l.m120489i(accountSubAccountAmountSumsApiEntity, "subAccountEntity");
        return new C27630h(accountSubAccountAmountSumsApiEntity.getAmount(), accountSubAccountAmountSumsApiEntity.getCcy(), accountSubAccountAmountSumsApiEntity.getOrderNo());
    }

    /* renamed from: i */
    public final C27631i mo64355i(AccountsApiEntity accountsApiEntity) {
        C41536l.m120489i(accountsApiEntity, "accountsAndDetails");
        C27632j j = mo64356j(accountsApiEntity.getAccounts(), accountsApiEntity.getDetails(), accountsApiEntity.getOverdraftParams());
        List<AccountDetailsApiEntity> details = accountsApiEntity.getDetails();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(details, 10));
        for (AccountDetailsApiEntity d : details) {
            arrayList.add(mo64350d(d, accountsApiEntity.getOverdraftParams()));
        }
        List<AccountOverdraftParamsApiEntity> overdraftParams = accountsApiEntity.getOverdraftParams();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(overdraftParams, 10));
        for (AccountOverdraftParamsApiEntity e : overdraftParams) {
            arrayList2.add(mo64351e(e));
        }
        return new C27631i(j, arrayList, arrayList2);
    }

    /* renamed from: j */
    public final C27632j mo64356j(AccountsAccountsApiEntity accountsAccountsApiEntity, List list, List list2) {
        C41536l.m120489i(accountsAccountsApiEntity, "accountsEntity");
        C41536l.m120489i(list, "details");
        C41536l.m120489i(list2, "overdraftParams");
        C27625c c = mo64349c(accountsAccountsApiEntity.getSummary());
        List<AccountApiEntity> accounts = accountsAccountsApiEntity.getAccounts();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(accounts, 10));
        for (AccountApiEntity a : accounts) {
            arrayList.add(mo64347a(a, list, list2));
        }
        Iterable subAccountRealAmountSums = accountsAccountsApiEntity.getSubAccountRealAmountSums();
        if (subAccountRealAmountSums == null) {
            subAccountRealAmountSums = new ArrayList();
        }
        List<AccountSubAccountAmountSumsApiEntity> t0 = C41358y.m120030t0(subAccountRealAmountSums, new C25765a());
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(t0, 10));
        for (AccountSubAccountAmountSumsApiEntity h : t0) {
            arrayList2.add(mo64354h(h));
        }
        return new C27632j(c, arrayList, arrayList2);
    }
}
