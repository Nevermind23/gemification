package f61;

import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: f61.c */
public final class C31931c {

    /* renamed from: a */
    private final long f78689a;

    /* renamed from: b */
    private final String f78690b;

    /* renamed from: c */
    private final String f78691c;

    /* renamed from: d */
    private final String f78692d;

    /* renamed from: e */
    private final String f78693e;

    /* renamed from: f */
    private final C31928b f78694f;

    /* renamed from: g */
    private final C31928b f78695g;

    /* renamed from: h */
    private final C31927a f78696h;

    /* renamed from: i */
    private final String f78697i;

    /* renamed from: j */
    private final String f78698j;

    /* renamed from: k */
    private final String f78699k;

    /* renamed from: l */
    private final String f78700l;

    /* renamed from: m */
    private final String f78701m;

    /* renamed from: n */
    private final String f78702n;

    /* renamed from: o */
    private final String f78703o;

    /* renamed from: p */
    private final boolean f78704p;

    /* renamed from: q */
    private final C31934f f78705q;

    public C31931c(long j, String str, String str2, String str3, String str4, C31928b bVar, C31928b bVar2, C31927a aVar, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, C31934f fVar) {
        C31934f fVar2 = fVar;
        C41536l.m120489i(aVar, "buttonType");
        C41536l.m120489i(fVar2, "storyType");
        this.f78689a = j;
        this.f78690b = str;
        this.f78691c = str2;
        this.f78692d = str3;
        this.f78693e = str4;
        this.f78694f = bVar;
        this.f78695g = bVar2;
        this.f78696h = aVar;
        this.f78697i = str5;
        this.f78698j = str6;
        this.f78699k = str7;
        this.f78700l = str8;
        this.f78701m = str9;
        this.f78702n = str10;
        this.f78703o = str11;
        this.f78704p = z;
        this.f78705q = fVar2;
    }

    /* renamed from: b */
    public static /* synthetic */ C31931c m94284b(C31931c cVar, long j, String str, String str2, String str3, String str4, C31928b bVar, C31928b bVar2, C31927a aVar, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, C31934f fVar, int i, Object obj) {
        C31931c cVar2 = cVar;
        int i2 = i;
        return cVar.mo72382a((i2 & 1) != 0 ? cVar2.f78689a : j, (i2 & 2) != 0 ? cVar2.f78690b : str, (i2 & 4) != 0 ? cVar2.f78691c : str2, (i2 & 8) != 0 ? cVar2.f78692d : str3, (i2 & 16) != 0 ? cVar2.f78693e : str4, (i2 & 32) != 0 ? cVar2.f78694f : bVar, (i2 & 64) != 0 ? cVar2.f78695g : bVar2, (i2 & 128) != 0 ? cVar2.f78696h : aVar, (i2 & C11398b.f33139r) != 0 ? cVar2.f78697i : str5, (i2 & C11398b.f33140s) != 0 ? cVar2.f78698j : str6, (i2 & C11398b.f33141t) != 0 ? cVar2.f78699k : str7, (i2 & C11398b.f33142u) != 0 ? cVar2.f78700l : str8, (i2 & C11398b.f33143v) != 0 ? cVar2.f78701m : str9, (i2 & 8192) != 0 ? cVar2.f78702n : str10, (i2 & 16384) != 0 ? cVar2.f78703o : str11, (i2 & 32768) != 0 ? cVar2.f78704p : z, (i2 & 65536) != 0 ? cVar2.f78705q : fVar);
    }

    /* renamed from: a */
    public final C31931c mo72382a(long j, String str, String str2, String str3, String str4, C31928b bVar, C31928b bVar2, C31927a aVar, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, C31934f fVar) {
        long j2 = j;
        C41536l.m120489i(aVar, "buttonType");
        C41536l.m120489i(fVar, "storyType");
        return new C31931c(j, str, str2, str3, str4, bVar, bVar2, aVar, str5, str6, str7, str8, str9, str10, str11, z, fVar);
    }

    /* renamed from: c */
    public final String mo72383c() {
        return this.f78698j;
    }

    /* renamed from: d */
    public final String mo72384d() {
        return this.f78697i;
    }

    /* renamed from: e */
    public final String mo72385e() {
        return this.f78693e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31931c)) {
            return false;
        }
        C31931c cVar = (C31931c) obj;
        return this.f78689a == cVar.f78689a && C41536l.m120484d(this.f78690b, cVar.f78690b) && C41536l.m120484d(this.f78691c, cVar.f78691c) && C41536l.m120484d(this.f78692d, cVar.f78692d) && C41536l.m120484d(this.f78693e, cVar.f78693e) && C41536l.m120484d(this.f78694f, cVar.f78694f) && C41536l.m120484d(this.f78695g, cVar.f78695g) && this.f78696h == cVar.f78696h && C41536l.m120484d(this.f78697i, cVar.f78697i) && C41536l.m120484d(this.f78698j, cVar.f78698j) && C41536l.m120484d(this.f78699k, cVar.f78699k) && C41536l.m120484d(this.f78700l, cVar.f78700l) && C41536l.m120484d(this.f78701m, cVar.f78701m) && C41536l.m120484d(this.f78702n, cVar.f78702n) && C41536l.m120484d(this.f78703o, cVar.f78703o) && this.f78704p == cVar.f78704p && C41536l.m120484d(this.f78705q, cVar.f78705q);
    }

    /* renamed from: f */
    public final String mo72387f() {
        return this.f78692d;
    }

    /* renamed from: g */
    public final C31928b mo72388g() {
        return this.f78695g;
    }

    /* renamed from: h */
    public final C31928b mo72389h() {
        return this.f78694f;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f78689a) * 31;
        String str = this.f78690b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f78691c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f78692d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f78693e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C31928b bVar = this.f78694f;
        int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C31928b bVar2 = this.f78695g;
        int hashCode6 = (((hashCode5 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31) + this.f78696h.hashCode()) * 31;
        String str5 = this.f78697i;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f78698j;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f78699k;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f78700l;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f78701m;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f78702n;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f78703o;
        if (str11 != null) {
            i = str11.hashCode();
        }
        int i2 = (hashCode12 + i) * 31;
        boolean z = this.f78704p;
        if (z) {
            z = true;
        }
        return ((i2 + (z ? 1 : 0)) * 31) + this.f78705q.hashCode();
    }

    /* renamed from: i */
    public final String mo72391i() {
        return this.f78691c;
    }

    /* renamed from: j */
    public final String mo72392j() {
        return this.f78690b;
    }

    /* renamed from: k */
    public final String mo72393k() {
        return this.f78700l;
    }

    /* renamed from: l */
    public final String mo72394l() {
        return this.f78699k;
    }

    /* renamed from: m */
    public final String mo72395m() {
        return this.f78701m;
    }

    /* renamed from: n */
    public final String mo72396n() {
        return this.f78702n;
    }

    /* renamed from: o */
    public final long mo72397o() {
        return this.f78689a;
    }

    /* renamed from: p */
    public final String mo72398p() {
        return this.f78703o;
    }

    /* renamed from: q */
    public final boolean mo72399q() {
        return this.f78704p;
    }

    /* renamed from: r */
    public final C31934f mo72400r() {
        return this.f78705q;
    }

    public String toString() {
        long j = this.f78689a;
        String str = this.f78690b;
        String str2 = this.f78691c;
        String str3 = this.f78692d;
        String str4 = this.f78693e;
        C31928b bVar = this.f78694f;
        C31928b bVar2 = this.f78695g;
        C31927a aVar = this.f78696h;
        String str5 = this.f78697i;
        String str6 = this.f78698j;
        String str7 = this.f78699k;
        String str8 = this.f78700l;
        String str9 = this.f78701m;
        String str10 = this.f78702n;
        String str11 = this.f78703o;
        boolean z = this.f78704p;
        C31934f fVar = this.f78705q;
        return "StoryDetails(id=" + j + ", contentTitleGe=" + str + ", contentTitleEn=" + str2 + ", contentDescriptionGe=" + str3 + ", contentDescriptionEn=" + str4 + ", contentLinkGe=" + bVar + ", contentLinkEn=" + bVar2 + ", buttonType=" + aVar + ", buttonTextGe=" + str5 + ", buttonTextEn=" + str6 + ", eventCloseName=" + str7 + ", eventButtonClickName=" + str8 + ", eventViewName=" + str9 + ", geoFileObjectId=" + str10 + ", intFileObjectId=" + str11 + ", seen=" + z + ", storyType=" + fVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31931c(long j, String str, String str2, String str3, String str4, C31928b bVar, C31928b bVar2, C31927a aVar, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, C31934f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, bVar, bVar2, aVar, str5, str6, str7, str8, str9, str10, str11, (i & 32768) != 0 ? false : z, fVar);
    }
}
