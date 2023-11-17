package ed1;

import ae1.C40293a;
import de1.C40640a;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jd1.C41394a;
import jd1.C41397d;
import jd1.C41399f;
import jd1.C41405l;
import jd1.C41406m;
import jd1.C41407n;
import ld1.C41669a;
import ld1.C41692b;
import pd1.C42145b;
import pd1.C42148c;
import pd1.C42149d;
import pd1.C42152e;
import pd1.C42155f;
import pd1.C42157g;
import pd1.C42159h;
import pd1.C42160i;
import pd1.C42163j;
import pd1.C42168l;
import pd1.C42169m;
import pd1.C42170n;
import pd1.C42173o;
import pd1.C42177p;
import pd1.C42179q;
import pd1.C42183s;
import pd1.C42185t;
import pd1.C42188u;
import uh1.C43106a;
import uh1.C43107b;
import wd1.C43189c;
import wd1.C43190d;

/* renamed from: ed1.h */
public abstract class C40741h<T> implements C43106a {

    /* renamed from: d */
    static final int f96445d = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: J */
    public static C40741h m117959J(long j, TimeUnit timeUnit, C40757w wVar) {
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116715l(new C42188u(Math.max(0, j), timeUnit, wVar));
    }

    /* renamed from: c */
    public static int m117960c() {
        return f96445d;
    }

    /* renamed from: i */
    public static C40741h m117961i(Callable callable) {
        C41692b.m120934e(callable, "supplier is null");
        return C40293a.m116715l(new C42148c(callable));
    }

    /* renamed from: k */
    private C40741h m117962k(C41399f fVar, C41399f fVar2, C41394a aVar, C41394a aVar2) {
        C41692b.m120934e(fVar, "onNext is null");
        C41692b.m120934e(fVar2, "onError is null");
        C41692b.m120934e(aVar, "onComplete is null");
        C41692b.m120934e(aVar2, "onAfterTerminate is null");
        return C40293a.m116715l(new C42152e(this, fVar, fVar2, aVar, aVar2));
    }

    /* renamed from: p */
    public static C40741h m117963p() {
        return C40293a.m116715l(C42159h.f99166e);
    }

    /* renamed from: u */
    public static C40741h m117964u(C43106a aVar) {
        if (aVar instanceof C40741h) {
            return C40293a.m116715l((C40741h) aVar);
        }
        C41692b.m120934e(aVar, "source is null");
        return C40293a.m116715l(new C42168l(aVar));
    }

    /* renamed from: A */
    public final C40741h mo94918A() {
        return C40293a.m116715l(new C42179q(this));
    }

    /* renamed from: B */
    public final C40741h mo94919B() {
        return C40293a.m116715l(new C42183s(this));
    }

    /* renamed from: C */
    public final C41205b mo94920C(C41399f fVar) {
        return mo94921D(fVar, C41669a.f97940f, C41669a.f97937c, C42169m.INSTANCE);
    }

    /* renamed from: D */
    public final C41205b mo94921D(C41399f fVar, C41399f fVar2, C41394a aVar, C41399f fVar3) {
        C41692b.m120934e(fVar, "onNext is null");
        C41692b.m120934e(fVar2, "onError is null");
        C41692b.m120934e(aVar, "onComplete is null");
        C41692b.m120934e(fVar3, "onSubscribe is null");
        C43189c cVar = new C43189c(fVar, fVar2, aVar, fVar3);
        mo94922E(cVar);
        return cVar;
    }

    /* renamed from: E */
    public final void mo94922E(C40742i iVar) {
        C41692b.m120934e(iVar, "s is null");
        try {
            C43107b z = C40293a.m116729z(this, iVar);
            C41692b.m120934e(z, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo94348F(z);
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

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract void mo94348F(C43107b bVar);

    /* renamed from: G */
    public final C40741h mo94923G(C40757w wVar) {
        C41692b.m120934e(wVar, "scheduler is null");
        return mo94924H(wVar, true);
    }

    /* renamed from: H */
    public final C40741h mo94924H(C40757w wVar, boolean z) {
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116715l(new C42185t(this, wVar, z));
    }

    /* renamed from: I */
    public final C40741h mo94925I(long j, TimeUnit timeUnit, C40757w wVar) {
        return mo94929h(j, timeUnit, wVar);
    }

    /* renamed from: a */
    public final void mo26347a(C43107b bVar) {
        if (bVar instanceof C40742i) {
            mo94922E((C40742i) bVar);
            return;
        }
        C41692b.m120934e(bVar, "s is null");
        mo94922E(new C43190d(bVar));
    }

    /* renamed from: e */
    public final C40741h mo94926e(Class cls) {
        C41692b.m120934e(cls, "clazz is null");
        return mo94939v(C41669a.m120906b(cls));
    }

    /* renamed from: f */
    public final C40741h mo94927f(C40743j jVar) {
        return m117964u(((C40743j) C41692b.m120934e(jVar, "composer is null")).mo27076a(this));
    }

    /* renamed from: g */
    public final C40741h mo94928g(long j, TimeUnit timeUnit) {
        return mo94929h(j, timeUnit, C40640a.m117457a());
    }

    /* renamed from: h */
    public final C40741h mo94929h(long j, TimeUnit timeUnit, C40757w wVar) {
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116715l(new C42145b(this, j, timeUnit, wVar));
    }

    /* renamed from: j */
    public final C40741h mo94930j(C41397d dVar) {
        C41692b.m120934e(dVar, "comparer is null");
        return C40293a.m116715l(new C42149d(this, C41669a.m120909e(), dVar));
    }

    /* renamed from: l */
    public final C40741h mo94931l(C41399f fVar, C41406m mVar, C41394a aVar) {
        C41692b.m120934e(fVar, "onSubscribe is null");
        C41692b.m120934e(mVar, "onRequest is null");
        C41692b.m120934e(aVar, "onCancel is null");
        return C40293a.m116715l(new C42155f(this, fVar, mVar, aVar));
    }

    /* renamed from: m */
    public final C40741h mo94932m(C41399f fVar) {
        C41399f d = C41669a.m120908d();
        C41394a aVar = C41669a.f97937c;
        return m117962k(fVar, d, aVar, aVar);
    }

    /* renamed from: n */
    public final C40741h mo94933n(C41399f fVar) {
        return mo94931l(fVar, C41669a.f97941g, C41669a.f97937c);
    }

    /* renamed from: o */
    public final C40762x mo94934o(long j) {
        if (j >= 0) {
            return C40293a.m116718o(new C42157g(this, j, (Object) null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    /* renamed from: q */
    public final C40741h mo94935q(C41407n nVar) {
        C41692b.m120934e(nVar, "predicate is null");
        return C40293a.m116715l(new C42160i(this, nVar));
    }

    /* renamed from: r */
    public final C40762x mo94936r() {
        return mo94934o(0);
    }

    /* renamed from: s */
    public final C40741h mo94937s(C41405l lVar) {
        return mo94938t(lVar, false, Integer.MAX_VALUE);
    }

    /* renamed from: t */
    public final C40741h mo94938t(C41405l lVar, boolean z, int i) {
        C41692b.m120934e(lVar, "mapper is null");
        C41692b.m120935f(i, "maxConcurrency");
        return C40293a.m116715l(new C42163j(this, lVar, z, i));
    }

    /* renamed from: v */
    public final C40741h mo94939v(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116715l(new C42170n(this, lVar));
    }

    /* renamed from: w */
    public final C40741h mo94940w(C40757w wVar) {
        return mo94941x(wVar, false, m117960c());
    }

    /* renamed from: x */
    public final C40741h mo94941x(C40757w wVar, boolean z, int i) {
        C41692b.m120934e(wVar, "scheduler is null");
        C41692b.m120935f(i, "bufferSize");
        return C40293a.m116715l(new C42173o(this, wVar, z, i));
    }

    /* renamed from: y */
    public final C40741h mo94942y() {
        return mo94943z(m117960c(), false, true);
    }

    /* renamed from: z */
    public final C40741h mo94943z(int i, boolean z, boolean z2) {
        C41692b.m120935f(i, "capacity");
        return C40293a.m116715l(new C42177p(this, i, z2, z, C41669a.f97937c));
    }
}
