package t90;

import aa1.C30916h;
import aa1.C30934m;
import ed1.C40749p;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.ddsto.data.p767dd.DdWrapperApiModel;
import t90.C28334c;
import ue1.C43064a;
import ue1.C43075l;
import y90.C29955a;

/* renamed from: t90.b */
public final class C28331b implements C29955a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C28334c f71845d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28336d f71846e;

    /* renamed from: f */
    private final C30916h f71847f;

    /* renamed from: t90.b$a */
    static final class C28332a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C28331b f71848d;

        /* renamed from: t90.b$a$a */
        /* synthetic */ class C28333a extends C41535k implements C43075l {
            C28333a(Object obj) {
                super(1, obj, C28336d.class, "transform", "transform(Lge/bog/mobilebank/ddsto/data/dd/DdWrapperApiModel;)Ljava/util/List;", 0);
            }

            /* renamed from: b */
            public final List invoke(DdWrapperApiModel ddWrapperApiModel) {
                C41536l.m120489i(ddWrapperApiModel, "p0");
                return ((C28336d) this.receiver).mo67976a(ddWrapperApiModel);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28332a(C28331b bVar) {
            super(0);
            this.f71848d = bVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40749p invoke() {
            C40749p O = C28334c.C28335a.m86973a(this.f71848d.f71845d, (List) null, 1, (Object) null).mo95062A(new C28330a(new C28333a(this.f71848d.f71846e))).mo95075O();
            C41536l.m120488h(O, "api.getDd().map(mapper::transform).toObservable()");
            return O;
        }
    }

    public C28331b(C28334c cVar, C28336d dVar, C30916h hVar) {
        C41536l.m120489i(cVar, "api");
        C41536l.m120489i(dVar, "mapper");
        C41536l.m120489i(hVar, "ddStore");
        this.f71845d = cVar;
        this.f71846e = dVar;
        this.f71847f = hVar;
    }

    public void clean() {
        this.f71847f.mo71133l();
    }

    /* renamed from: d2 */
    public C40749p mo67972d2(boolean z) {
        C30916h.C30929h hVar;
        if (z) {
            hVar = C30916h.C30929h.LATEST;
        } else {
            hVar = C30916h.C30929h.NO_REFRESH;
        }
        return C30934m.m92180c(this.f71847f.mo71134o(hVar, new C28332a(this)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C28331b(C28334c cVar, C28336d dVar) {
        this(cVar, dVar, new C30916h());
        C41536l.m120489i(cVar, "api");
        C41536l.m120489i(dVar, "mapper");
    }
}
