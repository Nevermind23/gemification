package p020b2;

import android.graphics.PointF;
import p033c2.C2224c;
import p294w1.C8734b;

/* renamed from: b2.i */
public class C2127i implements C2138n0 {

    /* renamed from: a */
    public static final C2127i f6282a = new C2127i();

    /* renamed from: b */
    private static final C2224c.C2225a f6283b = C2224c.C2225a.m8482a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private C2127i() {
    }

    /* renamed from: b */
    public C8734b mo7008a(C2224c cVar, float f) {
        C8734b.C8735a aVar = C8734b.C8735a.CENTER;
        cVar.mo7153n();
        C8734b.C8735a aVar2 = aVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (cVar.hasNext()) {
            switch (cVar.mo7160x(f6283b)) {
                case 0:
                    str = cVar.mo7147I0();
                    break;
                case 1:
                    str2 = cVar.mo7147I0();
                    break;
                case 2:
                    f2 = (float) cVar.mo7156s();
                    break;
                case 3:
                    int t = cVar.mo7157t();
                    aVar2 = C8734b.C8735a.CENTER;
                    if (t <= aVar2.ordinal() && t >= 0) {
                        aVar2 = C8734b.C8735a.values()[t];
                        break;
                    }
                case 4:
                    i = cVar.mo7157t();
                    break;
                case 5:
                    f3 = (float) cVar.mo7156s();
                    break;
                case 6:
                    f4 = (float) cVar.mo7156s();
                    break;
                case 7:
                    i2 = C2143s.m8235d(cVar);
                    break;
                case 8:
                    i3 = C2143s.m8235d(cVar);
                    break;
                case 9:
                    f5 = (float) cVar.mo7156s();
                    break;
                case 10:
                    z = cVar.mo7146E0();
                    break;
                case 11:
                    cVar.mo7152k();
                    PointF pointF3 = new PointF(((float) cVar.mo7156s()) * f, ((float) cVar.mo7156s()) * f);
                    cVar.mo7154o();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.mo7152k();
                    PointF pointF4 = new PointF(((float) cVar.mo7156s()) * f, ((float) cVar.mo7156s()) * f);
                    cVar.mo7154o();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.mo7161y();
                    cVar.mo7148N();
                    break;
            }
        }
        C2224c cVar2 = cVar;
        cVar.mo7155q();
        return new C8734b(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
