package p808kr;

import ed1.C40735b0;
import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p828mr.C26259c;
import p828mr.C26260d;
import p838nr.C26573a;
import ue1.C43075l;

/* renamed from: kr.e */
public final class C25756e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C26573a f65546a;

    /* renamed from: kr.e$a */
    static final class C25757a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25756e f65547d;

        /* renamed from: kr.e$a$a */
        static final class C25758a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26259c f65548d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25758a(C26259c cVar) {
                super(1);
                this.f65548d = cVar;
            }

            /* renamed from: a */
            public final C26260d invoke(List list) {
                C41536l.m120489i(list, "cards");
                C26259c cVar = this.f65548d;
                C41536l.m120488h(cVar, "dec");
                return new C26260d(cVar, list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25757a(C25756e eVar) {
            super(1);
            this.f65547d = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C26260d m81014c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C26260d) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40735b0 invoke(C26259c cVar) {
            C41536l.m120489i(cVar, "dec");
            C26573a c = this.f65547d.f65546a;
            String str = cVar.mo65371a().loanCcy;
            C41536l.m120488h(str, "dec.details.loanCcy");
            return c.mo63768c(str).mo95062A(new C25755d(new C25758a(cVar)));
        }
    }

    /* renamed from: kr.e$b */
    static final class C25759b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C25759b f65549d = new C25759b();

        C25759b() {
            super(1);
        }

        /* renamed from: a */
        public final C26260d invoke(C26260d dVar) {
            C41536l.m120489i(dVar, "it");
            if (dVar.mo65383b().mo65377f() != -110) {
                return dVar;
            }
            throw new ApiError(new BankApiResponse((Object) null, "-110", (String) null, (String) null, (String) null, (String) null, (BankApiResponse.C34679b) null, 125, (DefaultConstructorMarker) null));
        }
    }

    public C25756e(C26573a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f65546a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40735b0 m81010e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C26260d m81011f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26260d) lVar.invoke(obj);
    }

    /* renamed from: d */
    public final C40762x mo64339d(String str, String str2) {
        C41536l.m120489i(str, "offerNo");
        C41536l.m120489i(str2, "operationType");
        C40762x A = this.f65546a.mo63767b(str, str2).mo95087r(new C25753b(new C25757a(this))).mo95062A(new C25754c(C25759b.f65549d));
        C41536l.m120488h(A, "operator fun invoke(offe…t\n            }\n        }");
        return A;
    }
}
