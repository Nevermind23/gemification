package p059e0;

import java.nio.ByteBuffer;

/* renamed from: e0.c */
public abstract class C5882c {

    /* renamed from: a */
    protected int f18469a;

    /* renamed from: b */
    protected ByteBuffer f18470b;

    /* renamed from: c */
    private int f18471c;

    /* renamed from: d */
    private int f18472d;

    /* renamed from: e */
    C5883d f18473e = C5883d.m23677a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo19237a(int i) {
        return i + this.f18470b.getInt(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo19238b(int i) {
        if (i < this.f18472d) {
            return this.f18470b.getShort(this.f18471c + i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo19239c(int i, ByteBuffer byteBuffer) {
        this.f18470b = byteBuffer;
        if (byteBuffer != null) {
            this.f18469a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f18471c = i2;
            this.f18472d = this.f18470b.getShort(i2);
            return;
        }
        this.f18469a = 0;
        this.f18471c = 0;
        this.f18472d = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo19240d(int i) {
        int i2 = i + this.f18469a;
        return i2 + this.f18470b.getInt(i2) + 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo19241e(int i) {
        int i2 = i + this.f18469a;
        return this.f18470b.getInt(i2 + this.f18470b.getInt(i2));
    }
}
