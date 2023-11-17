package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.activity.s */
public abstract class C0175s {
    /* renamed from: a */
    public static final void m459a(View view, C0162q qVar) {
        C41536l.m120489i(view, "<this>");
        C41536l.m120489i(qVar, "onBackPressedDispatcherOwner");
        view.setTag(C0163r.view_tree_on_back_pressed_dispatcher_owner, qVar);
    }
}
