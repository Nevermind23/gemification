package p341ge.bog.mobilebank.payments.presentation.categories;

import cx0.C31456c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.payments.presentation.categories.b */
public abstract class C33649b {

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.b$a */
    public static final class C33650a extends C33649b {

        /* renamed from: a */
        public static final C33650a f82032a = new C33650a();

        private C33650a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.b$b */
    public static final class C33651b extends C33649b {

        /* renamed from: a */
        private final C31456c f82033a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33651b(C31456c cVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(cVar, "node");
            this.f82033a = cVar;
        }

        /* renamed from: a */
        public final C31456c mo80224a() {
            return this.f82033a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C33651b) && C41536l.m120484d(this.f82033a, ((C33651b) obj).f82033a);
        }

        public int hashCode() {
            return this.f82033a.hashCode();
        }

        public String toString() {
            C31456c cVar = this.f82033a;
            return "Forms(node=" + cVar + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.b$c */
    public static final class C33652c extends C33649b {

        /* renamed from: a */
        public static final C33652c f82034a = new C33652c();

        private C33652c() {
            super((DefaultConstructorMarker) null);
        }
    }

    private C33649b() {
    }

    public /* synthetic */ C33649b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
