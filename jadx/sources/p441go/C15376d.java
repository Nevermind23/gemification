package p441go;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p483jo.C16301a;

/* renamed from: go.d */
public final class C15376d {

    /* renamed from: b */
    public static final C15377a f43772b = new C15377a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C16301a f43773a;

    /* renamed from: go.d$a */
    public static final class C15377a {

        /* renamed from: go.d$a$a */
        public enum C15378a {
            RB,
            SOLO,
            BECOME_SOLO
        }

        private C15377a() {
        }

        public /* synthetic */ C15377a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C15376d(C16301a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f43773a = aVar;
    }

    /* renamed from: a */
    public final C40762x mo42480a(C15377a.C15378a aVar) {
        C41536l.m120489i(aVar, "benefitType");
        return this.f43773a.mo32970s2(aVar);
    }
}
