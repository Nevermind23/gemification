package p360be;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p337z7.C9227g;
import p337z7.C9231i;
import p374ce.C10396b;
import p458id.C15600b;

/* renamed from: be.a */
public abstract class C10241a {

    /* renamed from: i */
    protected static final C15600b f28459i = C15600b.m56349a(C10241a.class.getSimpleName());

    /* renamed from: a */
    private C10244c f28460a;

    /* renamed from: b */
    private View f28461b;

    /* renamed from: c */
    protected boolean f28462c;

    /* renamed from: d */
    protected int f28463d;

    /* renamed from: e */
    protected int f28464e;

    /* renamed from: f */
    protected int f28465f;

    /* renamed from: g */
    protected int f28466g;

    /* renamed from: h */
    protected int f28467h;

    /* renamed from: be.a$a */
    class C10242a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C9227g f28468d;

        C10242a(C9227g gVar) {
            this.f28468d = gVar;
        }

        public void run() {
            C10241a.this.mo26815r();
            this.f28468d.mo24885c((Object) null);
        }
    }

    /* renamed from: be.a$b */
    protected interface C10243b {
        /* renamed from: a */
        void mo26823a();
    }

    /* renamed from: be.a$c */
    public interface C10244c {
        /* renamed from: f */
        void mo26824f();

        /* renamed from: j */
        void mo26825j();

        /* renamed from: o */
        void mo26826o();
    }

    public C10241a(Context context, ViewGroup viewGroup) {
        this.f28461b = mo26813p(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo26802e(C10243b bVar) {
        if (bVar != null) {
            bVar.mo26823a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo26803f(int i, int i2) {
        f28459i.mo42878c("dispatchOnSurfaceAvailable:", "w=", Integer.valueOf(i), "h=", Integer.valueOf(i2));
        this.f28463d = i;
        this.f28464e = i2;
        if (i > 0 && i2 > 0) {
            mo26802e((C10243b) null);
        }
        C10244c cVar = this.f28460a;
        if (cVar != null) {
            cVar.mo26824f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo26804g() {
        this.f28463d = 0;
        this.f28464e = 0;
        C10244c cVar = this.f28460a;
        if (cVar != null) {
            cVar.mo26825j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo26805h(int i, int i2) {
        f28459i.mo42878c("dispatchOnSurfaceSizeChanged:", "w=", Integer.valueOf(i), "h=", Integer.valueOf(i2));
        if (i != this.f28463d || i2 != this.f28464e) {
            this.f28463d = i;
            this.f28464e = i2;
            if (i > 0 && i2 > 0) {
                mo26802e((C10243b) null);
            }
            C10244c cVar = this.f28460a;
            if (cVar != null) {
                cVar.mo26826o();
            }
        }
    }

    /* renamed from: i */
    public abstract Object mo26806i();

    /* renamed from: j */
    public abstract Class mo26807j();

    /* renamed from: k */
    public abstract View mo26808k();

    /* renamed from: l */
    public final C10396b mo26809l() {
        return new C10396b(this.f28463d, this.f28464e);
    }

    /* renamed from: m */
    public final View mo26810m() {
        return this.f28461b;
    }

    /* renamed from: n */
    public final boolean mo26811n() {
        return this.f28463d > 0 && this.f28464e > 0;
    }

    /* renamed from: o */
    public boolean mo26812o() {
        return this.f28462c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract View mo26813p(Context context, ViewGroup viewGroup);

    /* renamed from: q */
    public void mo26814q() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mo26815r();
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        C9227g gVar = new C9227g();
        handler.post(new C10242a(gVar));
        try {
            C9231i.m34107a(gVar.mo24883a());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo26815r() {
        View k = mo26808k();
        ViewParent parent = k.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(k);
        }
    }

    /* renamed from: s */
    public void mo26816s() {
    }

    /* renamed from: t */
    public void mo26817t() {
    }

    /* renamed from: u */
    public void mo26818u(int i) {
        this.f28467h = i;
    }

    /* renamed from: v */
    public void mo26819v(int i, int i2) {
        f28459i.mo42878c("setStreamSize:", "desiredW=", Integer.valueOf(i), "desiredH=", Integer.valueOf(i2));
        this.f28465f = i;
        this.f28466g = i2;
        if (i > 0 && i2 > 0) {
            mo26802e((C10243b) null);
        }
    }

    /* renamed from: w */
    public void mo26820w(C10244c cVar) {
        C10244c cVar2;
        C10244c cVar3;
        if (mo26811n() && (cVar3 = this.f28460a) != null) {
            cVar3.mo26825j();
        }
        this.f28460a = cVar;
        if (mo26811n() && (cVar2 = this.f28460a) != null) {
            cVar2.mo26824f();
        }
    }

    /* renamed from: x */
    public boolean mo26821x() {
        return false;
    }
}
