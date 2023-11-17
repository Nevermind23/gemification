package g91;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.C1483c;
import iu0.C36546y;
import java.util.Calendar;
import kotlin.jvm.internal.C41536l;
import p366bk.C10328q;
import p420fh.C12902d;
import p434gh.C15278a;

/* renamed from: g91.d */
public final class C32297d {

    /* renamed from: a */
    public static final C32297d f79705a = new C32297d();

    /* renamed from: b */
    public static final C12902d.C12905b.C12907b f79706b;

    /* renamed from: c */
    public static final C12902d.C12905b.C12908c f79707c = C12902d.C12905b.C12908c.f38105a;

    /* renamed from: d */
    public static final C12902d.C12905b.C12907b f79708d;

    /* renamed from: e */
    public static final C12902d.C12905b.C12906a f79709e = C12902d.C12905b.C12906a.f38103a;

    /* renamed from: f */
    public static final C12902d.C12905b.C12909d f79710f = C12902d.C12905b.C12909d.f38106a;

    /* renamed from: g */
    private static long f79711g;

    static {
        C12902d.C12905b.C12907b bVar = C12902d.C12905b.C12907b.f38104a;
        f79706b = bVar;
        f79708d = bVar;
    }

    private C32297d() {
    }

    /* renamed from: a */
    public static final void m95153a(Activity activity) {
        if (activity != null) {
            m95154b(activity, activity.getString(C10328q.f28940T1));
        }
    }

    /* renamed from: b */
    public static final void m95154b(Activity activity, String str) {
        m95155c(activity, str, (C32311i0) null);
    }

    /* renamed from: c */
    public static final void m95155c(Activity activity, String str, C32311i0 i0Var) {
        if (activity != null) {
            if (str == null) {
                str = activity.getString(C10328q.f28940T1);
            }
            try {
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                if (timeInMillis - 2000 > f79711g) {
                    C12902d.C12903a aVar = C12902d.f38098b;
                    aVar.mo33655a(activity);
                    C12902d.C12903a.m48771e(aVar, activity, false, 2, (Object) null).mo33652k(str, C15278a.NEGATIVE, (C12902d.C12905b) null);
                    C36546y.m108282F().mo27158y(activity, str);
                    f79711g = timeInMillis;
                    if (i0Var != null) {
                        new Handler(Looper.getMainLooper()).postDelayed(new C32294c(i0Var), C12902d.C12905b.C12908c.f38105a.mo33660a());
                    }
                }
            } catch (Exception unused) {
                C12902d.f38098b.mo33655a(activity);
            }
        }
    }

    /* renamed from: d */
    public static final void m95156d(C1483c cVar, String str) {
        if (cVar != null) {
            if (str == null) {
                str = cVar.getString(C10328q.f28940T1);
            }
            String str2 = str;
            try {
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                if (timeInMillis - 2000 > f79711g) {
                    C12902d.C12903a aVar = C12902d.f38098b;
                    aVar.mo33656b(cVar);
                    C12902d.m48763l(C12902d.C12903a.m48772f(aVar, cVar, false, 2, (Object) null), cVar, str2, C15278a.NEGATIVE, (C12902d.C12905b) null, 8, (Object) null);
                    f79711g = timeInMillis;
                }
            } catch (Exception unused) {
                C12902d.f38098b.mo33656b(cVar);
            }
        }
    }

    /* renamed from: e */
    public static final void m95157e(Activity activity, String str) {
        m95158f(activity, str, f79706b);
    }

    /* renamed from: f */
    public static final void m95158f(Activity activity, String str, C12902d.C12905b bVar) {
        C41536l.m120489i(bVar, "duration");
        if (activity != null) {
            try {
                m95159g(activity, str, bVar, (C32311i0) null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static final void m95159g(Activity activity, String str, C12902d.C12905b bVar, C32311i0 i0Var) {
        C41536l.m120489i(bVar, "duration");
        if (activity != null && str != null) {
            try {
                C12902d.C12903a aVar = C12902d.f38098b;
                aVar.mo33655a(activity);
                C12902d.C12903a.m48771e(aVar, activity, false, 2, (Object) null).mo33652k(str, C15278a.INFO, bVar);
                if (i0Var != null) {
                    new Handler(Looper.getMainLooper()).postDelayed(new C32294c(i0Var), bVar.mo33660a());
                }
                C36546y.m108282F().mo27159z(activity, str);
            } catch (Exception unused) {
                C12902d.f38098b.mo33655a(activity);
            }
        }
    }

    /* renamed from: h */
    public static final void m95160h(Activity activity, String str) {
        if (activity != null) {
            try {
                m95161i(activity, str, f79706b, (C32311i0) null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    public static final void m95161i(Activity activity, String str, C12902d.C12905b bVar, C32311i0 i0Var) {
        C41536l.m120489i(bVar, "duration");
        if (activity != null && str != null) {
            try {
                C12902d.C12903a aVar = C12902d.f38098b;
                aVar.mo33655a(activity);
                C12902d.C12903a.m48771e(aVar, activity, false, 2, (Object) null).mo33652k(str, C15278a.POSITIVE, bVar);
                if (i0Var != null) {
                    new Handler(Looper.getMainLooper()).postDelayed(new C32294c(i0Var), bVar.mo33660a());
                }
                C36546y.m108282F().mo27133A(activity, str);
            } catch (Exception unused) {
                C12902d.f38098b.mo33655a(activity);
            }
        }
    }
}
