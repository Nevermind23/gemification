package p141k4;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.GraphRequest;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p141k4.C6808f;
import p193o4.C7438b;
import p297w4.C8765a;
import p297w4.C8769a0;
import p297w4.C8817m;
import p297w4.C8819n;
import p334z4.C9207a;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: k4.b */
public abstract class C6790b {

    /* renamed from: a */
    private static final C6808f f20414a = new C6808f();

    /* renamed from: b */
    private static SensorManager f20415b;

    /* renamed from: c */
    private static C6802e f20416c;

    /* renamed from: d */
    private static String f20417d;

    /* renamed from: e */
    private static final AtomicBoolean f20418e = new AtomicBoolean(true);

    /* renamed from: f */
    private static final AtomicBoolean f20419f = new AtomicBoolean(false);

    /* renamed from: g */
    private static volatile Boolean f20420g = Boolean.FALSE;

    /* renamed from: h */
    private static C6794d f20421h = new C6791a();

    /* renamed from: k4.b$a */
    static class C6791a implements C6794d {
        C6791a() {
        }

        /* renamed from: a */
        public void mo20850a(String str) {
            C6790b.m26484f(str);
        }
    }

    /* renamed from: k4.b$b */
    static class C6792b implements C6808f.C6809a {

        /* renamed from: a */
        final /* synthetic */ C8817m f20422a;

        /* renamed from: b */
        final /* synthetic */ String f20423b;

        C6792b(C8817m mVar, String str) {
            this.f20422a = mVar;
            this.f20423b = str;
        }

        /* renamed from: a */
        public void mo20851a() {
            boolean z;
            C8817m mVar = this.f20422a;
            boolean z2 = true;
            if (mVar == null || !mVar.mo24239b()) {
                z = false;
            } else {
                z = true;
            }
            if (!C2626d.m10141l()) {
                z2 = false;
            }
            if (z && z2) {
                C6790b.m26479a().mo20850a(this.f20423b);
            }
        }
    }

    /* renamed from: k4.b$c */
    static class C6793c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f20424d;

        C6793c(String str) {
            this.f20424d = str;
        }

        public void run() {
            String str = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
            if (!C9207a.m34024c(this)) {
                try {
                    boolean z = true;
                    GraphRequest K = GraphRequest.m10013K((AccessToken) null, String.format(Locale.US, "%s/app_indexing_session", new Object[]{this.f20424d}), (JSONObject) null, (GraphRequest.C2612e) null);
                    Bundle y = K.mo8192y();
                    if (y == null) {
                        y = new Bundle();
                    }
                    C8765a h = C8765a.m32617h(C2626d.m10134e());
                    JSONArray jSONArray = new JSONArray();
                    String str2 = Build.MODEL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONArray.put(str2);
                    if (h == null || h.mo24172b() == null) {
                        jSONArray.put("");
                    } else {
                        jSONArray.put(h.mo24172b());
                    }
                    jSONArray.put(str);
                    if (C7438b.m28297f()) {
                        str = "1";
                    }
                    jSONArray.put(str);
                    Locale v = C8769a0.m32694v();
                    jSONArray.put(v.getLanguage() + "_" + v.getCountry());
                    String jSONArray2 = jSONArray.toString();
                    y.putString("device_session_id", C6790b.m26487i());
                    y.putString("extinfo", jSONArray2);
                    K.mo8181Z(y);
                    JSONObject h2 = K.mo8184g().mo8280h();
                    AtomicBoolean b = C6790b.m26480b();
                    if (h2 == null || !h2.optBoolean("is_app_indexing_enabled", false)) {
                        z = false;
                    }
                    b.set(z);
                    if (!C6790b.m26480b().get()) {
                        C6790b.m26481c((String) null);
                    } else if (C6790b.m26482d() != null) {
                        C6790b.m26482d().mo20867k();
                    }
                    C6790b.m26483e(Boolean.FALSE);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: k4.b$d */
    public interface C6794d {
        /* renamed from: a */
        void mo20850a(String str);
    }

    /* renamed from: a */
    static /* synthetic */ C6794d m26479a() {
        Class<C6790b> cls = C6790b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f20421h;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ AtomicBoolean m26480b() {
        Class<C6790b> cls = C6790b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f20419f;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ String m26481c(String str) {
        Class<C6790b> cls = C6790b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            f20417d = str;
            return str;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ C6802e m26482d() {
        Class<C6790b> cls = C6790b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f20416c;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m26483e(Boolean bool) {
        Class<C6790b> cls = C6790b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            f20420g = bool;
            return bool;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    static void m26484f(String str) {
        Class<C6790b> cls = C6790b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (!f20420g.booleanValue()) {
                    f20420g = Boolean.TRUE;
                    C2626d.m10142m().execute(new C6793c(str));
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: g */
    public static void m26485g() {
        Class<C6790b> cls = C6790b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f20418e.set(false);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: h */
    public static void m26486h() {
        Class<C6790b> cls = C6790b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f20418e.set(true);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: i */
    static String m26487i() {
        Class<C6790b> cls = C6790b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            if (f20417d == null) {
                f20417d = UUID.randomUUID().toString();
            }
            return f20417d;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: j */
    static boolean m26488j() {
        Class<C6790b> cls = C6790b.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return f20419f.get();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: k */
    static boolean m26489k() {
        C9207a.m34024c(C6790b.class);
        return false;
    }

    /* renamed from: l */
    public static void m26490l(Activity activity) {
        Class<C6790b> cls = C6790b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C6795c.m26499e().mo20854d(activity);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: m */
    public static void m26491m(Activity activity) {
        Class<C6790b> cls = C6790b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (f20418e.get()) {
                    C6795c.m26499e().mo20855h(activity);
                    C6802e eVar = f20416c;
                    if (eVar != null) {
                        eVar.mo20868m();
                    }
                    SensorManager sensorManager = f20415b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(f20414a);
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: n */
    public static void m26492n(Activity activity) {
        Class<C6790b> cls = C6790b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (f20418e.get()) {
                    C6795c.m26499e().mo20853c(activity);
                    Context applicationContext = activity.getApplicationContext();
                    String f = C2626d.m10135f();
                    C8817m j = C8819n.m32843j(f);
                    if ((j != null && j.mo24239b()) || m26489k()) {
                        SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                        f20415b = sensorManager;
                        if (sensorManager != null) {
                            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                            f20416c = new C6802e(activity);
                            C6808f fVar = f20414a;
                            fVar.mo20874a(new C6792b(j, f));
                            f20415b.registerListener(fVar, defaultSensor, 2);
                            if (j != null && j.mo24239b()) {
                                f20416c.mo20867k();
                            }
                        } else {
                            return;
                        }
                    }
                    if (m26489k() && !f20419f.get()) {
                        f20421h.mo20850a(f);
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: o */
    static void m26493o(Boolean bool) {
        Class<C6790b> cls = C6790b.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f20419f.set(bool.booleanValue());
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}
