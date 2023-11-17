package p881ru;

import ed1.C40762x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p891su.C28261a;
import ue1.C43075l;

/* renamed from: ru.l */
public final class C28103l {

    /* renamed from: a */
    private final C28106n f71454a;

    /* renamed from: ru.l$a */
    static final class C28104a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f71455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28104a(long j) {
            super(1);
            this.f71455d = j;
        }

        /* renamed from: a */
        public final C28261a invoke(List list) {
            Object obj;
            boolean z;
            C41536l.m120489i(list, "it");
            long j = this.f71455d;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C28261a) obj).mo67857m() == j) {
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
            return (C28261a) obj;
        }
    }

    public C28103l(C28106n nVar) {
        C41536l.m120489i(nVar, "loadContactsUseCase");
        this.f71454a = nVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C28261a m86554c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28261a) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo67637b(long j) {
        C40762x A = C28106n.m86558c(this.f71454a, false, (Long) null, 3, (Object) null).mo95062A(new C28102k(new C28104a(j)));
        C41536l.m120488h(A, "contactId: Long): Single…ntact.id == contactId } }");
        return A;
    }
}
