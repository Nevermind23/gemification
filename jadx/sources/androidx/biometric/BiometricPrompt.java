package androidx.biometric;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1646z;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class BiometricPrompt {

    /* renamed from: a */
    private C1505h f2327a;

    /* renamed from: b */
    private Fragment f2328b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f2329c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0534b f2330d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C0580y f2331e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C0586z f2332f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0565s f2333g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f2334h;

    /* renamed from: i */
    private boolean f2335i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final DialogInterface.OnClickListener f2336j = new C0532a();

    /* renamed from: k */
    private final C1616p f2337k;

    /* renamed from: androidx.biometric.BiometricPrompt$a */
    class C0532a implements DialogInterface.OnClickListener {

        /* renamed from: androidx.biometric.BiometricPrompt$a$a */
        class C0533a implements Runnable {
            C0533a() {
            }

            public void run() {
                CharSequence charSequence = "";
                if (BiometricPrompt.m2134v() && BiometricPrompt.this.f2333g != null) {
                    CharSequence o1 = BiometricPrompt.this.f2333g.mo2434o1();
                    C0534b h = BiometricPrompt.this.f2330d;
                    if (o1 != null) {
                        charSequence = o1;
                    }
                    h.mo2416a(13, charSequence);
                    BiometricPrompt.this.f2333g.mo2433n1();
                } else if (BiometricPrompt.this.f2331e == null || BiometricPrompt.this.f2332f == null) {
                    Log.e("BiometricPromptCompat", "Negative button callback not run. Fragment was null.");
                } else {
                    CharSequence O1 = BiometricPrompt.this.f2331e.mo2471O1();
                    C0534b h2 = BiometricPrompt.this.f2330d;
                    if (O1 != null) {
                        charSequence = O1;
                    }
                    h2.mo2416a(13, charSequence);
                    BiometricPrompt.this.f2332f.mo2483n1(2);
                }
            }
        }

        C0532a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            BiometricPrompt.this.f2329c.execute(new C0533a());
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$b */
    public static abstract class C0534b {
        /* renamed from: a */
        public abstract void mo2416a(int i, CharSequence charSequence);

        /* renamed from: b */
        public abstract void mo2417b();

        /* renamed from: c */
        public abstract void mo2418c(C0535c cVar);
    }

    /* renamed from: androidx.biometric.BiometricPrompt$c */
    public static class C0535c {

        /* renamed from: a */
        private final C0536d f2341a;

        C0535c(C0536d dVar) {
            this.f2341a = dVar;
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$e */
    public static class C0537e {

        /* renamed from: a */
        private Bundle f2345a;

        /* renamed from: androidx.biometric.BiometricPrompt$e$a */
        public static class C0538a {

            /* renamed from: a */
            private final Bundle f2346a = new Bundle();

            /* renamed from: a */
            public C0537e mo2425a() {
                CharSequence charSequence = this.f2346a.getCharSequence("title");
                CharSequence charSequence2 = this.f2346a.getCharSequence("negative_text");
                boolean z = this.f2346a.getBoolean("allow_device_credential");
                boolean z2 = this.f2346a.getBoolean("handling_device_credential_result");
                if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("Title must be set and non-empty");
                } else if (TextUtils.isEmpty(charSequence2) && !z) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty");
                } else if (!TextUtils.isEmpty(charSequence2) && z) {
                    throw new IllegalArgumentException("Can't have both negative button behavior and device credential enabled");
                } else if (!z2 || z) {
                    return new C0537e(this.f2346a);
                } else {
                    throw new IllegalArgumentException("Can't be handling device credential result without device credential enabled");
                }
            }

            /* renamed from: b */
            public C0538a mo2426b(boolean z) {
                this.f2346a.putBoolean("require_confirmation", z);
                return this;
            }

            /* renamed from: c */
            public C0538a mo2427c(CharSequence charSequence) {
                this.f2346a.putCharSequence("negative_text", charSequence);
                return this;
            }

            /* renamed from: d */
            public C0538a mo2428d(CharSequence charSequence) {
                this.f2346a.putCharSequence(NotificationMessage.NOTIF_KEY_SUB_TITLE, charSequence);
                return this;
            }

            /* renamed from: e */
            public C0538a mo2429e(CharSequence charSequence) {
                this.f2346a.putCharSequence("title", charSequence);
                return this;
            }
        }

        C0537e(Bundle bundle) {
            this.f2345a = bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Bundle mo2422a() {
            return this.f2345a;
        }

        /* renamed from: b */
        public boolean mo2423b() {
            return this.f2345a.getBoolean("allow_device_credential");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo2424c() {
            return this.f2345a.getBoolean("handling_device_credential_result");
        }
    }

    public BiometricPrompt(C1505h hVar, Executor executor, C0534b bVar) {
        C05312 r0 = new C1616p() {
            /* access modifiers changed from: package-private */
            @C1646z(C1593j.C1594a.ON_PAUSE)
            public void onPause() {
                if (!BiometricPrompt.this.m2138z()) {
                    if (!BiometricPrompt.m2134v() || BiometricPrompt.this.f2333g == null) {
                        if (!(BiometricPrompt.this.f2331e == null || BiometricPrompt.this.f2332f == null)) {
                            BiometricPrompt.m2135w(BiometricPrompt.this.f2331e, BiometricPrompt.this.f2332f);
                        }
                    } else if (!BiometricPrompt.this.f2333g.mo2438p1()) {
                        BiometricPrompt.this.f2333g.mo2432m1();
                    } else if (!BiometricPrompt.this.f2334h) {
                        boolean unused = BiometricPrompt.this.f2334h = true;
                    } else {
                        BiometricPrompt.this.f2333g.mo2432m1();
                    }
                    BiometricPrompt.this.m2114D();
                }
            }

            /* access modifiers changed from: package-private */
            @C1646z(C1593j.C1594a.ON_RESUME)
            public void onResume() {
                C0565s sVar;
                BiometricPrompt biometricPrompt = BiometricPrompt.this;
                if (BiometricPrompt.m2134v()) {
                    sVar = (C0565s) BiometricPrompt.this.m2137y().mo4418k0("BiometricFragment");
                } else {
                    sVar = null;
                }
                C0565s unused = biometricPrompt.f2333g = sVar;
                if (!BiometricPrompt.m2134v() || BiometricPrompt.this.f2333g == null) {
                    BiometricPrompt biometricPrompt2 = BiometricPrompt.this;
                    C0580y unused2 = biometricPrompt2.f2331e = (C0580y) biometricPrompt2.m2137y().mo4418k0("FingerprintDialogFragment");
                    BiometricPrompt biometricPrompt3 = BiometricPrompt.this;
                    C0586z unused3 = biometricPrompt3.f2332f = (C0586z) biometricPrompt3.m2137y().mo4418k0("FingerprintHelperFragment");
                    if (BiometricPrompt.this.f2331e != null) {
                        BiometricPrompt.this.f2331e.mo2473X1(BiometricPrompt.this.f2336j);
                    }
                    if (BiometricPrompt.this.f2332f != null) {
                        BiometricPrompt.this.f2332f.mo2484t1(BiometricPrompt.this.f2329c, BiometricPrompt.this.f2330d);
                        if (BiometricPrompt.this.f2331e != null) {
                            BiometricPrompt.this.f2332f.mo2486v1(BiometricPrompt.this.f2331e.mo2470M1());
                        }
                    }
                } else {
                    BiometricPrompt.this.f2333g.mo2440s1(BiometricPrompt.this.f2329c, BiometricPrompt.this.f2336j, BiometricPrompt.this.f2330d);
                }
                BiometricPrompt.this.m2112B();
                BiometricPrompt.this.m2113C(false);
            }
        };
        this.f2337k = r0;
        if (hVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null");
        } else if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null");
        } else if (bVar != null) {
            this.f2327a = hVar;
            this.f2330d = bVar;
            this.f2329c = executor;
            hVar.getLifecycle().mo4906a(r0);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null");
        }
    }

    /* renamed from: A */
    private void m2111A(C0537e eVar) {
        C1505h x = m2136x();
        if (x == null || x.isFinishing()) {
            Log.w("BiometricPromptCompat", "Failed to start handler activity. Parent activity was null or finishing.");
            return;
        }
        m2113C(true);
        Bundle a = eVar.mo2422a();
        a.putBoolean("handling_device_credential_result", true);
        Intent intent = new Intent(x, DeviceCredentialHandlerActivity.class);
        intent.putExtra("prompt_info_bundle", a);
        x.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m2112B() {
        C0579x f;
        String str;
        if (!this.f2335i && (f = C0579x.m2205f()) != null) {
            int c = f.mo2456c();
            if (c == 1) {
                this.f2330d.mo2418c(new C0535c((C0536d) null));
                f.mo2468q();
                f.mo2460i();
            } else if (c == 2) {
                if (m2136x() != null) {
                    str = m2136x().getString(C0550f0.generic_error_user_canceled);
                } else {
                    str = "";
                }
                this.f2330d.mo2416a(10, str);
                f.mo2468q();
                f.mo2460i();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m2113C(boolean z) {
        C0586z zVar;
        C0565s sVar;
        if (Build.VERSION.SDK_INT < 29) {
            C0579x e = C0579x.m2204e();
            if (!this.f2335i) {
                C1505h x = m2136x();
                if (x != null) {
                    try {
                        e.mo2463l(x.getPackageManager().getActivityInfo(x.getComponentName(), 0).getThemeResource());
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("BiometricPromptCompat", "Failed to register client theme to bridge", e2);
                    }
                }
            } else if (!m2134v() || (sVar = this.f2333g) == null) {
                C0580y yVar = this.f2331e;
                if (!(yVar == null || (zVar = this.f2332f) == null)) {
                    e.mo2466o(yVar, zVar);
                }
            } else {
                e.mo2461j(sVar);
            }
            e.mo2462k(this.f2329c, this.f2336j, this.f2330d);
            if (z) {
                e.mo2467p();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m2114D() {
        C0579x f = C0579x.m2205f();
        if (f != null) {
            f.mo2460i();
        }
    }

    /* renamed from: u */
    private void m2133u(C0537e eVar, C0536d dVar) {
        this.f2335i = eVar.mo2424c();
        C1505h x = m2136x();
        if (eVar.mo2423b() && Build.VERSION.SDK_INT <= 28) {
            if (!this.f2335i) {
                m2111A(eVar);
                return;
            } else if (x == null) {
                Log.e("BiometricPromptCompat", "Failed to authenticate with device credential. Activity was null.");
                return;
            } else {
                C0579x f = C0579x.m2205f();
                if (f == null) {
                    Log.e("BiometricPromptCompat", "Failed to authenticate with device credential. Bridge was null.");
                    return;
                } else if (!f.mo2459h() && C0577w.m2200b(x).mo2453a() != 0) {
                    C0554h0.m2168e("BiometricPromptCompat", x, eVar.mo2422a(), (Runnable) null);
                    return;
                }
            }
        }
        FragmentManager y = m2137y();
        if (y.mo4394T0()) {
            Log.w("BiometricPromptCompat", "Not launching prompt. authenticate() called after onSaveInstanceState()");
            return;
        }
        Bundle a = eVar.mo2422a();
        boolean z = false;
        this.f2334h = false;
        if (!(x == null || dVar == null || !C0554h0.m2171h(x, Build.MANUFACTURER, Build.MODEL))) {
            z = true;
        }
        if (z || !m2134v()) {
            C0580y yVar = (C0580y) y.mo4418k0("FingerprintDialogFragment");
            if (yVar != null) {
                this.f2331e = yVar;
            } else {
                this.f2331e = C0580y.m2238V1();
            }
            this.f2331e.mo2473X1(this.f2336j);
            this.f2331e.mo2472W1(a);
            if (x != null && !C0554h0.m2170g(x, Build.MODEL)) {
                if (yVar == null) {
                    this.f2331e.mo4576A1(y, "FingerprintDialogFragment");
                } else if (this.f2331e.isDetached()) {
                    y.mo4428p().mo4637h(this.f2331e).mo4516j();
                }
            }
            C0586z zVar = (C0586z) y.mo4418k0("FingerprintHelperFragment");
            if (zVar != null) {
                this.f2332f = zVar;
            } else {
                this.f2332f = C0586z.m2256r1();
            }
            this.f2332f.mo2484t1(this.f2329c, this.f2330d);
            Handler M1 = this.f2331e.mo2470M1();
            this.f2332f.mo2486v1(M1);
            this.f2332f.mo2485u1(dVar);
            M1.sendMessageDelayed(M1.obtainMessage(6), 500);
            if (zVar == null) {
                y.mo4428p().mo4634e(this.f2332f, "FingerprintHelperFragment").mo4516j();
            } else if (this.f2332f.isDetached()) {
                y.mo4428p().mo4637h(this.f2332f).mo4516j();
            }
        } else {
            C0565s sVar = (C0565s) y.mo4418k0("BiometricFragment");
            if (sVar != null) {
                this.f2333g = sVar;
            } else {
                this.f2333g = C0565s.m2187q1();
            }
            this.f2333g.mo2440s1(this.f2329c, this.f2336j, this.f2330d);
            this.f2333g.mo2441t1(dVar);
            this.f2333g.mo2439r1(a);
            if (sVar == null) {
                y.mo4428p().mo4634e(this.f2333g, "BiometricFragment").mo4516j();
            } else if (this.f2333g.isDetached()) {
                y.mo4428p().mo4637h(this.f2333g).mo4516j();
            }
        }
        y.mo4408g0();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static boolean m2134v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static void m2135w(C0580y yVar, C0586z zVar) {
        yVar.mo2469K1();
        zVar.mo2483n1(0);
    }

    /* renamed from: x */
    private C1505h m2136x() {
        C1505h hVar = this.f2327a;
        return hVar != null ? hVar : this.f2328b.getActivity();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public FragmentManager m2137y() {
        C1505h hVar = this.f2327a;
        if (hVar != null) {
            return hVar.getSupportFragmentManager();
        }
        return this.f2328b.getChildFragmentManager();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public boolean m2138z() {
        return m2136x() != null && m2136x().isChangingConfigurations();
    }

    /* renamed from: s */
    public void mo2410s(C0537e eVar) {
        if (eVar != null) {
            m2133u(eVar, (C0536d) null);
            return;
        }
        throw new IllegalArgumentException("PromptInfo can not be null");
    }

    /* renamed from: t */
    public void mo2411t(C0537e eVar, C0536d dVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("PromptInfo can not be null");
        } else if (dVar == null) {
            throw new IllegalArgumentException("CryptoObject can not be null");
        } else if (!eVar.mo2422a().getBoolean("allow_device_credential")) {
            m2133u(eVar, dVar);
        } else {
            throw new IllegalArgumentException("Device credential not supported with crypto");
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$d */
    public static class C0536d {

        /* renamed from: a */
        private final Signature f2342a;

        /* renamed from: b */
        private final Cipher f2343b;

        /* renamed from: c */
        private final Mac f2344c;

        public C0536d(Signature signature) {
            this.f2342a = signature;
            this.f2343b = null;
            this.f2344c = null;
        }

        /* renamed from: a */
        public Cipher mo2419a() {
            return this.f2343b;
        }

        /* renamed from: b */
        public Mac mo2420b() {
            return this.f2344c;
        }

        /* renamed from: c */
        public Signature mo2421c() {
            return this.f2342a;
        }

        public C0536d(Cipher cipher) {
            this.f2343b = cipher;
            this.f2342a = null;
            this.f2344c = null;
        }

        public C0536d(Mac mac) {
            this.f2344c = mac;
            this.f2343b = null;
            this.f2342a = null;
        }
    }

    public BiometricPrompt(Fragment fragment, Executor executor, C0534b bVar) {
        C05312 r0 = new C1616p() {
            /* access modifiers changed from: package-private */
            @C1646z(C1593j.C1594a.ON_PAUSE)
            public void onPause() {
                if (!BiometricPrompt.this.m2138z()) {
                    if (!BiometricPrompt.m2134v() || BiometricPrompt.this.f2333g == null) {
                        if (!(BiometricPrompt.this.f2331e == null || BiometricPrompt.this.f2332f == null)) {
                            BiometricPrompt.m2135w(BiometricPrompt.this.f2331e, BiometricPrompt.this.f2332f);
                        }
                    } else if (!BiometricPrompt.this.f2333g.mo2438p1()) {
                        BiometricPrompt.this.f2333g.mo2432m1();
                    } else if (!BiometricPrompt.this.f2334h) {
                        boolean unused = BiometricPrompt.this.f2334h = true;
                    } else {
                        BiometricPrompt.this.f2333g.mo2432m1();
                    }
                    BiometricPrompt.this.m2114D();
                }
            }

            /* access modifiers changed from: package-private */
            @C1646z(C1593j.C1594a.ON_RESUME)
            public void onResume() {
                C0565s sVar;
                BiometricPrompt biometricPrompt = BiometricPrompt.this;
                if (BiometricPrompt.m2134v()) {
                    sVar = (C0565s) BiometricPrompt.this.m2137y().mo4418k0("BiometricFragment");
                } else {
                    sVar = null;
                }
                C0565s unused = biometricPrompt.f2333g = sVar;
                if (!BiometricPrompt.m2134v() || BiometricPrompt.this.f2333g == null) {
                    BiometricPrompt biometricPrompt2 = BiometricPrompt.this;
                    C0580y unused2 = biometricPrompt2.f2331e = (C0580y) biometricPrompt2.m2137y().mo4418k0("FingerprintDialogFragment");
                    BiometricPrompt biometricPrompt3 = BiometricPrompt.this;
                    C0586z unused3 = biometricPrompt3.f2332f = (C0586z) biometricPrompt3.m2137y().mo4418k0("FingerprintHelperFragment");
                    if (BiometricPrompt.this.f2331e != null) {
                        BiometricPrompt.this.f2331e.mo2473X1(BiometricPrompt.this.f2336j);
                    }
                    if (BiometricPrompt.this.f2332f != null) {
                        BiometricPrompt.this.f2332f.mo2484t1(BiometricPrompt.this.f2329c, BiometricPrompt.this.f2330d);
                        if (BiometricPrompt.this.f2331e != null) {
                            BiometricPrompt.this.f2332f.mo2486v1(BiometricPrompt.this.f2331e.mo2470M1());
                        }
                    }
                } else {
                    BiometricPrompt.this.f2333g.mo2440s1(BiometricPrompt.this.f2329c, BiometricPrompt.this.f2336j, BiometricPrompt.this.f2330d);
                }
                BiometricPrompt.this.m2112B();
                BiometricPrompt.this.m2113C(false);
            }
        };
        this.f2337k = r0;
        if (fragment == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null");
        } else if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null");
        } else if (bVar != null) {
            this.f2328b = fragment;
            this.f2330d = bVar;
            this.f2329c = executor;
            fragment.getLifecycle().mo4906a(r0);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null");
        }
    }
}
