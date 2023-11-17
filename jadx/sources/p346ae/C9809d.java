package p346ae;

import com.otaliastudios.cameraview.C11278a;

/* renamed from: ae.d */
public abstract class C9809d {

    /* renamed from: d */
    C11278a.C11279a f26634d;

    /* renamed from: e */
    C9810a f26635e;

    /* renamed from: f */
    protected Exception f26636f;

    /* renamed from: ae.d$a */
    public interface C9810a {
        /* renamed from: k */
        void mo26305k(C11278a.C11279a aVar, Exception exc);

        /* renamed from: n */
        void mo26306n(boolean z);
    }

    public C9809d(C11278a.C11279a aVar, C9810a aVar2) {
        this.f26634d = aVar;
        this.f26635e = aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26304a(boolean z) {
        C9810a aVar = this.f26635e;
        if (aVar != null) {
            aVar.mo26306n(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26296b() {
        C9810a aVar = this.f26635e;
        if (aVar != null) {
            aVar.mo26305k(this.f26634d, this.f26636f);
            this.f26635e = null;
            this.f26634d = null;
        }
    }

    /* renamed from: c */
    public abstract void mo26297c();
}
