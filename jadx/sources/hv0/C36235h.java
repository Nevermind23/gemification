package hv0;

import ed1.C40762x;
import iv0.C36553e;
import iv0.C36557i;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: hv0.h */
public final class C36235h {

    /* renamed from: a */
    private final C36237i f87425a;

    /* renamed from: hv0.h$a */
    static final class C36236a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f87426d;

        /* renamed from: e */
        final /* synthetic */ C36557i f87427e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36236a(String str, C36557i iVar) {
            super(1);
            this.f87426d = str;
            this.f87427e = iVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: iv0.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: iv0.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: iv0.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: iv0.e} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final iv0.C36553e invoke(java.util.List r5) {
            /*
                r4 = this;
                java.lang.String r0 = "products"
                kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                java.lang.String r0 = r4.f87426d
                java.util.Iterator r5 = r5.iterator()
            L_0x000b:
                boolean r1 = r5.hasNext()
                r2 = 0
                if (r1 == 0) goto L_0x0024
                java.lang.Object r1 = r5.next()
                r3 = r1
                iv0.h r3 = (iv0.C36556h) r3
                java.lang.String r3 = r3.mo89372d()
                boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r0)
                if (r3 == 0) goto L_0x000b
                goto L_0x0025
            L_0x0024:
                r1 = r2
            L_0x0025:
                iv0.h r1 = (iv0.C36556h) r1
                if (r1 == 0) goto L_0x0050
                java.util.List r5 = r1.mo89373e()
                if (r5 == 0) goto L_0x0050
                iv0.i r0 = r4.f87427e
                java.util.Iterator r5 = r5.iterator()
            L_0x0035:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x004e
                java.lang.Object r1 = r5.next()
                r3 = r1
                iv0.e r3 = (iv0.C36553e) r3
                iv0.i r3 = r3.mo89349a()
                if (r3 != r0) goto L_0x004a
                r3 = 1
                goto L_0x004b
            L_0x004a:
                r3 = 0
            L_0x004b:
                if (r3 == 0) goto L_0x0035
                r2 = r1
            L_0x004e:
                iv0.e r2 = (iv0.C36553e) r2
            L_0x0050:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: hv0.C36235h.C36236a.invoke(java.util.List):iv0.e");
        }
    }

    public C36235h(C36237i iVar) {
        C41536l.m120489i(iVar, "getOpenBankProducts");
        this.f87425a = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C36553e m107666c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C36553e) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo88976b(String str, C36557i iVar) {
        C41536l.m120489i(str, "consentId");
        C41536l.m120489i(iVar, "productType");
        C40762x A = C36237i.m107669b(this.f87425a, false, 1, (Object) null).mo95062A(new C36234g(new C36236a(str, iVar)));
        C41536l.m120488h(A, "consentId: String, produ…e\n            }\n        }");
        return A;
    }
}
