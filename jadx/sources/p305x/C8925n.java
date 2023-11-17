package p305x;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: x.n */
public final class C8925n {

    /* renamed from: a */
    private final C8928c f24926a;

    /* renamed from: x.n$b */
    private static final class C8927b implements C8928c {

        /* renamed from: a */
        private final Uri f24928a;

        /* renamed from: b */
        private final ClipDescription f24929b;

        /* renamed from: c */
        private final Uri f24930c;

        C8927b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f24928a = uri;
            this.f24929b = clipDescription;
            this.f24930c = uri2;
        }

        /* renamed from: a */
        public Object mo24343a() {
            return null;
        }

        /* renamed from: b */
        public Uri mo24344b() {
            return this.f24928a;
        }

        /* renamed from: c */
        public void mo24345c() {
        }

        /* renamed from: d */
        public Uri mo24346d() {
            return this.f24930c;
        }

        public ClipDescription getDescription() {
            return this.f24929b;
        }
    }

    /* renamed from: x.n$c */
    private interface C8928c {
        /* renamed from: a */
        Object mo24343a();

        /* renamed from: b */
        Uri mo24344b();

        /* renamed from: c */
        void mo24345c();

        /* renamed from: d */
        Uri mo24346d();

        ClipDescription getDescription();
    }

    public C8925n(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f24926a = new C8926a(uri, clipDescription, uri2);
        } else {
            this.f24926a = new C8927b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C8925n m33126f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C8925n(new C8926a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri mo24338a() {
        return this.f24926a.mo24344b();
    }

    /* renamed from: b */
    public ClipDescription mo24339b() {
        return this.f24926a.getDescription();
    }

    /* renamed from: c */
    public Uri mo24340c() {
        return this.f24926a.mo24346d();
    }

    /* renamed from: d */
    public void mo24341d() {
        this.f24926a.mo24345c();
    }

    /* renamed from: e */
    public Object mo24342e() {
        return this.f24926a.mo24343a();
    }

    /* renamed from: x.n$a */
    private static final class C8926a implements C8928c {

        /* renamed from: a */
        final InputContentInfo f24927a;

        C8926a(Object obj) {
            this.f24927a = C8913e.m33111a(obj);
        }

        /* renamed from: a */
        public Object mo24343a() {
            return this.f24927a;
        }

        /* renamed from: b */
        public Uri mo24344b() {
            return this.f24927a.getContentUri();
        }

        /* renamed from: c */
        public void mo24345c() {
            this.f24927a.requestPermission();
        }

        /* renamed from: d */
        public Uri mo24346d() {
            return this.f24927a.getLinkUri();
        }

        public ClipDescription getDescription() {
            return this.f24927a.getDescription();
        }

        C8926a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            C8920i.m33121a();
            this.f24927a = C8919h.m33120a(uri, clipDescription, uri2);
        }
    }

    private C8925n(C8928c cVar) {
        this.f24926a = cVar;
    }
}
