package p652we;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uh1.C43106a;

/* renamed from: we.c */
public interface C18532c extends C43106a {

    /* renamed from: we.c$a */
    public static abstract class C18533a {

        /* renamed from: we.c$a$a */
        public static final class C18534a extends C18533a {

            /* renamed from: a */
            public static final C18534a f52029a = new C18534a();

            private C18534a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: we.c$a$b */
        public static final class C18535b extends C18533a {

            /* renamed from: a */
            public static final C18535b f52030a = new C18535b();

            private C18535b() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: we.c$a$c */
        public static abstract class C18536c extends C18533a {

            /* renamed from: we.c$a$c$a */
            public static final class C18537a extends C18536c {

                /* renamed from: a */
                public static final C18537a f52031a = new C18537a();

                private C18537a() {
                    super((DefaultConstructorMarker) null);
                }
            }

            /* renamed from: we.c$a$c$b */
            public static final class C18538b extends C18536c {

                /* renamed from: a */
                private final C18549h f52032a;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C18538b(C18549h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? C18549h.f52056e : hVar);
                }

                /* renamed from: a */
                public final C18549h mo46347a() {
                    return this.f52032a;
                }

                public boolean equals(Object obj) {
                    if (this != obj) {
                        return (obj instanceof C18538b) && C41536l.m120484d(this.f52032a, ((C18538b) obj).f52032a);
                    }
                    return true;
                }

                public int hashCode() {
                    C18549h hVar = this.f52032a;
                    if (hVar != null) {
                        return hVar.hashCode();
                    }
                    return 0;
                }

                public String toString() {
                    return "WithReason(shutdownReason=" + this.f52032a + ")";
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C18538b(C18549h hVar) {
                    super((DefaultConstructorMarker) null);
                    C41536l.m120490j(hVar, "shutdownReason");
                    this.f52032a = hVar;
                }
            }

            private C18536c() {
                super((DefaultConstructorMarker) null);
            }

            public /* synthetic */ C18536c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private C18533a() {
        }

        public /* synthetic */ C18533a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
