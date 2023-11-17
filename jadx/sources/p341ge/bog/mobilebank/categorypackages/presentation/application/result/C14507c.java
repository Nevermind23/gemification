package p341ge.bog.mobilebank.categorypackages.presentation.application.result;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.pagestate.PageStateType;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.c */
public interface C14507c {

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.c$a */
    public static final class C14508a implements C14507c {

        /* renamed from: a */
        private final List f42337a;

        /* renamed from: b */
        private final int f42338b = C14510c.Details.ordinal();

        public C14508a(List list) {
            C41536l.m120489i(list, "detailsList");
            this.f42337a = list;
        }

        /* renamed from: a */
        public int mo40723a() {
            return this.f42338b;
        }

        /* renamed from: b */
        public final List mo40724b() {
            return this.f42337a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14508a) && C41536l.m120484d(this.f42337a, ((C14508a) obj).f42337a);
        }

        public int hashCode() {
            return this.f42337a.hashCode();
        }

        public String toString() {
            List list = this.f42337a;
            return "ResultDetails(detailsList=" + list + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.c$b */
    public static final class C14509b implements C14507c {

        /* renamed from: a */
        private final PageStateType f42339a;

        /* renamed from: b */
        private final String f42340b;

        /* renamed from: c */
        private final int f42341c = C14510c.Header.ordinal();

        public C14509b(PageStateType pageStateType, String str) {
            C41536l.m120489i(pageStateType, "resultType");
            C41536l.m120489i(str, "resultText");
            this.f42339a = pageStateType;
            this.f42340b = str;
        }

        /* renamed from: a */
        public int mo40723a() {
            return this.f42341c;
        }

        /* renamed from: b */
        public final String mo40728b() {
            return this.f42340b;
        }

        /* renamed from: c */
        public final PageStateType mo40729c() {
            return this.f42339a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14509b)) {
                return false;
            }
            C14509b bVar = (C14509b) obj;
            return C41536l.m120484d(this.f42339a, bVar.f42339a) && C41536l.m120484d(this.f42340b, bVar.f42340b);
        }

        public int hashCode() {
            return (this.f42339a.hashCode() * 31) + this.f42340b.hashCode();
        }

        public String toString() {
            PageStateType pageStateType = this.f42339a;
            String str = this.f42340b;
            return "ResultHeader(resultType=" + pageStateType + ", resultText=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.result.c$c */
    public enum C14510c {
        Header,
        Details
    }

    /* renamed from: a */
    int mo40723a();
}
