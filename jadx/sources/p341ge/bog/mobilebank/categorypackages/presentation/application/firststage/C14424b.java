package p341ge.bog.mobilebank.categorypackages.presentation.application.firststage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.C14446f;
import p413eo.C12727a0;
import p413eo.C12765q0;
import p413eo.C12772u;
import p413eo.C12774v;
import p413eo.C12776w;
import p413eo.C12778x;
import p413eo.C12780y;
import p413eo.C12782z;
import p511lo.C16634e;
import p511lo.C16635f;
import p511lo.C16636g;
import p596rp.C17712c;
import p596rp.C17713d;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b */
public final class C14424b extends C1819o {

    /* renamed from: f */
    private final C14430f f42188f;

    /* renamed from: g */
    private final C14429e f42189g;

    /* renamed from: h */
    private final C14431g f42190h;

    /* renamed from: i */
    private final C14432h f42191i;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$a */
    public static final class C14425a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12772u f42192d;

        /* renamed from: e */
        private final C14430f f42193e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14425a(C12772u uVar, C14430f fVar) {
            super(uVar.mo3946b());
            C41536l.m120489i(uVar, "binding");
            C41536l.m120489i(fVar, "onEmailInputClick");
            this.f42192d = uVar;
            this.f42193e = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m53388j(C14425a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            aVar.f42193e.invoke();
        }

        /* renamed from: i */
        public final void mo40591i(C14446f.C14447a aVar) {
            C41536l.m120489i(aVar, "data");
            C12772u uVar = this.f42192d;
            uVar.f37870e.setHintText((CharSequence) C32343x.m95388F("packages.application.I.email.field.label", new Object[0]));
            uVar.f37870e.getTextInput().setText(aVar.mo40623d());
            uVar.f37870e.setOnClickListener(new C16634e(this));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$b */
    public static final class C14426b implements TextWatcher {

        /* renamed from: d */
        private final C14431g f42194d;

        /* renamed from: e */
        private C14446f f42195e;

        public C14426b(C14431g gVar) {
            C41536l.m120489i(gVar, "onJobNameInput");
            this.f42194d = gVar;
        }

        /* renamed from: a */
        public final void mo40592a(C14446f fVar) {
            this.f42195e = fVar;
        }

        public void afterTextChanged(Editable editable) {
            if (this.f42195e != null) {
                this.f42194d.mo40573a(String.valueOf(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$c */
    public static final class C14427c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12774v f42196d;

        /* renamed from: e */
        private final C14426b f42197e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14427c(C12774v vVar, C14426b bVar) {
            super(vVar.mo3946b());
            C41536l.m120489i(vVar, "binding");
            C41536l.m120489i(bVar, "textWatcher");
            this.f42196d = vVar;
            this.f42197e = bVar;
            vVar.f37877e.getTextInput().addTextChangedListener(bVar);
        }

        /* renamed from: h */
        public final Input mo40596h(C14446f.C14448b bVar) {
            C41536l.m120489i(bVar, "data");
            Input input = this.f42196d.f37877e;
            this.f42197e.mo40592a((C14446f) null);
            input.getTextInput().setText(bVar.mo40627c());
            this.f42197e.mo40592a(bVar);
            input.getTextInput().setImeOptions(6);
            input.setHintText((CharSequence) C32343x.m95388F("packages.application.I.employer.field.label", new Object[0]));
            C41536l.m120488h(input, "with(binding) {\n        …)\n            }\n        }");
            return input;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$d */
    public static final class C14428d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12776w f42198d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14428d(C12776w wVar, C14429e eVar) {
            super(wVar.mo3946b());
            C41536l.m120489i(wVar, "binding");
            C41536l.m120489i(eVar, "onAddEmailInputClick");
            this.f42198d = wVar;
            wVar.f37881e.setOnClickListener(new C16635f(eVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m53393i(C14429e eVar, View view) {
            C41536l.m120489i(eVar, "$onAddEmailInputClick");
            eVar.invoke();
        }

        /* renamed from: j */
        public final void mo40597j() {
            C12776w wVar = this.f42198d;
            wVar.f37883g.setTitleText(C32343x.m95388F("packages.application.I.email.not.found", new Object[0]));
            wVar.f37881e.setButtonText(C32343x.m95388F("packages.application.I.email.add.new.button.label", new Object[0]));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$e */
    public interface C14429e {
        void invoke();
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$f */
    public interface C14430f {
        void invoke();
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$g */
    public interface C14431g {
        /* renamed from: a */
        void mo40573a(String str);
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$h */
    public interface C14432h {
        /* renamed from: a */
        void mo40576a(C17713d dVar);
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$i */
    public static final class C14433i extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12778x f42199d;

        /* renamed from: e */
        private final C14432h f42200e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14433i(C12778x xVar, C14432h hVar) {
            super(xVar.mo3946b());
            C41536l.m120489i(xVar, "binding");
            C41536l.m120489i(hVar, "onPaymentTypeSelected");
            this.f42199d = xVar;
            this.f42200e = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m53398j(C14433i iVar, C17713d dVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C41536l.m120489i(dVar, "$fee");
            iVar.f42200e.mo40576a(dVar);
        }

        /* renamed from: i */
        public final void mo40598i(C14446f.C14450d dVar) {
            boolean z;
            C41536l.m120489i(dVar, "data");
            this.f42199d.f37888e.removeAllViews();
            for (C17713d dVar2 : dVar.mo40633e()) {
                C12765q0 d = C12765q0.m48458d(LayoutInflater.from(this.itemView.getContext()), this.f42199d.f37888e, true);
                int i = 0;
                d.f37834f.setText(C32343x.m95388F(dVar2.mo45293c().mo45289e(), new Object[0]));
                d.f37834f.setTitle(C32343x.m95388F(dVar2.mo45293c().mo45288c(), new Object[0]) + " / " + C32343x.m95410Q(dVar2.mo45291a(), dVar2.mo45292b(), false, 2, (Object) null));
                C17712c f = dVar.mo40635f();
                if (f != null) {
                    RadioButtonView radioButtonView = d.f37835g;
                    if (f == dVar2.mo45293c()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    radioButtonView.setChecked(z);
                }
                d.mo3946b().setOnClickListener(new C16636g(this, dVar2));
                View view = d.f37833e;
                C41536l.m120488h(view, "divider");
                if (!(!C41536l.m120484d(C41358y.m120019i0(dVar.mo40633e()), dVar2))) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$j */
    public static final class C14434j extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12780y f42201d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14434j(C12780y yVar) {
            super(yVar.mo3946b());
            C41536l.m120489i(yVar, "binding");
            this.f42201d = yVar;
        }

        /* renamed from: h */
        public final void mo40599h(C14446f.C14451e eVar) {
            String str;
            C41536l.m120489i(eVar, "data");
            C12780y yVar = this.f42201d;
            TextView textView = yVar.f37894f;
            if (eVar.mo40638b().mo45293c() == C17712c.MONTHLY) {
                str = C32343x.m95388F("packages.application.I.payment.type.monthly.label", new Object[0]);
            } else {
                str = C32343x.m95388F("packages.application.I.payment.type.annual.label", new Object[0]);
            }
            textView.setText(str);
            yVar.f37893e.setText(C32343x.m95410Q(eVar.mo40638b().mo45291a(), eVar.mo40638b().mo45292b(), false, 2, (Object) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$k */
    public static final class C14435k extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12782z f42202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14435k(C12782z zVar) {
            super(zVar.mo3946b());
            C41536l.m120489i(zVar, "binding");
            this.f42202d = zVar;
        }

        /* renamed from: h */
        public final void mo40600h(C14446f.C14452f fVar) {
            C41536l.m120489i(fVar, "data");
            C12782z zVar = this.f42202d;
            zVar.f37898e.setEnabled(false);
            zVar.f37898e.getTextInput().setText(fVar.mo40642c());
            zVar.f37898e.setHintText((CharSequence) C32343x.m95388F("packages.application.I.phone.field.label", new Object[0]));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.b$l */
    public static final class C14436l extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12727a0 f42203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14436l(C12727a0 a0Var) {
            super(a0Var.mo3946b());
            C41536l.m120489i(a0Var, "binding");
            this.f42203d = a0Var;
        }

        /* renamed from: h */
        public final void mo40601h(C14446f.C14453g gVar) {
            C41536l.m120489i(gVar, "data");
            C12727a0 a0Var = this.f42203d;
            boolean z = false;
            a0Var.f37662e.setTitle(C32343x.m95388F(gVar.mo40647c(), new Object[0]));
            a0Var.f37662e.setText(C32343x.m95388F(gVar.mo40646b(), new Object[0]));
            EmptyWidget emptyWidget = a0Var.f37662e;
            if (gVar.mo40646b() != null) {
                z = true;
            }
            emptyWidget.setEnableTwoLineText(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14424b(C14430f fVar, C14429e eVar, C14431g gVar, C14432h hVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(fVar, "onEmailInputClick");
        C41536l.m120489i(eVar, "onAddEmailButtonClick");
        C41536l.m120489i(gVar, "onJobNameInput");
        C41536l.m120489i(hVar, "onPaymentTypeSelected");
        this.f42188f = fVar;
        this.f42189g = eVar;
        this.f42190h = gVar;
        this.f42191i = hVar;
    }

    public int getItemViewType(int i) {
        return ((C14446f) mo6026f().get(i)).mo40621a();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C14446f fVar = (C14446f) mo6026f().get(i);
        if (f0Var instanceof C14436l) {
            C41536l.m120487g(fVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageViewType.SectionHeader");
            ((C14436l) f0Var).mo40601h((C14446f.C14453g) fVar);
        } else if (f0Var instanceof C14435k) {
            C41536l.m120487g(fVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageViewType.PhoneNumber");
            ((C14435k) f0Var).mo40600h((C14446f.C14452f) fVar);
        } else if (f0Var instanceof C14425a) {
            C41536l.m120487g(fVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageViewType.Email");
            ((C14425a) f0Var).mo40591i((C14446f.C14447a) fVar);
        } else if (f0Var instanceof C14427c) {
            C41536l.m120487g(fVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageViewType.JobName");
            ((C14427c) f0Var).mo40596h((C14446f.C14448b) fVar);
        } else if (f0Var instanceof C14428d) {
            ((C14428d) f0Var).mo40597j();
        } else if (f0Var instanceof C14433i) {
            C41536l.m120487g(fVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageViewType.PaymentTypeChoice");
            ((C14433i) f0Var).mo40598i((C14446f.C14450d) fVar);
        } else if (f0Var instanceof C14434j) {
            C41536l.m120487g(fVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageViewType.PaymentTypeInfo");
            ((C14434j) f0Var).mo40599h((C14446f.C14451e) fVar);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C14446f.C14454h.SECTION_HEADER.ordinal()) {
            C12727a0 d = C12727a0.m48302d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(layoutInflater, parent, false)");
            return new C14436l(d);
        } else if (i == C14446f.C14454h.JOB_NAME_INPUT.ordinal()) {
            C12774v d2 = C12774v.m48496d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C14427c(d2, new C14426b(this.f42190h));
        } else if (i == C14446f.C14454h.PHONE_INPUT.ordinal()) {
            C12782z d3 = C12782z.m48528d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …  false\n                )");
            return new C14435k(d3);
        } else if (i == C14446f.C14454h.EMAIL_INPUT.ordinal()) {
            C12772u d4 = C12772u.m48488d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …  false\n                )");
            return new C14425a(d4, this.f42188f);
        } else if (i == C14446f.C14454h.NO_EMAIL.ordinal()) {
            C12776w d5 = C12776w.m48504d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(\n               …  false\n                )");
            return new C14428d(d5, this.f42189g);
        } else if (i == C14446f.C14454h.PAYMENT_TYPE_CHOICE.ordinal()) {
            C12778x d6 = C12778x.m48512d(from, viewGroup, false);
            C41536l.m120488h(d6, "inflate(\n               …  false\n                )");
            return new C14433i(d6, this.f42191i);
        } else if (i == C14446f.C14454h.PAYMENT_TYPE_INFO.ordinal()) {
            C12780y d7 = C12780y.m48520d(from, viewGroup, false);
            C41536l.m120488h(d7, "inflate(\n               …  false\n                )");
            return new C14434j(d7);
        } else {
            throw new IllegalStateException("Unknown view type");
        }
    }
}
