package ed1;

import ae1.C40293a;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.Callable;
import jd1.C41394a;
import jd1.C41399f;
import jd1.C41405l;
import jd1.C41407n;
import ld1.C41669a;
import ld1.C41692b;
import md1.C41734c;
import qd1.C42297b;
import qd1.C42299c;
import qd1.C42300d;
import qd1.C42302e;
import qd1.C42307g;
import qd1.C42308h;
import qd1.C42312j;
import qd1.C42314k;
import qd1.C42317l;
import qd1.C42322o;
import qd1.C42324p;
import qd1.C42325q;
import qd1.C42327r;
import qd1.C42329s;
import qd1.C42331t;
import qd1.C42333u;
import qd1.C42336v;
import qd1.C42339w;
import qd1.C42342x;
import qd1.C42344y;
import qd1.C42346z;

/* renamed from: ed1.k */
public abstract class C40744k implements C40748o {
    /* renamed from: e */
    public static C40741h m117995e(C40748o oVar, C40748o oVar2) {
        C41692b.m120934e(oVar, "source1 is null");
        C41692b.m120934e(oVar2, "source2 is null");
        return m117996f(oVar, oVar2);
    }

    /* renamed from: f */
    public static C40741h m117996f(C40748o... oVarArr) {
        C41692b.m120934e(oVarArr, "sources is null");
        if (oVarArr.length == 0) {
            return C40741h.m117963p();
        }
        if (oVarArr.length == 1) {
            return C40293a.m116715l(new C42342x(oVarArr[0]));
        }
        return C40293a.m116715l(new C42300d(oVarArr));
    }

    /* renamed from: g */
    public static C40744k m117997g(C40747n nVar) {
        C41692b.m120934e(nVar, "onSubscribe is null");
        return C40293a.m116716m(new C42302e(nVar));
    }

    /* renamed from: k */
    public static C40744k m117998k() {
        return C40293a.m116716m(C42307g.f99494d);
    }

    /* renamed from: o */
    public static C40744k m117999o(Callable callable) {
        C41692b.m120934e(callable, "callable is null");
        return C40293a.m116716m(new C42317l(callable));
    }

    /* renamed from: q */
    public static C40744k m118000q(Object obj) {
        C41692b.m120934e(obj, "item is null");
        return C40293a.m116716m(new C42324p(obj));
    }

    /* renamed from: A */
    public final C40762x mo94944A(C40735b0 b0Var) {
        C41692b.m120934e(b0Var, "other is null");
        return C40293a.m116718o(new C42339w(this, b0Var));
    }

    /* renamed from: B */
    public final C40749p mo94945B() {
        if (this instanceof C41734c) {
            return ((C41734c) this).mo96527b();
        }
        return C40293a.m116717n(new C42344y(this));
    }

    /* renamed from: C */
    public final C40762x mo94946C() {
        return C40293a.m116718o(new C42346z(this, (Object) null));
    }

    /* renamed from: c */
    public final void mo94947c(C40746m mVar) {
        C41692b.m120934e(mVar, "observer is null");
        C40746m w = C40293a.m116726w(this, mVar);
        C41692b.m120934e(w, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo94961w(w);
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
    public final C40744k mo94948d() {
        return C40293a.m116716m(new C42297b(this));
    }

    /* renamed from: h */
    public final C40744k mo94949h(Object obj) {
        C41692b.m120934e(obj, "defaultItem is null");
        return mo94964z(m118000q(obj));
    }

    /* renamed from: i */
    public final C40744k mo94950i(C41399f fVar) {
        C41399f d = C41669a.m120908d();
        C41399f d2 = C41669a.m120908d();
        C41394a aVar = C41669a.f97937c;
        return C40293a.m116716m(new C42331t(this, (C41399f) C41692b.m120934e(fVar, "onSubscribe is null"), d, d2, aVar, aVar, aVar));
    }

    /* renamed from: j */
    public final C40744k mo94951j(C41399f fVar) {
        C41399f d = C41669a.m120908d();
        C41394a aVar = C41669a.f97937c;
        return C40293a.m116716m(new C42331t(this, C41669a.m120908d(), (C41399f) C41692b.m120934e(fVar, "onSuccess is null"), d, aVar, aVar, aVar));
    }

    /* renamed from: l */
    public final C40744k mo94952l(C41407n nVar) {
        C41692b.m120934e(nVar, "predicate is null");
        return C40293a.m116716m(new C42308h(this, nVar));
    }

    /* renamed from: m */
    public final C40744k mo94953m(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116716m(new C42314k(this, lVar));
    }

    /* renamed from: n */
    public final C40734b mo94954n(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116714k(new C42312j(this, lVar));
    }

    /* renamed from: p */
    public final C40734b mo94955p() {
        return C40293a.m116714k(new C42322o(this));
    }

    /* renamed from: r */
    public final C40744k mo94956r(C41405l lVar) {
        C41692b.m120934e(lVar, "mapper is null");
        return C40293a.m116716m(new C42325q(this, lVar));
    }

    /* renamed from: s */
    public final C40744k mo94957s(C40757w wVar) {
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116716m(new C42327r(this, wVar));
    }

    /* renamed from: t */
    public final C40744k mo94958t(C41405l lVar) {
        C41692b.m120934e(lVar, "valueSupplier is null");
        return C40293a.m116716m(new C42329s(this, lVar));
    }

    /* renamed from: u */
    public final C41205b mo94959u(C41399f fVar) {
        return mo94960v(fVar, C41669a.f97940f, C41669a.f97937c);
    }

    /* renamed from: v */
    public final C41205b mo94960v(C41399f fVar, C41399f fVar2, C41394a aVar) {
        C41692b.m120934e(fVar, "onSuccess is null");
        C41692b.m120934e(fVar2, "onError is null");
        C41692b.m120934e(aVar, "onComplete is null");
        return (C41205b) mo94963y(new C42299c(fVar, fVar2, aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo94961w(C40746m mVar);

    /* renamed from: x */
    public final C40744k mo94962x(C40757w wVar) {
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116716m(new C42333u(this, wVar));
    }

    /* renamed from: y */
    public final C40746m mo94963y(C40746m mVar) {
        mo94947c(mVar);
        return mVar;
    }

    /* renamed from: z */
    public final C40744k mo94964z(C40748o oVar) {
        C41692b.m120934e(oVar, "other is null");
        return C40293a.m116716m(new C42336v(this, oVar));
    }
}
