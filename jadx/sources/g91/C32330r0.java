package g91;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.C0218d;
import androidx.core.app.ActivityCompat;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: g91.r0 */
public class C32330r0 {

    /* renamed from: a */
    private final Activity f79764a;

    /* renamed from: b */
    private final Fragment f79765b;

    /* renamed from: g91.r0$a */
    public interface C32331a {
        /* renamed from: a */
        void mo70886a(boolean z);
    }

    public C32330r0(Activity activity) {
        this(activity, (Fragment) null);
    }

    /* renamed from: A */
    private boolean m95325A(String str, String str2, String str3, String str4, int i, boolean z) {
        if (m95338m(m95336i(), str)) {
            return false;
        }
        if (!PreferencesApiManager.getInstance().isPermissionForeverDenied(str)) {
            m95327C(str2, str3, new C32318l0(this, str, i), z);
            return true;
        } else if (str4 == null) {
            return true;
        } else {
            m95327C(str4, str3, new C32320m0(this), z);
            return true;
        }
    }

    /* renamed from: B */
    private void m95326B(String[] strArr, int i) {
        Activity activity = this.f79764a;
        if (activity != null) {
            ActivityCompat.m2589u(activity, strArr, i);
            return;
        }
        Fragment fragment = this.f79765b;
        if (fragment != null) {
            fragment.requestPermissions(strArr, i);
        }
    }

    /* renamed from: C */
    private void m95327C(String str, String str2, C32331a aVar, boolean z) {
        C1483c g = m95334g(str, str2, aVar, z);
        FragmentManager j = m95337j();
        if (j != null) {
            g.mo4576A1(j, "PERMISSION_DIALOG");
            g.mo4586v1(z);
        }
    }

    /* renamed from: g */
    private C1483c m95334g(String str, String str2, C32331a aVar, boolean z) {
        return m95335h(str, str2, (String) null, (String) null, aVar, z);
    }

    /* renamed from: h */
    private C1483c m95335h(String str, String str2, String str3, String str4, C32331a aVar, boolean z) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        Context i = m95336i();
        if (i == null) {
            return null;
        }
        if (str2 == null) {
            str2 = i.getString(C10328q.permissions_request);
        }
        dVar.mo35648c2(str2);
        dVar.mo35639Q1(str);
        C32322n0 n0Var = new C32322n0(dVar, aVar);
        if (str3 == null) {
            str3 = i.getString(C10328q.dialog_btn_agree);
        }
        dVar.mo35646Z1(str3);
        dVar.mo35645Y1(n0Var);
        if (str4 == null) {
            str4 = i.getString(C10328q.button_text_close);
        }
        dVar.mo35642U1(str4);
        dVar.mo35641T1(new C32324o0(dVar, aVar));
        dVar.mo4586v1(z);
        return dVar;
    }

    /* renamed from: i */
    private Context m95336i() {
        Activity activity = this.f79764a;
        if (activity != null) {
            return activity;
        }
        Fragment fragment = this.f79765b;
        if (fragment != null) {
            return fragment.requireContext();
        }
        return null;
    }

    /* renamed from: j */
    private FragmentManager m95337j() {
        Activity activity = this.f79764a;
        if (activity != null && (activity instanceof C0218d)) {
            return ((C0218d) activity).getSupportFragmentManager();
        }
        Fragment fragment = this.f79765b;
        if (fragment != null) {
            return fragment.getChildFragmentManager();
        }
        return null;
    }

    /* renamed from: m */
    public static boolean m95338m(Context context, String str) {
        try {
            return C0767a.m2891a(context, str) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m95339n(C13310d dVar, C32331a aVar, Button button) {
        dVar.mo4577k1();
        if (aVar != null) {
            aVar.mo70886a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m95340o(C13310d dVar, C32331a aVar, Button button) {
        dVar.mo4577k1();
        if (aVar != null) {
            aVar.mo70886a(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m95341p(C32331a aVar, boolean z) {
        if (!z) {
            PreferencesApiManager.getInstance().setGeofenceEnabled(true);
            m95326B(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 910);
        }
        if (aVar != null) {
            aVar.mo70886a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m95342q(C32331a aVar, boolean z) {
        if (!z) {
            m95326B(new String[]{"android.permission.POST_NOTIFICATIONS"}, 911);
        }
        if (aVar != null) {
            aVar.mo70886a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m95343r(String str, int i, boolean z) {
        if (!z) {
            m95326B(new String[]{str}, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m95344s(boolean z) {
        if (!z) {
            m95345t();
        }
    }

    /* renamed from: t */
    private void m95345t() {
        Context i = m95336i();
        if (i != null) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").addFlags(268435456).addFlags(1073741824).setData(Uri.fromParts("package", i.getPackageName(), (String) null));
            if (data.resolveActivity(i.getPackageManager()) != null) {
                i.startActivity(data);
            }
        }
    }

    /* renamed from: k */
    public C1483c mo72832k(C32331a aVar) {
        Context i = m95336i();
        if (i != null && !m95338m(m95336i(), "android.permission.ACCESS_FINE_LOCATION") && !PreferencesApiManager.getInstance().isPermissionForeverDenied("android.permission.ACCESS_FINE_LOCATION")) {
            return m95334g(i.getString(C10328q.location_for_pushs_permission_desc), i.getString(C10328q.location_for_pushs_permission_header), new C32326p0(this, aVar), false);
        }
        return null;
    }

    /* renamed from: l */
    public C1483c mo72833l(C32331a aVar) {
        Context i = m95336i();
        if (i == null || m95338m(m95336i(), "android.permission.POST_NOTIFICATIONS") || PreferencesApiManager.getInstance().isPermissionForeverDenied("android.permission.POST_NOTIFICATIONS")) {
            return null;
        }
        return m95335h(C27950a.m86284a("dialog.notification.permission.description"), C27950a.m86284a("dialog.notification.permission.title"), C32343x.m95420V("dialog.notification.permission.agree", i.getString(C10328q.dialog_btn_agree), new Object[0]), C32343x.m95420V("dialog.notification.permission.close", i.getString(C10328q.button_text_close), new Object[0]), new C32328q0(this, aVar), false);
    }

    /* renamed from: u */
    public void mo72834u() {
        if (!m95338m(m95336i(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            m95326B(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 909);
        }
    }

    /* renamed from: v */
    public boolean mo72835v(int i) {
        Context i2 = m95336i();
        if (i2 == null) {
            return false;
        }
        return mo72836w(i, i2.getString(C10328q.camera_permission_desc));
    }

    /* renamed from: w */
    public boolean mo72836w(int i, String str) {
        Context i2 = m95336i();
        if (i2 == null) {
            return false;
        }
        return m95325A("android.permission.CAMERA", str, (String) null, i2.getString(C10328q.camera_permissions_denied), i, false);
    }

    /* renamed from: x */
    public boolean mo72837x(int i, String str) {
        Context i2 = m95336i();
        if (i2 == null) {
            return false;
        }
        return m95325A("android.permission.READ_CONTACTS", str, i2.getString(C10328q.permission_request), (String) null, i, false);
    }

    /* renamed from: y */
    public boolean mo72838y(int i) {
        Context i2 = m95336i();
        if (i2 == null) {
            return false;
        }
        return m95325A("android.permission.WRITE_EXTERNAL_STORAGE", i2.getString(C10328q.storage_permission_for_download_desc), (String) null, i2.getString(C10328q.storage_permissions_denied), i, true);
    }

    /* renamed from: z */
    public boolean mo72839z(int i) {
        Context i2 = m95336i();
        if (i2 == null) {
            return false;
        }
        return m95325A("android.permission.ACCESS_FINE_LOCATION", i2.getString(C10328q.location_for_pushs_permission_desc), i2.getString(C10328q.location_for_pushs_permission_header), (String) null, i, false);
    }

    public C32330r0(Fragment fragment) {
        this((Activity) null, fragment);
    }

    private C32330r0(Activity activity, Fragment fragment) {
        this.f79764a = activity;
        this.f79765b = fragment;
    }
}
