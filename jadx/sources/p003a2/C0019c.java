package p003a2;

/* renamed from: a2.c */
public enum C0019c {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: d */
    public final String f55d;

    private C0019c(String str) {
        this.f55d = str;
    }

    /* renamed from: b */
    public String mo76b() {
        return ".temp" + this.f55d;
    }

    public String toString() {
        return this.f55d;
    }
}
