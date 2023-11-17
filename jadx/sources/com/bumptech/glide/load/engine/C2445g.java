package com.bumptech.glide.load.engine;

import com.bumptech.glide.C2386d;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2417e;
import com.bumptech.glide.load.engine.C2446h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p166m3.C7082d;
import p166m3.C7083e;
import p166m3.C7088h;
import p166m3.C7091k;
import p166m3.C7092l;
import p192o3.C7423a;
import p192o3.C7430c;
import p205p3.C7674b;
import p218q3.C7864a;
import p244s3.C8188n;
import p270u3.C8566n;

/* renamed from: com.bumptech.glide.load.engine.g */
final class C2445g {

    /* renamed from: a */
    private final List f7706a = new ArrayList();

    /* renamed from: b */
    private final List f7707b = new ArrayList();

    /* renamed from: c */
    private C2386d f7708c;

    /* renamed from: d */
    private Object f7709d;

    /* renamed from: e */
    private int f7710e;

    /* renamed from: f */
    private int f7711f;

    /* renamed from: g */
    private Class f7712g;

    /* renamed from: h */
    private C2446h.C2451e f7713h;

    /* renamed from: i */
    private C7088h f7714i;

    /* renamed from: j */
    private Map f7715j;

    /* renamed from: k */
    private Class f7716k;

    /* renamed from: l */
    private boolean f7717l;

    /* renamed from: m */
    private boolean f7718m;

    /* renamed from: n */
    private C7083e f7719n;

    /* renamed from: o */
    private C2390g f7720o;

    /* renamed from: p */
    private C7423a f7721p;

    /* renamed from: q */
    private boolean f7722q;

    /* renamed from: r */
    private boolean f7723r;

    C2445g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7853a() {
        this.f7708c = null;
        this.f7709d = null;
        this.f7719n = null;
        this.f7712g = null;
        this.f7716k = null;
        this.f7714i = null;
        this.f7720o = null;
        this.f7715j = null;
        this.f7721p = null;
        this.f7706a.clear();
        this.f7717l = false;
        this.f7707b.clear();
        this.f7718m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7674b mo7854b() {
        return this.f7708c.mo7702b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List mo7855c() {
        if (!this.f7718m) {
            this.f7718m = true;
            this.f7707b.clear();
            List g = mo7859g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C8188n.C8189a aVar = (C8188n.C8189a) g.get(i);
                if (!this.f7707b.contains(aVar.f23349a)) {
                    this.f7707b.add(aVar.f23349a);
                }
                for (int i2 = 0; i2 < aVar.f23350b.size(); i2++) {
                    if (!this.f7707b.contains(aVar.f23350b.get(i2))) {
                        this.f7707b.add(aVar.f23350b.get(i2));
                    }
                }
            }
        }
        return this.f7707b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C7864a mo7856d() {
        return this.f7713h.mo7895a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C7423a mo7857e() {
        return this.f7721p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo7858f() {
        return this.f7711f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List mo7859g() {
        if (!this.f7717l) {
            this.f7717l = true;
            this.f7706a.clear();
            List i = this.f7708c.mo7709i().mo7671i(this.f7709d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8188n.C8189a a = ((C8188n) i.get(i2)).mo23326a(this.f7709d, this.f7710e, this.f7711f, this.f7714i);
                if (a != null) {
                    this.f7706a.add(a);
                }
            }
        }
        return this.f7706a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2476q mo7860h(Class cls) {
        return this.f7708c.mo7709i().mo7670h(cls, this.f7712g, this.f7716k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Class mo7861i() {
        return this.f7709d.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List mo7862j(File file) {
        return this.f7708c.mo7709i().mo7671i(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C7088h mo7863k() {
        return this.f7714i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C2390g mo7864l() {
        return this.f7720o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List mo7865m() {
        return this.f7708c.mo7709i().mo7672j(this.f7709d.getClass(), this.f7712g, this.f7716k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C7091k mo7866n(C7430c cVar) {
        return this.f7708c.mo7709i().mo7673k(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C2417e mo7867o(Object obj) {
        return this.f7708c.mo7709i().mo7674l(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C7083e mo7868p() {
        return this.f7719n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C7082d mo7869q(Object obj) {
        return this.f7708c.mo7709i().mo7675m(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Class mo7870r() {
        return this.f7716k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C7092l mo7871s(Class cls) {
        C7092l lVar = (C7092l) this.f7715j.get(cls);
        if (lVar == null) {
            Iterator it = this.f7715j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (C7092l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f7715j.isEmpty() || !this.f7722q) {
            return C8566n.m32035c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo7872t() {
        return this.f7710e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo7873u(Class cls) {
        return mo7860h(cls) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo7874v(C2386d dVar, Object obj, C7083e eVar, int i, int i2, C7423a aVar, Class cls, Class cls2, C2390g gVar, C7088h hVar, Map map, boolean z, boolean z2, C2446h.C2451e eVar2) {
        this.f7708c = dVar;
        this.f7709d = obj;
        this.f7719n = eVar;
        this.f7710e = i;
        this.f7711f = i2;
        this.f7721p = aVar;
        this.f7712g = cls;
        this.f7713h = eVar2;
        this.f7716k = cls2;
        this.f7720o = gVar;
        this.f7714i = hVar;
        this.f7715j = map;
        this.f7722q = z;
        this.f7723r = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo7875w(C7430c cVar) {
        return this.f7708c.mo7709i().mo7676n(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo7876x() {
        return this.f7723r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo7877y(C7083e eVar) {
        List g = mo7859g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (((C8188n.C8189a) g.get(i)).f23349a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}
