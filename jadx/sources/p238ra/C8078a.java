package p238ra;

/* renamed from: ra.a */
final class C8078a extends C8083f {

    /* renamed from: a */
    private final String f23239a;

    /* renamed from: b */
    private final String f23240b;

    C8078a(String str, String str2) {
        if (str != null) {
            this.f23239a = str;
            if (str2 != null) {
                this.f23240b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    /* renamed from: b */
    public String mo23260b() {
        return this.f23239a;
    }

    /* renamed from: c */
    public String mo23261c() {
        return this.f23240b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8083f)) {
            return false;
        }
        C8083f fVar = (C8083f) obj;
        if (!this.f23239a.equals(fVar.mo23260b()) || !this.f23240b.equals(fVar.mo23261c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f23239a.hashCode() ^ 1000003) * 1000003) ^ this.f23240b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f23239a + ", version=" + this.f23240b + "}";
    }
}
