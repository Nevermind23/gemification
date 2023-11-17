package hv0;

import ed1.C40762x;
import iv0.C36553e;
import iv0.C36556h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: hv0.e */
public final class C36231e {

    /* renamed from: a */
    private final C36237i f87420a;

    /* renamed from: b */
    private final C36242m f87421b;

    /* renamed from: hv0.e$a */
    static final class C36232a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f87422d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36232a(String str) {
            super(1);
            this.f87422d = str;
        }

        public final List invoke(List list) {
            ArrayList arrayList;
            Object obj;
            List<C36553e> e;
            C41536l.m120489i(list, "it");
            String str = this.f87422d;
            Iterator it = list.iterator();
            while (true) {
                arrayList = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((C36556h) obj).mo89372d(), str)) {
                    break;
                }
            }
            C36556h hVar = (C36556h) obj;
            if (!(hVar == null || (e = hVar.mo89373e()) == null)) {
                arrayList = new ArrayList();
                for (C36553e b : e) {
                    boolean unused = C41352v.m119965z(arrayList, b.mo89350b());
                }
            }
            return arrayList == null ? C41341q.m119907j() : arrayList;
        }
    }

    public C36231e(C36237i iVar, C36242m mVar) {
        C41536l.m120489i(iVar, "getOpenBankProductsUseCase");
        C41536l.m120489i(mVar, "reloadProductsAfterAuthUseCase");
        this.f87420a = iVar;
        this.f87421b = mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m107661d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m107662e(C36231e eVar) {
        C41536l.m120489i(eVar, "this$0");
        eVar.f87421b.mo88982a();
    }

    /* renamed from: c */
    public final C40762x mo88973c(String str) {
        C41536l.m120489i(str, "consentId");
        C40762x j = this.f87420a.mo88978a(true).mo95062A(new C36229c(new C36232a(str))).mo95081j(new C36230d(this));
        C41536l.m120488h(j, "consentId: String): Sing…erAuthUseCase()\n        }");
        return j;
    }
}
