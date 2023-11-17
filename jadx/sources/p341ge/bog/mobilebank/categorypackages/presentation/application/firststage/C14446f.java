package p341ge.bog.mobilebank.categorypackages.presentation.application.firststage;

import cf1.C40419j;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p357ap.C10127a;
import p596rp.C17712c;
import p596rp.C17713d;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.f */
public interface C14446f {

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.f$a */
    public static final class C14447a implements C14446f, C10127a {

        /* renamed from: a */
        private String f42229a;

        /* renamed from: b */
        private final int f42230b = C14454h.EMAIL_INPUT.ordinal();

        public C14447a(String str) {
            C41536l.m120489i(str, "input");
            this.f42229a = str;
        }

        /* renamed from: a */
        public int mo40621a() {
            return this.f42230b;
        }

        /* renamed from: b */
        public boolean mo26650b() {
            return this.f42229a.length() > 0;
        }

        /* renamed from: c */
        public final C14447a mo40622c(String str) {
            C41536l.m120489i(str, "input");
            return new C14447a(str);
        }

        /* renamed from: d */
        public final String mo40623d() {
            return this.f42229a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14447a) && C41536l.m120484d(this.f42229a, ((C14447a) obj).f42229a);
        }

        public int hashCode() {
            return this.f42229a.hashCode();
        }

        public String toString() {
            String str = this.f42229a;
            return "Email(input=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.f$b */
    public static final class C14448b implements C14446f, C10127a {

        /* renamed from: a */
        private String f42231a;

        /* renamed from: b */
        private final int f42232b = C14454h.JOB_NAME_INPUT.ordinal();

        public C14448b(String str) {
            C41536l.m120489i(str, "input");
            this.f42231a = str;
        }

        /* renamed from: a */
        public int mo40621a() {
            return this.f42232b;
        }

        /* renamed from: b */
        public boolean mo26650b() {
            return new C40419j("(?=^.{5,254}$)^([\\s]?[\\w])+\\s?$").mo94489f(this.f42231a);
        }

        /* renamed from: c */
        public final String mo40627c() {
            return this.f42231a;
        }

        /* renamed from: d */
        public final void mo40628d(String str) {
            C41536l.m120489i(str, "<set-?>");
            this.f42231a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14448b) && C41536l.m120484d(this.f42231a, ((C14448b) obj).f42231a);
        }

        public int hashCode() {
            return this.f42231a.hashCode();
        }

        public String toString() {
            String str = this.f42231a;
            return "JobName(input=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.f$c */
    public static final class C14449c implements C14446f, C10127a {

        /* renamed from: a */
        public static final C14449c f42233a = new C14449c();

        /* renamed from: b */
        private static final int f42234b = C14454h.NO_EMAIL.ordinal();

        private C14449c() {
        }

        /* renamed from: a */
        public int mo40621a() {
            return f42234b;
        }

        /* renamed from: b */
        public boolean mo26650b() {
            return false;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.f$e */
    public static final class C14451e implements C14446f {

        /* renamed from: a */
        private final C17713d f42238a;

        /* renamed from: b */
        private final int f42239b = C14454h.PAYMENT_TYPE_INFO.ordinal();

        public C14451e(C17713d dVar) {
            C41536l.m120489i(dVar, "fee");
            this.f42238a = dVar;
        }

        /* renamed from: a */
        public int mo40621a() {
            return this.f42239b;
        }

        /* renamed from: b */
        public final C17713d mo40638b() {
            return this.f42238a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14451e) && C41536l.m120484d(this.f42238a, ((C14451e) obj).f42238a);
        }

        public int hashCode() {
            return this.f42238a.hashCode();
        }

        public String toString() {
            C17713d dVar = this.f42238a;
            return "PaymentTypeInfo(fee=" + dVar + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.f$f */
    public static final class C14452f implements C14446f, C10127a {

        /* renamed from: a */
        private final String f42240a;

        /* renamed from: b */
        private final int f42241b = C14454h.PHONE_INPUT.ordinal();

        public C14452f(String str) {
            C41536l.m120489i(str, "input");
            this.f42240a = str;
        }

        /* renamed from: a */
        public int mo40621a() {
            return this.f42241b;
        }

        /* renamed from: b */
        public boolean mo26650b() {
            return this.f42240a.length() > 0;
        }

        /* renamed from: c */
        public final String mo40642c() {
            return this.f42240a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14452f) && C41536l.m120484d(this.f42240a, ((C14452f) obj).f42240a);
        }

        public int hashCode() {
            return this.f42240a.hashCode();
        }

        public String toString() {
            String str = this.f42240a;
            return "PhoneNumber(input=" + str + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.f$h */
    public enum C14454h {
        SECTION_HEADER,
        PHONE_INPUT,
        EMAIL_INPUT,
        JOB_NAME_INPUT,
        NO_EMAIL,
        PAYMENT_TYPE_CHOICE,
        PAYMENT_TYPE_INFO
    }

    /* renamed from: a */
    int mo40621a();

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.f$d */
    public static final class C14450d implements C14446f, C10127a {

        /* renamed from: a */
        private final List f42235a;

        /* renamed from: b */
        private final C17712c f42236b;

        /* renamed from: c */
        private final int f42237c;

        public C14450d(List list, C17712c cVar) {
            C41536l.m120489i(list, "fees");
            this.f42235a = list;
            this.f42236b = cVar;
            this.f42237c = C14454h.PAYMENT_TYPE_CHOICE.ordinal();
        }

        /* renamed from: d */
        public static /* synthetic */ C14450d m53454d(C14450d dVar, List list, C17712c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dVar.f42235a;
            }
            if ((i & 2) != 0) {
                cVar = dVar.f42236b;
            }
            return dVar.mo40632c(list, cVar);
        }

        /* renamed from: a */
        public int mo40621a() {
            return this.f42237c;
        }

        /* renamed from: b */
        public boolean mo26650b() {
            return this.f42236b != null;
        }

        /* renamed from: c */
        public final C14450d mo40632c(List list, C17712c cVar) {
            C41536l.m120489i(list, "fees");
            return new C14450d(list, cVar);
        }

        /* renamed from: e */
        public final List mo40633e() {
            return this.f42235a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14450d)) {
                return false;
            }
            C14450d dVar = (C14450d) obj;
            return C41536l.m120484d(this.f42235a, dVar.f42235a) && this.f42236b == dVar.f42236b;
        }

        /* renamed from: f */
        public final C17712c mo40635f() {
            return this.f42236b;
        }

        public int hashCode() {
            int hashCode = this.f42235a.hashCode() * 31;
            C17712c cVar = this.f42236b;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            List list = this.f42235a;
            C17712c cVar = this.f42236b;
            return "PaymentTypeChoice(fees=" + list + ", selectedFeeType=" + cVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C14450d(List list, C17712c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : cVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.f$g */
    public static final class C14453g implements C14446f {

        /* renamed from: a */
        private final String f42242a;

        /* renamed from: b */
        private final String f42243b;

        /* renamed from: c */
        private final int f42244c;

        public C14453g(String str, String str2) {
            C41536l.m120489i(str, "titleKey");
            this.f42242a = str;
            this.f42243b = str2;
            this.f42244c = C14454h.SECTION_HEADER.ordinal();
        }

        /* renamed from: a */
        public int mo40621a() {
            return this.f42244c;
        }

        /* renamed from: b */
        public final String mo40646b() {
            return this.f42243b;
        }

        /* renamed from: c */
        public final String mo40647c() {
            return this.f42242a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14453g)) {
                return false;
            }
            C14453g gVar = (C14453g) obj;
            return C41536l.m120484d(this.f42242a, gVar.f42242a) && C41536l.m120484d(this.f42243b, gVar.f42243b);
        }

        public int hashCode() {
            int hashCode = this.f42242a.hashCode() * 31;
            String str = this.f42243b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f42242a;
            String str2 = this.f42243b;
            return "SectionHeader(titleKey=" + str + ", descKey=" + str2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C14453g(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }
}
