package p094g9;

import p094g9.C6335d0;

/* renamed from: g9.z */
final class C6396z extends C6335d0.C6337b {

    /* renamed from: a */
    private final int f19625a;

    /* renamed from: b */
    private final String f19626b;

    /* renamed from: c */
    private final int f19627c;

    /* renamed from: d */
    private final long f19628d;

    /* renamed from: e */
    private final long f19629e;

    /* renamed from: f */
    private final boolean f19630f;

    /* renamed from: g */
    private final int f19631g;

    /* renamed from: h */
    private final String f19632h;

    /* renamed from: i */
    private final String f19633i;

    C6396z(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f19625a = i;
        if (str != null) {
            this.f19626b = str;
            this.f19627c = i2;
            this.f19628d = j;
            this.f19629e = j2;
            this.f19630f = z;
            this.f19631g = i3;
            if (str2 != null) {
                this.f19632h = str2;
                if (str3 != null) {
                    this.f19633i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    /* renamed from: a */
    public int mo20211a() {
        return this.f19625a;
    }

    /* renamed from: b */
    public int mo20212b() {
        return this.f19627c;
    }

    /* renamed from: d */
    public long mo20213d() {
        return this.f19629e;
    }

    /* renamed from: e */
    public boolean mo20214e() {
        return this.f19630f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6335d0.C6337b)) {
            return false;
        }
        C6335d0.C6337b bVar = (C6335d0.C6337b) obj;
        if (this.f19625a == bVar.mo20211a() && this.f19626b.equals(bVar.mo20216g()) && this.f19627c == bVar.mo20212b() && this.f19628d == bVar.mo20219j() && this.f19629e == bVar.mo20213d() && this.f19630f == bVar.mo20214e() && this.f19631g == bVar.mo20218i() && this.f19632h.equals(bVar.mo20215f()) && this.f19633i.equals(bVar.mo20217h())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo20215f() {
        return this.f19632h;
    }

    /* renamed from: g */
    public String mo20216g() {
        return this.f19626b;
    }

    /* renamed from: h */
    public String mo20217h() {
        return this.f19633i;
    }

    public int hashCode() {
        int i;
        long j = this.f19628d;
        long j2 = this.f19629e;
        int hashCode = (((((((((this.f19625a ^ 1000003) * 1000003) ^ this.f19626b.hashCode()) * 1000003) ^ this.f19627c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f19630f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f19631g) * 1000003) ^ this.f19632h.hashCode()) * 1000003) ^ this.f19633i.hashCode();
    }

    /* renamed from: i */
    public int mo20218i() {
        return this.f19631g;
    }

    /* renamed from: j */
    public long mo20219j() {
        return this.f19628d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f19625a + ", model=" + this.f19626b + ", availableProcessors=" + this.f19627c + ", totalRam=" + this.f19628d + ", diskSpace=" + this.f19629e + ", isEmulator=" + this.f19630f + ", state=" + this.f19631g + ", manufacturer=" + this.f19632h + ", modelClass=" + this.f19633i + "}";
    }
}
