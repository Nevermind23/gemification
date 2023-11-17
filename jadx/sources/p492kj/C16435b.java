package p492kj;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kj.b */
public final class C16435b {

    /* renamed from: a */
    private final String f46423a;

    /* renamed from: b */
    private final String f46424b;

    /* renamed from: c */
    private final C16440g f46425c;

    /* renamed from: d */
    private final Boolean f46426d;

    public C16435b(String str, String str2, C16440g gVar, Boolean bool) {
        this.f46423a = str;
        this.f46424b = str2;
        this.f46425c = gVar;
        this.f46426d = bool;
    }

    /* renamed from: a */
    public final C16440g mo43565a() {
        return this.f46425c;
    }

    /* renamed from: b */
    public final Boolean mo43566b() {
        return this.f46426d;
    }

    /* renamed from: c */
    public final String mo43567c() {
        return this.f46424b;
    }

    /* renamed from: d */
    public final String mo43568d() {
        return this.f46423a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16435b)) {
            return false;
        }
        C16435b bVar = (C16435b) obj;
        return C41536l.m120484d(this.f46423a, bVar.f46423a) && C41536l.m120484d(this.f46424b, bVar.f46424b) && C41536l.m120484d(this.f46425c, bVar.f46425c) && C41536l.m120484d(this.f46426d, bVar.f46426d);
    }

    public int hashCode() {
        String str = this.f46423a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f46424b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C16440g gVar = this.f46425c;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.f46426d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f46423a;
        String str2 = this.f46424b;
        C16440g gVar = this.f46425c;
        Boolean bool = this.f46426d;
        return "StatisticsHeaderData(title=" + str + ", subTitle=" + str2 + ", actionButton=" + gVar + ", allowMultiLineSubTitle=" + bool + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16435b(String str, String str2, C16440g gVar, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : gVar, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
