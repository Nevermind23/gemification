package p773gv;

import ed1.C40762x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p881ru.C28106n;
import p891su.C28261a;
import ue1.C43075l;

/* renamed from: gv.z */
public final class C24833z {

    /* renamed from: a */
    private final C28106n f63749a;

    /* renamed from: gv.z$a */
    static final class C24834a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f63750d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24834a(String str) {
            super(1);
            this.f63750d = str;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "contactList");
            String str = this.f63750d;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                C28261a aVar = (C28261a) next;
                String i = aVar.mo67853i();
                boolean z = true;
                if (!(i != null && C40440x.m117139M(i, str, false, 2, (Object) null))) {
                    String n = aVar.mo67858n();
                    if (!(n != null && C40440x.m117139M(n, str, false, 2, (Object) null))) {
                        String j = aVar.mo67854j();
                        if (!(j != null && C40440x.m117135K(j, str, true))) {
                            String k = aVar.mo67855k();
                            if (!(k != null && C40440x.m117135K(k, str, true))) {
                                z = false;
                            }
                        }
                    }
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    public C24833z(C28106n nVar) {
        C41536l.m120489i(nVar, "loadContactsUseCase");
        this.f63749a = nVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m79472c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo63243b(String str, boolean z) {
        C41536l.m120489i(str, "searchWord");
        C40762x A = C28106n.m86558c(this.f63749a, z, (Long) null, 2, (Object) null).mo95062A(new C24832y(new C24834a(str)));
        C41536l.m120488h(A, "searchWord: String, refr…e\n            }\n        }");
        return A;
    }
}
