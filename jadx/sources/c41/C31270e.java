package c41;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import hd1.C41205b;
import he1.C41238w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md0.C26191f;
import ue1.C43075l;

/* renamed from: c41.e */
public abstract class C31270e {

    /* renamed from: c41.e$a */
    static final class C31271a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1644x f77643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31271a(C1644x xVar) {
            super(1);
            this.f77643d = xVar;
        }

        /* renamed from: a */
        public final void mo71521a(C31128a aVar) {
            this.f77643d.mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71521a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c41.e$b */
    static final class C31272b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f77644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31272b(int i) {
            super(1);
            this.f77644d = i;
        }

        /* renamed from: a */
        public final C31128a invoke(Object obj) {
            C41536l.m120489i(obj, "it");
            return new C31128a.C31131c(obj, this.f77644d);
        }
    }

    /* renamed from: c41.e$c */
    static final class C31273c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f77645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31273c(int i) {
            super(1);
            this.f77645d = i;
        }

        /* renamed from: a */
        public final C31128a invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return new C31128a.C31129a(th, this.f77645d, (Object) null, 4, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: c41.e$d */
    static final class C31274d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f77646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31274d(int i) {
            super(1);
            this.f77646d = i;
        }

        /* renamed from: a */
        public final C31128a invoke(C26191f fVar) {
            C41536l.m120489i(fVar, "it");
            if (fVar instanceof C26191f.C26192a) {
                return new C31128a.C31129a(((C26191f.C26192a) fVar).mo65219a(), this.f77646d, (Object) null, 4, (DefaultConstructorMarker) null);
            }
            if (fVar instanceof C26191f.C26194c) {
                return new C31128a.C31131c(((C26191f.C26194c) fVar).mo65223a(), this.f77646d);
            }
            if (fVar instanceof C26191f.C26193b) {
                return new C31128a.C31130b(this.f77646d, (Object) null, 2, (DefaultConstructorMarker) null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: e */
    public static final C41205b m92876e(C40749p pVar, C1644x xVar) {
        C41536l.m120489i(pVar, "<this>");
        C41536l.m120489i(xVar, "liveData");
        C41205b F0 = pVar.mo94981F0(new C31267b(new C31271a(xVar)));
        C41536l.m120488h(F0, "liveData: MutableLiveDat…eData.postValue(it)\n    }");
        return F0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m92877f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: g */
    public static final C40749p m92878g(C40734b bVar, int i) {
        C41536l.m120489i(bVar, "<this>");
        C40749p f = bVar.mo94897f(C40749p.m118043h0(C41238w.f97225a));
        C41536l.m120488h(f, "andThen(Observable.just(Unit))");
        return m92879h(f, i);
    }

    /* renamed from: h */
    public static final C40749p m92879h(C40749p pVar, int i) {
        C41536l.m120489i(pVar, "<this>");
        C40749p D0 = pVar.mo95026k0(new C31268c(new C31272b(i))).mo95035t0(new C31269d(new C31273c(i))).mo94977D0(new C31128a.C31130b(i, (Object) null, 2, (DefaultConstructorMarker) null));
        C41536l.m120488h(D0, "requestCode: Int): Obser…ult.Loading(requestCode))");
        return D0;
    }

    /* renamed from: i */
    public static final C40749p m92880i(C40762x xVar, int i) {
        C41536l.m120489i(xVar, "<this>");
        C40749p O = xVar.mo95075O();
        C41536l.m120488h(O, "toObservable()");
        return m92879h(O, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C31128a m92881j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31128a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C31128a m92882k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31128a) lVar.invoke(obj);
    }

    /* renamed from: l */
    public static final C40749p m92883l(C40749p pVar, int i) {
        C41536l.m120489i(pVar, "<this>");
        C40749p k0 = pVar.mo95026k0(new C31266a(new C31274d(i)));
        C41536l.m120488h(k0, "requestCode: Int): Obser…uestCode)\n        }\n    }");
        return k0;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C31128a m92884m(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31128a) lVar.invoke(obj);
    }
}
