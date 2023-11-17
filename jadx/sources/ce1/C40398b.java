package ce1;

import ed1.C40734b;
import ed1.C40762x;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ce1.b */
public abstract class C40398b {

    /* renamed from: a */
    private static final C43075l f95980a = C40401c.f95985d;

    /* renamed from: b */
    private static final C43075l f95981b = C40400b.f95984d;

    /* renamed from: c */
    private static final C43064a f95982c = C40399a.f95983d;

    /* renamed from: ce1.b$a */
    static final class C40399a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C40399a f95983d = new C40399a();

        C40399a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: ce1.b$b */
    static final class C40400b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C40400b f95984d = new C40400b();

        C40400b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120490j(th, "it");
        }
    }

    /* renamed from: ce1.b$c */
    static final class C40401c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C40401c f95985d = new C40401c();

        C40401c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo94456a(Object obj) {
            C41536l.m120490j(obj, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94456a(obj);
            return C41238w.f97225a;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ce1.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final jd1.C41399f m116968a(ue1.C43075l r1) {
        /*
            ue1.l r0 = f95980a
            if (r1 != r0) goto L_0x000e
            jd1.f r1 = ld1.C41669a.m120908d()
            java.lang.String r0 = "Functions.emptyConsumer()"
            kotlin.jvm.internal.C41536l.m120485e(r1, r0)
            goto L_0x0018
        L_0x000e:
            if (r1 == 0) goto L_0x0016
            ce1.d r0 = new ce1.d
            r0.<init>(r1)
            r1 = r0
        L_0x0016:
            jd1.f r1 = (jd1.C41399f) r1
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C40398b.m116968a(ue1.l):jd1.f");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ce1.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final jd1.C41394a m116969b(ue1.C43064a r1) {
        /*
            ue1.a r0 = f95982c
            if (r1 != r0) goto L_0x000c
            jd1.a r1 = ld1.C41669a.f97937c
            java.lang.String r0 = "Functions.EMPTY_ACTION"
            kotlin.jvm.internal.C41536l.m120485e(r1, r0)
            goto L_0x0016
        L_0x000c:
            if (r1 == 0) goto L_0x0014
            ce1.c r0 = new ce1.c
            r0.<init>(r1)
            r1 = r0
        L_0x0014:
            jd1.a r1 = (jd1.C41394a) r1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C40398b.m116969b(ue1.a):jd1.a");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ce1.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final jd1.C41399f m116970c(ue1.C43075l r1) {
        /*
            ue1.l r0 = f95981b
            if (r1 != r0) goto L_0x000c
            jd1.f r1 = ld1.C41669a.f97940f
            java.lang.String r0 = "Functions.ON_ERROR_MISSING"
            kotlin.jvm.internal.C41536l.m120485e(r1, r0)
            goto L_0x0016
        L_0x000c:
            if (r1 == 0) goto L_0x0014
            ce1.d r0 = new ce1.d
            r0.<init>(r1)
            r1 = r0
        L_0x0014:
            jd1.f r1 = (jd1.C41399f) r1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C40398b.m116970c(ue1.l):jd1.f");
    }

    /* renamed from: d */
    public static final C41205b m116971d(C40734b bVar, C43075l lVar, C43064a aVar) {
        C41536l.m120490j(bVar, "$this$subscribeBy");
        C41536l.m120490j(lVar, "onError");
        C41536l.m120490j(aVar, "onComplete");
        C43075l lVar2 = f95981b;
        if (lVar == lVar2 && aVar == f95982c) {
            C41205b E = bVar.mo94886E();
            C41536l.m120485e(E, "subscribe()");
            return E;
        } else if (lVar == lVar2) {
            C41205b F = bVar.mo94887F(new C40402c(aVar));
            C41536l.m120485e(F, "subscribe(onComplete)");
            return F;
        } else {
            C41205b G = bVar.mo94888G(m116969b(aVar), new C40403d(lVar));
            C41536l.m120485e(G, "subscribe(onComplete.asO…ion(), Consumer(onError))");
            return G;
        }
    }

    /* renamed from: e */
    public static final C41205b m116972e(C40762x xVar, C43075l lVar, C43075l lVar2) {
        C41536l.m120490j(xVar, "$this$subscribeBy");
        C41536l.m120490j(lVar, "onError");
        C41536l.m120490j(lVar2, "onSuccess");
        C41205b I = xVar.mo95070I(m116968a(lVar2), m116970c(lVar));
        C41536l.m120485e(I, "subscribe(onSuccess.asCo…rror.asOnErrorConsumer())");
        return I;
    }
}
