package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;

public final class GetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetRetainInstanceUsageViolation(Fragment fragment) {
        super(fragment, "Attempting to get retain instance for fragment " + fragment);
        C41536l.m120489i(fragment, "fragment");
    }
}
