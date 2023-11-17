package me0;

import ed1.C40734b;
import ed1.C40762x;
import je0.C25429w0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.mail.model.AddEmailResponseApiModel;
import ue1.C43075l;
import ze0.C30290a;

/* renamed from: me0.b */
public final class C26196b implements C30290a {

    /* renamed from: b */
    public static final C26197a f66401b = new C26197a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C25429w0 f66402a;

    /* renamed from: me0.b$a */
    public static final class C26197a {
        private C26197a() {
        }

        public /* synthetic */ C26197a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: me0.b$b */
    static final class C26198b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26198b f66403d = new C26198b();

        C26198b() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(AddEmailResponseApiModel addEmailResponseApiModel) {
            C41536l.m120489i(addEmailResponseApiModel, "it");
            return addEmailResponseApiModel.getRequestId();
        }
    }

    public C26196b(C25429w0 w0Var) {
        C41536l.m120489i(w0Var, "service");
        this.f66402a = w0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final String m82001c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (String) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo65227a(String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "email");
        C41536l.m120489i(str2, "oneTimePassword");
        C41536l.m120489i(str3, "otpRequestId");
        return this.f66402a.mo64010w1(str, str2, "GENERAL_BOG", str3, str4, str5, str6);
    }

    /* renamed from: t1 */
    public C40762x mo65228t1(String str) {
        C41536l.m120489i(str, "email");
        C40762x A = this.f66402a.mo64004t1(C40440x.m117146P0(str).toString()).mo95062A(new C26195a(C26198b.f66403d));
        C41536l.m120488h(A, "service\n            .get…t.requestId\n            }");
        return A;
    }
}
