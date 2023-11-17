package jk0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0214c;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import g91.C32343x;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.googlepay.presentation.viewmodel.GooglePayDialogViewModel$ViewModel;
import p380ck.C10457a;
import p380ck.C10464h;
import tj0.C28445c;
import ue1.C43064a;
import yj0.C30081c;

/* renamed from: jk0.c */
public final class C25465c extends C25473e {

    /* renamed from: A */
    public static final C25466a f65123A = new C25466a((DefaultConstructorMarker) null);

    /* renamed from: y */
    private C30081c f65124y;

    /* renamed from: z */
    private final C41217g f65125z;

    /* renamed from: jk0.c$a */
    public static final class C25466a {
        private C25466a() {
        }

        public /* synthetic */ C25466a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25465c mo64035a() {
            return new C25465c();
        }
    }

    /* renamed from: jk0.c$b */
    public static final class C25467b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f65126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25467b(Fragment fragment) {
            super(0);
            this.f65126d = fragment;
        }

        public final Fragment invoke() {
            return this.f65126d;
        }
    }

    /* renamed from: jk0.c$c */
    public static final class C25468c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f65127d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25468c(C43064a aVar) {
            super(0);
            this.f65127d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f65127d.invoke();
        }
    }

    /* renamed from: jk0.c$d */
    public static final class C25469d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f65128d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25469d(C41217g gVar) {
            super(0);
            this.f65128d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f65128d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: jk0.c$e */
    public static final class C25470e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f65129d;

        /* renamed from: e */
        final /* synthetic */ C41217g f65130e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25470e(C43064a aVar, C41217g gVar) {
            super(0);
            this.f65129d = aVar;
            this.f65130e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f65129d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f65130e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: jk0.c$f */
    public static final class C25471f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f65131d;

        /* renamed from: e */
        final /* synthetic */ C41217g f65132e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25471f(Fragment fragment, C41217g gVar) {
            super(0);
            this.f65131d = fragment;
            this.f65132e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f65132e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f65131d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C25465c() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C25468c(new C25467b(this)));
        this.f65125z = C1514j0.m5374c(this, C41520a0.m120436b(GooglePayDialogViewModel$ViewModel.class), new C25469d(a), new C25470e((C43064a) null, a), new C25471f(this, a));
    }

    /* renamed from: D1 */
    private final C30081c m80636D1() {
        C30081c cVar = this.f65124y;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* renamed from: E1 */
    private final GooglePayDialogViewModel$ViewModel m80637E1() {
        return (GooglePayDialogViewModel$ViewModel) this.f65125z.getValue();
    }

    /* renamed from: F1 */
    private final void m80638F1() {
        C36546y.m108282F().mo27137H("Google_Pay", C10457a.f29784e, (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: G1 */
    private final void m80639G1() {
        m80636D1().f75911i.setButtonText(C32343x.m95388F("google.pay.popup.no.thanks.button", new Object[0]));
        m80636D1().f75909g.setText(C32343x.m95388F("google.pay.popup.description.text", new Object[0]));
        m80636D1().f75910h.setAnimation(C28445c.anim_google_pay_popup);
        m80636D1().f75911i.setOnClickListener(new C25463a(this));
        m80636D1().f75908f.setOnClickListener(new C25464b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m80640H1(C25465c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m80641I1(C25465c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m80638F1();
        C1533o.m5445b(cVar, "REQUEST_KEY_GOOGLE_PAY_DIALOG", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_ADD_TO_GOOGLE_PAY_REQUESTED", Boolean.TRUE)));
        cVar.mo4577k1();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C41536l.m120489i(layoutInflater, "inflater");
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window = n1.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        LayerView c = m80636D1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        m80637E1().onDismiss();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m80639G1();
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        this.f65124y = C30081c.m91051d(LayoutInflater.from(requireContext()));
        aVar.setView((View) m80636D1().mo3946b());
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        return create;
    }
}
