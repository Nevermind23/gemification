package zh1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import of1.C41869b0;
import zh1.C43444c;

/* renamed from: zh1.i */
final class C43457i extends C43444c.C43445a {

    /* renamed from: a */
    private final Executor f101317a;

    /* renamed from: zh1.i$a */
    class C43458a implements C43444c {

        /* renamed from: a */
        final /* synthetic */ Type f101318a;

        /* renamed from: b */
        final /* synthetic */ Executor f101319b;

        C43458a(Type type, Executor executor) {
            this.f101318a = type;
            this.f101319b = executor;
        }

        /* renamed from: a */
        public Type mo92683a() {
            return this.f101318a;
        }

        /* renamed from: c */
        public C43443b mo92684b(C43443b bVar) {
            Executor executor = this.f101319b;
            return executor == null ? bVar : new C43459b(executor, bVar);
        }
    }

    /* renamed from: zh1.i$b */
    static final class C43459b implements C43443b {

        /* renamed from: d */
        final Executor f101321d;

        /* renamed from: e */
        final C43443b f101322e;

        /* renamed from: zh1.i$b$a */
        class C43460a implements C43446d {

            /* renamed from: d */
            final /* synthetic */ C43446d f101323d;

            C43460a(C43446d dVar) {
                this.f101323d = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m124669c(C43446d dVar, Throwable th) {
                dVar.onFailure(C43459b.this, th);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m124670d(C43446d dVar, C43510v vVar) {
                if (C43459b.this.f101322e.mo102161x()) {
                    dVar.onFailure(C43459b.this, new IOException("Canceled"));
                } else {
                    dVar.onResponse(C43459b.this, vVar);
                }
            }

            public void onFailure(C43443b bVar, Throwable th) {
                C43459b.this.f101321d.execute(new C43462k(this, this.f101323d, th));
            }

            public void onResponse(C43443b bVar, C43510v vVar) {
                C43459b.this.f101321d.execute(new C43461j(this, this.f101323d, vVar));
            }
        }

        C43459b(Executor executor, C43443b bVar) {
            this.f101321d = executor;
            this.f101322e = bVar;
        }

        public void cancel() {
            this.f101322e.cancel();
        }

        /* renamed from: f1 */
        public C43443b clone() {
            return new C43459b(this.f101321d, this.f101322e.mo102157f1());
        }

        /* renamed from: i */
        public void mo102158i(C43446d dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f101322e.mo102158i(new C43460a(dVar));
        }

        /* renamed from: v */
        public C43510v mo102159v() {
            return this.f101322e.mo102159v();
        }

        /* renamed from: w */
        public C41869b0 mo102160w() {
            return this.f101322e.mo102160w();
        }

        /* renamed from: x */
        public boolean mo102161x() {
            return this.f101322e.mo102161x();
        }
    }

    C43457i(Executor executor) {
        this.f101317a = executor;
    }

    /* renamed from: a */
    public C43444c mo92682a(Type type, Annotation[] annotationArr, C43511w wVar) {
        Executor executor = null;
        if (C43444c.C43445a.m124641c(type) != C43443b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g = C43439a0.m124619g(0, (ParameterizedType) type);
            if (!C43439a0.m124624l(annotationArr, C43515y.class)) {
                executor = this.f101317a;
            }
            return new C43458a(g, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
