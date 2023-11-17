package p359bd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;
import p541oc.C17162p;
import p678yc.C18877a;
import p692zc.C19002e;
import ue1.C43064a;

/* renamed from: bd.h */
public final class C10235h extends Fragment {

    /* renamed from: d */
    private final C18877a f28442d;

    /* renamed from: e */
    private final C43064a f28443e;

    /* renamed from: f */
    private C17162p f28444f;

    public C10235h(C18877a aVar, C43064a aVar2) {
        C41536l.m120489i(aVar, "identomatConfig");
        C41536l.m120489i(aVar2, "callback");
        this.f28442d = aVar;
        this.f28443e = aVar2;
    }

    /* renamed from: j1 */
    private final void m37341j1() {
        C17162p pVar = this.f28444f;
        if (pVar != null) {
            pVar.f48128e.setOnClickListener(new C10234g(this));
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m37342k1(C10235h hVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        hVar.mo26796i1().invoke();
    }

    /* renamed from: l1 */
    private final void m37343l1() {
        C19002e.C19003a aVar = C19002e.f53052q;
        C17162p pVar = this.f28444f;
        if (pVar != null) {
            RelativeLayout relativeLayout = pVar.f48128e;
            C41536l.m120488h(relativeLayout, "binding.againButton");
            aVar.mo47120f(relativeLayout, this.f28442d.mo46861a().mo47100i().mo33033a());
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: i1 */
    public final C43064a mo26796i1() {
        return this.f28443e;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17162p d = C17162p.m60299d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f28444f = d;
        m37343l1();
        m37341j1();
        C17162p pVar = this.f28444f;
        if (pVar != null) {
            return pVar.mo3946b();
        }
        C41536l.m120506z("binding");
        throw null;
    }
}
