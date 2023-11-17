package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.b */
public interface C14633b {

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.b$a */
    public static final class C14634a implements C14633b {

        /* renamed from: a */
        private final Throwable f42560a;

        public C14634a(Throwable th) {
            C41536l.m120489i(th, "throwable");
            this.f42560a = th;
        }

        /* renamed from: a */
        public final Throwable mo41007a() {
            return this.f42560a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14634a) && C41536l.m120484d(this.f42560a, ((C14634a) obj).f42560a);
        }

        public int hashCode() {
            return this.f42560a.hashCode();
        }

        public String toString() {
            Throwable th = this.f42560a;
            return "Error(throwable=" + th + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.b$b */
    public static final class C14635b implements C14633b {

        /* renamed from: a */
        private final boolean f42561a;

        /* renamed from: b */
        private final boolean f42562b;

        public C14635b(boolean z, boolean z2) {
            this.f42561a = z;
            this.f42562b = z2;
        }

        /* renamed from: a */
        public final boolean mo41011a() {
            return this.f42561a;
        }

        /* renamed from: b */
        public final boolean mo41012b() {
            return this.f42562b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14635b)) {
                return false;
            }
            C14635b bVar = (C14635b) obj;
            return this.f42561a == bVar.f42561a && this.f42562b == bVar.f42562b;
        }

        public int hashCode() {
            boolean z = this.f42561a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f42562b;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.f42561a;
            boolean z2 = this.f42562b;
            return "Success(showChangeButton=" + z + ", showDeleteButton=" + z2 + ")";
        }
    }
}
