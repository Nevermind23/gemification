package p341ge.bog.mobilebank.giftcards.presentation.chooseamount;

import ai0.C19249b;
import ai0.C19250c;
import ai0.C19251d;
import ai0.C19252e;
import ai0.C19253f;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import bi0.C19387b;
import ci0.C19757a;
import ci0.C19758b;
import ci0.C19759c;
import ci0.C19760d;
import ci0.C19761e;
import com.bumptech.glide.C2394j;
import com.github.mikephil.charting.utils.Utils;
import ee1.C40767b;
import g91.C32303f;
import g91.C32319m;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import hi0.C25028a;
import hj0.C25033a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj0.C26039b;
import lj0.C26041d;
import m41.C37224b;
import p035c4.C2247a;
import p163m0.C7047a;
import p192o3.C7423a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.input.Input;
import p547oi.C17199a;
import p547oi.C17201b;
import p629uh.C18167d;
import th0.C28408k;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment */
public final class GiftCardsChooseAmountFragment extends C24107a {

    /* renamed from: g */
    private C28408k f62437g;

    /* renamed from: h */
    private final C41217g f62438h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List f62439i = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List f62440j = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public TextWatcher f62441k;

    /* renamed from: l */
    private final C41217g f62442l = C41219i.m119470b(new C24074a(this));

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$a */
    static final class C24074a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAmountFragment f62443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24074a(GiftCardsChooseAmountFragment giftCardsChooseAmountFragment) {
            super(0);
            this.f62443d = giftCardsChooseAmountFragment;
        }

        /* renamed from: b */
        public final C25033a invoke() {
            SensorManager sensorManager;
            Object systemService = this.f62443d.requireContext().getSystemService("sensor");
            if (systemService instanceof SensorManager) {
                sensorManager = (SensorManager) systemService;
            } else {
                sensorManager = null;
            }
            return new C25033a(sensorManager, this.f62443d.m77635D1().f72087p, (C40767b) null, 4, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$b */
    static final class C24075b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24075b f62444d = new C24075b();

        C24075b() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setupAnimation");
            C2247a g = jVar.mo7228g(C7423a.f21686a);
            C41536l.m120488h(g, "diskCacheStrategy(DiskCacheStrategy.ALL)");
            return (C2394j) g;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$c */
    static final class C24076c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62445a;

        C24076c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62445a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62445a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62445a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$d */
    static final class C24077d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C28408k f62446d;

        /* renamed from: e */
        final /* synthetic */ GiftCardsChooseAmountFragment f62447e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24077d(C28408k kVar, GiftCardsChooseAmountFragment giftCardsChooseAmountFragment) {
            super(0);
            this.f62446d = kVar;
            this.f62447e = giftCardsChooseAmountFragment;
        }

        public final void invoke() {
            EditText textInput = this.f62446d.f72089r.getTextInput();
            TextWatcher s1 = this.f62447e.f62441k;
            if (s1 == null) {
                C41536l.m120506z("giftCardInputTextWatcher");
                s1 = null;
            }
            textInput.removeTextChangedListener(s1);
            C8034d.m30522a(this.f62447e).mo22123U();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$e */
    public static final class C24078e implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAmountFragment f62448d;

        /* renamed from: e */
        final /* synthetic */ C28408k f62449e;

        public C24078e(GiftCardsChooseAmountFragment giftCardsChooseAmountFragment, C28408k kVar) {
            this.f62448d = giftCardsChooseAmountFragment;
            this.f62449e = kVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f62448d.m77637F1().mo61677xw(String.valueOf(editable));
            int i = 0;
            for (Object next : this.f62448d.f62439i) {
                int i2 = i + 1;
                if (i < 0) {
                    C41341q.m119917t();
                }
                Chip chip = (Chip) next;
                GiftCardsChooseAmountFragment giftCardsChooseAmountFragment = this.f62448d;
                ChipGroup chipGroup = this.f62449e.f72078g;
                C41536l.m120488h(chipGroup, "amountsChipGroupFlexStart");
                giftCardsChooseAmountFragment.m77633B1(chipGroup, i, false);
                i = i2;
            }
            int i3 = 0;
            for (Object next2 : this.f62448d.f62440j) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C41341q.m119917t();
                }
                Chip chip2 = (Chip) next2;
                GiftCardsChooseAmountFragment giftCardsChooseAmountFragment2 = this.f62448d;
                ChipGroup chipGroup2 = this.f62449e.f72077f;
                C41536l.m120488h(chipGroup2, "amountsChipGroupFlexMiddle");
                giftCardsChooseAmountFragment2.m77633B1(chipGroup2, i3, false);
                i3 = i4;
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$f */
    /* synthetic */ class C24079f extends C41535k implements C43075l {
        C24079f(Object obj) {
            super(1, obj, GiftCardsChooseAmountFragment.class, "handleAmountInputInfoText", "handleAmountInputInfoText(Lge/bog/mobilebank/giftcards/presentation/chooseamount/state/AmountInputInfoText;)V", 0);
        }

        /* renamed from: b */
        public final void mo61659b(C19759c cVar) {
            ((GiftCardsChooseAmountFragment) this.receiver).m77640I1(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61659b((C19759c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$g */
    /* synthetic */ class C24080g extends C41535k implements C43075l {
        C24080g(Object obj) {
            super(1, obj, GiftCardsChooseAmountFragment.class, "handleTimePickerInput", "handleTimePickerInput(Lge/bog/mobilebank/giftcards/presentation/chooseamount/state/TimePickerInputState;)V", 0);
        }

        /* renamed from: b */
        public final void mo61660b(C19761e eVar) {
            C41536l.m120489i(eVar, "p0");
            ((GiftCardsChooseAmountFragment) this.receiver).m77643L1(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61660b((C19761e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$h */
    /* synthetic */ class C24081h extends C41535k implements C43075l {
        C24081h(Object obj) {
            super(1, obj, GiftCardsChooseAmountFragment.class, "handleAmountInputState", "handleAmountInputState(Lge/bog/mobilebank/giftcards/presentation/chooseamount/state/ChooseAmountInputState;)V", 0);
        }

        /* renamed from: b */
        public final void mo61661b(C19760d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((GiftCardsChooseAmountFragment) this.receiver).m77641J1(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61661b((C19760d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$i */
    /* synthetic */ class C24082i extends C41535k implements C43075l {
        C24082i(Object obj) {
            super(1, obj, GiftCardsChooseAmountFragment.class, "handleAmountInputErrorState", "handleAmountInputErrorState(Lge/bog/mobilebank/giftcards/presentation/chooseamount/state/AmountInputErrorState;)V", 0);
        }

        /* renamed from: b */
        public final void mo61662b(C19758b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((GiftCardsChooseAmountFragment) this.receiver).m77639H1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61662b((C19758b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$j */
    /* synthetic */ class C24083j extends C41535k implements C43075l {
        C24083j(Object obj) {
            super(1, obj, GiftCardsChooseAmountFragment.class, "fillChips", "fillChips(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo61663b(List list) {
            C41536l.m120489i(list, "p0");
            ((GiftCardsChooseAmountFragment) this.receiver).m77634C1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61663b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$k */
    /* synthetic */ class C24084k extends C41535k implements C43075l {
        C24084k(Object obj) {
            super(1, obj, GiftCardsChooseAmountFragment.class, "handleAnimationWithImage", "handleAnimationWithImage(Lge/bog/mobilebank/giftcards/presentation/chooseanimation/model/AnimationUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo61664b(C25028a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((GiftCardsChooseAmountFragment) this.receiver).m77642K1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61664b((C25028a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$l */
    /* synthetic */ class C24085l extends C41535k implements C43075l {
        C24085l(Object obj) {
            super(1, obj, GiftCardsChooseAmountFragment.class, "handleAdditionalTextVisibility", "handleAdditionalTextVisibility(Lge/bog/mobilebank/giftcards/presentation/chooseamount/state/AdditionalInfoTextState;)V", 0);
        }

        /* renamed from: b */
        public final void mo61665b(C19757a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((GiftCardsChooseAmountFragment) this.receiver).m77638G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61665b((C19757a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$m */
    static final class C24086m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAmountFragment f62450d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24086m(GiftCardsChooseAmountFragment giftCardsChooseAmountFragment) {
            super(1);
            this.f62450d = giftCardsChooseAmountFragment;
        }

        /* renamed from: a */
        public final void mo61666a(C19387b bVar) {
            C41536l.m120489i(bVar, "event");
            FragmentManager childFragmentManager = this.f62450d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            bVar.mo47605a(childFragmentManager, C8034d.m30522a(this.f62450d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61666a((C19387b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$n */
    public static final class C24087n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62451d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24087n(Fragment fragment) {
            super(0);
            this.f62451d = fragment;
        }

        public final Fragment invoke() {
            return this.f62451d;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$o */
    public static final class C24088o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62452d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24088o(C43064a aVar) {
            super(0);
            this.f62452d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62452d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$p */
    public static final class C24089p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24089p(C41217g gVar) {
            super(0);
            this.f62453d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62453d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$q */
    public static final class C24090q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62454d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62455e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24090q(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62454d = aVar;
            this.f62455e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62454d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62455e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$r */
    public static final class C24091r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62456d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62457e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24091r(Fragment fragment, C41217g gVar) {
            super(0);
            this.f62456d = fragment;
            this.f62457e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f62457e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f62456d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public GiftCardsChooseAmountFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24088o(new C24087n(this)));
        this.f62438h = C1514j0.m5374c(this, C41520a0.m120436b(GiftCardsChooseAmountViewModel$ViewModel.class), new C24089p(a), new C24090q((C43064a) null, a), new C24091r(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m77633B1(ChipGroup chipGroup, int i, boolean z) {
        boolean z2 = false;
        if (i >= 0 && i < chipGroup.getChipCount()) {
            z2 = true;
        }
        if (z2) {
            chipGroup.mo35185q(i, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final void m77634C1(List list) {
        ChipGroup chipGroup = m77635D1().f72078g;
        C41536l.m120488h(chipGroup, "binding.amountsChipGroupFlexStart");
        chipGroup.mo35190t();
        ArrayList<Chip> arrayList = new ArrayList<>(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle((String) it.next());
            chip.setChipType(C18167d.CHOICE_CHIP);
            arrayList.add(chip);
        }
        this.f62439i = arrayList;
        for (Chip o : arrayList) {
            chipGroup.mo35183o(o);
        }
        ChipGroup chipGroup2 = m77635D1().f72077f;
        C41536l.m120488h(chipGroup2, "binding.amountsChipGroupFlexMiddle");
        chipGroup2.mo35190t();
        ArrayList<Chip> arrayList2 = new ArrayList<>(C41343r.m119925u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Context requireContext2 = requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            Chip chip2 = new Chip(requireContext2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip2.setChipTitle((String) it2.next());
            chip2.setChipType(C18167d.CHOICE_CHIP);
            arrayList2.add(chip2);
        }
        this.f62440j = arrayList2;
        for (Chip o2 : arrayList2) {
            chipGroup2.mo35183o(o2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final C28408k m77635D1() {
        C28408k kVar = this.f62437g;
        C41536l.m120486f(kVar);
        return kVar;
    }

    /* renamed from: E1 */
    private final C25033a m77636E1() {
        return (C25033a) this.f62442l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final GiftCardsChooseAmountViewModel$ViewModel m77637F1() {
        return (GiftCardsChooseAmountViewModel$ViewModel) this.f62438h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public final void m77638G1(C19757a aVar) {
        int i;
        AppCompatTextView appCompatTextView = m77635D1().f72076e;
        C41536l.m120488h(appCompatTextView, "binding.additionalErrorInfoText");
        if (aVar.mo47957b()) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        m77635D1().f72076e.setText(C32343x.m95388F("giftcard.application.amount.page.choose.fix.amount", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final void m77639H1(C19758b bVar) {
        Input input = m77635D1().f72089r;
        if (bVar.mo47962b()) {
            input.mo35920c();
        } else {
            input.mo35919b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final void m77640I1(C19759c cVar) {
        if (cVar != null) {
            Input input = m77635D1().f72089r;
            Object[] objArr = new Object[2];
            String b = cVar.mo47967b();
            String str = "";
            if (b == null) {
                b = str;
            }
            objArr[0] = b;
            String a = cVar.mo47966a();
            if (a != null) {
                str = a;
            }
            objArr[1] = str;
            input.setInfoText(C32343x.m95388F("giftcard.application.amount.page.amount.limits.info", objArr));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m77641J1(C19760d dVar) {
        int i;
        int i2;
        EditText textInput = m77635D1().f72089r.getTextInput();
        Input input = m77635D1().f72089r;
        C41536l.m120488h(input, "binding.inputGiftCardAmount");
        int i3 = 0;
        if (dVar.mo47973d()) {
            i = 0;
        } else {
            i = 8;
        }
        input.setVisibility(i);
        ChipGroup chipGroup = m77635D1().f72078g;
        C41536l.m120488h(chipGroup, "binding.amountsChipGroupFlexStart");
        if (dVar.mo47973d()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        chipGroup.setVisibility(i2);
        ChipGroup chipGroup2 = m77635D1().f72077f;
        C41536l.m120488h(chipGroup2, "binding.amountsChipGroupFlexMiddle");
        if (!(!dVar.mo47973d())) {
            i3 = 8;
        }
        chipGroup2.setVisibility(i3);
        TextWatcher textWatcher = this.f62441k;
        TextWatcher textWatcher2 = null;
        if (textWatcher == null) {
            C41536l.m120506z("giftCardInputTextWatcher");
            textWatcher = null;
        }
        textInput.removeTextChangedListener(textWatcher);
        textInput.setText(dVar.mo47972c());
        textInput.setSelection(dVar.mo47972c().length());
        TextWatcher textWatcher3 = this.f62441k;
        if (textWatcher3 == null) {
            C41536l.m120506z("giftCardInputTextWatcher");
        } else {
            textWatcher2 = textWatcher3;
        }
        textInput.addTextChangedListener(textWatcher2);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [ge.bog.designsystem.components.common.Image] */
    /* JADX WARNING: type inference failed for: r12v2, types: [ge.bog.designsystem.components.common.Image$Url] */
    /* JADX WARNING: type inference failed for: r6v9, types: [ge.bog.designsystem.components.common.Image$Animation$Url] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: K1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m77642K1(hi0.C25028a r23) {
        /*
            r22 = this;
            th0.k r0 = r22.m77635D1()
            ge.bog.designsystem.components.gyroanimation.GyroAnimationView r1 = r0.f72087p
            java.lang.String r2 = "giftCardGyroAnimationView"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.util.List r2 = r23.mo63428b()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = r3
            goto L_0x001d
        L_0x001c:
            r2 = r4
        L_0x001d:
            r2 = r2 ^ r4
            r5 = 8
            if (r2 == 0) goto L_0x0024
            r2 = r3
            goto L_0x0025
        L_0x0024:
            r2 = r5
        L_0x0025:
            r1.setVisibility(r2)
            com.airbnb.lottie.LottieAnimationView r1 = r0.f72086o
            java.lang.String r2 = "giftCardAnimationView"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.util.List r6 = r23.mo63428b()
            if (r6 == 0) goto L_0x003e
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r6 = r3
            goto L_0x003f
        L_0x003e:
            r6 = r4
        L_0x003f:
            if (r6 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r3 = r5
        L_0x0043:
            r1.setVisibility(r3)
            java.util.List r1 = r23.mo63428b()
            if (r1 == 0) goto L_0x0053
            ge.bog.designsystem.components.gyroanimation.GyroAnimationView r3 = r0.f72087p
            ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment$b r5 = p341ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment.C24075b.f62444d
            r3.mo35781d(r1, r5)
        L_0x0053:
            java.lang.String r7 = r23.mo63429c()
            r1 = 2
            r3 = 0
            if (r7 == 0) goto L_0x0066
            ge.bog.designsystem.components.common.Image$Animation$Url r5 = new ge.bog.designsystem.components.common.Image$Animation$Url
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0084
        L_0x0066:
            ge.bog.designsystem.components.common.Image$Url r5 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r13 = r23.mo63434g()
            ge.bog.designsystem.components.common.Image$Resource r14 = new ge.bog.designsystem.components.common.Image$Resource
            int r6 = oh0.C27009d.f67791j
            r14.<init>(r6, r3, r1, r3)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 124(0x7c, float:1.74E-43)
            r21 = 0
            r12 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0084:
            com.airbnb.lottie.LottieAnimationView r6 = r0.f72086o
            kotlin.jvm.internal.C41536l.m120488h(r6, r2)
            p642vh.C18368l.m62746A(r6, r5, r3, r1, r3)
            androidx.appcompat.widget.AppCompatImageView r2 = r0.f72088q
            java.lang.String r5 = "giftCardImageView"
            kotlin.jvm.internal.C41536l.m120488h(r2, r5)
            java.lang.String r7 = r23.mo63435h()
            if (r7 == 0) goto L_0x00a9
            ge.bog.designsystem.components.common.Image$Url r5 = new ge.bog.designsystem.components.common.Image$Url
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 126(0x7e, float:1.77E-43)
            r15 = 0
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00aa
        L_0x00a9:
            r5 = r3
        L_0x00aa:
            p642vh.C18368l.m62746A(r2, r5, r3, r1, r3)
            android.widget.FrameLayout r0 = r0.f72084m
            java.lang.String r1 = "frameContainerGiftCard"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r1 = 0
            lj0.C26041d.m81682c(r0, r1, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment.m77642K1(hi0.a):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final void m77643L1(C19761e eVar) {
        int i;
        C41238w wVar;
        C28408k D1 = m77635D1();
        Input input = D1.f72094w;
        C41536l.m120488h(input, "timePickerInput");
        if (eVar.mo47982f()) {
            i = 0;
        } else {
            i = 8;
        }
        input.setVisibility(i);
        Long c = eVar.mo47978c();
        if (c != null) {
            long longValue = c.longValue();
            Input input2 = D1.f72094w;
            String b = C32319m.m95295b(longValue);
            C41536l.m120488h(b, "formatDate(date)");
            input2.setInputText(b);
            D1.f72094w.setInfoText(C32343x.m95388F(eVar.mo47979d(), new Object[0]));
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            D1.f72094w.setInfoText((CharSequence) null);
        }
        if (eVar.mo47980e()) {
            D1.f72094w.mo35920c();
        } else {
            D1.f72094w.mo35919b();
        }
    }

    /* renamed from: M1 */
    private final void m77644M1() {
        requireActivity().getOnBackPressedDispatcher().mo342c(getViewLifecycleOwner(), new C26039b(new C24077d(m77635D1(), this)));
    }

    /* renamed from: N1 */
    private final void m77645N1() {
        C28408k D1 = m77635D1();
        D1.f72080i.setOnClickListener(new C19249b(this, D1));
        D1.f72096y.setOnCheckedChangeListener(new C19250c(this));
        D1.f72078g.setOnChipActivatedChangedListener(new C19251d(this));
        D1.f72077f.setOnChipActivatedChangedListener(new C19252e(this));
        D1.f72094w.setOnClickListener(new C19253f(this));
        EditText textInput = D1.f72089r.getTextInput();
        C24078e eVar = new C24078e(this, D1);
        textInput.addTextChangedListener(eVar);
        this.f62441k = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m77646O1(GiftCardsChooseAmountFragment giftCardsChooseAmountFragment, C28408k kVar, View view) {
        C41536l.m120489i(giftCardsChooseAmountFragment, "this$0");
        C41536l.m120489i(kVar, "$this_with");
        giftCardsChooseAmountFragment.m77637F1().mo61679zw(kVar.f72096y.isChecked(), kVar.f72089r.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m77647P1(GiftCardsChooseAmountFragment giftCardsChooseAmountFragment, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(giftCardsChooseAmountFragment, "this$0");
        giftCardsChooseAmountFragment.m77637F1().mo61667Aw(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m77648Q1(GiftCardsChooseAmountFragment giftCardsChooseAmountFragment, Chip chip, int i) {
        C41536l.m120489i(giftCardsChooseAmountFragment, "this$0");
        C41536l.m120489i(chip, "chip");
        giftCardsChooseAmountFragment.m77637F1().mo61678yw(chip.getChipTitle(), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public static final void m77649R1(GiftCardsChooseAmountFragment giftCardsChooseAmountFragment, Chip chip, int i) {
        C41536l.m120489i(giftCardsChooseAmountFragment, "this$0");
        C41536l.m120489i(chip, "chip");
        giftCardsChooseAmountFragment.m77637F1().mo61678yw(chip.getChipTitle(), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m77650S1(GiftCardsChooseAmountFragment giftCardsChooseAmountFragment, View view) {
        C41536l.m120489i(giftCardsChooseAmountFragment, "this$0");
        giftCardsChooseAmountFragment.m77637F1().mo61668Bw();
    }

    /* renamed from: T1 */
    private final C28408k m77651T1() {
        GiftCardsChooseAmountViewModel$ViewModel F1 = m77637F1();
        C28408k D1 = m77635D1();
        F1.mo61671lw().mo4819k(getViewLifecycleOwner(), new C24076c(new C24079f(this)));
        F1.mo61676rw().mo4819k(getViewLifecycleOwner(), new C24076c(new C24080g(this)));
        F1.mo61672nw().mo4819k(getViewLifecycleOwner(), new C24076c(new C24081h(this)));
        F1.mo61670kw().mo4819k(getViewLifecycleOwner(), new C24076c(new C24082i(this)));
        F1.mo61675qw().mo4819k(getViewLifecycleOwner(), new C24076c(new C24083j(this)));
        F1.mo61673ow().mo4819k(getViewLifecycleOwner(), new C24076c(new C24084k(this)));
        F1.mo61669jw().mo4819k(getViewLifecycleOwner(), new C24076c(new C24085l(this)));
        LiveData pw = F1.mo61674pw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(pw, viewLifecycleOwner, new C24086m(this));
        return D1;
    }

    /* renamed from: U1 */
    private final Input m77652U1() {
        C28408k D1 = m77635D1();
        D1.f72082k.setTitle(C32343x.m95388F("giftcard.application.amount.page.amount.text", new Object[0]));
        D1.f72089r.setHintText((CharSequence) C32343x.m95388F("giftcard.application.amount.page.amount.label", new Object[0]));
        D1.f72093v.setText(C32343x.m95388F("giftcard.application.amount.page.toggle.schedule", new Object[0]));
        D1.f72093v.setTitle(C32343x.m95388F("giftcard.application.amount.page.toggle.schedule.info", new Object[0]));
        D1.f72094w.setHintText((CharSequence) C32343x.m95388F("giftcard.application.amount.page.schedule.date.label", new Object[0]));
        D1.f72080i.setButtonText(C32343x.m95388F("giftcard.application.amount.page.next.button", new Object[0]));
        FrameLayout frameLayout = D1.f72084m;
        C41536l.m120488h(frameLayout, "frameContainerGiftCard");
        C26041d.m81682c(frameLayout, Utils.FLOAT_EPSILON, 1, (Object) null);
        LinearLayout linearLayout = D1.f72095x;
        C41536l.m120488h(linearLayout, "timePickerLinearLayoutContainer");
        C32343x.m95402M(linearLayout);
        D1.f72094w.setInfoText(C32343x.m95388F("giftcard.application.amount.page.schedule.date.info", new Object[0]));
        Input input = D1.f72089r;
        String h = C32303f.m95197h("GEL");
        input.setSuffix(" " + h);
        input.setFilters(new C17201b[]{new C17199a((String) null, 1, (DefaultConstructorMarker) null)});
        C41536l.m120488h(input, "with(binding) {\n        …ilter()))\n        }\n    }");
        return input;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f62437g = C28408k.m87154d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m77635D1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        EditText textInput = m77635D1().f72089r.getTextInput();
        TextWatcher textWatcher = this.f62441k;
        if (textWatcher == null) {
            C41536l.m120506z("giftCardInputTextWatcher");
            textWatcher = null;
        }
        textInput.removeTextChangedListener(textWatcher);
        this.f62437g = null;
    }

    public void onPause() {
        super.onPause();
        m77636E1().mo63464b();
    }

    public void onResume() {
        super.onResume();
        m77636E1().mo63463a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("giftcard.application.header", new Object[0]));
        m77652U1();
        m77645N1();
        m77651T1();
        m77644M1();
    }
}
