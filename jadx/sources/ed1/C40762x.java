package ed1;

import ae1.C40293a;
import de1.C40640a;
import hd1.C41205b;
import id1.C41300a;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jd1.C41394a;
import jd1.C41395b;
import jd1.C41396c;
import jd1.C41399f;
import jd1.C41400g;
import jd1.C41401h;
import jd1.C41402i;
import jd1.C41404k;
import jd1.C41405l;
import jd1.C41407n;
import ld1.C41669a;
import ld1.C41692b;
import md1.C41733b;
import md1.C41734c;
import nd1.C41777d;
import nd1.C41782i;
import od1.C41829k;
import qd1.C42310i;
import qd1.C42318m;
import rd1.C42364d;
import sd1.C42539x0;
import td1.C42936a;
import td1.C42938a0;
import td1.C42940b;
import td1.C42942c;
import td1.C42948e;
import td1.C42950f;
import td1.C42952g;
import td1.C42954h;
import td1.C42956i;
import td1.C42958j;
import td1.C42960k;
import td1.C42962l;
import td1.C42963m;
import td1.C42966n;
import td1.C42968o;
import td1.C42971p;
import td1.C42972q;
import td1.C42974r;
import td1.C42975s;
import td1.C42977t;
import td1.C42979u;
import td1.C42981v;
import td1.C42983w;
import td1.C42985x;
import td1.C42988y;
import td1.C42990z;

/* renamed from: ed1.x */
public abstract class C40762x<T> implements C40735b0 {
    /* renamed from: M */
    private C40762x m118149M(long j, TimeUnit timeUnit, C40757w wVar, C40735b0 b0Var) {
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116718o(new C42985x(this, j, timeUnit, wVar, b0Var));
    }

    /* renamed from: P */
    public static C40762x m118150P(C40735b0 b0Var, C40735b0 b0Var2, C40735b0 b0Var3, C40735b0 b0Var4, C40735b0 b0Var5, C40735b0 b0Var6, C40735b0 b0Var7, C40735b0 b0Var8, C40735b0 b0Var9, C41404k kVar) {
        C41692b.m120934e(b0Var, "source1 is null");
        C41692b.m120934e(b0Var2, "source2 is null");
        C41692b.m120934e(b0Var3, "source3 is null");
        C41692b.m120934e(b0Var4, "source4 is null");
        C41692b.m120934e(b0Var5, "source5 is null");
        C41692b.m120934e(b0Var6, "source6 is null");
        C41692b.m120934e(b0Var7, "source7 is null");
        C41692b.m120934e(b0Var8, "source8 is null");
        C41692b.m120934e(b0Var9, "source9 is null");
        return m118156V(C41669a.m120918n(kVar), b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, b0Var7, b0Var8, b0Var9);
    }

    /* renamed from: Q */
    public static C40762x m118151Q(C40735b0 b0Var, C40735b0 b0Var2, C40735b0 b0Var3, C40735b0 b0Var4, C40735b0 b0Var5, C41402i iVar) {
        C41692b.m120934e(b0Var, "source1 is null");
        C41692b.m120934e(b0Var2, "source2 is null");
        C41692b.m120934e(b0Var3, "source3 is null");
        C41692b.m120934e(b0Var4, "source4 is null");
        C41692b.m120934e(b0Var5, "source5 is null");
        return m118156V(C41669a.m120916l(iVar), b0Var, b0Var2, b0Var3, b0Var4, b0Var5);
    }

    /* renamed from: R */
    public static C40762x m118152R(C40735b0 b0Var, C40735b0 b0Var2, C40735b0 b0Var3, C40735b0 b0Var4, C41401h hVar) {
        C41692b.m120934e(b0Var, "source1 is null");
        C41692b.m120934e(b0Var2, "source2 is null");
        C41692b.m120934e(b0Var3, "source3 is null");
        C41692b.m120934e(b0Var4, "source4 is null");
        return m118156V(C41669a.m120915k(hVar), b0Var, b0Var2, b0Var3, b0Var4);
    }

    /* renamed from: S */
    public static C40762x m118153S(C40735b0 b0Var, C40735b0 b0Var2, C40735b0 b0Var3, C41400g gVar) {
        C41692b.m120934e(b0Var, "source1 is null");
        C41692b.m120934e(b0Var2, "source2 is null");
        C41692b.m120934e(b0Var3, "source3 is null");
        return m118156V(C41669a.m120914j(gVar), b0Var, b0Var2, b0Var3);
    }

    /* renamed from: T */
    public static C40762x m118154T(C40735b0 b0Var, C40735b0 b0Var2, C41396c cVar) {
        C41692b.m120934e(b0Var, "source1 is null");
        C41692b.m120934e(b0Var2, "source2 is null");
        return m118156V(C41669a.m120913i(cVar), b0Var, b0Var2);
    }

    /* renamed from: U */
    public static C40762x m118155U(Iterable iterable, C41405l lVar) {
        C41692b.m120934e(lVar, "zipper is null");
        C41692b.m120934e(iterable, "sources is null");
        return C40293a.m116718o(new C42938a0(iterable, lVar));
    }

    /* renamed from: V */
    public static C40762x m118156V(C41405l lVar, C40735b0... b0VarArr) {
        C41692b.m120934e(lVar, "zipper is null");
        C41692b.m120934e(b0VarArr, "sources is null");
        if (b0VarArr.length == 0) {
            return m118158o(new NoSuchElementException());
        }
        return C40293a.m116718o(new C42990z(b0VarArr, lVar));
    }

    /* renamed from: e */
    public static C40762x m118157e(C40733a0 a0Var) {
        C41692b.m120934e(a0Var, "source is null");
        return C40293a.m116718o(new C42940b(a0Var));
    }

    /* renamed from: o */
    public static C40762x m118158o(Throwable th) {
        C41692b.m120934e(th, "exception is null");
        return m118159p(C41669a.m120911g(th));
    }

    /* renamed from: p */
    public static C40762x m118159p(Callable callable) {
        C41692b.m120934e(callable, "errorSupplier is null");
        return C40293a.m116718o(new C42962l(callable));
    }

    /* renamed from: v */
    public static C40762x m118160v(Callable callable) {
        C41692b.m120934e(callable, "callable is null");
        return C40293a.m116718o(new C42971p(callable));
    }

    /* renamed from: w */
    public static C40762x m118161w(C40754t tVar) {
        C41692b.m120934e(tVar, "observableSource is null");
        return C40293a.m116718o(new C42539x0(tVar, (Object) null));
    }

    /* renamed from: z */
    public static C40762x m118162z(Object obj) {
        C41692b.m120934e(obj, "item is null");
        return C40293a.m116718o(new C42974r(obj));
    }

    /* renamed from: A */
    public final C40762x mo95062A(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116718o(new C42975s(this, lVar));
    }

    /* renamed from: B */
    public final C40762x mo95063B(C40757w wVar) {
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116718o(new C42977t(this, wVar));
    }

    /* renamed from: C */
    public final C40762x mo95064C(C41405l lVar) {
        C41692b.m120934e(lVar, "resumeFunctionInCaseOfError is null");
        return C40293a.m116718o(new C42981v(this, lVar));
    }

    /* renamed from: D */
    public final C40762x mo95065D(C41405l lVar) {
        C41692b.m120934e(lVar, "resumeFunction is null");
        return C40293a.m116718o(new C42979u(this, lVar, (Object) null));
    }

    /* renamed from: E */
    public final C40762x mo95066E(Object obj) {
        C41692b.m120934e(obj, "value is null");
        return C40293a.m116718o(new C42979u(this, (C41405l) null, obj));
    }

    /* renamed from: F */
    public final C41205b mo95067F() {
        return mo95070I(C41669a.m120908d(), C41669a.f97940f);
    }

    /* renamed from: G */
    public final C41205b mo95068G(C41395b bVar) {
        C41692b.m120934e(bVar, "onCallback is null");
        C41777d dVar = new C41777d(bVar);
        mo94907c(dVar);
        return dVar;
    }

    /* renamed from: H */
    public final C41205b mo95069H(C41399f fVar) {
        return mo95070I(fVar, C41669a.f97940f);
    }

    /* renamed from: I */
    public final C41205b mo95070I(C41399f fVar, C41399f fVar2) {
        C41692b.m120934e(fVar, "onSuccess is null");
        C41692b.m120934e(fVar2, "onError is null");
        C41782i iVar = new C41782i(fVar, fVar2);
        mo94907c(iVar);
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract void mo95071J(C40764z zVar);

    /* renamed from: K */
    public final C40762x mo95072K(C40757w wVar) {
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116718o(new C42983w(this, wVar));
    }

    /* renamed from: L */
    public final C40762x mo95073L(long j, TimeUnit timeUnit) {
        return m118149M(j, timeUnit, C40640a.m117457a(), (C40735b0) null);
    }

    /* renamed from: N */
    public final C40744k mo95074N() {
        if (this instanceof C41733b) {
            return ((C41733b) this).mo96526c();
        }
        return C40293a.m116716m(new C42318m(this));
    }

    /* renamed from: O */
    public final C40749p mo95075O() {
        if (this instanceof C41734c) {
            return ((C41734c) this).mo96527b();
        }
        return C40293a.m116717n(new C42988y(this));
    }

    /* renamed from: c */
    public final void mo94907c(C40764z zVar) {
        C41692b.m120934e(zVar, "observer is null");
        C40764z y = C40293a.m116728y(this, zVar);
        C41692b.m120934e(y, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo95071J(y);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C41300a.m119661b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: d */
    public final C40762x mo95076d() {
        return C40293a.m116718o(new C42936a(this));
    }

    /* renamed from: f */
    public final C40762x mo95077f(long j, TimeUnit timeUnit) {
        return mo95078g(j, timeUnit, C40640a.m117457a(), false);
    }

    /* renamed from: g */
    public final C40762x mo95078g(long j, TimeUnit timeUnit, C40757w wVar, boolean z) {
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116718o(new C42942c(this, j, timeUnit, wVar, z));
    }

    /* renamed from: h */
    public final C40762x mo95079h(C41399f fVar) {
        C41692b.m120934e(fVar, "onAfterSuccess is null");
        return C40293a.m116718o(new C42948e(this, fVar));
    }

    /* renamed from: i */
    public final C40762x mo95080i(C41394a aVar) {
        C41692b.m120934e(aVar, "onAfterTerminate is null");
        return C40293a.m116718o(new C42950f(this, aVar));
    }

    /* renamed from: j */
    public final C40762x mo95081j(C41394a aVar) {
        C41692b.m120934e(aVar, "onFinally is null");
        return C40293a.m116718o(new C42952g(this, aVar));
    }

    /* renamed from: k */
    public final C40762x mo95082k(C41399f fVar) {
        C41692b.m120934e(fVar, "onError is null");
        return C40293a.m116718o(new C42954h(this, fVar));
    }

    /* renamed from: l */
    public final C40762x mo95083l(C41399f fVar) {
        C41692b.m120934e(fVar, "onSubscribe is null");
        return C40293a.m116718o(new C42956i(this, fVar));
    }

    /* renamed from: m */
    public final C40762x mo95084m(C41399f fVar) {
        C41692b.m120934e(fVar, "onSuccess is null");
        return C40293a.m116718o(new C42958j(this, fVar));
    }

    /* renamed from: n */
    public final C40762x mo95085n(C41394a aVar) {
        C41692b.m120934e(aVar, "onTerminate is null");
        return C40293a.m116718o(new C42960k(this, aVar));
    }

    /* renamed from: q */
    public final C40744k mo95086q(C41407n nVar) {
        C41692b.m120934e(nVar, "predicate is null");
        return C40293a.m116716m(new C42310i(this, nVar));
    }

    /* renamed from: r */
    public final C40762x mo95087r(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116718o(new C42963m(this, lVar));
    }

    /* renamed from: s */
    public final C40734b mo95088s(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116714k(new C42966n(this, lVar));
    }

    /* renamed from: t */
    public final C40744k mo95089t(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116716m(new C42968o(this, lVar));
    }

    /* renamed from: u */
    public final C40749p mo95090u(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116717n(new C42364d(this, lVar));
    }

    /* renamed from: x */
    public final C40762x mo95091x() {
        return C40293a.m116718o(new C42972q(this));
    }

    /* renamed from: y */
    public final C40734b mo95092y() {
        return C40293a.m116714k(new C41829k(this));
    }
}
