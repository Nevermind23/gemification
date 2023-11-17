package ia1;

import android.content.Context;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.C0577w;
import androidx.core.content.C0767a;
import androidx.fragment.app.Fragment;
import ba1.C10220y;
import kotlin.jvm.internal.C41536l;

/* renamed from: ia1.a */
public final class C15587a {

    /* renamed from: a */
    public static final C15587a f44276a = new C15587a();

    /* renamed from: ia1.a$a */
    public interface C15588a {

        /* renamed from: ia1.a$a$a */
        public static final class C15589a {
            /* renamed from: a */
            public static /* synthetic */ void m56292a(C15588a aVar, Throwable th, Integer num, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        num = null;
                    }
                    aVar.mo42847c(th, num);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFailed");
            }
        }

        /* renamed from: b */
        void mo42846b();

        /* renamed from: c */
        void mo42847c(Throwable th, Integer num);

        /* renamed from: d */
        void mo42848d();

        void onSuccess();
    }

    /* renamed from: ia1.a$b */
    public static final class C15590b extends BiometricPrompt.C0534b {

        /* renamed from: a */
        final /* synthetic */ C15588a f44277a;

        C15590b(C15588a aVar) {
            this.f44277a = aVar;
        }

        /* renamed from: a */
        public void mo2416a(int i, CharSequence charSequence) {
            C41536l.m120489i(charSequence, "errString");
            if (i == 3 || i == 10 || i == 13) {
                this.f44277a.mo42846b();
                return;
            }
            C15588a aVar = this.f44277a;
            aVar.mo42847c(new RuntimeException(charSequence + ", errorCode:" + i), Integer.valueOf(i));
        }

        /* renamed from: b */
        public void mo2417b() {
            this.f44277a.mo42847c(new RuntimeException("Authentication failed"), 2);
        }

        /* renamed from: c */
        public void mo2418c(BiometricPrompt.C0535c cVar) {
            C41536l.m120489i(cVar, "result");
            this.f44277a.onSuccess();
        }
    }

    private C15587a() {
    }

    /* renamed from: a */
    public final String mo42843a(Integer num) {
        if (num != null && num.intValue() == 1) {
            return "error.andr.biomet.error_hw_unavailable";
        }
        if (num != null && num.intValue() == 2) {
            return "error.andr.biomet.error_unable_to_process";
        }
        if (num != null && num.intValue() == 4) {
            return "error.andr.biomet.error_no_space";
        }
        if (num == null || num.intValue() != 5) {
            if (num != null && num.intValue() == 7) {
                return "error.andr.biomet.error_lockout";
            }
            if (num != null && num.intValue() == 8) {
                return "error.andr.biomet.error_vendor";
            }
            if (num != null && num.intValue() == 9) {
                return "error.andr.biomet.error_lockout_permanent";
            }
            if (num == null || num.intValue() != 10) {
                if (num != null && num.intValue() == 11) {
                    return "error.andr.biomet.error_no_biometrics";
                }
                if (num != null && num.intValue() == 12) {
                    return "error.andr.biomet.error_hw_not_present";
                }
                if (num != null && num.intValue() == 14) {
                    return "error.andr.biomet.biometric_error_no_device_credential";
                }
                return null;
            }
        }
        return "error.andr.biomet.error_canceled";
    }

    /* renamed from: b */
    public final boolean mo42844b(Context context) {
        C41536l.m120489i(context, "context");
        C0577w b = C0577w.m2200b(context);
        C41536l.m120488h(b, "from(context)");
        if (b.mo2453a() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo42845c(Fragment fragment, C15588a aVar) {
        C41536l.m120489i(fragment, "fragment");
        C41536l.m120489i(aVar, "callback");
        Context requireContext = fragment.requireContext();
        C41536l.m120488h(requireContext, "fragment.requireContext()");
        if (mo42844b(requireContext)) {
            BiometricPrompt biometricPrompt = new BiometricPrompt(fragment, C0767a.m2898h(fragment.requireContext()), (BiometricPrompt.C0534b) new C15590b(aVar));
            BiometricPrompt.C0537e a = new BiometricPrompt.C0537e.C0538a().mo2429e(fragment.requireContext().getString(C10220y.sso_biometric_prompt_title)).mo2428d(fragment.requireContext().getString(C10220y.sso_biometric_prompt_subtitle)).mo2427c(fragment.requireContext().getString(C10220y.sso_biometric_prompt_cancel)).mo2426b(false).mo2425a();
            C41536l.m120488h(a, "Builder()\n              …\n                .build()");
            try {
                biometricPrompt.mo2411t(a, new BiometricPrompt.C0536d(C9761a.f26541a.mo26215b()));
            } catch (Throwable th) {
                C15588a.C15589a.m56292a(aVar, th, (Integer) null, 2, (Object) null);
            }
        } else {
            aVar.mo42848d();
        }
    }
}
