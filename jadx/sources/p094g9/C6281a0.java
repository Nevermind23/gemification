package p094g9;

import p094g9.C6335d0;

/* renamed from: g9.a0 */
final class C6281a0 extends C6335d0.C6338c {

    /* renamed from: a */
    private final String f19411a;

    /* renamed from: b */
    private final String f19412b;

    /* renamed from: c */
    private final boolean f19413c;

    C6281a0(String str, String str2, boolean z) {
        if (str != null) {
            this.f19411a = str;
            if (str2 != null) {
                this.f19412b = str2;
                this.f19413c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    /* renamed from: b */
    public boolean mo19926b() {
        return this.f19413c;
    }

    /* renamed from: c */
    public String mo19927c() {
        return this.f19412b;
    }

    /* renamed from: d */
    public String mo19928d() {
        return this.f19411a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6335d0.C6338c)) {
            return false;
        }
        C6335d0.C6338c cVar = (C6335d0.C6338c) obj;
        if (!this.f19411a.equals(cVar.mo19928d()) || !this.f19412b.equals(cVar.mo19927c()) || this.f19413c != cVar.mo19926b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f19411a.hashCode() ^ 1000003) * 1000003) ^ this.f19412b.hashCode()) * 1000003;
        if (this.f19413c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f19411a + ", osCodeName=" + this.f19412b + ", isRooted=" + this.f19413c + "}";
    }
}
