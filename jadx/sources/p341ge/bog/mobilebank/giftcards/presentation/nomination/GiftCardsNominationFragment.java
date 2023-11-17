package p341ge.bog.mobilebank.giftcards.presentation.nomination;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C1152f3;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.flexbox.FlexboxLayout;
import f51.C31925a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import oh0.C27008c;
import oh0.C27010e;
import oh0.C27013h;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.bigchips.BigChips;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.giftcards.presentation.nomination.C24295a;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.shared2.network.models.BffApiError;
import th0.C28416o;
import ue1.C43064a;
import ue1.C43075l;
import yi0.C30067a;
import yi0.C30068b;
import yi0.C30069c;
import yi0.C30071e;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment */
public final class GiftCardsNominationFragment extends C24298c {

    /* renamed from: j */
    public static final C24274a f62766j = new C24274a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C28416o f62767g;

    /* renamed from: h */
    private final C41217g f62768h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f62769i;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$a */
    public static final class C24274a {
        private C24274a() {
        }

        public /* synthetic */ C24274a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$b */
    public static final class C24275b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ GiftCardsNominationFragment f62770d;

        public C24275b(GiftCardsNominationFragment giftCardsNominationFragment) {
            this.f62770d = giftCardsNominationFragment;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            if (!this.f62770d.f62769i) {
                C24295a tw = this.f62770d.m78149v1().mo61967tw();
                if (editable != null) {
                    str = editable.toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                C24295a.C24296a.m78194a(tw, str, false, 2, (Object) null);
            }
            this.f62770d.f62769i = false;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$c */
    static final class C24276c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsNominationFragment f62771d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$c$a */
        static final class C24277a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GiftCardsNominationFragment f62772d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24277a(GiftCardsNominationFragment giftCardsNominationFragment) {
                super(1);
                this.f62772d = giftCardsNominationFragment;
            }

            /* renamed from: a */
            public final void mo61955a(List list) {
                C41536l.m120489i(list, "templates");
                FlexboxLayout unused = this.f62772d.m78147t1(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61955a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$c$b */
        static final class C24278b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GiftCardsNominationFragment f62773d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24278b(GiftCardsNominationFragment giftCardsNominationFragment) {
                super(1);
                this.f62773d = giftCardsNominationFragment;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                GiftCardsNominationFragment.m78135C1(this.f62773d, false, (String) null, false, 6, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24276c(GiftCardsNominationFragment giftCardsNominationFragment) {
            super(1);
            this.f62771d = giftCardsNominationFragment;
        }

        /* renamed from: a */
        public final void mo61954a(C31128a aVar) {
            int i;
            ShimmerFrameLayout c = this.f62771d.m78148u1().f72157j.mo3946b();
            C41536l.m120488h(c, "binding.templatesSkeleton.root");
            if (aVar instanceof C31128a.C31130b) {
                i = 0;
            } else {
                i = 8;
            }
            c.setVisibility(i);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C24277a(this.f62771d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C24278b(this.f62771d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61954a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$d */
    static final class C24279d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsNominationFragment f62774d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24279d(GiftCardsNominationFragment giftCardsNominationFragment) {
            super(1);
            this.f62774d = giftCardsNominationFragment;
        }

        /* renamed from: a */
        public final void mo61957a(C31128a aVar) {
            String str;
            this.f62774d.m78148u1().f72153f.getButton().setLoading(aVar instanceof C31128a.C31130b);
            if (aVar instanceof C31128a.C31129a) {
                Throwable c = ((C31128a.C31129a) aVar).mo71342c();
                if (c instanceof BffApiError) {
                    this.f62774d.m78148u1().f72152e.mo35920c();
                    Input input = this.f62774d.m78148u1().f72152e;
                    String b = ((BffApiError) c).mo84716b();
                    if (b != null) {
                        str = C32343x.m95388F(b, new Object[0]);
                    } else {
                        str = null;
                    }
                    input.setInfoText(str);
                    return;
                }
                this.f62774d.handleError(c);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61957a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$e */
    /* synthetic */ class C24280e extends C41535k implements C43075l {
        C24280e(Object obj) {
            super(1, obj, GiftCardsNominationFragment.class, "handleNominationInput", "handleNominationInput(Lge/bog/mobilebank/giftcards/presentation/nomination/GiftCardsNominationInputModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo61958b(C30071e eVar) {
            C41536l.m120489i(eVar, "p0");
            ((GiftCardsNominationFragment) this.receiver).m78150x1(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61958b((C30071e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$f */
    static final class C24281f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsNominationFragment f62775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24281f(GiftCardsNominationFragment giftCardsNominationFragment) {
            super(1);
            this.f62775d = giftCardsNominationFragment;
        }

        /* renamed from: a */
        public final void mo61959a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C8034d.m30522a(this.f62775d).mo22117L(C27010e.action_giftCardNominationFragment_to_giftCardsPurchaseFragment);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61959a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$g */
    static final class C24282g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62776a;

        C24282g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62776a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62776a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62776a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$h */
    public static final class C24283h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62777d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24283h(Fragment fragment) {
            super(0);
            this.f62777d = fragment;
        }

        public final Fragment invoke() {
            return this.f62777d;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$i */
    public static final class C24284i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62778d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24284i(C43064a aVar) {
            super(0);
            this.f62778d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62778d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$j */
    public static final class C24285j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62779d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24285j(C41217g gVar) {
            super(0);
            this.f62779d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62779d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$k */
    public static final class C24286k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62780d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62781e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24286k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62780d = aVar;
            this.f62781e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62780d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62781e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment$l */
    public static final class C24287l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62782d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62783e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24287l(Fragment fragment, C41217g gVar) {
            super(0);
            this.f62782d = fragment;
            this.f62783e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f62783e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f62782d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public GiftCardsNominationFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24284i(new C24283h(this)));
        this.f62768h = C1514j0.m5374c(this, C41520a0.m120436b(GiftCardsNominationViewModel$ViewModel.class), new C24285j(a), new C24286k((C43064a) null, a), new C24287l(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m78133A1(GiftCardsNominationFragment giftCardsNominationFragment, View view) {
        C41536l.m120489i(giftCardsNominationFragment, "this$0");
        giftCardsNominationFragment.m78149v1().mo61967tw().mo61962F9();
    }

    /* renamed from: B1 */
    private final void m78134B1(boolean z, String str, boolean z2) {
        boolean z3;
        C28416o u1 = m78148u1();
        FlexboxLayout flexboxLayout = u1.f72155h;
        C41536l.m120488h(flexboxLayout, "templatesContainer");
        if (flexboxLayout.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 != z || z2) {
            FlexboxLayout flexboxLayout2 = u1.f72155h;
            C41536l.m120488h(flexboxLayout2, "templatesContainer");
            for (View view : C1152f3.m4215b(flexboxLayout2)) {
                C41536l.m120487g(view, "null cannot be cast to non-null type ge.bog.designsystem.components.bigchips.BigChips");
                BigChips bigChips = (BigChips) view;
                bigChips.setActive(C41536l.m120484d(bigChips.getTag(), str));
            }
        }
        FlexboxLayout flexboxLayout3 = u1.f72155h;
        C41536l.m120488h(flexboxLayout3, "templatesContainer");
        C32343x.m95483r1(flexboxLayout3, z, false, 2, (Object) null);
        TextView textView = u1.f72156i;
        C41536l.m120488h(textView, "templatesHint");
        C32343x.m95483r1(textView, z, false, 2, (Object) null);
    }

    /* renamed from: C1 */
    static /* synthetic */ void m78135C1(GiftCardsNominationFragment giftCardsNominationFragment, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        giftCardsNominationFragment.m78134B1(z, str, z2);
    }

    private final void observeData() {
        GiftCardsNominationViewModel$ViewModel v1 = m78149v1();
        v1.mo61964jn().mo4819k(getViewLifecycleOwner(), new C24282g(new C24276c(this)));
        v1.mo61966sw().mo4819k(getViewLifecycleOwner(), new C24282g(new C24279d(this)));
        v1.mo61968uw().mo4819k(getViewLifecycleOwner(), new C24282g(new C24280e(this)));
        LiveData vw = v1.mo61969vw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(vw, viewLifecycleOwner, new C24281f(this));
    }

    /* renamed from: r1 */
    private final View m78145r1(StringSource stringSource) {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        BigChips bigChips = new BigChips(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        int dimensionPixelSize = bigChips.getResources().getDimensionPixelSize(C27008c.f67784a);
        bigChips.setTitle(C31925a.m94279b(C34646b.m101752f(stringSource, (Context) null, 1, (Object) null)));
        bigChips.setTag(C34646b.m101752f(stringSource, (Context) null, 1, (Object) null));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(0, 0, dimensionPixelSize, 0);
        bigChips.setLayoutParams(marginLayoutParams);
        bigChips.setOnClickListener(new C30069c(this, stringSource));
        return bigChips;
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m78146s1(GiftCardsNominationFragment giftCardsNominationFragment, StringSource stringSource, View view) {
        C41536l.m120489i(giftCardsNominationFragment, "this$0");
        C41536l.m120489i(stringSource, "$templateText");
        giftCardsNominationFragment.m78149v1().mo61967tw().mo61963Jj(C34646b.m101752f(stringSource, (Context) null, 1, (Object) null), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final FlexboxLayout m78147t1(List list) {
        FlexboxLayout flexboxLayout = m78148u1().f72155h;
        flexboxLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            flexboxLayout.addView(m78145r1((StringSource) it.next()));
        }
        C41536l.m120488h(flexboxLayout, "with(binding) {\n        …        }\n        }\n    }");
        return flexboxLayout;
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final C28416o m78148u1() {
        C28416o oVar = this.f62767g;
        C41536l.m120486f(oVar);
        return oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final GiftCardsNominationViewModel$ViewModel m78149v1() {
        return (GiftCardsNominationViewModel$ViewModel) this.f62768h.getValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r1 != false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m78150x1(yi0.C30071e r7) {
        /*
            r6 = this;
            th0.o r0 = r6.m78148u1()
            boolean r1 = r7.mo70343a()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001b
            java.lang.String r1 = r7.mo70344b()
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0018
            r1 = r3
            goto L_0x0019
        L_0x0018:
            r1 = r2
        L_0x0019:
            if (r1 == 0) goto L_0x0025
        L_0x001b:
            com.google.android.flexbox.FlexboxLayout r1 = r0.f72155h
            int r1 = r1.getChildCount()
            if (r1 <= 0) goto L_0x0025
            r1 = r3
            goto L_0x0026
        L_0x0025:
            r1 = r2
        L_0x0026:
            java.lang.String r4 = r7.mo70344b()
            boolean r5 = r7.mo70343a()
            r6.m78134B1(r1, r4, r5)
            ge.bog.designsystem.components.input.Input r1 = r0.f72152e
            r4 = 0
            r1.setInfoText(r4)
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r1 = r0.f72153f
            ge.bog.designsystem.components.buttons.Button r1 = r1.getButton()
            java.lang.String r4 = r7.mo70344b()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0048
            r2 = r3
        L_0x0048:
            r1.setEnabled(r2)
            ge.bog.designsystem.components.input.Input r1 = r0.f72152e
            java.lang.String r1 = r1.getInputText()
            java.lang.String r2 = r7.mo70344b()
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r2)
            if (r1 != 0) goto L_0x0077
            r6.f62769i = r3
            java.lang.String r7 = r7.mo70344b()
            java.lang.String r7 = f51.C31925a.m94279b(r7)
            ge.bog.designsystem.components.input.Input r1 = r0.f72152e
            r1.setInputText(r7)
            ge.bog.designsystem.components.input.Input r0 = r0.f72152e
            android.widget.EditText r0 = r0.getTextInput()
            int r7 = r7.length()
            r0.setSelection(r7)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment.m78150x1(yi0.e):void");
    }

    /* renamed from: y1 */
    private final TextWatcher m78151y1() {
        C28416o u1 = m78148u1();
        u1.f72154g.setImage(new Image.Animation.Raw(C27013h.gift_card_animation, (Image.Animation.AnimationConfig) null, 2, (DefaultConstructorMarker) null));
        u1.f72154g.setTitle(C32343x.m95388F("giftcard.application.note.page.text", new Object[0]));
        u1.f72154g.setText(C32343x.m95388F("giftcard.application.note.page.description", new Object[0]));
        u1.f72152e.setHintText((CharSequence) C32343x.m95388F("giftcard.application.note.page.text.label", new Object[0]));
        u1.f72156i.setText(C32343x.m95388F("giftcard.application.note.page.use.template.text", new Object[0]));
        u1.f72153f.getButton().setButtonText(C32343x.m95388F("giftcard.application.note.page.next.button", new Object[0]));
        u1.f72153f.getAdditionalButton().setButtonText(C32343x.m95388F("giftcard.application.note.page.skip.button", new Object[0]));
        u1.f72152e.getTextInput().setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(150)});
        u1.f72153f.getButton().setOnClickListener(new C30067a(this));
        u1.f72153f.getAdditionalButton().setOnClickListener(new C30068b(this));
        EditText textInput = u1.f72152e.getTextInput();
        C24275b bVar = new C24275b(this);
        textInput.addTextChangedListener(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m78152z1(GiftCardsNominationFragment giftCardsNominationFragment, View view) {
        C41536l.m120489i(giftCardsNominationFragment, "this$0");
        giftCardsNominationFragment.m78149v1().mo61967tw().mo61965r();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f62767g = C28416o.m87186d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m78148u1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f62767g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("text.discovery.page.tab.giftcard", new Object[0]));
        m78151y1();
        observeData();
    }
}
