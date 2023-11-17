package p341ge.bog.mobilebank.giftcards.presentation.chooseanimation;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.C0173b;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import ba1.C10145d;
import di0.C20009a;
import di0.C20010b;
import di0.C20011c;
import di0.C20012d;
import di0.C20013e;
import di0.C20014f;
import di0.C20015g;
import di0.C20016h;
import di0.C20017i;
import di0.C20018j;
import di0.C20019k;
import ee1.C40767b;
import ei0.C20244a;
import ei0.C20245b;
import fi0.C20491c;
import g91.C32343x;
import gb1.C32395y;
import hd1.C41204a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import hi0.C25029b;
import hi0.C25030c;
import hi0.C25031d;
import hi0.C25032e;
import hj0.C25033a;
import i91.C36370c;
import java.util.List;
import ji0.C25456a;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import oh0.C27008c;
import oh0.C27009d;
import oh0.C27010e;
import oh0.C27014i;
import p017b.C2105c;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.gyroanimation.GyroAnimationView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.C24133a;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.C24142c;
import th0.C28410l;
import th0.C28428u;
import th0.C28432w;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment */
public final class GiftCardsChooseAnimationFragment extends C24170d implements C20491c {

    /* renamed from: t */
    public static final C24108a f62493t = new C24108a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C28410l f62494g;

    /* renamed from: h */
    public C24142c.C24146c f62495h;

    /* renamed from: i */
    private final C41217g f62496i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C41204a f62497j = new C41204a();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C40767b f62498k;

    /* renamed from: l */
    private final C41217g f62499l;

    /* renamed from: m */
    private View f62500m;

    /* renamed from: n */
    private View f62501n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C20245b f62502o;

    /* renamed from: p */
    private final C41217g f62503p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f62504q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f62505r;

    /* renamed from: s */
    private final C0173b f62506s;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$a */
    public static final class C24108a {
        private C24108a() {
        }

        public /* synthetic */ C24108a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$b */
    static final class C24109b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAnimationFragment f62507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24109b(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment) {
            super(0);
            this.f62507d = giftCardsChooseAnimationFragment;
        }

        /* renamed from: b */
        public final C20244a invoke() {
            return new C20244a(this.f62507d.f62498k, this.f62507d.f62497j);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$c */
    static final class C24110c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAnimationFragment f62508d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24110c(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment) {
            super(0);
            this.f62508d = giftCardsChooseAnimationFragment;
        }

        /* renamed from: b */
        public final C25033a invoke() {
            SensorManager sensorManager;
            Object systemService = this.f62508d.requireContext().getSystemService("sensor");
            if (systemService instanceof SensorManager) {
                sensorManager = (SensorManager) systemService;
            } else {
                sensorManager = null;
            }
            return new C25033a(sensorManager, (GyroAnimationView) null, this.f62508d.f62498k, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$d */
    public static final class C24111d implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        final /* synthetic */ StateView f62509d;

        /* renamed from: e */
        final /* synthetic */ C24112e f62510e;

        C24111d(StateView stateView, C24112e eVar) {
            this.f62509d = stateView;
            this.f62510e = eVar;
        }

        public void onViewAttachedToWindow(View view) {
            C41536l.m120489i(view, "v");
        }

        public void onViewDetachedFromWindow(View view) {
            C41536l.m120489i(view, "v");
            this.f62509d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f62510e);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$e */
    public static final class C24112e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        private final Rect f62511d = new Rect();

        /* renamed from: e */
        final /* synthetic */ StateView f62512e;

        /* renamed from: f */
        final /* synthetic */ GiftCardsChooseAnimationFragment f62513f;

        C24112e(StateView stateView, GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment) {
            this.f62512e = stateView;
            this.f62513f = giftCardsChooseAnimationFragment;
        }

        public void onGlobalLayout() {
            int i;
            boolean z;
            LayerView layerView;
            boolean z2;
            LayerView layerView2;
            View rootView;
            StateView stateView = this.f62512e;
            if (stateView != null) {
                stateView.getWindowVisibleDisplayFrame(this.f62511d);
            }
            StateView stateView2 = this.f62512e;
            int i2 = 0;
            if (stateView2 == null || (rootView = stateView2.getRootView()) == null) {
                i = 0;
            } else {
                i = rootView.getHeight();
            }
            if (((double) (i - this.f62511d.bottom)) > ((double) i) * 0.15d) {
                z = true;
            } else {
                z = false;
            }
            GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment = this.f62513f;
            if (z) {
                giftCardsChooseAnimationFragment.m77732N1();
            } else {
                C28410l C1 = giftCardsChooseAnimationFragment.f62494g;
                if (!(C1 == null || (layerView2 = C1.f72116l) == null)) {
                    C32343x.m95455i0(layerView2);
                }
            }
            if (z != this.f62513f.f62504q) {
                this.f62513f.f62504q = z;
                C28410l C12 = this.f62513f.f62494g;
                if (C12 != null) {
                    layerView = C12.f72116l;
                } else {
                    layerView = null;
                }
                if (layerView != null) {
                    List list = (List) this.f62513f.m77737T1().mo61734Nw().mo4814f();
                    if (list == null || !(!list.isEmpty())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        i2 = 8;
                    }
                    layerView.setVisibility(i2);
                }
                this.f62513f.m77771r2(!z);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$f */
    /* synthetic */ class C24113f extends C41519a implements C43075l {
        C24113f(Object obj) {
            super(1, obj, C32343x.class, "toggleVisibility", "toggleVisibility(Landroid/view/View;ZZ)V", 1);
        }

        /* renamed from: b */
        public final void mo61699b(boolean z) {
            Button button = (Button) this.f97690d;
            C41536l.m120488h(button, "binding.secondaryButton::toggleVisibility");
            C32343x.m95483r1(button, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61699b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$g */
    static final class C24114g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAnimationFragment f62514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24114g(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment) {
            super(1);
            this.f62514d = giftCardsChooseAnimationFragment;
        }

        /* renamed from: a */
        public final void mo61700a(Integer num) {
            ViewPager2 viewPager2 = this.f62514d.m77735Q1().f72123s;
            C41536l.m120488h(num, "position");
            viewPager2.mo6606l(num.intValue(), false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61700a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$h */
    static final class C24115h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAnimationFragment f62515d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24115h(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment) {
            super(1);
            this.f62515d = giftCardsChooseAnimationFragment;
        }

        /* renamed from: a */
        public final void mo61701a(List list) {
            int i;
            this.f62515d.f62502o.mo6029i(list);
            if (this.f62515d.f62504q) {
                LayerView layerView = this.f62515d.m77735Q1().f72116l;
                C41536l.m120488h(layerView, "binding.contactLayerContainer");
                C41536l.m120488h(list, "contactsList");
                if (!list.isEmpty()) {
                    i = 0;
                } else {
                    i = 8;
                }
                layerView.setVisibility(i);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61701a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$i */
    static final class C24116i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAnimationFragment f62516d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24116i(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment) {
            super(1);
            this.f62516d = giftCardsChooseAnimationFragment;
        }

        /* renamed from: a */
        public final void mo61702a(List list) {
            this.f62516d.m77734P1().mo6029i(list);
            ScrollingPagerIndicator scrollingPagerIndicator = this.f62516d.m77735Q1().f72130z;
            C41536l.m120488h(scrollingPagerIndicator, "binding.swiperIndicator");
            int i = 0;
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            if (!z) {
                i = 8;
            }
            scrollingPagerIndicator.setVisibility(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61702a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$j */
    /* synthetic */ class C24117j extends C41519a implements C43075l {
        C24117j(Object obj) {
            super(1, obj, GiftCardsChooseAnimationFragment.class, "updateInputState", "updateInputState(Lge/bog/mobilebank/giftcards/presentation/chooseanimation/model/InputUiState;)Lkotlin/Unit;", 8);
        }

        /* renamed from: b */
        public final void mo61703b(C25030c cVar) {
            C41536l.m120489i(cVar, "p0");
            C41238w unused = ((GiftCardsChooseAnimationFragment) this.f97690d).m77767p2(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61703b((C25030c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$k */
    /* synthetic */ class C24118k extends C41535k implements C43075l {
        C24118k(Object obj) {
            super(1, obj, GiftCardsChooseAnimationFragment.class, "handleStateView", "handleStateView(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo61704b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((GiftCardsChooseAnimationFragment) this.receiver).m77743Z1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61704b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$l */
    /* synthetic */ class C24119l extends C41535k implements C43075l {
        C24119l(Object obj) {
            super(1, obj, GiftCardsChooseAnimationFragment.class, "updateNextButtonState", "updateNextButtonState(Lge/bog/mobilebank/giftcards/presentation/chooseanimation/model/NextButtonState;)V", 0);
        }

        /* renamed from: b */
        public final void mo61705b(C25031d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((GiftCardsChooseAnimationFragment) this.receiver).m77769q2(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61705b((C25031d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$m */
    /* synthetic */ class C24120m extends C41535k implements C43075l {
        C24120m(Object obj) {
            super(1, obj, GiftCardsChooseAnimationFragment.class, "handleInputError", "handleInputError(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo61706b(String str) {
            ((GiftCardsChooseAnimationFragment) this.receiver).m77741X1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61706b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$n */
    /* synthetic */ class C24121n extends C41519a implements C43075l {
        C24121n(Object obj) {
            super(1, obj, GiftCardsChooseAnimationFragment.class, "handleInputEnabled", "handleInputEnabled(Lge/bog/mobilebank/giftcards/presentation/chooseanimation/model/InputLayerEnabledState;)Lge/bog/mobilebank/giftcards/presentation/chooseanimation/model/InputLayerEnabledState;", 8);
        }

        /* renamed from: b */
        public final void mo61707b(C25029b bVar) {
            C41536l.m120489i(bVar, "p0");
            C25029b unused = ((GiftCardsChooseAnimationFragment) this.f97690d).m77740W1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61707b((C25029b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$o */
    /* synthetic */ class C24122o extends C41535k implements C43075l {
        C24122o(Object obj) {
            super(1, obj, GiftCardsChooseAnimationFragment.class, "handleCheckBoxVisibility", "handleCheckBoxVisibility(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo61708b(boolean z) {
            ((GiftCardsChooseAnimationFragment) this.receiver).m77738U1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61708b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$p */
    /* synthetic */ class C24123p extends C41535k implements C43075l {
        C24123p(Object obj) {
            super(1, obj, GiftCardsChooseAnimationFragment.class, "handleEvent", "handleEvent(Lge/bog/mobilebank/giftcards/presentation/chooseanimation/GiftCardsChooseAnimationEvents;)V", 0);
        }

        /* renamed from: b */
        public final void mo61709b(C24133a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((GiftCardsChooseAnimationFragment) this.receiver).m77739V1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61709b((C24133a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$q */
    static final class C24124q implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62517a;

        C24124q(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62517a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62517a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62517a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$r */
    public static final class C24125r implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAnimationFragment f62518d;

        /* renamed from: e */
        final /* synthetic */ C28410l f62519e;

        public C24125r(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment, C28410l lVar) {
            this.f62518d = giftCardsChooseAnimationFragment;
            this.f62519e = lVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f62518d.m77737T1().mo61733Mw(String.valueOf(editable));
            if (!this.f62518d.f62505r) {
                this.f62519e.f72115k.setChecked(false);
            }
            this.f62519e.f72125u.mo35919b();
            this.f62519e.f72125u.setInfoText((CharSequence) null);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$s */
    public static final class C24126s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62520d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$s$a */
        public static final class C24127a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C43064a f62521d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24127a(C43064a aVar) {
                super(0);
                this.f62521d = aVar;
            }

            /* renamed from: b */
            public final C1613n0 invoke() {
                return (C1613n0) this.f62521d.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24126s(C43064a aVar) {
            super(0);
            this.f62520d = aVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24127a(this.f62520d));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$t */
    public static final class C24128t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62522d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24128t(Fragment fragment) {
            super(0);
            this.f62522d = fragment;
        }

        public final Fragment invoke() {
            return this.f62522d;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$u */
    public static final class C24129u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24129u(C43064a aVar) {
            super(0);
            this.f62523d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62523d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$v */
    public static final class C24130v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24130v(C41217g gVar) {
            super(0);
            this.f62524d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62524d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$w */
    public static final class C24131w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62525d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62526e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24131w(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62525d = aVar;
            this.f62526e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62525d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62526e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment$x */
    static final class C24132x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAnimationFragment f62527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24132x(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment) {
            super(0);
            this.f62527d = giftCardsChooseAnimationFragment;
        }

        /* renamed from: b */
        public final C24142c invoke() {
            C24142c.C24146c R1 = this.f62527d.mo61693R1();
            GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment = this.f62527d;
            String string = giftCardsChooseAnimationFragment.getString(C27014i.gift_cards_flow_extra);
            C41536l.m120488h(string, "getString(R.string.gift_cards_flow_extra)");
            return R1.mo32822a((GiftCardsFlow.Animations) C32343x.m95419U0(giftCardsChooseAnimationFragment, string));
        }
    }

    public GiftCardsChooseAnimationFragment() {
        C37588a0 a0Var = C37588a0.f90326a;
        C24126s sVar = new C24126s(new C24132x(this));
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24129u(new C24128t(this)));
        this.f62496i = C1514j0.m5374c(this, C41520a0.m120436b(C24142c.class), new C24130v(a), new C24131w((C43064a) null, a), sVar);
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create()");
        this.f62498k = h1;
        this.f62499l = C41219i.m119470b(new C24110c(this));
        this.f62502o = new C20245b(this);
        this.f62503p = C41219i.m119470b(new C24109b(this));
        C0173b registerForActivityResult = registerForActivityResult(new C2105c(), new C20012d(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…nputText)\n        }\n    }");
        this.f62506s = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m77732N1() {
        ScrollView scrollView;
        C28410l lVar = this.f62494g;
        if (lVar != null && (scrollView = lVar.f72126v) != null) {
            scrollView.post(new C20010b(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m77733O1(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment) {
        ScrollView scrollView;
        int i;
        Input input;
        C41536l.m120489i(giftCardsChooseAnimationFragment, "this$0");
        C28410l lVar = giftCardsChooseAnimationFragment.f62494g;
        if (lVar != null && (scrollView = lVar.f72126v) != null) {
            if (lVar == null || (input = lVar.f72125u) == null) {
                i = 0;
            } else {
                i = input.getTop();
            }
            scrollView.smoothScrollTo(0, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public final C20244a m77734P1() {
        return (C20244a) this.f62503p.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final C28410l m77735Q1() {
        C28410l lVar = this.f62494g;
        C41536l.m120486f(lVar);
        return lVar;
    }

    /* renamed from: S1 */
    private final C25033a m77736S1() {
        return (C25033a) this.f62499l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public final C24142c m77737T1() {
        return (C24142c) this.f62496i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m77738U1(boolean z) {
        int i;
        C28410l Q1 = m77735Q1();
        CheckboxView checkboxView = Q1.f72115k;
        C41536l.m120488h(checkboxView, "checkBoxView");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkboxView.setVisibility(i);
        TextView textView = Q1.f72113i;
        C41536l.m120488h(textView, "buyText");
        if (!z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public final void m77739V1(C24133a aVar) {
        if (aVar instanceof C24133a.C24137d) {
            this.f62506s.mo404a("android.permission.READ_CONTACTS");
        } else if (aVar instanceof C24133a.C24140g) {
            C25456a.f65116J.mo64026a(((C24133a.C24140g) aVar).mo61721a()).mo4576A1(getChildFragmentManager(), (String) null);
        } else if (aVar instanceof C24133a.C24139f) {
            m77761m2();
        } else if (aVar instanceof C24133a.C24134a) {
            m77745b2();
        } else if (aVar instanceof C24133a.C24135b) {
            m77746c2();
        } else if (aVar instanceof C24133a.C24136c) {
            C8034d.m30522a(this).mo22117L(C27010e.action_giftCardsANimationsFragment_to_giftCardNominationFragment);
        } else if (aVar instanceof C24133a.C24138e) {
            handleError(((C24133a.C24138e) aVar).mo61717a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public final C25029b m77740W1(C25029b bVar) {
        C28410l Q1 = m77735Q1();
        Q1.f72125u.setEnabled(bVar.mo63441d());
        Q1.f72115k.setEnabled(bVar.mo63440c());
        Q1.f72113i.setEnabled(bVar.mo63440c());
        if (!bVar.mo63441d()) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Input input = Q1.f72125u;
            C41536l.m120488h(input, "inputPhoneNumber");
            C10145d.m37091e(requireContext, input);
            Q1.f72125u.getTextInput().clearFocus();
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public final void m77741X1(String str) {
        Input input = m77735Q1().f72125u;
        input.mo35920c();
        input.setInfoText(str);
    }

    /* renamed from: Y1 */
    private final void m77742Y1() {
        StateView stateView;
        ViewTreeObserver viewTreeObserver;
        C28410l lVar = this.f62494g;
        if (lVar != null) {
            stateView = lVar.mo3946b();
        } else {
            stateView = null;
        }
        C24112e eVar = new C24112e(stateView, this);
        if (!(stateView == null || (viewTreeObserver = stateView.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(eVar);
        }
        if (stateView != null) {
            stateView.addOnAttachStateChangeListener(new C24111d(stateView, eVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public final void m77743Z1(C31128a aVar) {
        StateView stateView = m77735Q1().f72121q;
        if (aVar instanceof C31128a.C31129a) {
            stateView.mo53596d();
        } else if (aVar instanceof C31128a.C31130b) {
            stateView.mo53597e();
        } else if (aVar instanceof C31128a.C31131c) {
            stateView.mo53595c();
        }
    }

    /* renamed from: a2 */
    private final void m77744a2() {
        C28410l Q1 = m77735Q1();
        this.f62500m = C28428u.m87234d(LayoutInflater.from(requireContext())).mo3946b();
        this.f62501n = C28432w.m87251d(LayoutInflater.from(requireContext())).mo3946b();
        Q1.f72113i.setText(C32343x.m95388F("giftcard.application.buy.for.myself.checkbox", new Object[0]));
        Q1.f72111g.setButtonText(C32343x.m95388F("giftcard.application.page1.next.button", new Object[0]));
        Q1.f72128x.setButtonText(C32343x.m95388F("giftcard.application.stores.list.button", new Object[0]));
        Q1.f72114j.setTitle(C32343x.m95388F("giftcard.application.contact.list.text", new Object[0]));
        Q1.f72125u.setHintText((CharSequence) C32343x.m95388F("giftcard.application.phone.number.label", new Object[0]));
        Q1.f72109e.setText(C32343x.m95388F("giftcard.application.choose.design.text", new Object[0]));
        Q1.f72127w.setText(C32343x.m95388F("giftcard.application.select.recipient.text", new Object[0]));
        Q1.f72127w.setTitle(C32343x.m95388F("giftcard.application.select.recipient", new Object[0]));
        Q1.f72117m.setAdapter(this.f62502o);
        Q1.f72123s.setAdapter(m77734P1());
        int dimensionPixelSize = getResources().getDimensionPixelSize(C27008c.f67784a);
        ViewPager2 viewPager2 = Q1.f72123s;
        C41536l.m120488h(viewPager2, "horizontalAnimationCard");
        C32395y.m95667b(viewPager2, dimensionPixelSize, dimensionPixelSize);
        Q1.f72123s.setOffscreenPageLimit(1);
        ScrollingPagerIndicator scrollingPagerIndicator = Q1.f72130z;
        ViewPager2 viewPager22 = m77735Q1().f72123s;
        C41536l.m120488h(viewPager22, "binding.horizontalAnimationCard");
        scrollingPagerIndicator.mo53672c(viewPager22);
    }

    /* renamed from: b2 */
    private final void m77745b2() {
        String str;
        PackageManager packageManager;
        Intent addFlags = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").addFlags(268435456).addFlags(1073741824);
        C1505h activity = getActivity();
        ComponentName componentName = null;
        if (activity != null) {
            str = activity.getPackageName();
        } else {
            str = null;
        }
        Intent data = addFlags.setData(Uri.fromParts("package", str, (String) null));
        C41536l.m120488h(data, "Intent(Settings.ACTION_A…vity?.packageName, null))");
        C1505h activity2 = getActivity();
        if (!(activity2 == null || (packageManager = activity2.getPackageManager()) == null)) {
            componentName = data.resolveActivity(packageManager);
        }
        if (componentName != null) {
            startActivity(data);
        }
    }

    /* renamed from: c2 */
    private final void m77746c2() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        StateView c = m77735Q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        C10145d.m37091e(requireContext, c);
        C8034d.m30522a(this).mo22117L(C27010e.action_giftCardsANimationsFragment_to_giftCardsChooseAmountFragment);
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public static final void m77747d2(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment, boolean z) {
        C41536l.m120489i(giftCardsChooseAnimationFragment, "this$0");
        if (z) {
            giftCardsChooseAnimationFragment.m77737T1().mo61743fx(C36370c.m107927h(giftCardsChooseAnimationFragment.requireContext()));
            giftCardsChooseAnimationFragment.m77737T1().mo61733Mw(giftCardsChooseAnimationFragment.m77735Q1().f72125u.getInputText());
        }
    }

    /* renamed from: e2 */
    private final void m77748e2() {
        C28410l Q1 = m77735Q1();
        Q1.f72125u.getTextInput().addTextChangedListener(new C24125r(this, Q1));
        Q1.f72126v.setOnTouchListener(new C20013e(this));
        Q1.f72128x.setOnClickListener(new C20014f(this));
        Q1.f72125u.setEndComponentClickListener(new C20015g(this));
        Q1.f72113i.setOnClickListener(new C20016h(Q1));
        Q1.f72115k.setOnCheckedChangeListener(new C20017i(this));
        Q1.f72111g.setOnClickListener(new C20018j(this, Q1));
        Q1.f72112h.setOnClickListener(new C20019k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final boolean m77749f2(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment, View view, MotionEvent motionEvent) {
        int i;
        C41536l.m120489i(giftCardsChooseAnimationFragment, "this$0");
        List list = (List) giftCardsChooseAnimationFragment.m77737T1().mo61734Nw().mo4814f();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m77750g2(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment, View view) {
        C41536l.m120489i(giftCardsChooseAnimationFragment, "this$0");
        giftCardsChooseAnimationFragment.m77737T1().mo61739Ww();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m77751h2(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment, View view) {
        C41536l.m120489i(giftCardsChooseAnimationFragment, "this$0");
        giftCardsChooseAnimationFragment.m77737T1().mo61741cx();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m77753i2(C28410l lVar, View view) {
        C41536l.m120489i(lVar, "$this_with");
        CheckboxView checkboxView = lVar.f72115k;
        checkboxView.setChecked(!checkboxView.isChecked());
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m77755j2(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(giftCardsChooseAnimationFragment, "this$0");
        giftCardsChooseAnimationFragment.m77737T1().mo61740Yw(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m77757k2(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment, C28410l lVar, View view) {
        C41536l.m120489i(giftCardsChooseAnimationFragment, "this$0");
        C41536l.m120489i(lVar, "$this_with");
        giftCardsChooseAnimationFragment.m77737T1().mo61737Rw(giftCardsChooseAnimationFragment.m77735Q1().f72125u.getInputText(), giftCardsChooseAnimationFragment.m77734P1().mo48716k(lVar.f72123s.getCurrentItem()));
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m77759l2(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment, View view) {
        C41536l.m120489i(giftCardsChooseAnimationFragment, "this$0");
        giftCardsChooseAnimationFragment.m77737T1().onRefresh(6);
    }

    /* renamed from: m2 */
    private final void m77761m2() {
        C13310d dVar = new C13310d();
        dVar.mo35648c2(C32343x.m95388F("giftcard.application.contact.access.title", new Object[0]));
        dVar.mo35639Q1(C32343x.m95388F("giftcard.application.contact.access.text", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("giftcard.application.contact.access.close.button", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("giftcard.application.contact.access.settings.button", new Object[0]));
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_TWO_BUTTON);
        dVar.mo35635M1(new Image.Resource(C27009d.settings_confirmation_image, (Boolean) null, 2, (DefaultConstructorMarker) null));
        dVar.mo35636N1(PageDescriptionView.C13421b.IMAGE);
        dVar.mo35645Y1(new C20009a(dVar, this));
        dVar.mo35641T1(new C20011c(dVar));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m77763n2(C13310d dVar, GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment, Button button) {
        C41536l.m120489i(dVar, "$builder");
        C41536l.m120489i(giftCardsChooseAnimationFragment, "this$0");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        giftCardsChooseAnimationFragment.m77737T1().mo61738Vw();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m77765o2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$builder");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    private final void observeData() {
        C24142c T1 = m77737T1();
        T1.mo61734Nw().mo4819k(getViewLifecycleOwner(), new C24124q(new C24115h(this)));
        T1.mo61725Ew().mo4819k(getViewLifecycleOwner(), new C24124q(new C24116i(this)));
        T1.mo61731Kw().mo4819k(getViewLifecycleOwner(), new C24124q(new C24117j(this)));
        T1.mo61727Gw().mo4819k(getViewLifecycleOwner(), new C24124q(new C24118k(this)));
        T1.mo61732Lw().mo4819k(getViewLifecycleOwner(), new C24124q(new C24119l(this)));
        T1.mo61730Jw().mo4819k(getViewLifecycleOwner(), new C24124q(new C24120m(this)));
        T1.mo61729Iw().mo4819k(getViewLifecycleOwner(), new C24124q(new C24121n(this)));
        T1.mo61726Fw().mo4819k(getViewLifecycleOwner(), new C24124q(new C24122o(this)));
        LiveData Hw = T1.mo61728Hw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Hw, viewLifecycleOwner, new C24123p(this));
        LiveData Ow = T1.mo61735Ow();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        Button button = m77735Q1().f72128x;
        C41536l.m120488h(button, "binding.secondaryButton");
        Ow.mo4819k(viewLifecycleOwner2, new C24124q(new C24113f(button)));
        T1.mo61736Pw().mo4819k(getViewLifecycleOwner(), new C24124q(new C24114g(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final C41238w m77767p2(C25030c cVar) {
        View view;
        Input input = m77735Q1().f72125u;
        if (cVar.mo63447d()) {
            view = this.f62501n;
        } else {
            view = this.f62500m;
        }
        input.setEndComponentView(view);
        String c = cVar.mo63446c();
        if (c == null) {
            return null;
        }
        this.f62505r = true;
        input.getTextInput().setText(c);
        input.getTextInput().setSelection(c.length());
        this.f62505r = false;
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final void m77769q2(C25031d dVar) {
        m77735Q1().f72111g.setLoading(dVar.mo63452b());
        if (dVar.mo63452b()) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            StateView c = m77735Q1().mo3946b();
            C41536l.m120488h(c, "binding.root");
            C10145d.m37091e(requireContext, c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m77771r2(boolean z) {
        int i;
        int i2;
        int i3;
        C28410l Q1 = m77735Q1();
        ViewPager2 viewPager2 = Q1.f72123s;
        C41536l.m120488h(viewPager2, "horizontalAnimationCard");
        int i4 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        viewPager2.setVisibility(i);
        TextView textView = Q1.f72109e;
        C41536l.m120488h(textView, "animationsHeaderTextView");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        ScrollingPagerIndicator scrollingPagerIndicator = Q1.f72130z;
        C41536l.m120488h(scrollingPagerIndicator, "swiperIndicator");
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        scrollingPagerIndicator.setVisibility(i3);
        PageDescriptionView pageDescriptionView = Q1.f72127w;
        C41536l.m120488h(pageDescriptionView, "pageDescription");
        if (!z) {
            i4 = 8;
        }
        pageDescriptionView.setVisibility(i4);
    }

    /* renamed from: E */
    public void mo49033E(C25032e eVar) {
        C41536l.m120489i(eVar, "contact");
        m77737T1().mo61744gx(eVar);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        StateView c = m77735Q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        C10145d.m37091e(requireContext, c);
    }

    /* renamed from: R1 */
    public final C24142c.C24146c mo61693R1() {
        C24142c.C24146c cVar = this.f62495h;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f62494g = C28410l.m87162d(layoutInflater, viewGroup, false);
        StateView c = m77735Q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f62497j.dispose();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f62494g = null;
        this.f62500m = null;
        this.f62501n = null;
    }

    public void onPause() {
        super.onPause();
        m77735Q1().f72125u.getTextInput().clearFocus();
        m77736S1().mo63464b();
    }

    public void onResume() {
        super.onResume();
        m77737T1().mo61742ex();
        m77736S1().mo63463a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("text.discovery.page.tab.giftcard", new Object[0]));
        m77744a2();
        m77748e2();
        observeData();
        m77742Y1();
    }
}
