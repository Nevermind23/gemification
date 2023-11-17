package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;

public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {

    /* renamed from: e */
    private final Fragment f4479e;

    /* renamed from: f */
    private final int f4480f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment);
        C41536l.m120489i(fragment, "fragment");
        C41536l.m120489i(fragment2, "targetFragment");
        this.f4479e = fragment2;
        this.f4480f = i;
    }
}
