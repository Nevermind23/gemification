package hv0;

import ed1.C40762x;
import iv0.C36553e;
import iv0.C36554f;
import iv0.C36557i;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: hv0.k */
public final class C36239k {

    /* renamed from: a */
    private final C36235h f87430a;

    /* renamed from: hv0.k$a */
    static final class C36240a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f87431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36240a(String str) {
            super(1);
            this.f87431d = str;
        }

        /* renamed from: a */
        public final C36554f invoke(C36553e eVar) {
            Object obj;
            C41536l.m120489i(eVar, "it");
            List b = eVar.mo89350b();
            String str = this.f87431d;
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((C36554f) obj).mo89361f(), str)) {
                    break;
                }
            }
            return (C36554f) obj;
        }
    }

    public C36239k(C36235h hVar) {
        C41536l.m120489i(hVar, "getProductByType");
        this.f87430a = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C36554f m107672c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C36554f) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo88979b(String str, C36557i iVar, String str2) {
        C41536l.m120489i(str, "consentId");
        C41536l.m120489i(iVar, "productType");
        C41536l.m120489i(str2, "productId");
        C40762x A = this.f87430a.mo88976b(str, iVar).mo95062A(new C36238j(new C36240a(str2)));
        C41536l.m120488h(A, "productId: String\n    ):…d\n            }\n        }");
        return A;
    }
}
