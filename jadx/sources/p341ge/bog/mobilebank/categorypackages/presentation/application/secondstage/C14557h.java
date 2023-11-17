package p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p357ap.C10127a;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.h */
public interface C14557h {

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.h$d */
    public enum C14561d {
        HEADER,
        FINANCIAL_INFORMATION,
        SOLO_LOUNGE
    }

    /* renamed from: a */
    int mo40818a();

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.h$c */
    public static final class C14560c implements C14557h, C10127a {

        /* renamed from: a */
        private String f42418a;

        /* renamed from: b */
        private final int f42419b;

        public C14560c(String str) {
            C41536l.m120489i(str, "input");
            this.f42418a = str;
            this.f42419b = C14561d.SOLO_LOUNGE.ordinal();
        }

        /* renamed from: a */
        public int mo40818a() {
            return this.f42419b;
        }

        /* renamed from: b */
        public boolean mo26650b() {
            return this.f42418a.length() > 0;
        }

        /* renamed from: c */
        public final C14560c mo40830c(String str) {
            C41536l.m120489i(str, "input");
            return new C14560c(str);
        }

        /* renamed from: d */
        public final String mo40831d() {
            return this.f42418a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14560c) && C41536l.m120484d(this.f42418a, ((C14560c) obj).f42418a);
        }

        public int hashCode() {
            return this.f42418a.hashCode();
        }

        public String toString() {
            String str = this.f42418a;
            return "SoloLounge(input=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C14560c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.h$a */
    public static final class C14558a implements C14557h, C10127a {

        /* renamed from: a */
        private final List f42412a;

        /* renamed from: b */
        private final boolean f42413b;

        /* renamed from: c */
        private final int f42414c;

        public C14558a(List list, boolean z) {
            C41536l.m120489i(list, "financialInfo");
            this.f42412a = list;
            this.f42413b = z;
            this.f42414c = C14561d.FINANCIAL_INFORMATION.ordinal();
        }

        /* renamed from: a */
        public int mo40818a() {
            return this.f42414c;
        }

        /* renamed from: b */
        public boolean mo26650b() {
            return !this.f42412a.isEmpty();
        }

        /* renamed from: c */
        public final C14558a mo40819c(List list, boolean z) {
            C41536l.m120489i(list, "financialInfo");
            return new C14558a(list, z);
        }

        /* renamed from: d */
        public final List mo40820d() {
            return this.f42412a;
        }

        /* renamed from: e */
        public final boolean mo40821e() {
            return this.f42413b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14558a)) {
                return false;
            }
            C14558a aVar = (C14558a) obj;
            return C41536l.m120484d(this.f42412a, aVar.f42412a) && this.f42413b == aVar.f42413b;
        }

        public int hashCode() {
            int hashCode = this.f42412a.hashCode() * 31;
            boolean z = this.f42413b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            List list = this.f42412a;
            boolean z = this.f42413b;
            return "FinancialInformation(financialInfo=" + list + ", isFull=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C14558a(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.h$b */
    public static final class C14559b implements C14557h {

        /* renamed from: a */
        private final String f42415a;

        /* renamed from: b */
        private final String f42416b;

        /* renamed from: c */
        private final int f42417c;

        public C14559b(String str, String str2) {
            C41536l.m120489i(str, "titleKey");
            this.f42415a = str;
            this.f42416b = str2;
            this.f42417c = C14561d.HEADER.ordinal();
        }

        /* renamed from: a */
        public int mo40818a() {
            return this.f42417c;
        }

        /* renamed from: b */
        public final String mo40825b() {
            return this.f42416b;
        }

        /* renamed from: c */
        public final String mo40826c() {
            return this.f42415a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14559b)) {
                return false;
            }
            C14559b bVar = (C14559b) obj;
            return C41536l.m120484d(this.f42415a, bVar.f42415a) && C41536l.m120484d(this.f42416b, bVar.f42416b);
        }

        public int hashCode() {
            int hashCode = this.f42415a.hashCode() * 31;
            String str = this.f42416b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f42415a;
            String str2 = this.f42416b;
            return "SectionHeader(titleKey=" + str + ", descKey=" + str2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C14559b(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }
}
