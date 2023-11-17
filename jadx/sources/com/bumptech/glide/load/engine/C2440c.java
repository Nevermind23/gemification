package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.C2415d;
import com.bumptech.glide.load.engine.C2443f;
import java.io.File;
import java.util.List;
import p102h4.C6435b;
import p166m3.C7079a;
import p166m3.C7083e;
import p244s3.C8188n;

/* renamed from: com.bumptech.glide.load.engine.c */
class C2440c implements C2443f, C2415d.C2416a {

    /* renamed from: d */
    private final List f7692d;

    /* renamed from: e */
    private final C2445g f7693e;

    /* renamed from: f */
    private final C2443f.C2444a f7694f;

    /* renamed from: g */
    private int f7695g;

    /* renamed from: h */
    private C7083e f7696h;

    /* renamed from: i */
    private List f7697i;

    /* renamed from: j */
    private int f7698j;

    /* renamed from: k */
    private volatile C8188n.C8189a f7699k;

    /* renamed from: l */
    private File f7700l;

    C2440c(C2445g gVar, C2443f.C2444a aVar) {
        this(gVar.mo7855c(), gVar, aVar);
    }

    /* renamed from: a */
    private boolean m9433a() {
        return this.f7698j < this.f7697i.size();
    }

    /* renamed from: c */
    public void mo7797c(Exception exc) {
        this.f7694f.mo7850a(this.f7696h, exc, this.f7699k.f23351c, C7079a.DATA_DISK_CACHE);
    }

    public void cancel() {
        C8188n.C8189a aVar = this.f7699k;
        if (aVar != null) {
            aVar.f23351c.cancel();
        }
    }

    /* renamed from: d */
    public boolean mo7844d() {
        C6435b.m25525a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.f7697i != null) {
                    if (m9433a()) {
                        this.f7699k = null;
                        while (!z && m9433a()) {
                            List list = this.f7697i;
                            int i = this.f7698j;
                            this.f7698j = i + 1;
                            this.f7699k = ((C8188n) list.get(i)).mo23326a(this.f7700l, this.f7693e.mo7872t(), this.f7693e.mo7858f(), this.f7693e.mo7863k());
                            if (this.f7699k != null && this.f7693e.mo7873u(this.f7699k.f23351c.mo7781a())) {
                                this.f7699k.f23351c.mo7790e(this.f7693e.mo7864l(), this);
                                z = true;
                            }
                        }
                        C6435b.m25529e();
                        return z;
                    }
                }
                int i2 = this.f7695g + 1;
                this.f7695g = i2;
                if (i2 >= this.f7692d.size()) {
                    return false;
                }
                C7083e eVar = (C7083e) this.f7692d.get(this.f7695g);
                File a = this.f7693e.mo7856d().mo22833a(new C2441d(eVar, this.f7693e.mo7868p()));
                this.f7700l = a;
                if (a != null) {
                    this.f7696h = eVar;
                    this.f7697i = this.f7693e.mo7862j(a);
                    this.f7698j = 0;
                }
            } finally {
                C6435b.m25529e();
            }
        }
    }

    /* renamed from: f */
    public void mo7798f(Object obj) {
        this.f7694f.mo7851b(this.f7696h, obj, this.f7699k.f23351c, C7079a.DATA_DISK_CACHE, this.f7696h);
    }

    C2440c(List list, C2445g gVar, C2443f.C2444a aVar) {
        this.f7695g = -1;
        this.f7692d = list;
        this.f7693e = gVar;
        this.f7694f = aVar;
    }
}
