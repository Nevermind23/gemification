package a41;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import p394dj.C12132a;

/* renamed from: a41.b */
public final class C30483b {

    /* renamed from: a */
    private final C12132a f76473a;

    /* renamed from: b */
    private final String f76474b;

    /* renamed from: c */
    private final Image f76475c;

    /* renamed from: d */
    private final NewProductHeaderView.C13482a f76476d;

    /* renamed from: e */
    private final long f76477e;

    /* renamed from: f */
    private final Image f76478f;

    public C30483b(C12132a aVar, String str, Image image, NewProductHeaderView.C13482a aVar2, long j, Image image2) {
        C41536l.m120489i(aVar, "headersData");
        C41536l.m120489i(aVar2, "headerType");
        this.f76473a = aVar;
        this.f76474b = str;
        this.f76475c = image;
        this.f76476d = aVar2;
        this.f76477e = j;
        this.f76478f = image2;
    }

    /* renamed from: a */
    public final long mo70820a() {
        return this.f76477e;
    }

    /* renamed from: b */
    public final Image mo70821b() {
        return this.f76478f;
    }

    /* renamed from: c */
    public final NewProductHeaderView.C13482a mo70822c() {
        return this.f76476d;
    }

    /* renamed from: d */
    public final C12132a mo70823d() {
        return this.f76473a;
    }

    /* renamed from: e */
    public final String mo70824e() {
        return this.f76474b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30483b)) {
            return false;
        }
        C30483b bVar = (C30483b) obj;
        return C41536l.m120484d(this.f76473a, bVar.f76473a) && C41536l.m120484d(this.f76474b, bVar.f76474b) && C41536l.m120484d(this.f76475c, bVar.f76475c) && this.f76476d == bVar.f76476d && this.f76477e == bVar.f76477e && C41536l.m120484d(this.f76478f, bVar.f76478f);
    }

    /* renamed from: f */
    public final Image mo70826f() {
        return this.f76475c;
    }

    public int hashCode() {
        int hashCode = this.f76473a.hashCode() * 31;
        String str = this.f76474b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f76475c;
        int hashCode3 = (((((hashCode2 + (image == null ? 0 : image.hashCode())) * 31) + this.f76476d.hashCode()) * 31) + C7397t.m28148a(this.f76477e)) * 31;
        Image image2 = this.f76478f;
        if (image2 != null) {
            i = image2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        C12132a aVar = this.f76473a;
        String str = this.f76474b;
        Image image = this.f76475c;
        NewProductHeaderView.C13482a aVar2 = this.f76476d;
        long j = this.f76477e;
        Image image2 = this.f76478f;
        return "ProductHeaderUiModel(headersData=" + aVar + ", imageUrl=" + str + ", thumbnailImage=" + image + ", headerType=" + aVar2 + ", accKey=" + j + ", circularImage=" + image2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30483b(C12132a aVar, String str, Image image, NewProductHeaderView.C13482a aVar2, long j, Image image2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, (i & 4) != 0 ? null : image, aVar2, j, (i & 32) != 0 ? null : image2);
    }
}
