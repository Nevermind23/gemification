package v61;

import ed1.C40762x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import u61.C39033a;
import u61.C39035c;
import ue1.C43075l;

/* renamed from: v61.f */
public final class C39241f {

    /* renamed from: a */
    private final C39235a f93428a;

    /* renamed from: v61.f$a */
    static final class C39242a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f93429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39242a(String str) {
            super(1);
            this.f93429d = str;
        }

        /* renamed from: a */
        public final List invoke(C39035c cVar) {
            boolean z;
            C41536l.m120489i(cVar, "it");
            List a = cVar.mo92714a();
            String str = this.f93429d;
            ArrayList arrayList = new ArrayList();
            for (Object next : a) {
                String g = ((C39033a) next).mo92704g();
                if (g != null) {
                    z = C40440x.m117135K(g, str, true);
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    public C39241f(C39235a aVar) {
        C41536l.m120489i(aVar, "getTemplatesUseCase");
        this.f93428a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m114359c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo92863b(String str) {
        C41536l.m120489i(str, "searchString");
        C40762x A = C39235a.m114351b(this.f93428a, false, 1, (Object) null).mo94996P().mo95062A(new C39240e(new C39242a(str)));
        C41536l.m120488h(A, "searchString: String = \"…e\n            }\n        }");
        return A;
    }
}
