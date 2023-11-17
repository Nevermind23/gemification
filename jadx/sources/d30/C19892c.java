package d30;

import a30.C19159d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: d30.c */
public abstract class C19892c {

    /* renamed from: d30.c$a */
    public static final class C19893a extends C19892c {

        /* renamed from: a */
        private final C19159d f54394a;

        /* renamed from: b */
        private final String f54395b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19893a(C19159d dVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(dVar, "addressee");
            this.f54394a = dVar;
            this.f54395b = dVar.mo47379c();
        }

        /* renamed from: a */
        public String mo48242a() {
            return this.f54395b;
        }

        /* renamed from: b */
        public final C19159d mo48243b() {
            return this.f54394a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19893a) && C41536l.m120484d(this.f54394a, ((C19893a) obj).f54394a);
        }

        public int hashCode() {
            return this.f54394a.hashCode();
        }

        public String toString() {
            C19159d dVar = this.f54394a;
            return "AddresseeDetails(addressee=" + dVar + ")";
        }
    }

    /* renamed from: d30.c$b */
    public static final class C19894b extends C19892c {

        /* renamed from: a */
        private final C19897e f54396a;

        /* renamed from: b */
        private final String f54397b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19894b(C19897e eVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(eVar, "infoModel");
            this.f54396a = eVar;
            this.f54397b = eVar.mo48257a();
        }

        /* renamed from: a */
        public String mo48242a() {
            return this.f54397b;
        }

        /* renamed from: b */
        public final C19897e mo48247b() {
            return this.f54396a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19894b) && C41536l.m120484d(this.f54396a, ((C19894b) obj).f54396a);
        }

        public int hashCode() {
            return this.f54396a.hashCode();
        }

        public String toString() {
            C19897e eVar = this.f54396a;
            return "RequestInfoFields(infoModel=" + eVar + ")";
        }
    }

    /* renamed from: d30.c$c */
    public static final class C19895c extends C19892c {

        /* renamed from: a */
        private final C19899g f54398a;

        /* renamed from: b */
        private final String f54399b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19895c(C19899g gVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(gVar, "wizardModel");
            this.f54398a = gVar;
            this.f54399b = gVar.mo48266d().name();
        }

        /* renamed from: a */
        public String mo48242a() {
            return this.f54399b;
        }

        /* renamed from: b */
        public final C19899g mo48251b() {
            return this.f54398a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19895c) && C41536l.m120484d(this.f54398a, ((C19895c) obj).f54398a);
        }

        public int hashCode() {
            return this.f54398a.hashCode();
        }

        public String toString() {
            C19899g gVar = this.f54398a;
            return "WizardFields(wizardModel=" + gVar + ")";
        }
    }

    private C19892c() {
    }

    public /* synthetic */ C19892c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo48242a();
}
