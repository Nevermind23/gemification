package p535nk;

import ed1.C40762x;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p521mk.C16718a;
import p563pk.C17375e;
import ue1.C43075l;

/* renamed from: nk.e */
public final class C17022e {

    /* renamed from: a */
    private final C16718a f47525a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C17040r f47526b;

    /* renamed from: nk.e$a */
    static final class C17023a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17022e f47527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17023a(C17022e eVar) {
            super(1);
            this.f47527d = eVar;
        }

        /* renamed from: a */
        public final void mo44218a(List list) {
            Object obj;
            if (list.size() == 1) {
                this.f47527d.f47526b.mo44231a(0);
                return;
            }
            C41536l.m120488h(list, "cards");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C17375e) obj).mo44847k()) {
                    break;
                }
            }
            C17375e eVar = (C17375e) obj;
            if (eVar != null) {
                this.f47527d.f47526b.mo44231a(list.indexOf(eVar));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo44218a((List) obj);
            return C41238w.f97225a;
        }
    }

    public C17022e(C16718a aVar, C17040r rVar) {
        C41536l.m120489i(aVar, "insuranceRepo");
        C41536l.m120489i(rVar, "onInsuranceCardSelectedUseCase");
        this.f47525a = aVar;
        this.f47526b = rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m59860d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo44217c() {
        C40762x m = this.f47525a.mo42970b().mo95084m(new C17021d(new C17023a(this)));
        C41536l.m120488h(m, "operator fun invoke(): S…        }\n        }\n    }");
        return m;
    }
}
