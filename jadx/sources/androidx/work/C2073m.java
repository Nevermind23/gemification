package androidx.work;

import android.util.Log;

/* renamed from: androidx.work.m */
public abstract class C2073m {

    /* renamed from: a */
    private static final Object f6218a = new Object();

    /* renamed from: b */
    private static volatile C2073m f6219b = null;

    /* renamed from: c */
    private static final int f6220c = 20;

    /* renamed from: androidx.work.m$a */
    public static class C2074a extends C2073m {

        /* renamed from: d */
        private final int f6221d;

        public C2074a(int i) {
            super(i);
            this.f6221d = i;
        }

        /* renamed from: a */
        public void mo6959a(String str, String str2) {
            if (this.f6221d <= 3) {
                Log.d(str, str2);
            }
        }

        /* renamed from: b */
        public void mo6960b(String str, String str2, Throwable th) {
            if (this.f6221d <= 3) {
                Log.d(str, str2, th);
            }
        }

        /* renamed from: c */
        public void mo6961c(String str, String str2) {
            if (this.f6221d <= 6) {
                Log.e(str, str2);
            }
        }

        /* renamed from: d */
        public void mo6962d(String str, String str2, Throwable th) {
            if (this.f6221d <= 6) {
                Log.e(str, str2, th);
            }
        }

        /* renamed from: f */
        public void mo6963f(String str, String str2) {
            if (this.f6221d <= 4) {
                Log.i(str, str2);
            }
        }

        /* renamed from: g */
        public void mo6964g(String str, String str2, Throwable th) {
            if (this.f6221d <= 4) {
                Log.i(str, str2, th);
            }
        }

        /* renamed from: j */
        public void mo6965j(String str, String str2) {
            if (this.f6221d <= 2) {
                Log.v(str, str2);
            }
        }

        /* renamed from: k */
        public void mo6966k(String str, String str2) {
            if (this.f6221d <= 5) {
                Log.w(str, str2);
            }
        }

        /* renamed from: l */
        public void mo6967l(String str, String str2, Throwable th) {
            if (this.f6221d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public C2073m(int i) {
    }

    /* renamed from: e */
    public static C2073m m8071e() {
        C2073m mVar;
        synchronized (f6218a) {
            if (f6219b == null) {
                f6219b = new C2074a(3);
            }
            mVar = f6219b;
        }
        return mVar;
    }

    /* renamed from: h */
    public static void m8072h(C2073m mVar) {
        synchronized (f6218a) {
            f6219b = mVar;
        }
    }

    /* renamed from: i */
    public static String m8073i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f6220c;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo6959a(String str, String str2);

    /* renamed from: b */
    public abstract void mo6960b(String str, String str2, Throwable th);

    /* renamed from: c */
    public abstract void mo6961c(String str, String str2);

    /* renamed from: d */
    public abstract void mo6962d(String str, String str2, Throwable th);

    /* renamed from: f */
    public abstract void mo6963f(String str, String str2);

    /* renamed from: g */
    public abstract void mo6964g(String str, String str2, Throwable th);

    /* renamed from: j */
    public abstract void mo6965j(String str, String str2);

    /* renamed from: k */
    public abstract void mo6966k(String str, String str2);

    /* renamed from: l */
    public abstract void mo6967l(String str, String str2, Throwable th);
}
