package xs0;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m70.C26156i;
import p843nw.C26633o;
import p863pw.C27637o;
import ts0.C38793a;
import ue1.C43080q;
import ys0.C40059c;

/* renamed from: xs0.e0 */
public final class C39852e0 {

    /* renamed from: e */
    public static final C39853a f94593e = new C39853a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C39860h f94594a;

    /* renamed from: b */
    private final C39889y f94595b;

    /* renamed from: c */
    private final C26633o f94596c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C38793a f94597d;

    /* renamed from: xs0.e0$a */
    public static final class C39853a {
        private C39853a() {
        }

        public /* synthetic */ C39853a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: xs0.e0$b */
    static final class C39854b extends C41537m implements C43080q {

        /* renamed from: d */
        final /* synthetic */ C39852e0 f94598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39854b(C39852e0 e0Var) {
            super(3);
            this.f94598d = e0Var;
        }

        /* renamed from: a */
        public final C40059c invoke(List list, List list2, C27637o oVar) {
            C41536l.m120489i(list, "accounts");
            C41536l.m120489i(list2, "tariffs");
            C41536l.m120489i(oVar, "cards");
            return new C40059c(C38793a.m113555k(this.f94598d.f94597d, list, oVar, (C26156i) null, (String) null, 12, (Object) null), list2);
        }
    }

    public C39852e0(C39860h hVar, C39889y yVar, C26633o oVar, C38793a aVar) {
        C41536l.m120489i(hVar, "getAccounts");
        C41536l.m120489i(yVar, "getTariffs");
        C41536l.m120489i(oVar, "getCardsAndDetails");
        C41536l.m120489i(aVar, "casMapper");
        this.f94594a = hVar;
        this.f94595b = yVar;
        this.f94596c = oVar;
        this.f94597d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40059c m115621d(C43080q qVar, Object obj, Object obj2, Object obj3) {
        C41536l.m120489i(qVar, "$tmp0");
        return (C40059c) qVar.invoke(obj, obj2, obj3);
    }

    /* renamed from: c */
    public final C40762x mo93561c() {
        C40762x S = C40762x.m118153S(this.f94594a.mo93566a(), this.f94595b.mo93588a("CAS"), C26633o.m83102d(this.f94596c, false, 1, (Object) null).mo94996P(), new C39850d0(new C39854b(this)));
        C41536l.m120488h(S, "operator fun invoke(): S…s\n            )\n        }");
        return S;
    }
}
