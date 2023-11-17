package p891su;

import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: su.a */
public final class C28261a {

    /* renamed from: a */
    private final long f71726a;

    /* renamed from: b */
    private final String f71727b;

    /* renamed from: c */
    private final String f71728c;

    /* renamed from: d */
    private final String f71729d;

    /* renamed from: e */
    private final String f71730e;

    /* renamed from: f */
    private final String f71731f;

    /* renamed from: g */
    private final C28267d f71732g;

    /* renamed from: h */
    private final List f71733h;

    /* renamed from: i */
    private final C28269e f71734i;

    /* renamed from: j */
    private final long f71735j;

    /* renamed from: k */
    private final boolean f71736k;

    /* renamed from: l */
    private final boolean f71737l;

    /* renamed from: m */
    private final boolean f71738m;

    /* renamed from: n */
    private final boolean f71739n;

    /* renamed from: o */
    private final String f71740o;

    /* renamed from: p */
    private final boolean f71741p;

    /* renamed from: q */
    private final boolean f71742q;

    public C28261a(long j, String str, String str2, String str3, String str4, String str5, C28267d dVar, List list, C28269e eVar, long j2, boolean z, boolean z2, boolean z3, boolean z4, String str6, boolean z5, boolean z6) {
        C41536l.m120489i(list, "accounts");
        C41536l.m120489i(eVar, "connectionType");
        this.f71726a = j;
        this.f71727b = str;
        this.f71728c = str2;
        this.f71729d = str3;
        this.f71730e = str4;
        this.f71731f = str5;
        this.f71732g = dVar;
        this.f71733h = list;
        this.f71734i = eVar;
        this.f71735j = j2;
        this.f71736k = z;
        this.f71737l = z2;
        this.f71738m = z3;
        this.f71739n = z4;
        this.f71740o = str6;
        this.f71741p = z5;
        this.f71742q = z6;
    }

    /* renamed from: b */
    public static /* synthetic */ C28261a m86864b(C28261a aVar, long j, String str, String str2, String str3, String str4, String str5, C28267d dVar, List list, C28269e eVar, long j2, boolean z, boolean z2, boolean z3, boolean z4, String str6, boolean z5, boolean z6, int i, Object obj) {
        C28261a aVar2 = aVar;
        int i2 = i;
        return aVar.mo67844a((i2 & 1) != 0 ? aVar2.f71726a : j, (i2 & 2) != 0 ? aVar2.f71727b : str, (i2 & 4) != 0 ? aVar2.f71728c : str2, (i2 & 8) != 0 ? aVar2.f71729d : str3, (i2 & 16) != 0 ? aVar2.f71730e : str4, (i2 & 32) != 0 ? aVar2.f71731f : str5, (i2 & 64) != 0 ? aVar2.f71732g : dVar, (i2 & 128) != 0 ? aVar2.f71733h : list, (i2 & C11398b.f33139r) != 0 ? aVar2.f71734i : eVar, (i2 & C11398b.f33140s) != 0 ? aVar2.f71735j : j2, (i2 & C11398b.f33141t) != 0 ? aVar2.f71736k : z, (i2 & C11398b.f33142u) != 0 ? aVar2.f71737l : z2, (i2 & C11398b.f33143v) != 0 ? aVar2.f71738m : z3, (i2 & 8192) != 0 ? aVar2.f71739n : z4, (i2 & 16384) != 0 ? aVar2.f71740o : str6, (i2 & 32768) != 0 ? aVar2.f71741p : z5, (i2 & 65536) != 0 ? aVar2.f71742q : z6);
    }

    /* renamed from: a */
    public final C28261a mo67844a(long j, String str, String str2, String str3, String str4, String str5, C28267d dVar, List list, C28269e eVar, long j2, boolean z, boolean z2, boolean z3, boolean z4, String str6, boolean z5, boolean z6) {
        long j3 = j;
        C41536l.m120489i(list, "accounts");
        C41536l.m120489i(eVar, "connectionType");
        return new C28261a(j, str, str2, str3, str4, str5, dVar, list, eVar, j2, z, z2, z3, z4, str6, z5, z6);
    }

    /* renamed from: c */
    public final List mo67845c() {
        return this.f71733h;
    }

    /* renamed from: d */
    public final C28267d mo67846d() {
        return this.f71732g;
    }

    /* renamed from: e */
    public final boolean mo67847e() {
        return this.f71737l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28261a)) {
            return false;
        }
        C28261a aVar = (C28261a) obj;
        return this.f71726a == aVar.f71726a && C41536l.m120484d(this.f71727b, aVar.f71727b) && C41536l.m120484d(this.f71728c, aVar.f71728c) && C41536l.m120484d(this.f71729d, aVar.f71729d) && C41536l.m120484d(this.f71730e, aVar.f71730e) && C41536l.m120484d(this.f71731f, aVar.f71731f) && this.f71732g == aVar.f71732g && C41536l.m120484d(this.f71733h, aVar.f71733h) && this.f71734i == aVar.f71734i && this.f71735j == aVar.f71735j && this.f71736k == aVar.f71736k && this.f71737l == aVar.f71737l && this.f71738m == aVar.f71738m && this.f71739n == aVar.f71739n && C41536l.m120484d(this.f71740o, aVar.f71740o) && this.f71741p == aVar.f71741p && this.f71742q == aVar.f71742q;
    }

    /* renamed from: f */
    public final boolean mo67849f() {
        return this.f71742q;
    }

    /* renamed from: g */
    public final C28269e mo67850g() {
        return this.f71734i;
    }

    /* renamed from: h */
    public final long mo67851h() {
        return this.f71735j;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f71726a) * 31;
        String str = this.f71727b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71728c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71729d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f71730e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f71731f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C28267d dVar = this.f71732g;
        int hashCode6 = (((((((hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f71733h.hashCode()) * 31) + this.f71734i.hashCode()) * 31) + C7397t.m28148a(this.f71735j)) * 31;
        boolean z = this.f71736k;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f71737l;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f71738m;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f71739n;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        String str6 = this.f71740o;
        if (str6 != null) {
            i = str6.hashCode();
        }
        int i6 = (i5 + i) * 31;
        boolean z6 = this.f71741p;
        if (z6) {
            z6 = true;
        }
        int i7 = (i6 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f71742q;
        if (!z7) {
            z2 = z7;
        }
        return i7 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo67853i() {
        return this.f71727b;
    }

    /* renamed from: j */
    public final String mo67854j() {
        return this.f71729d;
    }

    /* renamed from: k */
    public final String mo67855k() {
        return this.f71728c;
    }

    /* renamed from: l */
    public final boolean mo67856l() {
        return this.f71736k;
    }

    /* renamed from: m */
    public final long mo67857m() {
        return this.f71726a;
    }

    /* renamed from: n */
    public final String mo67858n() {
        return this.f71730e;
    }

    /* renamed from: o */
    public final String mo67859o() {
        return this.f71740o;
    }

    /* renamed from: p */
    public final String mo67860p() {
        return this.f71731f;
    }

    /* renamed from: q */
    public final boolean mo67861q() {
        if (this.f71732g == C28267d.BANK_OF_GEORGIA && this.f71734i == C28269e.PHYSICAL_PERSON) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean mo67862r() {
        return this.f71741p;
    }

    /* renamed from: s */
    public final boolean mo67863s() {
        return this.f71739n;
    }

    /* renamed from: t */
    public final boolean mo67864t() {
        return this.f71734i == C28269e.BUDGET;
    }

    public String toString() {
        long j = this.f71726a;
        String str = this.f71727b;
        String str2 = this.f71728c;
        String str3 = this.f71729d;
        String str4 = this.f71730e;
        String str5 = this.f71731f;
        C28267d dVar = this.f71732g;
        List list = this.f71733h;
        C28269e eVar = this.f71734i;
        long j2 = this.f71735j;
        boolean z = this.f71736k;
        boolean z2 = this.f71737l;
        boolean z3 = this.f71738m;
        boolean z4 = this.f71739n;
        String str6 = this.f71740o;
        boolean z5 = this.f71741p;
        boolean z6 = this.f71742q;
        return "Contact(id=" + j + ", fullName=" + str + ", fullNameGe=" + str2 + ", fullNameEn=" + str3 + ", nickName=" + str4 + ", profilePicture=" + str5 + ", bank=" + dVar + ", accounts=" + list + ", connectionType=" + eVar + ", firstInteractionDate=" + j2 + ", hasCustomPhoto=" + z + ", canRequestMoney=" + z2 + ", isTrusted=" + z3 + ", isPrimary=" + z4 + ", phoneNumber=" + str6 + ", isPhoneChangeAvailable=" + z5 + ", canTrust=" + z6 + ")";
    }

    /* renamed from: u */
    public final boolean mo67866u() {
        return this.f71738m;
    }
}
