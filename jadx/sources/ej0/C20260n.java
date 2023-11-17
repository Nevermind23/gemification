package ej0;

import g91.C32289b0;
import g91.C32343x;
import j31.C36725a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import xh0.C29796l;

/* renamed from: ej0.n */
public final class C20260n {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: l50.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.model.account.ProductProperties.CardBackgroundInfoContainer m66275a(long r4) {
        /*
            r3 = this;
            r0 = 0
            l50.p r1 = p341ge.bog.mobilebank.model.account.ProductProperties.cardsAndDetailsUIModel     // Catch:{ Exception -> 0x003e }
            l50.l r4 = n50.C26371b.m82431a(r1, r4)     // Catch:{ Exception -> 0x003e }
            if (r4 == 0) goto L_0x003e
            java.util.List r4 = r4.mo64522a()     // Catch:{ Exception -> 0x003e }
            if (r4 == 0) goto L_0x003e
            java.util.Iterator r5 = r4.iterator()     // Catch:{ Exception -> 0x003e }
        L_0x0013:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x003e }
            r2 = r1
            l50.r r2 = (l50.C25838r) r2     // Catch:{ Exception -> 0x003e }
            boolean r2 = r2.mo64602z()     // Catch:{ Exception -> 0x003e }
            if (r2 == 0) goto L_0x0013
            goto L_0x0028
        L_0x0027:
            r1 = r0
        L_0x0028:
            l50.r r1 = (l50.C25838r) r1     // Catch:{ Exception -> 0x003e }
            if (r1 != 0) goto L_0x0033
            java.lang.Object r4 = ie1.C41358y.m120009Y(r4)     // Catch:{ Exception -> 0x003e }
            r1 = r4
            l50.r r1 = (l50.C25838r) r1     // Catch:{ Exception -> 0x003e }
        L_0x0033:
            if (r1 == 0) goto L_0x003e
            java.lang.String r4 = r1.mo64595t()     // Catch:{ Exception -> 0x003e }
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = p341ge.bog.mobilebank.model.account.ProductProperties.getCardBackgroundInfo(r4)     // Catch:{ Exception -> 0x003e }
            r0 = r4
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ej0.C20260n.m66275a(long):ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer");
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [ge.bog.designsystem.components.common.Image$Resource] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m66276b(java.util.List r27, java.util.List r28) {
        /*
            r26 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            r2 = r27
            int r1 = ie1.C41343r.m119925u(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r27.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0122
            java.lang.Object r2 = r1.next()
            xh0.l r2 = (xh0.C29796l) r2
            xg.d r9 = new xg.d
            java.lang.String r3 = r2.mo70023e()
            java.lang.String r10 = ""
            if (r3 != 0) goto L_0x0028
            r3 = r10
        L_0x0028:
            java.util.Currency r4 = java.util.Currency.getInstance(r3)
            java.lang.String r3 = "getInstance(account.ccy ?: \"\")"
            kotlin.jvm.internal.C41536l.m120488h(r4, r3)
            java.math.BigDecimal r3 = r2.mo70022d()
            if (r3 != 0) goto L_0x0039
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
        L_0x0039:
            r5 = r3
            java.lang.String r3 = "account.availableAmount ?: BigDecimal.ZERO"
            kotlin.jvm.internal.C41536l.m120488h(r5, r3)
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Iterator r3 = r28.iterator()
        L_0x004a:
            boolean r4 = r3.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0072
            java.lang.Object r4 = r3.next()
            r7 = r4
            xh0.l r7 = (xh0.C29796l) r7
            long r7 = r7.mo70027h()
            java.lang.Long r11 = r2.mo70029i()
            if (r11 != 0) goto L_0x0064
            goto L_0x006e
        L_0x0064:
            long r11 = r11.longValue()
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x006e
            r7 = r5
            goto L_0x006f
        L_0x006e:
            r7 = 0
        L_0x006f:
            if (r7 == 0) goto L_0x004a
            goto L_0x0073
        L_0x0072:
            r4 = r6
        L_0x0073:
            xh0.l r4 = (xh0.C29796l) r4
            if (r4 == 0) goto L_0x0082
            long r7 = r4.mo70027h()
            r13 = r26
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r3 = r13.m66275a(r7)
            goto L_0x0085
        L_0x0082:
            r13 = r26
            r3 = r6
        L_0x0085:
            long r14 = r2.mo70027h()
            java.lang.String r7 = r2.mo70030j()
            if (r7 != 0) goto L_0x0096
            java.lang.String r7 = r2.mo70021c()
            if (r7 != 0) goto L_0x0096
            r7 = r10
        L_0x0096:
            java.util.List r8 = ie1.C41339p.m119900e(r9)
            boolean r2 = r2.mo70032l()
            if (r4 == 0) goto L_0x00ca
            j31.a r11 = r4.mo70025f()
            if (r11 == 0) goto L_0x00ca
            java.lang.String r11 = r11.mo89541d()
            if (r11 == 0) goto L_0x00ca
            java.lang.String r17 = g91.C32289b0.m95091c(r11)
            if (r17 == 0) goto L_0x00ca
            ge.bog.designsystem.components.common.Image$Url r11 = new ge.bog.designsystem.components.common.Image$Url
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 126(0x7e, float:1.77E-43)
            r25 = 0
            r16 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x00d7
        L_0x00ca:
            if (r3 == 0) goto L_0x00d6
            int r11 = r3.resId
            ge.bog.designsystem.components.common.Image$Resource r12 = new ge.bog.designsystem.components.common.Image$Resource
            r10 = 2
            r12.<init>(r11, r6, r10, r6)
            r11 = r12
            goto L_0x00d7
        L_0x00d6:
            r11 = r6
        L_0x00d7:
            if (r4 == 0) goto L_0x00e4
            j31.a r10 = r4.mo70025f()
            if (r10 == 0) goto L_0x00e4
            java.lang.String r10 = r10.mo89541d()
            goto L_0x00e5
        L_0x00e4:
            r10 = r6
        L_0x00e5:
            if (r10 == 0) goto L_0x00f7
            j31.a r3 = r4.mo70025f()
            if (r3 == 0) goto L_0x0101
            boolean r3 = r3.mo89542e()
            r3 = r3 ^ r5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x00ff
        L_0x00f7:
            if (r3 == 0) goto L_0x0101
            boolean r3 = r3.isLightText
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        L_0x00ff:
            r10 = r3
            goto L_0x0102
        L_0x0101:
            r10 = r6
        L_0x0102:
            r12 = 16
            r16 = 0
            ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a r6 = new ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a
            r3 = r6
            r4 = r7
            r5 = r9
            r9 = r6
            r6 = r8
            r7 = r2
            r2 = 0
            r8 = r2
            r2 = r9
            r9 = r11
            r11 = r12
            r12 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            z11.b r3 = new z11.b
            r3.<init>(r14, r2)
            r0.add(r3)
            goto L_0x0011
        L_0x0122:
            r13 = r26
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ej0.C20260n.m66276b(java.util.List, java.util.List):java.util.List");
    }

    /* renamed from: c */
    public final CreditCardSmallPickerView.C13279b mo48730c(C29796l lVar) {
        String str;
        String d;
        C41536l.m120489i(lVar, "account");
        C36725a g = lVar.mo70026g();
        String str2 = null;
        if (g == null || (d = g.mo89541d()) == null) {
            str = null;
        } else {
            str = C32289b0.m95091c(d);
        }
        BigDecimal d2 = lVar.mo70022d();
        if (d2 != null) {
            str2 = C32343x.m95408P(d2, "GEL");
        }
        return new CreditCardSmallPickerView.C13279b.C13281b(str, (Integer) null, str2, lVar.mo70032l(), (String) null);
    }

    /* renamed from: d */
    public final List mo48731d(List list, String str) {
        Object obj;
        List list2 = list;
        String str2 = str;
        C41536l.m120489i(list2, "accounts");
        C41536l.m120489i(str2, "mainCurrency");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29796l lVar = (C29796l) it.next();
            List k = lVar.mo70031k();
            C29796l lVar2 = null;
            if (k != null) {
                Iterator it2 = k.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (C41536l.m120484d(((C29796l) obj).mo70023e(), str2)) {
                        break;
                    }
                }
                C29796l lVar3 = (C29796l) obj;
                if (lVar3 != null) {
                    lVar2 = C29796l.m90522b(lVar3, 0, (String) null, (String) null, (String) null, (BigDecimal) null, (C36725a) null, (String) null, lVar.mo70025f(), (C36725a) null, false, false, false, (Long) null, (String) null, (String) null, (String) null, (Long) null, (BigDecimal) null, (List) null, (String) null, 1048447, (Object) null);
                }
            }
            if (lVar2 != null) {
                arrayList.add(lVar2);
            }
        }
        return m66276b(arrayList, list2);
    }
}
