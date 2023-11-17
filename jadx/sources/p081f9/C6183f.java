package p081f9;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p027b9.C2184f;
import p068e9.C6063h;
import p081f9.C6178e;

/* renamed from: f9.f */
class C6183f implements C6171a {

    /* renamed from: d */
    private static final Charset f19170d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f19171a;

    /* renamed from: b */
    private final int f19172b;

    /* renamed from: c */
    private C6178e f19173c;

    /* renamed from: f9.f$a */
    class C6184a implements C6178e.C6182d {

        /* renamed from: a */
        final /* synthetic */ byte[] f19174a;

        /* renamed from: b */
        final /* synthetic */ int[] f19175b;

        C6184a(byte[] bArr, int[] iArr) {
            this.f19174a = bArr;
            this.f19175b = iArr;
        }

        /* renamed from: a */
        public void mo19766a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f19174a, this.f19175b[0], i);
                int[] iArr = this.f19175b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: f9.f$b */
    private static class C6185b {

        /* renamed from: a */
        public final byte[] f19177a;

        /* renamed from: b */
        public final int f19178b;

        C6185b(byte[] bArr, int i) {
            this.f19177a = bArr;
            this.f19178b = i;
        }
    }

    C6183f(File file, int i) {
        this.f19171a = file;
        this.f19172b = i;
    }

    /* renamed from: f */
    private void m24653f(long j, String str) {
        if (this.f19173c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f19172b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f19173c.mo19759f(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f19170d));
                while (!this.f19173c.mo19763q() && this.f19173c.mo19757a0() > this.f19172b) {
                    this.f19173c.mo19765y();
                }
            } catch (IOException e) {
                C2184f.m8346f().mo7092e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: g */
    private C6185b m24654g() {
        if (!this.f19171a.exists()) {
            return null;
        }
        m24655h();
        C6178e eVar = this.f19173c;
        if (eVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[eVar.mo19757a0()];
        try {
            this.f19173c.mo19762n(new C6184a(bArr, iArr));
        } catch (IOException e) {
            C2184f.m8346f().mo7092e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C6185b(bArr, iArr[0]);
    }

    /* renamed from: h */
    private void m24655h() {
        if (this.f19173c == null) {
            try {
                this.f19173c = new C6178e(this.f19171a);
            } catch (IOException e) {
                C2184f f = C2184f.m8346f();
                f.mo7092e("Could not open log file: " + this.f19171a, e);
            }
        }
    }

    /* renamed from: a */
    public void mo19736a() {
        C6063h.m24214e(this.f19173c, "There was a problem closing the Crashlytics log file.");
        this.f19173c = null;
    }

    /* renamed from: b */
    public String mo19737b() {
        byte[] c = mo19738c();
        if (c != null) {
            return new String(c, f19170d);
        }
        return null;
    }

    /* renamed from: c */
    public byte[] mo19738c() {
        C6185b g = m24654g();
        if (g == null) {
            return null;
        }
        int i = g.f19178b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.f19177a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: d */
    public void mo19739d() {
        mo19736a();
        this.f19171a.delete();
    }

    /* renamed from: e */
    public void mo19740e(long j, String str) {
        m24655h();
        m24653f(j, str);
    }
}
