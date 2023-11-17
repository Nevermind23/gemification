package p020b2;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C2325h;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p033c2.C2224c;
import p048d2.C5808j;
import p061e2.C6013a;
import p307x1.C8936b;
import p307x1.C8944j;
import p307x1.C8945k;
import p307x1.C8946l;
import p319y1.C9009a;
import p319y1.C9011c;
import p331z1.C9174e;

/* renamed from: b2.v */
public abstract class C2147v {

    /* renamed from: a */
    private static final C2224c.C2225a f6320a = C2224c.C2225a.m8482a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    private static final C2224c.C2225a f6321b = C2224c.C2225a.m8482a("d", "a");

    /* renamed from: c */
    private static final C2224c.C2225a f6322c = C2224c.C2225a.m8482a("ty", "nm");

    /* renamed from: b2.v$a */
    static /* synthetic */ class C2148a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6323a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                z1.e$b[] r0 = p331z1.C9174e.C9176b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6323a = r0
                z1.e$b r1 = p331z1.C9174e.C9176b.LUMA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6323a     // Catch:{ NoSuchFieldError -> 0x001d }
                z1.e$b r1 = p331z1.C9174e.C9176b.LUMA_INVERTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p020b2.C2147v.C2148a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C9174e m8249a(C2224c cVar, C2325h hVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        C2224c cVar2 = cVar;
        C2325h hVar2 = hVar;
        C9174e.C9176b bVar = C9174e.C9176b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.mo7153n();
        Float valueOf = Float.valueOf(Utils.FLOAT_EPSILON);
        Float valueOf2 = Float.valueOf(1.0f);
        C9174e.C9176b bVar2 = bVar;
        C9174e.C9175a aVar = null;
        String str = null;
        C8946l lVar = null;
        C8944j jVar = null;
        C8945k kVar = null;
        C8936b bVar3 = null;
        C9009a aVar2 = null;
        C2129j jVar2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        long j2 = -1;
        float f6 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        float f7 = 0.0f;
        while (cVar.hasNext()) {
            switch (cVar2.mo7160x(f6320a)) {
                case 0:
                    str2 = cVar.mo7147I0();
                    break;
                case 1:
                    j = (long) cVar.mo7157t();
                    break;
                case 2:
                    str = cVar.mo7147I0();
                    break;
                case 3:
                    int t = cVar.mo7157t();
                    aVar = C9174e.C9175a.UNKNOWN;
                    if (t >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = C9174e.C9175a.values()[t];
                        break;
                    }
                case 4:
                    j2 = (long) cVar.mo7157t();
                    break;
                case 5:
                    i = (int) (((float) cVar.mo7157t()) * C5808j.m23377e());
                    break;
                case 6:
                    i2 = (int) (((float) cVar.mo7157t()) * C5808j.m23377e());
                    break;
                case 7:
                    i3 = Color.parseColor(cVar.mo7147I0());
                    break;
                case 8:
                    lVar = C2115c.m8177g(cVar, hVar);
                    break;
                case 9:
                    int t2 = cVar.mo7157t();
                    if (t2 < C9174e.C9176b.values().length) {
                        bVar2 = C9174e.C9176b.values()[t2];
                        int i4 = C2148a.f6323a[bVar2.ordinal()];
                        if (i4 == 1) {
                            hVar2.mo7542a("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            hVar2.mo7542a("Unsupported matte type: Luma Inverted");
                        }
                        hVar2.mo7559r(1);
                        break;
                    } else {
                        hVar2.mo7542a("Unsupported matte type: " + t2);
                        break;
                    }
                case 10:
                    cVar.mo7152k();
                    while (cVar.hasNext()) {
                        arrayList3.add(C2150x.m8257a(cVar, hVar));
                    }
                    hVar2.mo7559r(arrayList3.size());
                    cVar.mo7154o();
                    break;
                case 11:
                    cVar.mo7152k();
                    while (cVar.hasNext()) {
                        C9011c a = C2125h.m8200a(cVar, hVar);
                        if (a != null) {
                            arrayList4.add(a);
                        }
                    }
                    cVar.mo7154o();
                    break;
                case 12:
                    cVar.mo7153n();
                    while (cVar.hasNext()) {
                        int x = cVar2.mo7160x(f6321b);
                        if (x == 0) {
                            jVar = C2117d.m8182d(cVar, hVar);
                        } else if (x != 1) {
                            cVar.mo7161y();
                            cVar.mo7148N();
                        } else {
                            cVar.mo7152k();
                            if (cVar.hasNext()) {
                                kVar = C2113b.m8167a(cVar, hVar);
                            }
                            while (cVar.hasNext()) {
                                cVar.mo7148N();
                            }
                            cVar.mo7154o();
                        }
                    }
                    cVar.mo7155q();
                    break;
                case 13:
                    cVar.mo7152k();
                    ArrayList arrayList5 = new ArrayList();
                    while (cVar.hasNext()) {
                        cVar.mo7153n();
                        while (cVar.hasNext()) {
                            int x2 = cVar2.mo7160x(f6322c);
                            if (x2 == 0) {
                                int t3 = cVar.mo7157t();
                                if (t3 == 29) {
                                    aVar2 = C2119e.m8192b(cVar, hVar);
                                } else if (t3 == 25) {
                                    jVar2 = new C2131k().mo7020b(cVar2, hVar2);
                                }
                            } else if (x2 != 1) {
                                cVar.mo7161y();
                                cVar.mo7148N();
                            } else {
                                arrayList5.add(cVar.mo7147I0());
                            }
                        }
                        cVar.mo7155q();
                    }
                    cVar.mo7154o();
                    hVar2.mo7542a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f6 = (float) cVar.mo7156s();
                    break;
                case 15:
                    f2 = (float) cVar.mo7156s();
                    break;
                case 16:
                    f3 = (float) (cVar.mo7156s() * ((double) C5808j.m23377e()));
                    break;
                case 17:
                    f4 = (float) (cVar.mo7156s() * ((double) C5808j.m23377e()));
                    break;
                case 18:
                    f7 = (float) cVar.mo7156s();
                    break;
                case 19:
                    f5 = (float) cVar.mo7156s();
                    break;
                case 20:
                    bVar3 = C2117d.m8184f(cVar2, hVar2, false);
                    break;
                case 21:
                    str3 = cVar.mo7147I0();
                    break;
                case 22:
                    z = cVar.mo7146E0();
                    break;
                default:
                    cVar.mo7161y();
                    cVar.mo7148N();
                    break;
            }
        }
        cVar.mo7155q();
        ArrayList arrayList6 = new ArrayList();
        if (f7 > Utils.FLOAT_EPSILON) {
            C6013a aVar3 = r0;
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            C6013a aVar4 = new C6013a(hVar, valueOf, valueOf, (Interpolator) null, Utils.FLOAT_EPSILON, Float.valueOf(f7));
            arrayList2.add(aVar3);
            f = Utils.FLOAT_EPSILON;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (f5 <= f) {
            f5 = hVar.mo7547f();
        }
        C2325h hVar3 = hVar;
        arrayList2.add(new C6013a(hVar3, valueOf2, valueOf2, (Interpolator) null, f7, Float.valueOf(f5)));
        arrayList2.add(new C6013a(hVar3, valueOf, valueOf, (Interpolator) null, f5, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            hVar2.mo7542a("Convert your Illustrator layers to shape layers.");
        }
        return new C9174e(arrayList4, hVar, str2, j, aVar, j2, str, arrayList, lVar, i, i2, i3, f6, f2, f3, f4, jVar, kVar, arrayList2, bVar2, bVar3, z, aVar2, jVar2);
    }

    /* renamed from: b */
    public static C9174e m8250b(C2325h hVar) {
        Rect b = hVar.mo7543b();
        List emptyList = Collections.emptyList();
        C9174e.C9175a aVar = C9174e.C9175a.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C8946l lVar = r12;
        C8946l lVar2 = new C8946l();
        return new C9174e(emptyList, hVar, "__container", -1, aVar, -1, (String) null, emptyList2, lVar, 0, 0, 0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) b.width(), (float) b.height(), (C8944j) null, (C8945k) null, Collections.emptyList(), C9174e.C9176b.NONE, (C8936b) null, false, (C9009a) null, (C2129j) null);
    }
}
