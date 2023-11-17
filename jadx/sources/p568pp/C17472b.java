package p568pp;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p554op.C17297b;
import p684yi.C18919a;
import p684yi.C18921c;
import p684yi.C18922d;

/* renamed from: pp.b */
public abstract class C17472b {

    /* renamed from: pp.b$a */
    public static final class C17473a extends C17472b {

        /* renamed from: a */
        private final List f48889a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17473a(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "benefs");
            this.f48889a = list;
        }

        /* renamed from: a */
        public final List mo44981a() {
            return this.f48889a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17473a) && C41536l.m120484d(this.f48889a, ((C17473a) obj).f48889a);
        }

        public int hashCode() {
            return this.f48889a.hashCode();
        }

        public String toString() {
            List list = this.f48889a;
            return "PackageBecomeSoloUiModel(benefs=" + list + ")";
        }
    }

    /* renamed from: pp.b$b */
    public static final class C17474b extends C17472b {

        /* renamed from: a */
        private final String f48890a;

        /* renamed from: b */
        private final String f48891b;

        /* renamed from: c */
        private final String f48892c;

        /* renamed from: d */
        private final String f48893d;

        /* renamed from: e */
        private final String f48894e;

        /* renamed from: f */
        private final String f48895f;

        /* renamed from: g */
        private final Integer f48896g;

        /* renamed from: h */
        private final boolean f48897h;

        /* renamed from: i */
        private final Integer f48898i;

        /* renamed from: j */
        private final Boolean f48899j;

        /* renamed from: k */
        private final C18919a f48900k;

        /* renamed from: l */
        private final C18921c f48901l;

        /* renamed from: m */
        private final List f48902m;

        /* renamed from: n */
        private final List f48903n;

        /* renamed from: o */
        private final C18922d f48904o;

        /* renamed from: p */
        private final C17297b f48905p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17474b(String str, String str2, String str3, String str4, String str5, String str6, Integer num, boolean z, Integer num2, Boolean bool, C18919a aVar, C18921c cVar, List list, List list2, C18922d dVar, C17297b bVar) {
            super((DefaultConstructorMarker) null);
            this.f48890a = str;
            this.f48891b = str2;
            this.f48892c = str3;
            this.f48893d = str4;
            this.f48894e = str5;
            this.f48895f = str6;
            this.f48896g = num;
            this.f48897h = z;
            this.f48898i = num2;
            this.f48899j = bool;
            this.f48900k = aVar;
            this.f48901l = cVar;
            this.f48902m = list;
            this.f48903n = list2;
            this.f48904o = dVar;
            this.f48905p = bVar;
        }

        /* renamed from: a */
        public final Integer mo44985a() {
            return this.f48898i;
        }

        /* renamed from: b */
        public final C18922d mo44986b() {
            return this.f48904o;
        }

        /* renamed from: c */
        public final C17297b mo44987c() {
            return this.f48905p;
        }

        /* renamed from: d */
        public final String mo44988d() {
            return this.f48891b;
        }

        /* renamed from: e */
        public final boolean mo44989e() {
            return this.f48897h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17474b)) {
                return false;
            }
            C17474b bVar = (C17474b) obj;
            return C41536l.m120484d(this.f48890a, bVar.f48890a) && C41536l.m120484d(this.f48891b, bVar.f48891b) && C41536l.m120484d(this.f48892c, bVar.f48892c) && C41536l.m120484d(this.f48893d, bVar.f48893d) && C41536l.m120484d(this.f48894e, bVar.f48894e) && C41536l.m120484d(this.f48895f, bVar.f48895f) && C41536l.m120484d(this.f48896g, bVar.f48896g) && this.f48897h == bVar.f48897h && C41536l.m120484d(this.f48898i, bVar.f48898i) && C41536l.m120484d(this.f48899j, bVar.f48899j) && C41536l.m120484d(this.f48900k, bVar.f48900k) && C41536l.m120484d(this.f48901l, bVar.f48901l) && C41536l.m120484d(this.f48902m, bVar.f48902m) && C41536l.m120484d(this.f48903n, bVar.f48903n) && C41536l.m120484d(this.f48904o, bVar.f48904o) && this.f48905p == bVar.f48905p;
        }

        /* renamed from: f */
        public final C18919a mo44991f() {
            return this.f48900k;
        }

        /* renamed from: g */
        public final List mo44992g() {
            return this.f48903n;
        }

        /* renamed from: h */
        public final C18921c mo44993h() {
            return this.f48901l;
        }

        public int hashCode() {
            String str = this.f48890a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f48891b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f48892c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f48893d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f48894e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f48895f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num = this.f48896g;
            int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            boolean z = this.f48897h;
            if (z) {
                z = true;
            }
            int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
            Integer num2 = this.f48898i;
            int hashCode8 = (i2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.f48899j;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            C18919a aVar = this.f48900k;
            int hashCode10 = (hashCode9 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C18921c cVar = this.f48901l;
            int hashCode11 = (hashCode10 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            List list = this.f48902m;
            int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.f48903n;
            int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
            C18922d dVar = this.f48904o;
            int hashCode14 = (hashCode13 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            C17297b bVar = this.f48905p;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode14 + i;
        }

        /* renamed from: i */
        public final String mo44995i() {
            return this.f48894e;
        }

        /* renamed from: j */
        public final String mo44996j() {
            return this.f48890a;
        }

        /* renamed from: k */
        public final String mo44997k() {
            return this.f48892c;
        }

        /* renamed from: l */
        public final Integer mo44998l() {
            return this.f48896g;
        }

        /* renamed from: m */
        public final Boolean mo44999m() {
            return this.f48899j;
        }

        /* renamed from: n */
        public final List mo45000n() {
            return this.f48902m;
        }

        public String toString() {
            String str = this.f48890a;
            String str2 = this.f48891b;
            String str3 = this.f48892c;
            String str4 = this.f48893d;
            String str5 = this.f48894e;
            String str6 = this.f48895f;
            Integer num = this.f48896g;
            boolean z = this.f48897h;
            Integer num2 = this.f48898i;
            Boolean bool = this.f48899j;
            C18919a aVar = this.f48900k;
            C18921c cVar = this.f48901l;
            List list = this.f48902m;
            List list2 = this.f48903n;
            C18922d dVar = this.f48904o;
            C17297b bVar = this.f48905p;
            return "PackageInfoUiModel(name=" + str + ", description=" + str2 + ", packageGroup=" + str3 + ", feePeriodType=" + str4 + ", monthlyFee=" + str5 + ", yearFee=" + str6 + ", priority=" + num + ", forceWhiteTexts=" + z + ", backgroundColorRes=" + num2 + ", showDefault=" + bool + ", headerData=" + aVar + ", limitInfoData=" + cVar + ", transactions=" + list + ", infoItemsList=" + list2 + ", buttonData=" + dVar + ", buttonState=" + bVar + ")";
        }
    }

    private C17472b() {
    }

    public /* synthetic */ C17472b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
