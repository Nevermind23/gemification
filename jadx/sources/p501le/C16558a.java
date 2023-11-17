package p501le;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.C41536l;

/* renamed from: le.a */
public abstract class C16558a {
    /* renamed from: a */
    public static final ByteBuffer m58816a(int i) {
        ByteBuffer order = ByteBuffer.allocateDirect(i * 1).order(ByteOrder.nativeOrder());
        order.limit(order.capacity());
        C41536l.m120488h(order, "allocateDirect(size * Egloo.SIZE_OF_BYTE)\n        .order(ByteOrder.nativeOrder())\n        .also { it.limit(it.capacity()) }");
        return order;
    }

    /* renamed from: b */
    public static final FloatBuffer m58817b(int i) {
        FloatBuffer asFloatBuffer = m58816a(i * 4).asFloatBuffer();
        C41536l.m120488h(asFloatBuffer, "byteBuffer(size * Egloo.SIZE_OF_FLOAT).asFloatBuffer()");
        return asFloatBuffer;
    }
}
