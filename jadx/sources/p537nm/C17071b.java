package p537nm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: nm.b */
public enum C17071b {
    STANDARD("STANDARD", "text.card.application.type.standard", "standard_card"),
    STUDENT("STUDENT", "text.card.application.type.student", "student_card"),
    SCHOOL("SCHOOL", "text.card.application.type.school", "school_card"),
    RECOVER("RECOVER", "text.card.application.type.recover", "recover_card"),
    INSTANT("INSTANT", "text.card.application.type.instant", "instant_card"),
    PAYROLL("PAYROLL", "text.card.application.type.payroll", "payroll_card"),
    WISHCARD("WISHCARD", "text.card.application.type.wishcard", "wish_card");
    

    /* renamed from: g */
    public static final C17072a f47693g = null;

    /* renamed from: d */
    private final String f47702d;

    /* renamed from: e */
    private final String f47703e;

    /* renamed from: f */
    private final String f47704f;

    /* renamed from: nm.b$a */
    public static final class C17072a {
        private C17072a() {
        }

        public /* synthetic */ C17072a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17071b mo44271a(String str) {
            C41536l.m120489i(str, "lookupValue");
            for (C17071b bVar : C17071b.values()) {
                if (C41536l.m120484d(bVar.mo44270e(), str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f47693g = new C17072a((DefaultConstructorMarker) null);
    }

    private C17071b(String str, String str2, String str3) {
        this.f47702d = str;
        this.f47703e = str2;
        this.f47704f = str3;
    }

    /* renamed from: b */
    public final String mo44268b() {
        return this.f47704f;
    }

    /* renamed from: c */
    public final String mo44269c() {
        return this.f47703e;
    }

    /* renamed from: e */
    public final String mo44270e() {
        return this.f47702d;
    }
}
