package uo0;

import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: uo0.f */
public abstract class C18274f {

    /* renamed from: uo0.f$a */
    public static final class C18275a extends C18274f {

        /* renamed from: a */
        private final List f51627a;

        /* renamed from: b */
        private final List f51628b;

        /* renamed from: c */
        private final String f51629c;

        /* renamed from: d */
        private final String f51630d;

        /* renamed from: e */
        private final boolean f51631e;

        /* renamed from: f */
        private final int f51632f = C18281g.BNPL.ordinal();

        /* renamed from: g */
        private final String f51633g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18275a(List list, List list2, String str, String str2, boolean z) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "imagesTop");
            C41536l.m120489i(list2, "imagesBottom");
            this.f51627a = list;
            this.f51628b = list2;
            this.f51629c = str;
            this.f51630d = str2;
            this.f51631e = z;
            String uuid = UUID.randomUUID().toString();
            C41536l.m120488h(uuid, "randomUUID().toString()");
            this.f51633g = uuid;
        }

        /* renamed from: a */
        public int mo45969a() {
            return this.f51632f;
        }

        /* renamed from: b */
        public String mo45970b() {
            return this.f51633g;
        }

        /* renamed from: c */
        public final String mo45971c() {
            return this.f51629c;
        }

        /* renamed from: d */
        public final boolean mo45972d() {
            return this.f51631e;
        }

        /* renamed from: e */
        public final String mo45973e() {
            return this.f51630d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18275a)) {
                return false;
            }
            C18275a aVar = (C18275a) obj;
            return C41536l.m120484d(this.f51627a, aVar.f51627a) && C41536l.m120484d(this.f51628b, aVar.f51628b) && C41536l.m120484d(this.f51629c, aVar.f51629c) && C41536l.m120484d(this.f51630d, aVar.f51630d) && this.f51631e == aVar.f51631e;
        }

        /* renamed from: f */
        public final List mo45975f() {
            return this.f51628b;
        }

        /* renamed from: g */
        public final List mo45976g() {
            return this.f51627a;
        }

        public int hashCode() {
            int hashCode = ((this.f51627a.hashCode() * 31) + this.f51628b.hashCode()) * 31;
            String str = this.f51629c;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f51630d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f51631e;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            List list = this.f51627a;
            List list2 = this.f51628b;
            String str = this.f51629c;
            String str2 = this.f51630d;
            boolean z = this.f51631e;
            return "Bnpl(imagesTop=" + list + ", imagesBottom=" + list2 + ", amount=" + str + ", ccy=" + str2 + ", available=" + z + ")";
        }
    }

    /* renamed from: uo0.f$c */
    public static final class C18277c extends C18274f {

        /* renamed from: a */
        public static final C18277c f51638a = new C18277c();

        /* renamed from: b */
        private static final int f51639b = C18281g.CHOOSER_POPUP.ordinal();

        /* renamed from: c */
        private static final String f51640c;

        static {
            String uuid = UUID.randomUUID().toString();
            C41536l.m120488h(uuid, "randomUUID().toString()");
            f51640c = uuid;
        }

        private C18277c() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public int mo45969a() {
            return f51639b;
        }

        /* renamed from: b */
        public String mo45970b() {
            return f51640c;
        }
    }

    /* renamed from: uo0.f$e */
    public static final class C18279e extends C18274f {

        /* renamed from: a */
        private final List f51650a;

        /* renamed from: b */
        private final int f51651b = C18281g.PROGRESS_OFFERS.ordinal();

        /* renamed from: c */
        private final String f51652c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18279e(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "offers");
            this.f51650a = list;
            String uuid = UUID.randomUUID().toString();
            C41536l.m120488h(uuid, "randomUUID().toString()");
            this.f51652c = uuid;
        }

        /* renamed from: a */
        public int mo45969a() {
            return this.f51651b;
        }

        /* renamed from: b */
        public String mo45970b() {
            return this.f51652c;
        }

        /* renamed from: c */
        public final List mo45995c() {
            return this.f51650a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18279e) && C41536l.m120484d(this.f51650a, ((C18279e) obj).f51650a);
        }

        public int hashCode() {
            return this.f51650a.hashCode();
        }

        public String toString() {
            List list = this.f51650a;
            return "ProgressOffers(offers=" + list + ")";
        }
    }

    /* renamed from: uo0.f$f */
    public static final class C18280f extends C18274f {

        /* renamed from: a */
        private final List f51653a;

        /* renamed from: b */
        private final int f51654b = C18281g.SLIDER.ordinal();

        /* renamed from: c */
        private final String f51655c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18280f(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "offers");
            this.f51653a = list;
            String uuid = UUID.randomUUID().toString();
            C41536l.m120488h(uuid, "randomUUID().toString()");
            this.f51655c = uuid;
        }

        /* renamed from: a */
        public int mo45969a() {
            return this.f51654b;
        }

        /* renamed from: b */
        public String mo45970b() {
            return this.f51655c;
        }

        /* renamed from: c */
        public final List mo45999c() {
            return this.f51653a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18280f) && C41536l.m120484d(this.f51653a, ((C18280f) obj).f51653a);
        }

        public int hashCode() {
            return this.f51653a.hashCode();
        }

        public String toString() {
            List list = this.f51653a;
            return "Slider(offers=" + list + ")";
        }
    }

    /* renamed from: uo0.f$g */
    public enum C18281g {
        SLIDER,
        OFFERS,
        CATEGORIES,
        CHOOSER_POPUP,
        BNPL,
        PROGRESS_OFFERS
    }

    private C18274f() {
    }

    public /* synthetic */ C18274f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract int mo45969a();

    /* renamed from: b */
    public abstract String mo45970b();

    /* renamed from: uo0.f$b */
    public static final class C18276b extends C18274f {

        /* renamed from: a */
        private final List f51634a;

        /* renamed from: b */
        private final C18269a f51635b;

        /* renamed from: c */
        private final int f51636c;

        /* renamed from: d */
        private final String f51637d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18276b(List list, C18269a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? C18282g.m62550a() : aVar);
        }

        /* renamed from: a */
        public int mo45969a() {
            return this.f51636c;
        }

        /* renamed from: b */
        public String mo45970b() {
            return this.f51637d;
        }

        /* renamed from: c */
        public final List mo45979c() {
            return this.f51634a;
        }

        /* renamed from: d */
        public final C18269a mo45980d() {
            return this.f51635b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18276b)) {
                return false;
            }
            C18276b bVar = (C18276b) obj;
            return C41536l.m120484d(this.f51634a, bVar.f51634a) && C41536l.m120484d(this.f51635b, bVar.f51635b);
        }

        public int hashCode() {
            return (this.f51634a.hashCode() * 31) + this.f51635b.hashCode();
        }

        public String toString() {
            List list = this.f51634a;
            C18269a aVar = this.f51635b;
            return "Categories(categories=" + list + ", headerStyle=" + aVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18276b(List list, C18269a aVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "categories");
            C41536l.m120489i(aVar, "headerStyle");
            this.f51634a = list;
            this.f51635b = aVar;
            this.f51636c = C18281g.CATEGORIES.ordinal();
            String uuid = UUID.randomUUID().toString();
            C41536l.m120488h(uuid, "randomUUID().toString()");
            this.f51637d = uuid;
        }
    }

    /* renamed from: uo0.f$d */
    public static final class C18278d extends C18274f {

        /* renamed from: a */
        private final Long f51641a;

        /* renamed from: b */
        private final Integer f51642b;

        /* renamed from: c */
        private final Image f51643c;

        /* renamed from: d */
        private final String f51644d;

        /* renamed from: e */
        private final List f51645e;

        /* renamed from: f */
        private final C18269a f51646f;

        /* renamed from: g */
        private final int f51647g;

        /* renamed from: h */
        private final int f51648h;

        /* renamed from: i */
        private final String f51649i;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18278d(Long l, Integer num, Image image, String str, List list, C18269a aVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? null : num, image, str, list, (i2 & 32) != 0 ? C18282g.m62550a() : aVar, (i2 & 64) != 0 ? 0 : i);
        }

        /* renamed from: d */
        public static /* synthetic */ C18278d m62532d(C18278d dVar, Long l, Integer num, Image image, String str, List list, C18269a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                l = dVar.f51641a;
            }
            if ((i2 & 2) != 0) {
                num = dVar.f51642b;
            }
            Integer num2 = num;
            if ((i2 & 4) != 0) {
                image = dVar.f51643c;
            }
            Image image2 = image;
            if ((i2 & 8) != 0) {
                str = dVar.f51644d;
            }
            String str2 = str;
            if ((i2 & 16) != 0) {
                list = dVar.f51645e;
            }
            List list2 = list;
            if ((i2 & 32) != 0) {
                aVar = dVar.f51646f;
            }
            C18269a aVar2 = aVar;
            if ((i2 & 64) != 0) {
                i = dVar.f51647g;
            }
            return dVar.mo45984c(l, num2, image2, str2, list2, aVar2, i);
        }

        /* renamed from: a */
        public int mo45969a() {
            return this.f51648h;
        }

        /* renamed from: b */
        public String mo45970b() {
            return this.f51649i;
        }

        /* renamed from: c */
        public final C18278d mo45984c(Long l, Integer num, Image image, String str, List list, C18269a aVar, int i) {
            C41536l.m120489i(image, "icon");
            C41536l.m120489i(str, "headerText");
            C41536l.m120489i(list, "offers");
            C41536l.m120489i(aVar, "headerStyle");
            return new C18278d(l, num, image, str, list, aVar, i);
        }

        /* renamed from: e */
        public final int mo45985e() {
            return this.f51647g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18278d)) {
                return false;
            }
            C18278d dVar = (C18278d) obj;
            return C41536l.m120484d(this.f51641a, dVar.f51641a) && C41536l.m120484d(this.f51642b, dVar.f51642b) && C41536l.m120484d(this.f51643c, dVar.f51643c) && C41536l.m120484d(this.f51644d, dVar.f51644d) && C41536l.m120484d(this.f51645e, dVar.f51645e) && C41536l.m120484d(this.f51646f, dVar.f51646f) && this.f51647g == dVar.f51647g;
        }

        /* renamed from: f */
        public final Long mo45987f() {
            return this.f51641a;
        }

        /* renamed from: g */
        public final Integer mo45988g() {
            return this.f51642b;
        }

        /* renamed from: h */
        public final C18269a mo45989h() {
            return this.f51646f;
        }

        public int hashCode() {
            Long l = this.f51641a;
            int i = 0;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Integer num = this.f51642b;
            if (num != null) {
                i = num.hashCode();
            }
            return ((((((((((hashCode + i) * 31) + this.f51643c.hashCode()) * 31) + this.f51644d.hashCode()) * 31) + this.f51645e.hashCode()) * 31) + this.f51646f.hashCode()) * 31) + this.f51647g;
        }

        /* renamed from: i */
        public final String mo45991i() {
            return this.f51644d;
        }

        /* renamed from: j */
        public final Image mo45992j() {
            return this.f51643c;
        }

        /* renamed from: k */
        public final List mo45993k() {
            return this.f51645e;
        }

        public String toString() {
            Long l = this.f51641a;
            Integer num = this.f51642b;
            Image image = this.f51643c;
            String str = this.f51644d;
            List list = this.f51645e;
            C18269a aVar = this.f51646f;
            int i = this.f51647g;
            return "Offers(catId=" + l + ", categoryType=" + num + ", icon=" + image + ", headerText=" + str + ", offers=" + list + ", headerStyle=" + aVar + ", allOffersButtonVisibility=" + i + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18278d(Long l, Integer num, Image image, String str, List list, C18269a aVar, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(image, "icon");
            C41536l.m120489i(str, "headerText");
            C41536l.m120489i(list, "offers");
            C41536l.m120489i(aVar, "headerStyle");
            this.f51641a = l;
            this.f51642b = num;
            this.f51643c = image;
            this.f51644d = str;
            this.f51645e = list;
            this.f51646f = aVar;
            this.f51647g = i;
            this.f51648h = C18281g.OFFERS.ordinal();
            String uuid = UUID.randomUUID().toString();
            C41536l.m120488h(uuid, "randomUUID().toString()");
            this.f51649i = uuid;
        }
    }
}
