package xu0;

import av0.C31085h;
import ed1.C40734b;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26186e;
import ru0.C38348d;
import su0.C38536a;
import tu0.C38796a;
import ue1.C43075l;
import vu0.C39474a;

/* renamed from: xu0.f */
public final class C39913f implements C38348d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C39474a f94667a;

    /* renamed from: xu0.f$a */
    static final class C39914a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f94668d;

        /* renamed from: e */
        final /* synthetic */ C39913f f94669e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39914a(long j, C39913f fVar) {
            super(1);
            this.f94668d = j;
            this.f94669e = fVar;
        }

        /* renamed from: a */
        public final void mo93603a(List list) {
            Object obj;
            boolean z;
            C41536l.m120488h(list, "it");
            long j = this.f94668d;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C38536a) obj).mo92133i() == j) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C38536a aVar = (C38536a) obj;
            if (aVar != null) {
                this.f94669e.f94667a.mo90612b1(aVar);
                C31085h.f77286a.mo71285a(new C38796a.C38799c(aVar));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93603a((List) obj);
            return C41238w.f97225a;
        }
    }

    public C39913f(C39474a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f94667a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m115699d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo91882a(long j) {
        C40734b y = C26186e.m81990h(this.f94667a.mo90610W0(false)).mo95084m(new C39912e(new C39914a(j, this))).mo95092y();
        C41536l.m120488h(y, "override fun invoke(id: …  }.ignoreElement()\n    }");
        return y;
    }
}
