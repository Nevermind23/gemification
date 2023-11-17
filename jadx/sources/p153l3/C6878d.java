package p153l3;

import android.util.Log;
import com.salesforce.marketingcloud.C11398b;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: l3.d */
public class C6878d {

    /* renamed from: a */
    private final byte[] f20579a = new byte[C11398b.f33139r];

    /* renamed from: b */
    private ByteBuffer f20580b;

    /* renamed from: c */
    private C6877c f20581c;

    /* renamed from: d */
    private int f20582d = 0;

    /* renamed from: b */
    private boolean m26684b() {
        return this.f20581c.f20567b != 0;
    }

    /* renamed from: d */
    private int m26685d() {
        try {
            return this.f20580b.get() & 255;
        } catch (Exception unused) {
            this.f20581c.f20567b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m26686e() {
        boolean z;
        this.f20581c.f20569d.f20555a = m26695n();
        this.f20581c.f20569d.f20556b = m26695n();
        this.f20581c.f20569d.f20557c = m26695n();
        this.f20581c.f20569d.f20558d = m26695n();
        int d = m26685d();
        boolean z2 = false;
        if ((d & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C6876b bVar = this.f20581c.f20569d;
        if ((d & 64) != 0) {
            z2 = true;
        }
        bVar.f20559e = z2;
        if (z) {
            bVar.f20565k = m26688g(pow);
        } else {
            bVar.f20565k = null;
        }
        this.f20581c.f20569d.f20564j = this.f20580b.position();
        m26698r();
        if (!m26684b()) {
            C6877c cVar = this.f20581c;
            cVar.f20568c++;
            cVar.f20570e.add(cVar.f20569d);
        }
    }

    /* renamed from: f */
    private void m26687f() {
        int d = m26685d();
        this.f20582d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f20582d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f20580b.get(this.f20579a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f20582d, e);
                    }
                    this.f20581c.f20567b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private int[] m26688g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f20580b.get(bArr);
            iArr = new int[C11398b.f33139r];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f20581c.f20567b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m26689h() {
        m26690i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m26690i(int i) {
        boolean z = false;
        while (!z && !m26684b() && this.f20581c.f20568c <= i) {
            int d = m26685d();
            if (d == 33) {
                int d2 = m26685d();
                if (d2 == 1) {
                    m26697q();
                } else if (d2 == 249) {
                    this.f20581c.f20569d = new C6876b();
                    m26691j();
                } else if (d2 == 254) {
                    m26697q();
                } else if (d2 != 255) {
                    m26697q();
                } else {
                    m26687f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f20579a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m26694m();
                    } else {
                        m26697q();
                    }
                }
            } else if (d == 44) {
                C6877c cVar = this.f20581c;
                if (cVar.f20569d == null) {
                    cVar.f20569d = new C6876b();
                }
                m26686e();
            } else if (d != 59) {
                this.f20581c.f20567b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m26691j() {
        m26685d();
        int d = m26685d();
        C6876b bVar = this.f20581c.f20569d;
        int i = (d & 28) >> 2;
        bVar.f20561g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f20561g = 1;
        }
        if ((d & 1) == 0) {
            z = false;
        }
        bVar.f20560f = z;
        int n = m26695n();
        if (n < 2) {
            n = 10;
        }
        C6876b bVar2 = this.f20581c.f20569d;
        bVar2.f20563i = n * 10;
        bVar2.f20562h = m26685d();
        m26685d();
    }

    /* renamed from: k */
    private void m26692k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m26685d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f20581c.f20567b = 1;
            return;
        }
        m26693l();
        if (this.f20581c.f20573h && !m26684b()) {
            C6877c cVar = this.f20581c;
            cVar.f20566a = m26688g(cVar.f20574i);
            C6877c cVar2 = this.f20581c;
            cVar2.f20577l = cVar2.f20566a[cVar2.f20575j];
        }
    }

    /* renamed from: l */
    private void m26693l() {
        boolean z;
        this.f20581c.f20571f = m26695n();
        this.f20581c.f20572g = m26695n();
        int d = m26685d();
        C6877c cVar = this.f20581c;
        if ((d & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        cVar.f20573h = z;
        cVar.f20574i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f20581c.f20575j = m26685d();
        this.f20581c.f20576k = m26685d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26694m() {
        /*
            r3 = this;
        L_0x0000:
            r3.m26687f()
            byte[] r0 = r3.f20579a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            l3.c r2 = r3.f20581c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f20578m = r0
        L_0x001b:
            int r0 = r3.f20582d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.m26684b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l3.C6878d.m26694m():void");
    }

    /* renamed from: n */
    private int m26695n() {
        return this.f20580b.getShort();
    }

    /* renamed from: o */
    private void m26696o() {
        this.f20580b = null;
        Arrays.fill(this.f20579a, (byte) 0);
        this.f20581c = new C6877c();
        this.f20582d = 0;
    }

    /* renamed from: q */
    private void m26697q() {
        int d;
        do {
            d = m26685d();
            this.f20580b.position(Math.min(this.f20580b.position() + d, this.f20580b.limit()));
        } while (d > 0);
    }

    /* renamed from: r */
    private void m26698r() {
        m26685d();
        m26697q();
    }

    /* renamed from: a */
    public void mo20968a() {
        this.f20580b = null;
        this.f20581c = null;
    }

    /* renamed from: c */
    public C6877c mo20969c() {
        if (this.f20580b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m26684b()) {
            return this.f20581c;
        } else {
            m26692k();
            if (!m26684b()) {
                m26689h();
                C6877c cVar = this.f20581c;
                if (cVar.f20568c < 0) {
                    cVar.f20567b = 1;
                }
            }
            return this.f20581c;
        }
    }

    /* renamed from: p */
    public C6878d mo20970p(ByteBuffer byteBuffer) {
        m26696o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f20580b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f20580b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
