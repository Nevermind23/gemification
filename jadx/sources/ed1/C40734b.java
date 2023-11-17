package ed1;

import ae1.C40293a;
import de1.C40640a;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jd1.C41394a;
import jd1.C41399f;
import jd1.C41405l;
import jd1.C41407n;
import ld1.C41669a;
import ld1.C41692b;
import md1.C41734c;
import nd1.C41780g;
import nd1.C41781h;
import nd1.C41785l;
import od1.C41813a;
import od1.C41816b;
import od1.C41818c;
import od1.C41820d;
import od1.C41821e;
import od1.C41823f;
import od1.C41824g;
import od1.C41825h;
import od1.C41826i;
import od1.C41827j;
import od1.C41831l;
import od1.C41832m;
import od1.C41834n;
import od1.C41836o;
import od1.C41838p;
import od1.C41840q;
import od1.C41842r;
import od1.C41844s;
import od1.C41846t;
import od1.C41848u;
import qd1.C42304f;
import rd1.C42358a;
import td1.C42946d;

/* renamed from: ed1.b */
public abstract class C40734b implements C40739f {
    /* renamed from: J */
    private static NullPointerException m117916J(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: N */
    public static C40734b m117917N(C40739f fVar) {
        C41692b.m120934e(fVar, "source is null");
        if (fVar instanceof C40734b) {
            return C40293a.m116714k((C40734b) fVar);
        }
        return C40293a.m116714k(new C41831l(fVar));
    }

    /* renamed from: i */
    public static C40734b m117918i() {
        return C40293a.m116714k(C41823f.f98174d);
    }

    /* renamed from: j */
    public static C40734b m117919j(C40739f... fVarArr) {
        C41692b.m120934e(fVarArr, "sources is null");
        if (fVarArr.length == 0) {
            return m117918i();
        }
        if (fVarArr.length == 1) {
            return m117917N(fVarArr[0]);
        }
        return C40293a.m116714k(new C41816b(fVarArr));
    }

    /* renamed from: k */
    public static C40734b m117920k(C40738e eVar) {
        C41692b.m120934e(eVar, "source is null");
        return C40293a.m116714k(new C41818c(eVar));
    }

    /* renamed from: l */
    public static C40734b m117921l(Callable callable) {
        C41692b.m120934e(callable, "completableSupplier");
        return C40293a.m116714k(new C41820d(callable));
    }

    /* renamed from: q */
    private C40734b m117922q(C41399f fVar, C41399f fVar2, C41394a aVar, C41394a aVar2, C41394a aVar3, C41394a aVar4) {
        C41692b.m120934e(fVar, "onSubscribe is null");
        C41692b.m120934e(fVar2, "onError is null");
        C41692b.m120934e(aVar, "onComplete is null");
        C41692b.m120934e(aVar2, "onTerminate is null");
        C41692b.m120934e(aVar3, "onAfterTerminate is null");
        C41692b.m120934e(aVar4, "onDispose is null");
        return C40293a.m116714k(new C41840q(this, fVar, fVar2, aVar, aVar2, aVar3, aVar4));
    }

    /* renamed from: s */
    public static C40734b m117923s(Throwable th) {
        C41692b.m120934e(th, "error is null");
        return C40293a.m116714k(new C41824g(th));
    }

    /* renamed from: t */
    public static C40734b m117924t(C41394a aVar) {
        C41692b.m120934e(aVar, "run is null");
        return C40293a.m116714k(new C41825h(aVar));
    }

    /* renamed from: u */
    public static C40734b m117925u(Callable callable) {
        C41692b.m120934e(callable, "callable is null");
        return C40293a.m116714k(new C41826i(callable));
    }

    /* renamed from: v */
    public static C40734b m117926v(C40754t tVar) {
        C41692b.m120934e(tVar, "observable is null");
        return C40293a.m116714k(new C41827j(tVar));
    }

    /* renamed from: w */
    public static C40734b m117927w(C40739f... fVarArr) {
        C41692b.m120934e(fVarArr, "sources is null");
        if (fVarArr.length == 0) {
            return m117918i();
        }
        if (fVarArr.length == 1) {
            return m117917N(fVarArr[0]);
        }
        return C40293a.m116714k(new C41832m(fVarArr));
    }

    /* renamed from: x */
    public static C40734b m117928x(C40739f... fVarArr) {
        C41692b.m120934e(fVarArr, "sources is null");
        return C40293a.m116714k(new C41834n(fVarArr));
    }

    /* renamed from: A */
    public final C40734b mo94882A() {
        return mo94883B(C41669a.m120905a());
    }

    /* renamed from: B */
    public final C40734b mo94883B(C41407n nVar) {
        C41692b.m120934e(nVar, "predicate is null");
        return C40293a.m116714k(new C41838p(this, nVar));
    }

    /* renamed from: C */
    public final C40734b mo94884C(C41405l lVar) {
        C41692b.m120934e(lVar, "errorMapper is null");
        return C40293a.m116714k(new C41842r(this, lVar));
    }

    /* renamed from: D */
    public final C40734b mo94885D(C40739f fVar) {
        C41692b.m120934e(fVar, "other is null");
        return m117919j(fVar, this);
    }

    /* renamed from: E */
    public final C41205b mo94886E() {
        C41785l lVar = new C41785l();
        mo94894a(lVar);
        return lVar;
    }

    /* renamed from: F */
    public final C41205b mo94887F(C41394a aVar) {
        C41692b.m120934e(aVar, "onComplete is null");
        C41781h hVar = new C41781h(aVar);
        mo94894a(hVar);
        return hVar;
    }

    /* renamed from: G */
    public final C41205b mo94888G(C41394a aVar, C41399f fVar) {
        C41692b.m120934e(fVar, "onError is null");
        C41692b.m120934e(aVar, "onComplete is null");
        C41781h hVar = new C41781h(fVar, aVar);
        mo94894a(hVar);
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract void mo94889H(C40737d dVar);

    /* renamed from: I */
    public final C40734b mo94890I(C40757w wVar) {
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116714k(new C41844s(this, wVar));
    }

    /* renamed from: K */
    public final C40749p mo94891K() {
        if (this instanceof C41734c) {
            return ((C41734c) this).mo96527b();
        }
        return C40293a.m116717n(new C41846t(this));
    }

    /* renamed from: L */
    public final C40762x mo94892L(Callable callable) {
        C41692b.m120934e(callable, "completionValueSupplier is null");
        return C40293a.m116718o(new C41848u(this, callable, (Object) null));
    }

    /* renamed from: M */
    public final C40762x mo94893M(Object obj) {
        C41692b.m120934e(obj, "completionValue is null");
        return C40293a.m116718o(new C41848u(this, (Callable) null, obj));
    }

    /* renamed from: a */
    public final void mo94894a(C40737d dVar) {
        C41692b.m120934e(dVar, "observer is null");
        try {
            C40737d v = C40293a.m116725v(this, dVar);
            C41692b.m120934e(v, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo94889H(v);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C40293a.m116722s(th);
            throw m117916J(th);
        }
    }

    /* renamed from: d */
    public final C40734b mo94895d(C40739f fVar) {
        C41692b.m120934e(fVar, "next is null");
        return C40293a.m116714k(new C41813a(this, fVar));
    }

    /* renamed from: e */
    public final C40744k mo94896e(C40748o oVar) {
        C41692b.m120934e(oVar, "next is null");
        return C40293a.m116716m(new C42304f(oVar, this));
    }

    /* renamed from: f */
    public final C40749p mo94897f(C40754t tVar) {
        C41692b.m120934e(tVar, "next is null");
        return C40293a.m116717n(new C42358a(this, tVar));
    }

    /* renamed from: g */
    public final C40762x mo94898g(C40735b0 b0Var) {
        C41692b.m120934e(b0Var, "next is null");
        return C40293a.m116718o(new C42946d(b0Var, this));
    }

    /* renamed from: h */
    public final Throwable mo94899h() {
        C41780g gVar = new C41780g();
        mo94894a(gVar);
        return gVar.mo96602b();
    }

    /* renamed from: m */
    public final C40734b mo94900m(long j, TimeUnit timeUnit) {
        return mo94901n(j, timeUnit, C40640a.m117457a(), false);
    }

    /* renamed from: n */
    public final C40734b mo94901n(long j, TimeUnit timeUnit, C40757w wVar, boolean z) {
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116714k(new C41821e(this, j, timeUnit, wVar, z));
    }

    /* renamed from: o */
    public final C40734b mo94902o(C41394a aVar) {
        C41399f d = C41669a.m120908d();
        C41399f d2 = C41669a.m120908d();
        C41394a aVar2 = C41669a.f97937c;
        return m117922q(d, d2, aVar, aVar2, aVar2, aVar2);
    }

    /* renamed from: p */
    public final C40734b mo94903p(C41399f fVar) {
        C41399f d = C41669a.m120908d();
        C41394a aVar = C41669a.f97937c;
        return m117922q(d, fVar, aVar, aVar, aVar, aVar);
    }

    /* renamed from: r */
    public final C40734b mo94904r(C41399f fVar) {
        C41399f d = C41669a.m120908d();
        C41394a aVar = C41669a.f97937c;
        return m117922q(fVar, d, aVar, aVar, aVar, aVar);
    }

    /* renamed from: y */
    public final C40734b mo94905y(C40739f fVar) {
        C41692b.m120934e(fVar, "other is null");
        return m117927w(this, fVar);
    }

    /* renamed from: z */
    public final C40734b mo94906z(C40757w wVar) {
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116714k(new C41836o(this, wVar));
    }
}
