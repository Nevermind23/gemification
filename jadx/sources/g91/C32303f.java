package g91;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.C0767a;
import androidx.fragment.app.Fragment;
import c20.C19455a;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.sso.presentation.SsoWindowActivity;
import p366bk.C10315d;
import p366bk.C10318g;
import p366bk.C10328q;
import p420fh.C12902d;
import p420fh.C12910e;
import r90.C27950a;

/* renamed from: g91.f */
public abstract class C32303f {
    /* renamed from: A */
    public static boolean m95181A(String str, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(str, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: B */
    public static void m95182B(Context context) {
        m95184D(C27950a.m86284a("link.terms.bank.service.terms"), context);
    }

    /* renamed from: C */
    public static void m95183C(Context context) {
        m95184D(C27950a.m86284a("link.mbank.privacy.policy"), context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(1:2)|3|4|5|6|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0029 */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m95184D(java.lang.String r3, android.content.Context r4) {
        /*
            l.b$a r0 = new l.b$a
            r0.<init>()
            int r1 = g91.C32335t0.m95366k(r4)
            r0.mo20932c(r1)
            l.b r0 = r0.mo20931a()
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r2 = "com.android.chrome"
            boolean r1 = m95181A(r2, r1)
            if (r1 == 0) goto L_0x0021
            android.content.Intent r1 = r0.f20535a
            r1.setPackage(r2)
        L_0x0021:
            android.net.Uri r1 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0029 }
            r0.mo20930a(r4, r1)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0040
        L_0x0029:
            l.b$a r0 = new l.b$a     // Catch:{ Exception -> 0x0040 }
            r0.<init>()     // Catch:{ Exception -> 0x0040 }
            int r1 = g91.C32335t0.m95366k(r4)     // Catch:{ Exception -> 0x0040 }
            r0.mo20932c(r1)     // Catch:{ Exception -> 0x0040 }
            l.b r0 = r0.mo20931a()     // Catch:{ Exception -> 0x0040 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0040 }
            r0.mo20930a(r4, r3)     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g91.C32303f.m95184D(java.lang.String, android.content.Context):void");
    }

    /* renamed from: E */
    public static void m95185E(Context context, List list) {
        int[] s = m95208s(context, list.size());
        int[] u = m95210u(context, list.size());
        int[] t = m95209t(context, list.size());
        for (int i = 0; i < list.size(); i++) {
            SwipeLayout.C2363g gVar = (SwipeLayout.C2363g) list.get(i);
            gVar.f7484d = Integer.valueOf(s[i]);
            gVar.f7485e = Integer.valueOf(u[i]);
            gVar.f7486f = Integer.valueOf(t[i]);
        }
    }

    /* renamed from: F */
    public static boolean m95186F() {
        long currentTimeMillis = System.currentTimeMillis();
        if ((C32335t0.m95361f() == 0 || C32335t0.m95361f() == 1) && 1692734460000L < currentTimeMillis && currentTimeMillis < 1693684860000L) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m95187G() {
        long currentTimeMillis = System.currentTimeMillis();
        if (C32335t0.m95361f() != 0 || 1687132800000L >= currentTimeMillis || currentTimeMillis >= 1688774400000L) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public static void m95188H(Activity activity) {
        m95189I(Boolean.FALSE, activity);
    }

    /* renamed from: I */
    public static void m95189I(Boolean bool, Activity activity) {
        if (activity != null) {
            SsoWindowActivity.m101925T0(bool.booleanValue(), activity);
        }
    }

    /* renamed from: a */
    public static boolean m95190a(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m95191b(long j, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("docKey", String.valueOf(j));
        hashMap.put("paymentId", str);
        hashMap.put("printFormType", str2);
        hashMap.put("requestId", C32359z0.m95563d0());
        return RetrofitClient.getUrlWithExtras(BankApi.COLLECTOR_GET_MY_OPERATION_PDF, hashMap);
    }

    /* renamed from: c */
    public static String m95192c(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("requestId", C32359z0.m95563d0());
        if (z) {
            hashMap.put("paymentId", str);
            return RetrofitClient.getUrlWithExtras(BankApi.PAYMENTS_GET_PAYMENT_HISTORY_PDF, hashMap);
        }
        hashMap.put("docKey", str);
        return RetrofitClient.getUrlWithExtras(BankApi.TRANSFERS_GET_TRANSFER_DETAILS_PDF, hashMap);
    }

    /* renamed from: d */
    public static String m95193d(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("acctKey", String.valueOf(j));
        hashMap.put("languageCode", str);
        return RetrofitClient.getUrlWithExtras(BankApi.ACCOUNTS_GET_REQUISITES_PDF, hashMap);
    }

    /* renamed from: e */
    private static void m95194e(String str, Activity activity, Fragment fragment, String str2, String str3) {
        Context context;
        C32330r0 r0Var;
        if (fragment != null) {
            context = fragment.requireContext();
        } else if (activity != null) {
            context = activity;
        } else {
            return;
        }
        if (m95214y(activity, fragment)) {
            DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            int applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting("com.android.providers.downloads");
            if (applicationEnabledSetting == 2 || applicationEnabledSetting == 3 || applicationEnabledSetting == 4) {
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:com.android.providers.downloads"));
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    context.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
                }
            } else {
                request.setTitle(str2);
                if (str3 != null) {
                    request.setMimeType(str3);
                }
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
                downloadManager.enqueue(request);
                if (activity == null) {
                    activity = fragment.requireActivity();
                }
                C12910e.m48784b(activity, C32343x.m95388F("text.common.download.notification", new Object[0]), C12902d.C12905b.C12907b.f38104a);
            }
        } else {
            if (activity != null) {
                r0Var = new C32330r0(activity);
            }
            r0Var.mo72838y(10016);
        }
    }

    /* renamed from: f */
    public static void m95195f(String str, Activity activity, String str2, String str3) {
        m95194e(str, activity, (Fragment) null, str2, str3);
    }

    /* renamed from: g */
    public static void m95196g(String str, Fragment fragment, String str2, String str3) {
        m95194e(str, (Activity) null, fragment, str2, str3);
    }

    /* renamed from: h */
    public static String m95197h(String str) {
        return m95198i(str, false);
    }

    /* renamed from: i */
    public static String m95198i(String str, boolean z) {
        String a = C32314k.m95245a(str);
        if (!z || a.isEmpty()) {
            return a;
        }
        return " " + a;
    }

    /* renamed from: j */
    public static String m95199j(long j) {
        return NumberFormat.getNumberInstance(Locale.US).format(j);
    }

    /* renamed from: k */
    public static String m95200k(double d, String str) {
        return m95204o(d) + m95198i(str, true);
    }

    /* renamed from: l */
    public static String m95201l(double d, String str, Boolean bool) {
        return m95204o(d) + m95198i(str, bool.booleanValue());
    }

    /* renamed from: m */
    public static String m95202m(String str, String str2) {
        return str + m95198i(str2, true);
    }

    /* renamed from: n */
    public static String m95203n(BigDecimal bigDecimal, String str) {
        double d;
        if (bigDecimal != null) {
            d = bigDecimal.doubleValue();
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        return m95204o(d) + m95198i(str, true);
    }

    /* renamed from: o */
    public static String m95204o(double d) {
        if (d == Utils.DOUBLE_EPSILON) {
            return "0.00";
        }
        return C32359z0.m95543N((d * 100.0d) + "");
    }

    /* renamed from: p */
    public static String m95205p(BigDecimal bigDecimal) {
        if (bigDecimal.equals(BigDecimal.ZERO)) {
            return "0.00";
        }
        return C32359z0.m95543N(bigDecimal.multiply(new BigDecimal(100)) + "");
    }

    /* renamed from: q */
    public static String m95206q(double d) {
        String o = m95204o(d);
        if (o.contains(".")) {
            return o.split("\\.")[0];
        }
        return o;
    }

    /* renamed from: r */
    public static String m95207r(String str) {
        try {
            return C19455a.f53689a.mo47671a(Double.valueOf(Double.parseDouble(str)), ',');
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: s */
    public static int[] m95208s(Context context, int i) {
        int[] iArr = new int[i];
        System.arraycopy(context.getResources().getIntArray(C10315d.swipe_menu_background_colors), 0, iArr, 0, i);
        return iArr;
    }

    /* renamed from: t */
    public static int[] m95209t(Context context, int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, C0767a.m2893c(context, C10318g.swipe_menu_item_icon_tint_color));
        return iArr;
    }

    /* renamed from: u */
    public static int[] m95210u(Context context, int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, C0767a.m2893c(context, C10318g.swipe_menu_item_text_color));
        return iArr;
    }

    /* renamed from: v */
    public static String m95211v(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 66:
                if (str.equals("B")) {
                    c = 0;
                    break;
                }
                break;
            case 70:
                if (str.equals("F")) {
                    c = 1;
                    break;
                }
                break;
            case 71:
                if (str.equals("G")) {
                    c = 2;
                    break;
                }
                break;
            case 77:
                if (str.equals("M")) {
                    c = 3;
                    break;
                }
                break;
            case 82:
                if (str.equals("R")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C32359z0.m95557a0(C10328q.transfer_title_type_within_georgia);
            case 1:
                return C32359z0.m95557a0(C10328q.transfer_title_type_foreign);
            case 2:
                return C32359z0.m95557a0(C10328q.transfer_title_type_within_georgia);
            case 3:
                return C32359z0.m95557a0(C10328q.transfer_title_type_between_accs);
            case 4:
                return C32359z0.m95557a0(C10328q.transfer_title_type_budget);
            default:
                return null;
        }
    }

    /* renamed from: w */
    public static boolean m95212w(String str, List list) {
        if (str == null || list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m95213x(Activity activity) {
        return C32359z0.m95588q() || C0767a.m2891a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: y */
    private static boolean m95214y(Activity activity, Fragment fragment) {
        if (activity != null) {
            return m95213x(activity);
        }
        if (fragment != null) {
            return m95215z(fragment);
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m95215z(Fragment fragment) {
        if (C32359z0.m95588q() || C0767a.m2891a(fragment.requireActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }
}
