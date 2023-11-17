package p341ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c71.C31284d;
import g71.C32113f;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import j71.C36758j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.C35100a;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.C35105c;
import t71.C38704a;
import t71.C38705b;
import t71.C38706c;
import u71.C39037b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment */
public final class SelectTransportCardPassTypeDialogFragment extends C38704a {

    /* renamed from: K */
    public static final C35087a f84623K = new C35087a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C35105c.C35112g f84624G;

    /* renamed from: H */
    private C32113f f84625H;

    /* renamed from: I */
    private final C41217g f84626I = C41219i.m119470b(new C35096j(this));

    /* renamed from: J */
    private final C41217g f84627J;

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$a */
    public static final class C35087a {
        private C35087a() {
        }

        public /* synthetic */ C35087a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$b */
    static final class C35088b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardPassTypeDialogFragment f84628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35088b(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment) {
            super(1);
            this.f84628d = selectTransportCardPassTypeDialogFragment;
        }

        /* renamed from: a */
        public final void mo85969a(C35100a aVar) {
            if (aVar instanceof C35100a.C35102b) {
                this.f84628d.m103125i2().f78984k.mo53597e();
            } else if (aVar instanceof C35100a.C35101a) {
                this.f84628d.m103125i2().f78984k.mo53596d();
            } else if (aVar instanceof C35100a.C35103c) {
                this.f84628d.m103125i2().f78984k.mo53595c();
                C35100a.C35103c cVar = (C35100a.C35103c) aVar;
                this.f84628d.m103126j2().mo6029i(cVar.mo85977a());
                this.f84628d.m103126j2().mo92720o(cVar.mo85977a().indexOf(cVar.mo85978b()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85969a((C35100a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$c */
    static final class C35089c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardPassTypeDialogFragment f84629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35089c(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment) {
            super(1);
            this.f84629d = selectTransportCardPassTypeDialogFragment;
        }

        /* renamed from: a */
        public final void mo85970a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C8034d.m30522a(this.f84629d).mo22117L(C31284d.action_selectTransportCardPassTypeDialogFragment_to_selectTransportCardDetailsFragment);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85970a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$d */
    static final class C35090d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardPassTypeDialogFragment f84630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35090d(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment) {
            super(1);
            this.f84630d = selectTransportCardPassTypeDialogFragment;
        }

        /* renamed from: a */
        public final void mo85971a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f84630d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85971a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$e */
    static final class C35091e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84631a;

        C35091e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84631a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84631a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84631a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$f */
    public static final class C35092f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35092f(Fragment fragment) {
            super(0);
            this.f84632d = fragment;
        }

        public final Fragment invoke() {
            return this.f84632d;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$g */
    public static final class C35093g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35093g(C43064a aVar) {
            super(0);
            this.f84633d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f84633d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$h */
    public static final class C35094h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f84634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35094h(C41217g gVar) {
            super(0);
            this.f84634d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f84634d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$i */
    public static final class C35095i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84635d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84636e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35095i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f84635d = aVar;
            this.f84636e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84635d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f84636e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$j */
    static final class C35096j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardPassTypeDialogFragment f84637d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$j$a */
        static final class C35097a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ SelectTransportCardPassTypeDialogFragment f84638d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35097a(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment) {
                super(1);
                this.f84638d = selectTransportCardPassTypeDialogFragment;
            }

            /* renamed from: a */
            public final void mo85975a(C36758j jVar) {
                C41536l.m120489i(jVar, "it");
                this.f84638d.m103127k2().mo85989ww().mo85984Uk(jVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo85975a((C36758j) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35096j(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment) {
            super(0);
            this.f84637d = selectTransportCardPassTypeDialogFragment;
        }

        /* renamed from: b */
        public final C39037b invoke() {
            return new C39037b(new C35097a(this.f84637d));
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$k */
    static final class C35098k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardPassTypeDialogFragment f84639d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment$k$a */
        static final class C35099a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ SelectTransportCardPassTypeDialogFragment f84640d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35099a(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment) {
                super(0);
                this.f84640d = selectTransportCardPassTypeDialogFragment;
            }

            /* renamed from: b */
            public final C35105c invoke() {
                String str;
                C35105c.C35112g l2 = this.f84640d.mo85968l2();
                Bundle arguments = this.f84640d.getArguments();
                boolean z = false;
                if (arguments != null) {
                    z = arguments.getBoolean("OPENED_FROM_TRANSPORT_INFO_PAGE", false);
                }
                Bundle arguments2 = this.f84640d.getArguments();
                String str2 = "";
                if (arguments2 != null) {
                    str = arguments2.getString("PASS_TYPE_KEY", str2);
                } else {
                    str = null;
                }
                if (str != null) {
                    str2 = str;
                }
                return l2.mo32821a(z, str2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35098k(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment) {
            super(0);
            this.f84639d = selectTransportCardPassTypeDialogFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C35099a(this.f84639d));
        }
    }

    public SelectTransportCardPassTypeDialogFragment() {
        C35098k kVar = new C35098k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C35093g(new C35092f(this)));
        this.f84627J = C1514j0.m5374c(this, C41520a0.m120436b(C35105c.class), new C35094h(a), new C35095i((C43064a) null, a), kVar);
    }

    /* renamed from: W1 */
    private final void m103119W1() {
        m103125i2().f78989p.setOnClickListener(new C38705b(this));
        m103125i2().f78987n.setOnClickListener(new C38706c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final C32113f m103125i2() {
        C32113f fVar = this.f84625H;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final C39037b m103126j2() {
        return (C39037b) this.f84626I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C35105c m103127k2() {
        return (C35105c) this.f84627J.getValue();
    }

    /* renamed from: m2 */
    private final void m103128m2() {
        m103127k2().mo85992yw().mo85986a().mo4819k(getViewLifecycleOwner(), new C35091e(new C35088b(this)));
        LiveData X3 = m103127k2().mo85992yw().mo85985X3();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(X3, viewLifecycleOwner, new C35089c(this));
        LiveData p = m103127k2().mo85992yw().mo85987p();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(p, viewLifecycleOwner2, new C35090d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m103129n2(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment, View view) {
        C41536l.m120489i(selectTransportCardPassTypeDialogFragment, "this$0");
        selectTransportCardPassTypeDialogFragment.m103127k2().onRefresh(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m103130o2(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment, View view) {
        C41536l.m120489i(selectTransportCardPassTypeDialogFragment, "this$0");
        selectTransportCardPassTypeDialogFragment.m103127k2().mo85989ww().mo85988r();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f84625H = C32113f.m94586d(layoutInflater, viewGroup, true);
    }

    /* renamed from: l2 */
    public final C35105c.C35112g mo85968l2() {
        C35105c.C35112g gVar = this.f84624G;
        if (gVar != null) {
            return gVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f84625H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("tcc.choose.permit.action.sheet.title", new Object[0]));
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26369Z1(C32343x.m95394I(600));
        m103125i2().f78985l.setText(C32343x.m95388F("tcc.choose.permit.action.sheet.text", new Object[0]));
        RecyclerView recyclerView = m103125i2().f78988o;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        recyclerView.setAdapter(m103126j2());
        m103128m2();
        m103119W1();
    }
}
