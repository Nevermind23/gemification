package p707as;

import ed1.C40734b;
import ed1.C40762x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import ue1.C43075l;

/* renamed from: as.c */
public abstract class C19273c {

    /* renamed from: as.c$a */
    static final class C19274a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19274a f53483d = new C19274a();

        C19274a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo47496a(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "it");
            C19273c.m64719e(bankApiResponse);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47496a((BankApiResponse) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: as.c$b */
    static final class C19275b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19275b f53484d = new C19275b();

        C19275b() {
            super(1);
        }

        /* renamed from: a */
        public final Object invoke(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "it");
            return C19273c.m64723i(bankApiResponse);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m64719e(BankApiResponse bankApiResponse) {
        if (!bankApiResponse.isSuccess()) {
            throw new ApiError(bankApiResponse);
        }
    }

    /* renamed from: f */
    public static final C40734b m64720f(C40762x xVar) {
        C41536l.m120489i(xVar, "<this>");
        C40734b y = xVar.mo95062A(new C19271a(C19274a.f53483d)).mo95092y();
        C41536l.m120488h(y, "map { it.checkError() }.ignoreElement()");
        return y;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C41238w m64721g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41238w) lVar.invoke(obj);
    }

    /* renamed from: h */
    public static final C40762x m64722h(C40762x xVar) {
        C41536l.m120489i(xVar, "<this>");
        C40762x A = xVar.mo95062A(new C19272b(C19275b.f53484d));
        C41536l.m120488h(A, "map { it.toResult() }");
        return A;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final Object m64723i(BankApiResponse bankApiResponse) {
        m64719e(bankApiResponse);
        Object result = bankApiResponse.getResult();
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("BankApiResponse.result shouldn't be null".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final Object m64724j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return lVar.invoke(obj);
    }
}
