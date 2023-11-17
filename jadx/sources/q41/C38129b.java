package q41;

import kotlin.jvm.internal.C41536l;
import of1.C41884e0;
import of1.C41928u;
import of1.C41935w;
import of1.C41937x;
import of1.C41944z;

/* renamed from: q41.b */
public abstract class C38129b {
    /* renamed from: a */
    public static final boolean m112243a(C41928u uVar) {
        C41536l.m120489i(uVar, "<this>");
        String b = uVar.mo96925b("Content-Encoding");
        if (b != null && !C40439w.m117115s(b, "identity", true) && !C40439w.m117115s(b, "gzip", true)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        se1.C42550b.m123187a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r1 = move-exception;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m112244b(of1.C41880d0 r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            of1.e0 r0 = r4.mo96739a()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            of1.u r4 = r4.mo96753w()
            dg1.d r1 = r0.mo21304t()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.mo94739l(r2)
            dg1.b r1 = r1.mo94690B()
            dg1.b r1 = r1.clone()
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r4 = r4.mo96925b(r2)
            r2 = 1
            java.lang.String r3 = "gzip"
            boolean r4 = cf1.C40439w.m117115s(r3, r4, r2)
            if (r4 == 0) goto L_0x004c
            dg1.j r4 = new dg1.j
            r4.<init>(r1)
            dg1.b r1 = new dg1.b     // Catch:{ all -> 0x0045 }
            r1.<init>()     // Catch:{ all -> 0x0045 }
            r1.mo94741l1(r4)     // Catch:{ all -> 0x0045 }
            r2 = 0
            se1.C42550b.m123187a(r4, r2)
            goto L_0x004c
        L_0x0045:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            se1.C42550b.m123187a(r4, r0)
            throw r1
        L_0x004c:
            of1.x r4 = r0.mo21303q()
            if (r4 == 0) goto L_0x005a
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r4 = r4.mo97012c(r0)
            if (r4 != 0) goto L_0x0061
        L_0x005a:
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = "UTF_8"
            kotlin.jvm.internal.C41536l.m120488h(r4, r0)
        L_0x0061:
            java.lang.String r4 = r1.mo94699F0(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q41.C38129b.m112244b(of1.d0):java.lang.String");
    }

    /* renamed from: c */
    public static final boolean m112245c(C41884e0 e0Var) {
        String str;
        C41536l.m120489i(e0Var, "<this>");
        C41937x q = e0Var.mo21303q();
        if (q != null) {
            str = q.mo97017i();
        } else {
            str = null;
        }
        if (!C41536l.m120484d(str, "application") || !C41536l.m120484d(q.mo97015h(), "json")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final C41944z.C41945a m112246d(C41944z.C41945a aVar, C41935w wVar) {
        C41944z.C41945a a;
        C41536l.m120489i(aVar, "<this>");
        if (wVar == null || (a = aVar.mo97091a(wVar)) == null) {
            return aVar;
        }
        return a;
    }
}
