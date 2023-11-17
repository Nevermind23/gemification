package x41;

import b51.C31133a;
import c51.C31275a;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import ee1.C40767b;
import he1.C41238w;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: x41.e */
public final class C39784e implements C39780a {

    /* renamed from: a */
    private final C40767b f94489a;

    /* renamed from: b */
    private final C40765a f94490b;

    /* renamed from: x41.e$a */
    static final class C39785a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31133a f94491d;

        /* renamed from: x41.e$a$a */
        static final class C39786a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31133a f94492d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39786a(C31133a aVar) {
                super(1);
                this.f94492d = aVar;
            }

            /* renamed from: a */
            public final C40754t invoke(Long l) {
                C41536l.m120489i(l, "it");
                return this.f94492d.mo71352a().mo95075O().mo95031r0(C40749p.m118027J());
            }
        }

        /* renamed from: x41.e$a$b */
        static final class C39787b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C39787b f94493d = new C39787b();

            C39787b() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(C31275a aVar) {
                C41536l.m120489i(aVar, "it");
                return Boolean.valueOf(!aVar.mo71528d());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39785a(C31133a aVar) {
            super(1);
            this.f94491d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C40754t m115556d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40754t) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final boolean m115557e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return ((Boolean) lVar.invoke(obj)).booleanValue();
        }

        /* renamed from: c */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C40749p.m118038e0(0, 1, TimeUnit.MINUTES).mo94989L0(new C39782c(new C39786a(this.f94491d))).mo94997P0(new C39783d(C39787b.f94493d));
        }
    }

    public C39784e(C31133a aVar) {
        C41536l.m120489i(aVar, "getServerStatusUseCase");
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f94489a = h1;
        C40765a h12 = C40765a.m118198h1();
        C41536l.m120488h(h12, "create<ServerStatus>()");
        this.f94490b = h12;
        h1.mo94989L0(new C39781b(new C39785a(aVar))).mo95016c(h12);
        C41238w wVar = C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40754t m115551d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40749p mo93512a() {
        C40749p c0 = this.f94490b.mo95017c0();
        C41536l.m120488h(c0, "statusObservable.hide()");
        return c0;
    }

    /* renamed from: b */
    public void mo93513b() {
        this.f94489a.onNext(C41238w.f97225a);
    }
}
