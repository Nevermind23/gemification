package p341ge.bog.mobilebank.p2p.presentation.success;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.C0152h;
import androidx.fragment.app.C1505h;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.p2p.domain.model.MoneyTransferResponse;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p380ck.C10464h;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import yv0.C40079d;

/* renamed from: ge.bog.mobilebank.p2p.presentation.success.P2PSuccessFragment */
public final class P2PSuccessFragment extends C35651n1 {

    /* renamed from: d */
    private final C41217g f81814d = C41219i.m119470b(new C33539a(this));

    /* renamed from: e */
    private C40079d f81815e;

    /* renamed from: ge.bog.mobilebank.p2p.presentation.success.P2PSuccessFragment$a */
    static final class C33539a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PSuccessFragment f81816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33539a(P2PSuccessFragment p2PSuccessFragment) {
            super(0);
            this.f81816d = p2PSuccessFragment;
        }

        /* renamed from: b */
        public final MoneyTransferResponse invoke() {
            Bundle arguments = this.f81816d.getArguments();
            if (arguments != null) {
                return (MoneyTransferResponse) arguments.getParcelable("MONEY_TRANSFER_RESPONSE");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.success.P2PSuccessFragment$b */
    public static final class C33540b extends C0152h {

        /* renamed from: d */
        final /* synthetic */ P2PSuccessFragment f81817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33540b(P2PSuccessFragment p2PSuccessFragment) {
            super(true);
            this.f81817d = p2PSuccessFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            C1505h requireActivity = this.f81817d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C38122f c = C38125h.m112238c(requireActivity);
            Context requireContext = this.f81817d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f.C38123a.m112215k(c, requireContext, (String) null, (Bundle) null, 6, (Object) null);
        }
    }

    /* renamed from: i1 */
    private final C40079d m98469i1() {
        C40079d dVar = this.f81815e;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: j1 */
    private final MoneyTransferResponse m98470j1() {
        return (MoneyTransferResponse) this.f81814d.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f81815e = C40079d.m116122d(layoutInflater, viewGroup, false);
        LinearLayout c = m98469i1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f81815e = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String e;
        String str5;
        String b;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().mo342c(getViewLifecycleOwner(), new C33540b(this));
        C40079d i1 = m98469i1();
        i1.f95280j.setTitleText(C32343x.m95388F("text.p2p.payment.send.request.finale.success.title", new Object[0]));
        i1.f95279i.setText(C32343x.m95388F("text.p2p.payment.send.request.finale.success.info", new Object[0]));
        i1.f95278h.setTitle(C32343x.m95388F("text.p2p.payment.send.request.finale.details.contactID", new Object[0]));
        TwoLineTextItem twoLineTextItem = i1.f95278h;
        MoneyTransferResponse j1 = m98470j1();
        String str6 = null;
        if (j1 != null) {
            str = j1.mo79425f();
        } else {
            str = null;
        }
        twoLineTextItem.setText(str);
        TwoLineTextItem twoLineTextItem2 = i1.f95275e;
        MoneyTransferResponse j12 = m98470j1();
        if (j12 != null) {
            double a = j12.mo79419a();
            MoneyTransferResponse j13 = m98470j1();
            if (j13 == null || (b = j13.mo79420b()) == null) {
                str5 = "GEL";
            } else {
                str5 = b;
            }
            str2 = C32343x.m95410Q(a, str5, false, 2, (Object) null);
        } else {
            str2 = null;
        }
        twoLineTextItem2.setText(str2);
        TwoLineTextItem twoLineTextItem3 = i1.f95276f;
        MoneyTransferResponse j14 = m98470j1();
        if (j14 != null) {
            double d = j14.mo79421d();
            MoneyTransferResponse j15 = m98470j1();
            if (j15 == null || (e = j15.mo79423e()) == null) {
                str4 = "GEL";
            } else {
                str4 = e;
            }
            str3 = C32343x.m95410Q(d, str4, false, 2, (Object) null);
        } else {
            str3 = null;
        }
        twoLineTextItem3.setText(String.valueOf(str3));
        TwoLineTextItem twoLineTextItem4 = i1.f95277g;
        MoneyTransferResponse j16 = m98470j1();
        if (j16 != null) {
            str6 = j16.mo79426g();
        }
        twoLineTextItem4.setText(String.valueOf(str6));
        C32343x.m95395I0(this, "P2P_Transfer", "", "success_page_view", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }
}
