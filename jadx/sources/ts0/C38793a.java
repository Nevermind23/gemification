package ts0;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m70.C26148a;
import m70.C26150c;
import m70.C26153f;
import m70.C26156i;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasAccountEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasHistoryItemEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasInfoSummaryEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasServiceInfoEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasServiceProductEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.DepositAccountEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.PiggyBankPausePeriodEntity;
import p863pw.C27637o;
import zs0.C40248a;
import zs0.C40250c;
import zs0.C40251d;
import zs0.C40252e;
import zs0.C40253f;
import zs0.C40254g;
import zs0.C40255h;

/* renamed from: ts0.a */
public final class C38793a {
    /* renamed from: a */
    private final Double m113553a(C26156i iVar, String str, long j) {
        Object obj;
        C26150c a;
        List q;
        Object obj2;
        BigDecimal b;
        boolean z;
        Iterator it = iVar.mo65188a().mo65182a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C26148a) obj).mo65087b() == j) {
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
        C26148a aVar = (C26148a) obj;
        if (aVar == null || (a = aVar.mo65086a()) == null || (q = a.mo65138q()) == null) {
            return null;
        }
        Iterator it2 = q.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (C41536l.m120484d(((C26153f) obj2).mo65167c(), str)) {
                break;
            }
        }
        C26153f fVar = (C26153f) obj2;
        if (fVar == null || (b = fVar.mo65166b()) == null) {
            return null;
        }
        return Double.valueOf(b.doubleValue());
    }

    /* renamed from: i */
    private final C40254g m113554i(DepositAccountEntity depositAccountEntity) {
        return new C40254g(depositAccountEntity.getAcctKey(), depositAccountEntity.getAcctNo(), depositAccountEntity.getAvailableAmount());
    }

    /* renamed from: k */
    public static /* synthetic */ List m113555k(C38793a aVar, List list, C27637o oVar, C26156i iVar, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            iVar = null;
        }
        if ((i & 8) != 0) {
            str = "GEL";
        }
        return aVar.mo92488c(list, oVar, iVar, str);
    }

    /* renamed from: b */
    public final List mo92487b(List list) {
        C41536l.m120489i(list, "pausePeriods");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo92494j((PiggyBankPausePeriodEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0107  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo92488c(java.util.List r29, p863pw.C27637o r30, m70.C26156i r31, java.lang.String r32) {
        /*
            r28 = this;
            r0 = r29
            r1 = r31
            r2 = r32
            java.lang.String r3 = "accounts"
            kotlin.jvm.internal.C41536l.m120489i(r0, r3)
            java.lang.String r3 = "cards"
            r4 = r30
            kotlin.jvm.internal.C41536l.m120489i(r4, r3)
            java.lang.String r3 = "ccy"
            kotlin.jvm.internal.C41536l.m120489i(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = ie1.C41343r.m119925u(r0, r5)
            r3.<init>(r5)
            java.util.Iterator r0 = r29.iterator()
        L_0x0026:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0118
            java.lang.Object r5 = r0.next()
            ty.a r5 = (p906ty.C28523a) r5
            java.lang.Long r6 = r5.mo68135a()
            r7 = 0
            if (r6 == 0) goto L_0x0054
            long r8 = r6.longValue()
            java.util.Map r6 = r30.mo67167a()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object r6 = r6.get(r8)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0054
            java.lang.Object r6 = ie1.C41358y.m120009Y(r6)
            pw.m r6 = (p863pw.C27635m) r6
            goto L_0x0055
        L_0x0054:
            r6 = r7
        L_0x0055:
            if (r6 == 0) goto L_0x0063
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r8 = r6.mo67135s()
            if (r8 == 0) goto L_0x0063
            java.lang.String r8 = r8.getFileSubType()
            if (r8 != 0) goto L_0x006b
        L_0x0063:
            if (r6 == 0) goto L_0x006a
            java.lang.String r8 = r6.mo67105E()
            goto L_0x006b
        L_0x006a:
            r8 = r7
        L_0x006b:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r8 = p341ge.bog.mobilebank.model.account.ProductProperties.getCardBackgroundInfo(r8)
            if (r1 == 0) goto L_0x0085
            java.lang.Long r9 = r5.mo68135a()
            if (r9 == 0) goto L_0x007c
            long r9 = r9.longValue()
            goto L_0x007e
        L_0x007c:
            r9 = -1
        L_0x007e:
            r11 = r28
            java.lang.Double r9 = r11.m113553a(r1, r2, r9)
            goto L_0x0088
        L_0x0085:
            r11 = r28
            r9 = r7
        L_0x0088:
            java.lang.Long r10 = r5.mo68135a()
            kotlin.jvm.internal.C41536l.m120486f(r10)
            long r17 = r10.longValue()
            java.lang.String r19 = r5.mo68136b()
            kotlin.jvm.internal.C41536l.m120486f(r19)
            if (r9 == 0) goto L_0x00a3
            double r12 = r9.doubleValue()
        L_0x00a0:
            r20 = r12
            goto L_0x00b1
        L_0x00a3:
            java.lang.Double r10 = r5.mo68138d()
            if (r10 == 0) goto L_0x00ae
            double r12 = r10.doubleValue()
            goto L_0x00a0
        L_0x00ae:
            r12 = 0
            goto L_0x00a0
        L_0x00b1:
            if (r9 == 0) goto L_0x00b6
            r22 = r2
            goto L_0x00c0
        L_0x00b6:
            java.lang.String r9 = r5.mo68139e()
            if (r9 != 0) goto L_0x00be
            java.lang.String r9 = "GEL"
        L_0x00be:
            r22 = r9
        L_0x00c0:
            if (r6 == 0) goto L_0x00d5
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r9 = r6.mo67135s()
            if (r9 == 0) goto L_0x00d5
            java.lang.String r9 = r9.getFileUrl()
            if (r9 == 0) goto L_0x00d5
            java.lang.String r9 = g91.C32289b0.m95091c(r9)
            r23 = r9
            goto L_0x00d7
        L_0x00d5:
            r23 = r7
        L_0x00d7:
            int r9 = r8.resId
            r10 = -1
            if (r9 != r10) goto L_0x00dd
            goto L_0x00e1
        L_0x00dd:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
        L_0x00e1:
            r24 = r7
            java.lang.String r25 = r5.mo68137c()
            int r5 = r8.resId
            r7 = 1
            r9 = 0
            if (r5 == r10) goto L_0x00f4
            boolean r5 = r8.isLightText
            if (r5 == 0) goto L_0x00f4
            r27 = r7
            goto L_0x00f6
        L_0x00f4:
            r27 = r9
        L_0x00f6:
            if (r6 == 0) goto L_0x0107
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r5 = r6.mo67135s()
            if (r5 == 0) goto L_0x0107
            boolean r5 = r5.isDark()
            if (r5 != 0) goto L_0x0107
            r26 = r7
            goto L_0x0109
        L_0x0107:
            r26 = r9
        L_0x0109:
            zs0.a r5 = new zs0.a
            r13 = -1
            r15 = -1
            r12 = r5
            r12.<init>(r13, r15, r17, r19, r20, r22, r23, r24, r25, r26, r27)
            r3.add(r5)
            goto L_0x0026
        L_0x0118:
            r11 = r28
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ts0.C38793a.mo92488c(java.util.List, pw.o, m70.i, java.lang.String):java.util.List");
    }

    /* renamed from: d */
    public final C40248a mo92489d(CasAccountEntity casAccountEntity) {
        C41536l.m120489i(casAccountEntity, "entity");
        return new C40248a(casAccountEntity.getId(), casAccountEntity.getClientServiceId(), casAccountEntity.getAcctKey(), casAccountEntity.getAcctName(), casAccountEntity.getAvailableAmount(), casAccountEntity.getCcy(), (String) null, (Integer) null, (String) null, false, false, 1984, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public final C40250c mo92490e(CasHistoryItemEntity casHistoryItemEntity) {
        C41536l.m120489i(casHistoryItemEntity, "entity");
        int orderNo = casHistoryItemEntity.getOrderNo();
        String monthDictionaryKey = casHistoryItemEntity.getMonthDictionaryKey();
        int operationCount = casHistoryItemEntity.getOperationCount();
        double amount = casHistoryItemEntity.getAmount();
        String ccy = casHistoryItemEntity.getCcy();
        if (ccy == null) {
            ccy = "GEL";
        }
        return new C40250c(orderNo, monthDictionaryKey, operationCount, amount, ccy);
    }

    /* renamed from: f */
    public final C40251d mo92491f(CasInfoSummaryEntity casInfoSummaryEntity) {
        double d;
        C41536l.m120489i(casInfoSummaryEntity, "entity");
        String ccy = casInfoSummaryEntity.getCcy();
        double totalAmount = casInfoSummaryEntity.getTotalAmount();
        Double totalAmountAcct = casInfoSummaryEntity.getTotalAmountAcct();
        if (totalAmountAcct != null) {
            d = totalAmountAcct.doubleValue();
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        return new C40251d(ccy, totalAmount, d);
    }

    /* renamed from: g */
    public final C40252e mo92492g(CasServiceInfoEntity casServiceInfoEntity) {
        List list;
        List list2;
        C41536l.m120489i(casServiceInfoEntity, "entity");
        List<CasInfoSummaryEntity> summary = casServiceInfoEntity.getSummary();
        if (summary != null) {
            list = new ArrayList(C41343r.m119925u(summary, 10));
            for (CasInfoSummaryEntity f : summary) {
                list.add(mo92491f(f));
            }
        } else {
            list = C41341q.m119907j();
        }
        List<CasServiceProductEntity> clientServices = casServiceInfoEntity.getClientServices();
        if (clientServices != null) {
            list2 = new ArrayList(C41343r.m119925u(clientServices, 10));
            for (CasServiceProductEntity h : clientServices) {
                list2.add(mo92493h(h));
            }
        } else {
            list2 = C41341q.m119907j();
        }
        return new C40252e(list, list2);
    }

    /* renamed from: h */
    public final C40253f mo92493h(CasServiceProductEntity casServiceProductEntity) {
        boolean z;
        long j;
        Date date;
        Date date2;
        boolean z2;
        C41536l.m120489i(casServiceProductEntity, "entity");
        long clientServiceId = casServiceProductEntity.getClientServiceId();
        long clientKey = casServiceProductEntity.getClientKey();
        String scheme = casServiceProductEntity.getScheme();
        long schemeTariffId = casServiceProductEntity.getSchemeTariffId();
        double schemeTariffValue = casServiceProductEntity.getSchemeTariffValue();
        String schemeTariffCcy = casServiceProductEntity.getSchemeTariffCcy();
        long agreeKey = casServiceProductEntity.getAgreeKey();
        String agreeType = casServiceProductEntity.getAgreeType();
        String status = casServiceProductEntity.getStatus();
        String name = casServiceProductEntity.getName();
        String agreeNo = casServiceProductEntity.getAgreeNo();
        String prodType = casServiceProductEntity.getProdType();
        String agreeCcy = casServiceProductEntity.getAgreeCcy();
        double totalAmount = casServiceProductEntity.getTotalAmount();
        Double totalAmountAcct = casServiceProductEntity.getTotalAmountAcct();
        double currentMonthTotalAmount = casServiceProductEntity.getCurrentMonthTotalAmount();
        String depositAgreeType = casServiceProductEntity.getDepositAgreeType();
        double agreeBalance = casServiceProductEntity.getAgreeBalance();
        YesNoApiEntity restFlag = casServiceProductEntity.getRestFlag();
        YesNoApiEntity yesNoApiEntity = YesNoApiEntity.YES;
        if (restFlag == yesNoApiEntity) {
            z = true;
        } else {
            z = false;
        }
        Long restStartDate = casServiceProductEntity.getRestStartDate();
        boolean z3 = z;
        if (restStartDate != null) {
            j = agreeKey;
            date = new Date(restStartDate.longValue());
        } else {
            j = agreeKey;
            date = null;
        }
        Long restEndDate = casServiceProductEntity.getRestEndDate();
        if (restEndDate != null) {
            date2 = new Date(restEndDate.longValue());
        } else {
            date2 = null;
        }
        if (casServiceProductEntity.getOpensAgrFlag() == yesNoApiEntity) {
            z2 = true;
        } else {
            z2 = false;
        }
        String agreeTypeDictionaryKey = casServiceProductEntity.getAgreeTypeDictionaryKey();
        String agreeTypeDictionaryValue = casServiceProductEntity.getAgreeTypeDictionaryValue();
        List<CasAccountEntity> accounts = casServiceProductEntity.getAccounts();
        if (accounts == null) {
            accounts = C41341q.m119907j();
        }
        String str = agreeTypeDictionaryKey;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(accounts, 10));
        for (CasAccountEntity d : accounts) {
            arrayList.add(mo92489d(d));
        }
        List<DepositAccountEntity> depositAccounts = casServiceProductEntity.getDepositAccounts();
        if (depositAccounts == null) {
            depositAccounts = C41341q.m119907j();
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(depositAccounts, 10));
        for (DepositAccountEntity i : depositAccounts) {
            arrayList2.add(m113554i(i));
        }
        return new C40253f(clientServiceId, clientKey, scheme, schemeTariffId, schemeTariffValue, schemeTariffCcy, j, agreeType, status, name, agreeNo, prodType, agreeCcy, totalAmount, totalAmountAcct, currentMonthTotalAmount, depositAgreeType, agreeBalance, z3, date, date2, z2, str, agreeTypeDictionaryValue, arrayList, arrayList2, casServiceProductEntity.getDepositTypeDictionaryKey(), casServiceProductEntity.getDepositTypeDictionaryValue());
    }

    /* renamed from: j */
    public final C40255h mo92494j(PiggyBankPausePeriodEntity piggyBankPausePeriodEntity) {
        C41536l.m120489i(piggyBankPausePeriodEntity, "pausePeriodEntity");
        return new C40255h(piggyBankPausePeriodEntity.getPeriodType(), piggyBankPausePeriodEntity.getStartDate(), piggyBankPausePeriodEntity.getEndDate(), piggyBankPausePeriodEntity.getDictionaryKey(), piggyBankPausePeriodEntity.getDictionaryValue());
    }
}
