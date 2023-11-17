package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.concurrent.Executor;

@SuppressLint({"SyntheticAccessor"})
/* renamed from: androidx.biometric.s */
public class C0565s extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f2348d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Bundle f2349e;

    /* renamed from: f */
    Executor f2350f;

    /* renamed from: g */
    DialogInterface.OnClickListener f2351g;

    /* renamed from: h */
    BiometricPrompt.C0534b f2352h;

    /* renamed from: i */
    private BiometricPrompt.C0536d f2353i;

    /* renamed from: j */
    private CharSequence f2354j;

    /* renamed from: k */
    private boolean f2355k;

    /* renamed from: l */
    private android.hardware.biometrics.BiometricPrompt f2356l;

    /* renamed from: m */
    private CancellationSignal f2357m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f2358n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Handler f2359o = new Handler(Looper.getMainLooper());

    /* renamed from: p */
    private final Executor f2360p = new C0566a();

    /* renamed from: q */
    final BiometricPrompt.AuthenticationCallback f2361q = new C0567b();

    /* renamed from: r */
    private final DialogInterface.OnClickListener f2362r = new C0571c();

    /* renamed from: s */
    private final DialogInterface.OnClickListener f2363s = new C0572d();

    /* renamed from: androidx.biometric.s$a */
    class C0566a implements Executor {
        C0566a() {
        }

        public void execute(Runnable runnable) {
            C0565s.this.f2359o.post(runnable);
        }
    }

    /* renamed from: androidx.biometric.s$b */
    class C0567b extends BiometricPrompt.AuthenticationCallback {

        /* renamed from: androidx.biometric.s$b$a */
        class C0568a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ CharSequence f2366d;

            /* renamed from: e */
            final /* synthetic */ int f2367e;

            C0568a(CharSequence charSequence, int i) {
                this.f2366d = charSequence;
                this.f2367e = i;
            }

            public void run() {
                int i;
                CharSequence charSequence = this.f2366d;
                if (charSequence == null) {
                    charSequence = C0565s.this.f2348d.getString(C0550f0.default_error_msg) + " " + this.f2367e;
                }
                BiometricPrompt.C0534b bVar = C0565s.this.f2352h;
                if (C0554h0.m2166c(this.f2367e)) {
                    i = 8;
                } else {
                    i = this.f2367e;
                }
                bVar.mo2416a(i, charSequence);
            }
        }

        /* renamed from: androidx.biometric.s$b$b */
        class C0569b implements Runnable {

            /* renamed from: d */
            final /* synthetic */ BiometricPrompt.C0535c f2369d;

            C0569b(BiometricPrompt.C0535c cVar) {
                this.f2369d = cVar;
            }

            public void run() {
                C0565s.this.f2352h.mo2418c(this.f2369d);
            }
        }

        /* renamed from: androidx.biometric.s$b$c */
        class C0570c implements Runnable {
            C0570c() {
            }

            public void run() {
                C0565s.this.f2352h.mo2417b();
            }
        }

        C0567b() {
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            if (!C0554h0.m2164a()) {
                C0565s.this.f2350f.execute(new C0568a(charSequence, i));
                C0565s.this.mo2433n1();
            }
        }

        public void onAuthenticationFailed() {
            C0565s.this.f2350f.execute(new C0570c());
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
            BiometricPrompt.C0535c cVar;
            if (authenticationResult != null) {
                cVar = new BiometricPrompt.C0535c(C0565s.m2188u1(authenticationResult.getCryptoObject()));
            } else {
                cVar = new BiometricPrompt.C0535c((BiometricPrompt.C0536d) null);
            }
            C0565s.this.f2350f.execute(new C0569b(cVar));
            C0565s.this.mo2433n1();
        }
    }

    /* renamed from: androidx.biometric.s$c */
    class C0571c implements DialogInterface.OnClickListener {
        C0571c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0565s.this.f2351g.onClick(dialogInterface, i);
        }
    }

    /* renamed from: androidx.biometric.s$d */
    class C0572d implements DialogInterface.OnClickListener {
        C0572d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                C0554h0.m2168e("BiometricFragment", C0565s.this.getActivity(), C0565s.this.f2349e, (Runnable) null);
            }
        }
    }

    /* renamed from: androidx.biometric.s$e */
    class C0573e implements Runnable {
        C0573e() {
        }

        public void run() {
            boolean unused = C0565s.this.f2358n = true;
        }
    }

    /* renamed from: q1 */
    static C0565s m2187q1() {
        return new C0565s();
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static BiometricPrompt.C0536d m2188u1(BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new BiometricPrompt.C0536d(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new BiometricPrompt.C0536d(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new BiometricPrompt.C0536d(cryptoObject.getMac());
        }
        return null;
    }

    /* renamed from: v1 */
    private static BiometricPrompt.CryptoObject m2189v1(BiometricPrompt.C0536d dVar) {
        if (dVar == null) {
            return null;
        }
        if (dVar.mo2419a() != null) {
            C0551g.m2162a();
            return C0545d.m2159a(dVar.mo2419a());
        } else if (dVar.mo2421c() != null) {
            C0551g.m2162a();
            return C0547e.m2160a(dVar.mo2421c());
        } else if (dVar.mo2420b() == null) {
            return null;
        } else {
            C0551g.m2162a();
            return C0549f.m2161a(dVar.mo2420b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void mo2432m1() {
        if (Build.VERSION.SDK_INT < 29 || !mo2438p1() || this.f2358n) {
            CancellationSignal cancellationSignal = this.f2357m;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            mo2433n1();
            return;
        }
        Log.w("BiometricFragment", "Ignoring fast cancel signal");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void mo2433n1() {
        this.f2355k = false;
        C1505h activity = getActivity();
        if (getFragmentManager() != null) {
            getFragmentManager().mo4428p().mo4519m(this).mo4516j();
        }
        C0554h0.m2169f(activity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public CharSequence mo2434o1() {
        return this.f2354j;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f2348d = context;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        if (!this.f2355k && (bundle2 = this.f2349e) != null) {
            this.f2354j = bundle2.getCharSequence("negative_text");
            C0555i.m2172a();
            BiometricPrompt.Builder a = C0553h.m2163a(getContext());
            BiometricPrompt.Builder unused = a.setTitle(this.f2349e.getCharSequence("title")).setSubtitle(this.f2349e.getCharSequence(NotificationMessage.NOTIF_KEY_SUB_TITLE)).setDescription(this.f2349e.getCharSequence("description"));
            boolean z = this.f2349e.getBoolean("allow_device_credential");
            if (z && Build.VERSION.SDK_INT <= 28) {
                String string = getString(C0550f0.confirm_device_credential_password);
                this.f2354j = string;
                BiometricPrompt.Builder unused2 = a.setNegativeButton(string, this.f2350f, this.f2363s);
            } else if (!TextUtils.isEmpty(this.f2354j)) {
                BiometricPrompt.Builder unused3 = a.setNegativeButton(this.f2354j, this.f2350f, this.f2362r);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                BiometricPrompt.Builder unused4 = a.setConfirmationRequired(this.f2349e.getBoolean("require_confirmation", true));
                BiometricPrompt.Builder unused5 = a.setDeviceCredentialAllowed(z);
            }
            if (z) {
                this.f2358n = false;
                this.f2359o.postDelayed(new C0573e(), 250);
            }
            this.f2356l = a.build();
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.f2357m = cancellationSignal;
            BiometricPrompt.C0536d dVar = this.f2353i;
            if (dVar == null) {
                this.f2356l.authenticate(cancellationSignal, this.f2360p, this.f2361q);
            } else {
                this.f2356l.authenticate(m2189v1(dVar), this.f2357m, this.f2360p, this.f2361q);
            }
        }
        this.f2355k = true;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public boolean mo2438p1() {
        Bundle bundle = this.f2349e;
        if (bundle == null || !bundle.getBoolean("allow_device_credential", false)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo2439r1(Bundle bundle) {
        this.f2349e = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void mo2440s1(Executor executor, DialogInterface.OnClickListener onClickListener, BiometricPrompt.C0534b bVar) {
        this.f2350f = executor;
        this.f2351g = onClickListener;
        this.f2352h = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void mo2441t1(BiometricPrompt.C0536d dVar) {
        this.f2353i = dVar;
    }
}
