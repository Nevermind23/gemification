package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.media.C11580o;
import com.salesforce.marketingcloud.media.C11587s;
import com.salesforce.marketingcloud.media.C11591u;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.t */
public class C11590t {

    /* renamed from: a */
    private final C11580o f33655a;

    /* renamed from: b */
    private final C11587s.C11588a f33656b;

    /* renamed from: c */
    private boolean f33657c;

    public C11590t(C11580o oVar, Uri uri) {
        this.f33655a = oVar;
        this.f33656b = new C11587s.C11588a(uri);
    }

    /* renamed from: a */
    private C11587s m42308a(long j) {
        C11587s a = this.f33656b.mo30253a();
        a.f33639l = j;
        return a;
    }

    /* renamed from: b */
    public C11590t mo30266b() {
        this.f33656b.mo30255c();
        return this;
    }

    /* renamed from: c */
    public void mo30267c() {
        mo30265a((C11562f) null);
    }

    /* renamed from: d */
    public C11590t mo30268d() {
        this.f33657c = true;
        return this;
    }

    /* renamed from: a */
    public C11590t mo30258a() {
        this.f33656b.mo30254b();
        return this;
    }

    /* renamed from: a */
    public C11590t mo30259a(float f, float f2, int i) {
        this.f33656b.mo30249a(f, f2, i);
        return this;
    }

    /* renamed from: a */
    public C11590t mo30260a(int i, int i2) {
        this.f33656b.mo30250a(i, i2);
        return this;
    }

    /* renamed from: a */
    public C11590t mo30261a(C11580o.C11583c cVar) {
        this.f33656b.mo30251a(cVar);
        return this;
    }

    /* renamed from: a */
    public C11590t mo30262a(C11587s.C11589b bVar, C11587s.C11589b... bVarArr) {
        this.f33656b.mo30252a(bVar, bVarArr);
        return this;
    }

    /* renamed from: a */
    public void mo30263a(ImageView imageView) {
        mo30264a(imageView, (C11562f) null);
    }

    /* renamed from: a */
    public void mo30264a(ImageView imageView, C11562f fVar) {
        Bitmap a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            if (!this.f33656b.mo30256d()) {
                this.f33656b.mo30251a(C11580o.C11583c.HIGH);
            }
            if (this.f33657c) {
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                if (width == 0 || height == 0) {
                    this.f33655a.mo30232a(imageView, new C11563g(this, imageView, fVar));
                    return;
                }
                this.f33656b.mo30250a(width, height);
            }
            C11587s a2 = m42308a(System.nanoTime());
            if (!C11587s.C11589b.m42304a(a2.f33631d) || (a = this.f33655a.mo30229a(a2.f33629b)) == null) {
                this.f33655a.mo30233a((C11553a) new C11584p(this.f33655a, new C11594v(imageView), a2, fVar));
                return;
            }
            C11591u.C11593b bVar = new C11591u.C11593b(a, C11580o.C11582b.MEMORY);
            C11570l.m42242a(imageView, this.f33655a.f33604a, bVar);
            C11461g.m41880a("IMAGE", "onSuccess - Loaded from: %s", bVar.mo30271c());
            if (fVar != null) {
                fVar.mo30170a();
                return;
            }
            return;
        }
        throw new IllegalStateException("TODO");
    }

    /* renamed from: a */
    public void mo30265a(C11562f fVar) {
        long nanoTime = System.nanoTime();
        if (!this.f33656b.mo30256d()) {
            this.f33656b.mo30251a(C11580o.C11583c.NORMAL);
        }
        C11587s a = m42308a(nanoTime);
        if (!C11587s.C11589b.m42304a(a.f33631d) || this.f33655a.mo30229a(a.f33629b) == null) {
            this.f33655a.mo30233a((C11553a) new C11568j(this.f33655a, a, fVar));
            return;
        }
        C11461g.m41880a("IMAGE", "onSuccess - Loaded from: MEMORY", new Object[0]);
        if (fVar != null) {
            fVar.mo30170a();
        }
    }
}
