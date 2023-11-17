package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.C14633b;
import p356ao.C10114f;
import p413eo.C12732c;
import p428fp.C12946a;
import p428fp.C12947b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageConfirmationActionSheet */
public final class EditPackageConfirmationActionSheet extends C14636c {

    /* renamed from: K */
    private C12732c f42541K;

    /* renamed from: L */
    private final C41217g f42542L;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageConfirmationActionSheet$a */
    static final class C14621a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditPackageConfirmationActionSheet f42543d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14621a(EditPackageConfirmationActionSheet editPackageConfirmationActionSheet) {
            super(1);
            this.f42543d = editPackageConfirmationActionSheet;
        }

        /* renamed from: a */
        public final void mo40999a(C14633b bVar) {
            if (bVar instanceof C14633b.C14634a) {
                this.f42543d.handleError(((C14633b.C14634a) bVar).mo41007a());
            } else if (bVar instanceof C14633b.C14635b) {
                Button button = this.f42543d.m53918h2().f37686g;
                C41536l.m120488h(button, "binding.editButton");
                C14633b.C14635b bVar2 = (C14633b.C14635b) bVar;
                C32343x.m95483r1(button, bVar2.mo41011a(), false, 2, (Object) null);
                Button button2 = this.f42543d.m53918h2().f37684e;
                C41536l.m120488h(button2, "binding.cancelButton");
                C32343x.m95483r1(button2, bVar2.mo41012b(), false, 2, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40999a((C14633b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageConfirmationActionSheet$b */
    static final class C14622b implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42544a;

        C14622b(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42544a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42544a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42544a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageConfirmationActionSheet$c */
    public static final class C14623c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14623c(Fragment fragment) {
            super(0);
            this.f42545d = fragment;
        }

        public final Fragment invoke() {
            return this.f42545d;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageConfirmationActionSheet$d */
    public static final class C14624d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14624d(C43064a aVar) {
            super(0);
            this.f42546d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42546d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageConfirmationActionSheet$e */
    public static final class C14625e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14625e(C41217g gVar) {
            super(0);
            this.f42547d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42547d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageConfirmationActionSheet$f */
    public static final class C14626f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42548d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42549e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14626f(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42548d = aVar;
            this.f42549e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42548d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42549e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageConfirmationActionSheet$g */
    public static final class C14627g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42550d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42551e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14627g(Fragment fragment, C41217g gVar) {
            super(0);
            this.f42550d = fragment;
            this.f42551e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f42551e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f42550d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public EditPackageConfirmationActionSheet() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14624d(new C14623c(this)));
        this.f42542L = C1514j0.m5374c(this, C41520a0.m120436b(EditPackageViewModel$ViewModel.class), new C14625e(a), new C14626f((C43064a) null, a), new C14627g(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final C12732c m53918h2() {
        C12732c cVar = this.f42541K;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* renamed from: i2 */
    private final EditPackageViewModel$ViewModel m53919i2() {
        return (EditPackageViewModel$ViewModel) this.f42542L.getValue();
    }

    /* renamed from: j2 */
    private final void m53920j2() {
        m53919i2().getState().mo4819k(getViewLifecycleOwner(), new C14622b(new C14621a(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m53921k2(EditPackageConfirmationActionSheet editPackageConfirmationActionSheet, View view) {
        C41536l.m120489i(editPackageConfirmationActionSheet, "this$0");
        C8034d.m30522a(editPackageConfirmationActionSheet).mo22117L(C10114f.action_editPackageConfirmationActionSheet_to_packagesListFragment);
        editPackageConfirmationActionSheet.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m53922l2(EditPackageConfirmationActionSheet editPackageConfirmationActionSheet, View view) {
        C41536l.m120489i(editPackageConfirmationActionSheet, "this$0");
        C8034d.m30522a(editPackageConfirmationActionSheet).mo22121Q(C14631a.f42559a.mo41006a());
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f42541K = C12732c.m48322d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f42541K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("my.package.page.change.package.Asheet.header", new Object[0]));
        C12732c h2 = m53918h2();
        h2.f37685f.setText(C32343x.m95388F("my.package.page.change.package.Asheet.explanatory", new Object[0]));
        h2.f37686g.setButtonText(C32343x.m95388F("my.package.page.change.package.Asheet.button", new Object[0]));
        h2.f37686g.setOnClickListener(new C12946a(this));
        h2.f37684e.setButtonText(C32343x.m95388F("text.packages.my.package.cancel.button", new Object[0]));
        h2.f37684e.setOnClickListener(new C12947b(this));
        m53920j2();
    }
}
