package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p059e0.C5880a;

/* renamed from: androidx.emoji2.text.g */
public class C1390g {

    /* renamed from: d */
    private static final ThreadLocal f3969d = new ThreadLocal();

    /* renamed from: a */
    private final int f3970a;

    /* renamed from: b */
    private final C1403m f3971b;

    /* renamed from: c */
    private volatile int f3972c = 0;

    C1390g(C1403m mVar, int i) {
        this.f3971b = mVar;
        this.f3970a = i;
    }

    /* renamed from: g */
    private C5880a m4768g() {
        ThreadLocal threadLocal = f3969d;
        C5880a aVar = (C5880a) threadLocal.get();
        if (aVar == null) {
            aVar = new C5880a();
            threadLocal.set(aVar);
        }
        this.f3971b.mo4044d().mo19234j(aVar, this.f3970a);
        return aVar;
    }

    /* renamed from: a */
    public void mo4010a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface g = this.f3971b.mo4047g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f3971b.mo4043c(), this.f3970a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int mo4011b(int i) {
        return m4768g().mo19225h(i);
    }

    /* renamed from: c */
    public int mo4012c() {
        return m4768g().mo19226i();
    }

    /* renamed from: d */
    public int mo4013d() {
        return this.f3972c;
    }

    /* renamed from: e */
    public short mo4014e() {
        return m4768g().mo19228k();
    }

    /* renamed from: f */
    public int mo4015f() {
        return m4768g().mo19229l();
    }

    /* renamed from: h */
    public short mo4016h() {
        return m4768g().mo19230m();
    }

    /* renamed from: i */
    public short mo4017i() {
        return m4768g().mo19231n();
    }

    /* renamed from: j */
    public boolean mo4018j() {
        return m4768g().mo19227j();
    }

    /* renamed from: k */
    public void mo4019k(boolean z) {
        this.f3972c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo4015f()));
        sb.append(", codepoints:");
        int c = mo4012c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(mo4011b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
