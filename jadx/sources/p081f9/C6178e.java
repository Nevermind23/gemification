package p081f9;

import com.salesforce.marketingcloud.C11398b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: f9.e */
class C6178e implements Closeable {

    /* renamed from: j */
    private static final Logger f19154j = Logger.getLogger(C6178e.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final RandomAccessFile f19155d;

    /* renamed from: e */
    int f19156e;

    /* renamed from: f */
    private int f19157f;

    /* renamed from: g */
    private C6180b f19158g;

    /* renamed from: h */
    private C6180b f19159h;

    /* renamed from: i */
    private final byte[] f19160i = new byte[16];

    /* renamed from: f9.e$a */
    class C6179a implements C6182d {

        /* renamed from: a */
        boolean f19161a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f19162b;

        C6179a(StringBuilder sb) {
            this.f19162b = sb;
        }

        /* renamed from: a */
        public void mo19766a(InputStream inputStream, int i) {
            if (this.f19161a) {
                this.f19161a = false;
            } else {
                this.f19162b.append(", ");
            }
            this.f19162b.append(i);
        }
    }

    /* renamed from: f9.e$b */
    static class C6180b {

        /* renamed from: c */
        static final C6180b f19164c = new C6180b(0, 0);

        /* renamed from: a */
        final int f19165a;

        /* renamed from: b */
        final int f19166b;

        C6180b(int i, int i2) {
            this.f19165a = i;
            this.f19166b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f19165a + ", length = " + this.f19166b + "]";
        }
    }

    /* renamed from: f9.e$c */
    private final class C6181c extends InputStream {

        /* renamed from: d */
        private int f19167d;

        /* renamed from: e */
        private int f19168e;

        /* synthetic */ C6181c(C6178e eVar, C6180b bVar, C6179a aVar) {
            this(bVar);
        }

        public int read(byte[] bArr, int i, int i2) {
            Object unused = C6178e.m24638s(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f19168e;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C6178e.this.m24625Q(this.f19167d, bArr, i, i2);
            this.f19167d = C6178e.this.m24632e0(this.f19167d + i2);
            this.f19168e -= i2;
            return i2;
        }

        private C6181c(C6180b bVar) {
            this.f19167d = C6178e.this.m24632e0(bVar.f19165a + 4);
            this.f19168e = bVar.f19166b;
        }

        public int read() {
            if (this.f19168e == 0) {
                return -1;
            }
            C6178e.this.f19155d.seek((long) this.f19167d);
            int read = C6178e.this.f19155d.read();
            this.f19167d = C6178e.this.m24632e0(this.f19167d + 1);
            this.f19168e--;
            return read;
        }
    }

    /* renamed from: f9.e$d */
    public interface C6182d {
        /* renamed from: a */
        void mo19766a(InputStream inputStream, int i);
    }

    public C6178e(File file) {
        if (!file.exists()) {
            m24637o(file);
        }
        this.f19155d = m24639t(file);
        m24641v();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m24625Q(int i, byte[] bArr, int i2, int i3) {
        int e0 = m24632e0(i);
        int i4 = e0 + i3;
        int i5 = this.f19156e;
        if (i4 <= i5) {
            this.f19155d.seek((long) e0);
            this.f19155d.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - e0;
        this.f19155d.seek((long) e0);
        this.f19155d.readFully(bArr, i2, i6);
        this.f19155d.seek(16);
        this.f19155d.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: R */
    private void m24626R(int i, byte[] bArr, int i2, int i3) {
        int e0 = m24632e0(i);
        int i4 = e0 + i3;
        int i5 = this.f19156e;
        if (i4 <= i5) {
            this.f19155d.seek((long) e0);
            this.f19155d.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - e0;
        this.f19155d.seek((long) e0);
        this.f19155d.write(bArr, i2, i6);
        this.f19155d.seek(16);
        this.f19155d.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: U */
    private void m24627U(int i) {
        this.f19155d.setLength((long) i);
        this.f19155d.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public int m24632e0(int i) {
        int i2 = this.f19156e;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: f0 */
    private void m24633f0(int i, int i2, int i3, int i4) {
        m24636m0(this.f19160i, i, i2, i3, i4);
        this.f19155d.seek(0);
        this.f19155d.write(this.f19160i);
    }

    /* renamed from: h0 */
    private static void m24634h0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: m */
    private void m24635m(int i) {
        int i2 = i + 4;
        int x = m24643x();
        if (x < i2) {
            int i3 = this.f19156e;
            do {
                x += i3;
                i3 <<= 1;
            } while (x < i2);
            m24627U(i3);
            C6180b bVar = this.f19159h;
            int e0 = m24632e0(bVar.f19165a + 4 + bVar.f19166b);
            if (e0 < this.f19158g.f19165a) {
                FileChannel channel = this.f19155d.getChannel();
                channel.position((long) this.f19156e);
                long j = (long) (e0 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f19159h.f19165a;
            int i5 = this.f19158g.f19165a;
            if (i4 < i5) {
                int i6 = (this.f19156e + i4) - 16;
                m24633f0(i3, this.f19157f, i5, i6);
                this.f19159h = new C6180b(i6, this.f19159h.f19166b);
            } else {
                m24633f0(i3, this.f19157f, i5, i4);
            }
            this.f19156e = i3;
        }
    }

    /* renamed from: m0 */
    private static void m24636m0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int h0 : iArr) {
            m24634h0(bArr, i, h0);
            i += 4;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: o */
    private static void m24637o(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile t = m24639t(file2);
        try {
            t.setLength(4096);
            t.seek(0);
            byte[] bArr = new byte[16];
            m24636m0(bArr, 4096, 0, 0, 0);
            t.write(bArr);
            t.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            t.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static Object m24638s(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: t */
    private static RandomAccessFile m24639t(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: u */
    private C6180b m24640u(int i) {
        if (i == 0) {
            return C6180b.f19164c;
        }
        this.f19155d.seek((long) i);
        return new C6180b(i, this.f19155d.readInt());
    }

    /* renamed from: v */
    private void m24641v() {
        this.f19155d.seek(0);
        this.f19155d.readFully(this.f19160i);
        int w = m24642w(this.f19160i, 0);
        this.f19156e = w;
        if (((long) w) <= this.f19155d.length()) {
            this.f19157f = m24642w(this.f19160i, 4);
            int w2 = m24642w(this.f19160i, 8);
            int w3 = m24642w(this.f19160i, 12);
            this.f19158g = m24640u(w2);
            this.f19159h = m24640u(w3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f19156e + ", Actual length: " + this.f19155d.length());
    }

    /* renamed from: w */
    private static int m24642w(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: x */
    private int m24643x() {
        return this.f19156e - mo19757a0();
    }

    /* renamed from: a0 */
    public int mo19757a0() {
        if (this.f19157f == 0) {
            return 16;
        }
        C6180b bVar = this.f19159h;
        int i = bVar.f19165a;
        int i2 = this.f19158g.f19165a;
        if (i >= i2) {
            return (i - i2) + 4 + bVar.f19166b + 16;
        }
        return (((i + 4) + bVar.f19166b) + this.f19156e) - i2;
    }

    public synchronized void close() {
        this.f19155d.close();
    }

    /* renamed from: f */
    public void mo19759f(byte[] bArr) {
        mo19760h(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public synchronized void mo19760h(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        m24638s(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m24635m(i2);
        boolean q = mo19763q();
        if (q) {
            i3 = 16;
        } else {
            C6180b bVar = this.f19159h;
            i3 = m24632e0(bVar.f19165a + 4 + bVar.f19166b);
        }
        C6180b bVar2 = new C6180b(i3, i2);
        m24634h0(this.f19160i, 0, i2);
        m24626R(bVar2.f19165a, this.f19160i, 0, 4);
        m24626R(bVar2.f19165a + 4, bArr, i, i2);
        if (q) {
            i4 = bVar2.f19165a;
        } else {
            i4 = this.f19158g.f19165a;
        }
        m24633f0(this.f19156e, this.f19157f + 1, i4, bVar2.f19165a);
        this.f19159h = bVar2;
        this.f19157f++;
        if (q) {
            this.f19158g = bVar2;
        }
    }

    /* renamed from: k */
    public synchronized void mo19761k() {
        m24633f0(C11398b.f33143v, 0, 0, 0);
        this.f19157f = 0;
        C6180b bVar = C6180b.f19164c;
        this.f19158g = bVar;
        this.f19159h = bVar;
        if (this.f19156e > 4096) {
            m24627U(C11398b.f33143v);
        }
        this.f19156e = C11398b.f33143v;
    }

    /* renamed from: n */
    public synchronized void mo19762n(C6182d dVar) {
        int i = this.f19158g.f19165a;
        for (int i2 = 0; i2 < this.f19157f; i2++) {
            C6180b u = m24640u(i);
            dVar.mo19766a(new C6181c(this, u, (C6179a) null), u.f19166b);
            i = m24632e0(u.f19165a + 4 + u.f19166b);
        }
    }

    /* renamed from: q */
    public synchronized boolean mo19763q() {
        boolean z;
        if (this.f19157f == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f19156e);
        sb.append(", size=");
        sb.append(this.f19157f);
        sb.append(", first=");
        sb.append(this.f19158g);
        sb.append(", last=");
        sb.append(this.f19159h);
        sb.append(", element lengths=[");
        try {
            mo19762n(new C6179a(sb));
        } catch (IOException e) {
            f19154j.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: y */
    public synchronized void mo19765y() {
        if (mo19763q()) {
            throw new NoSuchElementException();
        } else if (this.f19157f == 1) {
            mo19761k();
        } else {
            C6180b bVar = this.f19158g;
            int e0 = m24632e0(bVar.f19165a + 4 + bVar.f19166b);
            m24625Q(e0, this.f19160i, 0, 4);
            int w = m24642w(this.f19160i, 0);
            m24633f0(this.f19156e, this.f19157f - 1, e0, this.f19159h.f19165a);
            this.f19157f--;
            this.f19158g = new C6180b(e0, w);
        }
    }
}
