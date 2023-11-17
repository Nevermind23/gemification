package p592rl;

import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import k70.C25680d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26191f;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p578ql.C17535h;
import p729cv.C19799c;
import q70.C27685a;
import ue1.C43075l;

/* renamed from: rl.e */
public final class C17640e implements C25680d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C17535h f49361a;

    /* renamed from: b */
    private final C19799c f49362b;

    /* renamed from: rl.e$a */
    static final class C17641a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17640e f49363d;

        /* renamed from: rl.e$a$a */
        static final class C17642a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C17642a f49364d = new C17642a();

            C17642a() {
                super(1);
            }

            /* renamed from: a */
            public final void mo45226a(C26191f fVar) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo45226a((C26191f) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: rl.e$a$b */
        static final class C17643b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C17643b f49365d = new C17643b();

            C17643b() {
                super(1);
            }

            public final void invoke(Throwable th) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17641a(C17640e eVar) {
            super(1);
            this.f49363d = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m61298d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m61299e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final void mo45225c(List list) {
            Object obj;
            C41536l.m120488h(list, "list");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((ProductType) obj).getProduct(), C27685a.BNPL.mo67221b())) {
                    break;
                }
            }
            if (((ProductType) obj) != null) {
                this.f49363d.f49361a.mo45052a(true).mo94983G0(new C17638c(C17642a.f49364d), new C17639d(C17643b.f49365d));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45225c((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: rl.e$b */
    static final class C17644b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C17644b f49366d = new C17644b();

        C17644b() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    public C17640e(C17535h hVar, C19799c cVar) {
        C41536l.m120489i(hVar, "getBnpl");
        C41536l.m120489i(cVar, "getProductTypeListUseCase");
        this.f49361a = hVar;
        this.f49362b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m61294d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m61295e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public void invoke() {
        C19799c.m65565e(this.f49362b, false, 1, (Object) null).mo94983G0(new C17636a(new C17641a(this)), new C17637b(C17644b.f49366d));
    }
}
