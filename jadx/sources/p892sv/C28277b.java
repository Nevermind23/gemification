package p892sv;

import ed1.C40762x;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import p750ew.C20300c;
import p914uv.C28945a;

/* renamed from: sv.b */
public final class C28277b {

    /* renamed from: a */
    private final C28945a f71767a;

    /* renamed from: b */
    private final C20300c f71768b;

    public C28277b(C28945a aVar, C20300c cVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(cVar, "transactionCategoriesUseCase");
        this.f71767a = aVar;
        this.f71768b = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: fw.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: fw.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: fw.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: fw.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p903tv.C28517a m86908c(p903tv.C28517a r13, java.util.List r14) {
        /*
            java.lang.String r0 = "analysis"
            kotlin.jvm.internal.C41536l.m120489i(r13, r0)
            java.lang.String r0 = "categories"
            kotlin.jvm.internal.C41536l.m120489i(r14, r0)
            tv.c r0 = r13.mo68116d()
            java.util.List r0 = r0.mo68129c()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x005c
            java.lang.Object r2 = r0.next()
            r5 = r2
            tv.b r5 = (p903tv.C28518b) r5
            java.util.Iterator r6 = r14.iterator()
        L_0x002e:
            boolean r7 = r6.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x004e
            java.lang.Object r7 = r6.next()
            r9 = r7
            fw.a r9 = (p760fw.C20575a) r9
            long r9 = r9.mo49102b()
            long r11 = r5.mo68122c()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x004a
            r9 = r3
            goto L_0x004b
        L_0x004a:
            r9 = r8
        L_0x004b:
            if (r9 == 0) goto L_0x002e
            r4 = r7
        L_0x004e:
            fw.a r4 = (p760fw.C20575a) r4
            if (r4 == 0) goto L_0x0056
            boolean r8 = r4.mo49104d()
        L_0x0056:
            if (r8 == 0) goto L_0x001b
            r1.add(r2)
            goto L_0x001b
        L_0x005c:
            tv.c r14 = r13.mo68116d()
            r0 = 2
            tv.c r14 = p903tv.C28519c.m87358b(r14, r1, r4, r0, r4)
            tv.a r13 = p903tv.C28517a.m87349b(r13, r4, r14, r3, r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p892sv.C28277b.m86908c(tv.a, java.util.List):tv.a");
    }

    /* renamed from: b */
    public final C40762x mo67897b(String str, String str2, ArrayList arrayList) {
        C41536l.m120489i(str, "fromDate");
        C41536l.m120489i(str2, "toDate");
        C40762x T = C40762x.m118154T(this.f71767a.mo68798a(str, str2, arrayList), this.f71768b.mo48784a().mo95066E(C41341q.m119907j()), new C28276a());
        C41536l.m120488h(T, "zip(\n                rep…              }\n        )");
        return T;
    }
}
