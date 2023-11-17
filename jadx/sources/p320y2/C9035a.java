package p320y2;

import com.apollographql.apollo.exception.ApolloException;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.Executor;
import of1.C41880d0;
import p088g3.C6204a;
import p217q2.C7836g;
import p217q2.C7843j;
import p243s2.C8115i;
import p243s2.C8140s;
import p269u2.C8550a;

/* renamed from: y2.a */
public interface C9035a {

    /* renamed from: y2.a$a */
    public interface C9036a {
        /* renamed from: a */
        void mo90a();

        /* renamed from: b */
        void mo91b(C9040d dVar);

        /* renamed from: c */
        void mo92c(C9037b bVar);

        /* renamed from: d */
        void mo93d(ApolloException apolloException);
    }

    /* renamed from: y2.a$b */
    public enum C9037b {
        CACHE,
        NETWORK
    }

    /* renamed from: y2.a$c */
    public static final class C9038c {

        /* renamed from: a */
        public final UUID f25168a = UUID.randomUUID();

        /* renamed from: b */
        public final C7836g f25169b;

        /* renamed from: c */
        public final C8550a f25170c;

        /* renamed from: d */
        public final C6204a f25171d;

        /* renamed from: e */
        public final boolean f25172e;

        /* renamed from: f */
        public final C8115i f25173f;

        /* renamed from: g */
        public final boolean f25174g;

        /* renamed from: h */
        public final boolean f25175h;

        /* renamed from: i */
        public final boolean f25176i;

        /* renamed from: y2.a$c$a */
        public static final class C9039a {

            /* renamed from: a */
            private final C7836g f25177a;

            /* renamed from: b */
            private C8550a f25178b = C8550a.f24290b;

            /* renamed from: c */
            private C6204a f25179c = C6204a.f19214b;

            /* renamed from: d */
            private boolean f25180d;

            /* renamed from: e */
            private C8115i f25181e = C8115i.m30668a();

            /* renamed from: f */
            private boolean f25182f = true;

            /* renamed from: g */
            private boolean f25183g;

            /* renamed from: h */
            private boolean f25184h;

            C9039a(C7836g gVar) {
                this.f25177a = (C7836g) C8140s.m30754b(gVar, "operation == null");
            }

            /* renamed from: a */
            public C9039a mo24520a(boolean z) {
                this.f25184h = z;
                return this;
            }

            /* renamed from: b */
            public C9038c mo24521b() {
                return new C9038c(this.f25177a, this.f25178b, this.f25179c, this.f25181e, this.f25180d, this.f25182f, this.f25183g, this.f25184h);
            }

            /* renamed from: c */
            public C9039a mo24522c(C8550a aVar) {
                this.f25178b = (C8550a) C8140s.m30754b(aVar, "cacheHeaders == null");
                return this;
            }

            /* renamed from: d */
            public C9039a mo24523d(boolean z) {
                this.f25180d = z;
                return this;
            }

            /* renamed from: e */
            public C9039a mo24524e(C7836g.C7838b bVar) {
                this.f25181e = C8115i.m30669d(bVar);
                return this;
            }

            /* renamed from: f */
            public C9039a mo24525f(C8115i iVar) {
                this.f25181e = (C8115i) C8140s.m30754b(iVar, "optimisticUpdates == null");
                return this;
            }

            /* renamed from: g */
            public C9039a mo24526g(C6204a aVar) {
                this.f25179c = (C6204a) C8140s.m30754b(aVar, "requestHeaders == null");
                return this;
            }

            /* renamed from: h */
            public C9039a mo24527h(boolean z) {
                this.f25182f = z;
                return this;
            }

            /* renamed from: i */
            public C9039a mo24528i(boolean z) {
                this.f25183g = z;
                return this;
            }
        }

        C9038c(C7836g gVar, C8550a aVar, C6204a aVar2, C8115i iVar, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f25169b = gVar;
            this.f25170c = aVar;
            this.f25171d = aVar2;
            this.f25173f = iVar;
            this.f25172e = z;
            this.f25174g = z2;
            this.f25175h = z3;
            this.f25176i = z4;
        }

        /* renamed from: a */
        public static C9039a m33459a(C7836g gVar) {
            return new C9039a(gVar);
        }

        /* renamed from: b */
        public C9039a mo24519b() {
            return new C9039a(this.f25169b).mo24522c(this.f25170c).mo24526g(this.f25171d).mo24523d(this.f25172e).mo24524e((C7836g.C7838b) this.f25173f.mo23283i()).mo24527h(this.f25174g).mo24528i(this.f25175h).mo24520a(this.f25176i);
        }
    }

    /* renamed from: y2.a$d */
    public static final class C9040d {

        /* renamed from: a */
        public final C8115i f25185a;

        /* renamed from: b */
        public final C8115i f25186b;

        /* renamed from: c */
        public final C8115i f25187c;

        public C9040d(C41880d0 d0Var) {
            this(d0Var, (C7843j) null, (Collection) null);
        }

        public C9040d(C41880d0 d0Var, C7843j jVar, Collection collection) {
            this.f25185a = C8115i.m30669d(d0Var);
            this.f25186b = C8115i.m30669d(jVar);
            this.f25187c = C8115i.m30669d(collection);
        }
    }

    /* renamed from: a */
    void mo84a(C9038c cVar, C9041b bVar, Executor executor, C9036a aVar);

    void dispose();
}
