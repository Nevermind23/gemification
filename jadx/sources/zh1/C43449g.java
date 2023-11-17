package zh1;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.HttpException;
import zh1.C43444c;

/* renamed from: zh1.g */
final class C43449g extends C43444c.C43445a {

    /* renamed from: a */
    static final C43444c.C43445a f101309a = new C43449g();

    /* renamed from: zh1.g$a */
    private static final class C43450a implements C43444c {

        /* renamed from: a */
        private final Type f101310a;

        /* renamed from: zh1.g$a$a */
        private class C43451a implements C43446d {

            /* renamed from: d */
            private final CompletableFuture f101311d;

            public C43451a(CompletableFuture completableFuture) {
                this.f101311d = completableFuture;
            }

            public void onFailure(C43443b bVar, Throwable th) {
                boolean unused = this.f101311d.completeExceptionally(th);
            }

            public void onResponse(C43443b bVar, C43510v vVar) {
                if (vVar.mo102216d()) {
                    boolean unused = this.f101311d.complete(vVar.mo102214a());
                } else {
                    boolean unused2 = this.f101311d.completeExceptionally(new HttpException(vVar));
                }
            }
        }

        C43450a(Type type) {
            this.f101310a = type;
        }

        /* renamed from: a */
        public Type mo92683a() {
            return this.f101310a;
        }

        /* renamed from: c */
        public CompletableFuture mo92684b(C43443b bVar) {
            C43452b bVar2 = new C43452b(bVar);
            bVar.mo102158i(new C43451a(bVar2));
            return bVar2;
        }
    }

    /* renamed from: zh1.g$b */
    private static final class C43452b extends CompletableFuture {

        /* renamed from: d */
        private final C43443b f101313d;

        C43452b(C43443b bVar) {
            this.f101313d = bVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.f101313d.cancel();
            }
            return super.cancel(z);
        }
    }

    /* renamed from: zh1.g$c */
    private static final class C43453c implements C43444c {

        /* renamed from: a */
        private final Type f101314a;

        /* renamed from: zh1.g$c$a */
        private class C43454a implements C43446d {

            /* renamed from: d */
            private final CompletableFuture f101315d;

            public C43454a(CompletableFuture completableFuture) {
                this.f101315d = completableFuture;
            }

            public void onFailure(C43443b bVar, Throwable th) {
                boolean unused = this.f101315d.completeExceptionally(th);
            }

            public void onResponse(C43443b bVar, C43510v vVar) {
                boolean unused = this.f101315d.complete(vVar);
            }
        }

        C43453c(Type type) {
            this.f101314a = type;
        }

        /* renamed from: a */
        public Type mo92683a() {
            return this.f101314a;
        }

        /* renamed from: c */
        public CompletableFuture mo92684b(C43443b bVar) {
            C43452b bVar2 = new C43452b(bVar);
            bVar.mo102158i(new C43454a(bVar2));
            return bVar2;
        }
    }

    C43449g() {
    }

    /* renamed from: a */
    public C43444c mo92682a(Type type, Annotation[] annotationArr, C43511w wVar) {
        if (C43444c.C43445a.m124641c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = C43444c.C43445a.m124640b(0, (ParameterizedType) type);
            if (C43444c.C43445a.m124641c(b) != C43510v.class) {
                return new C43450a(b);
            }
            if (b instanceof ParameterizedType) {
                return new C43453c(C43444c.C43445a.m124640b(0, (ParameterizedType) b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
