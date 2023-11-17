package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.C0895a;
import androidx.core.p016os.C0909f;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import java.util.concurrent.Executor;

@SuppressLint({"SyntheticAccessor"})
/* renamed from: androidx.biometric.z */
public class C0586z extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0592b f2405d;

    /* renamed from: e */
    Executor f2406e;

    /* renamed from: f */
    BiometricPrompt.C0534b f2407f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f2408g;

    /* renamed from: h */
    private boolean f2409h;

    /* renamed from: i */
    private BiometricPrompt.C0536d f2410i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Context f2411j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f2412k;

    /* renamed from: l */
    private C0909f f2413l;

    /* renamed from: m */
    final C0895a.C0898c f2414m = new C0587a();

    /* renamed from: androidx.biometric.z$a */
    class C0587a extends C0895a.C0898c {

        /* renamed from: androidx.biometric.z$a$a */
        class C0588a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ int f2416d;

            /* renamed from: e */
            final /* synthetic */ CharSequence f2417e;

            C0588a(int i, CharSequence charSequence) {
                this.f2416d = i;
                this.f2417e = charSequence;
            }

            public void run() {
                C0586z.this.f2407f.mo2416a(this.f2416d, this.f2417e);
            }
        }

        /* renamed from: androidx.biometric.z$a$b */
        class C0589b implements Runnable {

            /* renamed from: d */
            final /* synthetic */ int f2419d;

            /* renamed from: e */
            final /* synthetic */ CharSequence f2420e;

            C0589b(int i, CharSequence charSequence) {
                this.f2419d = i;
                this.f2420e = charSequence;
            }

            public void run() {
                C0587a.this.m2265f(this.f2419d, this.f2420e);
                C0586z.this.m2253o1();
            }
        }

        /* renamed from: androidx.biometric.z$a$c */
        class C0590c implements Runnable {

            /* renamed from: d */
            final /* synthetic */ BiometricPrompt.C0535c f2422d;

            C0590c(BiometricPrompt.C0535c cVar) {
                this.f2422d = cVar;
            }

            public void run() {
                C0586z.this.f2407f.mo2418c(this.f2422d);
            }
        }

        /* renamed from: androidx.biometric.z$a$d */
        class C0591d implements Runnable {
            C0591d() {
            }

            public void run() {
                C0586z.this.f2407f.mo2417b();
            }
        }

        C0587a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m2265f(int i, CharSequence charSequence) {
            C0586z.this.f2405d.mo2495a(3);
            if (!C0554h0.m2164a()) {
                C0586z.this.f2406e.execute(new C0588a(i, charSequence));
            }
        }

        /* renamed from: a */
        public void mo2487a(int i, CharSequence charSequence) {
            if (i == 5) {
                if (C0586z.this.f2412k == 0) {
                    m2265f(i, charSequence);
                }
                C0586z.this.m2253o1();
            } else if (i == 7 || i == 9) {
                m2265f(i, charSequence);
                C0586z.this.m2253o1();
            } else {
                if (charSequence == null) {
                    Log.e("FingerprintHelperFrag", "Got null string for error message: " + i);
                    charSequence = C0586z.this.f2411j.getResources().getString(C0550f0.default_error_msg);
                }
                if (C0554h0.m2166c(i)) {
                    i = 8;
                }
                C0586z.this.f2405d.mo2496b(2, i, 0, charSequence);
                C0586z.this.f2408g.postDelayed(new C0589b(i, charSequence), (long) C0580y.m2231N1(C0586z.this.getContext()));
            }
        }

        /* renamed from: b */
        public void mo2488b() {
            C0586z.this.f2405d.mo2497c(1, C0586z.this.f2411j.getResources().getString(C0550f0.fingerprint_not_recognized));
            C0586z.this.f2406e.execute(new C0591d());
        }

        /* renamed from: c */
        public void mo2489c(int i, CharSequence charSequence) {
            C0586z.this.f2405d.mo2497c(1, charSequence);
        }

        /* renamed from: d */
        public void mo2490d(C0895a.C0899d dVar) {
            BiometricPrompt.C0535c cVar;
            C0586z.this.f2405d.mo2495a(5);
            if (dVar != null) {
                cVar = new BiometricPrompt.C0535c(C0586z.m2258x1(dVar.mo3355a()));
            } else {
                cVar = new BiometricPrompt.C0535c((BiometricPrompt.C0536d) null);
            }
            C0586z.this.f2406e.execute(new C0590c(cVar));
            C0586z.this.m2253o1();
        }
    }

    /* renamed from: androidx.biometric.z$b */
    static class C0592b {

        /* renamed from: a */
        private final Handler f2425a;

        C0592b(Handler handler) {
            this.f2425a = handler;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2495a(int i) {
            this.f2425a.obtainMessage(i).sendToTarget();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2496b(int i, int i2, int i3, Object obj) {
            this.f2425a.obtainMessage(i, i2, i3, obj).sendToTarget();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2497c(int i, Object obj) {
            this.f2425a.obtainMessage(i, obj).sendToTarget();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public void m2253o1() {
        this.f2409h = false;
        C1505h activity = getActivity();
        if (getFragmentManager() != null) {
            getFragmentManager().mo4428p().mo4519m(this).mo4516j();
        }
        if (!C0554h0.m2164a()) {
            C0554h0.m2169f(activity);
        }
    }

    /* renamed from: p1 */
    private String m2254p1(Context context, int i) {
        if (i == 1) {
            return context.getString(C0550f0.fingerprint_error_hw_not_available);
        }
        switch (i) {
            case 10:
                return context.getString(C0550f0.fingerprint_error_user_canceled);
            case 11:
                return context.getString(C0550f0.fingerprint_error_no_fingerprints);
            case 12:
                return context.getString(C0550f0.fingerprint_error_hw_not_present);
            default:
                Log.e("FingerprintHelperFrag", "Unknown error code: " + i);
                return context.getString(C0550f0.default_error_msg);
        }
    }

    /* renamed from: q1 */
    private boolean m2255q1(C0895a aVar) {
        if (!aVar.mo3350e()) {
            m2257s1(12);
            return true;
        } else if (aVar.mo3349d()) {
            return false;
        } else {
            m2257s1(11);
            return true;
        }
    }

    /* renamed from: r1 */
    static C0586z m2256r1() {
        return new C0586z();
    }

    /* renamed from: s1 */
    private void m2257s1(int i) {
        if (!C0554h0.m2164a()) {
            this.f2407f.mo2416a(i, m2254p1(this.f2411j, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static BiometricPrompt.C0536d m2258x1(C0895a.C0900e eVar) {
        if (eVar == null) {
            return null;
        }
        if (eVar.mo3356a() != null) {
            return new BiometricPrompt.C0536d(eVar.mo3356a());
        }
        if (eVar.mo3358c() != null) {
            return new BiometricPrompt.C0536d(eVar.mo3358c());
        }
        if (eVar.mo3357b() != null) {
            return new BiometricPrompt.C0536d(eVar.mo3357b());
        }
        return null;
    }

    /* renamed from: y1 */
    private static C0895a.C0900e m2259y1(BiometricPrompt.C0536d dVar) {
        if (dVar == null) {
            return null;
        }
        if (dVar.mo2419a() != null) {
            return new C0895a.C0900e(dVar.mo2419a());
        }
        if (dVar.mo2421c() != null) {
            return new C0895a.C0900e(dVar.mo2421c());
        }
        if (dVar.mo2420b() != null) {
            return new C0895a.C0900e(dVar.mo2420b());
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void mo2483n1(int i) {
        this.f2412k = i;
        if (i == 1) {
            m2257s1(10);
        }
        C0909f fVar = this.f2413l;
        if (fVar != null) {
            fVar.mo3359a();
        }
        m2253o1();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f2411j = getContext();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!this.f2409h) {
            this.f2413l = new C0909f();
            this.f2412k = 0;
            C0895a b = C0895a.m3303b(this.f2411j);
            if (m2255q1(b)) {
                this.f2405d.mo2495a(3);
                m2253o1();
            } else {
                b.mo3348a(m2259y1(this.f2410i), 0, this.f2413l, this.f2414m, (Handler) null);
                this.f2409h = true;
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void mo2484t1(Executor executor, BiometricPrompt.C0534b bVar) {
        this.f2406e = executor;
        this.f2407f = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public void mo2485u1(BiometricPrompt.C0536d dVar) {
        this.f2410i = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public void mo2486v1(Handler handler) {
        this.f2408g = handler;
        this.f2405d = new C0592b(handler);
    }
}
