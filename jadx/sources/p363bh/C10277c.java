package p363bh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.C13364a;
import p349ah.C9860d;
import p352ak.C10036w;
import p377ch.C10437b;
import p519mi.C16686a;
import p601sg.C17780e;
import p601sg.C17783h;
import p642vh.C18368l;
import ue1.C43064a;

/* renamed from: bh.c */
public final class C10277c extends C9860d {

    /* renamed from: D */
    public static final C10278a f28509D = new C10278a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C10275a f28510B;

    /* renamed from: C */
    private final C41217g f28511C = C41219i.m119470b(C10279b.f28512d);

    /* renamed from: bh.c$a */
    public static final class C10278a {
        private C10278a() {
        }

        public /* synthetic */ C10278a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C10277c m37472b(C10278a aVar, String str, List list, String str2, C16686a aVar2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                aVar2 = C16686a.INFO;
            }
            return aVar.mo26877a(str, list, str2, aVar2);
        }

        /* renamed from: a */
        public final C10277c mo26877a(String str, List list, String str2, C16686a aVar) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(list, "actions");
            C41536l.m120489i(aVar, "hintState");
            C10277c cVar = new C10277c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("AdditionalActionsActionSheet.EXTRA_TITLE", str), C41233s.m119492a("AdditionalActionsActionSheet.EXTRA_ACTIONS", new ArrayList(list)), C41233s.m119492a("AdditionalActionsActionSheet.EXTRA_HINT_TEXT", str2), C41233s.m119492a("AdditionalActionsActionSheet.EXTRA_HINT_STATE", aVar)));
            return cVar;
        }
    }

    /* renamed from: bh.c$b */
    static final class C10279b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C10279b f28512d = new C10279b();

        C10279b() {
            super(0);
        }

        /* renamed from: b */
        public final C10437b invoke() {
            return new C10437b();
        }
    }

    /* renamed from: e2 */
    private final C10437b m37466e2() {
        return (C10437b) this.f28511C.getValue();
    }

    /* renamed from: f2 */
    private final void m37467f2(InlineFeedback inlineFeedback) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String str = "";
            mo26370a2(arguments.getString("AdditionalActionsActionSheet.EXTRA_TITLE", str));
            List parcelableArrayList = arguments.getParcelableArrayList("AdditionalActionsActionSheet.EXTRA_ACTIONS");
            if (parcelableArrayList == null) {
                parcelableArrayList = C41341q.m119907j();
            } else {
                C41536l.m120488h(parcelableArrayList, "args.getParcelableArrayL…A_ACTIONS) ?: emptyList()");
            }
            m37468g2(parcelableArrayList);
            String string = arguments.getString("AdditionalActionsActionSheet.EXTRA_HINT_TEXT");
            if (string != null) {
                str = string;
            }
            C41536l.m120488h(str, "args.getString(EXTRA_HINT_TEXT) ?: \"\"");
            C18368l.m62751F(inlineFeedback, !C40439w.m117118v(str), false, 2, (Object) null);
            inlineFeedback.setTitleText(str);
            C16686a aVar = (C16686a) arguments.getSerializable("AdditionalActionsActionSheet.EXTRA_HINT_STATE");
            if (aVar == null) {
                aVar = C16686a.INFO;
            }
            inlineFeedback.setInlineFeedbackState(aVar);
        }
    }

    /* renamed from: g2 */
    private final void m37468g2(List list) {
        m37466e2().mo6029i(list);
    }

    /* renamed from: h2 */
    private final void m37469h2(RecyclerView recyclerView) {
        recyclerView.setAdapter(m37466e2());
        Drawable b = C5769a.m23210b(requireContext(), C17780e.f49660V);
        if (b != null) {
            C41536l.m120488h(b, "requireNotNull(\n        …p\n            )\n        )");
            recyclerView.mo5351j(new C13364a(b));
            m37466e2().mo27098n(new C10276b(this));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m37470i2(C10277c cVar, Enum enumR) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(enumR, "it");
        C10275a aVar = cVar.f28510B;
        if (aVar != null) {
            aVar.mo26876y0(enumR);
        }
        C1533o.m5445b(cVar, "AdditionalActionsActionSheet.REQUEST_TAG", C0908e.m3336b(C41233s.m119492a("AdditionalActionsActionSheet.RESULT_KEY", enumR)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        layoutInflater.inflate(C17783h.layout_additional_action_actionsheet_2, viewGroup, true);
    }

    public void onAttach(Context context) {
        C10275a aVar;
        C10275a aVar2;
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        try {
            Fragment parentFragment = getParentFragment();
            C41536l.m120487g(parentFragment, "null cannot be cast to non-null type ge.bog.designsystem.components.actionsheet.additionalactions.AdditionalActionSelectedListener");
            aVar = (C10275a) parentFragment;
        } catch (Exception unused) {
            if (context instanceof C10275a) {
                aVar2 = (C10275a) context;
            } else {
                aVar2 = null;
            }
            aVar = aVar2;
        }
        this.f28510B = aVar;
    }

    public void onDetach() {
        super.onDetach();
        this.f28510B = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C10036w a = C10036w.m36811a(view);
        C41536l.m120488h(a, "bind(view)");
        RecyclerView recyclerView = a.f27680e;
        C41536l.m120488h(recyclerView, "binding.actionTypesRecycler");
        m37469h2(recyclerView);
        InlineFeedback inlineFeedback = a.f27681f;
        C41536l.m120488h(inlineFeedback, "binding.hintFeedback");
        m37467f2(inlineFeedback);
    }
}
