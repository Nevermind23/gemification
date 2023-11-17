package p419fg;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fg.h */
public abstract class C12880h {

    /* renamed from: fg.h$a */
    public static final class C12881a extends C12880h {

        /* renamed from: a */
        private final C12878g f38051a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12881a(C12878g gVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(gVar, "message");
            this.f38051a = gVar;
        }

        /* renamed from: a */
        public final C12878g mo33604a() {
            return this.f38051a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12881a) && C41536l.m120484d(this.f38051a, ((C12881a) obj).f38051a);
        }

        public int hashCode() {
            return this.f38051a.hashCode();
        }

        public String toString() {
            C12878g gVar = this.f38051a;
            return "DeleteMessage(message=" + gVar + ")";
        }
    }

    /* renamed from: fg.h$b */
    public static final class C12882b extends C12880h {

        /* renamed from: a */
        private final C12878g f38052a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12882b(C12878g gVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(gVar, "message");
            this.f38052a = gVar;
        }

        /* renamed from: a */
        public final C12878g mo33608a() {
            return this.f38052a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12882b) && C41536l.m120484d(this.f38052a, ((C12882b) obj).f38052a);
        }

        public int hashCode() {
            return this.f38052a.hashCode();
        }

        public String toString() {
            C12878g gVar = this.f38052a;
            return "NewMessage(message=" + gVar + ")";
        }
    }

    /* renamed from: fg.h$c */
    public static final class C12883c extends C12880h {

        /* renamed from: a */
        private final C12878g f38053a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12883c(C12878g gVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(gVar, "message");
            this.f38053a = gVar;
        }

        /* renamed from: a */
        public final C12878g mo33612a() {
            return this.f38053a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12883c) && C41536l.m120484d(this.f38053a, ((C12883c) obj).f38053a);
        }

        public int hashCode() {
            return this.f38053a.hashCode();
        }

        public String toString() {
            C12878g gVar = this.f38053a;
            return "UpdateMessage(message=" + gVar + ")";
        }
    }

    private C12880h() {
    }

    public /* synthetic */ C12880h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
