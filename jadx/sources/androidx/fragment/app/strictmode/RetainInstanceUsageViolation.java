package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;

public abstract class RetainInstanceUsageViolation extends Violation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RetainInstanceUsageViolation(Fragment fragment, String str) {
        super(fragment, str);
        C41536l.m120489i(fragment, "fragment");
    }
}
