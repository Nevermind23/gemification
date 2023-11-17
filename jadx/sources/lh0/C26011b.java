package lh0;

import ed1.C40762x;
import hh0.C25024p;
import ih0.C25213f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared2.environment.EnvironmentType;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import ue1.C43075l;

/* renamed from: lh0.b */
public final class C26011b {

    /* renamed from: c */
    public static final C26012a f66082c = new C26012a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C25024p f66083a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final TargetEnvironment f66084b;

    /* renamed from: lh0.b$a */
    public static final class C26012a {
        private C26012a() {
        }

        public /* synthetic */ C26012a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lh0.b$b */
    static final class C26013b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26011b f66085d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26013b(C26011b bVar) {
            super(1);
            this.f66085d = bVar;
        }

        /* renamed from: a */
        public final String invoke(C25213f fVar) {
            String str;
            C41536l.m120489i(fVar, "it");
            if (this.f66085d.f66084b.getType() == EnvironmentType.PRODUCTION) {
                str = "https://gamification.bog.ge/auth/withdeeplinks/";
            } else {
                str = "https://gamification-test.bog.ge/auth/withdeeplinks/";
            }
            String a = fVar.mo63736a();
            return str + a;
        }
    }

    public C26011b(C25024p pVar, TargetEnvironment targetEnvironment) {
        C41536l.m120489i(pVar, "updateGamificationToken");
        C41536l.m120489i(targetEnvironment, "environment");
        this.f66083a = pVar;
        this.f66084b = targetEnvironment;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m81630d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (String) lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo64899c(String str) {
        C40762x xVar;
        if (str != null) {
            xVar = C40762x.m118162z(new C25213f(str));
        } else {
            xVar = this.f66083a.mo63424d();
        }
        C40762x A = xVar.mo95062A(new C26010a(new C26013b(this)));
        C41536l.m120488h(A, "operator fun invoke(toke…tionToken}\"\n            }");
        return A;
    }
}
