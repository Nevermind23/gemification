package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.manager.C2559c;
import com.bumptech.glide.manager.C2561d;
import com.bumptech.glide.manager.C2569l;
import com.bumptech.glide.manager.C2570m;
import com.bumptech.glide.manager.C2581s;
import com.bumptech.glide.manager.C2582t;
import com.bumptech.glide.manager.C2598w;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p035c4.C2250d;
import p035c4.C2256h;
import p050d4.C5818d;
import p050d4.C5825i;
import p063e4.C6032d;
import p089g4.C6224l;
import p192o3.C7423a;
import p321y3.C9046c;

/* renamed from: com.bumptech.glide.k */
public class C2396k implements ComponentCallbacks2, C2570m {

    /* renamed from: o */
    private static final C2256h f7610o = ((C2256h) C2256h.m8676z0(Bitmap.class).mo7211V());

    /* renamed from: p */
    private static final C2256h f7611p = ((C2256h) C2256h.m8676z0(C9046c.class).mo7211V());

    /* renamed from: q */
    private static final C2256h f7612q = ((C2256h) ((C2256h) C2256h.m8673A0(C7423a.f21688c).mo7225e0(C2390g.LOW)).mo7242o0(true));

    /* renamed from: d */
    protected final C2379b f7613d;

    /* renamed from: e */
    protected final Context f7614e;

    /* renamed from: f */
    final C2569l f7615f;

    /* renamed from: g */
    private final C2582t f7616g;

    /* renamed from: h */
    private final C2581s f7617h;

    /* renamed from: i */
    private final C2598w f7618i;

    /* renamed from: j */
    private final Runnable f7619j;

    /* renamed from: k */
    private final C2559c f7620k;

    /* renamed from: l */
    private final CopyOnWriteArrayList f7621l;

    /* renamed from: m */
    private C2256h f7622m;

    /* renamed from: n */
    private boolean f7623n;

    /* renamed from: com.bumptech.glide.k$a */
    class C2397a implements Runnable {
        C2397a() {
        }

        public void run() {
            C2396k kVar = C2396k.this;
            kVar.f7615f.mo8050f(kVar);
        }
    }

    /* renamed from: com.bumptech.glide.k$b */
    private static class C2398b extends C5818d {
        C2398b(View view) {
            super(view);
        }

        /* renamed from: b */
        public void mo7276b(Object obj, C6032d dVar) {
        }

        /* renamed from: k */
        public void mo7288k(Drawable drawable) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo7760m(Drawable drawable) {
        }
    }

    /* renamed from: com.bumptech.glide.k$c */
    private class C2399c implements C2559c.C2560a {

        /* renamed from: a */
        private final C2582t f7625a;

        C2399c(C2582t tVar) {
            this.f7625a = tVar;
        }

        /* renamed from: a */
        public void mo7761a(boolean z) {
            if (z) {
                synchronized (C2396k.this) {
                    this.f7625a.mo8092e();
                }
            }
        }
    }

    public C2396k(C2379b bVar, C2569l lVar, C2581s sVar, Context context) {
        this(bVar, lVar, sVar, new C2582t(), bVar.mo7686g(), context);
    }

    /* renamed from: G */
    private void m9279G(C5825i iVar) {
        boolean F = mo7738F(iVar);
        C2250d h = iVar.mo7283h();
        if (!F && !this.f7613d.mo7695p(iVar) && h != null) {
            iVar.mo7287j((C2250d) null);
            h.clear();
        }
    }

    /* renamed from: A */
    public synchronized void mo7733A() {
        mo7758z();
        for (C2396k z : this.f7617h.mo8059a()) {
            z.mo7758z();
        }
    }

    /* renamed from: B */
    public synchronized void mo7734B() {
        this.f7616g.mo8091d();
    }

    /* renamed from: C */
    public synchronized void mo7735C() {
        this.f7616g.mo8093f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public synchronized void mo7736D(C2256h hVar) {
        this.f7622m = (C2256h) ((C2256h) hVar.clone()).mo7217b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public synchronized void mo7737E(C5825i iVar, C2250d dVar) {
        this.f7618i.mo8120l(iVar);
        this.f7616g.mo8094g(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public synchronized boolean mo7738F(C5825i iVar) {
        C2250d h = iVar.mo7283h();
        if (h == null) {
            return true;
        }
        if (!this.f7616g.mo8088a(h)) {
            return false;
        }
        this.f7618i.mo8121m(iVar);
        iVar.mo7287j((C2250d) null);
        return true;
    }

    /* renamed from: c */
    public C2394j mo7739c(Class cls) {
        return new C2394j(this.f7613d, this, cls, this.f7614e);
    }

    /* renamed from: e */
    public C2394j mo7740e() {
        return mo7739c(Bitmap.class).mo7215a(f7610o);
    }

    /* renamed from: f */
    public synchronized void mo7279f() {
        mo7734B();
        this.f7618i.mo7279f();
    }

    /* renamed from: l */
    public C2394j mo7741l() {
        return mo7739c(Drawable.class);
    }

    /* renamed from: m */
    public void mo7742m(View view) {
        mo7743n(new C2398b(view));
    }

    /* renamed from: n */
    public void mo7743n(C5825i iVar) {
        if (iVar != null) {
            m9279G(iVar);
        }
    }

    /* renamed from: o */
    public synchronized void mo7289o() {
        mo7735C();
        this.f7618i.mo7289o();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public synchronized void onDestroy() {
        this.f7618i.onDestroy();
        for (C5825i n : this.f7618i.mo8119e()) {
            mo7743n(n);
        }
        this.f7618i.mo8118c();
        this.f7616g.mo8089b();
        this.f7615f.mo8049c(this);
        this.f7615f.mo8049c(this.f7620k);
        C6224l.m24754w(this.f7619j);
        this.f7613d.mo7697s(this);
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f7623n) {
            mo7733A();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public List mo7747p() {
        return this.f7621l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public synchronized C2256h mo7748q() {
        return this.f7622m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C2400l mo7749r(Class cls) {
        return this.f7613d.mo7688i().mo7705e(cls);
    }

    /* renamed from: s */
    public C2394j mo7750s(Bitmap bitmap) {
        return mo7741l().mo7720O0(bitmap);
    }

    /* renamed from: t */
    public C2394j mo7751t(Drawable drawable) {
        return mo7741l().mo7721P0(drawable);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f7616g + ", treeNode=" + this.f7617h + "}";
    }

    /* renamed from: u */
    public C2394j mo7753u(Uri uri) {
        return mo7741l().mo7722Q0(uri);
    }

    /* renamed from: v */
    public C2394j mo7754v(File file) {
        return mo7741l().mo7723R0(file);
    }

    /* renamed from: w */
    public C2394j mo7755w(Integer num) {
        return mo7741l().mo7724S0(num);
    }

    /* renamed from: x */
    public C2394j mo7756x(Object obj) {
        return mo7741l().mo7725T0(obj);
    }

    /* renamed from: y */
    public C2394j mo7757y(String str) {
        return mo7741l().mo7726U0(str);
    }

    /* renamed from: z */
    public synchronized void mo7758z() {
        this.f7616g.mo8090c();
    }

    C2396k(C2379b bVar, C2569l lVar, C2581s sVar, C2582t tVar, C2561d dVar, Context context) {
        this.f7618i = new C2598w();
        C2397a aVar = new C2397a();
        this.f7619j = aVar;
        this.f7613d = bVar;
        this.f7615f = lVar;
        this.f7617h = sVar;
        this.f7616g = tVar;
        this.f7614e = context;
        C2559c a = dVar.mo8057a(context.getApplicationContext(), new C2399c(tVar));
        this.f7620k = a;
        bVar.mo7691o(this);
        if (C6224l.m24749r()) {
            C6224l.m24753v(aVar);
        } else {
            lVar.mo8050f(this);
        }
        lVar.mo8050f(a);
        this.f7621l = new CopyOnWriteArrayList(bVar.mo7688i().mo7703c());
        mo7736D(bVar.mo7688i().mo7704d());
    }
}
