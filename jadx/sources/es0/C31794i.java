package es0;

import kotlin.jvm.internal.C41536l;

/* renamed from: es0.i */
public interface C31794i {

    /* renamed from: es0.i$a */
    public static final class C31795a implements C31794i {

        /* renamed from: a */
        private final Throwable f78419a;

        public C31795a(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f78419a = th;
        }

        /* renamed from: a */
        public final Throwable mo72231a() {
            return this.f78419a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31795a) && C41536l.m120484d(this.f78419a, ((C31795a) obj).f78419a);
        }

        public int hashCode() {
            return this.f78419a.hashCode();
        }

        public String toString() {
            Throwable th = this.f78419a;
            return "InstallmentReversalError(error=" + th + ")";
        }
    }

    /* renamed from: es0.i$b */
    public static final class C31796b implements C31794i {

        /* renamed from: a */
        private final String f78420a;

        /* renamed from: b */
        private final String f78421b;

        public C31796b(String str, String str2) {
            C41536l.m120489i(str, "checkedReason");
            C41536l.m120489i(str2, "loanName");
            this.f78420a = str;
            this.f78421b = str2;
        }

        /* renamed from: a */
        public final String mo72235a() {
            return this.f78420a;
        }

        /* renamed from: b */
        public final String mo72236b() {
            return this.f78421b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31796b)) {
                return false;
            }
            C31796b bVar = (C31796b) obj;
            return C41536l.m120484d(this.f78420a, bVar.f78420a) && C41536l.m120484d(this.f78421b, bVar.f78421b);
        }

        public int hashCode() {
            return (this.f78420a.hashCode() * 31) + this.f78421b.hashCode();
        }

        public String toString() {
            String str = this.f78420a;
            String str2 = this.f78421b;
            return "InstallmentReversalSuccess(checkedReason=" + str + ", loanName=" + str2 + ")";
        }
    }

    /* renamed from: es0.i$c */
    public static final class C31797c implements C31794i {

        /* renamed from: a */
        public static final C31797c f78422a = new C31797c();

        private C31797c() {
        }
    }
}
