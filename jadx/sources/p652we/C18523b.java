package p652we;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p652we.C18532c;
import p652we.C18561l;

/* renamed from: we.b */
public abstract class C18523b {

    /* renamed from: we.b$a */
    public static abstract class C18524a extends C18523b {

        /* renamed from: we.b$a$a */
        public static final class C18525a extends C18524a {

            /* renamed from: a */
            private final C18532c.C18533a f52023a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18525a(C18532c.C18533a aVar) {
                super((DefaultConstructorMarker) null);
                C41536l.m120490j(aVar, "state");
                this.f52023a = aVar;
            }

            /* renamed from: a */
            public final C18532c.C18533a mo46335a() {
                return this.f52023a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C18525a) && C41536l.m120484d(this.f52023a, ((C18525a) obj).f52023a);
                }
                return true;
            }

            public int hashCode() {
                C18532c.C18533a aVar = this.f52023a;
                if (aVar != null) {
                    return aVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "StateChange(state=" + this.f52023a + ")";
            }
        }

        /* renamed from: we.b$a$b */
        public static final class C18526b extends C18524a {

            /* renamed from: a */
            public static final C18526b f52024a = new C18526b();

            private C18526b() {
                super((DefaultConstructorMarker) null);
            }
        }

        private C18524a() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C18524a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: we.b$b */
    public static final class C18527b extends C18523b {

        /* renamed from: a */
        public static final C18527b f52025a = new C18527b();

        private C18527b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: we.b$c */
    public static final class C18528c extends C18523b {

        /* renamed from: a */
        private final C18551i f52026a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18528c(C18551i iVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(iVar, "state");
            this.f52026a = iVar;
        }

        /* renamed from: a */
        public final C18551i mo46339a() {
            return this.f52026a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C18528c) && C41536l.m120484d(this.f52026a, ((C18528c) obj).f52026a);
            }
            return true;
        }

        public int hashCode() {
            C18551i iVar = this.f52026a;
            if (iVar != null) {
                return iVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "OnStateChange(state=" + this.f52026a + ")";
        }
    }

    /* renamed from: we.b$d */
    public static abstract class C18529d extends C18523b {

        /* renamed from: we.b$d$a */
        public static final class C18530a extends C18529d {

            /* renamed from: a */
            private final C18561l.C18562a f52027a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18530a(C18561l.C18562a aVar) {
                super((DefaultConstructorMarker) null);
                C41536l.m120490j(aVar, "event");
                this.f52027a = aVar;
            }

            /* renamed from: a */
            public final C18561l.C18562a mo46343a() {
                return this.f52027a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C18530a) && C41536l.m120484d(this.f52027a, ((C18530a) obj).f52027a);
                }
                return true;
            }

            public int hashCode() {
                C18561l.C18562a aVar = this.f52027a;
                if (aVar != null) {
                    return aVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Event(event=" + this.f52027a + ")";
            }
        }

        /* renamed from: we.b$d$b */
        public static final class C18531b extends C18529d {

            /* renamed from: a */
            public static final C18531b f52028a = new C18531b();

            private C18531b() {
                super((DefaultConstructorMarker) null);
            }
        }

        private C18529d() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C18529d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C18523b() {
    }

    public /* synthetic */ C18523b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
