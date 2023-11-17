package cd0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p748eu.C20292b;
import p758fu.C20557a;

/* renamed from: cd0.b */
public final class C19725b {

    /* renamed from: b */
    public static final C19726a f54073b = new C19726a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C20292b f54074a;

    /* renamed from: cd0.b$a */
    public static final class C19726a {
        private C19726a() {
        }

        public /* synthetic */ C19726a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C19725b(C20292b bVar) {
        C41536l.m120489i(bVar, "getAppSettings");
        this.f54074a = bVar;
    }

    /* renamed from: a */
    public final long mo47930a() {
        Double c;
        C20557a a = this.f54074a.mo48774a("MBANK_DICTIONARY_UPDATE_PERIOD");
        if (a == null || (c = a.mo49086c()) == null) {
            return 0;
        }
        return (long) c.doubleValue();
    }
}
