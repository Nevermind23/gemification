package p282v2;

import com.apollographql.apollo.exception.ApolloException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v2.b */
public abstract class C8689b {

    /* renamed from: d */
    public static final C8690a f24513d = new C8690a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final AtomicReference f24514a = new AtomicReference();

    /* renamed from: b */
    private final AtomicBoolean f24515b = new AtomicBoolean();

    /* renamed from: c */
    private final Executor f24516c;

    /* renamed from: v2.b$a */
    public static final class C8690a {

        /* renamed from: v2.b$a$a */
        static final class C8691a implements Executor {

            /* renamed from: d */
            public static final C8691a f24517d = new C8691a();

            C8691a() {
            }

            public final void execute(Runnable runnable) {
            }
        }

        /* renamed from: v2.b$a$b */
        public static final class C8692b extends C8689b {

            /* renamed from: e */
            final /* synthetic */ C8690a f24518e;

            /* renamed from: f */
            final /* synthetic */ Object f24519f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8692b(C8690a aVar, Object obj, Executor executor) {
                super(executor);
                this.f24518e = aVar;
                this.f24519f = obj;
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public Object mo24073d() {
                return this.f24519f;
            }
        }

        private C8690a() {
        }

        public /* synthetic */ C8690a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Executor mo24074a() {
            return C8691a.f24517d;
        }

        /* renamed from: b */
        public final C8689b mo24075b(Object obj) {
            return new C8692b(this, obj, mo24074a());
        }
    }

    protected C8689b(Executor executor) {
        C41536l.m120490j(executor, "dispatcher");
        this.f24516c = executor;
    }

    /* renamed from: a */
    private final void m32422a() {
        if (!this.f24515b.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    /* renamed from: b */
    public static final C8689b m32423b(Object obj) {
        return f24513d.mo24075b(obj);
    }

    /* renamed from: c */
    public final Object mo24072c() {
        m32422a();
        try {
            return mo24073d();
        } catch (Exception e) {
            throw new ApolloException("Failed to perform store operation", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Object mo24073d();
}
