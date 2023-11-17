package p255t1;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import p048d2.C5807i;
import p061e2.C6015c;
import p268u1.C8525a;
import p294w1.C8738e;
import p319y1.C9020j;
import p319y1.C9033s;
import p331z1.C9169b;

/* renamed from: t1.n */
public class C8323n implements C8322m, C8525a.C8527b, C8319k {

    /* renamed from: a */
    private final Path f23643a = new Path();

    /* renamed from: b */
    private final String f23644b;

    /* renamed from: c */
    private final C2315d0 f23645c;

    /* renamed from: d */
    private final C9020j.C9021a f23646d;

    /* renamed from: e */
    private final boolean f23647e;

    /* renamed from: f */
    private final boolean f23648f;

    /* renamed from: g */
    private final C8525a f23649g;

    /* renamed from: h */
    private final C8525a f23650h;

    /* renamed from: i */
    private final C8525a f23651i;

    /* renamed from: j */
    private final C8525a f23652j;

    /* renamed from: k */
    private final C8525a f23653k;

    /* renamed from: l */
    private final C8525a f23654l;

    /* renamed from: m */
    private final C8525a f23655m;

    /* renamed from: n */
    private final C8310b f23656n = new C8310b();

    /* renamed from: o */
    private boolean f23657o;

    /* renamed from: t1.n$a */
    static /* synthetic */ class C8324a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23658a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                y1.j$a[] r0 = p319y1.C9020j.C9021a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23658a = r0
                y1.j$a r1 = p319y1.C9020j.C9021a.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23658a     // Catch:{ NoSuchFieldError -> 0x001d }
                y1.j$a r1 = p319y1.C9020j.C9021a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p255t1.C8323n.C8324a.<clinit>():void");
        }
    }

    public C8323n(C2315d0 d0Var, C9169b bVar, C9020j jVar) {
        this.f23645c = d0Var;
        this.f23644b = jVar.mo24457d();
        C9020j.C9021a j = jVar.mo24463j();
        this.f23646d = j;
        this.f23647e = jVar.mo24464k();
        this.f23648f = jVar.mo24465l();
        C8525a a = jVar.mo24460g().mo24353a();
        this.f23649g = a;
        C8525a a2 = jVar.mo24461h().mo24353a();
        this.f23650h = a2;
        C8525a a3 = jVar.mo24462i().mo24353a();
        this.f23651i = a3;
        C8525a a4 = jVar.mo24458e().mo24353a();
        this.f23653k = a4;
        C8525a a5 = jVar.mo24459f().mo24353a();
        this.f23655m = a5;
        C9020j.C9021a aVar = C9020j.C9021a.STAR;
        if (j == aVar) {
            this.f23652j = jVar.mo24455b().mo24353a();
            this.f23654l = jVar.mo24456c().mo24353a();
        } else {
            this.f23652j = null;
            this.f23654l = null;
        }
        bVar.mo24753i(a);
        bVar.mo24753i(a2);
        bVar.mo24753i(a3);
        bVar.mo24753i(a4);
        bVar.mo24753i(a5);
        if (j == aVar) {
            bVar.mo24753i(this.f23652j);
            bVar.mo24753i(this.f23654l);
        }
        a.mo23850a(this);
        a2.mo23850a(this);
        a3.mo23850a(this);
        a4.mo23850a(this);
        a5.mo23850a(this);
        if (j == aVar) {
            this.f23652j.mo23850a(this);
            this.f23654l.mo23850a(this);
        }
    }

    /* renamed from: g */
    private void m31244g() {
        double d;
        double d2;
        double d3;
        double d4;
        int i;
        int floor = (int) Math.floor((double) ((Float) this.f23649g.mo23856h()).floatValue());
        C8525a aVar = this.f23651i;
        if (aVar == null) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = (double) ((Float) aVar.mo23856h()).floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d5 = (double) floor;
        float floatValue = ((Float) this.f23655m.mo23856h()).floatValue() / 100.0f;
        float floatValue2 = ((Float) this.f23653k.mo23856h()).floatValue();
        double d6 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d6);
        float sin = (float) (Math.sin(radians) * d6);
        this.f23643a.moveTo(cos, sin);
        double d7 = (double) ((float) (6.283185307179586d / d5));
        double d8 = radians + d7;
        double ceil = Math.ceil(d5);
        int i2 = 0;
        while (((double) i2) < ceil) {
            float cos2 = (float) (Math.cos(d8) * d6);
            double d9 = ceil;
            float sin2 = (float) (d6 * Math.sin(d8));
            if (floatValue != Utils.FLOAT_EPSILON) {
                d4 = d6;
                i = i2;
                d3 = d8;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d2 = d7;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f = floatValue2 * floatValue * 0.25f;
                float f2 = cos3 * f;
                float sin3 = ((float) Math.sin(atan2)) * f;
                float cos4 = ((float) Math.cos(atan22)) * f;
                float sin4 = f * ((float) Math.sin(atan22));
                this.f23643a.cubicTo(cos - f2, sin - sin3, cos2 + cos4, sin2 + sin4, cos2, sin2);
            } else {
                i = i2;
                d3 = d8;
                d4 = d6;
                d2 = d7;
                this.f23643a.lineTo(cos2, sin2);
            }
            d8 = d3 + d2;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d9;
            d6 = d4;
            d7 = d2;
        }
        PointF pointF = (PointF) this.f23650h.mo23856h();
        this.f23643a.offset(pointF.x, pointF.y);
        this.f23643a.close();
    }

    /* renamed from: i */
    private void m31245i() {
        double d;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        double d2;
        float f7;
        float f8;
        float f9;
        double d3;
        float f12;
        double d4;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float floatValue = ((Float) this.f23649g.mo23856h()).floatValue();
        C8525a aVar = this.f23651i;
        if (aVar == null) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = (double) ((Float) aVar.mo23856h()).floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d5 = (double) floatValue;
        float f19 = (float) (6.283185307179586d / d5);
        if (this.f23648f) {
            f19 *= -1.0f;
        }
        float f22 = f19 / 2.0f;
        float f23 = floatValue - ((float) ((int) floatValue));
        int i2 = (f23 > Utils.FLOAT_EPSILON ? 1 : (f23 == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f23) * f22);
        }
        float floatValue2 = ((Float) this.f23653k.mo23856h()).floatValue();
        float floatValue3 = ((Float) this.f23652j.mo23856h()).floatValue();
        C8525a aVar2 = this.f23654l;
        if (aVar2 != null) {
            f = ((Float) aVar2.mo23856h()).floatValue() / 100.0f;
        } else {
            f = 0.0f;
        }
        C8525a aVar3 = this.f23655m;
        if (aVar3 != null) {
            f2 = ((Float) aVar3.mo23856h()).floatValue() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        if (i2 != 0) {
            f3 = ((floatValue2 - floatValue3) * f23) + floatValue3;
            i = i2;
            double d6 = (double) f3;
            float f24 = f22;
            float cos = (float) (d6 * Math.cos(radians));
            f5 = (float) (d6 * Math.sin(radians));
            this.f23643a.moveTo(cos, f5);
            d2 = radians + ((double) ((f19 * f23) / 2.0f));
            f4 = cos;
            f6 = f24;
        } else {
            float f25 = f22;
            i = i2;
            double d7 = (double) floatValue2;
            float cos2 = (float) (Math.cos(radians) * d7);
            float sin = (float) (d7 * Math.sin(radians));
            this.f23643a.moveTo(cos2, sin);
            f4 = cos2;
            f6 = f25;
            d2 = radians + ((double) f6);
            f5 = sin;
            f3 = Utils.FLOAT_EPSILON;
        }
        double ceil = Math.ceil(d5) * 2.0d;
        int i3 = 0;
        float f26 = f6;
        float f27 = f4;
        float f28 = floatValue2;
        float f29 = floatValue3;
        boolean z = false;
        while (true) {
            double d8 = (double) i3;
            if (d8 < ceil) {
                if (z) {
                    f7 = f28;
                } else {
                    f7 = f29;
                }
                int i4 = (f3 > Utils.FLOAT_EPSILON ? 1 : (f3 == Utils.FLOAT_EPSILON ? 0 : -1));
                if (i4 == 0 || d8 != ceil - 2.0d) {
                    f8 = f19;
                    f9 = f26;
                } else {
                    f8 = f19;
                    f9 = (f19 * f23) / 2.0f;
                }
                if (i4 == 0 || d8 != ceil - 1.0d) {
                    d3 = d8;
                    f12 = f3;
                    f3 = f7;
                } else {
                    d3 = d8;
                    f12 = f3;
                }
                double d9 = (double) f3;
                double d12 = ceil;
                float cos3 = (float) (d9 * Math.cos(d2));
                float sin2 = (float) (d9 * Math.sin(d2));
                if (f == Utils.FLOAT_EPSILON && f2 == Utils.FLOAT_EPSILON) {
                    this.f23643a.lineTo(cos3, sin2);
                    d4 = d2;
                    f13 = f;
                    f14 = f2;
                } else {
                    f13 = f;
                    double atan2 = (double) ((float) (Math.atan2((double) f5, (double) f27) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f14 = f2;
                    d4 = d2;
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos3) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z) {
                        f15 = f13;
                    } else {
                        f15 = f14;
                    }
                    if (z) {
                        f16 = f14;
                    } else {
                        f16 = f13;
                    }
                    if (z) {
                        f17 = f29;
                    } else {
                        f17 = f28;
                    }
                    if (z) {
                        f18 = f28;
                    } else {
                        f18 = f29;
                    }
                    float f32 = f17 * f15 * 0.47829f;
                    float f33 = cos4 * f32;
                    float f34 = f32 * sin3;
                    float f35 = f18 * f16 * 0.47829f;
                    float f36 = cos5 * f35;
                    float f37 = f35 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f33 *= f23;
                            f34 *= f23;
                        } else if (d3 == d12 - 1.0d) {
                            f36 *= f23;
                            f37 *= f23;
                        }
                    }
                    this.f23643a.cubicTo(f27 - f33, f5 - f34, cos3 + f36, sin2 + f37, cos3, sin2);
                }
                d2 = d4 + ((double) f9);
                z = !z;
                i3++;
                f27 = cos3;
                f5 = sin2;
                f2 = f14;
                f = f13;
                f3 = f12;
                f19 = f8;
                ceil = d12;
            } else {
                PointF pointF = (PointF) this.f23650h.mo23856h();
                this.f23643a.offset(pointF.x, pointF.y);
                this.f23643a.close();
                return;
            }
        }
    }

    /* renamed from: j */
    private void m31246j() {
        this.f23657o = false;
        this.f23645c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo23468a() {
        m31246j();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C8311c cVar = (C8311c) list.get(i);
            if (cVar instanceof C8331u) {
                C8331u uVar = (C8331u) cVar;
                if (uVar.mo23488j() == C9033s.C9034a.SIMULTANEOUSLY) {
                    this.f23656n.mo23474a(uVar);
                    uVar.mo23484c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        C8525a aVar;
        C8525a aVar2;
        if (obj == C2326h0.f7304w) {
            this.f23649g.mo23862n(cVar);
        } else if (obj == C2326h0.f7305x) {
            this.f23651i.mo23862n(cVar);
        } else if (obj == C2326h0.f7295n) {
            this.f23650h.mo23862n(cVar);
        } else if (obj == C2326h0.f7306y && (aVar2 = this.f23652j) != null) {
            aVar2.mo23862n(cVar);
        } else if (obj == C2326h0.f7307z) {
            this.f23653k.mo23862n(cVar);
        } else if (obj == C2326h0.f7267A && (aVar = this.f23654l) != null) {
            aVar.mo23862n(cVar);
        } else if (obj == C2326h0.f7268B) {
            this.f23655m.mo23862n(cVar);
        }
    }

    /* renamed from: f */
    public void mo23472f(C8738e eVar, int i, List list, C8738e eVar2) {
        C5807i.m23372k(eVar, i, list, eVar2, this);
    }

    public String getName() {
        return this.f23644b;
    }

    /* renamed from: z */
    public Path mo23480z() {
        if (this.f23657o) {
            return this.f23643a;
        }
        this.f23643a.reset();
        if (this.f23647e) {
            this.f23657o = true;
            return this.f23643a;
        }
        int i = C8324a.f23658a[this.f23646d.ordinal()];
        if (i == 1) {
            m31245i();
        } else if (i == 2) {
            m31244g();
        }
        this.f23643a.close();
        this.f23656n.mo23475b(this.f23643a);
        this.f23657o = true;
        return this.f23643a;
    }
}
