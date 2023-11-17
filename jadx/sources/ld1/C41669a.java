package ld1;

import ae1.C40293a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import jd1.C41394a;
import jd1.C41396c;
import jd1.C41399f;
import jd1.C41400g;
import jd1.C41401h;
import jd1.C41402i;
import jd1.C41403j;
import jd1.C41404k;
import jd1.C41405l;
import jd1.C41406m;
import jd1.C41407n;
import p469io.reactivex.exceptions.OnErrorNotImplementedException;
import uh1.C43108c;

/* renamed from: ld1.a */
public abstract class C41669a {

    /* renamed from: a */
    static final C41405l f97935a = new C41685p();

    /* renamed from: b */
    public static final Runnable f97936b = new C41682m();

    /* renamed from: c */
    public static final C41394a f97937c = new C41679j();

    /* renamed from: d */
    static final C41399f f97938d = new C41680k();

    /* renamed from: e */
    public static final C41399f f97939e = new C41683n();

    /* renamed from: f */
    public static final C41399f f97940f = new C41690u();

    /* renamed from: g */
    public static final C41406m f97941g = new C41681l();

    /* renamed from: h */
    static final C41407n f97942h = new C41691v();

    /* renamed from: i */
    static final C41407n f97943i = new C41684o();

    /* renamed from: j */
    static final Callable f97944j = new C41689t();

    /* renamed from: k */
    static final Comparator f97945k = new C41688s();

    /* renamed from: l */
    public static final C41399f f97946l = new C41687r();

    /* renamed from: ld1.a$a */
    static final class C41670a implements C41405l {

        /* renamed from: d */
        final C41396c f97947d;

        C41670a(C41396c cVar) {
            this.f97947d = cVar;
        }

        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f97947d.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: ld1.a$b */
    static final class C41671b implements C41405l {

        /* renamed from: d */
        final C41400g f97948d;

        C41671b(C41400g gVar) {
            this.f97948d = gVar;
        }

        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 3) {
                return this.f97948d.mo27225a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* renamed from: ld1.a$c */
    static final class C41672c implements C41405l {

        /* renamed from: d */
        final C41401h f97949d;

        C41672c(C41401h hVar) {
            this.f97949d = hVar;
        }

        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 4) {
                return this.f97949d.mo41987a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }
    }

    /* renamed from: ld1.a$d */
    static final class C41673d implements C41405l {

        /* renamed from: d */
        private final C41402i f97950d;

        C41673d(C41402i iVar) {
            this.f97950d = iVar;
        }

        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 5) {
                return this.f97950d.mo41145a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
        }
    }

    /* renamed from: ld1.a$e */
    static final class C41674e implements C41405l {

        /* renamed from: d */
        final C41403j f97951d;

        C41674e(C41403j jVar) {
            this.f97951d = jVar;
        }

        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 6) {
                return this.f97951d.mo43650a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }
    }

    /* renamed from: ld1.a$f */
    static final class C41675f implements C41405l {

        /* renamed from: d */
        final C41404k f97952d;

        C41675f(C41404k kVar) {
            this.f97952d = kVar;
        }

        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 9) {
                return this.f97952d.mo43884a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
        }
    }

    /* renamed from: ld1.a$g */
    static final class C41676g implements Callable {

        /* renamed from: d */
        final int f97953d;

        C41676g(int i) {
            this.f97953d = i;
        }

        /* renamed from: a */
        public List call() {
            return new ArrayList(this.f97953d);
        }
    }

    /* renamed from: ld1.a$h */
    static final class C41677h implements C41405l {

        /* renamed from: d */
        final Class f97954d;

        C41677h(Class cls) {
            this.f97954d = cls;
        }

        public Object apply(Object obj) {
            return this.f97954d.cast(obj);
        }
    }

    /* renamed from: ld1.a$i */
    static final class C41678i implements C41407n {

        /* renamed from: d */
        final Class f97955d;

        C41678i(Class cls) {
            this.f97955d = cls;
        }

        public boolean test(Object obj) {
            return this.f97955d.isInstance(obj);
        }
    }

    /* renamed from: ld1.a$j */
    static final class C41679j implements C41394a {
        C41679j() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: ld1.a$k */
    static final class C41680k implements C41399f {
        C41680k() {
        }

        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: ld1.a$l */
    static final class C41681l implements C41406m {
        C41681l() {
        }

        /* renamed from: a */
        public void mo96042a(long j) {
        }
    }

    /* renamed from: ld1.a$m */
    static final class C41682m implements Runnable {
        C41682m() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: ld1.a$n */
    static final class C41683n implements C41399f {
        C41683n() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C40293a.m116722s(th);
        }
    }

    /* renamed from: ld1.a$o */
    static final class C41684o implements C41407n {
        C41684o() {
        }

        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: ld1.a$p */
    static final class C41685p implements C41405l {
        C41685p() {
        }

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: ld1.a$q */
    static final class C41686q implements Callable, C41405l {

        /* renamed from: d */
        final Object f97956d;

        C41686q(Object obj) {
            this.f97956d = obj;
        }

        public Object apply(Object obj) {
            return this.f97956d;
        }

        public Object call() {
            return this.f97956d;
        }
    }

    /* renamed from: ld1.a$r */
    static final class C41687r implements C41399f {
        C41687r() {
        }

        /* renamed from: a */
        public void accept(C43108c cVar) {
            cVar.mo94357l(Long.MAX_VALUE);
        }
    }

    /* renamed from: ld1.a$s */
    static final class C41688s implements Comparator {
        C41688s() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: ld1.a$t */
    static final class C41689t implements Callable {
        C41689t() {
        }

        public Object call() {
            return null;
        }
    }

    /* renamed from: ld1.a$u */
    static final class C41690u implements C41399f {
        C41690u() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C40293a.m116722s(new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: ld1.a$v */
    static final class C41691v implements C41407n {
        C41691v() {
        }

        public boolean test(Object obj) {
            return true;
        }
    }

    /* renamed from: a */
    public static C41407n m120905a() {
        return f97942h;
    }

    /* renamed from: b */
    public static C41405l m120906b(Class cls) {
        return new C41677h(cls);
    }

    /* renamed from: c */
    public static Callable m120907c(int i) {
        return new C41676g(i);
    }

    /* renamed from: d */
    public static C41399f m120908d() {
        return f97938d;
    }

    /* renamed from: e */
    public static C41405l m120909e() {
        return f97935a;
    }

    /* renamed from: f */
    public static C41407n m120910f(Class cls) {
        return new C41678i(cls);
    }

    /* renamed from: g */
    public static Callable m120911g(Object obj) {
        return new C41686q(obj);
    }

    /* renamed from: h */
    public static C41405l m120912h(Object obj) {
        return new C41686q(obj);
    }

    /* renamed from: i */
    public static C41405l m120913i(C41396c cVar) {
        C41692b.m120934e(cVar, "f is null");
        return new C41670a(cVar);
    }

    /* renamed from: j */
    public static C41405l m120914j(C41400g gVar) {
        C41692b.m120934e(gVar, "f is null");
        return new C41671b(gVar);
    }

    /* renamed from: k */
    public static C41405l m120915k(C41401h hVar) {
        C41692b.m120934e(hVar, "f is null");
        return new C41672c(hVar);
    }

    /* renamed from: l */
    public static C41405l m120916l(C41402i iVar) {
        C41692b.m120934e(iVar, "f is null");
        return new C41673d(iVar);
    }

    /* renamed from: m */
    public static C41405l m120917m(C41403j jVar) {
        C41692b.m120934e(jVar, "f is null");
        return new C41674e(jVar);
    }

    /* renamed from: n */
    public static C41405l m120918n(C41404k kVar) {
        C41692b.m120934e(kVar, "f is null");
        return new C41675f(kVar);
    }
}
