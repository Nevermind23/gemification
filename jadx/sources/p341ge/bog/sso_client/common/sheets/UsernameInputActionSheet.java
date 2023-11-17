package p341ge.bog.sso_client.common.sheets;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10220y;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import na1.C26393a;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.strength.StrengthView;
import p341ge.bog.sso_client.models.Rule;
import p349ah.C9860d;
import p603si.C17796a;
import ua1.C28677r1;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: ge.bog.sso_client.common.sheets.UsernameInputActionSheet */
public final class UsernameInputActionSheet extends C9860d {

    /* renamed from: E */
    public static final C24677a f63545E = new C24677a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28677r1 f63546B;

    /* renamed from: C */
    private final C41217g f63547C = C41219i.m119469a(C41222k.SYNCHRONIZED, new C24679c(this, (C41806a) null, (C43064a) null));

    /* renamed from: D */
    private final C41217g f63548D = C41219i.m119469a(C41222k.NONE, new C24681e(this, (C41806a) null, (C43064a) null, new C24680d(this), (C43064a) null));

    /* renamed from: ge.bog.sso_client.common.sheets.UsernameInputActionSheet$Rules */
    private static final class Rules implements Parcelable {
        public static final Parcelable.Creator<Rules> CREATOR = new C24676a();

        /* renamed from: d */
        private final List f63549d;

        /* renamed from: ge.bog.sso_client.common.sheets.UsernameInputActionSheet$Rules$a */
        public static final class C24676a implements Parcelable.Creator {
            /* renamed from: a */
            public final Rules createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                }
                return new Rules(arrayList);
            }

            /* renamed from: b */
            public final Rules[] newArray(int i) {
                return new Rules[i];
            }
        }

        public Rules(List list) {
            C41536l.m120489i(list, "rules");
            this.f63549d = list;
        }

        /* renamed from: a */
        public final List mo63060a() {
            return this.f63549d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rules) && C41536l.m120484d(this.f63549d, ((Rules) obj).f63549d);
        }

        public int hashCode() {
            return this.f63549d.hashCode();
        }

        public String toString() {
            return "Rules(rules=" + this.f63549d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            List<Rule> list = this.f63549d;
            parcel.writeInt(list.size());
            for (Rule writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: ge.bog.sso_client.common.sheets.UsernameInputActionSheet$a */
    public static final class C24677a {
        private C24677a() {
        }

        public /* synthetic */ C24677a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final UsernameInputActionSheet mo63070a(List list, String str) {
            C41536l.m120489i(list, "rules");
            C41536l.m120489i(str, "username");
            UsernameInputActionSheet usernameInputActionSheet = new UsernameInputActionSheet();
            usernameInputActionSheet.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_RULES", new Rules(list)), C41233s.m119492a("PARAM_USERNAME", str)));
            return usernameInputActionSheet;
        }
    }

    /* renamed from: ge.bog.sso_client.common.sheets.UsernameInputActionSheet$b */
    public static final class C24678b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ UsernameInputActionSheet f63550d;

        public C24678b(UsernameInputActionSheet usernameInputActionSheet) {
            this.f63550d = usernameInputActionSheet;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (str != null) {
                this.f63550d.m79188j2().mo65629iw(str);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.sso_client.common.sheets.UsernameInputActionSheet$c */
    public static final class C24679c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f63551d;

        /* renamed from: e */
        final /* synthetic */ C41806a f63552e;

        /* renamed from: f */
        final /* synthetic */ C43064a f63553f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24679c(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f63551d = componentCallbacks;
            this.f63552e = aVar;
            this.f63553f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f63551d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f63552e, this.f63553f);
        }
    }

    /* renamed from: ge.bog.sso_client.common.sheets.UsernameInputActionSheet$d */
    public static final class C24680d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24680d(Fragment fragment) {
            super(0);
            this.f63554d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f63554d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: ge.bog.sso_client.common.sheets.UsernameInputActionSheet$e */
    public static final class C24681e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63555d;

        /* renamed from: e */
        final /* synthetic */ C41806a f63556e;

        /* renamed from: f */
        final /* synthetic */ C43064a f63557f;

        /* renamed from: g */
        final /* synthetic */ C43064a f63558g;

        /* renamed from: h */
        final /* synthetic */ C43064a f63559h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24681e(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f63555d = fragment;
            this.f63556e = aVar;
            this.f63557f = aVar2;
            this.f63558g = aVar3;
            this.f63559h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f63555d, this.f63556e, this.f63557f, this.f63558g, C41520a0.m120436b(C26393a.class), this.f63559h);
        }
    }

    /* renamed from: h2 */
    private final void m79186h2() {
        m79188j2().mo65631lw().mo4819k(this, new C24693g(this));
        m79188j2().mo65630kw().mo4819k(this, new C24694h(this));
    }

    /* renamed from: i2 */
    private final C10146d0.C10172e m79187i2() {
        return (C10146d0.C10172e) this.f63547C.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final C26393a m79188j2() {
        return (C26393a) this.f63548D.getValue();
    }

    /* renamed from: k2 */
    private final void m79189k2(C28677r1 r1Var) {
        if (r1Var.f72915f.mo35918a()) {
            Bundle bundle = new Bundle();
            bundle.putString("UsernameInputActionSheet.USER_NAME_INPUT_TEXT", r1Var.f72915f.getInputText());
            C41238w wVar = C41238w.f97225a;
            C1533o.m5445b(this, "UsernameInputActionSheet.RESULT_TAG_USERNAME_INPUT", bundle);
            mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m79190l2(UsernameInputActionSheet usernameInputActionSheet, C28677r1 r1Var, View view) {
        C41536l.m120489i(usernameInputActionSheet, "this$0");
        C41536l.m120489i(r1Var, "$binding");
        usernameInputActionSheet.m79189k2(r1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m79191m2(List list) {
        Boolean bool;
        boolean z;
        Input input;
        StrengthView strengthView;
        C28677r1 r1Var = this.f63546B;
        if (!(r1Var == null || (strengthView = r1Var.f72916g) == null)) {
            strengthView.setStatusList(list);
        }
        C28677r1 r1Var2 = this.f63546B;
        Button button = null;
        if (r1Var2 == null || (input = r1Var2.f72915f) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(input.mo35918a());
        }
        C28677r1 r1Var3 = this.f63546B;
        if (r1Var3 != null) {
            button = r1Var3.f72914e;
        }
        if (button != null) {
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            button.setEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final void m79192n2(List list) {
        String str;
        C28677r1 r1Var = this.f63546B;
        if (r1Var != null) {
            Input input = r1Var.f72915f;
            C41536l.m120488h(input, "usernameInput");
            Input.m50261f(input, new C17796a(list, (C17796a.C17797a) null, 2, (DefaultConstructorMarker) null), false, false, false, 14, (Object) null);
            StrengthView strengthView = r1Var.f72916g;
            C10195g0 g = m79187i2().mo26716g();
            if (g == null || (str = g.mo26763a("text.username.politics.header", new Object[0])) == null) {
                str = getString(C10220y.username_should_rules_multiple);
            }
            strengthView.setTitle(str);
        }
    }

    /* renamed from: o2 */
    private final void m79193o2(Input input) {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("PARAM_USERNAME")) == null) {
            str = "";
        }
        input.getTextInput().setText(str);
        input.getTextInput().addTextChangedListener(new C24678b(this));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        List list;
        Rules rules;
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        Bundle arguments = getArguments();
        if (arguments == null || (rules = (Rules) arguments.getParcelable("PARAM_RULES")) == null || (list = rules.mo63060a()) == null) {
            list = C41341q.m119907j();
        }
        C28677r1 d = C28677r1.m87824d(layoutInflater, viewGroup, true);
        this.f63546B = d;
        C41536l.m120486f(d);
        mo26370a2(getString(C10220y.common_text_username));
        m79188j2().mo65632qw(list);
        C26393a.m82487jw(m79188j2(), (String) null, 1, (Object) null);
        m79186h2();
        d.f72914e.setEnabled(false);
        d.f72914e.setOnClickListener(new C24692f(this, d));
        Input input = d.f72915f;
        C41536l.m120488h(input, "binding.usernameInput");
        m79193o2(input);
        d.f72915f.requestFocus();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f63546B = null;
    }
}
