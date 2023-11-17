package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.C2415d;
import com.bumptech.glide.load.engine.C2443f;
import java.io.File;
import java.util.List;
import p102h4.C6435b;
import p166m3.C7079a;
import p166m3.C7083e;
import p244s3.C8188n;

/* renamed from: com.bumptech.glide.load.engine.s */
class C2479s implements C2443f, C2415d.C2416a {

    /* renamed from: d */
    private final C2443f.C2444a f7869d;

    /* renamed from: e */
    private final C2445g f7870e;

    /* renamed from: f */
    private int f7871f;

    /* renamed from: g */
    private int f7872g = -1;

    /* renamed from: h */
    private C7083e f7873h;

    /* renamed from: i */
    private List f7874i;

    /* renamed from: j */
    private int f7875j;

    /* renamed from: k */
    private volatile C8188n.C8189a f7876k;

    /* renamed from: l */
    private File f7877l;

    /* renamed from: m */
    private C2480t f7878m;

    C2479s(C2445g gVar, C2443f.C2444a aVar) {
        this.f7870e = gVar;
        this.f7869d = aVar;
    }

    /* renamed from: a */
    private boolean m9584a() {
        return this.f7875j < this.f7874i.size();
    }

    /* renamed from: c */
    public void mo7797c(Exception exc) {
        this.f7869d.mo7850a(this.f7878m, exc, this.f7876k.f23351c, C7079a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        C8188n.C8189a aVar = this.f7876k;
        if (aVar != null) {
            aVar.f23351c.cancel();
        }
    }

    /* renamed from: d */
    public boolean mo7844d() {
        C6435b.m25525a("ResourceCacheGenerator.startNext");
        try {
            List c = this.f7870e.mo7855c();
            boolean z = false;
            if (c.isEmpty()) {
                return false;
            }
            List m = this.f7870e.mo7865m();
            if (!m.isEmpty()) {
                while (true) {
                    if (this.f7874i != null) {
                        if (m9584a()) {
                            this.f7876k = null;
                            while (!z && m9584a()) {
                                List list = this.f7874i;
                                int i = this.f7875j;
                                this.f7875j = i + 1;
                                this.f7876k = ((C8188n) list.get(i)).mo23326a(this.f7877l, this.f7870e.mo7872t(), this.f7870e.mo7858f(), this.f7870e.mo7863k());
                                if (this.f7876k != null && this.f7870e.mo7873u(this.f7876k.f23351c.mo7781a())) {
                                    this.f7876k.f23351c.mo7790e(this.f7870e.mo7864l(), this);
                                    z = true;
                                }
                            }
                            C6435b.m25529e();
                            return z;
                        }
                    }
                    int i2 = this.f7872g + 1;
                    this.f7872g = i2;
                    if (i2 >= m.size()) {
                        int i3 = this.f7871f + 1;
                        this.f7871f = i3;
                        if (i3 >= c.size()) {
                            C6435b.m25529e();
                            return false;
                        }
                        this.f7872g = 0;
                    }
                    C7083e eVar = (C7083e) c.get(this.f7871f);
                    Class cls = (Class) m.get(this.f7872g);
                    this.f7878m = new C2480t(this.f7870e.mo7854b(), eVar, this.f7870e.mo7868p(), this.f7870e.mo7872t(), this.f7870e.mo7858f(), this.f7870e.mo7871s(cls), cls, this.f7870e.mo7863k());
                    File a = this.f7870e.mo7856d().mo22833a(this.f7878m);
                    this.f7877l = a;
                    if (a != null) {
                        this.f7873h = eVar;
                        this.f7874i = this.f7870e.mo7862j(a);
                        this.f7875j = 0;
                    }
                }
            } else if (File.class.equals(this.f7870e.mo7870r())) {
                C6435b.m25529e();
                return false;
            } else {
                throw new IllegalStateException("Failed to find any load path from " + this.f7870e.mo7861i() + " to " + this.f7870e.mo7870r());
            }
        } finally {
            C6435b.m25529e();
        }
    }

    /* renamed from: f */
    public void mo7798f(Object obj) {
        this.f7869d.mo7851b(this.f7873h, obj, this.f7876k.f23351c, C7079a.RESOURCE_DISK_CACHE, this.f7878m);
    }
}
