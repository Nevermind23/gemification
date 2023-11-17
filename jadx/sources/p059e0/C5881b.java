package p059e0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: e0.b */
public final class C5881b extends C5882c {
    /* renamed from: h */
    public static C5881b m23665h(ByteBuffer byteBuffer) {
        return m23666i(byteBuffer, new C5881b());
    }

    /* renamed from: i */
    public static C5881b m23666i(ByteBuffer byteBuffer, C5881b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.mo19232f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public C5881b mo19232f(int i, ByteBuffer byteBuffer) {
        mo19233g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void mo19233g(int i, ByteBuffer byteBuffer) {
        mo19239c(i, byteBuffer);
    }

    /* renamed from: j */
    public C5880a mo19234j(C5880a aVar, int i) {
        int b = mo19238b(6);
        if (b != 0) {
            return aVar.mo19223f(mo19237a(mo19240d(b) + (i * 4)), this.f18470b);
        }
        return null;
    }

    /* renamed from: k */
    public int mo19235k() {
        int b = mo19238b(6);
        if (b != 0) {
            return mo19241e(b);
        }
        return 0;
    }

    /* renamed from: l */
    public int mo19236l() {
        int b = mo19238b(4);
        if (b != 0) {
            return this.f18470b.getInt(b + this.f18469a);
        }
        return 0;
    }
}
