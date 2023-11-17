package o31;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import ue1.C43075l;

/* renamed from: o31.c */
public final class C37591c {

    /* renamed from: a */
    public static final C37591c f90334a = new C37591c();

    /* renamed from: o31.c$a */
    static final class C37592a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C37592a f90335d = new C37592a();

        C37592a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo90783a(Object obj) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90783a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o31.c$b */
    public static final class C37593b extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C1644x f90336a;

        /* renamed from: b */
        final /* synthetic */ C43075l f90337b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37593b(Object obj, C1644x xVar, C43075l lVar) {
            super(obj);
            this.f90336a = xVar;
            this.f90337b = lVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            this.f90336a.mo4823o(obj2);
            this.f90337b.invoke(obj2);
        }
    }

    private C37591c() {
    }

    /* renamed from: b */
    public static /* synthetic */ C41555e m110557b(C37591c cVar, Object obj, C1644x xVar, C43075l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = C37592a.f90335d;
        }
        return cVar.mo90782a(obj, xVar, lVar);
    }

    /* renamed from: a */
    public final C41555e mo90782a(Object obj, C1644x xVar, C43075l lVar) {
        C41536l.m120489i(xVar, "liveData");
        C41536l.m120489i(lVar, "doAfterChange");
        return new C37593b(obj, xVar, lVar);
    }
}
