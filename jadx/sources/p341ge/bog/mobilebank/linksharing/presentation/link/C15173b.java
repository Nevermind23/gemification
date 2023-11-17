package p341ge.bog.mobilebank.linksharing.presentation.link;

import androidx.fragment.app.C1505h;
import kotlin.jvm.internal.C41536l;
import p420fh.C12902d;
import p420fh.C12910e;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.link.b */
public interface C15173b {

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.b$a */
    public interface C15174a {

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.b$a$a */
        public static final class C15175a implements C15174a {

            /* renamed from: a */
            private final C1505h f43502a;

            public C15175a(C1505h hVar) {
                C41536l.m120489i(hVar, "activity");
                this.f43502a = hVar;
            }

            /* renamed from: a */
            public void mo42215a(String str) {
                C41536l.m120489i(str, "message");
                C12910e.m48797o(this.f43502a, str, (C12902d.C12905b) null, false, 6, (Object) null);
            }

            /* renamed from: b */
            public void mo42216b(String str) {
                C41536l.m120489i(str, "message");
                C12910e.m48790h(this.f43502a, str, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }

        /* renamed from: a */
        void mo42215a(String str);

        /* renamed from: b */
        void mo42216b(String str);
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.b$b */
    public static final class C15176b implements C15173b {

        /* renamed from: a */
        private final String f43503a;

        public C15176b(String str) {
            C41536l.m120489i(str, "message");
            this.f43503a = str;
        }

        /* renamed from: a */
        public void mo42214a(C15174a aVar) {
            C41536l.m120489i(aVar, "category");
            aVar.mo42216b(this.f43503a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15176b) && C41536l.m120484d(this.f43503a, ((C15176b) obj).f43503a);
        }

        public int hashCode() {
            return this.f43503a.hashCode();
        }

        public String toString() {
            String str = this.f43503a;
            return "Negative(message=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.b$c */
    public static final class C15177c implements C15173b {

        /* renamed from: a */
        private final String f43504a;

        public C15177c(String str) {
            C41536l.m120489i(str, "message");
            this.f43504a = str;
        }

        /* renamed from: a */
        public void mo42214a(C15174a aVar) {
            C41536l.m120489i(aVar, "category");
            aVar.mo42215a(this.f43504a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15177c) && C41536l.m120484d(this.f43504a, ((C15177c) obj).f43504a);
        }

        public int hashCode() {
            return this.f43504a.hashCode();
        }

        public String toString() {
            String str = this.f43504a;
            return "Positive(message=" + str + ")";
        }
    }

    /* renamed from: a */
    void mo42214a(C15174a aVar);
}
