package sr0;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rr0.C38333a;

/* renamed from: sr0.h */
public final class C38523h {

    /* renamed from: b */
    public static final C38524a f92343b = new C38524a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C38333a f92344a;

    /* renamed from: sr0.h$a */
    public static final class C38524a {
        private C38524a() {
        }

        public /* synthetic */ C38524a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C38523h(C38333a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f92344a = aVar;
    }

    /* renamed from: a */
    public final C40734b mo92091a(long j, String str, String str2, String str3) {
        C41536l.m120489i(str, "loanName");
        C41536l.m120489i(str2, "customerId");
        C41536l.m120489i(str3, "type");
        if (C41536l.m120484d(str3, "PLN")) {
            return this.f92344a.mo90957d(j, str, str2);
        }
        return this.f92344a.mo90958e(j, str, str2);
    }
}
