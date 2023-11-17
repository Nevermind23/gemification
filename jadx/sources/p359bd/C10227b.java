package p359bd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C41536l;
import p485kc.C16346d;
import p541oc.C17157k;
import p678yc.C18877a;
import p692zc.C19004f;

/* renamed from: bd.b */
public final class C10227b extends Fragment {

    /* renamed from: d */
    private final boolean f28426d;

    /* renamed from: e */
    private final C18877a f28427e;

    /* renamed from: f */
    private C17157k f28428f;

    /* renamed from: g */
    private int f28429g;

    /* renamed from: h */
    private String f28430h = "";

    public C10227b(boolean z, C18877a aVar) {
        C41536l.m120489i(aVar, "identomatConfig");
        this.f28426d = z;
        this.f28427e = aVar;
    }

    /* renamed from: h1 */
    private final void m37322h1() {
        int i;
        int i2;
        String str = "";
        if (!this.f28426d) {
            C19004f d = this.f28427e.mo46864d();
            C17157k kVar = this.f28428f;
            if (kVar != null) {
                String d2 = d.mo47124d(kVar.mo3946b().getContext(), "neutral_expression");
                if (d2 != null) {
                    str = d2;
                }
                this.f28430h = str;
                if (this.f28427e.mo46867g().mo47142g() != null) {
                    Integer g = this.f28427e.mo46867g().mo47142g();
                    C41536l.m120486f(g);
                    i2 = g.intValue();
                } else {
                    i2 = C16346d.identomat_neutral_face_icon;
                }
                this.f28429g = i2;
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C19004f d3 = this.f28427e.mo46864d();
        C17157k kVar2 = this.f28428f;
        if (kVar2 != null) {
            String d4 = d3.mo47124d(kVar2.mo3946b().getContext(), "smile");
            if (d4 != null) {
                str = d4;
            }
            this.f28430h = str;
            if (this.f28427e.mo46867g().mo47146k() != null) {
                Integer k = this.f28427e.mo46867g().mo47146k();
                C41536l.m120486f(k);
                i = k.intValue();
            } else {
                i = C16346d.identomat_smile_face_icon;
            }
            this.f28429g = i;
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17157k d = C17157k.m60274d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f28428f = d;
        m37322h1();
        C17157k kVar = this.f28428f;
        if (kVar != null) {
            kVar.f48071e.setImageResource(this.f28429g);
            C17157k kVar2 = this.f28428f;
            if (kVar2 != null) {
                kVar2.f48072f.setText(this.f28430h);
                C17157k kVar3 = this.f28428f;
                if (kVar3 != null) {
                    RelativeLayout c = kVar3.mo3946b();
                    C41536l.m120488h(c, "binding.root");
                    return c;
                }
                C41536l.m120506z("binding");
                throw null;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }
}
