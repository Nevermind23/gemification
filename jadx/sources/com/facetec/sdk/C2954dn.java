package com.facetec.sdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Build;
import androidx.core.content.C0767a;
import com.facetec.sdk.C2952dm;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.facetec.sdk.dn */
public final class C2954dn {

    /* renamed from: a */
    private final NfcAdapter f10005a;

    /* renamed from: b */
    private Exception f10006b = null;

    /* renamed from: c */
    private IsoDep f10007c;

    /* renamed from: d */
    private final WeakReference<Activity> f10008d;

    /* renamed from: e */
    private C2952dm f10009e = null;

    /* renamed from: g */
    private String f10010g;

    /* renamed from: i */
    private String f10011i = "";

    /* renamed from: j */
    private C2957d f10012j;

    /* renamed from: com.facetec.sdk.dn$a */
    public static final class C2955a {

        /* renamed from: d */
        private JSONObject f10013d;

        public C2955a(JSONObject jSONObject) {
            this.f10013d = jSONObject;
        }
    }

    /* renamed from: com.facetec.sdk.dn$b */
    public interface C2956b {
        /* renamed from: a */
        void mo8956a(C2952dm dmVar, String str);

        /* renamed from: b */
        void mo8957b();
    }

    /* renamed from: com.facetec.sdk.dn$d */
    public static class C2957d {

        /* renamed from: b */
        public final String f10014b;

        /* renamed from: c */
        public final String f10015c;

        /* renamed from: d */
        public final String f10016d;
    }

    private C2954dn(NfcAdapter nfcAdapter, Activity activity) {
        this.f10005a = nfcAdapter;
        this.f10008d = new WeakReference<>(activity);
    }

    /* renamed from: e */
    public static C2954dn m12498e(Activity activity) {
        NfcAdapter b = m12492b(activity);
        if (b == null) {
            return null;
        }
        return new C2954dn(b, activity);
    }

    /* renamed from: c */
    public final boolean mo9118c(Class<?> cls, String str) {
        Activity activity = this.f10008d.get();
        if (activity == null) {
            return false;
        }
        this.f10010g = str;
        Intent intent = new Intent(activity, cls);
        intent.addFlags(536870912);
        this.f10005a.enableForegroundDispatch(activity, PendingIntent.getActivity(activity, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728), (IntentFilter[]) null, new String[][]{new String[]{"android.nfc.tech.IsoDep"}});
        return true;
    }

    /* access modifiers changed from: package-private */
    public final native String nativeStartReading(String str, String str2, String str3);

    /* access modifiers changed from: package-private */
    public final native String nativeStartReadingWithKey(String str);

    /* access modifiers changed from: package-private */
    public final native void nativeUpdateErrorHistory(String str, String str2);

    /* access modifiers changed from: package-private */
    public final byte[] sendCommand(byte[] bArr) {
        this.f10006b = null;
        try {
            if (!this.f10007c.isConnected()) {
                this.f10007c.connect();
            }
            return this.f10007c.transceive(bArr);
        } catch (IOException e) {
            this.f10006b = e;
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setNativeError(int i, String str) {
        this.f10011i = str;
        if (i == 1) {
            this.f10009e = C2952dm.Unknown;
        } else if (i == 2) {
            this.f10009e = C2952dm.InvalidMrzKey;
        } else if (i == 3) {
            this.f10009e = C2952dm.ResponseError;
        }
    }

    /* renamed from: a */
    public static boolean m12491a(Activity activity) {
        if (C0767a.m2891a(activity, "android.permission.NFC") == 0 && m12492b(activity) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static NfcAdapter m12492b(Activity activity) {
        NfcManager nfcManager = (NfcManager) activity.getSystemService("nfc");
        if (nfcManager == null) {
            return null;
        }
        return nfcManager.getDefaultAdapter();
    }

    /* renamed from: d */
    public static boolean m12497d(Activity activity) {
        NfcAdapter b;
        if (C0767a.m2891a(activity, "android.permission.NFC") == 0 && (b = m12492b(activity)) != null && b.isEnabled()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12499e(C2956b bVar, C2952dm dmVar) {
        bVar.mo8956a(dmVar, this.f10011i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m12493b(C2956b bVar) {
        C2952dm dmVar;
        String str;
        Activity activity = this.f10008d.get();
        if (activity != null) {
            this.f10006b = null;
            this.f10009e = null;
            this.f10011i = "";
            try {
                String str2 = this.f10010g;
                if (str2 == null || str2.isEmpty()) {
                    C2957d dVar = this.f10012j;
                    str = nativeStartReading(dVar.f10016d, dVar.f10015c, dVar.f10014b);
                } else {
                    str = nativeStartReadingWithKey(this.f10010g);
                }
                if (str != null) {
                    activity.runOnUiThread(new C3199hj(bVar, new C2955a(new JSONObject(str))));
                    return;
                }
                if (this.f10006b != null) {
                    dmVar = C2952dm.ConnectionError;
                } else {
                    dmVar = this.f10009e;
                    if (dmVar == null) {
                        dmVar = C2952dm.Unknown;
                    }
                }
                int i = C2952dm.C29533.f10004a[dmVar.ordinal()];
                nativeUpdateErrorHistory(i != 1 ? i != 2 ? i != 3 ? "Unknown" : "ConnectionError" : "ResponseError" : "InvalidMrzKey", this.f10011i);
                activity.runOnUiThread(new C3221ij(this, bVar, dmVar));
            } catch (Throwable unused) {
                dmVar = C2952dm.Unknown;
            }
        }
    }

    /* renamed from: e */
    public final void mo9119e() {
        Activity activity = this.f10008d.get();
        if (activity != null) {
            this.f10005a.disableForegroundDispatch(activity);
        }
    }

    /* renamed from: c */
    public final boolean mo9117c(Intent intent, C2956b bVar) {
        if (!"android.nfc.action.TECH_DISCOVERED".equals(intent.getAction())) {
            return false;
        }
        this.f10007c = IsoDep.get((Tag) intent.getExtras().getParcelable("android.nfc.extra.TAG"));
        new Thread(new C3730zi(this, bVar)).start();
        return true;
    }
}
