package com.identomat.fragments.selectors;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.identomat.activities.NavigationActivity;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p228r0.C8034d;
import p345ad.C9786e;
import p513mc.C16667f;
import p541oc.C17154h;
import p555pc.C17336a;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import ue1.C43079p;

public final class DocumentTypesFragment extends Fragment {

    /* renamed from: k */
    public static final C10638a f30231k = new C10638a((DefaultConstructorMarker) null);

    /* renamed from: l */
    private static final String[] f30232l = {"android.permission.CAMERA"};

    /* renamed from: d */
    private final C9786e f30233d;

    /* renamed from: e */
    private final C18877a f30234e;

    /* renamed from: f */
    private final String f30235f = "select_document_page";

    /* renamed from: g */
    private C17154h f30236g;

    /* renamed from: h */
    private RecyclerView.C1747p f30237h;

    /* renamed from: i */
    private C16667f f30238i;

    /* renamed from: j */
    private final C43079p f30239j = new C10639b(this);

    /* renamed from: com.identomat.fragments.selectors.DocumentTypesFragment$a */
    public static final class C10638a {
        private C10638a() {
        }

        public /* synthetic */ C10638a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.identomat.fragments.selectors.DocumentTypesFragment$b */
    static final class C10639b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ DocumentTypesFragment f30240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10639b(DocumentTypesFragment documentTypesFragment) {
            super(2);
            this.f30240d = documentTypesFragment;
        }

        /* renamed from: a */
        public final void mo27333a(int i, int i2) {
            if (i2 == 0) {
                this.f30240d.mo27331h1().mo26256r(this.f30240d.getContext(), C17336a.f48645a.mo44742a(i));
                this.f30240d.mo27332i1().mo46866f().mo47135c(i);
                C8034d.m30522a(this.f30240d).mo22119N(this.f30240d.mo27332i1().mo46865e().mo47130g().mo47132b(), this.f30240d.getArguments(), NavigationActivity.f29874v.mo27261a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo27333a(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    public DocumentTypesFragment(C9786e eVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f30233d = eVar;
        this.f30234e = aVar;
    }

    /* renamed from: j1 */
    private final void m38759j1() {
        C19002e.C19003a aVar = C19002e.f53052q;
        C1505h activity = getActivity();
        C17154h hVar = this.f30236g;
        if (hVar != null) {
            ImageView imageView = hVar.f48031e;
            C41536l.m120488h(imageView, "binding.backButton");
            C17154h hVar2 = this.f30236g;
            if (hVar2 != null) {
                TextView textView = hVar2.f48032f;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                aVar.mo47118b(activity, imageView, textView, true, this.f30234e);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: k1 */
    private final void m38760k1() {
        C17154h hVar = this.f30236g;
        if (hVar != null) {
            hVar.mo3946b().setBackgroundColor(this.f30234e.mo46861a().mo47093b().mo33033a());
            C17154h hVar2 = this.f30236g;
            if (hVar2 != null) {
                hVar2.f48034h.setTextColor(this.f30234e.mo46861a().mo47105n().mo33033a());
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
    private final void m38761l1() {
        C18999c e = this.f30234e.mo46867g().mo47140e();
        C17154h hVar = this.f30236g;
        if (hVar != null) {
            TextView textView = hVar.f48034h;
            C41536l.m120488h(textView, "binding.titleTextView");
            e.mo47079g(textView, 0);
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: m1 */
    private final void m38762m1() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.f30237h = linearLayoutManager;
        C17154h hVar = this.f30236g;
        if (hVar != null) {
            hVar.f48033g.setLayoutManager(linearLayoutManager);
            C16667f fVar = new C16667f(this.f30234e.mo46862b().mo47049a(), this.f30239j, this.f30234e);
            this.f30238i = fVar;
            C17154h hVar2 = this.f30236g;
            if (hVar2 != null) {
                hVar2.f48033g.setAdapter(fVar);
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: n1 */
    private final void m38763n1() {
        C17154h hVar = this.f30236g;
        if (hVar != null) {
            hVar.f48034h.setText(this.f30234e.mo46864d().mo47124d(getContext(), "select_document"));
            m38761l1();
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: h1 */
    public final C9786e mo27331h1() {
        return this.f30233d;
    }

    /* renamed from: i1 */
    public final C18877a mo27332i1() {
        return this.f30234e;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17154h d = C17154h.m60259d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f30236g = d;
        m38762m1();
        m38763n1();
        m38760k1();
        m38759j1();
        C17154h hVar = this.f30236g;
        if (hVar != null) {
            RelativeLayout c = hVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onResume() {
        super.onResume();
        this.f30233d.mo26255q(getContext(), this.f30235f);
    }
}
