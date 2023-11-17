package p341ge.bog.mobilebank.ddsto.presentation.intro;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x90.C29662b;

/* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.b */
public abstract class C22780b {

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.b$a */
    public static final class C22781a extends C22780b {

        /* renamed from: a */
        public static final C22781a f60078a = new C22781a();

        private C22781a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.b$b */
    public static final class C22782b extends C22780b {

        /* renamed from: a */
        public static final C22782b f60079a = new C22782b();

        private C22782b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.b$c */
    public static final class C22783c extends C22780b {

        /* renamed from: a */
        private final C29662b f60080a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22783c(C29662b bVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "sto");
            this.f60080a = bVar;
        }

        /* renamed from: a */
        public final C29662b mo56591a() {
            return this.f60080a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C22783c) && C41536l.m120484d(this.f60080a, ((C22783c) obj).f60080a);
        }

        public int hashCode() {
            return this.f60080a.hashCode();
        }

        public String toString() {
            C29662b bVar = this.f60080a;
            return "STO(sto=" + bVar + ")";
        }
    }

    private C22780b() {
    }

    public /* synthetic */ C22780b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
