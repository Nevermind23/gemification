package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;

public final class FragmentTagUsageViolation extends Violation {

    /* renamed from: e */
    private final ViewGroup f4478e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        C41536l.m120489i(fragment, "fragment");
        this.f4478e = viewGroup;
    }
}
