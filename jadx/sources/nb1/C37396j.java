package nb1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10220y;
import gb1.C32392v;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import ib1.C36382c1;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41545u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb1.C37119a;
import ma1.C26172b;
import nb1.C37417k;
import nh1.C41806a;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.onboarding.model.AddressElementUiModel;
import p341ge.bog.sso_client.onboarding.model.AddressUiModel;
import p341ge.bog.sso_client.onboarding.model.LegalAddressUiModel;
import ua1.C28628b0;
import ue1.C43064a;
import ue1.C43075l;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: nb1.j */
public final class C37396j extends Fragment {

    /* renamed from: h */
    public static final C37397a f89917h = new C37397a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f89918d = C41219i.m119469a(C41222k.SYNCHRONIZED, new C37412p(this, (C41806a) null, (C43064a) null));

    /* renamed from: e */
    private final C41217g f89919e;

    /* renamed from: f */
    private final C41217g f89920f;

    /* renamed from: g */
    private C28628b0 f89921g;

    /* renamed from: nb1.j$a */
    public static final class C37397a {
        private C37397a() {
        }

        public /* synthetic */ C37397a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37396j mo90486a() {
            return new C37396j();
        }
    }

    /* renamed from: nb1.j$b */
    public static final class C37398b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C37396j f89922d;

        public C37398b(C37396j jVar) {
            this.f89922d = jVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f89922d.m110208M1().mo90507H5().mo90517Ub(new AddressElementUiModel(this.f89922d.m110204I1().f72663h.getInputText(), ""), C37119a.ADDRESS_LINE);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: nb1.j$c */
    /* synthetic */ class C37399c extends C41535k implements C43075l {
        C37399c(Object obj) {
            super(1, obj, C37396j.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo90490b(boolean z) {
            ((C37396j) this.receiver).m110217V1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90490b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$d */
    /* synthetic */ class C37400d extends C41535k implements C43075l {
        C37400d(Object obj) {
            super(1, obj, C37396j.class, "handleError", "handleError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo90491b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C37396j) this.receiver).m110209N1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90491b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$e */
    static final class C37401e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37396j f89923d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37401e(C37396j jVar) {
            super(1);
            this.f89923d = jVar;
        }

        /* renamed from: a */
        public final void mo90492a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f89923d.m110206K1().mo89144Rc().mo89267j().mo72877d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90492a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$f */
    /* synthetic */ class C37402f extends C41535k implements C43075l {
        C37402f(Object obj) {
            super(1, obj, C37396j.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo90493b(boolean z) {
            ((C37396j) this.receiver).m110217V1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90493b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$g */
    /* synthetic */ class C37403g extends C41535k implements C43075l {
        C37403g(Object obj) {
            super(1, obj, C37396j.class, "openCitiesActionSheet", "openCitiesActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo90494b(List list) {
            C41536l.m120489i(list, "p0");
            ((C37396j) this.receiver).m110211P1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90494b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$h */
    /* synthetic */ class C37404h extends C41535k implements C43075l {
        C37404h(Object obj) {
            super(1, obj, C37396j.class, "handleError", "handleError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo90495b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C37396j) this.receiver).m110209N1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90495b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$i */
    /* synthetic */ class C37405i extends C41535k implements C43075l {
        C37405i(Object obj) {
            super(1, obj, C37396j.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo90496b(boolean z) {
            ((C37396j) this.receiver).m110217V1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90496b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$j */
    /* synthetic */ class C37406j extends C41535k implements C43075l {
        C37406j(Object obj) {
            super(1, obj, C37396j.class, "openCountriesActionSheet", "openCountriesActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo90497b(List list) {
            C41536l.m120489i(list, "p0");
            ((C37396j) this.receiver).m110212Q1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90497b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$k */
    /* synthetic */ class C37407k extends C41535k implements C43075l {
        C37407k(Object obj) {
            super(1, obj, C37396j.class, "handleError", "handleError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo90498b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C37396j) this.receiver).m110209N1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90498b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$l */
    /* synthetic */ class C37408l extends C41535k implements C43075l {
        C37408l(Object obj) {
            super(1, obj, C37396j.class, "setLoading", "setLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo90499b(boolean z) {
            ((C37396j) this.receiver).m110217V1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90499b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$m */
    /* synthetic */ class C37409m extends C41535k implements C43075l {
        C37409m(Object obj) {
            super(1, obj, C37396j.class, "setLegalAddress", "setLegalAddress(Lge/bog/sso_client/onboarding/model/LegalAddressUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo90500b(LegalAddressUiModel legalAddressUiModel) {
            C41536l.m120489i(legalAddressUiModel, "p0");
            ((C37396j) this.receiver).m110216U1(legalAddressUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90500b((LegalAddressUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$n */
    /* synthetic */ class C37410n extends C41535k implements C43075l {
        C37410n(Object obj) {
            super(1, obj, C37396j.class, "handleInitialError", "handleInitialError(Lge/bog/sso_client/models/Result$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo90501b(C35947l.C35949b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C37396j) this.receiver).m110210O1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90501b((C35947l.C35949b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nb1.j$o */
    /* synthetic */ class C37411o extends C41545u {

        /* renamed from: e */
        public static final C37411o f89924e = new C37411o();

        C37411o() {
            super(AddressElementUiModel.class, "description", "getDescription()Ljava/lang/String;", 0);
        }

        public Object get(Object obj) {
            return ((AddressElementUiModel) obj).mo88603a();
        }
    }

    /* renamed from: nb1.j$p */
    public static final class C37412p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f89925d;

        /* renamed from: e */
        final /* synthetic */ C41806a f89926e;

        /* renamed from: f */
        final /* synthetic */ C43064a f89927f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37412p(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f89925d = componentCallbacks;
            this.f89926e = aVar;
            this.f89927f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f89925d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f89926e, this.f89927f);
        }
    }

    /* renamed from: nb1.j$q */
    public static final class C37413q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f89928d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37413q(Fragment fragment) {
            super(0);
            this.f89928d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f89928d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f89928d.requireActivity());
        }
    }

    /* renamed from: nb1.j$r */
    public static final class C37414r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f89929d;

        /* renamed from: e */
        final /* synthetic */ C41806a f89930e;

        /* renamed from: f */
        final /* synthetic */ C43064a f89931f;

        /* renamed from: g */
        final /* synthetic */ C43064a f89932g;

        /* renamed from: h */
        final /* synthetic */ C43064a f89933h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37414r(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f89929d = fragment;
            this.f89930e = aVar;
            this.f89931f = aVar2;
            this.f89932g = aVar3;
            this.f89933h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f89929d, this.f89930e, this.f89931f, this.f89932g, C41520a0.m120436b(C36382c1.class), this.f89933h);
        }
    }

    /* renamed from: nb1.j$s */
    public static final class C37415s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f89934d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37415s(Fragment fragment) {
            super(0);
            this.f89934d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f89934d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: nb1.j$t */
    public static final class C37416t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f89935d;

        /* renamed from: e */
        final /* synthetic */ C41806a f89936e;

        /* renamed from: f */
        final /* synthetic */ C43064a f89937f;

        /* renamed from: g */
        final /* synthetic */ C43064a f89938g;

        /* renamed from: h */
        final /* synthetic */ C43064a f89939h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37416t(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f89935d = fragment;
            this.f89936e = aVar;
            this.f89937f = aVar2;
            this.f89938g = aVar3;
            this.f89939h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f89935d, this.f89936e, this.f89937f, this.f89938g, C41520a0.m120436b(C37417k.C37420c.class), this.f89939h);
        }
    }

    public C37396j() {
        C37413q qVar = new C37413q(this);
        C41222k kVar = C41222k.NONE;
        this.f89919e = C41219i.m119469a(kVar, new C37414r(this, (C41806a) null, (C43064a) null, qVar, (C43064a) null));
        this.f89920f = C41219i.m119469a(kVar, new C37416t(this, (C41806a) null, (C43064a) null, new C37415s(this), (C43064a) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m110196A1(C37396j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C1505h activity = jVar.getActivity();
        if (activity != null) {
            C41536l.m120488h(view, "it");
            C10145d.m37091e(activity, view);
        }
        jVar.m110208M1().mo90507H5().mo90519i7();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m110197B1(C37396j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C1505h activity = jVar.getActivity();
        if (activity != null) {
            C41536l.m120488h(view, "it");
            C10145d.m37091e(activity, view);
        }
        jVar.m110208M1().mo90507H5().mo90520nc();
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m110198C1(C37396j jVar, String str, Bundle bundle) {
        C41536l.m120489i(jVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "b");
        AddressElementUiModel addressElementUiModel = (AddressElementUiModel) bundle.getParcelable("SELECTOR_RESULT_KEY");
        if (addressElementUiModel != null) {
            jVar.m110208M1().mo90507H5().mo90517Ub(addressElementUiModel, C37119a.COUNTRY);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m110199D1(C37396j jVar, String str, Bundle bundle) {
        C41536l.m120489i(jVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "b");
        AddressElementUiModel addressElementUiModel = (AddressElementUiModel) bundle.getParcelable("SELECTOR_RESULT_KEY");
        if (addressElementUiModel != null) {
            jVar.m110208M1().mo90507H5().mo90517Ub(addressElementUiModel, C37119a.REGION);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m110200E1(C37396j jVar, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(jVar, "this$0");
        jVar.m110204I1().f72663h.getTextInput().clearFocus();
        C1505h activity = jVar.getActivity();
        if (activity != null) {
            C41536l.m120488h(compoundButton, "v");
            C10145d.m37091e(activity, compoundButton);
        }
        jVar.m110208M1().mo90507H5().mo90515Lb(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m110201F1(C37396j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        jVar.m110208M1().mo90507H5().mo90518Ya();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m110202G1(C37396j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        jVar.m110208M1().mo90507H5().mo90516Ql();
        jVar.m110204I1().f72675t.setVisibility(8);
    }

    /* renamed from: H1 */
    private final void m110203H1() {
        C37417k.C37434d I3 = m110208M1().mo90508I3();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C32392v.m95653e(I3.mo90522Fm(), viewLifecycleOwner, new C37403g(this), new C37402f(this), new C37404h(this));
        C32392v.m95653e(I3.mo90523Tk(), viewLifecycleOwner, new C37406j(this), new C37405i(this), new C37407k(this));
        C32392v.m95653e(I3.mo90524d3(), viewLifecycleOwner, new C37409m(this), new C37408l(this), new C37410n(this));
        C32392v.m95653e(I3.mo90531ve(), viewLifecycleOwner, new C37401e(this), new C37399c(this), new C37400d(this));
        I3.mo90521Fc().mo4819k(viewLifecycleOwner, new C37394h(this));
        I3.mo90532zi().mo4819k(viewLifecycleOwner, new C37395i(m110204I1().f72677v));
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final C28628b0 m110204I1() {
        C28628b0 b0Var = this.f89921g;
        C41536l.m120486f(b0Var);
        return b0Var;
    }

    /* renamed from: J1 */
    private final C10146d0.C10172e m110205J1() {
        return (C10146d0.C10172e) this.f89918d.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public final C36382c1 m110206K1() {
        return (C36382c1) this.f89919e.getValue();
    }

    /* renamed from: L1 */
    private final String m110207L1(String str, int i) {
        return C10145d.m37090d(str, i, requireContext(), m110205J1());
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final C37417k m110208M1() {
        return (C37417k) this.f89920f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m110209N1(C35947l.C35949b bVar) {
        m110206K1().mo89172ky(bVar.mo88517a().getMessage());
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public final void m110210O1(C35947l.C35949b bVar) {
        LinearLayoutCompat linearLayoutCompat;
        m110209N1(bVar);
        C28628b0 b0Var = this.f89921g;
        if (b0Var != null) {
            linearLayoutCompat = b0Var.f72675t;
        } else {
            linearLayoutCompat = null;
        }
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public final void m110211P1(List list) {
        m110213R1(m110207L1("text.do.address.page.city", C10220y.address_city), list, "REQUEST_KEY_CITY_SELECTOR ");
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final void m110212Q1(List list) {
        m110213R1(m110207L1("text.do.address.page.country", C10220y.address_country), list, "REQUEST_KEY_COUNTRY_SELECTOR ");
    }

    /* renamed from: R1 */
    private final void m110213R1(String str, List list, String str2) {
        C26172b a = C26172b.f66375F.mo65208a(str2, C37411o.f89924e);
        a.mo4576A1(getChildFragmentManager(), (String) null);
        a.mo26370a2(str);
        a.mo65207l2(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public final void m110214S1(C37417k.C37418a aVar) {
        boolean z;
        AddressUiModel c = aVar.mo90510c();
        m110215T1(aVar.mo90511d());
        C28628b0 I1 = m110204I1();
        I1.f72666k.getTextInput().setText(c.mo88617e().mo88603a());
        I1.f72665j.getTextInput().setText(c.mo88619f().mo88603a());
        I1.f72663h.setInputText(c.mo88615d());
        Input input = I1.f72665j;
        boolean z2 = true;
        if (c.mo88617e().mo88604b().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || aVar.mo90511d()) {
            z2 = false;
        }
        input.setEnabled(z2);
    }

    /* renamed from: T1 */
    private final void m110215T1(boolean z) {
        int[] referencedIds = m110204I1().f72670o.getReferencedIds();
        C41536l.m120488h(referencedIds, "binding.formInputs.referencedIds");
        for (int findViewById : referencedIds) {
            View findViewById2 = m110204I1().mo3946b().findViewById(findViewById);
            if (findViewById2 != null) {
                findViewById2.setEnabled(!z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m110216U1(LegalAddressUiModel legalAddressUiModel) {
        int i;
        AddressUiModel a = legalAddressUiModel.mo88645a();
        if (a != null) {
            InlineFeedback inlineFeedback = m110204I1().f72662g;
            inlineFeedback.setTitleText(a.mo88617e().mo88603a() + ", " + a.mo88619f().mo88603a() + ", " + a.mo88615d());
            m110204I1().f72676u.setChecked(true);
        }
        Group group = m110204I1().f72671p;
        if (a != null) {
            i = 0;
        } else {
            i = 8;
        }
        group.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public final void m110217V1(boolean z) {
        m110204I1().f72673r.setVisibility(z ? 0 : 8);
    }

    /* renamed from: W1 */
    private final void m110218W1() {
        C28628b0 I1 = m110204I1();
        I1.f72661f.setTitle(m110207L1("text.do.address.page.title", C10220y.authorization_details));
        I1.f72661f.setText(m110207L1("text.do.address.page.desc", C10220y.address_please_specify));
        I1.f72672q.setText(m110207L1("text.do.address.page.legal.address.title", C10220y.legal_address));
        I1.f72660e.setText(m110207L1("text.do.address.page.actual.address.title", C10220y.actual_address));
        I1.f72676u.setText(m110207L1("text.do.address.page.actual.address.same", C10220y.address_same_as_legal));
        I1.f72666k.setHintText((CharSequence) m110207L1("text.do.address.page.country", C10220y.address_country));
        I1.f72665j.setHintText((CharSequence) m110207L1("text.do.address.page.city", C10220y.address_city));
        I1.f72663h.setHintText((CharSequence) m110207L1("text.do.address.page.address", C10220y.f28398r0));
        I1.f72677v.setButtonText(m110207L1("text.do.address.page.button", C10220y.save_address));
    }

    /* renamed from: z1 */
    private final void m110236z1() {
        m110204I1().f72666k.setOnClickListener(new C37387a(this));
        m110204I1().f72665j.setOnClickListener(new C37388b(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_COUNTRY_SELECTOR ", getViewLifecycleOwner(), new C37389c(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_CITY_SELECTOR ", getViewLifecycleOwner(), new C37390d(this));
        m110204I1().f72663h.getTextInput().addTextChangedListener(new C37398b(this));
        m110204I1().f72676u.setOnCheckedChangeListener(new C37391e(this));
        m110204I1().f72677v.setOnClickListener(new C37392f(this));
        m110204I1().f72674s.setOnClickListener(new C37393g(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f89921g = C28628b0.m87609d(layoutInflater);
        m110218W1();
        m110206K1().mo89180nx();
        ScrollView c = m110204I1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f89921g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m110203H1();
        m110236z1();
        m110208M1().mo90507H5().mo90516Ql();
    }
}
