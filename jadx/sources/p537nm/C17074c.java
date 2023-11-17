package p537nm;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: nm.c */
public final class C17074c {

    /* renamed from: a */
    private final C17077d f47717a;

    /* renamed from: b */
    private final String f47718b;

    /* renamed from: c */
    private final C17088i f47719c;

    /* renamed from: d */
    private final String f47720d;

    /* renamed from: e */
    private final String f47721e;

    /* renamed from: f */
    private final boolean f47722f;

    /* renamed from: g */
    private final List f47723g;

    public C17074c(C17077d dVar, String str, C17088i iVar, String str2, String str3, boolean z, List list) {
        C41536l.m120489i(dVar, "cardAppTypeInfo");
        this.f47717a = dVar;
        this.f47718b = str;
        this.f47719c = iVar;
        this.f47720d = str2;
        this.f47721e = str3;
        this.f47722f = z;
        this.f47723g = list;
    }

    /* renamed from: a */
    public final C17077d mo44287a() {
        return this.f47717a;
    }

    /* renamed from: b */
    public final List mo44288b() {
        return this.f47723g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17074c)) {
            return false;
        }
        C17074c cVar = (C17074c) obj;
        return C41536l.m120484d(this.f47717a, cVar.f47717a) && C41536l.m120484d(this.f47718b, cVar.f47718b) && this.f47719c == cVar.f47719c && C41536l.m120484d(this.f47720d, cVar.f47720d) && C41536l.m120484d(this.f47721e, cVar.f47721e) && this.f47722f == cVar.f47722f && C41536l.m120484d(this.f47723g, cVar.f47723g);
    }

    public int hashCode() {
        int hashCode = this.f47717a.hashCode() * 31;
        String str = this.f47718b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C17088i iVar = this.f47719c;
        int hashCode3 = (hashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str2 = this.f47720d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f47721e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.f47722f;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        List list = this.f47723g;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        C17077d dVar = this.f47717a;
        String str = this.f47718b;
        C17088i iVar = this.f47719c;
        String str2 = this.f47720d;
        String str3 = this.f47721e;
        boolean z = this.f47722f;
        List list = this.f47723g;
        return "CardApplicationTypeDetails(cardAppTypeInfo=" + dVar + ", clientCountry=" + str + ", cardOrderAgreementStatus=" + iVar + ", countryNameGe=" + str2 + ", countryNameEn=" + str3 + ", showInstantCard=" + z + ", regions=" + list + ")";
    }
}
