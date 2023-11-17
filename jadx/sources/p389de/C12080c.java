package p389de;

import com.github.mikephil.charting.utils.Utils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.Random;

/* renamed from: de.c */
class C12080c {

    /* renamed from: b */
    private static final Random f35515b = new Random();

    /* renamed from: a */
    private final ByteBuffer f35516a;

    C12080c(C12075a aVar) {
        Objects.requireNonNull(aVar);
        this.f35516a = ByteBuffer.allocateDirect(aVar.mo32231f() * 1).order(ByteOrder.nativeOrder());
        double f = 3.141592653589793d / (((double) aVar.mo32231f()) / 2.0d);
        double d = Utils.DOUBLE_EPSILON;
        while (this.f35516a.hasRemaining()) {
            d += 1.0d;
            short sin = (short) ((int) (Math.sin(d * f) * 10.0d));
            this.f35516a.put((byte) sin);
            this.f35516a.put((byte) (sin >> 8));
        }
        this.f35516a.rewind();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32239a(ByteBuffer byteBuffer) {
        this.f35516a.clear();
        if (this.f35516a.capacity() == byteBuffer.remaining()) {
            this.f35516a.position(0);
        } else {
            ByteBuffer byteBuffer2 = this.f35516a;
            byteBuffer2.position(f35515b.nextInt(byteBuffer2.capacity() - byteBuffer.remaining()));
        }
        ByteBuffer byteBuffer3 = this.f35516a;
        byteBuffer3.limit(byteBuffer3.position() + byteBuffer.remaining());
        byteBuffer.put(this.f35516a);
    }
}
