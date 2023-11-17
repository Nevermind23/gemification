package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e */
public class C1781e implements C1821p {

    /* renamed from: a */
    final C1821p f5320a;

    /* renamed from: b */
    int f5321b = 0;

    /* renamed from: c */
    int f5322c = -1;

    /* renamed from: d */
    int f5323d = -1;

    /* renamed from: e */
    Object f5324e = null;

    public C1781e(C1821p pVar) {
        this.f5320a = pVar;
    }

    /* renamed from: a */
    public void mo5893a(int i, int i2) {
        int i3;
        if (this.f5321b == 1 && i >= (i3 = this.f5322c)) {
            int i4 = this.f5323d;
            if (i <= i3 + i4) {
                this.f5323d = i4 + i2;
                this.f5322c = Math.min(i, i3);
                return;
            }
        }
        mo5915e();
        this.f5322c = i;
        this.f5323d = i2;
        this.f5321b = 1;
    }

    /* renamed from: b */
    public void mo5894b(int i, int i2) {
        int i3;
        if (this.f5321b != 2 || (i3 = this.f5322c) < i || i3 > i + i2) {
            mo5915e();
            this.f5322c = i;
            this.f5323d = i2;
            this.f5321b = 2;
            return;
        }
        this.f5323d += i2;
        this.f5322c = i;
    }

    /* renamed from: c */
    public void mo5895c(int i, int i2, Object obj) {
        int i3;
        if (this.f5321b == 3) {
            int i4 = this.f5322c;
            int i5 = this.f5323d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f5324e == obj) {
                this.f5322c = Math.min(i, i4);
                this.f5323d = Math.max(i5 + i4, i3) - this.f5322c;
                return;
            }
        }
        mo5915e();
        this.f5322c = i;
        this.f5323d = i2;
        this.f5324e = obj;
        this.f5321b = 3;
    }

    /* renamed from: d */
    public void mo5896d(int i, int i2) {
        mo5915e();
        this.f5320a.mo5896d(i, i2);
    }

    /* renamed from: e */
    public void mo5915e() {
        int i = this.f5321b;
        if (i != 0) {
            if (i == 1) {
                this.f5320a.mo5893a(this.f5322c, this.f5323d);
            } else if (i == 2) {
                this.f5320a.mo5894b(this.f5322c, this.f5323d);
            } else if (i == 3) {
                this.f5320a.mo5895c(this.f5322c, this.f5323d, this.f5324e);
            }
            this.f5324e = null;
            this.f5321b = 0;
        }
    }
}
