package kj0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: kj0.a */
public final class C25740a {

    /* renamed from: a */
    private final long f65500a;

    /* renamed from: b */
    private final long f65501b;

    /* renamed from: c */
    private final String f65502c;

    /* renamed from: d */
    private final String f65503d;

    /* renamed from: e */
    private final String f65504e;

    /* renamed from: f */
    private final Image f65505f;

    /* renamed from: g */
    private final String f65506g;

    /* renamed from: h */
    private final List f65507h;

    /* renamed from: i */
    private final List f65508i;

    public C25740a(long j, long j2, String str, String str2, String str3, Image image, String str4, List list, List list2) {
        C41536l.m120489i(str3, "name");
        C41536l.m120489i(image, "image");
        this.f65500a = j;
        this.f65501b = j2;
        this.f65502c = str;
        this.f65503d = str2;
        this.f65504e = str3;
        this.f65505f = image;
        this.f65506g = str4;
        this.f65507h = list;
        this.f65508i = list2;
    }

    /* renamed from: a */
    public final long mo64313a() {
        return this.f65500a;
    }

    /* renamed from: b */
    public final Image mo64314b() {
        return this.f65505f;
    }

    /* renamed from: c */
    public final String mo64315c() {
        return this.f65504e;
    }

    /* renamed from: d */
    public final List mo64316d() {
        return this.f65508i;
    }

    /* renamed from: e */
    public final List mo64317e() {
        return this.f65507h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25740a)) {
            return false;
        }
        C25740a aVar = (C25740a) obj;
        return this.f65500a == aVar.f65500a && this.f65501b == aVar.f65501b && C41536l.m120484d(this.f65502c, aVar.f65502c) && C41536l.m120484d(this.f65503d, aVar.f65503d) && C41536l.m120484d(this.f65504e, aVar.f65504e) && C41536l.m120484d(this.f65505f, aVar.f65505f) && C41536l.m120484d(this.f65506g, aVar.f65506g) && C41536l.m120484d(this.f65507h, aVar.f65507h) && C41536l.m120484d(this.f65508i, aVar.f65508i);
    }

    /* renamed from: f */
    public final long mo64319f() {
        return this.f65501b;
    }

    /* renamed from: g */
    public final String mo64320g() {
        return this.f65506g;
    }

    /* renamed from: h */
    public final String mo64321h() {
        return this.f65502c;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f65500a) * 31) + C7397t.m28148a(this.f65501b)) * 31;
        String str = this.f65502c;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65503d;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f65504e.hashCode()) * 31) + this.f65505f.hashCode()) * 31;
        String str3 = this.f65506g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f65507h;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f65508i;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final String mo64323i() {
        return this.f65503d;
    }

    public String toString() {
        long j = this.f65500a;
        long j2 = this.f65501b;
        String str = this.f65502c;
        String str2 = this.f65503d;
        String str3 = this.f65504e;
        Image image = this.f65505f;
        String str4 = this.f65506g;
        List list = this.f65507h;
        List list2 = this.f65508i;
        return "GiftCardOfferUiModel(categoryId=" + j + ", offerId=" + j2 + ", offerNameEn=" + str + ", offerNameGe=" + str2 + ", name=" + str3 + ", image=" + image + ", offerLogStorageUrl=" + str4 + ", offerBrandListGe=" + list + ", offerBrandListEn=" + list2 + ")";
    }
}
