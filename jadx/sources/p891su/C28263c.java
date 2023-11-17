package p891su;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: su.c */
public abstract class C28263c {

    /* renamed from: a */
    private final long f71748a;

    /* renamed from: su.c$a */
    public static final class C28264a extends C28263c {

        /* renamed from: b */
        private final C28262b f71749b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28264a(long j, C28262b bVar) {
            super(j, (DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "account");
            this.f71749b = bVar;
        }

        /* renamed from: b */
        public final C28262b mo67877b() {
            return this.f71749b;
        }
    }

    /* renamed from: su.c$b */
    public static final class C28265b extends C28263c {

        /* renamed from: b */
        private final String f71750b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28265b(long j, String str) {
            super(j, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "accountNumber");
            this.f71750b = str;
        }

        /* renamed from: b */
        public final String mo67878b() {
            return this.f71750b;
        }
    }

    /* renamed from: su.c$c */
    public static final class C28266c extends C28263c {

        /* renamed from: b */
        private final C28262b f71751b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28266c(long j, C28262b bVar) {
            super(j, (DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "account");
            this.f71751b = bVar;
        }

        /* renamed from: b */
        public final C28262b mo67879b() {
            return this.f71751b;
        }
    }

    public /* synthetic */ C28263c(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: a */
    public long mo67876a() {
        return this.f71748a;
    }

    private C28263c(long j) {
        this.f71748a = j;
    }
}
