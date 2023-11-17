package p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oo0.C17291b;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity;
import ue1.C43064a;
import xn0.C18852j;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.l */
public final class C15108l extends C15086c {

    /* renamed from: j */
    public static final C15109a f43383j = new C15109a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C18852j f43384g;

    /* renamed from: h */
    private final C41217g f43385h = C41219i.m119470b(new C15111c(this));

    /* renamed from: i */
    private final C41217g f43386i = C41219i.m119470b(new C15110b(this));

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.l$a */
    public static final class C15109a {
        private C15109a() {
        }

        public /* synthetic */ C15109a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15108l mo42063a(List list) {
            C41536l.m120489i(list, "categoryOrder");
            C15108l lVar = new C15108l();
            lVar.setArguments(C0908e.m3336b(C41233s.m119492a("ORDER", list)));
            return lVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.l$b */
    static final class C15110b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15108l f43387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15110b(C15108l lVar) {
            super(0);
            this.f43387d = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m55278c(C15108l lVar, OffersProgressListItemUiModel offersProgressListItemUiModel) {
            C41536l.m120489i(lVar, "this$0");
            C41536l.m120489i(offersProgressListItemUiModel, "listItem");
            Integer i = offersProgressListItemUiModel.mo41852i();
            if (i != null) {
                int intValue = i.intValue();
                OffersProgressDetailActivity.C15073a aVar = OffersProgressDetailActivity.f43328K;
                Context requireContext = lVar.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                aVar.mo42039a(requireContext, intValue);
            }
        }

        /* renamed from: b */
        public final C17291b invoke() {
            return new C17291b(new C15112m(this.f43387d));
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.l$c */
    static final class C15111c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15108l f43388d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15111c(C15108l lVar) {
            super(0);
            this.f43388d = lVar;
        }

        /* renamed from: b */
        public final ArrayList invoke() {
            ArrayList parcelableArrayList = this.f43388d.requireArguments().getParcelableArrayList("ORDER");
            C41536l.m120486f(parcelableArrayList);
            return parcelableArrayList;
        }
    }

    /* renamed from: i1 */
    private final C17291b m55273i1() {
        return (C17291b) this.f43386i.getValue();
    }

    /* renamed from: j1 */
    private final C18852j m55274j1() {
        C18852j jVar = this.f43384g;
        C41536l.m120486f(jVar);
        return jVar;
    }

    /* renamed from: k1 */
    private final List m55275k1() {
        Object value = this.f43385h.getValue();
        C41536l.m120488h(value, "<get-categoryOrder>(...)");
        return (List) value;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f43384g = C18852j.m63779d(layoutInflater, viewGroup, false);
        RecyclerView c = m55274j1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f43384g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m55274j1().f52756e.setAdapter(m55273i1());
        m55273i1().mo6029i(m55275k1());
    }
}
