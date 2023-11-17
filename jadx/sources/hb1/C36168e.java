package hb1;

import com.apollographql.apollo.exception.ApolloHttpException;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40755u;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hb1.e */
public abstract class C36168e {

    /* renamed from: hb1.e$a */
    public static final class C36169a extends C36168e implements C40755u {

        /* renamed from: a */
        private final C40734b f87355a;

        /* renamed from: b */
        private final C40749p f87356b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36169a(C40734b bVar, C40749p pVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "refreshTokenSource");
            C41536l.m120489i(pVar, "querySource");
            this.f87355a = bVar;
            this.f87356b = pVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C40749p m107574c(C36169a aVar, Throwable th) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(th, "error");
            if (!(th instanceof ApolloHttpException) || ((ApolloHttpException) th).mo7647a() != 401) {
                return C40749p.m118028K(th);
            }
            return aVar.f87355a.mo94897f(aVar.f87356b);
        }

        /* renamed from: a */
        public C40754t mo88924a(C40749p pVar) {
            C41536l.m120489i(pVar, "upstream");
            C40749p s0 = pVar.mo95033s0(new C36167d(this));
            C41536l.m120488h(s0, "upstream.onErrorResumeNe…         }\n            })");
            return s0;
        }
    }

    private C36168e() {
    }

    public /* synthetic */ C36168e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
