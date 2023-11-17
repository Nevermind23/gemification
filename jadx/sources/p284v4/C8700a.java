package p284v4;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.C2626d;
import com.google.zxing.C5751a;
import com.google.zxing.C5756f;
import com.google.zxing.C5760j;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import java.util.HashMap;
import p200ob.C7508b;
import p297w4.C8769a0;
import p297w4.C8817m;
import p297w4.C8819n;
import p297w4.C8846w;
import p334z4.C9207a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: v4.a */
public abstract class C8700a {

    /* renamed from: a */
    private static final String f24523a = "v4.a";

    /* renamed from: b */
    private static HashMap f24524b = new HashMap();

    /* renamed from: v4.a$a */
    static class C8701a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        final /* synthetic */ String f24525a;

        /* renamed from: b */
        final /* synthetic */ String f24526b;

        C8701a(String str, String str2) {
            this.f24525a = str;
            this.f24526b = str2;
        }

        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            C8700a.m32442a(this.f24526b);
        }

        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            if (!this.f24525a.equals(nsdServiceInfo.getServiceName())) {
                C8700a.m32442a(this.f24526b);
            }
        }

        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        }

        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }
    }

    /* renamed from: a */
    public static void m32442a(String str) {
        Class<C8700a> cls = C8700a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m32443b(str);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static void m32443b(String str) {
        Class<C8700a> cls = C8700a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) f24524b.get(str);
                if (registrationListener != null) {
                    ((NsdManager) C2626d.m10134e().getSystemService("servicediscovery")).unregisterService(registrationListener);
                    f24524b.remove(str);
                }
            } catch (IllegalArgumentException e) {
                C8769a0.m32648U(f24523a, e);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static Bitmap m32444c(String str) {
        int i;
        Class<C8700a> cls = C8700a.class;
        Bitmap bitmap = null;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(C5756f.class);
            enumMap.put(C5756f.MARGIN, 2);
            try {
                C7508b a = new C5760j().mo18891a(str, C5751a.QR_CODE, BogInputLayout.INPUT_NORMAL_STATE, BogInputLayout.INPUT_NORMAL_STATE, enumMap);
                int h = a.mo21978h();
                int l = a.mo21982l();
                int[] iArr = new int[(h * l)];
                for (int i2 = 0; i2 < h; i2++) {
                    int i3 = i2 * l;
                    for (int i4 = 0; i4 < l; i4++) {
                        int i5 = i3 + i4;
                        if (a.mo21974e(i4, i2)) {
                            i = -16777216;
                        } else {
                            i = -1;
                        }
                        iArr[i5] = i;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(l, h, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(iArr, 0, l, 0, 0, l, h);
                    return createBitmap;
                } catch (WriterException unused) {
                    bitmap = createBitmap;
                }
            } catch (WriterException unused2) {
                return bitmap;
            }
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:3|4|5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001d */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m32445d() {
        /*
            java.lang.Class<v4.a> r0 = p284v4.C8700a.class
            boolean r1 = p334z4.C9207a.m34024c(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0022 }
            r1.<init>()     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = "device"
            java.lang.String r4 = android.os.Build.DEVICE     // Catch:{ JSONException -> 0x001d }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x001d }
            java.lang.String r3 = "model"
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x001d }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x001d }
        L_0x001d:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0022 }
            return r0
        L_0x0022:
            r1 = move-exception
            p334z4.C9207a.m34023b(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p284v4.C8700a.m32445d():java.lang.String");
    }

    /* renamed from: e */
    public static boolean m32446e() {
        Class<C8700a> cls = C8700a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            C8817m j = C8819n.m32843j(C2626d.m10135f());
            if (j == null || !j.mo24248k().contains(C8846w.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m32447f(String str) {
        Class<C8700a> cls = C8700a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (m32446e()) {
                return m32448g(str);
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m32448g(String str) {
        Class<C8700a> cls = C8700a.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (f24524b.containsKey(str)) {
                return true;
            }
            String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{"android", C2626d.m10149t().replace('.', '|')}), str});
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(format);
            nsdServiceInfo.setPort(80);
            C8701a aVar = new C8701a(format, str);
            f24524b.put(str, aVar);
            ((NsdManager) C2626d.m10134e().getSystemService("servicediscovery")).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }
}
