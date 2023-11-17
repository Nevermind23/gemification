package bf1;

import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: bf1.m */
abstract class C40349m extends C40348l {

    /* renamed from: bf1.m$a */
    public static final class C40350a implements C40342g {

        /* renamed from: a */
        final /* synthetic */ Iterator f95845a;

        public C40350a(Iterator it) {
            this.f95845a = it;
        }

        public Iterator iterator() {
            return this.f95845a;
        }
    }

    /* renamed from: bf1.m$b */
    static final class C40351b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43064a f95846d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40351b(C43064a aVar) {
            super(1);
            this.f95846d = aVar;
        }

        public final Object invoke(Object obj) {
            C41536l.m120489i(obj, "it");
            return this.f95846d.invoke();
        }
    }

    /* renamed from: bf1.m$c */
    static final class C40352c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Object f95847d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40352c(Object obj) {
            super(0);
            this.f95847d = obj;
        }

        public final Object invoke() {
            return this.f95847d;
        }
    }

    /* renamed from: c */
    public static C40342g m116842c(Iterator it) {
        C41536l.m120489i(it, "<this>");
        return m116843d(new C40350a(it));
    }

    /* renamed from: d */
    public static final C40342g m116843d(C40342g gVar) {
        C41536l.m120489i(gVar, "<this>");
        if (gVar instanceof C40333a) {
            return gVar;
        }
        return new C40333a(gVar);
    }

    /* renamed from: e */
    public static final C40342g m116844e() {
        return C40337d.f95827a;
    }

    /* renamed from: f */
    public static C40342g m116845f(Object obj, C43075l lVar) {
        C41536l.m120489i(lVar, "nextFunction");
        if (obj == null) {
            return C40337d.f95827a;
        }
        return new C40340f(new C40352c(obj), lVar);
    }

    /* renamed from: g */
    public static C40342g m116846g(C43064a aVar) {
        C41536l.m120489i(aVar, "nextFunction");
        return m116843d(new C40340f(aVar, new C40351b(aVar)));
    }

    /* renamed from: h */
    public static C40342g m116847h(C43064a aVar, C43075l lVar) {
        C41536l.m120489i(aVar, "seedFunction");
        C41536l.m120489i(lVar, "nextFunction");
        return new C40340f(aVar, lVar);
    }
}
