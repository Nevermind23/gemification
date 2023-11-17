package p004a3;

import com.apollographql.apollo.exception.ApolloException;
import java.util.concurrent.Executor;
import p243s2.C8103c;
import p243s2.C8115i;
import p308x2.C8950b;
import p320y2.C9035a;
import p320y2.C9041b;

/* renamed from: a3.a */
public final class C0025a implements C8950b {

    /* renamed from: a3.a$b */
    private static final class C0027b implements C9035a {

        /* renamed from: a */
        private C8115i f59a;

        /* renamed from: b */
        private C8115i f60b;

        /* renamed from: c */
        private C8115i f61c;

        /* renamed from: d */
        private C8115i f62d;

        /* renamed from: e */
        private boolean f63e;

        /* renamed from: f */
        private C9035a.C9036a f64f;

        /* renamed from: g */
        private volatile boolean f65g;

        /* renamed from: a3.a$b$a */
        class C0028a implements C9035a.C9036a {

            /* renamed from: a */
            final /* synthetic */ C9035a.C9036a f66a;

            C0028a(C9035a.C9036a aVar) {
                this.f66a = aVar;
            }

            /* renamed from: a */
            public void mo90a() {
            }

            /* renamed from: b */
            public void mo91b(C9035a.C9040d dVar) {
                C0027b.this.mo86d(dVar);
            }

            /* renamed from: c */
            public void mo92c(C9035a.C9037b bVar) {
                this.f66a.mo92c(bVar);
            }

            /* renamed from: d */
            public void mo93d(ApolloException apolloException) {
                C0027b.this.mo85c(apolloException);
            }
        }

        /* renamed from: a3.a$b$b */
        class C0029b implements C9035a.C9036a {

            /* renamed from: a */
            final /* synthetic */ C9035a.C9036a f68a;

            C0029b(C9035a.C9036a aVar) {
                this.f68a = aVar;
            }

            /* renamed from: a */
            public void mo90a() {
            }

            /* renamed from: b */
            public void mo91b(C9035a.C9040d dVar) {
                C0027b.this.mo89f(dVar);
            }

            /* renamed from: c */
            public void mo92c(C9035a.C9037b bVar) {
                this.f68a.mo92c(bVar);
            }

            /* renamed from: d */
            public void mo93d(ApolloException apolloException) {
                C0027b.this.mo88e(apolloException);
            }
        }

        private C0027b() {
            this.f59a = C8115i.m30668a();
            this.f60b = C8115i.m30668a();
            this.f61c = C8115i.m30668a();
            this.f62d = C8115i.m30668a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized void m137b() {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f65g     // Catch:{ all -> 0x0064 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r3)
                return
            L_0x0007:
                boolean r0 = r3.f63e     // Catch:{ all -> 0x0064 }
                if (r0 != 0) goto L_0x002e
                s2.i r0 = r3.f59a     // Catch:{ all -> 0x0064 }
                boolean r0 = r0.mo23280f()     // Catch:{ all -> 0x0064 }
                r1 = 1
                if (r0 == 0) goto L_0x0024
                y2.a$a r0 = r3.f64f     // Catch:{ all -> 0x0064 }
                s2.i r2 = r3.f59a     // Catch:{ all -> 0x0064 }
                java.lang.Object r2 = r2.mo23278e()     // Catch:{ all -> 0x0064 }
                y2.a$d r2 = (p320y2.C9035a.C9040d) r2     // Catch:{ all -> 0x0064 }
                r0.mo91b(r2)     // Catch:{ all -> 0x0064 }
                r3.f63e = r1     // Catch:{ all -> 0x0064 }
                goto L_0x002e
            L_0x0024:
                s2.i r0 = r3.f61c     // Catch:{ all -> 0x0064 }
                boolean r0 = r0.mo23280f()     // Catch:{ all -> 0x0064 }
                if (r0 == 0) goto L_0x002e
                r3.f63e = r1     // Catch:{ all -> 0x0064 }
            L_0x002e:
                boolean r0 = r3.f63e     // Catch:{ all -> 0x0064 }
                if (r0 == 0) goto L_0x0062
                s2.i r0 = r3.f60b     // Catch:{ all -> 0x0064 }
                boolean r0 = r0.mo23280f()     // Catch:{ all -> 0x0064 }
                if (r0 == 0) goto L_0x004d
                y2.a$a r0 = r3.f64f     // Catch:{ all -> 0x0064 }
                s2.i r1 = r3.f60b     // Catch:{ all -> 0x0064 }
                java.lang.Object r1 = r1.mo23278e()     // Catch:{ all -> 0x0064 }
                y2.a$d r1 = (p320y2.C9035a.C9040d) r1     // Catch:{ all -> 0x0064 }
                r0.mo91b(r1)     // Catch:{ all -> 0x0064 }
                y2.a$a r0 = r3.f64f     // Catch:{ all -> 0x0064 }
                r0.mo90a()     // Catch:{ all -> 0x0064 }
                goto L_0x0062
            L_0x004d:
                s2.i r0 = r3.f62d     // Catch:{ all -> 0x0064 }
                boolean r0 = r0.mo23280f()     // Catch:{ all -> 0x0064 }
                if (r0 == 0) goto L_0x0062
                y2.a$a r0 = r3.f64f     // Catch:{ all -> 0x0064 }
                s2.i r1 = r3.f62d     // Catch:{ all -> 0x0064 }
                java.lang.Object r1 = r1.mo23278e()     // Catch:{ all -> 0x0064 }
                com.apollographql.apollo.exception.ApolloException r1 = (com.apollographql.apollo.exception.ApolloException) r1     // Catch:{ all -> 0x0064 }
                r0.mo93d(r1)     // Catch:{ all -> 0x0064 }
            L_0x0062:
                monitor-exit(r3)
                return
            L_0x0064:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p004a3.C0025a.C0027b.m137b():void");
        }

        /* renamed from: a */
        public void mo84a(C9035a.C9038c cVar, C9041b bVar, Executor executor, C9035a.C9036a aVar) {
            if (!this.f65g) {
                this.f64f = aVar;
                bVar.mo7191a(cVar.mo24519b().mo24523d(true).mo24521b(), executor, new C0028a(aVar));
                bVar.mo7191a(cVar.mo24519b().mo24523d(false).mo24521b(), executor, new C0029b(aVar));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized void mo85c(ApolloException apolloException) {
            this.f61c = C8115i.m30670h(apolloException);
            m137b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized void mo86d(C9035a.C9040d dVar) {
            this.f59a = C8115i.m30670h(dVar);
            m137b();
        }

        public void dispose() {
            this.f65g = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public synchronized void mo88e(ApolloException apolloException) {
            this.f62d = C8115i.m30670h(apolloException);
            m137b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public synchronized void mo89f(C9035a.C9040d dVar) {
            this.f60b = C8115i.m30670h(dVar);
            m137b();
        }
    }

    /* renamed from: a */
    public C9035a mo83a(C8103c cVar) {
        return new C0027b();
    }
}
