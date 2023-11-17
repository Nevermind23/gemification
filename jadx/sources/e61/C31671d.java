package e61;

import ed1.C40749p;
import ed1.C40754t;
import i61.C36357a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26191f;
import ue1.C43075l;

/* renamed from: e61.d */
public final class C31671d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C36357a f78258a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C31677g f78259b;

    /* renamed from: c */
    private final C31682l f78260c;

    /* renamed from: e61.d$a */
    static final class C31672a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31671d f78261d;

        /* renamed from: e */
        final /* synthetic */ boolean f78262e;

        /* renamed from: e61.d$a$a */
        static final class C31673a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31671d f78263d;

            /* renamed from: e61.d$a$a$a */
            static final class C31674a extends C41537m implements C43075l {

                /* renamed from: d */
                public static final C31674a f78264d = new C31674a();

                C31674a() {
                    super(1);
                }

                /* renamed from: a */
                public final C26191f.C26194c invoke(List list) {
                    C41536l.m120489i(list, "it");
                    return new C26191f.C26194c(list);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31673a(C31671d dVar) {
                super(1);
                this.f78263d = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static final C26191f.C26194c m93818c(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                return (C26191f.C26194c) lVar.invoke(obj);
            }

            /* renamed from: b */
            public final C40754t invoke(C26191f fVar) {
                C41536l.m120489i(fVar, "result");
                if (fVar instanceof C26191f.C26194c) {
                    return this.f78263d.f78259b.mo72097b((List) ((C26191f.C26194c) fVar).mo65223a()).mo95062A(new C31670c(C31674a.f78264d)).mo95075O();
                }
                return C40749p.m118043h0(fVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31672a(C31671d dVar, boolean z) {
            super(1);
            this.f78261d = dVar;
            this.f78262e = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C40754t m93815c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40754t) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Boolean bool) {
            C41536l.m120489i(bool, "shouldShow");
            if (!bool.booleanValue()) {
                return C40749p.m118043h0(new C26191f.C26194c(C41341q.m119907j()));
            }
            return this.f78261d.f78258a.mo70842h0(this.f78262e).mo94998Q(new C31669b(new C31673a(this.f78261d)));
        }
    }

    public C31671d(C36357a aVar, C31677g gVar, C31682l lVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(gVar, "mapStorySeen");
        C41536l.m120489i(lVar, "shouldShowStories");
        this.f78258a = aVar;
        this.f78259b = gVar;
        this.f78260c = lVar;
    }

    /* renamed from: e */
    public static /* synthetic */ C40749p m93811e(C31671d dVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return dVar.mo72091d(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C40754t m93812f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: d */
    public final C40749p mo72091d(boolean z) {
        C40749p Q = this.f78260c.invoke().mo94998Q(new C31668a(new C31672a(this, z)));
        C41536l.m120488h(Q, "operator fun invoke(refr…}\n            }\n        }");
        return Q;
    }
}
