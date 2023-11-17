package p345ad;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.androidnetworking.error.ANError;
import com.google.gson.C5494h;
import com.google.gson.C5611k;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41549y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe1.C41851b;
import of1.C41944z;
import org.json.JSONObject;
import p100h2.C6421a;
import p113i2.C6521b;
import p113i2.C6524e;
import p152l2.C6872e;
import p388dd.C12073a;
import p402ed.C12425c;
import p555pc.C17336a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ad.e */
public final class C9786e {

    /* renamed from: a */
    public static final C9787a f26584a = new C9787a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f26585b = "";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f26586c = "https://widget.identomat.com/api/";

    /* renamed from: ad.e$a */
    public static final class C9787a {
        private C9787a() {
        }

        public /* synthetic */ C9787a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo26262a() {
            return C9786e.f26585b;
        }

        /* renamed from: b */
        public final void mo26263b(String str) {
            C41536l.m120489i(str, "<set-?>");
            C9786e.f26586c = str;
        }

        /* renamed from: c */
        public final void mo26264c(String str) {
            C41536l.m120489i(str, "<set-?>");
            C9786e.f26585b = str;
        }
    }

    /* renamed from: ad.e$b */
    public static final class C9788b implements C6872e {

        /* renamed from: a */
        final /* synthetic */ C43064a f26587a;

        C9788b(C43064a aVar) {
            this.f26587a = aVar;
        }

        /* renamed from: a */
        public void mo20946a(String str) {
            Log.i("identomat_", C41536l.m120497q("log: ", str));
            this.f26587a.invoke();
        }

        /* renamed from: b */
        public void mo20947b(ANError aNError) {
            String str;
            if (aNError == null) {
                str = null;
            } else {
                str = aNError.mo7641a();
            }
            Log.i("identomat_", C41536l.m120497q("log: ", str));
            this.f26587a.invoke();
        }
    }

    /* renamed from: j */
    private final String m35985j(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        C41536l.m120488h(applicationInfo, "context.applicationInfo");
        int i = applicationInfo.labelRes;
        if (i == 0) {
            return applicationInfo.nonLocalizedLabel.toString();
        }
        return context.getString(i);
    }

    /* renamed from: k */
    private final C9800j m35986k(ANError aNError) {
        if (aNError != null) {
            if (aNError.mo7641a().equals("connectionError")) {
                Log.i("identomat_", C41536l.m120497q("onError: ", aNError.mo7641a()));
                return new C9800j(C9801k.NO_CONNECTION, (String) null, (JSONObject) null, 6, (DefaultConstructorMarker) null);
            } else if (aNError.mo7641a().equals("responseFromServerError")) {
                return new C9800j(C9801k.SESSION_ENDED, (String) null, (JSONObject) null, 6, (DefaultConstructorMarker) null);
            }
        }
        return new C9800j(C9801k.FAIL, (String) null, (JSONObject) null, 6, (DefaultConstructorMarker) null);
    }

    /* renamed from: l */
    private final String m35987l(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context == null ? null : m35985j(context));
        sb.append(System.getProperty("http.agent"));
        sb.append(" identomatAndroid-version/1.1.68");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m35988p(C43075l lVar, long j, C41549y yVar, long j2, long j3) {
        C41536l.m120489i(yVar, "$start2");
        if (lVar == null) {
            return;
        }
        if (j2 == j3) {
            lVar.invoke(100);
            Log.i("identomat_", C41536l.m120497q("upload time: ", Long.valueOf(System.currentTimeMillis() - j)));
            yVar.f97716d = System.currentTimeMillis();
            return;
        }
        lVar.invoke(Integer.valueOf((int) ((((double) j2) / ((double) j3)) * ((double) 100))));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m35989u(C43075l lVar, long j, long j2) {
        if (lVar == null) {
            return;
        }
        if (j == j2) {
            lVar.invoke(100);
        } else {
            lVar.invoke(Integer.valueOf((int) ((((double) j) / ((double) j2)) * ((double) 100))));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m35990x(C43075l lVar, long j, C41549y yVar, long j2, long j3) {
        C41536l.m120489i(yVar, "$start2");
        if (lVar == null) {
            return;
        }
        if (j2 == j3) {
            lVar.invoke(100);
            Log.i("identomat_", C41536l.m120497q("upload time: ", Long.valueOf(System.currentTimeMillis() - j)));
            yVar.f97716d = System.currentTimeMillis();
            return;
        }
        lVar.invoke(Integer.valueOf((int) ((((double) j2) / ((double) j3)) * ((double) 100))));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m35991z(long j, C41549y yVar, long j2, long j3) {
        C41536l.m120489i(yVar, "$start2");
        if (j2 == j3) {
            Log.i("identomat_", C41536l.m120497q("upload time: ", Long.valueOf(System.currentTimeMillis() - j)));
            yVar.f97716d = System.currentTimeMillis();
        }
    }

    /* renamed from: A */
    public final Object mo26247A(Context context, File file, Continuation continuation) {
        C6521b n = C6421a.m25499b(f26586c + "face-document/?portrait=1&session_token=" + f26585b).mo20486p("image", file).mo20488s("session_token", f26585b).mo20485o("User-agent", m35987l(context)).mo20492w(C6524e.HIGH).mo20490u().mo20465n();
        if (!n.mo20499d()) {
            return m35986k(n.mo20497b());
        }
        Object c = n.mo20498c();
        if (c != null) {
            String str = (String) c;
            if (C40440x.m117139M(str, "html", false, 2, (Object) null)) {
                return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
            }
            try {
                C5494h a = new C5611k().mo18452a(str);
                C41536l.m120488h(a, "JsonParser().parse(result)");
                if (!a.mo18221r()) {
                    return new C9800j(C9801k.FAIL, str, (JSONObject) null, 4, (DefaultConstructorMarker) null);
                }
                C9801k kVar = C9801k.SUCCESS;
                String k = a.mo18211k();
                C41536l.m120488h(k, "jsonElem.asString");
                return new C9800j(kVar, k, (JSONObject) null, 4, (DefaultConstructorMarker) null);
            } catch (Exception unused) {
                return new C9800j(C9801k.FAIL, str, (JSONObject) null, 4, (DefaultConstructorMarker) null);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* renamed from: B */
    public final Object mo26248B(Context context, File file, Continuation continuation) {
        C6521b n = C6421a.m25499b(f26586c + "record/probe/?session_token=" + f26585b).mo20486p("image", file).mo20488s("session_token", f26585b).mo20485o("User-agent", m35987l(context)).mo20492w(C6524e.HIGH).mo20490u().mo20465n();
        if (!n.mo20499d()) {
            return m35986k(n.mo20497b());
        }
        Object c = n.mo20498c();
        if (c != null) {
            String str = (String) c;
            if (C40440x.m117139M(str, "html", false, 2, (Object) null)) {
                return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
            }
            try {
                C5494h a = new C5611k().mo18452a(str);
                C41536l.m120488h(a, "JsonParser().parse(result)");
                if (!a.mo18221r()) {
                    return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
                }
                C9801k kVar = C9801k.SUCCESS;
                String k = a.mo18211k();
                C41536l.m120488h(k, "jsonElem.asString");
                return new C9800j(kVar, k, (JSONObject) null, 4, (DefaultConstructorMarker) null);
            } catch (Exception unused) {
                return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* renamed from: C */
    public final String mo26249C() {
        return f26585b;
    }

    /* renamed from: h */
    public final void mo26250h(Context context, C43064a aVar) {
        C41536l.m120489i(aVar, "callback");
        String q = C41536l.m120497q(f26586c, "camera-request-fail/");
        Log.i("identomat_", q);
        C6421a.m25498a(q).mo20494t("User-agent", m35987l(context)).mo20496v(C6524e.HIGH).mo20493s("session_token", f26585b).mo20495u().mo20468q(new C9788b(aVar));
    }

    /* renamed from: i */
    public final Object mo26251i(Context context, Continuation continuation) {
        C6521b m = C6421a.m25498a(f26586c + "disagree/?session_token=" + f26585b).mo20494t("User-agent", m35987l(context)).mo20496v(C6524e.HIGH).mo20495u().mo20464m();
        if (m.mo20499d()) {
            return new C9800j(C9801k.SUCCESS, "success", (JSONObject) null, 4, (DefaultConstructorMarker) null);
        }
        return m35986k(m.mo20497b());
    }

    /* renamed from: m */
    public final Object mo26252m(Context context, Continuation continuation) {
        String str = f26586c + "init/?session_token=" + f26585b;
        Log.i("identomat_", str);
        C6521b m = C6421a.m25498a(str).mo20494t("User-agent", m35987l(context)).mo20496v(C6524e.HIGH).mo20495u().mo20464m();
        if (!m.mo20499d()) {
            return m35986k(m.mo20497b());
        }
        Object c = m.mo20498c();
        if (c != null) {
            return new C9800j(C9801k.SUCCESS, "success", (JSONObject) c);
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    /* renamed from: n */
    public final Object mo26253n(Context context, Continuation continuation) {
        C6521b m = C6421a.m25498a(f26586c + "record/init/?session_token=" + f26585b).mo20494t("User-agent", m35987l(context)).mo20496v(C6524e.HIGH).mo20495u().mo20464m();
        if (!m.mo20499d()) {
            return m35986k(m.mo20497b());
        }
        Object c = m.mo20498c();
        if (c != null) {
            JSONObject jSONObject = (JSONObject) c;
            Log.i("identomat_", C41536l.m120497q("livenessInit: ", jSONObject));
            return new C9800j(C9801k.SUCCESS, (String) null, jSONObject, 2, (DefaultConstructorMarker) null);
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    /* renamed from: o */
    public final Object mo26254o(Context context, File file, C43075l lVar, Continuation continuation) {
        long currentTimeMillis = System.currentTimeMillis();
        C41549y yVar = new C41549y();
        yVar.f97716d = System.currentTimeMillis();
        C41944z.C41945a B = new C41944z().mo97033B();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C41944z d = B.mo97101f(120, timeUnit).mo97079O(120, timeUnit).mo97102f0(120, timeUnit).mo97097d();
        C41536l.m120488h(d, "OkHttpClient().newBuilder()\n            .connectTimeout(120, TimeUnit.SECONDS)\n            .readTimeout(120, TimeUnit.SECONDS)\n            .writeTimeout(120, TimeUnit.SECONDS)\n            .build()");
        C6521b n = C6421a.m25499b(f26586c + "record/verify/?session_token=" + f26585b).mo20486p("video", file).mo20488s("session_token", f26585b).mo20485o("User-agent", m35987l(context)).mo20492w(C6524e.HIGH).mo20491v(d).mo20490u().mo20457O(new C9785d(lVar, currentTimeMillis, yVar)).mo20465n();
        if (n.mo20499d()) {
            Object c = n.mo20498c();
            if (c != null) {
                String str = (String) c;
                if (C40440x.m117139M(str, "html", false, 2, (Object) null)) {
                    return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
                }
                try {
                    C5494h a = new C5611k().mo18452a(str);
                    C41536l.m120488h(a, "JsonParser().parse(result)");
                    if (!a.mo18221r()) {
                        return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
                    }
                    C9801k kVar = C9801k.SUCCESS;
                    String k = a.mo18211k();
                    C41536l.m120488h(k, "jsonElem.asString");
                    return new C9800j(kVar, k, (JSONObject) null, 4, (DefaultConstructorMarker) null);
                } catch (Exception unused) {
                    return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            return m35986k(n.mo20497b());
        }
    }

    /* renamed from: q */
    public final void mo26255q(Context context, String str) {
        C41536l.m120489i(str, "page");
        C6421a.m25498a(C41536l.m120497q(f26586c, "log-page-load/")).mo20494t("User-agent", m35987l(context)).mo20496v(C6524e.HIGH).mo20493s("page", str).mo20493s("session_token", f26585b).mo20495u().mo20468q((C6872e) null);
    }

    /* renamed from: r */
    public final void mo26256r(Context context, String str) {
        C41536l.m120489i(str, "document");
        C6421a.m25498a(C41536l.m120497q(f26586c, "method/")).mo20494t("User-agent", m35987l(context)).mo20496v(C6524e.HIGH).mo20493s(C11755a.C11756a.f34100b, str).mo20493s("session_token", f26585b).mo20495u().mo20468q((C6872e) null);
    }

    /* renamed from: s */
    public final void mo26257s(Context context, int i) {
        C6421a.m25498a(C41536l.m120497q(f26586c, "log-page-visibility/")).mo20494t("User-agent", m35987l(context)).mo20496v(C6524e.HIGH).mo20493s("visibility", String.valueOf(i)).mo20493s("session_token", f26585b).mo20495u().mo20468q((C6872e) null);
    }

    /* renamed from: t */
    public final Object mo26258t(Context context, File file, C43075l lVar, Continuation continuation) {
        C41944z.C41945a B = new C41944z().mo97033B();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C41944z d = B.mo97101f(120, timeUnit).mo97079O(120, timeUnit).mo97102f0(120, timeUnit).mo97097d();
        C41536l.m120488h(d, "OkHttpClient().newBuilder()\n            .connectTimeout(120, TimeUnit.SECONDS)\n            .readTimeout(120, TimeUnit.SECONDS)\n            .writeTimeout(120, TimeUnit.SECONDS)\n            .build()");
        C6521b n = C6421a.m25499b(f26586c + "face/var-video/?session_token=" + f26585b).mo20486p("video", file).mo20488s("session_token", f26585b).mo20485o("User-agent", m35987l(context)).mo20492w(C6524e.HIGH).mo20491v(d).mo20490u().mo20457O(new C9783b(lVar)).mo20465n();
        if (n.mo20499d()) {
            Object c = n.mo20498c();
            if (c != null) {
                String str = (String) c;
                if (C40440x.m117139M(str, "html", false, 2, (Object) null)) {
                    return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
                }
                try {
                    C5494h a = new C5611k().mo18452a(str);
                    C41536l.m120488h(a, "JsonParser().parse(result)");
                    if (!a.mo18221r()) {
                        return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
                    }
                    C9801k kVar = C9801k.SUCCESS;
                    String k = a.mo18211k();
                    C41536l.m120488h(k, "jsonElem.asString");
                    return new C9800j(kVar, k, (JSONObject) null, 4, (DefaultConstructorMarker) null);
                } catch (Exception unused) {
                    return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            return m35986k(n.mo20497b());
        }
    }

    /* renamed from: v */
    public final void mo26259v(Context context) {
        C6421a.m25498a(f26586c + "android-init/?session_token=" + f26585b + "&devices=" + C12073a.f35481a.mo32217b(context) + "&system=" + C12425c.f37092a.mo33031a()).mo20494t("User-agent", m35987l(context)).mo20496v(C6524e.HIGH).mo20495u().mo20464m();
    }

    /* renamed from: w */
    public final Object mo26260w(Context context, File file, int i, int i2, int i3, int i4, C43075l lVar, Continuation continuation) {
        C9800j jVar;
        long currentTimeMillis = System.currentTimeMillis();
        C41549y yVar = new C41549y();
        yVar.f97716d = System.currentTimeMillis();
        String str = f26586c + C17336a.f48645a.mo44745d(i3, i4) + "?session_token=" + f26585b;
        Log.i("identomat_", str);
        C6521b n = C6421a.m25499b(str).mo20486p("image", file).mo20488s("session_token", f26585b).mo20488s("image_width", String.valueOf(i)).mo20488s("image_height", String.valueOf(i2)).mo20485o("User-agent", m35987l(context)).mo20492w(C6524e.HIGH).mo20490u().mo20457O(new C9784c(lVar, currentTimeMillis, yVar)).mo20465n();
        if (!n.mo20499d()) {
            return m35986k(n.mo20497b());
        }
        Log.i("identomat_", C41536l.m120497q("server time:", C41851b.m121257d(System.currentTimeMillis() - yVar.f97716d)));
        Object c = n.mo20498c();
        if (c != null) {
            String str2 = (String) c;
            if (C40440x.m117139M(str2, "html", false, 2, (Object) null)) {
                return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
            }
            try {
                C5494h a = new C5611k().mo18452a(str2);
                C41536l.m120488h(a, "JsonParser().parse(result)");
                if (a.mo18221r()) {
                    C9801k kVar = C9801k.FAIL;
                    String k = a.mo18211k();
                    C41536l.m120488h(k, "jsonElem.asString");
                    return new C9800j(kVar, k, (JSONObject) null, 4, (DefaultConstructorMarker) null);
                } else if (a.mo18220o()) {
                    C9801k kVar2 = C9801k.SUCCESS;
                    String hVar = a.toString();
                    C41536l.m120488h(hVar, "jsonElem.toString()");
                    return new C9800j(kVar2, hVar, (JSONObject) null, 4, (DefaultConstructorMarker) null);
                } else {
                    jVar = new C9800j(C9801k.FAIL, str2, (JSONObject) null, 4, (DefaultConstructorMarker) null);
                    return jVar;
                }
            } catch (Exception unused) {
                jVar = new C9800j(C9801k.FAIL, str2, (JSONObject) null, 4, (DefaultConstructorMarker) null);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* renamed from: y */
    public final Object mo26261y(Context context, File file, int i, int i2, Continuation continuation) {
        long currentTimeMillis = System.currentTimeMillis();
        C41549y yVar = new C41549y();
        yVar.f97716d = System.currentTimeMillis();
        String str = f26586c + "probe-document/?session_token=" + f26585b + ' ';
        Log.i("identomat_", C41536l.m120497q("sendDocumentProbe: ", str));
        File file2 = file;
        C6521b n = C6421a.m25499b(str).mo20486p("image", file).mo20488s("session_token", C41536l.m120497q(f26585b, "")).mo20488s("image_width", String.valueOf(i)).mo20488s("image_height", String.valueOf(i2)).mo20485o("User-agent", m35987l(context)).mo20492w(C6524e.HIGH).mo20490u().mo20457O(new C9782a(currentTimeMillis, yVar)).mo20465n();
        if (n.mo20499d()) {
            Log.i("identomat_", C41536l.m120497q("server time:", C41851b.m121257d(System.currentTimeMillis() - yVar.f97716d)));
            Object c = n.mo20498c();
            if (c != null) {
                String str2 = (String) c;
                if (C40440x.m117139M(str2, "html", false, 2, (Object) null)) {
                    Log.i("identomat_", "html error: ");
                    return new C9800j(C9801k.FAIL, "", (JSONObject) null, 4, (DefaultConstructorMarker) null);
                }
                try {
                    C5494h a = new C5611k().mo18452a(str2);
                    C41536l.m120488h(a, "JsonParser().parse(result)");
                    if (!a.mo18221r()) {
                        return new C9800j(C9801k.FAIL, str2, (JSONObject) null, 4, (DefaultConstructorMarker) null);
                    }
                    C9801k kVar = C9801k.SUCCESS;
                    String k = a.mo18211k();
                    C41536l.m120488h(k, "jsonElem.asString");
                    return new C9800j(kVar, k, (JSONObject) null, 4, (DefaultConstructorMarker) null);
                } catch (Exception unused) {
                    return new C9800j(C9801k.FAIL, str2, (JSONObject) null, 4, (DefaultConstructorMarker) null);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            return m35986k(n.mo20497b());
        }
    }
}
