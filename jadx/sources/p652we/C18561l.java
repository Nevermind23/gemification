package p652we;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: we.l */
public interface C18561l {

    /* renamed from: we.l$a */
    public static abstract class C18562a {

        /* renamed from: we.l$a$a */
        public static final class C18563a extends C18562a {

            /* renamed from: a */
            private final C18549h f52069a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18563a(C18549h hVar) {
                super((DefaultConstructorMarker) null);
                C41536l.m120490j(hVar, "shutdownReason");
                this.f52069a = hVar;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C18563a) && C41536l.m120484d(this.f52069a, ((C18563a) obj).f52069a);
                }
                return true;
            }

            public int hashCode() {
                C18549h hVar = this.f52069a;
                if (hVar != null) {
                    return hVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "OnConnectionClosed(shutdownReason=" + this.f52069a + ")";
            }
        }

        /* renamed from: we.l$a$b */
        public static final class C18564b extends C18562a {

            /* renamed from: a */
            private final C18549h f52070a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18564b(C18549h hVar) {
                super((DefaultConstructorMarker) null);
                C41536l.m120490j(hVar, "shutdownReason");
                this.f52070a = hVar;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C18564b) && C41536l.m120484d(this.f52070a, ((C18564b) obj).f52070a);
                }
                return true;
            }

            public int hashCode() {
                C18549h hVar = this.f52070a;
                if (hVar != null) {
                    return hVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "OnConnectionClosing(shutdownReason=" + this.f52070a + ")";
            }
        }

        /* renamed from: we.l$a$c */
        public static final class C18565c extends C18562a {

            /* renamed from: a */
            private final Throwable f52071a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18565c(Throwable th) {
                super((DefaultConstructorMarker) null);
                C41536l.m120490j(th, "throwable");
                this.f52071a = th;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C18565c) && C41536l.m120484d(this.f52071a, ((C18565c) obj).f52071a);
                }
                return true;
            }

            public int hashCode() {
                Throwable th = this.f52071a;
                if (th != null) {
                    return th.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "OnConnectionFailed(throwable=" + this.f52071a + ")";
            }
        }

        /* renamed from: we.l$a$d */
        public static final class C18566d extends C18562a {

            /* renamed from: a */
            private final Object f52072a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18566d(Object obj) {
                super((DefaultConstructorMarker) null);
                C41536l.m120490j(obj, "webSocket");
                this.f52072a = obj;
            }

            /* renamed from: a */
            public final Object mo46395a() {
                return this.f52072a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C18566d) && C41536l.m120484d(this.f52072a, ((C18566d) obj).f52072a);
                }
                return true;
            }

            public int hashCode() {
                Object obj = this.f52072a;
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "OnConnectionOpened(webSocket=" + this.f52072a + ")";
            }
        }

        /* renamed from: we.l$a$e */
        public static final class C18567e extends C18562a {

            /* renamed from: a */
            private final C18539d f52073a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18567e(C18539d dVar) {
                super((DefaultConstructorMarker) null);
                C41536l.m120490j(dVar, "message");
                this.f52073a = dVar;
            }

            /* renamed from: a */
            public final C18539d mo46399a() {
                return this.f52073a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C18567e) && C41536l.m120484d(this.f52073a, ((C18567e) obj).f52073a);
                }
                return true;
            }

            public int hashCode() {
                C18539d dVar = this.f52073a;
                if (dVar != null) {
                    return dVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "OnMessageReceived(message=" + this.f52073a + ")";
            }
        }

        private C18562a() {
        }

        public /* synthetic */ C18562a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: we.l$b */
    public interface C18568b {
        C18561l create();
    }

    /* renamed from: a */
    C18558j mo42916a();

    /* renamed from: b */
    boolean mo42917b(C18539d dVar);

    /* renamed from: c */
    boolean mo42918c(C18549h hVar);

    void cancel();
}
