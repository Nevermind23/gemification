package p636uo;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import g91.C32343x;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoLookupUiModel;
import p349ah.C9860d;
import p413eo.C12726a;
import p649vo.C18465f;
import p662wo.C18648c;
import ue1.C43075l;

/* renamed from: uo.b */
public final class C18265b extends C9860d {

    /* renamed from: C */
    public static final C18266a f51580C = new C18266a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C12726a f51581B;

    /* renamed from: uo.b$a */
    public static final class C18266a {
        private C18266a() {
        }

        public /* synthetic */ C18266a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18265b mo45916a(List list) {
            C41536l.m120489i(list, "infoLookups");
            C18265b bVar = new C18265b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_FINANCIAL_INFO_LOOK_UPS", list)));
            return bVar;
        }
    }

    /* renamed from: uo.b$b */
    static final class C18267b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18265b f51582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18267b(C18265b bVar) {
            super(1);
            this.f51582d = bVar;
        }

        /* renamed from: a */
        public final void mo45917a(Bundle bundle) {
            C41536l.m120489i(bundle, "bundle");
            C18265b bVar = this.f51582d;
            Parcelable parcelable = bundle.getParcelable("RESULT_KEY_SELECTED_INFO_TYPE");
            C41536l.m120486f(parcelable);
            bVar.m62474k2((FinancialInfoLookupUiModel) parcelable);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45917a((Bundle) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uo.b$c */
    static final class C18268c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18265b f51583d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18268c(C18265b bVar) {
            super(1);
            this.f51583d = bVar;
        }

        /* renamed from: a */
        public final void mo45918a(Bundle bundle) {
            C41536l.m120489i(bundle, "bundle");
            C1533o.m5445b(this.f51583d, "REQUEST_KEY_ADD_FINANCIAL_INFO", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_ADD_FINANCIAL_INFO", bundle.getParcelable("RESULT_KEY_FINANCIAL_INFO"))));
            this.f51583d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45918a((Bundle) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: f2 */
    private final void m62469f2(String str, C43075l lVar) {
        getChildFragmentManager().mo4367F1(str, getViewLifecycleOwner(), new C18264a(lVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m62470g2(C43075l lVar, String str, Bundle bundle) {
        C41536l.m120489i(lVar, "$callBack");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "data");
        lVar.invoke(bundle);
    }

    /* renamed from: h2 */
    private final C12726a m62471h2() {
        C12726a aVar = this.f51581B;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: i2 */
    private final void m62472i2(Fragment fragment) {
        getChildFragmentManager().mo4428p().mo4639r(m62471h2().f37660e.getId(), fragment).mo4515i();
    }

    /* renamed from: j2 */
    private final void m62473j2() {
        m62469f2("REQUEST_KEY_INFO_TYPE_SELECTED", new C18267b(this));
        m62469f2("REQUEST_KEY_ADD_FINANCIAL_INFO", new C18268c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final void m62474k2(FinancialInfoLookupUiModel financialInfoLookupUiModel) {
        C32343x.m95447f1(mo26358J1());
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(C32343x.m95388F(financialInfoLookupUiModel.mo40836a(), new Object[0]));
        m62472i2(C18465f.f51934m.mo46252a(financialInfoLookupUiModel));
    }

    /* renamed from: l2 */
    private final void m62475l2() {
        ArrayList arrayList;
        C32343x.m95455i0(mo26358J1());
        mo26370a2(C32343x.m95388F("packages.application.II.financial.info.type.Asheet.header", new Object[0]));
        mo26368V1(C32343x.m95388F("packages.application.II.financial.info.type.Asheet.explanatory", new Object[0]));
        mo26372b2(ActionSheetTitle.C13155a.CAPTION);
        C18648c.C18649a aVar = C18648c.f52240j;
        Bundle arguments = getArguments();
        if (arguments != null) {
            arrayList = arguments.getParcelableArrayList("EXTRA_FINANCIAL_INFO_LOOK_UPS");
        } else {
            arrayList = null;
        }
        C41536l.m120486f(arrayList);
        m62472i2(aVar.mo46486a(arrayList));
    }

    /* renamed from: S1 */
    public void mo26366S1() {
        m62475l2();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f51581B = C12726a.m48298d(layoutInflater, viewGroup, true);
        m62473j2();
        m62475l2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f51581B = null;
    }
}
