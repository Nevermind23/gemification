package p341ge.bog.mobilebank.consumerloanapplication.presentation.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import c90.C19590g0;
import c90.C19611k0;
import c90.C19650u;
import g90.C20783e;
import g90.C20784f;
import g91.C32343x;
import h80.C24901h;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import o90.C26801g;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.domain.lookup.model.Country;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.OrganizationUiModel;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p420fh.C12902d;
import p420fh.C12910e;
import p547oi.C17199a;
import p629uh.C18167d;
import ue1.C43064a;
import ue1.C43075l;
import z80.C30237a;
import z80.C30239b;
import z80.C30241c;
import z80.C30243d;
import z80.C30244e;
import z80.C30245f;
import z80.C30246g;
import z80.C30247h;
import z80.C30248i;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity */
public final class AddIncomeActivity extends C22611b {

    /* renamed from: K */
    public static final C22549a f59645K = new C22549a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C26801g.C26807c f59646G;

    /* renamed from: H */
    private final C41217g f59647H = C41219i.m119470b(new C22551c(this));

    /* renamed from: I */
    private final C41217g f59648I = new C1617p0(C41520a0.m120436b(C26801g.class), new C22565q(this), new C22567s(this), new C22566r((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C24901h f59649J;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$a */
    public static final class C22549a {
        private C22549a() {
        }

        public /* synthetic */ C22549a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55958a(Activity activity, FormData formData, C0173b bVar, String str) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(formData, "data");
            C41536l.m120489i(bVar, "launcher");
            Intent intent = new Intent(activity, AddIncomeActivity.class);
            intent.putExtra("EXTRA_DATA", formData);
            intent.putExtra("EXTRA_MIN_AMOUNT", str);
            bVar.mo404a(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$b */
    public /* synthetic */ class C22550b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59650a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                g90.f[] r0 = g90.C20784f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                g90.f r1 = g90.C20784f.ORGANIZATION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                g90.f r1 = g90.C20784f.JOB_POSITION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                g90.f r1 = g90.C20784f.COUNTRY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f59650a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity.C22550b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$c */
    static final class C22551c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59651d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22551c(AddIncomeActivity addIncomeActivity) {
            super(0);
            this.f59651d = addIncomeActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getExtras();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity r0 = r2.f59651d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0017
                android.os.Bundle r0 = r0.getExtras()
                if (r0 == 0) goto L_0x0017
                java.lang.String r1 = "EXTRA_DATA"
                android.os.Parcelable r0 = r0.getParcelable(r1)
                ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData r0 = (p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData) r0
                goto L_0x0018
            L_0x0017:
                r0 = 0
            L_0x0018:
                kotlin.jvm.internal.C41536l.m120486f(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity.C22551c.invoke():ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData");
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$d */
    static final class C22552d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59652d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22552d(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59652d = addIncomeActivity;
        }

        /* renamed from: a */
        public final void mo55960a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C19590g0.f53892P.mo47818a(this.f59652d.m73142X2().mo66096qw().mo66056Sd()).mo4576A1(this.f59652d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55960a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$e */
    static final class C22553e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22553e(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59653d = addIncomeActivity;
        }

        /* renamed from: a */
        public final void mo55961a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C19611k0.f53924P.mo47829a(this.f59653d.m73142X2().mo66096qw().mo66058dt()).mo4576A1(this.f59653d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55961a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$f */
    static final class C22554f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22554f(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59654d = addIncomeActivity;
        }

        /* renamed from: a */
        public final void mo55962a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f59654d.m73148d3(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f59654d.m73149e3((List) ((C31128a.C31131c) aVar).mo71340a());
                this.f59654d.m73148d3(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f59654d.m73148d3(false);
                C24901h O2 = this.f59654d.f59649J;
                if (O2 == null) {
                    C41536l.m120506z("binding");
                    O2 = null;
                }
                CardView cardView = O2.f63958u;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f59654d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55962a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$g */
    static final class C22555g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22555g(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59655d = addIncomeActivity;
        }

        /* renamed from: a */
        public final void mo55963a(List list) {
            AddIncomeActivity addIncomeActivity = this.f59655d;
            C41536l.m120488h(list, "incomeFields");
            addIncomeActivity.m73150f3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55963a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$h */
    static final class C22556h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22556h(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59656d = addIncomeActivity;
        }

        /* renamed from: a */
        public final void mo55964a(Country country) {
            C24901h O2 = this.f59656d.f59649J;
            if (O2 == null) {
                C41536l.m120506z("binding");
                O2 = null;
            }
            Input input = O2.f63946i;
            String a = country.mo55935a();
            if (a == null) {
                a = "";
            }
            input.setInputText(a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55964a((Country) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$i */
    static final class C22557i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22557i(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59657d = addIncomeActivity;
        }

        /* renamed from: a */
        public final void mo55965a(LookupUiModel lookupUiModel) {
            C24901h O2 = this.f59657d.f59649J;
            if (O2 == null) {
                C41536l.m120506z("binding");
                O2 = null;
            }
            O2.f63954q.setInputText(C32343x.m95388F(lookupUiModel.mo52391a(), new Object[0]));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55965a((LookupUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$j */
    static final class C22558j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22558j(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59658d = addIncomeActivity;
        }

        /* renamed from: a */
        public final void mo55966a(String str) {
            C24901h O2 = this.f59658d.f59649J;
            if (O2 == null) {
                C41536l.m120506z("binding");
                O2 = null;
            }
            Input input = O2.f63951n;
            C41536l.m120488h(str, "organization");
            input.setInputText(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55966a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$k */
    static final class C22559k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22559k(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59659d = addIncomeActivity;
        }

        /* renamed from: a */
        public final void mo55967a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C12910e.m48790h(this.f59659d, C32343x.m95388F("applications.CL.income.min.amount.validation.failed", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
            C24901h O2 = this.f59659d.f59649J;
            if (O2 == null) {
                C41536l.m120506z("binding");
                O2 = null;
            }
            O2.f63944g.mo35920c();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55967a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$l */
    static final class C22560l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22560l(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59660d = addIncomeActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C24901h O2 = this.f59660d.f59649J;
            if (O2 == null) {
                C41536l.m120506z("binding");
                O2 = null;
            }
            Button button = O2.f63942e.getButton();
            C41536l.m120488h(bool, "isFilled");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$m */
    static final class C22561m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22561m(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59661d = addIncomeActivity;
        }

        /* renamed from: a */
        public final void mo55969a(FormData formData) {
            C41536l.m120489i(formData, "formData");
            this.f59661d.m73140U2(formData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55969a((FormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$n */
    static final class C22562n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22562n(AddIncomeActivity addIncomeActivity) {
            super(1);
            this.f59662d = addIncomeActivity;
        }

        /* renamed from: a */
        public final void mo55970a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C19650u.f53978P.mo47851a(this.f59662d.m73142X2().mo66096qw().mo66054H7()).mo4576A1(this.f59662d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55970a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$o */
    static final class C22563o implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f59663a;

        C22563o(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f59663a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f59663a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f59663a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$p */
    public static final class C22564p implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59664d;

        public C22564p(AddIncomeActivity addIncomeActivity) {
            this.f59664d = addIncomeActivity;
        }

        public void afterTextChanged(Editable editable) {
            this.f59664d.m73142X2().mo66096qw().mo66057b2(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$q */
    public static final class C22565q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22565q(ComponentActivity componentActivity) {
            super(0);
            this.f59665d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59665d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$r */
    public static final class C22566r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59666d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59667e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22566r(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59666d = aVar;
            this.f59667e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59666d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59667e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$s */
    static final class C22567s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddIncomeActivity f59668d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity$s$a */
        static final class C22568a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ AddIncomeActivity f59669d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22568a(AddIncomeActivity addIncomeActivity) {
                super(0);
                this.f59669d = addIncomeActivity;
            }

            /* renamed from: b */
            public final C26801g invoke() {
                String str;
                Bundle extras;
                C26801g.C26807c W2 = this.f59669d.mo55957W2();
                FormData P2 = this.f59669d.m73141V2();
                Intent intent = this.f59669d.getIntent();
                if (intent == null || (extras = intent.getExtras()) == null || (str = extras.getString("EXTRA_MIN_AMOUNT")) == null) {
                    str = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
                }
                return W2.mo32536a(P2, str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22567s(AddIncomeActivity addIncomeActivity) {
            super(0);
            this.f59668d = addIncomeActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C22568a(this.f59668d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m73140U2(FormData formData) {
        Intent intent = new Intent();
        intent.putExtra("RESULT_EXTRA_DATA", formData);
        C41238w wVar = C41238w.f97225a;
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final FormData m73141V2() {
        return (FormData) this.f59647H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final C26801g m73142X2() {
        return (C26801g) this.f59648I.getValue();
    }

    /* renamed from: Y2 */
    private final void m73143Y2() {
        C24901h hVar = this.f59649J;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        LinearLayout linearLayout = hVar.f63945h;
        C41536l.m120488h(linearLayout, "country");
        C32343x.m95455i0(linearLayout);
        LinearLayout linearLayout2 = hVar.f63950m;
        C41536l.m120488h(linearLayout2, "organization");
        C32343x.m95455i0(linearLayout2);
        LinearLayout linearLayout3 = hVar.f63953p;
        C41536l.m120488h(linearLayout3, "position");
        C32343x.m95455i0(linearLayout3);
    }

    /* renamed from: Z2 */
    private final void m73144Z2() {
        m73142X2().mo66101vw().mo66089z().mo4819k(this, new C22563o(new C22554f(this)));
        m73142X2().mo66101vw().mo66080Lm().mo4819k(this, new C22563o(new C22555g(this)));
        m73142X2().mo66101vw().mo66085s8().mo4819k(this, new C22563o(new C22556h(this)));
        m73142X2().mo66101vw().mo66086uk().mo4819k(this, new C22563o(new C22557i(this)));
        m73142X2().mo66101vw().mo66081cm().mo4819k(this, new C22563o(new C22558j(this)));
        C37224b.m109963b(m73142X2().mo66101vw().mo66087x8(), this, new C22559k(this));
        m73142X2().mo66101vw().mo66088yf().mo4819k(this, new C22563o(new C22560l(this)));
        C37224b.m109963b(m73142X2().mo66101vw().mo66082k7(), this, new C22561m(this));
        C37224b.m109963b(m73142X2().mo66101vw().mo66083p9(), this, new C22562n(this));
        C37224b.m109963b(m73142X2().mo66101vw().mo66084q5(), this, new C22552d(this));
        C37224b.m109963b(m73142X2().mo66098sw(), this, new C22553e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m73145a3(AddIncomeActivity addIncomeActivity, String str, Bundle bundle) {
        C41536l.m120489i(addIncomeActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        Country country = (Country) bundle.getParcelable("SELECT_INCOME_COUNTRY_RESULT_KEY");
        if (country != null) {
            addIncomeActivity.m73142X2().mo66096qw().mo66061uu(country);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m73146b3(AddIncomeActivity addIncomeActivity, String str, Bundle bundle) {
        C41536l.m120489i(addIncomeActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        LookupUiModel lookupUiModel = (LookupUiModel) bundle.getParcelable("SELECT_INCOME_POSITION_RESULT_KEY");
        if (lookupUiModel != null) {
            addIncomeActivity.m73142X2().mo66096qw().mo66059l3(lookupUiModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m73147c3(AddIncomeActivity addIncomeActivity, String str, Bundle bundle) {
        C41536l.m120489i(addIncomeActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        OrganizationUiModel organizationUiModel = (OrganizationUiModel) bundle.getParcelable("SELECT_INCOME_ORGANIZATION_RESULT_KEY");
        if (organizationUiModel != null) {
            addIncomeActivity.m73142X2().mo66096qw().mo66064yq(organizationUiModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m73148d3(boolean z) {
        C24901h hVar = this.f59649J;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        CardView cardView = hVar.f63956s;
        C41536l.m120488h(cardView, "binding.progressBar");
        C32343x.m95483r1(cardView, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m73149e3(List list) {
        C24901h hVar = this.f59649J;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        hVar.f63948k.mo35190t();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20783e eVar = (C20783e) it.next();
            Chip chip = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(C32343x.m95388F(eVar.mo49353a().mo52391a(), new Object[0]));
            chip.setEnabled(true);
            chip.setChipType(C18167d.CHOICE_CHIP);
            chip.setActivated(eVar.mo49354b());
            C24901h hVar2 = this.f59649J;
            if (hVar2 == null) {
                C41536l.m120506z("binding");
                hVar2 = null;
            }
            hVar2.f63948k.mo35183o(chip);
            arrayList.add(chip);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m73150f3(List list) {
        m73143Y2();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = C22550b.f59650a[((C20784f) it.next()).ordinal()];
            C24901h hVar = null;
            if (i == 1) {
                C24901h hVar2 = this.f59649J;
                if (hVar2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    hVar = hVar2;
                }
                LinearLayout linearLayout = hVar.f63950m;
                C41536l.m120488h(linearLayout, "binding.organization");
                C32343x.m95447f1(linearLayout);
            } else if (i == 2) {
                C24901h hVar3 = this.f59649J;
                if (hVar3 == null) {
                    C41536l.m120506z("binding");
                } else {
                    hVar = hVar3;
                }
                LinearLayout linearLayout2 = hVar.f63953p;
                C41536l.m120488h(linearLayout2, "binding.position");
                C32343x.m95447f1(linearLayout2);
            } else if (i == 3) {
                C24901h hVar4 = this.f59649J;
                if (hVar4 == null) {
                    C41536l.m120506z("binding");
                } else {
                    hVar = hVar4;
                }
                LinearLayout linearLayout3 = hVar.f63945h;
                C41536l.m120488h(linearLayout3, "binding.country");
                C32343x.m95447f1(linearLayout3);
            }
        }
    }

    /* renamed from: g3 */
    private final void m73151g3() {
        C24901h hVar = this.f59649J;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        hVar.f63943f.setText(C32343x.m95388F("CLA.page.II.add.income.amount.field.label", new Object[0]));
        hVar.f63949l.setText(C32343x.m95388F("CLA.page.II.add.income.amount.explanatory.text", new Object[0]));
        hVar.f63944g.setHintText((CharSequence) C32343x.m95388F("CLA.page.II.add.income.amount.field.input", new Object[0]));
        hVar.f63952o.setText(C32343x.m95388F("CLA.page.II.add.income.organization.field.label", new Object[0]));
        hVar.f63951n.setHintText((CharSequence) C32343x.m95388F("CLA.page.II.add.income.organization.field.input", new Object[0]));
        hVar.f63955r.setText(C32343x.m95388F("CLA.page.II.add.income.position.field.label", new Object[0]));
        hVar.f63954q.setHintText((CharSequence) C32343x.m95388F("CLA.page.II.add.income.position.field.input", new Object[0]));
        hVar.f63947j.setText(C32343x.m95388F("CLA.page.II.add.income.country.field.label", new Object[0]));
        hVar.f63946i.setHintText((CharSequence) C32343x.m95388F("CLA.page.II.add.income.country.field.input", new Object[0]));
        hVar.f63942e.getButton().setButtonText(C32343x.m95388F("CLA.page.II.add.income.add.button", new Object[0]));
        hVar.f63944g.getTextInput().setInputType(8194);
        hVar.f63944g.getTextInput().setFilters(new InputFilter[]{new C17199a((String) null, 1, (DefaultConstructorMarker) null).mo44614b()});
        hVar.f63951n.setOnClickListener(new C30243d(this));
        hVar.f63954q.setOnClickListener(new C30244e(this));
        hVar.f63946i.setOnClickListener(new C30245f(this));
        hVar.f63942e.getButton().setOnClickListener(new C30246g(this, hVar));
        hVar.f63948k.setOnChipActivatedChangedListener(new C30247h(this));
        hVar.f63944g.getTextInput().addTextChangedListener(new C22564p(this));
        hVar.f63957t.mo3946b().setOnClickListener(new C30248i(hVar, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m73152h3(AddIncomeActivity addIncomeActivity, Chip chip, int i) {
        C41536l.m120489i(addIncomeActivity, "this$0");
        C41536l.m120489i(chip, "chip");
        if (chip.isActivated()) {
            addIncomeActivity.m73142X2().mo66096qw().mo66063y(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m73153i3(C24901h hVar, AddIncomeActivity addIncomeActivity, View view) {
        C41536l.m120489i(hVar, "$this_with");
        C41536l.m120489i(addIncomeActivity, "this$0");
        CardView cardView = hVar.f63958u;
        C41536l.m120488h(cardView, "retryButtonContainer");
        C32343x.m95455i0(cardView);
        C21481a.onRefresh$default(addIncomeActivity.m73142X2(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m73154j3(AddIncomeActivity addIncomeActivity, View view) {
        C41536l.m120489i(addIncomeActivity, "this$0");
        addIncomeActivity.m73142X2().mo66096qw().mo66055Oh();
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m73155k3(AddIncomeActivity addIncomeActivity, View view) {
        C41536l.m120489i(addIncomeActivity, "this$0");
        addIncomeActivity.m73142X2().mo66096qw().mo66062xg();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m73156l3(AddIncomeActivity addIncomeActivity, View view) {
        C41536l.m120489i(addIncomeActivity, "this$0");
        addIncomeActivity.m73142X2().mo66096qw().mo66065z8();
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m73157m3(AddIncomeActivity addIncomeActivity, C24901h hVar, View view) {
        C41536l.m120489i(addIncomeActivity, "this$0");
        C41536l.m120489i(hVar, "$this_with");
        addIncomeActivity.m73142X2().mo66096qw().mo66060l7(hVar.f63944g.getInputText());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C24901h d = C24901h.m79586d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f59649J = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m73144Z2();
        m73151g3();
        getSupportFragmentManager().mo4367F1("SELECT_INCOME_COUNTRY_REQUEST_KEY", this, new C30237a(this));
        getSupportFragmentManager().mo4367F1("SELECT_INCOME_POSITION_REQUEST_KEY", this, new C30239b(this));
        getSupportFragmentManager().mo4367F1("SELECT_INCOME_ORGANIZATION_REQUEST_KEY", this, new C30241c(this));
    }

    /* renamed from: W2 */
    public final C26801g.C26807c mo55957W2() {
        C26801g.C26807c cVar = this.f59646G;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        LookupUiModel h = m73141V2().mo56092h();
        return C32343x.m95388F(h != null ? h.mo52391a() : null, new Object[0]);
    }
}
