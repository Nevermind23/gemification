package v61;

import ed1.C40749p;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: v61.c */
public final class C39237c {

    /* renamed from: a */
    private final C39235a f93424a;

    /* renamed from: v61.c$a */
    static final class C39238a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f93425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39238a(String str) {
            super(1);
            this.f93425d = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0014 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List invoke(u61.C39035c r11) {
            /*
                r10 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C41536l.m120489i(r11, r0)
                java.util.List r11 = r11.mo92714a()
                java.lang.String r6 = r10.f93425d
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r11 = r11.iterator()
            L_0x0014:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x0056
                java.lang.Object r8 = r11.next()
                r9 = r8
                u61.a r9 = (u61.C39033a) r9
                java.lang.String r0 = r9.mo92701e()
                boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r6)
                if (r0 != 0) goto L_0x004f
                if (r6 == 0) goto L_0x003e
                java.lang.String r0 = ","
                java.lang.String[] r1 = new java.lang.String[]{r0}
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r0 = r6
                java.util.List r0 = cf1.C40440x.m117182x0(r0, r1, r2, r3, r4, r5)
                if (r0 != 0) goto L_0x0042
            L_0x003e:
                java.util.List r0 = ie1.C41341q.m119907j()
            L_0x0042:
                java.lang.String r1 = r9.mo92701e()
                boolean r0 = ie1.C41358y.m119999O(r0, r1)
                if (r0 == 0) goto L_0x004d
                goto L_0x004f
            L_0x004d:
                r0 = 0
                goto L_0x0050
            L_0x004f:
                r0 = 1
            L_0x0050:
                if (r0 == 0) goto L_0x0014
                r7.add(r8)
                goto L_0x0014
            L_0x0056:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: v61.C39237c.C39238a.invoke(u61.c):java.util.List");
        }
    }

    public C39237c(C39235a aVar) {
        C41536l.m120489i(aVar, "getTemplatesAndConfigsUseCase");
        this.f93424a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m114354c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40749p mo92860b(String str) {
        C40749p k0 = C39235a.m114351b(this.f93424a, false, 1, (Object) null).mo95026k0(new C39236b(new C39238a(str)));
        C41536l.m120488h(k0, "serviceId: String?) : Ob…          }\n            }");
        return k0;
    }
}
