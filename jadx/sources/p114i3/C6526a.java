package p114i3;

import com.apollographql.apollo.exception.ApolloException;
import ed1.C40749p;
import ed1.C40751q;
import ed1.C40752r;
import hd1.C41205b;
import id1.C41300a;
import p075f3.C6152a;
import p204p2.C7664a;
import p217q2.C7843j;
import p243s2.C8140s;

/* renamed from: i3.a */
public abstract class C6526a {

    /* renamed from: i3.a$a */
    class C6527a implements C40752r {

        /* renamed from: a */
        final /* synthetic */ C7664a f19957a;

        /* renamed from: i3.a$a$a */
        class C6528a extends C7664a.C7665a {

            /* renamed from: a */
            final /* synthetic */ C40751q f19958a;

            C6528a(C40751q qVar) {
                this.f19958a = qVar;
            }

            /* renamed from: b */
            public void mo20503b(ApolloException apolloException) {
                C41300a.m119661b(apolloException);
                if (!this.f19958a.isDisposed()) {
                    this.f19958a.onError(apolloException);
                }
            }

            /* renamed from: f */
            public void mo20504f(C7843j jVar) {
                if (!this.f19958a.isDisposed()) {
                    this.f19958a.onNext(jVar);
                }
            }

            /* renamed from: g */
            public void mo20505g(C7664a.C7666b bVar) {
                if (bVar == C7664a.C7666b.COMPLETED && !this.f19958a.isDisposed()) {
                    this.f19958a.onComplete();
                }
            }
        }

        C6527a(C7664a aVar) {
            this.f19957a = aVar;
        }

        /* renamed from: a */
        public void mo20502a(C40751q qVar) {
            C6526a.m25795b(qVar, this.f19957a);
            this.f19957a.mo22367b(new C6528a(qVar));
        }
    }

    /* renamed from: i3.a$b */
    class C6529b implements C41205b {

        /* renamed from: d */
        final /* synthetic */ C6152a f19960d;

        C6529b(C6152a aVar) {
            this.f19960d = aVar;
        }

        public void dispose() {
            this.f19960d.cancel();
        }

        public boolean isDisposed() {
            return this.f19960d.mo19730x();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m25795b(C40751q qVar, C6152a aVar) {
        qVar.mo95047a(m25797d(aVar));
    }

    /* renamed from: c */
    public static C40749p m25796c(C7664a aVar) {
        C8140s.m30754b(aVar, "call == null");
        return C40749p.m118054r(new C6527a(aVar));
    }

    /* renamed from: d */
    private static C41205b m25797d(C6152a aVar) {
        return new C6529b(aVar);
    }
}
