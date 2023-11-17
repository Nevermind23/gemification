package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;

public final class WrongFragmentContainerViolation extends Violation {

    /* renamed from: e */
    private final ViewGroup f4483e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        C41536l.m120489i(fragment, "fragment");
        C41536l.m120489i(viewGroup, "container");
        this.f4483e = viewGroup;
    }
}
