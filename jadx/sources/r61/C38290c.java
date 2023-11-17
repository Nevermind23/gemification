package r61;

import aa1.C30916h;
import aa1.C30934m;
import ed1.C40749p;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.templates.data.models.TemplatesAndConfigApiModel;
import r61.C38293d;
import t61.C38703a;
import u61.C39035c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: r61.c */
public final class C38290c implements C38703a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C38293d f91795d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C38288a f91796e;

    /* renamed from: f */
    private final C30916h f91797f;

    /* renamed from: r61.c$a */
    static final class C38291a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38290c f91798d;

        /* renamed from: r61.c$a$a */
        /* synthetic */ class C38292a extends C41535k implements C43075l {
            C38292a(Object obj) {
                super(1, obj, C38288a.class, "transform", "transform(Lge/bog/mobilebank/templates/data/models/TemplatesAndConfigApiModel;)Lge/bog/mobilebank/templates/domain/models/TemplatesAndConfig;", 0);
            }

            /* renamed from: b */
            public final C39035c invoke(TemplatesAndConfigApiModel templatesAndConfigApiModel) {
                C41536l.m120489i(templatesAndConfigApiModel, "p0");
                return ((C38288a) this.receiver).mo91845a(templatesAndConfigApiModel);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38291a(C38290c cVar) {
            super(0);
            this.f91798d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C39035c m112565c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C39035c) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40749p invoke() {
            C40749p O = C38293d.C38294a.m112569a(this.f91798d.f91795d, 0, 0, 0, 0, (String) null, (String) null, (String) null, C11051p3.f31760d, (Object) null).mo95062A(new C38289b(new C38292a(this.f91798d.f91796e))).mo95075O();
            C41536l.m120488h(O, "api.getTemplatesAndConfi…transform).toObservable()");
            return O;
        }
    }

    public C38290c(C38293d dVar, C38288a aVar, C30916h hVar) {
        C41536l.m120489i(dVar, "api");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(hVar, "templatesAndConfigStore");
        this.f91795d = dVar;
        this.f91796e = aVar;
        this.f91797f = hVar;
    }

    /* renamed from: N3 */
    public C40749p mo91846N3(boolean z) {
        C30916h.C30929h hVar;
        if (z) {
            hVar = C30916h.C30929h.LATEST;
        } else {
            hVar = C30916h.C30929h.NO_REFRESH;
        }
        return C30934m.m92180c(this.f91797f.mo71134o(hVar, new C38291a(this)));
    }

    public void clean() {
        this.f91797f.mo71133l();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C38290c(C38293d dVar, C38288a aVar) {
        this(dVar, aVar, new C30916h());
        C41536l.m120489i(dVar, "api");
        C41536l.m120489i(aVar, "mapper");
    }
}
