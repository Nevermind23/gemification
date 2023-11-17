package p341ge.bog.mobilebank.statements.presentation.statementsfilter;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import ba1.C10145d;
import c10.C19443b;
import c10.C19454j;
import g91.C32303f;
import g91.C32343x;
import g91.C32355x0;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import n51.C37358d;
import o51.C37648e;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.chips_thumbnail.ChipThumbnail;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.mobilebank.statements.presentation.OperationFilter;
import p601sg.C17779d;
import p629uh.C18167d;
import p863pw.C27638p;
import r51.C38286b;
import r51.C38287c;
import ue1.C43064a;
import ue1.C43075l;
import v51.C39202a0;
import v51.C39204b0;
import v51.C39221m;
import v51.C39222n;
import v51.C39223o;
import v51.C39224p;
import v51.C39225q;
import v51.C39226r;
import v51.C39227s;
import v51.C39228t;
import v51.C39229u;
import v51.C39230v;
import v51.C39231w;
import v51.C39232x;
import v51.C39233y;

/* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity */
public final class StatementsFilterActivity extends C34759b {

    /* renamed from: P */
    public static final C34724a f83936P = new C34724a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f83937G = new C1617p0(C41520a0.m120436b(StatementsFilterViewModel$ViewModel.class), new C34738o(this), new C34737n(this), new C34739p((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C37648e f83938H;

    /* renamed from: I */
    private long f83939I = Calendar.getInstance().getTimeInMillis();

    /* renamed from: J */
    private final HashSet f83940J = new HashSet();

    /* renamed from: K */
    private long f83941K;

    /* renamed from: L */
    private long f83942L;

    /* renamed from: M */
    private final C34726c f83943M;

    /* renamed from: N */
    private final C34736m f83944N;

    /* renamed from: O */
    private final ChipGroup.C13230a f83945O;

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$a */
    public static final class C34724a {
        private C34724a() {
        }

        public /* synthetic */ C34724a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$b */
    public static final class C34725b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C37648e f83946d;

        public C34725b(C37648e eVar) {
            this.f83946d = eVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f83946d.f90452f.setEnabled(!(editable == null || C40439w.m117118v(editable)));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$c */
    public static final class C34726c implements C19454j {

        /* renamed from: a */
        final /* synthetic */ StatementsFilterActivity f83947a;

        C34726c(StatementsFilterActivity statementsFilterActivity) {
            this.f83947a = statementsFilterActivity;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            this.f83947a.m102025O3(j);
            this.f83947a.m102046g3();
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$d */
    static final class C34727d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterActivity f83948d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34727d(StatementsFilterActivity statementsFilterActivity) {
            super(1);
            this.f83948d = statementsFilterActivity;
        }

        /* renamed from: a */
        public final void mo84838a(HashSet hashSet) {
            StatementsFilterActivity statementsFilterActivity = this.f83948d;
            C41536l.m120488h(hashSet, "it");
            statementsFilterActivity.m102062w3(hashSet);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84838a((HashSet) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$e */
    static final class C34728e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterActivity f83949d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34728e(StatementsFilterActivity statementsFilterActivity) {
            super(1);
            this.f83949d = statementsFilterActivity;
        }

        /* renamed from: a */
        public final void mo84839a(HashSet hashSet) {
            StatementsFilterActivity statementsFilterActivity = this.f83949d;
            C41536l.m120488h(hashSet, "it");
            statementsFilterActivity.m102002C3(hashSet);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84839a((HashSet) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$f */
    static final class C34729f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterActivity f83950d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34729f(StatementsFilterActivity statementsFilterActivity) {
            super(1);
            this.f83950d = statementsFilterActivity;
        }

        /* renamed from: a */
        public final void mo84840a(HashSet hashSet) {
            StatementsFilterActivity statementsFilterActivity = this.f83950d;
            C41536l.m120488h(hashSet, "it");
            statementsFilterActivity.m102003D3(hashSet);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84840a((HashSet) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$g */
    static final class C34730g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterActivity f83951d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34730g(StatementsFilterActivity statementsFilterActivity) {
            super(1);
            this.f83951d = statementsFilterActivity;
        }

        /* renamed from: a */
        public final void mo84841a(C41224m mVar) {
            this.f83951d.m102005E3((List) mVar.mo95675a(), (List) mVar.mo95676b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84841a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$h */
    static final class C34731h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterActivity f83952d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34731h(StatementsFilterActivity statementsFilterActivity) {
            super(1);
            this.f83952d = statementsFilterActivity;
        }

        /* renamed from: a */
        public final void mo84842a(C37223a aVar) {
            StatementsFilterActivity statementsFilterActivity = this.f83952d;
            C41536l.m120488h(aVar, "it");
            statementsFilterActivity.m102058s3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84842a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$i */
    static final class C34732i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterActivity f83953d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34732i(StatementsFilterActivity statementsFilterActivity) {
            super(1);
            this.f83953d = statementsFilterActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            StatementsFilterActivity statementsFilterActivity = this.f83953d;
            C41536l.m120488h(bool, "it");
            statementsFilterActivity.m102057r3(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$j */
    static final class C34733j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterActivity f83954d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34733j(StatementsFilterActivity statementsFilterActivity) {
            super(1);
            this.f83954d = statementsFilterActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "loading");
            C37648e eVar = null;
            if (bool.booleanValue()) {
                C37648e S2 = this.f83954d.f83938H;
                if (S2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    eVar = S2;
                }
                eVar.f90468v.mo53597e();
                return;
            }
            C37648e S22 = this.f83954d.f83938H;
            if (S22 == null) {
                C41536l.m120506z("binding");
                S22 = null;
            }
            S22.f90446E.setEnabled(false);
            C37648e S23 = this.f83954d.f83938H;
            if (S23 == null) {
                C41536l.m120506z("binding");
                S23 = null;
            }
            S23.f90446E.setRefreshing(false);
            C37648e S24 = this.f83954d.f83938H;
            if (S24 == null) {
                C41536l.m120506z("binding");
            } else {
                eVar = S24;
            }
            eVar.f90468v.mo53595c();
            this.f83954d.m102052m3();
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$k */
    static final class C34734k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StatementsFilterActivity f83955d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34734k(StatementsFilterActivity statementsFilterActivity) {
            super(1);
            this.f83955d = statementsFilterActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f83955d.mo74709H1(th);
            C37648e S2 = this.f83955d.f83938H;
            C37648e eVar = null;
            if (S2 == null) {
                C41536l.m120506z("binding");
                S2 = null;
            }
            S2.f90446E.setRefreshing(false);
            C37648e S22 = this.f83955d.f83938H;
            if (S22 == null) {
                C41536l.m120506z("binding");
                S22 = null;
            }
            S22.f90446E.setEnabled(true);
            C37648e S23 = this.f83955d.f83938H;
            if (S23 == null) {
                C41536l.m120506z("binding");
            } else {
                eVar = S23;
            }
            eVar.f90468v.mo53596d();
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$l */
    static final class C34735l implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83956a;

        C34735l(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83956a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83956a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83956a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$m */
    public static final class C34736m implements C19454j {

        /* renamed from: a */
        final /* synthetic */ StatementsFilterActivity f83957a;

        C34736m(StatementsFilterActivity statementsFilterActivity) {
            this.f83957a = statementsFilterActivity;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            this.f83957a.m102013I3(j);
            this.f83957a.m102046g3();
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$n */
    public static final class C34737n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83958d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34737n(ComponentActivity componentActivity) {
            super(0);
            this.f83958d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f83958d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$o */
    public static final class C34738o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83959d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34738o(ComponentActivity componentActivity) {
            super(0);
            this.f83959d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83959d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity$p */
    public static final class C34739p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83960d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f83961e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34739p(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f83960d = aVar;
            this.f83961e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83960d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83961e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    public StatementsFilterActivity() {
        C38286b bVar = C38286b.f91793a;
        this.f83941K = bVar.mo91843f(1);
        this.f83942L = bVar.mo91840c();
        this.f83943M = new C34726c(this);
        this.f83944N = new C34736m(this);
        this.f83945O = new C39221m(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m102000A3(StatementsFilterActivity statementsFilterActivity, C37648e eVar, View view) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        C41536l.m120489i(eVar, "$this_with");
        statementsFilterActivity.m102045f3(eVar.f90469w.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m102001B3(StatementsFilterActivity statementsFilterActivity, View view) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        statementsFilterActivity.m102047h3();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m102002C3(HashSet hashSet) {
        StringBuilder sb = new StringBuilder();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Object f = ((C41224m) it.next()).mo95680f();
            sb.append(f + ", ");
        }
        m102060u3(sb);
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        Input input = eVar.f90457k;
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "displayText.toString()");
        input.setInputText(sb2);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public final void m102003D3(HashSet hashSet) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C41224m mVar = (C41224m) it.next();
            if (((CharSequence) mVar.mo95680f()).length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object f = mVar.mo95680f();
                sb.append(f + ", ");
            }
        }
        m102060u3(sb);
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        Input input = eVar.f90458l;
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "displayText.toString()");
        input.setInputText(sb2);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public final void m102005E3(List list, List list2) {
        this.f83940J.clear();
        this.f83940J.addAll(list2);
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        LayerView layerView = eVar.f90460n;
        C41536l.m120488h(layerView, "binding.ccyLayerView");
        C32343x.m95483r1(layerView, !list.isEmpty(), false, 2, (Object) null);
        C37648e eVar2 = this.f83938H;
        if (eVar2 == null) {
            C41536l.m120506z("binding");
            eVar2 = null;
        }
        eVar2.f90459m.removeAllViews();
        int size = list.size();
        LinearLayout linearLayout = null;
        for (int i = 0; i < size; i++) {
            C27638p pVar = (C27638p) list.get(i);
            if (linearLayout == null || i % 2 == 0) {
                linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(0);
                C37648e eVar3 = this.f83938H;
                if (eVar3 == null) {
                    C41536l.m120506z("binding");
                    eVar3 = null;
                }
                eVar3.f90459m.addView(linearLayout);
            }
            linearLayout.addView(m102027P3(pVar));
        }
    }

    /* renamed from: F3 */
    private final void m102007F3() {
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f90445D.setOnClickListener(new C39231w(this));
        eVar.f90466t.setOnClickListener(new C39232x(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public static final void m102009G3(StatementsFilterActivity statementsFilterActivity, View view) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        statementsFilterActivity.m102031R3(statementsFilterActivity.f83941K, C38286b.f91793a.mo91843f(24), statementsFilterActivity.f83939I, statementsFilterActivity.f83943M);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public static final void m102011H3(StatementsFilterActivity statementsFilterActivity, View view) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        statementsFilterActivity.m102031R3(statementsFilterActivity.f83942L, statementsFilterActivity.f83941K, statementsFilterActivity.f83939I, statementsFilterActivity.f83944N);
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public final void m102013I3(long j) {
        this.f83942L = j;
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f90466t.setInputText(C38287c.m112557a(j));
    }

    /* renamed from: J3 */
    private final void m102015J3() {
        long j;
        long j2;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        List list;
        Integer num;
        BigDecimal h;
        BigDecimal i;
        List d;
        List a;
        List b;
        OperationFilter operationFilter = (OperationFilter) getIntent().getParcelableExtra("KEY_PARAMS");
        if (operationFilter != null) {
            j = operationFilter.mo84803l();
        } else {
            j = C38286b.f91793a.mo91843f(1);
        }
        m102025O3(j);
        if (operationFilter != null) {
            j2 = operationFilter.mo84796f();
        } else {
            j2 = C38286b.f91793a.mo91840c();
        }
        m102013I3(j2);
        C39202a0 uw = m102051l3().mo84874uw();
        if (operationFilter == null || (b = operationFilter.mo84791b()) == null || (hashSet = C41358y.m120034x0(b)) == null) {
            hashSet = new HashSet();
        }
        uw.mo84868qc(hashSet);
        C39202a0 uw2 = m102051l3().mo84874uw();
        if (operationFilter == null || (a = operationFilter.mo84790a()) == null || (hashSet2 = C41358y.m120034x0(a)) == null) {
            hashSet2 = new HashSet();
        }
        uw2.mo84858Tf(hashSet2);
        C39202a0 uw3 = m102051l3().mo84874uw();
        if (operationFilter == null || (d = operationFilter.mo84792d()) == null || (hashSet3 = C41358y.m120034x0(d)) == null) {
            hashSet3 = new HashSet();
        }
        uw3.mo84855Gl(hashSet3);
        C39202a0 uw4 = m102051l3().mo84874uw();
        if (operationFilter == null || (list = operationFilter.mo84794e()) == null) {
            list = C41341q.m119907j();
        }
        uw4.mo84852Cf(list);
        C37648e eVar = null;
        if (!(operationFilter == null || (i = operationFilter.mo84800i()) == null)) {
            C37648e eVar2 = this.f83938H;
            if (eVar2 == null) {
                C41536l.m120506z("binding");
                eVar2 = null;
            }
            eVar2.f90443B.getTextInput().setText(i.toString());
        }
        if (!(operationFilter == null || (h = operationFilter.mo84798h()) == null)) {
            C37648e eVar3 = this.f83938H;
            if (eVar3 == null) {
                C41536l.m120506z("binding");
                eVar3 = null;
            }
            eVar3.f90442A.getTextInput().setText(h.toString());
        }
        if (operationFilter != null) {
            num = operationFilter.mo84801j();
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            C37648e eVar4 = this.f83938H;
            if (eVar4 == null) {
                C41536l.m120506z("binding");
            } else {
                eVar = eVar4;
            }
            eVar.f90464r.mo35182m(0, true);
        } else if (num != null && num.intValue() == 3) {
            C37648e eVar5 = this.f83938H;
            if (eVar5 == null) {
                C41536l.m120506z("binding");
            } else {
                eVar = eVar5;
            }
            eVar.f90464r.mo35182m(1, true);
        } else if (num != null && num.intValue() == 6) {
            C37648e eVar6 = this.f83938H;
            if (eVar6 == null) {
                C41536l.m120506z("binding");
            } else {
                eVar = eVar6;
            }
            eVar.f90464r.mo35182m(2, true);
        } else if (num != null && num.intValue() == 12) {
            C37648e eVar7 = this.f83938H;
            if (eVar7 == null) {
                C41536l.m120506z("binding");
            } else {
                eVar = eVar7;
            }
            eVar.f90464r.mo35182m(3, true);
        }
    }

    /* renamed from: K3 */
    private final void m102017K3() {
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f90451e.setOnClickListener(new C39222n(this));
        eVar.f90457k.setOnClickListener(new C39223o(this));
        eVar.f90458l.setOnClickListener(new C39224p(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static final void m102019L3(StatementsFilterActivity statementsFilterActivity, View view) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        C34761c.f84002I.mo84903a(false).mo4576A1(statementsFilterActivity.getSupportFragmentManager(), "CARD_SELECTOR_SHEET");
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public static final void m102021M3(StatementsFilterActivity statementsFilterActivity, View view) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        C34750a.f83989I.mo84897a().mo4576A1(statementsFilterActivity.getSupportFragmentManager(), "CATEGORIES_ACTION_SHEET");
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public static final void m102023N3(StatementsFilterActivity statementsFilterActivity, View view) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        C34761c.f84002I.mo84903a(true).mo4576A1(statementsFilterActivity.getSupportFragmentManager(), "ACCOUNT_SELECTOR_SHEET");
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public final void m102025O3(long j) {
        this.f83941K = j;
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f90445D.setInputText(C38287c.m112557a(j));
    }

    /* renamed from: P3 */
    private final ChipThumbnail m102027P3(C27638p pVar) {
        List list;
        ChipThumbnail chipThumbnail = new ChipThumbnail(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        OperationFilter operationFilter = (OperationFilter) getIntent().getParcelableExtra("KEY_PARAMS");
        if (operationFilter != null) {
            list = operationFilter.mo84794e();
        } else {
            list = null;
        }
        if (list == null || !list.contains(pVar.mo67171a())) {
            chipThumbnail.setStateType(ChipThumbnail.C13236a.PRESSED);
        } else {
            chipThumbnail.setStateType(ChipThumbnail.C13236a.ACTIVE);
        }
        chipThumbnail.setTitle(pVar.mo67172b());
        String h = C32303f.m95197h(pVar.mo67171a());
        C41536l.m120488h(h, "getCcyLogo(ccyObject.CCY)");
        chipThumbnail.setIconText(h);
        chipThumbnail.setTag(pVar.mo67171a());
        chipThumbnail.setLayoutParams(m102050k3());
        chipThumbnail.setOnClickListener(new C39226r(this));
        return chipThumbnail;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public static final void m102029Q3(StatementsFilterActivity statementsFilterActivity, View view) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        C41536l.m120487g(view, "null cannot be cast to non-null type ge.bog.designsystem.components.chips_thumbnail.ChipThumbnail");
        statementsFilterActivity.m102054o3((ChipThumbnail) view);
    }

    /* renamed from: R3 */
    private final void m102031R3(long j, long j2, long j3, C19454j jVar) {
        new C19443b(this, j, j2, j3, jVar).mo47662d();
    }

    /* renamed from: c3 */
    private final void m102042c3(ChipGroup chipGroup, String str) {
        Chip chip = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        chip.setChipTitle(str);
        chip.setChipType(C18167d.REMOVABLE_CHIP);
        chip.setClickable(false);
        chipGroup.mo35183o(chip);
    }

    /* renamed from: d3 */
    private final void m102043d3() {
        C37648e eVar = this.f83938H;
        C37648e eVar2 = null;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f90464r.mo35190t();
        C37648e eVar3 = this.f83938H;
        if (eVar3 == null) {
            C41536l.m120506z("binding");
            eVar3 = null;
        }
        ChipGroup chipGroup = eVar3.f90464r;
        Chip chip = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        chip.setTag("1");
        chip.setChipTitle(getString(C37358d.one_month));
        chipGroup.mo35183o(chip);
        C37648e eVar4 = this.f83938H;
        if (eVar4 == null) {
            C41536l.m120506z("binding");
            eVar4 = null;
        }
        ChipGroup chipGroup2 = eVar4.f90464r;
        Chip chip2 = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        chip2.setTag("3");
        chip2.setChipTitle(getString(C37358d.three_months));
        chipGroup2.mo35183o(chip2);
        C37648e eVar5 = this.f83938H;
        if (eVar5 == null) {
            C41536l.m120506z("binding");
            eVar5 = null;
        }
        ChipGroup chipGroup3 = eVar5.f90464r;
        Chip chip3 = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        chip3.setTag(AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_APPL_ID);
        chip3.setChipTitle(getString(C37358d.six_months));
        chipGroup3.mo35183o(chip3);
        C37648e eVar6 = this.f83938H;
        if (eVar6 == null) {
            C41536l.m120506z("binding");
        } else {
            eVar2 = eVar6;
        }
        ChipGroup chipGroup4 = eVar2.f90464r;
        Chip chip4 = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        chip4.setTag("12");
        chip4.setChipTitle(getString(C37358d.one_year));
        chipGroup4.mo35183o(chip4);
    }

    /* renamed from: e3 */
    private final void m102044e3(ChipGroup chipGroup, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m102042c3(chipGroup, (String) it.next());
        }
    }

    /* renamed from: f3 */
    private final void m102045f3(String str) {
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        ChipGroup chipGroup = eVar.f90470x;
        C41536l.m120488h(chipGroup, "keyWordsContainer");
        m102042c3(chipGroup, str);
        m102051l3().mo84874uw().mo84859Vk(str);
        eVar.f90469w.setInputText("");
        Input input = eVar.f90469w;
        C41536l.m120488h(input, "inputKeyWord");
        C10145d.m37091e(this, input);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m102046g3() {
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f90464r.mo35190t();
        m102043d3();
    }

    /* renamed from: h3 */
    private final void m102047h3() {
        m102051l3().mo84874uw().mo84871sr();
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f90470x.mo35190t();
    }

    /* renamed from: i3 */
    private final void m102048i3() {
        List g;
        String str;
        OperationFilter operationFilter = (OperationFilter) getIntent().getParcelableExtra("KEY_PARAMS");
        if (!(operationFilter == null || (g = operationFilter.mo84797g()) == null || (str = (String) C41358y.m120009Y(g)) == null)) {
            m102045f3(str);
        }
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f90469w.getTextInput().setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(15)});
        eVar.f90469w.getTextInput().addTextChangedListener(new C34725b(eVar));
        eVar.f90470x.setOnChipRemovedListener(new C39233y(this));
        eVar.f90452f.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m102049j3(StatementsFilterActivity statementsFilterActivity, int i) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        statementsFilterActivity.m102059t3(i);
    }

    /* renamed from: k3 */
    private final LinearLayout.LayoutParams m102050k3() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = C17779d.f49645S1;
        layoutParams.setMargins(0, C32355x0.m95516g(i), C32355x0.m95516g(i), 0);
        return layoutParams;
    }

    /* renamed from: l3 */
    private final StatementsFilterViewModel$ViewModel m102051l3() {
        return (StatementsFilterViewModel$ViewModel) this.f83937G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m102052m3() {
        C39204b0 zw = m102051l3().mo84879zw();
        zw.mo84866po().mo4819k(this, new C34735l(new C34727d(this)));
        zw.mo84861Xg().mo4819k(this, new C34735l(new C34728e(this)));
        zw.mo84864hu().mo4819k(this, new C34735l(new C34729f(this)));
        zw.mo84860Vv().mo4819k(this, new C34735l(new C34730g(this)));
        zw.mo84848Av().mo4819k(this, new C34735l(new C34731h(this)));
        zw.mo84854Dl().mo4819k(this, new C34735l(new C34732i(this)));
        m102015J3();
        m102048i3();
    }

    /* renamed from: n3 */
    private final void m102053n3() {
        m102051l3().mo84879zw().mo84863d0().mo4819k(this, new C34735l(new C34733j(this)));
        m102051l3().mo84879zw().mo84875v1().mo4819k(this, new C34735l(new C34734k(this)));
    }

    /* renamed from: o3 */
    private final void m102054o3(ChipThumbnail chipThumbnail) {
        Object tag = chipThumbnail.getTag();
        C41536l.m120487g(tag, "null cannot be cast to non-null type kotlin.String");
        String str = (String) tag;
        if (this.f83940J.contains(str)) {
            chipThumbnail.setStateType(ChipThumbnail.C13236a.PRESSED);
            this.f83940J.remove(str);
            return;
        }
        chipThumbnail.setStateType(ChipThumbnail.C13236a.ACTIVE);
        this.f83940J.add(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m102055p3(StatementsFilterActivity statementsFilterActivity, Chip chip, int i) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        C41536l.m120489i(chip, "chp");
        C37648e eVar = statementsFilterActivity.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        if (eVar.f90464r.getActivatedChipId() == chip.getId()) {
            int parseInt = Integer.parseInt(chip.getTag().toString());
            C38286b bVar = C38286b.f91793a;
            statementsFilterActivity.m102025O3(bVar.mo91843f(parseInt));
            statementsFilterActivity.m102013I3(bVar.mo91840c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m102056q3(StatementsFilterActivity statementsFilterActivity) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        C21481a.onRefresh$default(statementsFilterActivity.m102051l3(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void m102057r3(boolean z) {
        C37648e eVar = this.f83938H;
        C37648e eVar2 = null;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f90469w.setEnabled(z);
        C37648e eVar3 = this.f83938H;
        if (eVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            eVar2 = eVar3;
        }
        eVar2.f90469w.getTextInput().setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final void m102058s3(C37223a aVar) {
        List list = (List) aVar.mo90296a();
        if (list != null) {
            C37648e eVar = this.f83938H;
            if (eVar == null) {
                C41536l.m120506z("binding");
                eVar = null;
            }
            ChipGroup chipGroup = eVar.f90470x;
            C41536l.m120488h(chipGroup, "binding.keyWordsContainer");
            m102044e3(chipGroup, list);
        }
        m102051l3().mo84874uw().mo84862bc();
    }

    /* renamed from: t3 */
    private final void m102059t3(int i) {
        m102051l3().mo84874uw().mo84865nn(i);
    }

    /* renamed from: u3 */
    private final void m102060u3(StringBuilder sb) {
        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length());
        }
    }

    /* renamed from: v3 */
    private final void m102061v3() {
        Integer num;
        List list;
        List list2;
        List list3;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Integer num2;
        C37648e eVar = this.f83938H;
        List list4 = null;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        ChipGroup chipGroup = eVar.f90464r;
        C37648e eVar2 = this.f83938H;
        if (eVar2 == null) {
            C41536l.m120506z("binding");
            eVar2 = null;
        }
        Chip chip = (Chip) chipGroup.findViewById(eVar2.f90464r.getActivatedChipId());
        if (chip != null) {
            try {
                Object tag = chip.getTag();
                C41536l.m120487g(tag, "null cannot be cast to non-null type kotlin.String");
                num2 = Integer.valueOf(Integer.parseInt((String) tag));
            } catch (Exception unused) {
                num2 = null;
            }
            num = num2;
        } else {
            num = null;
        }
        Intent intent = new Intent();
        long j = this.f83941K;
        long j2 = this.f83942L;
        HashSet<C41224m> hashSet = (HashSet) m102051l3().mo84879zw().mo84866po().mo4814f();
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList(C41343r.m119925u(hashSet, 10));
            for (C41224m e : hashSet) {
                arrayList.add(Long.valueOf(((Number) e.mo95678e()).longValue()));
            }
            list = C41358y.m120036z0(arrayList);
        } else {
            list = null;
        }
        HashSet<C41224m> hashSet2 = (HashSet) m102051l3().mo84879zw().mo84861Xg().mo4814f();
        if (hashSet2 != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(hashSet2, 10));
            for (C41224m e2 : hashSet2) {
                arrayList2.add(Long.valueOf(((Number) e2.mo95678e()).longValue()));
            }
            list2 = C41358y.m120036z0(arrayList2);
        } else {
            list2 = null;
        }
        HashSet<C41224m> hashSet3 = (HashSet) m102051l3().mo84879zw().mo84864hu().mo4814f();
        if (hashSet3 != null) {
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(hashSet3, 10));
            for (C41224m e3 : hashSet3) {
                arrayList3.add(Long.valueOf(((Number) e3.mo95678e()).longValue()));
            }
            list3 = C41358y.m120036z0(arrayList3);
        } else {
            list3 = null;
        }
        try {
            C37648e eVar3 = this.f83938H;
            if (eVar3 == null) {
                C41536l.m120506z("binding");
                eVar3 = null;
            }
            bigDecimal = new BigDecimal(eVar3.f90443B.getTextInput().getText().toString());
        } catch (Exception unused2) {
            bigDecimal = null;
        }
        try {
            C37648e eVar4 = this.f83938H;
            if (eVar4 == null) {
                C41536l.m120506z("binding");
                eVar4 = null;
            }
            bigDecimal2 = new BigDecimal(eVar4.f90442A.getTextInput().getText().toString());
        } catch (Exception unused3) {
            bigDecimal2 = null;
        }
        List z0 = C41358y.m120036z0(this.f83940J);
        C37223a aVar = (C37223a) m102051l3().mo84879zw().mo84848Av().mo4814f();
        if (aVar != null) {
            list4 = (List) aVar.mo90299d();
        }
        intent.putExtra("KEY_PARAMS", new OperationFilter(j, j2, list, list2, list3, (String) null, bigDecimal, bigDecimal2, z0, num, list4));
        C41238w wVar = C41238w.f97225a;
        setResult(-1, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final void m102062w3(HashSet hashSet) {
        StringBuilder sb = new StringBuilder();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Object f = ((C41224m) it.next()).mo95680f();
            sb.append(f + ", ");
        }
        m102060u3(sb);
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        Input input = eVar.f90451e;
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "displayText.toString()");
        input.setInputText(sb2);
    }

    /* renamed from: x3 */
    private final void m102063x3() {
        C37648e eVar = this.f83938H;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f90455i.setOnClickListener(new C39227s(this));
        eVar.f90453g.setOnClickListener(new C39228t(this));
        eVar.f90452f.setOnClickListener(new C39229u(this, eVar));
        eVar.f90454h.setOnClickListener(new C39230v(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m102064y3(StatementsFilterActivity statementsFilterActivity, View view) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        statementsFilterActivity.m102061v3();
        statementsFilterActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m102065z3(StatementsFilterActivity statementsFilterActivity, View view) {
        C41536l.m120489i(statementsFilterActivity, "this$0");
        statementsFilterActivity.m102047h3();
        statementsFilterActivity.setResult(0);
        statementsFilterActivity.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C37648e d = C37648e.m110685d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f83938H = d;
        C37648e eVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        C37648e eVar2 = this.f83938H;
        if (eVar2 == null) {
            C41536l.m120506z("binding");
            eVar2 = null;
        }
        eVar2.f90446E.setOnRefreshListener(new C39225q(this));
        m102043d3();
        m102007F3();
        m102017K3();
        m102063x3();
        C37648e eVar3 = this.f83938H;
        if (eVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            eVar = eVar3;
        }
        eVar.f90464r.setOnChipActivatedChangedListener(this.f83945O);
        m102053n3();
    }

    public void onBackPressed() {
        m102047h3();
        setResult(0);
        super.onBackPressed();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C37358d.statements_filter_activity_title);
        C41536l.m120488h(string, "getString(R.string.state…ts_filter_activity_title)");
        return string;
    }
}
