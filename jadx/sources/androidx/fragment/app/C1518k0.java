package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.k0 */
final class C1518k0 extends Writer {

    /* renamed from: d */
    private final String f4430d;

    /* renamed from: e */
    private StringBuilder f4431e = new StringBuilder(128);

    C1518k0(String str) {
        this.f4430d = str;
    }

    /* renamed from: a */
    private void m5390a() {
        if (this.f4431e.length() > 0) {
            Log.d(this.f4430d, this.f4431e.toString());
            StringBuilder sb = this.f4431e;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m5390a();
    }

    public void flush() {
        m5390a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m5390a();
            } else {
                this.f4431e.append(c);
            }
        }
    }
}
