package p341ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype;

import j71.C36758j;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.a */
public abstract class C35100a {

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.a$a */
    public static final class C35101a extends C35100a {

        /* renamed from: a */
        public static final C35101a f84641a = new C35101a();

        private C35101a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.a$b */
    public static final class C35102b extends C35100a {

        /* renamed from: a */
        public static final C35102b f84642a = new C35102b();

        private C35102b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.a$c */
    public static final class C35103c extends C35100a {

        /* renamed from: a */
        private final List f84643a;

        /* renamed from: b */
        private C36758j f84644b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35103c(List list, C36758j jVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "passTypes");
            C41536l.m120489i(jVar, "selectedPassType");
            this.f84643a = list;
            this.f84644b = jVar;
        }

        /* renamed from: a */
        public final List mo85977a() {
            return this.f84643a;
        }

        /* renamed from: b */
        public final C36758j mo85978b() {
            return this.f84644b;
        }

        /* renamed from: c */
        public final void mo85979c(C36758j jVar) {
            C41536l.m120489i(jVar, "<set-?>");
            this.f84644b = jVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35103c)) {
                return false;
            }
            C35103c cVar = (C35103c) obj;
            return C41536l.m120484d(this.f84643a, cVar.f84643a) && C41536l.m120484d(this.f84644b, cVar.f84644b);
        }

        public int hashCode() {
            return (this.f84643a.hashCode() * 31) + this.f84644b.hashCode();
        }

        public String toString() {
            List list = this.f84643a;
            C36758j jVar = this.f84644b;
            return "Success(passTypes=" + list + ", selectedPassType=" + jVar + ")";
        }
    }

    private C35100a() {
    }

    public /* synthetic */ C35100a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
