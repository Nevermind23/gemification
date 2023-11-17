package zu0;

import g91.C32343x;
import i20.C25106f;
import j31.C36726b;
import j31.C36727c;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import p825ly.C26096a;
import su0.C38536a;
import su0.C38557c;

/* renamed from: zu0.a */
public final class C40257a extends C26096a {

    /* renamed from: a */
    private final DecimalFormat f95696a = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.US));

    /* renamed from: c */
    private final String m116626c(C38536a aVar) {
        List list;
        C36726b C = aVar.mo92121C();
        String str = null;
        if (C != null) {
            list = C.mo89546a();
        } else {
            list = null;
        }
        String d = m116627d("totalAmount", list);
        String d2 = m116627d("term", list);
        String m = aVar.mo92137m();
        if (m != null) {
            String l = aVar.mo92136l();
            Object[] objArr = new Object[2];
            if (d == null) {
                d = "";
            }
            objArr[0] = d;
            if (d2 == null) {
                d2 = "";
            }
            objArr[1] = d2;
            str = C32343x.m95420V(m, l, objArr);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: d */
    private final String m116627d(String str, List list) {
        boolean z;
        Object obj;
        if (list == null) {
            return null;
        }
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C36727c) obj).mo89551a(), str)) {
                break;
            }
        }
        C36727c cVar = (C36727c) obj;
        if (cVar != null) {
            return cVar.mo89552b();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final i20.C25106f m116628e(su0.C38536a r23) {
        /*
            r22 = this;
            r0 = r23
            su0.b r1 = r23.mo92150y()
            su0.b$g r2 = su0.C38537b.C38544g.f92391c
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r2)
            if (r1 == 0) goto L_0x0015
            int r1 = ku0.C36991a.f89141a
            java.lang.String r2 = "NBO_combined_offer"
            java.lang.String r3 = "click"
            goto L_0x001b
        L_0x0015:
            int r1 = ku0.C36991a.f89142b
            java.lang.String r2 = "NBO"
            java.lang.String r3 = "click_banner"
        L_0x001b:
            r11 = r1
            long r5 = r23.mo92133i()
            j31.a r1 = r23.mo92129f()
            r4 = 2
            r7 = 0
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = r1.mo89541d()
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = g91.C32289b0.m95091c(r1)
            goto L_0x0034
        L_0x0033:
            r1 = r7
        L_0x0034:
            java.lang.String r13 = java.lang.String.valueOf(r1)
            ge.bog.designsystem.components.common.Image$Resource r14 = new ge.bog.designsystem.components.common.Image$Resource
            int r1 = ku0.C36992b.ic_nbo_placeholder
            r14.<init>(r1, r7, r4, r7)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 124(0x7c, float:1.74E-43)
            r21 = 0
            ge.bog.designsystem.components.common.Image$Url r1 = new ge.bog.designsystem.components.common.Image$Url
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x005a
        L_0x0053:
            ge.bog.designsystem.components.common.Image$Resource r1 = new ge.bog.designsystem.components.common.Image$Resource
            int r8 = ku0.C36992b.ic_nbo_placeholder
            r1.<init>(r8, r7, r4, r7)
        L_0x005a:
            r7 = r1
            java.lang.String r8 = r22.m116626c(r23)
            java.lang.String r1 = r23.mo92139o()
            r4 = 0
            if (r1 == 0) goto L_0x0072
            java.lang.String r9 = r23.mo92138n()
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r1 = g91.C32343x.m95420V(r1, r9, r10)
            if (r1 != 0) goto L_0x0076
        L_0x0072:
            java.lang.String r1 = r23.mo92138n()
        L_0x0076:
            java.lang.String r9 = java.lang.String.valueOf(r1)
            tu0.a$d r12 = new tu0.a$d
            r12.<init>(r0)
            tu0.a$b r13 = new tu0.a$b
            r13.<init>(r0, r3, r2)
            java.lang.String r1 = r23.mo92143s()
            if (r1 == 0) goto L_0x0096
            java.lang.String r2 = r23.mo92143s()
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r1 = g91.C32343x.m95420V(r1, r2, r3)
            if (r1 != 0) goto L_0x009a
        L_0x0096:
            java.lang.String r1 = r23.mo92143s()
        L_0x009a:
            java.lang.String r10 = java.lang.String.valueOf(r1)
            i20.f$b r0 = new i20.f$b
            r14 = 1
            r4 = r0
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.C40257a.m116628e(su0.a):i20.f");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        if (r0 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final i20.C25106f m116629f(su0.C38536a r21) {
        /*
            r20 = this;
            long r1 = r21.mo92133i()
            j31.a r0 = r21.mo92129f()
            r3 = 2
            r4 = 0
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.mo89541d()
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = g91.C32289b0.m95091c(r0)
            goto L_0x0018
        L_0x0017:
            r0 = r4
        L_0x0018:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r0 = ku0.C36992b.ic_nbo_placeholder
            r7.<init>(r0, r4, r3, r4)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 124(0x7c, float:1.74E-43)
            r14 = 0
            ge.bog.designsystem.components.common.Image$Url r0 = new ge.bog.designsystem.components.common.Image$Url
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0039
        L_0x0032:
            ge.bog.designsystem.components.common.Image$Resource r0 = new ge.bog.designsystem.components.common.Image$Resource
            int r5 = ku0.C36992b.ic_nbo_placeholder
            r0.<init>(r5, r4, r3, r4)
        L_0x0039:
            r3 = r0
            java.lang.String r0 = r21.mo92137m()
            r4 = 0
            if (r0 == 0) goto L_0x004d
            java.lang.String r5 = r21.mo92136l()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r0 = g91.C32343x.m95420V(r0, r5, r6)
            if (r0 != 0) goto L_0x005b
        L_0x004d:
            java.lang.String r0 = r21.mo92136l()
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = r21.mo92151z()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x005b:
            r5 = r0
            java.lang.String r0 = r21.mo92146u()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.Double r0 = r21.mo92127e()
            if (r0 == 0) goto L_0x00a4
            double r7 = r0.doubleValue()
            su0.d r0 = r21.mo92144t()
            su0.d$a r9 = su0.C38559d.C38560a.f92412b
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r9)
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "text.nbo.card.effective.rate.zero"
            goto L_0x007f
        L_0x007d:
            java.lang.String r0 = "text.nbo.card.effective.rate"
        L_0x007f:
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r13 = r20
            java.text.DecimalFormat r10 = r13.f95696a
            java.lang.String r7 = r10.format(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "%"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r9[r4] = r7
            java.lang.String r0 = g91.C32343x.m95388F(r0, r9)
            if (r0 != 0) goto L_0x00a8
            goto L_0x00a6
        L_0x00a4:
            r13 = r20
        L_0x00a6:
            java.lang.String r0 = ""
        L_0x00a8:
            r7 = r0
            r8 = 0
            tu0.a$d r9 = new tu0.a$d
            r0 = r21
            r9.<init>(r0)
            tu0.a$b r10 = new tu0.a$b
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            r14 = r10
            r15 = r21
            r14.<init>(r15, r16, r17, r18, r19)
            r11 = 1
            r12 = 32
            r14 = 0
            i20.f$a r15 = new i20.f$a
            r0 = r15
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.C40257a.m116629f(su0.a):i20.f");
    }

    /* renamed from: a */
    public C25106f mo65014a(C38536a aVar) {
        C41536l.m120489i(aVar, "nboOffer");
        if (C41536l.m120484d(aVar.mo92150y().mo92152a(), "COND_CNS") || aVar.mo92120B() == null) {
            return null;
        }
        if (C41358y.m119999O(C41341q.m119910m(C38557c.OFFER, C38557c.LIMIT_BANNER), aVar.mo92120B())) {
            return m116628e(aVar);
        }
        if (C41358y.m119999O(C41341q.m119910m(C38557c.CREDIT_CARD, C38557c.LOAN), aVar.mo92120B())) {
            return m116629f(aVar);
        }
        return null;
    }
}
