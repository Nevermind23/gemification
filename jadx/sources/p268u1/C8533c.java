package p268u1;

import android.graphics.Color;
import android.graphics.Paint;
import p020b2.C2129j;
import p061e2.C6014b;
import p061e2.C6015c;
import p268u1.C8525a;
import p331z1.C9169b;

/* renamed from: u1.c */
public class C8533c implements C8525a.C8527b {

    /* renamed from: a */
    private final C8525a.C8527b f24241a;

    /* renamed from: b */
    private final C8525a f24242b;

    /* renamed from: c */
    private final C8525a f24243c;

    /* renamed from: d */
    private final C8525a f24244d;

    /* renamed from: e */
    private final C8525a f24245e;

    /* renamed from: f */
    private final C8525a f24246f;

    /* renamed from: g */
    private boolean f24247g = true;

    /* renamed from: u1.c$a */
    class C8534a extends C6015c {

        /* renamed from: d */
        final /* synthetic */ C6015c f24248d;

        C8534a(C6015c cVar) {
            this.f24248d = cVar;
        }

        /* renamed from: d */
        public Float mo19503a(C6014b bVar) {
            Float f = (Float) this.f24248d.mo19503a(bVar);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public C8533c(C8525a.C8527b bVar, C9169b bVar2, C2129j jVar) {
        this.f24241a = bVar;
        C8525a a = jVar.mo7015a().mo24353a();
        this.f24242b = a;
        a.mo23850a(this);
        bVar2.mo24753i(a);
        C8525a a2 = jVar.mo7018d().mo24353a();
        this.f24243c = a2;
        a2.mo23850a(this);
        bVar2.mo24753i(a2);
        C8525a a3 = jVar.mo7016b().mo24353a();
        this.f24244d = a3;
        a3.mo23850a(this);
        bVar2.mo24753i(a3);
        C8525a a4 = jVar.mo7017c().mo24353a();
        this.f24245e = a4;
        a4.mo23850a(this);
        bVar2.mo24753i(a4);
        C8525a a5 = jVar.mo7019e().mo24353a();
        this.f24246f = a5;
        a5.mo23850a(this);
        bVar2.mo24753i(a5);
    }

    /* renamed from: a */
    public void mo23468a() {
        this.f24247g = true;
        this.f24241a.mo23468a();
    }

    /* renamed from: b */
    public void mo23872b(Paint paint) {
        if (this.f24247g) {
            this.f24247g = false;
            double floatValue = ((double) ((Float) this.f24244d.mo23856h()).floatValue()) * 0.017453292519943295d;
            float floatValue2 = ((Float) this.f24245e.mo23856h()).floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = ((Integer) this.f24242b.mo23856h()).intValue();
            paint.setShadowLayer(((Float) this.f24246f.mo23856h()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.f24243c.mo23856h()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    /* renamed from: c */
    public void mo23873c(C6015c cVar) {
        this.f24242b.mo23862n(cVar);
    }

    /* renamed from: d */
    public void mo23874d(C6015c cVar) {
        this.f24244d.mo23862n(cVar);
    }

    /* renamed from: e */
    public void mo23875e(C6015c cVar) {
        this.f24245e.mo23862n(cVar);
    }

    /* renamed from: f */
    public void mo23876f(C6015c cVar) {
        if (cVar == null) {
            this.f24243c.mo23862n((C6015c) null);
        } else {
            this.f24243c.mo23862n(new C8534a(cVar));
        }
    }

    /* renamed from: g */
    public void mo23877g(C6015c cVar) {
        this.f24246f.mo23862n(cVar);
    }
}
