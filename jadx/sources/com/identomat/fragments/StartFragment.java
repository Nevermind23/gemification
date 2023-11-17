package com.identomat.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;
import p485kc.C16341a;
import p541oc.C17165s;
import p678yc.C18877a;
import p692zc.C19002e;

public final class StartFragment extends Fragment {

    /* renamed from: d */
    private final C18877a f29914d;

    /* renamed from: e */
    private C17165s f29915e;

    public StartFragment(C18877a aVar) {
        C41536l.m120489i(aVar, "identomatConfig");
        this.f29914d = aVar;
    }

    /* renamed from: h1 */
    private final void m38197h1() {
        C17165s sVar = this.f29915e;
        if (sVar != null) {
            sVar.mo3946b().setBackgroundColor(this.f29914d.mo46861a().mo47093b().mo33033a());
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: i1 */
    private final void m38198i1() {
        View view = (View) C16341a.f46171a.mo43318f().invoke();
        if (view != null) {
            try {
                C17165s sVar = this.f29915e;
                if (sVar != null) {
                    sVar.f48154e.removeAllViews();
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                        C17165s sVar2 = this.f29915e;
                        if (sVar2 != null) {
                            sVar2.f48154e.addView(view);
                            view.setVisibility(0);
                            return;
                        }
                        C41536l.m120506z("binding");
                        throw null;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                C41536l.m120506z("binding");
                throw null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            C17165s sVar3 = this.f29915e;
            if (sVar3 != null) {
                sVar3.f48155f.mo27360e(this.f29914d);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }

    /* renamed from: j1 */
    private final void m38199j1() {
        Integer b = this.f29914d.mo46867g().mo47137b();
        if (b != null) {
            int intValue = b.intValue();
            C19002e.C19003a aVar = C19002e.f53052q;
            Resources resources = getResources();
            C41536l.m120488h(resources, "resources");
            aVar.mo47119e(intValue, resources);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17165s d = C17165s.m60314d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f29915e = d;
        m38198i1();
        m38197h1();
        m38199j1();
        C17165s sVar = this.f29915e;
        if (sVar != null) {
            RelativeLayout c = sVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }
}
