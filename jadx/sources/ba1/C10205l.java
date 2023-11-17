package ba1;

import android.content.Context;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.C41536l;

/* renamed from: ba1.l */
public abstract class C10205l {

    /* renamed from: ba1.l$a */
    public interface C10206a {
        /* renamed from: a */
        void mo26774a();

        /* renamed from: b */
        LiveData mo26775b();
    }

    /* renamed from: a */
    public abstract C10206a mo26771a(Context context, C1619q qVar);

    /* renamed from: b */
    public final C10206a mo26772b(Fragment fragment) {
        C41536l.m120489i(fragment, "fragment");
        Context requireContext = fragment.requireContext();
        C41536l.m120488h(requireContext, "fragment.requireContext()");
        return mo26771a(requireContext, fragment);
    }

    /* renamed from: c */
    public final C10206a mo26773c(C1505h hVar) {
        C41536l.m120489i(hVar, "activity");
        return mo26771a(hVar, hVar);
    }
}
