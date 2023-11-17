package p341ge.bog.mobilebank.cleanarch.presentation.common;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.d */
public abstract class C21503d {

    /* renamed from: a */
    private final Object f57489a;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.d$a */
    public static final class C21504a extends C21503d {

        /* renamed from: b */
        private final Throwable f57490b;

        public C21504a(Throwable th, Object obj) {
            super(obj, (DefaultConstructorMarker) null);
            this.f57490b = th;
        }

        /* renamed from: e */
        public final String mo53705e() {
            Throwable th = this.f57490b;
            if (th instanceof ApiError) {
                return ((ApiError) th).mo84685a().getKey();
            }
            return null;
        }

        /* renamed from: f */
        public final Throwable mo53706f() {
            return this.f57490b;
        }

        /* renamed from: g */
        public final boolean mo53707g() {
            return this.f57490b instanceof ApiError;
        }

        /* renamed from: h */
        public final boolean mo53708h() {
            BankApiResponse a;
            Throwable th = this.f57490b;
            ApiError apiError = th instanceof ApiError ? (ApiError) th : null;
            if (apiError == null || (a = apiError.mo84685a()) == null) {
                return false;
            }
            return a.isScaError();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C21504a(Throwable th, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.d$b */
    public static final class C21505b extends C21503d {
        public C21505b(Object obj) {
            super(obj, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C21505b(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.d$c */
    public static final class C21506c extends C21503d {
        public C21506c(Object obj) {
            super(obj, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C21503d(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    /* renamed from: a */
    public final Object mo53701a() {
        return this.f57489a;
    }

    /* renamed from: b */
    public final boolean mo53702b() {
        return this instanceof C21504a;
    }

    /* renamed from: c */
    public final boolean mo53703c() {
        return this instanceof C21505b;
    }

    /* renamed from: d */
    public final boolean mo53704d() {
        return this instanceof C21506c;
    }

    private C21503d(Object obj) {
        this.f57489a = obj;
    }
}
