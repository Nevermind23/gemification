package p745er;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import hc1.C41185v;
import kotlin.jvm.internal.C41536l;
import p00.C27113k;

/* renamed from: er.a */
public final class C20288a {

    /* renamed from: a */
    public static final C20288a f55212a = new C20288a();

    private C20288a() {
    }

    /* renamed from: a */
    public static final C27113k m66326a(FragmentManager fragmentManager) {
        C41536l.m120489i(fragmentManager, "fragmentManager");
        return m66328c(fragmentManager, (String) null, 2, (Object) null);
    }

    /* renamed from: b */
    public static final C27113k m66327b(FragmentManager fragmentManager, String str) {
        C41536l.m120489i(fragmentManager, "fragmentManager");
        Fragment k0 = fragmentManager.mo4418k0(str);
        if (k0 instanceof C27113k) {
            return (C27113k) k0;
        }
        return null;
    }

    /* renamed from: c */
    public static /* synthetic */ C27113k m66328c(FragmentManager fragmentManager, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "PreContractDialogFragment";
        }
        return m66327b(fragmentManager, str);
    }

    /* renamed from: d */
    public static final C41185v m66329d(FragmentManager fragmentManager) {
        C41536l.m120489i(fragmentManager, "fragmentManager");
        return m66331f(fragmentManager, (String) null, 2, (Object) null);
    }

    /* renamed from: e */
    public static final C41185v m66330e(FragmentManager fragmentManager, String str) {
        C41536l.m120489i(fragmentManager, "fragmentManager");
        Fragment k0 = fragmentManager.mo4418k0(str);
        if (k0 instanceof C41185v) {
            return (C41185v) k0;
        }
        return null;
    }

    /* renamed from: f */
    public static /* synthetic */ C41185v m66331f(FragmentManager fragmentManager, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "ScaVerificationDialogFragment";
        }
        return m66330e(fragmentManager, str);
    }
}
