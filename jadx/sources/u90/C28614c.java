package u90;

import aa1.C30916h;
import aa1.C30934m;
import ed1.C40749p;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;
import ue1.C43075l;
import y90.C29956b;

/* renamed from: u90.c */
public final class C28614c implements C29956b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C28617d f72630d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28611a f72631e;

    /* renamed from: f */
    private final C30916h f72632f;

    /* renamed from: u90.c$a */
    static final class C28615a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C28614c f72633d;

        /* renamed from: u90.c$a$a */
        /* synthetic */ class C28616a extends C41535k implements C43075l {
            C28616a(Object obj) {
                super(1, obj, C28611a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C28611a) this.receiver).mo68333a(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28615a(C28614c cVar) {
            super(0);
            this.f72633d = cVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40749p invoke() {
            C40749p O = this.f72633d.f72630d.mo68337a().mo95062A(new C28613b(new C28616a(this.f72633d.f72631e))).mo95075O();
            C41536l.m120488h(O, "api.getStoList().map(map…transform).toObservable()");
            return O;
        }
    }

    public C28614c(C28617d dVar, C28611a aVar, C30916h hVar) {
        C41536l.m120489i(dVar, "api");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(hVar, "stoStore");
        this.f72630d = dVar;
        this.f72631e = aVar;
        this.f72632f = hVar;
    }

    public void clean() {
        this.f72632f.mo71133l();
    }

    /* renamed from: u1 */
    public C40749p mo68334u1(boolean z) {
        C30916h.C30929h hVar;
        if (z) {
            hVar = C30916h.C30929h.LATEST;
        } else {
            hVar = C30916h.C30929h.NO_REFRESH;
        }
        return C30934m.m92180c(this.f72632f.mo71134o(hVar, new C28615a(this)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C28614c(C28617d dVar, C28611a aVar) {
        this(dVar, aVar, new C30916h());
        C41536l.m120489i(dVar, "api");
        C41536l.m120489i(aVar, "mapper");
    }
}
