package p142k5;

/* renamed from: k5.a */
final class C6810a extends C6812c {

    /* renamed from: a */
    private final Integer f20461a;

    /* renamed from: b */
    private final Object f20462b;

    /* renamed from: c */
    private final C6813d f20463c;

    C6810a(Integer num, Object obj, C6813d dVar) {
        this.f20461a = num;
        if (obj != null) {
            this.f20462b = obj;
            if (dVar != null) {
                this.f20463c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    /* renamed from: a */
    public Integer mo20877a() {
        return this.f20461a;
    }

    /* renamed from: b */
    public Object mo20878b() {
        return this.f20462b;
    }

    /* renamed from: c */
    public C6813d mo20879c() {
        return this.f20463c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6812c)) {
            return false;
        }
        C6812c cVar = (C6812c) obj;
        Integer num = this.f20461a;
        if (num != null ? num.equals(cVar.mo20877a()) : cVar.mo20877a() == null) {
            if (this.f20462b.equals(cVar.mo20878b()) && this.f20463c.equals(cVar.mo20879c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        Integer num = this.f20461a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((((i ^ 1000003) * 1000003) ^ this.f20462b.hashCode()) * 1000003) ^ this.f20463c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f20461a + ", payload=" + this.f20462b + ", priority=" + this.f20463c + "}";
    }
}
