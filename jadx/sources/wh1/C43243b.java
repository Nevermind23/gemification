package wh1;

/* renamed from: wh1.b */
public enum C43243b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");
    

    /* renamed from: d */
    private int f100984d;

    /* renamed from: e */
    private String f100985e;

    private C43243b(int i, String str) {
        this.f100984d = i;
        this.f100985e = str;
    }

    public String toString() {
        return this.f100985e;
    }
}
