package com.threatmetrix.TrustDefender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.threatmetrix.TrustDefender.C11879b0;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11965r;
import com.threatmetrix.TrustDefender.C11969r1;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Locale;
import p585re.C17593j;

/* renamed from: com.threatmetrix.TrustDefender.m0 */
public abstract class C11934m0 {

    /* renamed from: a */
    private static final String f34974a = C11907h.m43615j(C11934m0.class);

    /* renamed from: a */
    public static void m43790a(Context context) {
        C11969r1.C11975f fVar = new C11969r1.C11975f(context);
        if (C11969r1.C11971b.m43951f() && fVar.mo32041c("android.permission.CHANGE_WIFI_STATE", context.getPackageName())) {
            try {
                WifiManager k = m43800k(context);
                if (k != null) {
                    k.startScan();
                }
            } catch (SecurityException unused) {
                C12014y0.m44142f("android.permission.CHANGE_WIFI_STATE", f34974a);
            } catch (Exception e) {
                C11907h.m43607b(f34974a, e.toString());
            }
        }
    }

    /* renamed from: b */
    private static String m43791b(Context context, String str) {
        C11969r1.C11975f fVar = new C11969r1.C11975f(context);
        if (C11969r1.C11971b.m43948c() && fVar.mo32041c("android.permission.ACCESS_WIFI_STATE", context.getPackageName())) {
            try {
                WifiManager k = m43800k(context);
                if (k == null) {
                    return null;
                }
                List<ScanResult> scanResults = k.getScanResults();
                StringBuilder sb = new StringBuilder(scanResults.size() * 30);
                boolean z = true;
                for (ScanResult next : scanResults) {
                    String d = m43793d(next.BSSID);
                    if (d != null && !d.equals(str)) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(":");
                        }
                        sb.append(d.replace(":", ""));
                        sb.append(";");
                        sb.append(next.level);
                    }
                }
                return sb.toString();
            } catch (SecurityException unused) {
                C12014y0.m44142f("android.permission.ACCESS_WIFI_STATE", f34974a);
            } catch (Exception e) {
                C11907h.m43607b(f34974a, e.toString());
            }
        }
        return null;
    }

    /* renamed from: c */
    private static String m43792c(int i) {
        C11965r.C11966a aVar;
        if (i == -99) {
            return null;
        }
        if (i == 4) {
            aVar = C11965r.C11966a.MOBILE_DUN;
        } else if (i == 7) {
            aVar = C11965r.C11966a.BLUETOOTH;
        } else if (i == 9) {
            aVar = C11965r.C11966a.ETHERNET;
        } else if (i == 0) {
            aVar = C11965r.C11966a.CELLULAR;
        } else if (i == 1) {
            aVar = C11965r.C11966a.WIFI;
        } else if (C11969r1.C11983n.C11984a.f35247c < C11969r1.C11983n.C11985b.f35262n || !C17593j.m61188a(i)) {
            Field[] h = C11879b0.m43536h(C11879b0.m43537i(C11879b0.C11880a.CONNECTIVITY_MANAGER));
            if (h == null) {
                return null;
            }
            for (Field field : h) {
                if (field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers())) {
                    try {
                        if (field.getInt((Object) null) == i) {
                            String name = field.getName();
                            if (C11921k0.m43732o(name) && name.startsWith("TYPE_")) {
                                return m43796g(name);
                            }
                        } else {
                            continue;
                        }
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
            return null;
        } else {
            aVar = C11965r.C11966a.VPN;
        }
        return aVar.mo32038a();
    }

    /* renamed from: d */
    public static String m43793d(String str) {
        if (str == null || str.length() < 17 || "00:00:00:00:00:00".equals(str) || "02:00:00:00:00:00".equals(str)) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    /* renamed from: e */
    public static String[] m43794e(Context context) {
        if (!C11969r1.C11971b.m43949d()) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, intentFilter);
        if (registerReceiver == null) {
            return null;
        }
        String[] strArr = new String[5];
        WifiInfo wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
        if (wifiInfo != null) {
            String d = m43793d(wifiInfo.getBSSID());
            String h = m43797h(wifiInfo.getSSID());
            int rssi = wifiInfo.getRssi();
            if (d != null) {
                strArr[0] = d;
            }
            if (h != null) {
                strArr[1] = h;
            }
            strArr[2] = String.valueOf(rssi);
            strArr[3] = C11965r.C11966a.WIFI.mo32038a();
            return strArr;
        }
        Bundle extras = registerReceiver.getExtras();
        NetworkInfo networkInfo = (NetworkInfo) extras.get("networkInfo");
        if (networkInfo == null) {
            return null;
        }
        if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
            String h2 = m43797h(networkInfo.getExtraInfo());
            String d2 = m43793d((String) extras.get("bssid"));
            if (d2 != null) {
                strArr[0] = d2;
            }
            if (h2 != null) {
                strArr[1] = h2;
            }
            strArr[3] = C11965r.C11966a.WIFI.mo32038a();
        }
        return strArr;
    }

    /* renamed from: f */
    public static String[] m43795f(Context context) {
        String str = null;
        if (!C11969r1.C11971b.m43947b()) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, intentFilter);
        if (registerReceiver == null) {
            return null;
        }
        String[] strArr = new String[5];
        int intExtra = registerReceiver.getIntExtra("networkType", -99);
        Bundle extras = registerReceiver.getExtras();
        if (extras == null) {
            return null;
        }
        NetworkInfo networkInfo = (NetworkInfo) extras.get("networkInfo");
        if (networkInfo != null) {
            if (networkInfo.getState() != NetworkInfo.State.CONNECTED) {
                return null;
            }
            if (intExtra == -99) {
                try {
                    intExtra = networkInfo.getType();
                } catch (SecurityException e) {
                    C12014y0.m44141e(e, f34974a);
                    return null;
                } catch (Exception e2) {
                    C11907h.m43607b(f34974a, e2.toString());
                    return null;
                }
            }
        }
        String c = m43792c(intExtra);
        strArr[3] = c;
        if (c == null) {
            return null;
        }
        if (c.equals(C11965r.C11966a.WIFI.mo32038a())) {
            if (networkInfo != null) {
                str = m43797h(networkInfo.getExtraInfo());
            }
            String d = m43793d((String) extras.get("bssid"));
            if (d != null) {
                strArr[0] = d;
            }
            if (str != null) {
                strArr[1] = str;
            }
        } else if (strArr[3].equals(C11965r.C11966a.VPN.mo32038a())) {
            strArr[4] = "true";
        }
        return strArr;
    }

    /* renamed from: g */
    public static String m43796g(String str) {
        if (C11921k0.m43739v(str)) {
            return null;
        }
        String trim = str.trim();
        if (C11921k0.m43739v(trim)) {
            return null;
        }
        String lowerCase = trim.toLowerCase(Locale.US);
        if (lowerCase.startsWith("type")) {
            lowerCase = lowerCase.replaceFirst("type", "");
        }
        return lowerCase.replace("_", " ").trim();
    }

    /* renamed from: h */
    public static String m43797h(String str) {
        if (str != null && !str.contains("unknown ssid") && str.length() >= 1) {
            if (str.charAt(0) == '\"') {
                str = str.substring(1);
            }
            if (str.length() >= 1 && str.charAt(str.length() - 1) == '\"') {
                str = str.substring(0, str.length() - 1);
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: i */
    public static C11965r m43798i(Context context) {
        int dataState;
        C11965r rVar = new C11965r();
        boolean z = false;
        if (!rVar.mo32033k(C11996u0.m44036s().mo32091y()) && !rVar.mo32033k(m43799j(context))) {
            if (!rVar.mo32033k(m43794e(context))) {
                rVar.mo32033k(m43795f(context));
                z = true;
            }
            if (rVar.mo32028f() == null && C11969r1.C11970a.m43941g()) {
                try {
                    Object systemService = context.getSystemService("phone");
                    if ((systemService instanceof TelephonyManager) && ((dataState = ((TelephonyManager) systemService).getDataState()) == 2 || dataState == 1 || dataState == 3)) {
                        rVar.mo32029g(C11965r.C11966a.CELLULAR.mo32038a());
                    }
                } catch (SecurityException unused) {
                    C12014y0.m44142f("phone", f34974a);
                } catch (Exception e) {
                    C11907h.m43607b(f34974a, e.toString());
                } catch (Throwable th) {
                    rVar.mo32025b();
                    throw th;
                }
                rVar.mo32025b();
            }
        }
        if (rVar.mo32032j() == null && C11914j.m43657H(context)) {
            rVar.mo32026c("true");
        }
        if (!z && rVar.mo32032j() == null) {
            rVar.mo32033k(m43795f(context));
        }
        rVar.mo32036o(m43791b(context, rVar.mo32031i()));
        C11907h.C11908a.m43624b(f34974a, "Network Info (Final values) BSSID: " + rVar.mo32031i() + " SSID: " + rVar.mo32035n() + " RSSI: " + rVar.mo32034l() + " Type: " + rVar.mo32028f());
        return rVar;
    }

    /* renamed from: j */
    public static String[] m43799j(Context context) {
        String h;
        if (C11969r1.C11971b.m43946a() && new C11969r1.C11975f(context).mo32041c("android.permission.ACCESS_WIFI_STATE", context.getPackageName())) {
            try {
                WifiManager k = m43800k(context);
                if (k == null) {
                    return null;
                }
                WifiInfo connectionInfo = k.getConnectionInfo();
                String d = m43793d(connectionInfo.getBSSID());
                if (d == null || (h = m43797h(connectionInfo.getSSID())) == null) {
                    return null;
                }
                int rssi = connectionInfo.getRssi();
                String[] strArr = new String[5];
                strArr[0] = d;
                strArr[1] = h;
                strArr[2] = String.valueOf(rssi);
                strArr[3] = C11965r.C11966a.WIFI.mo32038a();
                return strArr;
            } catch (SecurityException unused) {
                C12014y0.m44142f("android.permission.ACCESS_WIFI_STATE", f34974a);
            } catch (Exception e) {
                C11907h.m43607b(f34974a, e.toString());
            }
        }
        return null;
    }

    /* renamed from: k */
    private static WifiManager m43800k(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        if (!(systemService instanceof WifiManager)) {
            return null;
        }
        return (WifiManager) systemService;
    }
}
