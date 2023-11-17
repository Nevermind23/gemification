package we0;

import gf0.C24711a;
import j51.C36735g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;

/* renamed from: we0.n0 */
public final class C29351n0 implements C29348m0 {

    /* renamed from: c */
    public static final C29352a f74433c = new C29352a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C36735g f74434a;

    /* renamed from: b */
    private final C24711a f74435b;

    /* renamed from: we0.n0$a */
    public static final class C29352a {
        private C29352a() {
        }

        public /* synthetic */ C29352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C29351n0(C36735g gVar, C24711a aVar) {
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(aVar, "gtPreferencesManager");
        this.f74434a = gVar;
        this.f74435b = aVar;
    }

    /* renamed from: a */
    private final boolean m89429a(long j) {
        return System.currentTimeMillis() - this.f74435b.mo63112b(j) >= 259200000;
    }

    public boolean invoke() {
        C37228a a = this.f74434a.mo89562a();
        return a != null && m89429a(a.mo90305b());
    }
}
