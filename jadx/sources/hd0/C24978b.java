package hd0;

/* renamed from: hd0.b */
public enum C24978b {
    YES("Y"),
    NO("N");
    

    /* renamed from: d */
    private String f64303d;

    private C24978b(String str) {
        this.f64303d = str;
    }

    /* renamed from: b */
    public static C24978b m79846b(Boolean bool) {
        return bool.booleanValue() ? YES : NO;
    }

    /* renamed from: c */
    public boolean mo63390c() {
        return this.f64303d.equals(YES.f64303d);
    }

    /* renamed from: e */
    public String mo63391e() {
        return this.f64303d;
    }
}
