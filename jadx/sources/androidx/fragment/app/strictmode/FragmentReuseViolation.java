package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;

public final class FragmentReuseViolation extends Violation {

    /* renamed from: e */
    private final String f4477e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        C41536l.m120489i(fragment, "fragment");
        C41536l.m120489i(str, "previousFragmentId");
        this.f4477e = str;
    }
}
