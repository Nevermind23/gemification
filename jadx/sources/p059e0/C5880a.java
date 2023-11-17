package p059e0;

import java.nio.ByteBuffer;

/* renamed from: e0.a */
public final class C5880a extends C5882c {
    /* renamed from: f */
    public C5880a mo19223f(int i, ByteBuffer byteBuffer) {
        mo19224g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void mo19224g(int i, ByteBuffer byteBuffer) {
        mo19239c(i, byteBuffer);
    }

    /* renamed from: h */
    public int mo19225h(int i) {
        int b = mo19238b(16);
        if (b != 0) {
            return this.f18470b.getInt(mo19240d(b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int mo19226i() {
        int b = mo19238b(16);
        if (b != 0) {
            return mo19241e(b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean mo19227j() {
        int b = mo19238b(6);
        return (b == 0 || this.f18470b.get(b + this.f18469a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short mo19228k() {
        int b = mo19238b(14);
        if (b != 0) {
            return this.f18470b.getShort(b + this.f18469a);
        }
        return 0;
    }

    /* renamed from: l */
    public int mo19229l() {
        int b = mo19238b(4);
        if (b != 0) {
            return this.f18470b.getInt(b + this.f18469a);
        }
        return 0;
    }

    /* renamed from: m */
    public short mo19230m() {
        int b = mo19238b(8);
        if (b != 0) {
            return this.f18470b.getShort(b + this.f18469a);
        }
        return 0;
    }

    /* renamed from: n */
    public short mo19231n() {
        int b = mo19238b(12);
        if (b != 0) {
            return this.f18470b.getShort(b + this.f18469a);
        }
        return 0;
    }
}
