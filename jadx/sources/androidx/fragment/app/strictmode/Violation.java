package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;

public abstract class Violation extends RuntimeException {

    /* renamed from: d */
    private final Fragment f4482d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        C41536l.m120489i(fragment, "fragment");
        this.f4482d = fragment;
    }

    /* renamed from: a */
    public final Fragment mo4787a() {
        return this.f4482d;
    }
}
