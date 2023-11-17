package ed1;

import ae1.C40293a;
import de1.C40640a;
import hd1.C41205b;
import id1.C41300a;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jd1.C41394a;
import jd1.C41396c;
import jd1.C41399f;
import jd1.C41400g;
import jd1.C41401h;
import jd1.C41402i;
import jd1.C41403j;
import jd1.C41405l;
import jd1.C41407n;
import ld1.C41669a;
import ld1.C41692b;
import md1.C41738g;
import nd1.C41779f;
import nd1.C41786m;
import pd1.C42166k;
import pd1.C42181r;
import rd1.C42360b;
import sd1.C42400a0;
import sd1.C42402a1;
import sd1.C42406b0;
import sd1.C42408b1;
import sd1.C42410c;
import sd1.C42411c0;
import sd1.C42412c1;
import sd1.C42414d;
import sd1.C42417d0;
import sd1.C42419d1;
import sd1.C42421e;
import sd1.C42428f;
import sd1.C42433f0;
import sd1.C42435f1;
import sd1.C42437g;
import sd1.C42439g0;
import sd1.C42441g1;
import sd1.C42444h;
import sd1.C42447h0;
import sd1.C42448h1;
import sd1.C42451i;
import sd1.C42452i0;
import sd1.C42454i1;
import sd1.C42458j;
import sd1.C42463j0;
import sd1.C42464j1;
import sd1.C42467k;
import sd1.C42469k0;
import sd1.C42471l;
import sd1.C42473l0;
import sd1.C42475m;
import sd1.C42477m0;
import sd1.C42479n;
import sd1.C42480n0;
import sd1.C42484o0;
import sd1.C42488p;
import sd1.C42493q;
import sd1.C42496r;
import sd1.C42497r0;
import sd1.C42500s;
import sd1.C42504t;
import sd1.C42506t0;
import sd1.C42518u;
import sd1.C42521u0;
import sd1.C42528v0;
import sd1.C42531w;
import sd1.C42534w0;
import sd1.C42536x;
import sd1.C42539x0;
import sd1.C42541y;
import sd1.C42543y0;
import sd1.C42546z;
import sd1.C42547z0;
import uh1.C43106a;
import yd1.C43363h;
import zd1.C43413a;

/* renamed from: ed1.p */
public abstract class C40749p<T> implements C40754t {

    /* renamed from: ed1.p$a */
    static /* synthetic */ class C40750a {

        /* renamed from: a */
        static final /* synthetic */ int[] f96446a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                ed1.a[] r0 = ed1.C40732a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f96446a = r0
                ed1.a r1 = ed1.C40732a.DROP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f96446a     // Catch:{ NoSuchFieldError -> 0x001d }
                ed1.a r1 = ed1.C40732a.LATEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f96446a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ed1.a r1 = ed1.C40732a.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f96446a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ed1.a r1 = ed1.C40732a.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ed1.C40749p.C40750a.<clinit>():void");
        }
    }

    /* renamed from: B */
    private C40749p m118026B(C41399f fVar, C41399f fVar2, C41394a aVar, C41394a aVar2) {
        C41692b.m120934e(fVar, "onNext is null");
        C41692b.m120934e(fVar2, "onError is null");
        C41692b.m120934e(aVar, "onComplete is null");
        C41692b.m120934e(aVar2, "onAfterTerminate is null");
        return C40293a.m116717n(new C42475m(this, fVar, fVar2, aVar, aVar2));
    }

    /* renamed from: J */
    public static C40749p m118027J() {
        return C40293a.m116717n(C42496r.f100004d);
    }

    /* renamed from: K */
    public static C40749p m118028K(Throwable th) {
        C41692b.m120934e(th, "exception is null");
        return m118029L(C41669a.m120911g(th));
    }

    /* renamed from: L */
    public static C40749p m118029L(Callable callable) {
        C41692b.m120934e(callable, "errorSupplier is null");
        return C40293a.m116717n(new C42500s(callable));
    }

    /* renamed from: Y */
    public static C40749p m118030Y(Object... objArr) {
        C41692b.m120934e(objArr, "items is null");
        if (objArr.length == 0) {
            return m118027J();
        }
        if (objArr.length == 1) {
            return m118043h0(objArr[0]);
        }
        return C40293a.m116717n(new C42541y(objArr));
    }

    /* renamed from: Z */
    public static C40749p m118031Z(Callable callable) {
        C41692b.m120934e(callable, "supplier is null");
        return C40293a.m116717n(new C42546z(callable));
    }

    /* renamed from: a0 */
    public static C40749p m118032a0(Iterable iterable) {
        C41692b.m120934e(iterable, "source is null");
        return C40293a.m116717n(new C42400a0(iterable));
    }

    /* renamed from: a1 */
    public static C40749p m118033a1(C40754t tVar) {
        C41692b.m120934e(tVar, "source is null");
        if (tVar instanceof C40749p) {
            return C40293a.m116717n((C40749p) tVar);
        }
        return C40293a.m116717n(new C42411c0(tVar));
    }

    /* renamed from: b0 */
    public static C40749p m118034b0(C43106a aVar) {
        C41692b.m120934e(aVar, "publisher is null");
        return C40293a.m116717n(new C42406b0(aVar));
    }

    /* renamed from: b1 */
    public static C40749p m118035b1(C40754t tVar, C40754t tVar2, C40754t tVar3, C40754t tVar4, C41401h hVar) {
        C41692b.m120934e(tVar, "source1 is null");
        C41692b.m120934e(tVar2, "source2 is null");
        C41692b.m120934e(tVar3, "source3 is null");
        C41692b.m120934e(tVar4, "source4 is null");
        return m118039e1(C41669a.m120915k(hVar), false, m118040f(), tVar, tVar2, tVar3, tVar4);
    }

    /* renamed from: c1 */
    public static C40749p m118036c1(C40754t tVar, C40754t tVar2, C40754t tVar3, C41400g gVar) {
        C41692b.m120934e(tVar, "source1 is null");
        C41692b.m120934e(tVar2, "source2 is null");
        C41692b.m120934e(tVar3, "source3 is null");
        return m118039e1(C41669a.m120914j(gVar), false, m118040f(), tVar, tVar2, tVar3);
    }

    /* renamed from: d1 */
    public static C40749p m118037d1(C40754t tVar, C40754t tVar2, C41396c cVar) {
        C41692b.m120934e(tVar, "source1 is null");
        C41692b.m120934e(tVar2, "source2 is null");
        return m118039e1(C41669a.m120913i(cVar), false, m118040f(), tVar, tVar2);
    }

    /* renamed from: e0 */
    public static C40749p m118038e0(long j, long j2, TimeUnit timeUnit) {
        return m118041f0(j, j2, timeUnit, C40640a.m117457a());
    }

    /* renamed from: e1 */
    public static C40749p m118039e1(C41405l lVar, boolean z, int i, C40754t... tVarArr) {
        if (tVarArr.length == 0) {
            return m118027J();
        }
        C41692b.m120934e(lVar, "zipper is null");
        C41692b.m120935f(i, "bufferSize");
        return C40293a.m116717n(new C42464j1(tVarArr, (Iterable) null, lVar, i, z));
    }

    /* renamed from: f */
    public static int m118040f() {
        return C40741h.m117960c();
    }

    /* renamed from: f0 */
    public static C40749p m118041f0(long j, long j2, TimeUnit timeUnit, C40757w wVar) {
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116717n(new C42439g0(Math.max(0, j), Math.max(0, j2), timeUnit, wVar));
    }

    /* renamed from: g0 */
    public static C40749p m118042g0(long j, TimeUnit timeUnit) {
        return m118041f0(j, j, timeUnit, C40640a.m117457a());
    }

    /* renamed from: h0 */
    public static C40749p m118043h0(Object obj) {
        C41692b.m120934e(obj, "item is null");
        return C40293a.m116717n(new C42447h0(obj));
    }

    /* renamed from: j */
    public static C40749p m118044j(C40754t tVar, C40754t tVar2, C40754t tVar3, C40754t tVar4, C40754t tVar5, C40754t tVar6, C41403j jVar) {
        C41692b.m120934e(tVar, "source1 is null");
        C41692b.m120934e(tVar2, "source2 is null");
        C41692b.m120934e(tVar3, "source3 is null");
        C41692b.m120934e(tVar4, "source4 is null");
        C41692b.m120934e(tVar5, "source5 is null");
        C41692b.m120934e(tVar6, "source6 is null");
        return m118050n(C41669a.m120917m(jVar), m118040f(), tVar, tVar2, tVar3, tVar4, tVar5, tVar6);
    }

    /* renamed from: k */
    public static C40749p m118045k(C40754t tVar, C40754t tVar2, C40754t tVar3, C40754t tVar4, C40754t tVar5, C41402i iVar) {
        C41692b.m120934e(tVar, "source1 is null");
        C41692b.m120934e(tVar2, "source2 is null");
        C41692b.m120934e(tVar3, "source3 is null");
        C41692b.m120934e(tVar4, "source4 is null");
        C41692b.m120934e(tVar5, "source5 is null");
        return m118050n(C41669a.m120916l(iVar), m118040f(), tVar, tVar2, tVar3, tVar4, tVar5);
    }

    /* renamed from: l */
    public static C40749p m118046l(C40754t tVar, C40754t tVar2, C40754t tVar3, C41400g gVar) {
        C41692b.m120934e(tVar, "source1 is null");
        C41692b.m120934e(tVar2, "source2 is null");
        C41692b.m120934e(tVar3, "source3 is null");
        return m118050n(C41669a.m120914j(gVar), m118040f(), tVar, tVar2, tVar3);
    }

    /* renamed from: l0 */
    public static C40749p m118047l0(C40754t tVar, C40754t tVar2) {
        C41692b.m120934e(tVar, "source1 is null");
        C41692b.m120934e(tVar2, "source2 is null");
        return m118030Y(tVar, tVar2).mo95002S(C41669a.m120909e(), false, 2);
    }

    /* renamed from: m */
    public static C40749p m118048m(C40754t tVar, C40754t tVar2, C41396c cVar) {
        C41692b.m120934e(tVar, "source1 is null");
        C41692b.m120934e(tVar2, "source2 is null");
        return m118050n(C41669a.m120913i(cVar), m118040f(), tVar, tVar2);
    }

    /* renamed from: m0 */
    public static C40749p m118049m0(C40754t tVar, C40754t tVar2, C40754t tVar3) {
        C41692b.m120934e(tVar, "source1 is null");
        C41692b.m120934e(tVar2, "source2 is null");
        C41692b.m120934e(tVar3, "source3 is null");
        return m118030Y(tVar, tVar2, tVar3).mo95002S(C41669a.m120909e(), false, 3);
    }

    /* renamed from: n */
    public static C40749p m118050n(C41405l lVar, int i, C40754t... tVarArr) {
        return m118052o(tVarArr, lVar, i);
    }

    /* renamed from: n0 */
    public static C40749p m118051n0(C40754t tVar, C40754t tVar2, C40754t tVar3, C40754t tVar4) {
        C41692b.m120934e(tVar, "source1 is null");
        C41692b.m120934e(tVar2, "source2 is null");
        C41692b.m120934e(tVar3, "source3 is null");
        C41692b.m120934e(tVar4, "source4 is null");
        return m118030Y(tVar, tVar2, tVar3, tVar4).mo95002S(C41669a.m120909e(), false, 4);
    }

    /* renamed from: o */
    public static C40749p m118052o(C40754t[] tVarArr, C41405l lVar, int i) {
        C41692b.m120934e(tVarArr, "sources is null");
        if (tVarArr.length == 0) {
            return m118027J();
        }
        C41692b.m120934e(lVar, "combiner is null");
        C41692b.m120935f(i, "bufferSize");
        return C40293a.m116717n(new C42421e(tVarArr, (Iterable) null, lVar, i << 1, false));
    }

    /* renamed from: q */
    public static C40749p m118053q(C40754t... tVarArr) {
        if (tVarArr.length == 0) {
            return m118027J();
        }
        if (tVarArr.length == 1) {
            return m118033a1(tVarArr[0]);
        }
        return C40293a.m116717n(new C42428f(m118030Y(tVarArr), C41669a.m120909e(), m118040f(), C43363h.BOUNDARY));
    }

    /* renamed from: r */
    public static C40749p m118054r(C40752r rVar) {
        C41692b.m120934e(rVar, "source is null");
        return C40293a.m116717n(new C42437g(rVar));
    }

    /* renamed from: v */
    public static C40749p m118055v(Callable callable) {
        C41692b.m120934e(callable, "supplier is null");
        return C40293a.m116717n(new C42451i(callable));
    }

    /* renamed from: A */
    public final C40749p mo94971A(C41394a aVar) {
        C41692b.m120934e(aVar, "onFinally is null");
        return C40293a.m116717n(new C42471l(this, aVar));
    }

    /* renamed from: A0 */
    public final C40749p mo94972A0() {
        return mo95040w0().mo102095l1();
    }

    /* renamed from: B0 */
    public final C40744k mo94973B0() {
        return C40293a.m116716m(new C42534w0(this));
    }

    /* renamed from: C */
    public final C40749p mo94974C(C41399f fVar) {
        C41399f d = C41669a.m120908d();
        C41394a aVar = C41669a.f97937c;
        return m118026B(d, fVar, aVar, aVar);
    }

    /* renamed from: C0 */
    public final C40762x mo94975C0() {
        return C40293a.m116718o(new C42539x0(this, (Object) null));
    }

    /* renamed from: D */
    public final C40749p mo94976D(C41399f fVar, C41394a aVar) {
        C41692b.m120934e(fVar, "onSubscribe is null");
        C41692b.m120934e(aVar, "onDispose is null");
        return C40293a.m116717n(new C42479n(this, fVar, aVar));
    }

    /* renamed from: D0 */
    public final C40749p mo94977D0(Object obj) {
        C41692b.m120934e(obj, "item is null");
        return m118053q(m118043h0(obj), this);
    }

    /* renamed from: E */
    public final C40749p mo94978E(C41399f fVar) {
        C41399f d = C41669a.m120908d();
        C41394a aVar = C41669a.f97937c;
        return m118026B(fVar, d, aVar, aVar);
    }

    /* renamed from: E0 */
    public final C41205b mo94979E0() {
        return mo94985H0(C41669a.m120908d(), C41669a.f97940f, C41669a.f97937c, C41669a.m120908d());
    }

    /* renamed from: F */
    public final C40749p mo94980F(C41399f fVar) {
        return mo94976D(fVar, C41669a.f97937c);
    }

    /* renamed from: F0 */
    public final C41205b mo94981F0(C41399f fVar) {
        return mo94985H0(fVar, C41669a.f97940f, C41669a.f97937c, C41669a.m120908d());
    }

    /* renamed from: G */
    public final C40744k mo94982G(long j) {
        if (j >= 0) {
            return C40293a.m116716m(new C42488p(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    /* renamed from: G0 */
    public final C41205b mo94983G0(C41399f fVar, C41399f fVar2) {
        return mo94985H0(fVar, fVar2, C41669a.f97937c, C41669a.m120908d());
    }

    /* renamed from: H */
    public final C40762x mo94984H(long j, Object obj) {
        if (j >= 0) {
            C41692b.m120934e(obj, "defaultItem is null");
            return C40293a.m116718o(new C42493q(this, j, obj));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    /* renamed from: H0 */
    public final C41205b mo94985H0(C41399f fVar, C41399f fVar2, C41394a aVar, C41399f fVar3) {
        C41692b.m120934e(fVar, "onNext is null");
        C41692b.m120934e(fVar2, "onError is null");
        C41692b.m120934e(aVar, "onComplete is null");
        C41692b.m120934e(fVar3, "onSubscribe is null");
        C41786m mVar = new C41786m(fVar, fVar2, aVar, fVar3);
        mo95016c(mVar);
        return mVar;
    }

    /* renamed from: I */
    public final C40762x mo94986I(long j) {
        if (j >= 0) {
            return C40293a.m116718o(new C42493q(this, j, (Object) null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public abstract void mo94344I0(C40756v vVar);

    /* renamed from: J0 */
    public final C40749p mo94987J0(C40757w wVar) {
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116717n(new C42543y0(this, wVar));
    }

    /* renamed from: K0 */
    public final C40749p mo94988K0(C40754t tVar) {
        C41692b.m120934e(tVar, "other is null");
        return C40293a.m116717n(new C42547z0(this, tVar));
    }

    /* renamed from: L0 */
    public final C40749p mo94989L0(C41405l lVar) {
        return mo94991M0(lVar, m118040f());
    }

    /* renamed from: M */
    public final C40749p mo94990M(C41407n nVar) {
        C41692b.m120934e(nVar, "predicate is null");
        return C40293a.m116717n(new C42504t(this, nVar));
    }

    /* renamed from: M0 */
    public final C40749p mo94991M0(C41405l lVar, int i) {
        C41692b.m120934e(lVar, "mapper is null");
        C41692b.m120935f(i, "bufferSize");
        if (!(this instanceof C41738g)) {
            return C40293a.m116717n(new C42402a1(this, lVar, i, false));
        }
        Object call = ((C41738g) this).call();
        if (call == null) {
            return m118027J();
        }
        return C42528v0.m123157a(call, lVar);
    }

    /* renamed from: N */
    public final C40762x mo94992N(Object obj) {
        return mo94984H(0, obj);
    }

    /* renamed from: N0 */
    public final C40734b mo94993N0(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116714k(new C42360b(this, lVar, false));
    }

    /* renamed from: O */
    public final C40744k mo94994O() {
        return mo94982G(0);
    }

    /* renamed from: O0 */
    public final C40749p mo94995O0(long j) {
        if (j >= 0) {
            return C40293a.m116717n(new C42408b1(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    /* renamed from: P */
    public final C40762x mo94996P() {
        return mo94986I(0);
    }

    /* renamed from: P0 */
    public final C40749p mo94997P0(C41407n nVar) {
        C41692b.m120934e(nVar, "stopPredicate is null");
        return C40293a.m116717n(new C42412c1(this, nVar));
    }

    /* renamed from: Q */
    public final C40749p mo94998Q(C41405l lVar) {
        return mo95000R(lVar, false);
    }

    /* renamed from: Q0 */
    public final C40749p mo94999Q0(long j, TimeUnit timeUnit) {
        return mo95001R0(j, timeUnit, C40640a.m117457a());
    }

    /* renamed from: R */
    public final C40749p mo95000R(C41405l lVar, boolean z) {
        return mo95002S(lVar, z, Integer.MAX_VALUE);
    }

    /* renamed from: R0 */
    public final C40749p mo95001R0(long j, TimeUnit timeUnit, C40757w wVar) {
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116717n(new C42419d1(this, j, timeUnit, wVar));
    }

    /* renamed from: S */
    public final C40749p mo95002S(C41405l lVar, boolean z, int i) {
        return mo95004T(lVar, z, i, m118040f());
    }

    /* renamed from: S0 */
    public final C40749p mo95003S0(long j, TimeUnit timeUnit) {
        return mo95044y0(j, timeUnit);
    }

    /* renamed from: T */
    public final C40749p mo95004T(C41405l lVar, boolean z, int i, int i2) {
        C41692b.m120934e(lVar, "mapper is null");
        C41692b.m120935f(i, "maxConcurrency");
        C41692b.m120935f(i2, "bufferSize");
        if (!(this instanceof C41738g)) {
            return C40293a.m116717n(new C42518u(this, lVar, z, i, i2));
        }
        Object call = ((C41738g) this).call();
        if (call == null) {
            return m118027J();
        }
        return C42528v0.m123157a(call, lVar);
    }

    /* renamed from: T0 */
    public final C40741h mo95005T0(C40732a aVar) {
        C42166k kVar = new C42166k(this);
        int i = C40750a.f96446a[aVar.ordinal()];
        if (i == 1) {
            return kVar.mo94918A();
        }
        if (i == 2) {
            return kVar.mo94919B();
        }
        if (i == 3) {
            return kVar;
        }
        if (i != 4) {
            return kVar.mo94942y();
        }
        return C40293a.m116715l(new C42181r(kVar));
    }

    /* renamed from: U */
    public final C40734b mo95006U(C41405l lVar) {
        return mo95008V(lVar, false);
    }

    /* renamed from: U0 */
    public final C40762x mo95007U0() {
        return mo95009V0(16);
    }

    /* renamed from: V */
    public final C40734b mo95008V(C41405l lVar, boolean z) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116714k(new C42531w(this, lVar, z));
    }

    /* renamed from: V0 */
    public final C40762x mo95009V0(int i) {
        C41692b.m120935f(i, "capacityHint");
        return C40293a.m116718o(new C42435f1(this, i));
    }

    /* renamed from: W */
    public final C40749p mo95010W(C41405l lVar) {
        return mo95012X(lVar, false);
    }

    /* renamed from: W0 */
    public final C40749p mo95011W0(C40757w wVar) {
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116717n(new C42441g1(this, wVar));
    }

    /* renamed from: X */
    public final C40749p mo95012X(C41405l lVar, boolean z) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116717n(new C42536x(this, lVar, z));
    }

    /* renamed from: X0 */
    public final C40749p mo95013X0(C40754t tVar, C40754t tVar2, C41400g gVar) {
        C41692b.m120934e(tVar, "o1 is null");
        C41692b.m120934e(tVar2, "o2 is null");
        C41692b.m120934e(gVar, "combiner is null");
        return mo95015Z0(new C40754t[]{tVar, tVar2}, C41669a.m120914j(gVar));
    }

    /* renamed from: Y0 */
    public final C40749p mo95014Y0(C40754t tVar, C41396c cVar) {
        C41692b.m120934e(tVar, "other is null");
        C41692b.m120934e(cVar, "combiner is null");
        return C40293a.m116717n(new C42448h1(this, cVar, tVar));
    }

    /* renamed from: Z0 */
    public final C40749p mo95015Z0(C40754t[] tVarArr, C41405l lVar) {
        C41692b.m120934e(tVarArr, "others is null");
        C41692b.m120934e(lVar, "combiner is null");
        return C40293a.m116717n(new C42454i1(this, tVarArr, lVar));
    }

    /* renamed from: c */
    public final void mo95016c(C40756v vVar) {
        C41692b.m120934e(vVar, "observer is null");
        try {
            C40756v x = C40293a.m116727x(this, vVar);
            C41692b.m120934e(x, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo94344I0(x);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C40293a.m116722s(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c0 */
    public final C40749p mo95017c0() {
        return C40293a.m116717n(new C42417d0(this));
    }

    /* renamed from: d */
    public final Object mo95018d() {
        C41779f fVar = new C41779f();
        mo95016c(fVar);
        Object a = fVar.mo96601a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d0 */
    public final C40734b mo95019d0() {
        return C40293a.m116714k(new C42433f0(this));
    }

    /* renamed from: e */
    public final void mo95020e() {
        C42410c.m122984a(this);
    }

    /* renamed from: g */
    public final C40749p mo95021g() {
        return mo95022h(16);
    }

    /* renamed from: h */
    public final C40749p mo95022h(int i) {
        C41692b.m120935f(i, "initialCapacity");
        return C40293a.m116717n(new C42414d(this, i));
    }

    /* renamed from: i */
    public final C40749p mo95023i(Class cls) {
        C41692b.m120934e(cls, "clazz is null");
        return mo95026k0(C41669a.m120906b(cls));
    }

    /* renamed from: i0 */
    public final C40762x mo95024i0(Object obj) {
        C41692b.m120934e(obj, "defaultItem is null");
        return C40293a.m116718o(new C42452i0(this, obj));
    }

    /* renamed from: j0 */
    public final C40749p mo95025j0(C40753s sVar) {
        C41692b.m120934e(sVar, "lifter is null");
        return C40293a.m116717n(new C42463j0(this, sVar));
    }

    /* renamed from: k0 */
    public final C40749p mo95026k0(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116717n(new C42469k0(this, lVar));
    }

    /* renamed from: o0 */
    public final C40749p mo95027o0(C40757w wVar) {
        return mo95029p0(wVar, false, m118040f());
    }

    /* renamed from: p */
    public final C40749p mo95028p(C40755u uVar) {
        return m118033a1(((C40755u) C41692b.m120934e(uVar, "composer is null")).mo88924a(this));
    }

    /* renamed from: p0 */
    public final C40749p mo95029p0(C40757w wVar, boolean z, int i) {
        C41692b.m120934e(wVar, "scheduler is null");
        C41692b.m120935f(i, "bufferSize");
        return C40293a.m116717n(new C42473l0(this, wVar, z, i));
    }

    /* renamed from: q0 */
    public final C40749p mo95030q0(Class cls) {
        C41692b.m120934e(cls, "clazz is null");
        return mo94990M(C41669a.m120910f(cls)).mo95023i(cls);
    }

    /* renamed from: r0 */
    public final C40749p mo95031r0(C40754t tVar) {
        C41692b.m120934e(tVar, "next is null");
        return mo95033s0(C41669a.m120912h(tVar));
    }

    /* renamed from: s */
    public final C40749p mo95032s(long j, TimeUnit timeUnit) {
        return mo95034t(j, timeUnit, C40640a.m117457a());
    }

    /* renamed from: s0 */
    public final C40749p mo95033s0(C41405l lVar) {
        C41692b.m120934e(lVar, "resumeFunction is null");
        return C40293a.m116717n(new C42477m0(this, lVar, false));
    }

    /* renamed from: t */
    public final C40749p mo95034t(long j, TimeUnit timeUnit, C40757w wVar) {
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116717n(new C42444h(this, j, timeUnit, wVar));
    }

    /* renamed from: t0 */
    public final C40749p mo95035t0(C41405l lVar) {
        C41692b.m120934e(lVar, "valueSupplier is null");
        return C40293a.m116717n(new C42480n0(this, lVar));
    }

    /* renamed from: u */
    public final C40749p mo95036u(Object obj) {
        C41692b.m120934e(obj, "defaultItem is null");
        return mo94988K0(m118043h0(obj));
    }

    /* renamed from: u0 */
    public final C40749p mo95037u0(Object obj) {
        C41692b.m120934e(obj, "item is null");
        return mo95035t0(C41669a.m120912h(obj));
    }

    /* renamed from: v0 */
    public final C40749p mo95038v0(C41405l lVar) {
        C41692b.m120934e(lVar, "selector is null");
        return C40293a.m116717n(new C42497r0(this, lVar));
    }

    /* renamed from: w */
    public final C40749p mo95039w(long j, TimeUnit timeUnit) {
        return mo95041x(j, timeUnit, C40640a.m117457a(), false);
    }

    /* renamed from: w0 */
    public final C43413a mo95040w0() {
        return C42484o0.m123069o1(this);
    }

    /* renamed from: x */
    public final C40749p mo95041x(long j, TimeUnit timeUnit, C40757w wVar, boolean z) {
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116717n(new C42458j(this, j, timeUnit, wVar, z));
    }

    /* renamed from: x0 */
    public final C43413a mo95042x0(int i) {
        C41692b.m120935f(i, "bufferSize");
        return C42506t0.m123100o1(this, i);
    }

    /* renamed from: y */
    public final C40749p mo95043y() {
        return mo95045z(C41669a.m120909e());
    }

    /* renamed from: y0 */
    public final C40749p mo95044y0(long j, TimeUnit timeUnit) {
        return mo95046z0(j, timeUnit, C40640a.m117457a());
    }

    /* renamed from: z */
    public final C40749p mo95045z(C41405l lVar) {
        C41692b.m120934e(lVar, "keySelector is null");
        return C40293a.m116717n(new C42467k(this, lVar, C41692b.m120933d()));
    }

    /* renamed from: z0 */
    public final C40749p mo95046z0(long j, TimeUnit timeUnit, C40757w wVar) {
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116717n(new C42521u0(this, j, timeUnit, wVar, false));
    }
}
