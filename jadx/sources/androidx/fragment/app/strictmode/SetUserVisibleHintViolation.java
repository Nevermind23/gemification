package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;

public final class SetUserVisibleHintViolation extends Violation {

    /* renamed from: e */
    private final boolean f4481e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(Fragment fragment, boolean z) {
        super(fragment, "Attempting to set user visible hint to " + z + " for fragment " + fragment);
        C41536l.m120489i(fragment, "fragment");
        this.f4481e = z;
    }
}
