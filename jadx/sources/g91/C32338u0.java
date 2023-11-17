package g91;

import d50.C19907a;
import he1.C41224m;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41523c;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.payment.LastOperation;
import p341ge.bog.mobilebank.model.search.result.StatementHeaderSearchResult;
import p341ge.bog.mobilebank.model.search.result.StatementSearchResult;
import p760fw.C20575a;

/* renamed from: g91.u0 */
public final class C32338u0 {

    /* renamed from: a */
    public static final C32338u0 f79771a = new C32338u0();

    private C32338u0() {
    }

    /* renamed from: a */
    public static final void m95370a(List list, StatementSearchResult statementSearchResult) {
        StatementSearchResult statementSearchResult2;
        C41536l.m120489i(list, "<this>");
        C41536l.m120489i(statementSearchResult, "statement");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM, yyyy", Locale.getDefault());
        String format = simpleDateFormat.format(new Date(statementSearchResult.getPostDate()));
        if (list.size() == 0) {
            C41536l.m120488h(format, "formattedDate");
            list.add(new StatementHeaderSearchResult(format));
        } else {
            Object i0 = C41358y.m120019i0(list);
            if (i0 instanceof StatementSearchResult) {
                statementSearchResult2 = (StatementSearchResult) i0;
            } else {
                statementSearchResult2 = null;
            }
            if (statementSearchResult2 != null && !C41536l.m120484d(format, simpleDateFormat.format(Long.valueOf(statementSearchResult2.getPostDate())))) {
                C41536l.m120488h(format, "formattedDate");
                list.add(new StatementHeaderSearchResult(format));
            }
        }
        list.add(statementSearchResult);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: fw.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: fw.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: fw.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: fw.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: fw.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final he1.C41224m m95371b(java.lang.Long r9, java.lang.Long r10, java.util.List r11) {
        /*
            r8 = this;
            java.util.Iterator r11 = r11.iterator()
        L_0x0004:
            boolean r0 = r11.hasNext()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r11.next()
            r4 = r0
            fw.a r4 = (p760fw.C20575a) r4
            long r4 = r4.mo49102b()
            if (r9 != 0) goto L_0x001b
            goto L_0x0025
        L_0x001b:
            long r6 = r9.longValue()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0025
            r4 = r1
            goto L_0x0026
        L_0x0025:
            r4 = r2
        L_0x0026:
            if (r4 == 0) goto L_0x0004
            goto L_0x002a
        L_0x0029:
            r0 = r3
        L_0x002a:
            fw.a r0 = (p760fw.C20575a) r0
            if (r0 == 0) goto L_0x005c
            java.util.List r9 = r0.mo49111i()
            if (r9 == 0) goto L_0x005c
            java.util.Iterator r9 = r9.iterator()
        L_0x0038:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x005a
            java.lang.Object r11 = r9.next()
            r4 = r11
            fw.a r4 = (p760fw.C20575a) r4
            long r4 = r4.mo49102b()
            if (r10 != 0) goto L_0x004c
            goto L_0x0056
        L_0x004c:
            long r6 = r10.longValue()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0056
            r4 = r1
            goto L_0x0057
        L_0x0056:
            r4 = r2
        L_0x0057:
            if (r4 == 0) goto L_0x0038
            r3 = r11
        L_0x005a:
            fw.a r3 = (p760fw.C20575a) r3
        L_0x005c:
            he1.m r9 = new he1.m
            r9.<init>(r0, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g91.C32338u0.m95371b(java.lang.Long, java.lang.Long, java.util.List):he1.m");
    }

    /* renamed from: c */
    public static final void m95372c(List list, List list2) {
        TransactionCategoryModel transactionCategoryModel;
        C41536l.m120489i(list, "operations");
        C41536l.m120489i(list2, "transactionCategories");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LastOperation lastOperation = (LastOperation) it.next();
            C41224m b = f79771a.m95371b(lastOperation.pfmParentCatId, lastOperation.pfmCatId, list2);
            C20575a aVar = (C20575a) b.mo95675a();
            C20575a aVar2 = (C20575a) b.mo95676b();
            TransactionCategoryModel transactionCategoryModel2 = null;
            if (aVar != null) {
                transactionCategoryModel = C19907a.m65797a(aVar);
            } else {
                transactionCategoryModel = null;
            }
            lastOperation.setParentCategory(transactionCategoryModel);
            if (aVar2 != null) {
                transactionCategoryModel2 = C19907a.m65797a(aVar2);
            }
            lastOperation.setTransactionCategory(transactionCategoryModel2);
        }
    }

    /* renamed from: d */
    public static final void m95373d(List list, List list2) {
        TransactionCategoryModel transactionCategoryModel;
        C41536l.m120489i(list, "operations");
        C41536l.m120489i(list2, "transactionCategories");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AccountOperation accountOperation = (AccountOperation) it.next();
            C41224m b = f79771a.m95371b(accountOperation.getPfmParentCatId(), accountOperation.getPfmCatId(), list2);
            C20575a aVar = (C20575a) b.mo95675a();
            C20575a aVar2 = (C20575a) b.mo95676b();
            TransactionCategoryModel transactionCategoryModel2 = null;
            if (aVar != null) {
                transactionCategoryModel = C19907a.m65797a(aVar);
            } else {
                transactionCategoryModel = null;
            }
            accountOperation.setParentCategory(transactionCategoryModel);
            if (aVar2 != null) {
                transactionCategoryModel2 = C19907a.m65797a(aVar2);
            }
            accountOperation.setTransactionCategory(transactionCategoryModel2);
        }
    }

    /* renamed from: e */
    public static final void m95374e(StatementSearchResult[] statementSearchResultArr, List list) {
        TransactionCategoryModel transactionCategoryModel;
        C41536l.m120489i(list, "transactionCategories");
        if (statementSearchResultArr != null) {
            Iterator a = C41523c.m120452a(statementSearchResultArr);
            while (a.hasNext()) {
                StatementSearchResult statementSearchResult = (StatementSearchResult) a.next();
                C41224m b = f79771a.m95371b(statementSearchResult.getPfmParentCatId(), statementSearchResult.getPfmCatId(), list);
                C20575a aVar = (C20575a) b.mo95675a();
                C20575a aVar2 = (C20575a) b.mo95676b();
                TransactionCategoryModel transactionCategoryModel2 = null;
                if (aVar != null) {
                    transactionCategoryModel = C19907a.m65797a(aVar);
                } else {
                    transactionCategoryModel = null;
                }
                statementSearchResult.setParentCategory(transactionCategoryModel);
                if (aVar2 != null) {
                    transactionCategoryModel2 = C19907a.m65797a(aVar2);
                }
                statementSearchResult.setTransactionCategory(transactionCategoryModel2);
            }
        }
    }
}
