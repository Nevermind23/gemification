package p048d2;

/* renamed from: d2.h */
public class C5806h {

    /* renamed from: a */
    private float f18290a;

    /* renamed from: b */
    private int f18291b;

    /* renamed from: a */
    public void mo19009a(float f) {
        float f2 = this.f18290a + f;
        this.f18290a = f2;
        int i = this.f18291b + 1;
        this.f18291b = i;
        if (i == Integer.MAX_VALUE) {
            this.f18290a = f2 / 2.0f;
            this.f18291b = i / 2;
        }
    }
}
