package p141k4;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.C2642h;
import com.facebook.C2645k;
import com.facebook.GraphRequest;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
import p193o4.C7438b;
import p297w4.C8769a0;
import p297w4.C8831r;
import p334z4.C9207a;

/* renamed from: k4.e */
public class C6802e {

    /* renamed from: e */
    private static final String f20448e = "k4.e";

    /* renamed from: f */
    private static C6802e f20449f;

    /* renamed from: a */
    private final Handler f20450a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private WeakReference f20451b;

    /* renamed from: c */
    private Timer f20452c;

    /* renamed from: d */
    private String f20453d = null;

    /* renamed from: k4.e$a */
    class C6803a extends TimerTask {
        C6803a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                k4.e r0 = p141k4.C6802e.this     // Catch:{ Exception -> 0x008f }
                java.lang.ref.WeakReference r0 = p141k4.C6802e.m26520a(r0)     // Catch:{ Exception -> 0x008f }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x008f }
                android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x008f }
                android.view.View r1 = p193o4.C7438b.m28296e(r0)     // Catch:{ Exception -> 0x008f }
                if (r0 == 0) goto L_0x008e
                if (r1 != 0) goto L_0x0016
                goto L_0x008e
            L_0x0016:
                java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x008f }
                java.lang.String r0 = r0.getSimpleName()     // Catch:{ Exception -> 0x008f }
                boolean r2 = p141k4.C6790b.m26488j()     // Catch:{ Exception -> 0x008f }
                if (r2 != 0) goto L_0x0025
                return
            L_0x0025:
                boolean r2 = p297w4.C8828p.m32860b()     // Catch:{ Exception -> 0x008f }
                if (r2 == 0) goto L_0x002f
                p154l4.C6887e.m26734a()     // Catch:{ Exception -> 0x008f }
                return
            L_0x002f:
                java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x008f }
                k4.e$e r3 = new k4.e$e     // Catch:{ Exception -> 0x008f }
                r3.<init>(r1)     // Catch:{ Exception -> 0x008f }
                r2.<init>(r3)     // Catch:{ Exception -> 0x008f }
                k4.e r3 = p141k4.C6802e.this     // Catch:{ Exception -> 0x008f }
                android.os.Handler r3 = p141k4.C6802e.m26521b(r3)     // Catch:{ Exception -> 0x008f }
                r3.post(r2)     // Catch:{ Exception -> 0x008f }
                java.lang.String r3 = ""
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0050 }
                r5 = 1
                java.lang.Object r2 = r2.get(r5, r4)     // Catch:{ Exception -> 0x0050 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0050 }
                r3 = r2
                goto L_0x005a
            L_0x0050:
                r2 = move-exception
                java.lang.String r4 = p141k4.C6802e.m26522c()     // Catch:{ Exception -> 0x008f }
                java.lang.String r5 = "Failed to take screenshot."
                android.util.Log.e(r4, r5, r2)     // Catch:{ Exception -> 0x008f }
            L_0x005a:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x008f }
                r2.<init>()     // Catch:{ Exception -> 0x008f }
                java.lang.String r4 = "screenname"
                r2.put(r4, r0)     // Catch:{ JSONException -> 0x007b }
                java.lang.String r0 = "screenshot"
                r2.put(r0, r3)     // Catch:{ JSONException -> 0x007b }
                org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007b }
                r0.<init>()     // Catch:{ JSONException -> 0x007b }
                org.json.JSONObject r1 = p154l4.C6888f.m26740d(r1)     // Catch:{ JSONException -> 0x007b }
                r0.put(r1)     // Catch:{ JSONException -> 0x007b }
                java.lang.String r1 = "view"
                r2.put(r1, r0)     // Catch:{ JSONException -> 0x007b }
                goto L_0x0084
            L_0x007b:
                java.lang.String r0 = p141k4.C6802e.m26522c()     // Catch:{ Exception -> 0x008f }
                java.lang.String r1 = "Failed to create JSONObject"
                android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x008f }
            L_0x0084:
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x008f }
                k4.e r1 = p141k4.C6802e.this     // Catch:{ Exception -> 0x008f }
                p141k4.C6802e.m26523d(r1, r0)     // Catch:{ Exception -> 0x008f }
                goto L_0x0099
            L_0x008e:
                return
            L_0x008f:
                r0 = move-exception
                java.lang.String r1 = p141k4.C6802e.m26522c()
                java.lang.String r2 = "UI Component tree indexing failure!"
                android.util.Log.e(r1, r2, r0)
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p141k4.C6802e.C6803a.run():void");
        }
    }

    /* renamed from: k4.e$b */
    class C6804b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ TimerTask f20455d;

        C6804b(TimerTask timerTask) {
            this.f20455d = timerTask;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    if (C6802e.m26524e(C6802e.this) != null) {
                        C6802e.m26524e(C6802e.this).cancel();
                    }
                    C6802e.m26527h(C6802e.this, (String) null);
                    C6802e.m26525f(C6802e.this, new Timer());
                    C6802e.m26524e(C6802e.this).scheduleAtFixedRate(this.f20455d, 0, 1000);
                } catch (Exception e) {
                    Log.e(C6802e.m26522c(), "Error scheduling indexing job", e);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: k4.e$c */
    class C6805c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f20457d;

        C6805c(String str) {
            this.f20457d = str;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    String Y = C8769a0.m32652Y(this.f20457d);
                    AccessToken h = AccessToken.m9965h();
                    if (Y == null || !Y.equals(C6802e.m26526g(C6802e.this))) {
                        C6802e.this.mo20866j(C6802e.m26528i(this.f20457d, h, C2626d.m10135f(), "app_indexing"), Y);
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: k4.e$d */
    static class C6806d implements GraphRequest.C2612e {
        C6806d() {
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            C8831r.m32866g(C2645k.APP_EVENTS, C6802e.m26522c(), "App index sent to FB!");
        }
    }

    /* renamed from: k4.e$e */
    private static class C6807e implements Callable {

        /* renamed from: d */
        private WeakReference f20459d;

        C6807e(View view) {
            this.f20459d = new WeakReference(view);
        }

        /* renamed from: a */
        public String call() {
            View view = (View) this.f20459d.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public C6802e(Activity activity) {
        this.f20451b = new WeakReference(activity);
        f20449f = this;
    }

    /* renamed from: a */
    static /* synthetic */ WeakReference m26520a(C6802e eVar) {
        Class<C6802e> cls = C6802e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return eVar.f20451b;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ Handler m26521b(C6802e eVar) {
        Class<C6802e> cls = C6802e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return eVar.f20450a;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ String m26522c() {
        Class<C6802e> cls = C6802e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f20448e;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m26523d(C6802e eVar, String str) {
        Class<C6802e> cls = C6802e.class;
        if (!C9207a.m34024c(cls)) {
            try {
                eVar.m26529l(str);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: e */
    static /* synthetic */ Timer m26524e(C6802e eVar) {
        Class<C6802e> cls = C6802e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return eVar.f20452c;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    static /* synthetic */ Timer m26525f(C6802e eVar, Timer timer) {
        Class<C6802e> cls = C6802e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            eVar.f20452c = timer;
            return timer;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: g */
    static /* synthetic */ String m26526g(C6802e eVar) {
        Class<C6802e> cls = C6802e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return eVar.f20453d;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: h */
    static /* synthetic */ String m26527h(C6802e eVar, String str) {
        Class<C6802e> cls = C6802e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            eVar.f20453d = str;
            return str;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: i */
    public static GraphRequest m26528i(String str, AccessToken accessToken, String str2, String str3) {
        Class<C6802e> cls = C6802e.class;
        if (C9207a.m34024c(cls) || str == null) {
            return null;
        }
        try {
            GraphRequest K = GraphRequest.m10013K(accessToken, String.format(Locale.US, "%s/app_indexing", new Object[]{str2}), (JSONObject) null, (GraphRequest.C2612e) null);
            Bundle y = K.mo8192y();
            if (y == null) {
                y = new Bundle();
            }
            y.putString("tree", str);
            y.putString(C11772k.C11773a.f34185q, C7438b.m28295d());
            y.putString(C11772k.C11773a.f34170b, "android");
            y.putString("request_type", str3);
            if (str3.equals("app_indexing")) {
                y.putString("device_session_id", C6790b.m26487i());
            }
            K.mo8181Z(y);
            K.mo8178V(new C6806d());
            return K;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: l */
    private void m26529l(String str) {
        if (!C9207a.m34024c(this)) {
            try {
                C2626d.m10142m().execute(new C6805c(str));
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo20866j(GraphRequest graphRequest, String str) {
        if (!C9207a.m34024c(this) && graphRequest != null) {
            try {
                C2642h g = graphRequest.mo8184g();
                JSONObject h = g.mo8280h();
                if (h != null) {
                    if ("true".equals(h.optString("success"))) {
                        C8831r.m32866g(C2645k.APP_EVENTS, f20448e, "Successfully send UI component tree to server");
                        this.f20453d = str;
                    }
                    if (h.has("is_app_indexing_enabled")) {
                        C6790b.m26493o(Boolean.valueOf(h.getBoolean("is_app_indexing_enabled")));
                        return;
                    }
                    return;
                }
                String str2 = f20448e;
                Log.e(str2, "Error sending UI component tree to Facebook: " + g.mo8279g());
            } catch (JSONException e) {
                Log.e(f20448e, "Error decoding server response.", e);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: k */
    public void mo20867k() {
        if (!C9207a.m34024c(this)) {
            try {
                C2626d.m10142m().execute(new C6804b(new C6803a()));
            } catch (RejectedExecutionException e) {
                Log.e(f20448e, "Error scheduling indexing job", e);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: m */
    public void mo20868m() {
        Timer timer;
        if (!C9207a.m34024c(this)) {
            try {
                if (((Activity) this.f20451b.get()) != null && (timer = this.f20452c) != null) {
                    timer.cancel();
                    this.f20452c = null;
                }
            } catch (Exception e) {
                Log.e(f20448e, "Error unscheduling indexing job", e);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }
}
