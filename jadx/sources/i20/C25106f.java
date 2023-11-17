package i20;

import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;
import p366bk.C10318g;
import tu0.C38796a;

/* renamed from: i20.f */
public abstract class C25106f {

    /* renamed from: a */
    private final long f64503a;

    /* renamed from: b */
    private final Image f64504b;

    /* renamed from: c */
    private final int f64505c;

    /* renamed from: d */
    private final C38796a.C38800d f64506d;

    /* renamed from: e */
    private final C38796a.C38798b f64507e;

    /* renamed from: f */
    private final boolean f64508f;

    /* renamed from: i20.f$b */
    public static final class C25108b extends C25106f {

        /* renamed from: g */
        private final long f64518g;

        /* renamed from: h */
        private final Image f64519h;

        /* renamed from: i */
        private final String f64520i;

        /* renamed from: j */
        private final String f64521j;

        /* renamed from: k */
        private final String f64522k;

        /* renamed from: l */
        private final int f64523l;

        /* renamed from: m */
        private final C38796a.C38800d f64524m;

        /* renamed from: n */
        private final C38796a.C38798b f64525n;

        /* renamed from: o */
        private final boolean f64526o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25108b(long j, Image image, String str, String str2, String str3, int i, C38796a.C38800d dVar, C38796a.C38798b bVar, boolean z) {
            super(j, image, i, dVar, bVar, z, (DefaultConstructorMarker) null);
            Image image2 = image;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            C38796a.C38800d dVar2 = dVar;
            C38796a.C38798b bVar2 = bVar;
            C41536l.m120489i(image2, "icon");
            C41536l.m120489i(str4, "description");
            C41536l.m120489i(str5, "highLight");
            C41536l.m120489i(str6, "offerProduct");
            C41536l.m120489i(dVar2, "impressionEvent");
            C41536l.m120489i(bVar2, "clickEvent");
            this.f64518g = j;
            this.f64519h = image2;
            this.f64520i = str4;
            this.f64521j = str5;
            this.f64522k = str6;
            this.f64523l = i;
            this.f64524m = dVar2;
            this.f64525n = bVar2;
            this.f64526o = z;
        }

        /* renamed from: e */
        public static /* synthetic */ C25108b m80121e(C25108b bVar, long j, Image image, String str, String str2, String str3, int i, C38796a.C38800d dVar, C38796a.C38798b bVar2, boolean z, int i2, Object obj) {
            C25108b bVar3 = bVar;
            int i3 = i2;
            return bVar.mo63605d((i3 & 1) != 0 ? bVar3.f64518g : j, (i3 & 2) != 0 ? bVar3.f64519h : image, (i3 & 4) != 0 ? bVar3.f64520i : str, (i3 & 8) != 0 ? bVar3.f64521j : str2, (i3 & 16) != 0 ? bVar3.f64522k : str3, (i3 & 32) != 0 ? bVar3.f64523l : i, (i3 & 64) != 0 ? bVar3.f64524m : dVar, (i3 & 128) != 0 ? bVar3.f64525n : bVar2, (i3 & C11398b.f33139r) != 0 ? bVar3.f64526o : z);
        }

        /* renamed from: a */
        public C38796a.C38798b mo63593a() {
            return this.f64525n;
        }

        /* renamed from: b */
        public long mo63594b() {
            return this.f64518g;
        }

        /* renamed from: c */
        public C38796a.C38800d mo63595c() {
            return this.f64524m;
        }

        /* renamed from: d */
        public final C25108b mo63605d(long j, Image image, String str, String str2, String str3, int i, C38796a.C38800d dVar, C38796a.C38798b bVar, boolean z) {
            C41536l.m120489i(image, "icon");
            String str4 = str;
            C41536l.m120489i(str4, "description");
            String str5 = str2;
            C41536l.m120489i(str5, "highLight");
            String str6 = str3;
            C41536l.m120489i(str6, "offerProduct");
            C38796a.C38800d dVar2 = dVar;
            C41536l.m120489i(dVar2, "impressionEvent");
            C38796a.C38798b bVar2 = bVar;
            C41536l.m120489i(bVar2, "clickEvent");
            return new C25108b(j, image, str4, str5, str6, i, dVar2, bVar2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25108b)) {
                return false;
            }
            C25108b bVar = (C25108b) obj;
            return this.f64518g == bVar.f64518g && C41536l.m120484d(this.f64519h, bVar.f64519h) && C41536l.m120484d(this.f64520i, bVar.f64520i) && C41536l.m120484d(this.f64521j, bVar.f64521j) && C41536l.m120484d(this.f64522k, bVar.f64522k) && this.f64523l == bVar.f64523l && C41536l.m120484d(this.f64524m, bVar.f64524m) && C41536l.m120484d(this.f64525n, bVar.f64525n) && this.f64526o == bVar.f64526o;
        }

        /* renamed from: f */
        public final String mo63607f() {
            return this.f64520i;
        }

        /* renamed from: g */
        public final String mo63608g() {
            return this.f64521j;
        }

        /* renamed from: h */
        public Image mo63609h() {
            return this.f64519h;
        }

        public int hashCode() {
            int a = ((((((((((((((C7397t.m28148a(this.f64518g) * 31) + this.f64519h.hashCode()) * 31) + this.f64520i.hashCode()) * 31) + this.f64521j.hashCode()) * 31) + this.f64522k.hashCode()) * 31) + this.f64523l) * 31) + this.f64524m.hashCode()) * 31) + this.f64525n.hashCode()) * 31;
            boolean z = this.f64526o;
            if (z) {
                z = true;
            }
            return a + (z ? 1 : 0);
        }

        /* renamed from: i */
        public final String mo63611i() {
            return this.f64522k;
        }

        /* renamed from: j */
        public boolean mo63612j() {
            return this.f64526o;
        }

        public String toString() {
            long j = this.f64518g;
            Image image = this.f64519h;
            String str = this.f64520i;
            String str2 = this.f64521j;
            String str3 = this.f64522k;
            int i = this.f64523l;
            C38796a.C38800d dVar = this.f64524m;
            C38796a.C38798b bVar = this.f64525n;
            boolean z = this.f64526o;
            return "HighlightTextNboCard(id=" + j + ", icon=" + image + ", description=" + str + ", highLight=" + str2 + ", offerProduct=" + str3 + ", backgroundTintId=" + i + ", impressionEvent=" + dVar + ", clickEvent=" + bVar + ", isDismissButtonVisible=" + z + ")";
        }
    }

    /* renamed from: i20.f$c */
    public static final class C25109c extends C25106f {
    }

    public /* synthetic */ C25106f(long j, Image image, int i, C38796a.C38800d dVar, C38796a.C38798b bVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, image, i, dVar, bVar, z);
    }

    /* renamed from: a */
    public abstract C38796a.C38798b mo63593a();

    /* renamed from: b */
    public abstract long mo63594b();

    /* renamed from: c */
    public abstract C38796a.C38800d mo63595c();

    /* renamed from: i20.f$a */
    public static final class C25107a extends C25106f {

        /* renamed from: g */
        private final long f64509g;

        /* renamed from: h */
        private final Image f64510h;

        /* renamed from: i */
        private final String f64511i;

        /* renamed from: j */
        private final String f64512j;

        /* renamed from: k */
        private final String f64513k;

        /* renamed from: l */
        private final int f64514l;

        /* renamed from: m */
        private final C38796a.C38800d f64515m;

        /* renamed from: n */
        private final C38796a.C38798b f64516n;

        /* renamed from: o */
        private final boolean f64517o;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25107a(long j, Image image, String str, String str2, String str3, int i, C38796a.C38800d dVar, C38796a.C38798b bVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, image, str, str2, str3, (i2 & 32) != 0 ? C10318g.f28635V1 : i, dVar, bVar, z);
        }

        /* renamed from: e */
        public static /* synthetic */ C25107a m80111e(C25107a aVar, long j, Image image, String str, String str2, String str3, int i, C38796a.C38800d dVar, C38796a.C38798b bVar, boolean z, int i2, Object obj) {
            C25107a aVar2 = aVar;
            int i3 = i2;
            return aVar.mo63596d((i3 & 1) != 0 ? aVar2.f64509g : j, (i3 & 2) != 0 ? aVar2.f64510h : image, (i3 & 4) != 0 ? aVar2.f64511i : str, (i3 & 8) != 0 ? aVar2.f64512j : str2, (i3 & 16) != 0 ? aVar2.f64513k : str3, (i3 & 32) != 0 ? aVar2.f64514l : i, (i3 & 64) != 0 ? aVar2.f64515m : dVar, (i3 & 128) != 0 ? aVar2.f64516n : bVar, (i3 & C11398b.f33139r) != 0 ? aVar2.f64517o : z);
        }

        /* renamed from: a */
        public C38796a.C38798b mo63593a() {
            return this.f64516n;
        }

        /* renamed from: b */
        public long mo63594b() {
            return this.f64509g;
        }

        /* renamed from: c */
        public C38796a.C38800d mo63595c() {
            return this.f64515m;
        }

        /* renamed from: d */
        public final C25107a mo63596d(long j, Image image, String str, String str2, String str3, int i, C38796a.C38800d dVar, C38796a.C38798b bVar, boolean z) {
            C41536l.m120489i(image, "icon");
            String str4 = str;
            C41536l.m120489i(str4, "description");
            String str5 = str2;
            C41536l.m120489i(str5, "highLight");
            String str6 = str3;
            C41536l.m120489i(str6, "caption");
            C38796a.C38800d dVar2 = dVar;
            C41536l.m120489i(dVar2, "impressionEvent");
            C38796a.C38798b bVar2 = bVar;
            C41536l.m120489i(bVar2, "clickEvent");
            return new C25107a(j, image, str4, str5, str6, i, dVar2, bVar2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25107a)) {
                return false;
            }
            C25107a aVar = (C25107a) obj;
            return this.f64509g == aVar.f64509g && C41536l.m120484d(this.f64510h, aVar.f64510h) && C41536l.m120484d(this.f64511i, aVar.f64511i) && C41536l.m120484d(this.f64512j, aVar.f64512j) && C41536l.m120484d(this.f64513k, aVar.f64513k) && this.f64514l == aVar.f64514l && C41536l.m120484d(this.f64515m, aVar.f64515m) && C41536l.m120484d(this.f64516n, aVar.f64516n) && this.f64517o == aVar.f64517o;
        }

        /* renamed from: f */
        public final String mo63598f() {
            return this.f64513k;
        }

        /* renamed from: g */
        public final String mo63599g() {
            return this.f64511i;
        }

        /* renamed from: h */
        public final String mo63600h() {
            return this.f64512j;
        }

        public int hashCode() {
            int a = ((((((((((((((C7397t.m28148a(this.f64509g) * 31) + this.f64510h.hashCode()) * 31) + this.f64511i.hashCode()) * 31) + this.f64512j.hashCode()) * 31) + this.f64513k.hashCode()) * 31) + this.f64514l) * 31) + this.f64515m.hashCode()) * 31) + this.f64516n.hashCode()) * 31;
            boolean z = this.f64517o;
            if (z) {
                z = true;
            }
            return a + (z ? 1 : 0);
        }

        /* renamed from: i */
        public Image mo63602i() {
            return this.f64510h;
        }

        /* renamed from: j */
        public boolean mo63603j() {
            return this.f64517o;
        }

        public String toString() {
            long j = this.f64509g;
            Image image = this.f64510h;
            String str = this.f64511i;
            String str2 = this.f64512j;
            String str3 = this.f64513k;
            int i = this.f64514l;
            C38796a.C38800d dVar = this.f64515m;
            C38796a.C38798b bVar = this.f64516n;
            boolean z = this.f64517o;
            return "CaptionTextNboCard(id=" + j + ", icon=" + image + ", description=" + str + ", highLight=" + str2 + ", caption=" + str3 + ", backgroundTintId=" + i + ", impressionEvent=" + dVar + ", clickEvent=" + bVar + ", isDismissButtonVisible=" + z + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25107a(long j, Image image, String str, String str2, String str3, int i, C38796a.C38800d dVar, C38796a.C38798b bVar, boolean z) {
            super(j, image, i, dVar, bVar, z, (DefaultConstructorMarker) null);
            Image image2 = image;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            C38796a.C38800d dVar2 = dVar;
            C38796a.C38798b bVar2 = bVar;
            C41536l.m120489i(image2, "icon");
            C41536l.m120489i(str4, "description");
            C41536l.m120489i(str5, "highLight");
            C41536l.m120489i(str6, "caption");
            C41536l.m120489i(dVar2, "impressionEvent");
            C41536l.m120489i(bVar2, "clickEvent");
            this.f64509g = j;
            this.f64510h = image2;
            this.f64511i = str4;
            this.f64512j = str5;
            this.f64513k = str6;
            this.f64514l = i;
            this.f64515m = dVar2;
            this.f64516n = bVar2;
            this.f64517o = z;
        }
    }

    private C25106f(long j, Image image, int i, C38796a.C38800d dVar, C38796a.C38798b bVar, boolean z) {
        this.f64503a = j;
        this.f64504b = image;
        this.f64505c = i;
        this.f64506d = dVar;
        this.f64507e = bVar;
        this.f64508f = z;
    }
}
