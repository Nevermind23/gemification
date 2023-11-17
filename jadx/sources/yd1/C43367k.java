package yd1;

import ed1.C40756v;
import hd1.C41205b;
import java.io.Serializable;
import ld1.C41692b;
import uh1.C43107b;
import uh1.C43108c;

/* renamed from: yd1.k */
public enum C43367k {
    COMPLETE;

    /* renamed from: yd1.k$a */
    static final class C43368a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: d */
        final C41205b f101209d;

        C43368a(C41205b bVar) {
            this.f101209d = bVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f101209d + "]";
        }
    }

    /* renamed from: yd1.k$b */
    static final class C43369b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: d */
        final Throwable f101210d;

        C43369b(Throwable th) {
            this.f101210d = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C43369b) {
                return C41692b.m120932c(this.f101210d, ((C43369b) obj).f101210d);
            }
            return false;
        }

        public int hashCode() {
            return this.f101210d.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f101210d + "]";
        }
    }

    /* renamed from: yd1.k$c */
    static final class C43370c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* renamed from: d */
        final C43108c f101211d;

        C43370c(C43108c cVar) {
            this.f101211d = cVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f101211d + "]";
        }
    }

    /* renamed from: a */
    public static boolean m124419a(Object obj, C40756v vVar) {
        if (obj == COMPLETE) {
            vVar.onComplete();
            return true;
        } else if (obj instanceof C43369b) {
            vVar.onError(((C43369b) obj).f101210d);
            return true;
        } else {
            vVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m124420b(Object obj, C40756v vVar) {
        if (obj == COMPLETE) {
            vVar.onComplete();
            return true;
        } else if (obj instanceof C43369b) {
            vVar.onError(((C43369b) obj).f101210d);
            return true;
        } else if (obj instanceof C43368a) {
            vVar.onSubscribe(((C43368a) obj).f101209d);
            return false;
        } else {
            vVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m124421c(Object obj, C43107b bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        } else if (obj instanceof C43369b) {
            bVar.onError(((C43369b) obj).f101210d);
            return true;
        } else if (obj instanceof C43370c) {
            bVar.mo27070b(((C43370c) obj).f101211d);
            return false;
        } else {
            bVar.onNext(obj);
            return false;
        }
    }

    /* renamed from: e */
    public static Object m124422e() {
        return COMPLETE;
    }

    /* renamed from: f */
    public static Object m124423f(C41205b bVar) {
        return new C43368a(bVar);
    }

    /* renamed from: g */
    public static Object m124424g(Throwable th) {
        return new C43369b(th);
    }

    /* renamed from: h */
    public static Throwable m124425h(Object obj) {
        return ((C43369b) obj).f101210d;
    }

    /* renamed from: l */
    public static Object m124426l(Object obj) {
        return obj;
    }

    /* renamed from: n */
    public static boolean m124427n(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: o */
    public static boolean m124428o(Object obj) {
        return obj instanceof C43369b;
    }

    /* renamed from: q */
    public static Object m124429q(Object obj) {
        return obj;
    }

    /* renamed from: r */
    public static Object m124430r(C43108c cVar) {
        return new C43370c(cVar);
    }

    public String toString() {
        return "NotificationLite.Complete";
    }
}
