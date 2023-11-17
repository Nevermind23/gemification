package com.identomat.fragments.selectors;

import android.graphics.drawable.Drawable;
import android.nfc.NfcManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0836a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.identomat.activities.NavigationActivity;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p045d.C5769a;
import p228r0.C8034d;
import p345ad.C9786e;
import p485kc.C16346d;
import p485kc.C16347e;
import p513mc.C16672i;
import p541oc.C17169w;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import ue1.C43079p;

public final class UploadTypesFragment extends Fragment {

    /* renamed from: d */
    private final C9786e f30241d;

    /* renamed from: e */
    private final C18877a f30242e;

    /* renamed from: f */
    private final String f30243f = "choose_capture_method_page";

    /* renamed from: g */
    private C17169w f30244g;

    /* renamed from: h */
    private RecyclerView.C1747p f30245h;

    /* renamed from: i */
    private C16672i f30246i;

    /* renamed from: j */
    private boolean f30247j;

    /* renamed from: k */
    private List f30248k = C41341q.m119913p(0);

    /* renamed from: l */
    private final C43079p f30249l = new C10640a(this);

    /* renamed from: com.identomat.fragments.selectors.UploadTypesFragment$a */
    static final class C10640a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ UploadTypesFragment f30250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10640a(UploadTypesFragment uploadTypesFragment) {
            super(2);
            this.f30250d = uploadTypesFragment;
        }

        /* renamed from: a */
        public final void mo27334a(int i, int i2) {
            if (i2 != 0) {
                return;
            }
            if (i == 0) {
                C8034d.m30522a(this.f30250d).mo22119N(C16347e.scanDocumentFragment, this.f30250d.getArguments(), NavigationActivity.f29874v.mo27261a());
            } else if (i == 1) {
                C8034d.m30522a(this.f30250d).mo22119N(C16347e.uploadDocumentFragment, this.f30250d.getArguments(), NavigationActivity.f29874v.mo27261a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo27334a(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    public UploadTypesFragment(C9786e eVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f30241d = eVar;
        this.f30242e = aVar;
    }

    /* renamed from: h1 */
    private final void m38767h1() {
        C19002e.C19003a aVar = C19002e.f53052q;
        C1505h requireActivity = requireActivity();
        C17169w wVar = this.f30244g;
        if (wVar != null) {
            ImageView imageView = wVar.f48186e;
            C41536l.m120488h(imageView, "binding.backButton");
            C17169w wVar2 = this.f30244g;
            if (wVar2 != null) {
                TextView textView = wVar2.f48187f;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                aVar.mo47118b(requireActivity, imageView, textView, true, this.f30242e);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: i1 */
    private final void m38768i1() {
        C17169w wVar = this.f30244g;
        if (wVar != null) {
            wVar.mo3946b().setBackgroundColor(this.f30242e.mo46861a().mo47093b().mo33033a());
            C17169w wVar2 = this.f30244g;
            if (wVar2 != null) {
                wVar2.f48188g.setTextColor(this.f30242e.mo46861a().mo47105n().mo33033a());
                Drawable b = C5769a.m23210b(requireContext(), C16346d.identomat_arrow_icon);
                C41536l.m120486f(b);
                Drawable r = C0836a.m3156r(b);
                C41536l.m120488h(r, "wrap(unwrappedDrawable!!)");
                C0836a.m3152n(r, this.f30242e.mo46861a().mo47100i().mo33033a());
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: j1 */
    private final void m38769j1() {
        C18999c e = this.f30242e.mo46867g().mo47140e();
        C17169w wVar = this.f30244g;
        if (wVar != null) {
            TextView textView = wVar.f48188g;
            C41536l.m120488h(textView, "binding.titleTextView");
            e.mo47079g(textView, 0);
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: k1 */
    private final void m38770k1() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.f30245h = linearLayoutManager;
        C17169w wVar = this.f30244g;
        if (wVar != null) {
            wVar.f48189h.setLayoutManager(linearLayoutManager);
            C16672i iVar = new C16672i(C41358y.m120036z0(this.f30248k), this.f30249l, this.f30242e);
            this.f30246i = iVar;
            C17169w wVar2 = this.f30244g;
            if (wVar2 != null) {
                wVar2.f48189h.setAdapter(iVar);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: l1 */
    private final void m38771l1() {
        C17169w wVar = this.f30244g;
        if (wVar != null) {
            wVar.f48188g.setText(this.f30242e.mo46864d().mo47124d(requireContext(), "capture_method_title"));
            m38769j1();
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: m1 */
    private final void m38772m1() {
        this.f30248k = C41341q.m119913p(0);
        if (this.f30242e.mo46863c().mo47052a() && !this.f30247j) {
            this.f30248k.add(1);
        }
        if (this.f30242e.mo46863c().mo47054c() && this.f30247j) {
            this.f30248k.add(1);
        }
        if (!this.f30242e.mo46863c().mo47055d()) {
            return;
        }
        if ((this.f30242e.mo46866f().mo47133a() == 0 || this.f30242e.mo46866f().mo47133a() == 3) && !this.f30247j) {
            Object systemService = requireContext().getSystemService("nfc");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.nfc.NfcManager");
            } else if (((NfcManager) systemService).getDefaultAdapter() != null) {
                this.f30248k.add(2);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        C41536l.m120489i(layoutInflater, "inflater");
        C17169w d = C17169w.m60334d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f30244g = d;
        Bundle arguments = getArguments();
        if (arguments == null) {
            z = false;
        } else {
            z = arguments.getBoolean("general");
        }
        this.f30247j = z;
        m38772m1();
        m38770k1();
        m38771l1();
        m38768i1();
        m38767h1();
        C17169w wVar = this.f30244g;
        if (wVar != null) {
            FrameLayout c = wVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onResume() {
        super.onResume();
        this.f30241d.mo26255q(getContext(), this.f30243f);
    }
}
