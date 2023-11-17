package p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel;
import wo0.C18655e;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.c */
public interface C15252c {

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.c$a */
    public static final class C15253a implements C15252c {

        /* renamed from: a */
        private final C15254b f43628a;

        /* renamed from: b */
        private boolean f43629b;

        public C15253a(C15254b bVar) {
            C41536l.m120489i(bVar, "textFormatter");
            this.f43628a = bVar;
        }

        /* renamed from: a */
        public void mo42313a(Input input, boolean z) {
            C41536l.m120489i(input, "<this>");
            if (C41536l.m120484d(C32343x.m95388F("text.p2p.link.customize.link.empty.error", new Object[0]), input.getInfoText())) {
                input.setInfoText(this.f43628a.mo42315a(C32343x.m95388F("text.p2p.link.customize.link.nickname.exp", new Object[0])));
                return;
            }
            boolean z2 = true;
            if (z) {
                input.setInfoText(input.getContext().getString(C18655e.f52257a));
                this.f43629b = true;
                return;
            }
            Editable text = input.getTextInput().getText();
            C41536l.m120488h(text, "textInput.text");
            if (text.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                Editable text2 = input.getTextInput().getText();
                C41536l.m120488h(text2, "textInput.text");
                if (!C40439w.m117118v(text2)) {
                    return;
                }
            }
            input.setInfoText(this.f43628a.mo42315a(C32343x.m95388F("text.p2p.link.customize.link.nickname.exp", new Object[0])));
            this.f43629b = false;
        }

        /* renamed from: b */
        public void mo42314b(Input input, P2PLinkGenerationViewModel$ViewModel.C15239a aVar) {
            boolean z;
            boolean z2;
            C41536l.m120489i(input, "<this>");
            C41536l.m120489i(aVar, "state");
            boolean z3 = true;
            if (aVar.mo42293g().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (input.getInputText().length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && this.f43629b) {
                    input.setInfoText(input.getContext().getString(C18655e.f52257a));
                    return;
                }
            }
            if (!aVar.mo42290e()) {
                if (aVar.mo42293g().length() <= 0) {
                    z3 = false;
                }
                if (z3) {
                    input.setInfoText(aVar.mo42293g());
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.c$b */
    public interface C15254b {

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.c$b$a */
        public static final class C15255a implements C15254b {

            /* renamed from: a */
            public static final C15256a f43630a = new C15256a((DefaultConstructorMarker) null);

            /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.c$b$a$a */
            public static final class C15256a {
                private C15256a() {
                }

                public /* synthetic */ C15256a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* renamed from: a */
            public CharSequence mo42315a(String str) {
                C41536l.m120489i(str, "text");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                int X = C40440x.m117156X(str, ":", 0, false, 6, (Object) null);
                if (X != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(1), 0, X, 33);
                }
                return spannableStringBuilder;
            }
        }

        /* renamed from: a */
        CharSequence mo42315a(String str);
    }

    /* renamed from: a */
    void mo42313a(Input input, boolean z);

    /* renamed from: b */
    void mo42314b(Input input, P2PLinkGenerationViewModel$ViewModel.C15239a aVar);
}
