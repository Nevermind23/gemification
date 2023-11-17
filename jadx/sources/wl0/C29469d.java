package wl0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: wl0.d */
public abstract class C29469d {

    /* renamed from: wl0.d$a */
    public static final class C29470a extends C29469d {

        /* renamed from: a */
        public static final C29470a f74574a = new C29470a();

        private C29470a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: wl0.d$b */
    public static final class C29471b extends C29469d {

        /* renamed from: a */
        private final List f74575a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29471b(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "contacts");
            this.f74575a = list;
        }

        /* renamed from: a */
        public final List mo69315a() {
            return this.f74575a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29471b) && C41536l.m120484d(this.f74575a, ((C29471b) obj).f74575a);
        }

        public int hashCode() {
            return this.f74575a.hashCode();
        }

        public String toString() {
            List list = this.f74575a;
            return "Contacts(contacts=" + list + ")";
        }
    }

    /* renamed from: wl0.d$c */
    public static final class C29472c extends C29469d {

        /* renamed from: a */
        private final String f74576a;

        /* renamed from: b */
        private final Image f74577b;

        /* renamed from: c */
        private final String f74578c;

        /* renamed from: d */
        private final String f74579d;

        /* renamed from: e */
        private final Long f74580e;

        /* renamed from: f */
        private final long f74581f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29472c(String str, Image image, String str2, String str3, Long l, long j) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "title");
            C41536l.m120489i(image, "logo");
            C41536l.m120489i(str2, "policeNumber");
            C41536l.m120489i(str3, "policePdfUrl");
            this.f74576a = str;
            this.f74577b = image;
            this.f74578c = str2;
            this.f74579d = str3;
            this.f74580e = l;
            this.f74581f = j;
        }

        /* renamed from: a */
        public final long mo69319a() {
            return this.f74581f;
        }

        /* renamed from: b */
        public final Image mo69320b() {
            return this.f74577b;
        }

        /* renamed from: c */
        public final String mo69321c() {
            return this.f74578c;
        }

        /* renamed from: d */
        public final String mo69322d() {
            return this.f74579d;
        }

        /* renamed from: e */
        public final Long mo69323e() {
            return this.f74580e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29472c)) {
                return false;
            }
            C29472c cVar = (C29472c) obj;
            return C41536l.m120484d(this.f74576a, cVar.f74576a) && C41536l.m120484d(this.f74577b, cVar.f74577b) && C41536l.m120484d(this.f74578c, cVar.f74578c) && C41536l.m120484d(this.f74579d, cVar.f74579d) && C41536l.m120484d(this.f74580e, cVar.f74580e) && this.f74581f == cVar.f74581f;
        }

        /* renamed from: f */
        public final String mo69325f() {
            return this.f74576a;
        }

        public int hashCode() {
            int hashCode = ((((((this.f74576a.hashCode() * 31) + this.f74577b.hashCode()) * 31) + this.f74578c.hashCode()) * 31) + this.f74579d.hashCode()) * 31;
            Long l = this.f74580e;
            return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + C7397t.m28148a(this.f74581f);
        }

        public String toString() {
            String str = this.f74576a;
            Image image = this.f74577b;
            String str2 = this.f74578c;
            String str3 = this.f74579d;
            Long l = this.f74580e;
            long j = this.f74581f;
            return "Header(title=" + str + ", logo=" + image + ", policeNumber=" + str2 + ", policePdfUrl=" + str3 + ", policyFileId=" + l + ", docKey=" + j + ")";
        }
    }

    /* renamed from: wl0.d$d */
    public static final class C29473d extends C29469d {

        /* renamed from: a */
        private final String f74582a;

        /* renamed from: b */
        private final String f74583b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29473d(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "fullName");
            C41536l.m120489i(str2, "idNumber");
            this.f74582a = str;
            this.f74583b = str2;
        }

        /* renamed from: a */
        public final String mo69328a() {
            return this.f74582a;
        }

        /* renamed from: b */
        public final String mo69329b() {
            return this.f74583b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29473d)) {
                return false;
            }
            C29473d dVar = (C29473d) obj;
            return C41536l.m120484d(this.f74582a, dVar.f74582a) && C41536l.m120484d(this.f74583b, dVar.f74583b);
        }

        public int hashCode() {
            return (this.f74582a.hashCode() * 31) + this.f74583b.hashCode();
        }

        public String toString() {
            String str = this.f74582a;
            String str2 = this.f74583b;
            return "PersonaInfo(fullName=" + str + ", idNumber=" + str2 + ")";
        }
    }

    /* renamed from: wl0.d$e */
    public static final class C29474e extends C29469d {

        /* renamed from: a */
        private final String f74584a;

        /* renamed from: b */
        private final String f74585b;

        /* renamed from: c */
        private final String f74586c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29474e(String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "limit");
            C41536l.m120489i(str2, "startDate");
            C41536l.m120489i(str3, "endDate");
            this.f74584a = str;
            this.f74585b = str2;
            this.f74586c = str3;
        }

        /* renamed from: a */
        public final String mo69333a() {
            return this.f74586c;
        }

        /* renamed from: b */
        public final String mo69334b() {
            return this.f74584a;
        }

        /* renamed from: c */
        public final String mo69335c() {
            return this.f74585b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29474e)) {
                return false;
            }
            C29474e eVar = (C29474e) obj;
            return C41536l.m120484d(this.f74584a, eVar.f74584a) && C41536l.m120484d(this.f74585b, eVar.f74585b) && C41536l.m120484d(this.f74586c, eVar.f74586c);
        }

        public int hashCode() {
            return (((this.f74584a.hashCode() * 31) + this.f74585b.hashCode()) * 31) + this.f74586c.hashCode();
        }

        public String toString() {
            String str = this.f74584a;
            String str2 = this.f74585b;
            String str3 = this.f74586c;
            return "Policy(limit=" + str + ", startDate=" + str2 + ", endDate=" + str3 + ")";
        }
    }

    private C29469d() {
    }

    public /* synthetic */ C29469d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
