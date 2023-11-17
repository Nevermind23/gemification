package p341ge.bog.mobilebank.linksharing.presentation.link;

import ap0.C10133f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.link.c */
public interface C15178c {

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.c$a */
    public static abstract class C15179a implements C15178c {

        /* renamed from: a */
        public static final C15180a f43505a = new C15180a((DefaultConstructorMarker) null);

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.c$a$a */
        public static final class C15180a {
            private C15180a() {
            }

            public /* synthetic */ C15180a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: b */
        public int mo42224b() {
            return -1;
        }

        /* renamed from: c */
        public boolean mo42225c() {
            return false;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.c$b */
    public static final class C15181b extends C15179a {

        /* renamed from: b */
        public static final C15181b f43506b = new C15181b();

        private C15181b() {
        }

        /* renamed from: a */
        public void mo42223a(C15183d dVar) {
            C41536l.m120489i(dVar, "state");
            dVar.mo42226A();
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.c$c */
    public static final class C15182c extends C15179a {

        /* renamed from: b */
        public static final C15182c f43507b = new C15182c();

        private C15182c() {
        }

        /* renamed from: a */
        public void mo42223a(C15183d dVar) {
            C41536l.m120489i(dVar, "state");
            dVar.mo42227a();
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.c$d */
    public interface C15183d {

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.c$d$a */
        public static final class C15184a implements C15183d {

            /* renamed from: a */
            private final C10133f f43508a;

            public C15184a(C10133f fVar) {
                C41536l.m120489i(fVar, "binding");
                this.f43508a = fVar;
            }

            /* renamed from: A */
            public void mo42226A() {
                this.f43508a.f28095r.mo53596d();
            }

            /* renamed from: a */
            public void mo42227a() {
                this.f43508a.f28095r.mo53597e();
            }

            /* renamed from: b */
            public void mo42228b(CreditCardSmallPickerView.C13279b bVar, int i, String str, String str2, boolean z, boolean z2) {
                float f;
                int i2;
                int i3;
                int i4;
                C41536l.m120489i(bVar, "accountPickerData");
                C41536l.m120489i(str, "cardPickerTitle");
                C41536l.m120489i(str2, "link");
                C10133f fVar = this.f43508a;
                fVar.f28092o.setCreditCard(bVar);
                fVar.f28092o.setTitleText(str);
                CreditCardSmallPickerView creditCardSmallPickerView = fVar.f28092o;
                float f2 = 1.0f;
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.46f;
                }
                creditCardSmallPickerView.setAlpha(f);
                InlineFeedback inlineFeedback = fVar.f28087j;
                int i5 = 0;
                if (!C41536l.m120484d(bVar, CreditCardSmallPickerView.C13279b.C13280a.f39265a) || !z2) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                inlineFeedback.setVisibility(i2);
                fVar.f28096s.setText(str2);
                fVar.f28082e.setEnabled(z);
                fVar.f28083f.setEnabled(z);
                ListItem listItem = fVar.f28090m;
                if (!z2 || !z) {
                    f2 = 0.46f;
                }
                listItem.setAlpha(f2);
                fVar.f28092o.setEnabled(z2);
                Button button = fVar.f28082e;
                C41536l.m120488h(button, "buttonCopy");
                if (z2) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                button.setVisibility(i3);
                Button button2 = fVar.f28083f;
                C41536l.m120488h(button2, "buttonShare");
                if (z2) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                button2.setVisibility(i4);
                InlineFeedback inlineFeedback2 = fVar.f28088k;
                C41536l.m120488h(inlineFeedback2, "feedbackLink");
                if (!(!z2)) {
                    i5 = 8;
                }
                inlineFeedback2.setVisibility(i5);
                fVar.f28095r.mo53595c();
            }
        }

        /* renamed from: A */
        void mo42226A();

        /* renamed from: a */
        void mo42227a();

        /* renamed from: b */
        void mo42228b(CreditCardSmallPickerView.C13279b bVar, int i, String str, String str2, boolean z, boolean z2);
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.c$e */
    public static final class C15185e extends C15179a {

        /* renamed from: b */
        private final CreditCardSmallPickerView.C13279b f43509b;

        /* renamed from: c */
        private final int f43510c;

        /* renamed from: d */
        private final String f43511d;

        /* renamed from: e */
        private final String f43512e;

        /* renamed from: f */
        private final boolean f43513f;

        /* renamed from: g */
        private final boolean f43514g;

        public C15185e(CreditCardSmallPickerView.C13279b bVar, int i, String str, String str2, boolean z, boolean z2) {
            C41536l.m120489i(bVar, "accountPickerData");
            C41536l.m120489i(str, "cardPickerTitle");
            C41536l.m120489i(str2, "link");
            this.f43509b = bVar;
            this.f43510c = i;
            this.f43511d = str;
            this.f43512e = str2;
            this.f43513f = z;
            this.f43514g = z2;
        }

        /* renamed from: a */
        public void mo42223a(C15183d dVar) {
            C41536l.m120489i(dVar, "state");
            dVar.mo42228b(this.f43509b, this.f43510c, this.f43511d, this.f43512e, this.f43513f, this.f43514g);
        }

        /* renamed from: b */
        public int mo42224b() {
            return this.f43510c;
        }

        /* renamed from: c */
        public boolean mo42225c() {
            return true;
        }
    }

    /* renamed from: a */
    void mo42223a(C15183d dVar);

    /* renamed from: b */
    int mo42224b();

    /* renamed from: c */
    boolean mo42225c();
}
