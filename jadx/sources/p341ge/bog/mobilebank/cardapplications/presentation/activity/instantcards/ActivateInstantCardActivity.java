package p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import com.github.mikephil.charting.utils.Utils;
import d21.C31517a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o00.C26656a;
import p00.C27113k;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.additionalactions.model.SelectorConfig;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCommissionUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.instantcards.InstantCardActivationResultUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorData;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;
import p363bh.C10282f;
import p380ck.C10464h;
import p392dh.C12129b;
import p411em.C12487d;
import p412en.C12497b;
import p412en.C12502c;
import p481jm.C16226f;
import p537nm.C17081e0;
import p537nm.C17085g0;
import p537nm.C17107x;
import p537nm.C17108y;
import p565pm.C17391f;
import p603si.C17799b;
import p607sm.C17854a;
import p607sm.C17856b;
import p607sm.C17858c;
import p607sm.C17860d;
import p607sm.C17862e;
import p607sm.C17864f;
import p607sm.C17866g;
import p607sm.C17867h;
import p607sm.C17868i;
import p607sm.C17869j;
import p607sm.C17870k;
import p607sm.C17871l;
import p607sm.C17872m;
import p669xh.C18763a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity */
public final class ActivateInstantCardActivity extends C14180a implements C26656a {

    /* renamed from: L */
    public static final C14090a f41492L = new C14090a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f41493G = C41219i.m119470b(new C14114m(this));

    /* renamed from: H */
    private final C41217g f41494H = new C1617p0(C41520a0.m120436b(ActivateInstantCardViewModel$ViewModel.class), new C14113l0(this), new C14111k0(this), new C14115m0((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f41495I = C41219i.m119470b(C14117o.f41516d);

    /* renamed from: J */
    private final C41217g f41496J = C41219i.m119470b(C14116n.f41515d);

    /* renamed from: K */
    private final C41217g f41497K = C41219i.m119470b(C14118p.f41517d);

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$a */
    public static final class C14090a {
        private C14090a() {
        }

        public /* synthetic */ C14090a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo39173a(Context context, C0173b bVar) {
            C41238w wVar;
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, ActivateInstantCardActivity.class);
            if (bVar != null) {
                bVar.mo404a(intent);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$a0 */
    static final class C14091a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14091a0(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41498d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39174a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f41498d.m52299t3().f45809i.getButton().setLoading(false);
            for (Input enabled : C41341q.m119910m(this.f41498d.m52299t3().f45798A, this.f41498d.m52299t3().f45801D)) {
                enabled.setEnabled(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39174a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$b */
    /* synthetic */ class C14092b extends C41535k implements C43075l {
        C14092b(Object obj) {
            super(1, obj, ActivateInstantCardActivity.class, "onPreContractResult", "onPreContractResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39175b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ActivateInstantCardActivity) this.receiver).m52249E3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39175b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$b0 */
    static final class C14093b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41499d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14093b0(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41499d = activateInstantCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f41499d.m52299t3().f45809i.getButton().setLoading(false);
            for (Input enabled : C41341q.m119910m(this.f41499d.m52299t3().f45798A, this.f41499d.m52299t3().f45801D)) {
                enabled.setEnabled(true);
            }
            this.f41499d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$c */
    static final class C14094c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41500d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14094c(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41500d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39177a(String str) {
            C41536l.m120489i(str, "it");
            C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, str, false, (String) null, (ArrayList) null, (Summary) null, (String) null, 62, (Object) null);
            FragmentManager supportFragmentManager = this.f41500d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            c.mo4576A1(supportFragmentManager, (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39177a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$c0 */
    static final class C14095c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41501d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14095c0(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41501d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39178a(C41238w wVar) {
            FrameLayout frameLayout = this.f41501d.m52299t3().f45825y;
            C41536l.m120488h(frameLayout, "binding.loaderContainer");
            C32343x.m95447f1(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39178a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$d */
    /* synthetic */ class C14096d extends C41535k implements C43075l {
        C14096d(Object obj) {
            super(1, obj, ActivateInstantCardActivity.class, "onCheckCardResult", "onCheckCardResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39179b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ActivateInstantCardActivity) this.receiver).m52246C3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39179b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$d0 */
    static final class C14097d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41502d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14097d0(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41502d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39180a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            FrameLayout frameLayout = this.f41502d.m52299t3().f45825y;
            C41536l.m120488h(frameLayout, "binding.loaderContainer");
            C32343x.m95455i0(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39180a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$e */
    /* synthetic */ class C14098e extends C41535k implements C43075l {
        C14098e(Object obj) {
            super(1, obj, ActivateInstantCardActivity.class, "onRegTypesResult", "onRegTypesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39181b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ActivateInstantCardActivity) this.receiver).m52251F3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39181b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$e0 */
    static final class C14099e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41503d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14099e0(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41503d = activateInstantCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            FrameLayout frameLayout = this.f41503d.m52299t3().f45825y;
            C41536l.m120488h(frameLayout, "binding.loaderContainer");
            C32343x.m95455i0(frameLayout);
            this.f41503d.mo74709H1(th);
            ConstraintLayout constraintLayout = this.f41503d.m52299t3().f45819s;
            C41536l.m120488h(constraintLayout, "binding.errorContainer");
            C32343x.m95447f1(constraintLayout);
            this.f41503d.m52299t3().f45820t.setText(C32343x.m95431a0(th, (String) null, 1, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$f */
    /* synthetic */ class C14100f extends C41535k implements C43075l {
        C14100f(Object obj) {
            super(1, obj, ActivateInstantCardActivity.class, "onAccountsResult", "onAccountsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39183b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ActivateInstantCardActivity) this.receiver).m52245B3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39183b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$f0 */
    static final class C14101f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41504d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14101f0(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41504d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39184a(InstantCardActivationResultUiModel instantCardActivationResultUiModel) {
            this.f41504d.m52299t3().f45809i.getButton().setLoading(true);
            for (Input enabled : C41341q.m119910m(this.f41504d.m52299t3().f45807g, this.f41504d.m52299t3().f45798A, this.f41504d.m52299t3().f45801D)) {
                enabled.setEnabled(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39184a((InstantCardActivationResultUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$g */
    static final class C14102g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14102g(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41505d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39185a(CardAccountSelectorData cardAccountSelectorData) {
            C41536l.m120489i(cardAccountSelectorData, "it");
            C31517a.f78078J.mo71926a(cardAccountSelectorData).mo4576A1(this.f41505d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39185a((CardAccountSelectorData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$g0 */
    static final class C14103g0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41506d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14103g0(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41506d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39186a(InstantCardActivationResultUiModel instantCardActivationResultUiModel) {
            C41536l.m120489i(instantCardActivationResultUiModel, "it");
            this.f41506d.m52299t3().f45809i.getButton().setLoading(false);
            C14188e.f41589I.mo39260a(instantCardActivationResultUiModel).mo4576A1(this.f41506d.getSupportFragmentManager(), (String) null);
            C32343x.m95393H0(this.f41506d, "Instant_Delivery", "success", "click_activate", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39186a((InstantCardActivationResultUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$h */
    /* synthetic */ class C14104h extends C41535k implements C43075l {
        C14104h(Object obj) {
            super(1, obj, ActivateInstantCardActivity.class, "updateInput", "updateInput(Lge/bog/mobilebank/cardapplications/presentation/viewmodel/ActivateInstantCardViewModel$InstantCardActivationInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo39187b(C12497b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((ActivateInstantCardActivity) this.receiver).m52263L3(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39187b((C12497b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$h0 */
    static final class C14105h0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14105h0(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41507d = activateInstantCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f41507d.m52299t3().f45809i.getButton().setLoading(false);
            for (Input enabled : C41341q.m119910m(this.f41507d.m52299t3().f45798A, this.f41507d.m52299t3().f45801D)) {
                enabled.setEnabled(true);
            }
            this.f41507d.mo74709H1(th);
            C32343x.m95393H0(this.f41507d, "Instant_Delivery", "fail", "click_activate", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$i */
    /* synthetic */ class C14106i extends C41535k implements C43075l {
        C14106i(Object obj) {
            super(1, obj, ActivateInstantCardActivity.class, "openRegTypesActionSheet", "openRegTypesActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39189b(List list) {
            C41536l.m120489i(list, "p0");
            ((ActivateInstantCardActivity) this.receiver).m52259J3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39189b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$i0 */
    public static final class C14107i0 implements C12129b {

        /* renamed from: a */
        final /* synthetic */ List f41508a;

        C14107i0(List list) {
            this.f41508a = list;
        }

        /* renamed from: c */
        public String mo26885a(C17085g0 g0Var) {
            boolean z;
            C41536l.m120489i(g0Var, "item");
            for (C17108y yVar : this.f41508a) {
                if (yVar.mo44517b() == g0Var) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return C32343x.m95388F(yVar.mo44516a(), new Object[0]);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        /* renamed from: d */
        public String mo26886b(C17085g0 g0Var) {
            C41536l.m120489i(g0Var, "item");
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$j */
    /* synthetic */ class C14108j extends C41535k implements C43075l {
        C14108j(Object obj) {
            super(1, obj, ActivateInstantCardActivity.class, "openPhoneNumberActionSheet", "openPhoneNumberActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39192b(List list) {
            C41536l.m120489i(list, "p0");
            ((ActivateInstantCardActivity) this.receiver).m52257I3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39192b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$j0 */
    static final class C14109j0 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41509a;

        C14109j0(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41509a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41509a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41509a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$k */
    /* synthetic */ class C14110k extends C41535k implements C43075l {
        C14110k(Object obj) {
            super(1, obj, ActivateInstantCardActivity.class, "onRegisterResult", "onRegisterResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39195b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ActivateInstantCardActivity) this.receiver).m52253G3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39195b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$k0 */
    public static final class C14111k0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41510d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14111k0(ComponentActivity componentActivity) {
            super(0);
            this.f41510d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f41510d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$l */
    /* synthetic */ class C14112l extends C41535k implements C43075l {
        C14112l(Object obj) {
            super(1, obj, ActivateInstantCardActivity.class, "onCommissionFeesResult", "onCommissionFeesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39196b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ActivateInstantCardActivity) this.receiver).m52247D3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39196b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$l0 */
    public static final class C14113l0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41511d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14113l0(ComponentActivity componentActivity) {
            super(0);
            this.f41511d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41511d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$m */
    static final class C14114m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41512d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14114m(ActivateInstantCardActivity activateInstantCardActivity) {
            super(0);
            this.f41512d = activateInstantCardActivity;
        }

        /* renamed from: b */
        public final C16226f invoke() {
            return C16226f.m57832d(this.f41512d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$m0 */
    public static final class C14115m0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41513d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41514e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14115m0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41513d = aVar;
            this.f41514e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41513d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41514e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$n */
    static final class C14116n extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C14116n f41515d = new C14116n();

        C14116n() {
            super(0);
        }

        /* renamed from: b */
        public final C17799b.C17801b invoke() {
            return new C17799b.C17801b(15, 25);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$o */
    static final class C14117o extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C14117o f41516d = new C14117o();

        C14117o() {
            super(0);
        }

        /* renamed from: b */
        public final C17799b.C17801b invoke() {
            return new C17799b.C17801b(3, 5);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$p */
    static final class C14118p extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C14118p f41517d = new C14118p();

        C14118p() {
            super(0);
        }

        /* renamed from: b */
        public final C17799b.C17800a invoke() {
            return new C17799b.C17800a(5);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$q */
    static final class C14119q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14119q(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41518d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39201a(List list) {
            LoadingView loadingView = this.f41518d.m52299t3().f45808h;
            C41536l.m120488h(loadingView, "binding.accountsLoaderSkeleton");
            C32343x.m95447f1(loadingView);
            Input input = this.f41518d.m52299t3().f45807g;
            C41536l.m120488h(input, "binding.accountTypeInput");
            C32343x.m95455i0(input);
            Input input2 = this.f41518d.m52299t3().f45801D;
            C41536l.m120488h(input2, "binding.selectAccountInput");
            C32343x.m95455i0(input2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39201a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$r */
    static final class C14120r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14120r(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41519d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39202a(List list) {
            C41536l.m120489i(list, "it");
            LoadingView loadingView = this.f41519d.m52299t3().f45808h;
            C41536l.m120488h(loadingView, "binding.accountsLoaderSkeleton");
            C32343x.m95455i0(loadingView);
            Input input = this.f41519d.m52299t3().f45807g;
            C41536l.m120488h(input, "binding.accountTypeInput");
            C32343x.m95447f1(input);
            this.f41519d.m52299t3().f45807g.setEnabled(!list.isEmpty());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39202a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$s */
    static final class C14121s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14121s(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41520d = activateInstantCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            LoadingView loadingView = this.f41520d.m52299t3().f45808h;
            C41536l.m120488h(loadingView, "binding.accountsLoaderSkeleton");
            C32343x.m95455i0(loadingView);
            this.f41520d.m52255H3(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$t */
    static final class C14122t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14122t(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41521d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39204a(C17391f fVar) {
            this.f41521d.m52299t3().f45811k.setLoading(true);
            this.f41521d.m52299t3().f45811k.setEnabled(false);
            this.f41521d.m52299t3().f45823w.setEnabled(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39204a((C17391f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$u */
    static final class C14123u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41522d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14123u(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41522d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39205a(C17391f fVar) {
            boolean z;
            C41536l.m120489i(fVar, "it");
            this.f41522d.m52299t3().f45811k.setLoading(false);
            this.f41522d.m52299t3().f45811k.setEnabled(false);
            this.f41522d.m52299t3().f45823w.setEnabled(false);
            LayerView layerView = this.f41522d.m52299t3().f45799B;
            C41536l.m120488h(layerView, "binding.phoneNumberLayer");
            if (fVar.mo44917c().mo44509a() == C17081e0.SMS) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(layerView, z, false, 2, (Object) null);
            LayerView layerView2 = this.f41522d.m52299t3().f45806f;
            C41536l.m120488h(layerView2, "binding.accountDetailsLayer");
            C32343x.m95447f1(layerView2);
            this.f41522d.m52299t3().f45811k.setButtonIcon(this.f41522d.getResources().getDrawable(C12487d.f37163k, this.f41522d.getTheme()));
            C32343x.m95393H0(this.f41522d, "Instant_Delivery", "success", "click_check_details", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39205a((C17391f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$v */
    static final class C14124v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14124v(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41523d = activateInstantCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f41523d.m52255H3(th);
            C32343x.m95393H0(this.f41523d, "Instant_Delivery", "fail", "click_check_details", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$w */
    static final class C14125w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14125w(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41524d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39207a(DebitCardCommissionUiModel debitCardCommissionUiModel) {
            this.f41524d.m52299t3().f45809i.getButton().setLoading(true);
            this.f41524d.m52299t3().f45807g.setEnabled(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39207a((DebitCardCommissionUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$x */
    static final class C14126x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41525d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14126x(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41525d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39208a(DebitCardCommissionUiModel debitCardCommissionUiModel) {
            double d;
            String str;
            C41536l.m120489i(debitCardCommissionUiModel, "it");
            BigDecimal comAmount = debitCardCommissionUiModel.getComAmount();
            if (comAmount != null) {
                d = comAmount.doubleValue();
            } else {
                d = 0.0d;
            }
            String Q = C32343x.m95410Q(d, "GEL", false, 2, (Object) null);
            boolean z = true;
            this.f41525d.m52299t3().f45814n.setCaptionText(C32343x.m95388F("text.activate.iic.card.package.message", Q));
            Group group = this.f41525d.m52299t3().f45815o;
            C41536l.m120488h(group, "binding.commissions");
            int i = (d > Utils.DOUBLE_EPSILON ? 1 : (d == Utils.DOUBLE_EPSILON ? 0 : -1));
            if (i <= 0) {
                z = false;
            }
            C32343x.m95483r1(group, z, false, 2, (Object) null);
            Button button = this.f41525d.m52299t3().f45809i.getButton();
            String F = C32343x.m95388F("text.activate.iic.card.activation.button", new Object[0]);
            if (i > 0) {
                str = " (" + Q + ")";
            } else {
                str = "";
            }
            button.setButtonText(F + str);
            this.f41525d.m52299t3().f45813m.setText(Q);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39208a((DebitCardCommissionUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$y */
    static final class C14127y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14127y(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41526d = activateInstantCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f41526d.m52299t3().f45807g.setEnabled(true);
            this.f41526d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity$z */
    static final class C14128z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardActivity f41527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14128z(ActivateInstantCardActivity activateInstantCardActivity) {
            super(1);
            this.f41527d = activateInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39210a(C41238w wVar) {
            this.f41527d.m52299t3().f45809i.getButton().setLoading(true);
            for (Input enabled : C41341q.m119910m(this.f41527d.m52299t3().f45807g, this.f41527d.m52299t3().f45798A, this.f41527d.m52299t3().f45801D)) {
                enabled.setEnabled(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39210a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: A3 */
    private final void m52244A3(LiveData liveData, C43075l lVar) {
        C37224b.m109963b(liveData, this, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public final void m52245B3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14119q(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14120r(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14121s(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m52246C3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14122t(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14123u(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14124v(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public final void m52247D3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14125w(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14126x(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14127y(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public final void m52249E3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14128z(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14091a0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14093b0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public final void m52251F3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14095c0(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14097d0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14099e0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public final void m52253G3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14101f0(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14103g0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14105h0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public final void m52255H3(Throwable th) {
        mo74709H1(th);
        m52299t3().f45811k.setLoading(false);
        m52299t3().f45811k.setEnabled(true);
        m52299t3().f45823w.setEnabled(true);
        LayerView layerView = m52299t3().f45799B;
        C41536l.m120488h(layerView, "binding.phoneNumberLayer");
        C32343x.m95455i0(layerView);
        LayerView layerView2 = m52299t3().f45806f;
        C41536l.m120488h(layerView2, "binding.accountDetailsLayer");
        C32343x.m95455i0(layerView2);
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public final void m52257I3(List list) {
        C10282f e = C10282f.C10283a.m37495e(C10282f.f28515F, new SelectorConfig(C32343x.m95388F("text.activate.iic.card.phone.number.title", new Object[0]), false, (String) null, false, false, (String) null, "REQUEST_KEY_SELECT_PHONE_NUMBER", false, false, 446, (DefaultConstructorMarker) null), (C12129b) null, 2, (Object) null);
        e.mo26881q2(list);
        e.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public final void m52259J3(List list) {
        C10282f d = C10282f.f28515F.mo26884d(new SelectorConfig(C32343x.m95388F("text.activate.iic.card.account.type", new Object[0]), false, (String) null, false, false, (String) null, "REQUEST_KEY_SELECT_REG_TYPE", false, false, 446, (DefaultConstructorMarker) null), new C14107i0(list));
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C17108y) it.next()).mo44517b());
        }
        d.mo26881q2(arrayList);
        d.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: K3 */
    private final void m52261K3() {
        m52304y3();
        C16226f t3 = m52299t3();
        m52299t3().f45809i.getButton().setEnabled(false);
        t3.f45824x.setText(C32343x.m95388F("text.activate.iic.card.description", new Object[0]));
        t3.f45810j.setTitle(C32343x.m95388F("text.activate.iic.card.details", new Object[0]));
        t3.f45823w.setHintText(C32343x.m95388F("text.activate.iic.card.number", new Object[0]));
        t3.f45823w.setExpireTitle(C32343x.m95388F("text.activate.iic.card.exp.date", new Object[0]));
        t3.f45823w.setCvvTitle(C32343x.m95388F("text.activate.iic.card.cvv", new Object[0]));
        t3.f45823w.setInformationText(C32343x.m95388F("text.activate.iic.card.details.description", new Object[0]));
        t3.f45823w.setCreditCards(C41341q.m119910m(C18763a.VISA, C18763a.MASTER_CARD, C18763a.AMERICAN_EXPRESS));
        t3.f45811k.setButtonText(C32343x.m95388F("text.activate.iic.card.check.button", new Object[0]));
        t3.f45826z.setTitle(C32343x.m95388F("text.activate.iic.card.phone.number.title", new Object[0]));
        t3.f45798A.setHintText((CharSequence) C32343x.m95388F("text.activate.iic.card.phone.number", new Object[0]));
        t3.f45798A.setInfoText(C32343x.m95388F("text.activate.iic.card.phone.number.description", new Object[0]));
        t3.f45805e.setTitle(C32343x.m95388F("text.activate.iic.card.account.details", new Object[0]));
        t3.f45807g.setHintText((CharSequence) C32343x.m95388F("text.activate.iic.card.account.type", new Object[0]));
        t3.f45801D.setHintText((CharSequence) C32343x.m95388F("text.activate.iic.card.choose.account", new Object[0]));
        t3.f45809i.getButton().setButtonText(C32343x.m95388F("text.activate.iic.card.activation.button", new Object[0]));
        t3.f45809i.setEnabled(false);
        t3.f45811k.setEnabled(false);
        t3.f45812l.setText(C32343x.m95388F("text.activate.iic.card.package.fee", new Object[0]));
        t3.f45814n.setTitleText(C32343x.m95388F("text.activate.iic.card.package.message.title", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public final void m52263L3(C12497b bVar) {
        C17081e0 e0Var;
        boolean z;
        String str;
        C17085g0 g0Var;
        String b;
        String a;
        Input input = m52299t3().f45798A;
        C41536l.m120488h(input, "binding.phoneNumberInput");
        C17107x h = bVar.mo33110h();
        if (h != null) {
            e0Var = h.mo44509a();
        } else {
            e0Var = null;
        }
        boolean z2 = true;
        if (e0Var == C17081e0.SMS) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(input, z, false, 2, (Object) null);
        Input input2 = m52299t3().f45798A;
        String g = bVar.mo33109g();
        String str2 = "";
        if (g == null) {
            g = str2;
        }
        input2.setInputText(g);
        Input input3 = m52299t3().f45807g;
        C17108y i = bVar.mo33112i();
        if (i == null || (a = i.mo44516a()) == null || (str = C32343x.m95388F(a, new Object[0])) == null) {
            str = str2;
        }
        input3.setInputText(str);
        m52299t3().f45807g.setEnabled(bVar.mo33106e());
        Input input4 = m52299t3().f45801D;
        C41536l.m120488h(input4, "binding.selectAccountInput");
        C17108y i2 = bVar.mo33112i();
        if (i2 != null) {
            g0Var = i2.mo44517b();
        } else {
            g0Var = null;
        }
        if (g0Var != C17085g0.EXISTING_ACCOUNT) {
            z2 = false;
        }
        C32343x.m95483r1(input4, z2, false, 2, (Object) null);
        Input input5 = m52299t3().f45801D;
        CardAccountSelectorUiModel f = bVar.mo33108f();
        if (!(f == null || (b = f.mo84204b()) == null)) {
            str2 = b;
        }
        input5.setInputText(str2);
        m52299t3().f45809i.getButton().setLoading(false);
        m52299t3().f45809i.getButton().setEnabled(bVar.mo33113j());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0042, code lost:
        if (m52302w3().mo45386g(r1.getExpireDate()) != false) goto L_0x0046;
     */
    /* renamed from: M3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m52265M3() {
        /*
            r7 = this;
            jm.f r0 = r7.m52299t3()
            ge.bog.designsystem.components.buttons.Button r0 = r0.f45811k
            jm.f r1 = r7.m52299t3()
            ge.bog.designsystem.components.cardinput.CardInput r1 = r1.f45823w
            si.b$b r2 = r7.m52301v3()
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = r1.getCvv()
            r6 = 0
            r4[r6] = r5
            boolean r2 = r2.mo45386g(r4)
            if (r2 == 0) goto L_0x0045
            si.b$b r2 = r7.m52300u3()
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = r1.getCardNumber()
            r4[r6] = r5
            boolean r2 = r2.mo45386g(r4)
            if (r2 == 0) goto L_0x0045
            si.b$a r2 = r7.m52302w3()
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r1 = r1.getExpireDate()
            r4[r6] = r1
            boolean r1 = r2.mo45386g(r4)
            if (r1 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r3 = r6
        L_0x0046:
            r0.setEnabled(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity.m52265M3():void");
    }

    /* renamed from: c3 */
    private final void m52281c3() {
        C16226f t3 = m52299t3();
        t3.f45811k.setOnClickListener(new C17867h(t3, this));
        t3.f45809i.getButton().setOnClickListener(new C17868i(this));
        t3.f45798A.setOnClickListener(new C17869j(this));
        t3.f45807g.setOnClickListener(new C17870k(this));
        t3.f45801D.setOnClickListener(new C17871l(this));
        t3.f45800C.setOnClickListener(new C17872m(t3, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m52282d3(C16226f fVar, ActivateInstantCardActivity activateInstantCardActivity, View view) {
        C41536l.m120489i(fVar, "$this_with");
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        fVar.f45823w.clearFocus();
        activateInstantCardActivity.m52305z3();
        activateInstantCardActivity.m52303x3().mo39967Hw().mo33102mh(fVar.f45823w.getCardNumber(), fVar.f45823w.getCvv(), fVar.f45823w.getExpireDate());
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m52283e3(ActivateInstantCardActivity activateInstantCardActivity, View view) {
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        activateInstantCardActivity.m52303x3().mo39967Hw().mo33099Mn();
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m52284f3(ActivateInstantCardActivity activateInstantCardActivity, View view) {
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        activateInstantCardActivity.m52303x3().mo39967Hw().mo33098K4();
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m52285g3(ActivateInstantCardActivity activateInstantCardActivity, View view) {
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        activateInstantCardActivity.m52303x3().mo39967Hw().mo33100Sb();
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m52286h3(ActivateInstantCardActivity activateInstantCardActivity, View view) {
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        activateInstantCardActivity.m52303x3().mo39967Hw().mo33097E1();
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m52287i3(C16226f fVar, ActivateInstantCardActivity activateInstantCardActivity, View view) {
        C41536l.m120489i(fVar, "$this_with");
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        ConstraintLayout constraintLayout = fVar.f45819s;
        C41536l.m120488h(constraintLayout, "errorContainer");
        C32343x.m95455i0(constraintLayout);
        C21481a.onRefresh$default(activateInstantCardActivity.m52303x3(), 0, 1, (Object) null);
    }

    /* renamed from: j3 */
    private final void m52288j3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("REQUEST_KEY_CARD_ACCOUNT_SELECTED", this, new C17854a(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_SELECT_REG_TYPE", this, new C17862e(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_SELECT_PHONE_NUMBER", this, new C17864f(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_ACTIVATION_SUCCESS", this, new C17866g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m52289k3(ActivateInstantCardActivity activateInstantCardActivity, String str, Bundle bundle) {
        ArrayList arrayList;
        Object Y;
        String obj;
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("SELECTOR_RESULT_KEY");
        if (serializable instanceof ArrayList) {
            arrayList = (ArrayList) serializable;
        } else {
            arrayList = null;
        }
        if (arrayList != null && (Y = C41358y.m120009Y(arrayList)) != null && (obj = Y.toString()) != null) {
            activateInstantCardActivity.m52303x3().mo39970Yw(obj);
        }
    }

    /* renamed from: l1 */
    private final void m52290l1() {
        C12502c Iw = m52303x3().mo39968Iw();
        Iw.mo33119Sp().mo4819k(this, new C14109j0(new C14096d(this)));
        Iw.mo33120a5().mo4819k(this, new C14109j0(new C14098e(this)));
        Iw.mo33122g().mo4819k(this, new C14109j0(new C14100f(this)));
        m52244A3(Iw.mo33125q2(), new C14102g(this));
        Iw.mo33121f().mo4819k(this, new C14109j0(new C14104h(this)));
        m52244A3(Iw.mo33118Ro(), new C14106i(this));
        m52244A3(Iw.mo33124nm(), new C14108j(this));
        Iw.mo33116N4().mo4819k(this, new C14109j0(new C14110k(this)));
        Iw.mo33117Re().mo4819k(this, new C14109j0(new C14112l(this)));
        Iw.mo33115Kn().mo4819k(this, new C14109j0(new C14092b(this)));
        m52244A3(Iw.mo33123k(), new C14094c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m52291l3(ActivateInstantCardActivity activateInstantCardActivity, String str, Bundle bundle) {
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_ACTIVATION_SUCCESS_DISMISSED", false)) {
            activateInstantCardActivity.setResult(3);
            activateInstantCardActivity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m52292m3(ActivateInstantCardActivity activateInstantCardActivity, String str, Bundle bundle) {
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        CardAccountSelectorUiModel cardAccountSelectorUiModel = (CardAccountSelectorUiModel) bundle.getParcelable("RESULT_KEY_SELECTED_ACCOUNT");
        if (cardAccountSelectorUiModel != null) {
            activateInstantCardActivity.m52303x3().mo39966Bk(cardAccountSelectorUiModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m52293n3(ActivateInstantCardActivity activateInstantCardActivity, String str, Bundle bundle) {
        ArrayList arrayList;
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("SELECTOR_RESULT_KEY");
        C17085g0 g0Var = null;
        if (serializable instanceof ArrayList) {
            arrayList = (ArrayList) serializable;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof C17085g0) {
                    g0Var = next;
                    break;
                }
            }
        }
        C41536l.m120487g(g0Var, "null cannot be cast to non-null type ge.bog.mobilebank.cardapplications.domain.model.RegType");
        activateInstantCardActivity.m52303x3().mo39969Lw(g0Var);
    }

    /* renamed from: o3 */
    private final void m52294o3() {
        C16226f t3 = m52299t3();
        t3.f45823w.setOnTextChangeListener(new C17856b(this));
        t3.f45807g.setOnClickListener(new C17858c(this));
        t3.f45801D.setOnClickListener(new C17860d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m52295p3(ActivateInstantCardActivity activateInstantCardActivity, String str, String str2, String str3) {
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(str2, "<anonymous parameter 1>");
        C41536l.m120489i(str3, "<anonymous parameter 2>");
        activateInstantCardActivity.m52265M3();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m52296q3(ActivateInstantCardActivity activateInstantCardActivity, View view) {
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        activateInstantCardActivity.m52303x3().mo39967Hw().mo33100Sb();
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m52297r3(ActivateInstantCardActivity activateInstantCardActivity, View view) {
        C41536l.m120489i(activateInstantCardActivity, "this$0");
        activateInstantCardActivity.m52303x3().mo39967Hw().mo33097E1();
    }

    /* renamed from: s3 */
    private final void m52298s3() {
        m52281c3();
        m52294o3();
        m52288j3();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final C16226f m52299t3() {
        return (C16226f) this.f41493G.getValue();
    }

    /* renamed from: u3 */
    private final C17799b.C17801b m52300u3() {
        return (C17799b.C17801b) this.f41496J.getValue();
    }

    /* renamed from: v3 */
    private final C17799b.C17801b m52301v3() {
        return (C17799b.C17801b) this.f41495I.getValue();
    }

    /* renamed from: w3 */
    private final C17799b.C17800a m52302w3() {
        return (C17799b.C17800a) this.f41497K.getValue();
    }

    /* renamed from: x3 */
    private final ActivateInstantCardViewModel$ViewModel m52303x3() {
        return (ActivateInstantCardViewModel$ViewModel) this.f41494H.getValue();
    }

    /* renamed from: y3 */
    private final void m52304y3() {
        LayerView layerView = m52299t3().f45806f;
        C41536l.m120488h(layerView, "binding.accountDetailsLayer");
        C32343x.m95455i0(layerView);
        LayerView layerView2 = m52299t3().f45799B;
        C41536l.m120488h(layerView2, "binding.phoneNumberLayer");
        C32343x.m95455i0(layerView2);
    }

    /* renamed from: z3 */
    private final void m52305z3() {
        Object systemService = getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(m52299t3().mo3946b().getWindowToken(), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m52299t3().mo3946b());
        super.mo37451O1(bundle);
        m52261K3();
        m52290l1();
        m52298s3();
    }

    /* renamed from: m */
    public void mo39137m() {
        m52303x3().mo39967Hw().mo33101V3();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C27113k e0 = C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
        if (e0 != null) {
            e0.mo4577k1();
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.activate.iic.card.title", new Object[0]);
    }
}
