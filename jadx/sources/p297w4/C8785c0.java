package p297w4;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.C2642h;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import p258t4.C8364a;
import p258t4.C8367d;
import p258t4.C8368e;
import p334z4.C9207a;

/* renamed from: w4.c0 */
public class C8785c0 extends Dialog {

    /* renamed from: p */
    private static final int f24641p = C8368e.com_facebook_activity_theme;

    /* renamed from: q */
    private static volatile int f24642q;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f24643d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f24644e;

    /* renamed from: f */
    private C8792g f24645f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public WebView f24646g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ProgressDialog f24647h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f24648i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public FrameLayout f24649j;

    /* renamed from: k */
    private C8793h f24650k;

    /* renamed from: l */
    private boolean f24651l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f24652m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f24653n;

    /* renamed from: o */
    private WindowManager.LayoutParams f24654o;

    /* renamed from: w4.c0$a */
    class C8786a implements DialogInterface.OnCancelListener {
        C8786a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C8785c0.this.cancel();
        }
    }

    /* renamed from: w4.c0$b */
    class C8787b implements View.OnClickListener {
        C8787b() {
        }

        public void onClick(View view) {
            if (!C9207a.m34024c(this)) {
                try {
                    C8785c0.this.cancel();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: w4.c0$c */
    class C8788c extends WebView {
        C8788c(Context context) {
            super(context);
        }

        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: w4.c0$d */
    class C8789d implements View.OnTouchListener {
        C8789d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: w4.c0$f */
    private class C8791f extends WebViewClient {
        private C8791f() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!C8785c0.this.f24652m) {
                C8785c0.this.f24647h.dismiss();
            }
            C8785c0.this.f24649j.setBackgroundColor(0);
            C8785c0.this.f24646g.setVisibility(0);
            C8785c0.this.f24648i.setVisibility(0);
            boolean unused = C8785c0.this.f24653n = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C8769a0.m32649V("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (!C8785c0.this.f24652m) {
                C8785c0.this.f24647h.show();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C8785c0.this.mo24203t(new FacebookDialogException(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            C8785c0.this.mo24203t(new FacebookDialogException((String) null, -11, (String) null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Redirect URL: "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FacebookSDK.WebDialog"
                p297w4.C8769a0.m32649V(r0, r6)
                w4.c0 r6 = p297w4.C8785c0.this
                java.lang.String r6 = r6.f24644e
                boolean r6 = r7.startsWith(r6)
                r0 = 1
                if (r6 == 0) goto L_0x00a6
                w4.c0 r6 = p297w4.C8785c0.this
                android.os.Bundle r6 = r6.mo24201r(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0037
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0037:
                java.lang.String r1 = "error_msg"
                java.lang.String r1 = r6.getString(r1)
                if (r1 != 0) goto L_0x0045
                java.lang.String r1 = "error_message"
                java.lang.String r1 = r6.getString(r1)
            L_0x0045:
                if (r1 != 0) goto L_0x004d
                java.lang.String r1 = "error_description"
                java.lang.String r1 = r6.getString(r1)
            L_0x004d:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                boolean r3 = p297w4.C8769a0.m32644Q(r2)
                r4 = -1
                if (r3 != 0) goto L_0x005f
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x005f }
                goto L_0x0060
            L_0x005f:
                r2 = r4
            L_0x0060:
                boolean r3 = p297w4.C8769a0.m32644Q(r7)
                if (r3 == 0) goto L_0x0074
                boolean r3 = p297w4.C8769a0.m32644Q(r1)
                if (r3 == 0) goto L_0x0074
                if (r2 != r4) goto L_0x0074
                w4.c0 r7 = p297w4.C8785c0.this
                r7.mo24204u(r6)
                goto L_0x00a5
            L_0x0074:
                if (r7 == 0) goto L_0x008c
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0086
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x008c
            L_0x0086:
                w4.c0 r6 = p297w4.C8785c0.this
                r6.cancel()
                goto L_0x00a5
            L_0x008c:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x0096
                w4.c0 r6 = p297w4.C8785c0.this
                r6.cancel()
                goto L_0x00a5
            L_0x0096:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r1)
                w4.c0 r7 = p297w4.C8785c0.this
                com.facebook.FacebookServiceException r2 = new com.facebook.FacebookServiceException
                r2.<init>(r6, r1)
                r7.mo24203t(r2)
            L_0x00a5:
                return r0
            L_0x00a6:
                java.lang.String r6 = "fbconnect://cancel"
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto L_0x00b4
                w4.c0 r6 = p297w4.C8785c0.this
                r6.cancel()
                return r0
            L_0x00b4:
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                r1 = 0
                if (r6 == 0) goto L_0x00be
                return r1
            L_0x00be:
                w4.c0 r6 = p297w4.C8785c0.this     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                r2.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                r6.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                return r0
            L_0x00d3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p297w4.C8785c0.C8791f.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        /* synthetic */ C8791f(C8785c0 c0Var, C8786a aVar) {
            this();
        }
    }

    /* renamed from: w4.c0$g */
    public interface C8792g {
        /* renamed from: a */
        void mo8426a(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: w4.c0$h */
    private class C8793h extends AsyncTask {

        /* renamed from: a */
        private String f24667a;

        /* renamed from: b */
        private Bundle f24668b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Exception[] f24669c;

        /* renamed from: w4.c0$h$a */
        class C8794a implements GraphRequest.C2612e {

            /* renamed from: a */
            final /* synthetic */ String[] f24671a;

            /* renamed from: b */
            final /* synthetic */ int f24672b;

            /* renamed from: c */
            final /* synthetic */ CountDownLatch f24673c;

            C8794a(String[] strArr, int i, CountDownLatch countDownLatch) {
                this.f24671a = strArr;
                this.f24672b = i;
                this.f24673c = countDownLatch;
            }

            /* renamed from: a */
            public void mo107a(C2642h hVar) {
                try {
                    FacebookRequestError g = hVar.mo8279g();
                    String str = "Error staging photo.";
                    if (g != null) {
                        String e = g.mo8162e();
                        if (e != null) {
                            str = e;
                        }
                        throw new FacebookGraphResponseException(hVar, str);
                    }
                    JSONObject h = hVar.mo8280h();
                    if (h != null) {
                        String optString = h.optString("uri");
                        if (optString != null) {
                            this.f24671a[this.f24672b] = optString;
                            this.f24673c.countDown();
                            return;
                        }
                        throw new FacebookException(str);
                    }
                    throw new FacebookException(str);
                } catch (Exception e2) {
                    C8793h.this.f24669c[this.f24672b] = e2;
                }
            }
        }

        C8793h(String str, Bundle bundle) {
            this.f24667a = str;
            this.f24668b = bundle;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|(2:28|26)|38|29) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r10 = r3.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
            if (r10.hasNext() != false) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
            ((android.os.AsyncTask) r10.next()).cancel(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String[] mo24222b(java.lang.Void... r10) {
            /*
                r9 = this;
                boolean r10 = p334z4.C9207a.m34024c(r9)
                r0 = 0
                if (r10 == 0) goto L_0x0008
                return r0
            L_0x0008:
                android.os.Bundle r10 = r9.f24668b     // Catch:{ all -> 0x0089 }
                java.lang.String r1 = "media"
                java.lang.String[] r10 = r10.getStringArray(r1)     // Catch:{ all -> 0x0089 }
                int r1 = r10.length     // Catch:{ all -> 0x0089 }
                java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0089 }
                int r2 = r10.length     // Catch:{ all -> 0x0089 }
                java.lang.Exception[] r2 = new java.lang.Exception[r2]     // Catch:{ all -> 0x0089 }
                r9.f24669c = r2     // Catch:{ all -> 0x0089 }
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0089 }
                int r3 = r10.length     // Catch:{ all -> 0x0089 }
                r2.<init>(r3)     // Catch:{ all -> 0x0089 }
                java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x0089 }
                r3.<init>()     // Catch:{ all -> 0x0089 }
                com.facebook.AccessToken r4 = com.facebook.AccessToken.m9965h()     // Catch:{ all -> 0x0089 }
                r5 = 0
            L_0x0028:
                r6 = 1
                int r7 = r10.length     // Catch:{ Exception -> 0x0074 }
                if (r5 >= r7) goto L_0x0070
                boolean r7 = r9.isCancelled()     // Catch:{ Exception -> 0x0074 }
                if (r7 == 0) goto L_0x0047
                java.util.Iterator r10 = r3.iterator()     // Catch:{ Exception -> 0x0074 }
            L_0x0036:
                boolean r1 = r10.hasNext()     // Catch:{ Exception -> 0x0074 }
                if (r1 == 0) goto L_0x0046
                java.lang.Object r1 = r10.next()     // Catch:{ Exception -> 0x0074 }
                android.os.AsyncTask r1 = (android.os.AsyncTask) r1     // Catch:{ Exception -> 0x0074 }
                r1.cancel(r6)     // Catch:{ Exception -> 0x0074 }
                goto L_0x0036
            L_0x0046:
                return r0
            L_0x0047:
                r7 = r10[r5]     // Catch:{ Exception -> 0x0074 }
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0074 }
                boolean r8 = p297w4.C8769a0.m32646S(r7)     // Catch:{ Exception -> 0x0074 }
                if (r8 == 0) goto L_0x005d
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0074 }
                r1[r5] = r7     // Catch:{ Exception -> 0x0074 }
                r2.countDown()     // Catch:{ Exception -> 0x0074 }
                goto L_0x006d
            L_0x005d:
                w4.c0$h$a r8 = new w4.c0$h$a     // Catch:{ Exception -> 0x0074 }
                r8.<init>(r1, r5, r2)     // Catch:{ Exception -> 0x0074 }
                com.facebook.GraphRequest r7 = com.facebook.share.internal.C2697b.m10483b(r4, r7, r8)     // Catch:{ Exception -> 0x0074 }
                com.facebook.f r7 = r7.mo8185i()     // Catch:{ Exception -> 0x0074 }
                r3.add(r7)     // Catch:{ Exception -> 0x0074 }
            L_0x006d:
                int r5 = r5 + 1
                goto L_0x0028
            L_0x0070:
                r2.await()     // Catch:{ Exception -> 0x0074 }
                return r1
            L_0x0074:
                java.util.Iterator r10 = r3.iterator()     // Catch:{ all -> 0x0089 }
            L_0x0078:
                boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0089 }
                if (r1 == 0) goto L_0x0088
                java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x0089 }
                android.os.AsyncTask r1 = (android.os.AsyncTask) r1     // Catch:{ all -> 0x0089 }
                r1.cancel(r6)     // Catch:{ all -> 0x0089 }
                goto L_0x0078
            L_0x0088:
                return r0
            L_0x0089:
                r10 = move-exception
                p334z4.C9207a.m34023b(r10, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p297w4.C8785c0.C8793h.mo24222b(java.lang.Void[]):java.lang.String[]");
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo24223c(String[] strArr) {
            if (!C9207a.m34024c(this)) {
                try {
                    C8785c0.this.f24647h.dismiss();
                    for (Exception exc : this.f24669c) {
                        if (exc != null) {
                            C8785c0.this.mo24203t(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        C8785c0.this.mo24203t(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List asList = Arrays.asList(strArr);
                    if (asList.contains((Object) null)) {
                        C8785c0.this.mo24203t(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    C8769a0.m32657b0(this.f24668b, "media", new JSONArray(asList));
                    String unused = C8785c0.this.f24643d = C8769a0.m32662e(C8845v.m32932b(), C2626d.m10144o() + C11110u2.f31950c + "dialog/" + this.f24667a, this.f24668b).toString();
                    C8785c0.this.m32742x((C8785c0.this.f24648i.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (C9207a.m34024c(this)) {
                return null;
            }
            try {
                return mo24222b((Void[]) objArr);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (!C9207a.m34024c(this)) {
                try {
                    mo24223c((String[]) obj);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    protected C8785c0(Context context, String str) {
        this(context, str, m32739l());
    }

    /* renamed from: j */
    private void m32737j() {
        ImageView imageView = new ImageView(getContext());
        this.f24648i = imageView;
        imageView.setOnClickListener(new C8787b());
        this.f24648i.setImageDrawable(getContext().getResources().getDrawable(C8364a.com_facebook_close));
        this.f24648i.setVisibility(4);
    }

    /* renamed from: k */
    private int m32738k(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        return (int) (((double) i) * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d) + 0.5d));
    }

    /* renamed from: l */
    public static int m32739l() {
        C8775b0.m32718k();
        return f24642q;
    }

    /* renamed from: n */
    protected static void m32740n(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null && f24642q == 0) {
                    m32743y(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: q */
    public static C8785c0 m32741q(Context context, String str, Bundle bundle, int i, C8792g gVar) {
        m32740n(context);
        return new C8785c0(context, str, bundle, i, gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m32742x(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        C8788c cVar = new C8788c(getContext());
        this.f24646g = cVar;
        cVar.setVerticalScrollBarEnabled(false);
        this.f24646g.setHorizontalScrollBarEnabled(false);
        this.f24646g.setWebViewClient(new C8791f(this, (C8786a) null));
        this.f24646g.getSettings().setJavaScriptEnabled(true);
        this.f24646g.loadUrl(this.f24643d);
        this.f24646g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f24646g.setVisibility(4);
        this.f24646g.getSettings().setSavePassword(false);
        this.f24646g.getSettings().setSaveFormData(false);
        this.f24646g.setFocusable(true);
        this.f24646g.setFocusableInTouchMode(true);
        this.f24646g.setOnTouchListener(new C8789d());
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f24646g);
        linearLayout.setBackgroundColor(-872415232);
        this.f24649j.addView(linearLayout);
    }

    /* renamed from: y */
    public static void m32743y(int i) {
        if (i == 0) {
            i = f24641p;
        }
        f24642q = i;
    }

    public void cancel() {
        if (this.f24645f != null && !this.f24651l) {
            mo24203t(new FacebookOperationCanceledException());
        }
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f24646g;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f24652m && (progressDialog = this.f24647h) != null && progressDialog.isShowing()) {
            this.f24647h.dismiss();
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public WebView mo24191m() {
        return this.f24646g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo24192o() {
        return this.f24651l;
    }

    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        this.f24652m = false;
        if (C8769a0.m32653Z(getContext()) && (layoutParams = this.f24654o) != null && layoutParams.token == null) {
            layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
            C8769a0.m32649V("FacebookSDK.WebDialog", "Set token on onAttachedToWindow(): " + this.f24654o.token);
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f24647h = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f24647h.setMessage(getContext().getString(C8367d.com_facebook_loading));
        this.f24647h.setCanceledOnTouchOutside(false);
        this.f24647h.setOnCancelListener(new C8786a());
        requestWindowFeature(1);
        this.f24649j = new FrameLayout(getContext());
        mo24202s();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m32737j();
        if (this.f24643d != null) {
            m32742x((this.f24648i.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f24649j.addView(this.f24648i, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f24649j);
    }

    public void onDetachedFromWindow() {
        this.f24652m = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            WebView webView = this.f24646g;
            if (webView == null || !webView.canGoBack()) {
                cancel();
            } else {
                this.f24646g.goBack();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C8793h hVar = this.f24650k;
        if (hVar == null || hVar.getStatus() != AsyncTask.Status.PENDING) {
            mo24202s();
            return;
        }
        this.f24650k.execute(new Void[0]);
        this.f24647h.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C8793h hVar = this.f24650k;
        if (hVar != null) {
            hVar.cancel(true);
            this.f24647h.dismiss();
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f24654o = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo24200p() {
        return this.f24653n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Bundle mo24201r(String str) {
        Uri parse = Uri.parse(str);
        Bundle a0 = C8769a0.m32655a0(parse.getQuery());
        a0.putAll(C8769a0.m32655a0(parse.getFragment()));
        return a0;
    }

    /* renamed from: s */
    public void mo24202s() {
        int i;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (i2 < i3) {
            i = i2;
        } else {
            i = i3;
        }
        if (i2 < i3) {
            i2 = i3;
        }
        getWindow().setLayout(Math.min(m32738k(i, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m32738k(i2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo24203t(Throwable th) {
        FacebookException facebookException;
        if (this.f24645f != null && !this.f24651l) {
            this.f24651l = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            this.f24645f.mo8426a((Bundle) null, facebookException);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo24204u(Bundle bundle) {
        C8792g gVar = this.f24645f;
        if (gVar != null && !this.f24651l) {
            this.f24651l = true;
            gVar.mo8426a(bundle, (FacebookException) null);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo24205v(String str) {
        this.f24644e = str;
    }

    /* renamed from: w */
    public void mo24206w(C8792g gVar) {
        this.f24645f = gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8785c0(Context context, String str, int i) {
        super(context, i == 0 ? m32739l() : i);
        this.f24644e = "fbconnect://success";
        this.f24651l = false;
        this.f24652m = false;
        this.f24653n = false;
        this.f24643d = str;
    }

    /* renamed from: w4.c0$e */
    public static class C8790e {

        /* renamed from: a */
        private Context f24659a;

        /* renamed from: b */
        private String f24660b;

        /* renamed from: c */
        private String f24661c;

        /* renamed from: d */
        private int f24662d;

        /* renamed from: e */
        private C8792g f24663e;

        /* renamed from: f */
        private Bundle f24664f;

        /* renamed from: g */
        private AccessToken f24665g;

        public C8790e(Context context, String str, Bundle bundle) {
            this.f24665g = AccessToken.m9965h();
            if (!AccessToken.m9967v()) {
                String z = C8769a0.m32698z(context);
                if (z != null) {
                    this.f24660b = z;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m32753b(context, str, bundle);
        }

        /* renamed from: b */
        private void m32753b(Context context, String str, Bundle bundle) {
            this.f24659a = context;
            this.f24661c = str;
            if (bundle != null) {
                this.f24664f = bundle;
            } else {
                this.f24664f = new Bundle();
            }
        }

        /* renamed from: a */
        public C8785c0 mo8431a() {
            AccessToken accessToken = this.f24665g;
            if (accessToken != null) {
                this.f24664f.putString("app_id", accessToken.mo8124g());
                this.f24664f.putString("access_token", this.f24665g.mo8134t());
            } else {
                this.f24664f.putString("app_id", this.f24660b);
            }
            return C8785c0.m32741q(this.f24659a, this.f24661c, this.f24664f, this.f24662d, this.f24663e);
        }

        /* renamed from: c */
        public String mo24211c() {
            return this.f24660b;
        }

        /* renamed from: d */
        public Context mo24212d() {
            return this.f24659a;
        }

        /* renamed from: e */
        public C8792g mo24213e() {
            return this.f24663e;
        }

        /* renamed from: f */
        public Bundle mo24214f() {
            return this.f24664f;
        }

        /* renamed from: g */
        public int mo24215g() {
            return this.f24662d;
        }

        /* renamed from: h */
        public C8790e mo24216h(C8792g gVar) {
            this.f24663e = gVar;
            return this;
        }

        public C8790e(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? C8769a0.m32698z(context) : str;
            C8775b0.m32717j(str, "applicationId");
            this.f24660b = str;
            m32753b(context, str2, bundle);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8785c0(Context context, String str, Bundle bundle, int i, C8792g gVar) {
        super(context, i == 0 ? m32739l() : i);
        String str2 = "fbconnect://success";
        this.f24644e = str2;
        this.f24651l = false;
        this.f24652m = false;
        this.f24653n = false;
        bundle = bundle == null ? new Bundle() : bundle;
        str2 = C8769a0.m32639L(context) ? "fbconnect://chrome_os_success" : str2;
        this.f24644e = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C2626d.m10135f());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{C2626d.m10149t()}));
        this.f24645f = gVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            String b = C8845v.m32932b();
            this.f24643d = C8769a0.m32662e(b, C2626d.m10144o() + C11110u2.f31950c + "dialog/" + str, bundle).toString();
            return;
        }
        this.f24650k = new C8793h(str, bundle);
    }
}
