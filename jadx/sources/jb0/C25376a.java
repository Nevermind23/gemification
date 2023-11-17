package jb0;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import m70.C26148a;
import m70.C26150c;
import m70.C26153f;

/* renamed from: jb0.a */
public final class C25376a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: m70.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final m70.C26148a m80551a(m70.C26156i r7, java.lang.Long r8) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0037
            m70.h r7 = r7.mo65188a()
            if (r7 == 0) goto L_0x0037
            java.util.List r7 = r7.mo65182a()
            if (r7 == 0) goto L_0x0037
            java.util.Iterator r7 = r7.iterator()
        L_0x0013:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r7.next()
            r2 = r1
            m70.a r2 = (m70.C26148a) r2
            long r2 = r2.mo65087b()
            if (r8 != 0) goto L_0x0027
            goto L_0x0031
        L_0x0027:
            long r4 = r8.longValue()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0031
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            if (r2 == 0) goto L_0x0013
            r0 = r1
        L_0x0035:
            m70.a r0 = (m70.C26148a) r0
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb0.C25376a.m80551a(m70.i, java.lang.Long):m70.a");
    }

    /* renamed from: b */
    private final Double m80552b(C26148a aVar, String str) {
        List q;
        Object obj;
        BigDecimal b;
        C26150c a = aVar.mo65086a();
        if (a == null || (q = a.mo65138q()) == null) {
            return null;
        }
        Iterator it = q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C26153f) obj).mo65167c(), str)) {
                break;
            }
        }
        C26153f fVar = (C26153f) obj;
        if (fVar == null || (b = fVar.mo65166b()) == null) {
            return null;
        }
        return Double.valueOf(b.doubleValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo63963c(java.util.List r27, p863pw.C27637o r28, m70.C26156i r29, java.lang.String r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r30
            java.lang.String r3 = "accounts"
            kotlin.jvm.internal.C41536l.m120489i(r1, r3)
            java.lang.String r3 = "cards"
            r4 = r28
            kotlin.jvm.internal.C41536l.m120489i(r4, r3)
            java.lang.String r3 = "ccy"
            kotlin.jvm.internal.C41536l.m120489i(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = ie1.C41343r.m119925u(r1, r5)
            r3.<init>(r5)
            java.util.Iterator r1 = r27.iterator()
        L_0x0026:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0110
            java.lang.Object r5 = r1.next()
            ty.a r5 = (p906ty.C28523a) r5
            java.lang.Long r6 = r5.mo68135a()
            r7 = 0
            if (r6 == 0) goto L_0x0054
            long r8 = r6.longValue()
            java.util.Map r6 = r28.mo67167a()
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
            java.lang.Long r9 = r5.mo68135a()
            r10 = r29
            m70.a r9 = r0.m80551a(r10, r9)
            if (r9 == 0) goto L_0x0080
            java.lang.Double r11 = r0.m80552b(r9, r2)
            goto L_0x0081
        L_0x0080:
            r11 = r7
        L_0x0081:
            java.lang.Long r12 = r5.mo68135a()
            kotlin.jvm.internal.C41536l.m120486f(r12)
            long r14 = r12.longValue()
            java.lang.String r16 = r5.mo68136b()
            kotlin.jvm.internal.C41536l.m120486f(r16)
            if (r11 == 0) goto L_0x009c
            double r12 = r11.doubleValue()
        L_0x0099:
            r17 = r12
            goto L_0x00aa
        L_0x009c:
            java.lang.Double r12 = r5.mo68138d()
            if (r12 == 0) goto L_0x00a7
            double r12 = r12.doubleValue()
            goto L_0x0099
        L_0x00a7:
            r12 = 0
            goto L_0x0099
        L_0x00aa:
            if (r11 == 0) goto L_0x00af
            r19 = r2
            goto L_0x00b9
        L_0x00af:
            java.lang.String r11 = r5.mo68139e()
            if (r11 != 0) goto L_0x00b7
            java.lang.String r11 = "GEL"
        L_0x00b7:
            r19 = r11
        L_0x00b9:
            int r11 = r8.resId
            if (r6 == 0) goto L_0x00cd
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r12 = r6.mo67135s()
            if (r12 == 0) goto L_0x00cd
            java.lang.String r12 = r12.getFileUrl()
            if (r12 == 0) goto L_0x00cd
            java.lang.String r7 = g91.C32289b0.m95091c(r12)
        L_0x00cd:
            r21 = r7
            java.lang.String r22 = r5.mo68137c()
            r5 = 1
            r7 = 0
            if (r6 == 0) goto L_0x00e6
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r6 = r6.mo67135s()
            if (r6 == 0) goto L_0x00e6
            boolean r6 = r6.isDark()
            if (r6 != 0) goto L_0x00e6
            r24 = r5
            goto L_0x00e8
        L_0x00e6:
            r24 = r7
        L_0x00e8:
            int r6 = r8.resId
            r12 = -1
            if (r6 == r12) goto L_0x00f4
            boolean r6 = r8.isLightText
            if (r6 == 0) goto L_0x00f4
            r23 = r5
            goto L_0x00f6
        L_0x00f4:
            r23 = r7
        L_0x00f6:
            if (r9 == 0) goto L_0x0101
            boolean r6 = r9.mo65084F()
            if (r6 != r5) goto L_0x0101
            r25 = r5
            goto L_0x0103
        L_0x0101:
            r25 = r7
        L_0x0103:
            ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel r5 = new ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel
            r13 = r5
            r20 = r11
            r13.<init>(r14, r16, r17, r19, r20, r21, r22, r23, r24, r25)
            r3.add(r5)
            goto L_0x0026
        L_0x0110:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jb0.C25376a.mo63963c(java.util.List, pw.o, m70.i, java.lang.String):java.util.List");
    }
}
