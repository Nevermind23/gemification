package p773gv;

import ed1.C40734b;
import ed1.C40739f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p784hw.C25074c;
import p792iv.C25260a;
import p793iw.C25263b;
import p793iw.C25264c;
import p891su.C28261a;
import ue1.C43075l;

/* renamed from: gv.c */
public final class C24784c {

    /* renamed from: a */
    private final C25074c f63691a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25260a f63692b;

    /* renamed from: gv.c$a */
    static final class C24785a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f63693d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24785a(long j) {
            super(1);
            this.f63693d = j;
        }

        /* renamed from: a */
        public final C25263b invoke(C25264c cVar) {
            Object obj;
            boolean z;
            C41536l.m120489i(cVar, "transactions");
            List d = cVar.mo63846d();
            long j = this.f63693d;
            Iterator it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C25263b) obj).mo63831o() == j) {
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
            return (C25263b) obj;
        }
    }

    /* renamed from: gv.c$b */
    static final class C24786b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24784c f63694d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24786b(C24784c cVar) {
            super(1);
            this.f63694d = cVar;
        }

        /* renamed from: a */
        public final C40739f invoke(C25263b bVar) {
            C41536l.m120489i(bVar, "it");
            return this.f63694d.f63692b.mo63791n3(bVar);
        }
    }

    public C24784c(C25074c cVar, C25260a aVar) {
        C41536l.m120489i(cVar, "getTransactions");
        C41536l.m120489i(aVar, "repository");
        this.f63691a = cVar;
        this.f63692b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C25263b m79402e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25263b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40739f m79403f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* renamed from: d */
    public final C40734b mo63203d(long j) {
        C40734b s = C25074c.m80040d(this.f63691a, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (List) null, (List) null, (List) null, (String) null, (List) null, (List) null, false, (C28261a) null, false, 16383, (Object) null).mo95062A(new C24780a(new C24785a(j))).mo95088s(new C24782b(new C24786b(this)));
        C41536l.m120488h(s, "operator fun invoke(oper…ation(it)\n        }\n    }");
        return s;
    }
}
