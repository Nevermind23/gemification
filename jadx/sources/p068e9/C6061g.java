package p068e9;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: e9.g */
class C6061g {

    /* renamed from: a */
    private static final AtomicLong f18850a = new AtomicLong(0);

    /* renamed from: b */
    private static String f18851b;

    C6061g(C6114w wVar) {
        byte[] bArr = new byte[10];
        m24204e(bArr);
        m24203d(bArr);
        m24202c(bArr);
        String C = C6063h.m24208C(wVar.mo19643a());
        String w = C6063h.m24232w(bArr);
        Locale locale = Locale.US;
        f18851b = String.format(locale, "%s%s%s%s", new Object[]{w.substring(0, 12), w.substring(12, 16), w.subSequence(16, 20), C.substring(0, 12)}).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m24200a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m24201b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m24202c(byte[] bArr) {
        byte[] b = m24201b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: d */
    private void m24203d(byte[] bArr) {
        byte[] b = m24201b(f18850a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: e */
    private void m24204e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m24200a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m24201b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f18851b;
    }
}
