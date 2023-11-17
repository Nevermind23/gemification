package wi0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: wi0.h */
public interface C29440h {

    /* renamed from: wi0.h$a */
    public static abstract class C29441a implements C29440h {

        /* renamed from: a */
        private final int f74532a;

        public C29441a(int i) {
            this.f74532a = i;
        }

        /* renamed from: a */
        public int mo69278a() {
            return this.f74532a;
        }
    }

    /* renamed from: wi0.h$b */
    public static final class C29442b extends C29441a {

        /* renamed from: b */
        private final String f74533b;

        /* renamed from: c */
        private final Image f74534c;

        /* renamed from: d */
        private final StringSource f74535d;

        /* renamed from: e */
        private final long f74536e;

        /* renamed from: f */
        private final List f74537f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29442b(String str, Image image, StringSource stringSource, long j, List list) {
            super(3);
            C41536l.m120489i(str, "widgetText");
            C41536l.m120489i(image, "widgetLogo");
            C41536l.m120489i(stringSource, "buttonText");
            C41536l.m120489i(list, "categoriesList");
            this.f74533b = str;
            this.f74534c = image;
            this.f74535d = stringSource;
            this.f74536e = j;
            this.f74537f = list;
        }

        /* renamed from: b */
        public final StringSource mo69279b() {
            return this.f74535d;
        }

        /* renamed from: c */
        public final List mo69280c() {
            return this.f74537f;
        }

        /* renamed from: d */
        public final long mo69281d() {
            return this.f74536e;
        }

        /* renamed from: e */
        public final Image mo69282e() {
            return this.f74534c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29442b)) {
                return false;
            }
            C29442b bVar = (C29442b) obj;
            return C41536l.m120484d(this.f74533b, bVar.f74533b) && C41536l.m120484d(this.f74534c, bVar.f74534c) && C41536l.m120484d(this.f74535d, bVar.f74535d) && this.f74536e == bVar.f74536e && C41536l.m120484d(this.f74537f, bVar.f74537f);
        }

        /* renamed from: f */
        public final String mo69284f() {
            return this.f74533b;
        }

        public int hashCode() {
            return (((((((this.f74533b.hashCode() * 31) + this.f74534c.hashCode()) * 31) + this.f74535d.hashCode()) * 31) + C7397t.m28148a(this.f74536e)) * 31) + this.f74537f.hashCode();
        }

        public String toString() {
            String str = this.f74533b;
            Image image = this.f74534c;
            StringSource stringSource = this.f74535d;
            long j = this.f74536e;
            List list = this.f74537f;
            return "CategoriesSectionViewType(widgetText=" + str + ", widgetLogo=" + image + ", buttonText=" + stringSource + ", uniqueId=" + j + ", categoriesList=" + list + ")";
        }
    }

    /* renamed from: wi0.h$c */
    public static final class C29443c extends C29441a {

        /* renamed from: b */
        private final StringSource f74538b;

        /* renamed from: c */
        private final StringSource f74539c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29443c(StringSource stringSource, StringSource stringSource2) {
            super(2);
            C41536l.m120489i(stringSource, "widgetText");
            C41536l.m120489i(stringSource2, "buttonText");
            this.f74538b = stringSource;
            this.f74539c = stringSource2;
        }

        /* renamed from: b */
        public final StringSource mo69287b() {
            return this.f74539c;
        }

        /* renamed from: c */
        public final StringSource mo69288c() {
            return this.f74538b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29443c)) {
                return false;
            }
            C29443c cVar = (C29443c) obj;
            return C41536l.m120484d(this.f74538b, cVar.f74538b) && C41536l.m120484d(this.f74539c, cVar.f74539c);
        }

        public int hashCode() {
            return (this.f74538b.hashCode() * 31) + this.f74539c.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f74538b;
            StringSource stringSource2 = this.f74539c;
            return "CategoriesViewType(widgetText=" + stringSource + ", buttonText=" + stringSource2 + ")";
        }
    }

    /* renamed from: wi0.h$d */
    public static final class C29444d extends C29441a {

        /* renamed from: b */
        public static final C29444d f74540b = new C29444d();

        private C29444d() {
            super(4);
        }
    }

    /* renamed from: wi0.h$e */
    public static final class C29445e extends C29441a {

        /* renamed from: b */
        private final String f74541b;

        /* renamed from: c */
        private final boolean f74542c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29445e(String str, boolean z) {
            super(1);
            C41536l.m120489i(str, "query");
            this.f74541b = str;
            this.f74542c = z;
        }

        /* renamed from: b */
        public final String mo69292b() {
            return this.f74541b;
        }

        /* renamed from: c */
        public final boolean mo69293c() {
            return this.f74542c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29445e)) {
                return false;
            }
            C29445e eVar = (C29445e) obj;
            return C41536l.m120484d(this.f74541b, eVar.f74541b) && this.f74542c == eVar.f74542c;
        }

        public int hashCode() {
            int hashCode = this.f74541b.hashCode() * 31;
            boolean z = this.f74542c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f74541b;
            boolean z = this.f74542c;
            return "SearchViewType(query=" + str + ", update=" + z + ")";
        }
    }

    /* renamed from: a */
    int mo69278a();
}
