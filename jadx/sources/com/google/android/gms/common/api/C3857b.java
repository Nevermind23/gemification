package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.internal.C3871b;
import com.google.android.gms.common.api.internal.C3874c;
import com.google.android.gms.common.api.internal.C3877d;
import com.google.android.gms.common.api.internal.C3888g;
import com.google.android.gms.common.api.internal.C3892h;
import com.google.android.gms.common.api.internal.C3911n;
import com.google.android.gms.common.api.internal.C3918p0;
import com.google.android.gms.common.internal.C3958b;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import p156l6.C6929a;
import p156l6.C6931b;
import p156l6.C6944h;
import p156l6.C6949j0;
import p156l6.C6952l;
import p156l6.C6970v;
import p182n6.C7249c;
import p182n6.C7264i;
import p260t6.C8413o;
import p337z7.C9227g;
import p337z7.Task;

/* renamed from: com.google.android.gms.common.api.b */
public abstract class C3857b {

    /* renamed from: a */
    private final Context f12269a;

    /* renamed from: b */
    private final String f12270b;

    /* renamed from: c */
    private final C3847a f12271c;

    /* renamed from: d */
    private final C3847a.C3851d f12272d;

    /* renamed from: e */
    private final C6931b f12273e;

    /* renamed from: f */
    private final Looper f12274f;

    /* renamed from: g */
    private final int f12275g;

    /* renamed from: h */
    private final C3860c f12276h;

    /* renamed from: i */
    private final C6952l f12277i;

    /* renamed from: j */
    protected final C3874c f12278j;

    /* renamed from: com.google.android.gms.common.api.b$a */
    public static class C3858a {

        /* renamed from: c */
        public static final C3858a f12279c = new C3859a().mo11949a();

        /* renamed from: a */
        public final C6952l f12280a;

        /* renamed from: b */
        public final Looper f12281b;

        /* renamed from: com.google.android.gms.common.api.b$a$a */
        public static class C3859a {

            /* renamed from: a */
            private C6952l f12282a;

            /* renamed from: b */
            private Looper f12283b;

            /* renamed from: a */
            public C3858a mo11949a() {
                if (this.f12282a == null) {
                    this.f12282a = new C6929a();
                }
                if (this.f12283b == null) {
                    this.f12283b = Looper.getMainLooper();
                }
                return new C3858a(this.f12282a, this.f12283b);
            }

            /* renamed from: b */
            public C3859a mo11950b(C6952l lVar) {
                C7264i.m27903l(lVar, "StatusExceptionMapper must not be null.");
                this.f12282a = lVar;
                return this;
            }
        }

        private C3858a(C6952l lVar, Account account, Looper looper) {
            this.f12280a = lVar;
            this.f12281b = looper;
        }
    }

    public C3857b(Activity activity, C3847a aVar, C3847a.C3851d dVar, C3858a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    /* renamed from: y */
    private final C3871b m14526y(int i, C3871b bVar) {
        bVar.mo11978l();
        this.f12278j.mo12024G(this, i, bVar);
        return bVar;
    }

    /* renamed from: z */
    private final Task m14527z(int i, C3892h hVar) {
        C9227g gVar = new C9227g();
        this.f12278j.mo12025H(this, i, hVar, gVar, this.f12277i);
        return gVar.mo24883a();
    }

    /* renamed from: i */
    public C3860c mo11933i() {
        return this.f12276h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C7249c.C7250a mo11934j() {
        C7249c.C7250a aVar = new C7249c.C7250a();
        aVar.mo21630d((Account) null);
        aVar.mo21629c(Collections.emptySet());
        aVar.mo21631e(this.f12269a.getClass().getName());
        aVar.mo21628b(this.f12269a.getPackageName());
        return aVar;
    }

    /* renamed from: k */
    public Task mo11935k(C3892h hVar) {
        return m14527z(2, hVar);
    }

    /* renamed from: l */
    public Task mo11936l(C3892h hVar) {
        return m14527z(0, hVar);
    }

    /* renamed from: m */
    public Task mo11937m(C3888g gVar) {
        C7264i.m27902k(gVar);
        C7264i.m27903l(gVar.f12391a.mo12057b(), "Listener has already been released.");
        C7264i.m27903l(gVar.f12392b.mo12085a(), "Listener has already been released.");
        return this.f12278j.mo12022A(this, gVar.f12391a, gVar.f12392b, gVar.f12393c);
    }

    /* renamed from: n */
    public Task mo11938n(C3877d.C3878a aVar) {
        return mo11939o(aVar, 0);
    }

    /* renamed from: o */
    public Task mo11939o(C3877d.C3878a aVar, int i) {
        C7264i.m27903l(aVar, "Listener key cannot be null.");
        return this.f12278j.mo12023B(this, aVar, i);
    }

    /* renamed from: p */
    public C3871b mo11940p(C3871b bVar) {
        m14526y(1, bVar);
        return bVar;
    }

    /* renamed from: q */
    public Task mo11941q(C3892h hVar) {
        return m14527z(1, hVar);
    }

    /* renamed from: r */
    public final C6931b mo11942r() {
        return this.f12273e;
    }

    /* renamed from: s */
    public Context mo11943s() {
        return this.f12269a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo11944t() {
        return this.f12270b;
    }

    /* renamed from: u */
    public Looper mo11945u() {
        return this.f12274f;
    }

    /* renamed from: v */
    public final int mo11946v() {
        return this.f12275g;
    }

    /* renamed from: w */
    public final C3847a.C3855f mo11947w(Looper looper, C3918p0 p0Var) {
        Looper looper2 = looper;
        C3847a.C3855f c = ((C3847a.C3848a) C7264i.m27902k(this.f12271c.mo11913a())).mo113c(this.f12269a, looper2, mo11934j().mo21627a(), this.f12272d, p0Var, p0Var);
        String t = mo11944t();
        if (t != null && (c instanceof C3958b)) {
            ((C3958b) c).mo12233U(t);
        }
        if (t == null || !(c instanceof C6944h)) {
            return c;
        }
        C6944h hVar = (C6944h) c;
        throw null;
    }

    /* renamed from: x */
    public final C6949j0 mo11948x(Context context, Handler handler) {
        return new C6949j0(context, handler, mo11934j().mo21627a());
    }

    private C3857b(Context context, Activity activity, C3847a aVar, C3847a.C3851d dVar, C3858a aVar2) {
        C7264i.m27903l(context, "Null context is not permitted.");
        C7264i.m27903l(aVar, "Api must not be null.");
        C7264i.m27903l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f12269a = context.getApplicationContext();
        String str = null;
        if (C8413o.m31573k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f12270b = str;
        this.f12271c = aVar;
        this.f12272d = dVar;
        this.f12274f = aVar2.f12281b;
        C6931b a = C6931b.m26928a(aVar, dVar, str);
        this.f12273e = a;
        this.f12276h = new C6970v(this);
        C3874c y = C3874c.m14660y(this.f12269a);
        this.f12278j = y;
        this.f12275g = y.mo12035n();
        this.f12277i = aVar2.f12280a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C3911n.m14847u(activity, y, a);
        }
        y.mo12029c(this);
    }

    public C3857b(Context context, C3847a aVar, C3847a.C3851d dVar, C3858a aVar2) {
        this(context, (Activity) null, aVar, dVar, aVar2);
    }
}
