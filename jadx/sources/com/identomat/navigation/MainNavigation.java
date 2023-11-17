package com.identomat.navigation;

import android.content.Context;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.jvm.internal.C41536l;
import p485kc.C16341a;
import p569qc.C17481a;

public final class MainNavigation extends NavHostFragment {

    /* renamed from: j */
    public C17481a f30251j;

    /* renamed from: n1 */
    public final C17481a mo27335n1() {
        C17481a aVar = this.f30251j;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("fragmentFactory");
        throw null;
    }

    /* renamed from: o1 */
    public final void mo27336o1(C17481a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f30251j = aVar;
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        C16341a aVar = C16341a.f46171a;
        mo27336o1(new C17481a(aVar.mo43314b(), aVar.mo43315c(), aVar.mo43316d()));
        getChildFragmentManager().mo4361D1(mo27335n1());
    }
}
