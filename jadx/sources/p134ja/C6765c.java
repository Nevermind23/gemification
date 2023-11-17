package p134ja;

import android.util.Log;

/* renamed from: ja.c */
class C6765c {

    /* renamed from: a */
    private static C6765c f20326a;

    private C6765c() {
    }

    /* renamed from: c */
    public static synchronized C6765c m26386c() {
        C6765c cVar;
        synchronized (C6765c.class) {
            if (f20326a == null) {
                f20326a = new C6765c();
            }
            cVar = f20326a;
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20814a(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo20815b(String str) {
        Log.e("FirebasePerformance", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo20816d(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo20817e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
