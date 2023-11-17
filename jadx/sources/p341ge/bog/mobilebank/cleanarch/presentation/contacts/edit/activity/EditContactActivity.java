package p341ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.C11398b;
import g91.C32297d;
import g91.C32303f;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import q10.C27672a;
import q10.C27673b;
import q81.C38163b;
import r10.C27880a;
import t10.C28296a;
import t10.C28297b;
import t10.C28298c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity */
public final class EditContactActivity extends C30772sa {

    /* renamed from: J */
    public static final C21608a f57737J = new C21608a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f57738F = C41219i.m119470b(new C21623j(this));
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C27880a f57739G = new C27880a(false, 1, (DefaultConstructorMarker) null);

    /* renamed from: H */
    private final C41217g f57740H = new C1617p0(C41520a0.m120436b(EditContactViewModel.class), new C21626m(this), new C21625l(this), new C21627n((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C38163b f57741I;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$a */
    public static final class C21608a {
        private C21608a() {
        }

        public /* synthetic */ C21608a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53954a(Context context, long j) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, EditContactActivity.class);
            intent.putExtra("EDIT_CONTACT_ID", j);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$b */
    static final class C21609b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactActivity f57742d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$b$a */
        static final class C21610a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ EditContactActivity f57743d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21610a(EditContactActivity editContactActivity) {
                super(1);
                this.f57743d = editContactActivity;
            }

            /* renamed from: a */
            public final void mo53956a(String str) {
                C41536l.m120489i(str, "accountNumber");
                EditContactActivity editContactActivity = this.f57743d;
                editContactActivity.m69922Q2(str, editContactActivity.m69925T2().mo53989lx());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo53956a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$b$b */
        static final class C21611b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ EditContactActivity f57744d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21611b(EditContactActivity editContactActivity) {
                super(2);
                this.f57744d = editContactActivity;
            }

            /* renamed from: a */
            public final void mo53957a(String str, View view) {
                C41536l.m120489i(view, "view");
                this.f57744d.m69929X2(str, C10328q.edit_contact_hint_info, 33222, view, true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo53957a((String) obj, (View) obj2);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$b$c */
        static final class C21612c extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ EditContactActivity f57745d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21612c(EditContactActivity editContactActivity) {
                super(2);
                this.f57745d = editContactActivity;
            }

            /* renamed from: a */
            public final void mo53958a(String str, View view) {
                C41536l.m120489i(view, "view");
                this.f57745d.m69929X2(str, C10328q.edit_contact_hint_full_name, 33221, view, false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo53958a((String) obj, (View) obj2);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$b$d */
        static final class C21613d extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ EditContactActivity f57746d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21613d(EditContactActivity editContactActivity) {
                super(0);
                this.f57746d = editContactActivity;
            }

            public final void invoke() {
                this.f57746d.m69925T2().mo53990mx();
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$b$e */
        static final class C21614e extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ EditContactActivity f57747d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21614e(EditContactActivity editContactActivity) {
                super(1);
                this.f57747d = editContactActivity;
            }

            /* renamed from: a */
            public final void mo53959a(View view) {
                C41536l.m120489i(view, "view");
                EditContactActivity editContactActivity = this.f57747d;
                editContactActivity.m69928W2(view, editContactActivity.m69925T2().mo53989lx());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo53959a((View) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$b$f */
        static final class C21615f extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ EditContactActivity f57748d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21615f(EditContactActivity editContactActivity) {
                super(2);
                this.f57748d = editContactActivity;
            }

            /* renamed from: a */
            public final void mo53960a(String str, View view) {
                C41536l.m120489i(view, "view");
                this.f57748d.m69930Y2(str, view);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo53960a((String) obj, (View) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21609b(EditContactActivity editContactActivity) {
            super(1);
            this.f57742d = editContactActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            EditContactActivity editContactActivity = this.f57742d;
            C41536l.m120488h(bool, "isBudgetContact");
            C27880a aVar = new C27880a(bool.booleanValue());
            EditContactActivity editContactActivity2 = this.f57742d;
            aVar.mo67419O(new C21610a(editContactActivity2));
            aVar.mo67416L(new C21611b(editContactActivity2));
            aVar.mo67415K(new C21612c(editContactActivity2));
            aVar.mo67412G(new C21613d(editContactActivity2));
            aVar.mo67418N(new C21614e(editContactActivity2));
            aVar.mo67417M(new C21615f(editContactActivity2));
            editContactActivity.f57739G = aVar;
            this.f57742d.m69926U2().setAdapter(this.f57742d.f57739G);
            this.f57742d.m69927V2();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$c */
    static final class C21616c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactActivity f57749d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21616c(EditContactActivity editContactActivity) {
            super(1);
            this.f57749d = editContactActivity;
        }

        /* renamed from: a */
        public final void mo53961a(C28297b bVar) {
            C27880a H2 = this.f57749d.f57739G;
            C41536l.m120488h(bVar, "it");
            H2.mo67421Q(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53961a((C28297b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$d */
    static final class C21617d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactActivity f57750d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21617d(EditContactActivity editContactActivity) {
            super(1);
            this.f57750d = editContactActivity;
        }

        /* renamed from: a */
        public final void mo53962a(C28298c cVar) {
            C27880a H2 = this.f57750d.f57739G;
            C41536l.m120488h(cVar, "it");
            H2.mo67422R(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53962a((C28298c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$e */
    static final class C21618e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactActivity f57751d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21618e(EditContactActivity editContactActivity) {
            super(1);
            this.f57751d = editContactActivity;
        }

        /* renamed from: a */
        public final void mo53963a(List list) {
            C27880a H2 = this.f57751d.f57739G;
            C41536l.m120488h(list, "it");
            H2.mo67420P(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53963a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$f */
    /* synthetic */ class C21619f extends C41535k implements C43075l {
        C21619f(Object obj) {
            super(1, obj, C27880a.class, "addAccount", "addAccount(Lge/bog/mobilebank/cleanarch/presentation/contacts/edit/model/AccountItem;)V", 0);
        }

        /* renamed from: b */
        public final void mo53964b(C28296a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C27880a) this.receiver).mo67411F(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53964b((C28296a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$g */
    /* synthetic */ class C21620g extends C41535k implements C43075l {
        C21620g(Object obj) {
            super(1, obj, C27880a.class, "deleteAccount", "deleteAccount(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo53965b(String str) {
            C41536l.m120489i(str, "p0");
            ((C27880a) this.receiver).mo67413H(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53965b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$h */
    static final class C21621h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactActivity f57752d;

        /* renamed from: e */
        final /* synthetic */ EditContactActivity f57753e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21621h(EditContactActivity editContactActivity, EditContactActivity editContactActivity2) {
            super(1);
            this.f57752d = editContactActivity;
            this.f57753e = editContactActivity2;
        }

        /* renamed from: a */
        public final void mo53966a(C21503d dVar) {
            C41536l.m120489i(dVar, "it");
            if (dVar instanceof C21503d.C21506c) {
                EditContactActivity editContactActivity = this.f57752d;
                EditContactActivity editContactActivity2 = this.f57753e;
                Object a = dVar.mo53701a();
                C41536l.m120486f(a);
                C32297d.m95160h(editContactActivity, editContactActivity2.getString(((Number) a).intValue()));
            } else if (dVar instanceof C21503d.C21504a) {
                this.f57753e.mo52674G1((C21503d.C21504a) dVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53966a((C21503d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$i */
    static final class C21622i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactActivity f57754d;

        /* renamed from: e */
        final /* synthetic */ EditContactActivity f57755e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21622i(EditContactActivity editContactActivity, EditContactActivity editContactActivity2) {
            super(1);
            this.f57754d = editContactActivity;
            this.f57755e = editContactActivity2;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final void m69950f(EditContactActivity editContactActivity) {
            C41536l.m120489i(editContactActivity, "this$0");
            C35388f2.m105072l2(editContactActivity, editContactActivity.getString(C10328q.edit_contact_delete_photo_dialog_title), editContactActivity.getString(C10328q.edit_contact_delete_photo_text), editContactActivity.getString(C10328q.f28966r2), editContactActivity.getString(C10328q.f28951b2), new C21630c(editContactActivity), new C21631d(), false, false, (String) null, (View.OnClickListener) null, 896, (Object) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final void m69951g(EditContactActivity editContactActivity, View view) {
            C41536l.m120489i(editContactActivity, "this$0");
            editContactActivity.m69925T2().mo53980ax();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final void m69952h(View view) {
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m69953i(EditContactActivity editContactActivity, DialogInterface dialogInterface) {
            C41536l.m120489i(editContactActivity, "this$0");
            editContactActivity.f57741I = null;
        }

        /* renamed from: e */
        public final void mo53967e(boolean z) {
            C38163b bVar;
            if (z) {
                bVar = new C38163b(this.f57754d, new int[]{1, 2, 3});
                bVar.mo91690j(new Runnable[]{null, new C21628a(this.f57755e)});
            } else {
                bVar = new C38163b(this.f57754d);
            }
            this.f57755e.f57741I = bVar;
            bVar.mo91685e(C10328q.edit_contact_camera_request_text);
            bVar.mo91691k(C10328q.edit_contact_storage_request_text);
            bVar.mo91686f(C10328q.edit_contact_choose_from_gallery);
            bVar.mo91687g(C10328q.edit_contact_take_new_photo);
            bVar.mo91688h(C10328q.f28933O1);
            bVar.mo91689i(C10318g.contact_menu_delete_item_color);
            bVar.setOnDismissListener(new C21629b(this.f57755e));
            bVar.show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53967e(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$j */
    static final class C21623j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ EditContactActivity f57756d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21623j(EditContactActivity editContactActivity) {
            super(0);
            this.f57756d = editContactActivity;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f57756d.findViewById(C10322k.f28712Br);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$k */
    static final class C21624k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f57757a;

        C21624k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f57757a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f57757a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f57757a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$l */
    public static final class C21625l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57758d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21625l(ComponentActivity componentActivity) {
            super(0);
            this.f57758d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f57758d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$m */
    public static final class C21626m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21626m(ComponentActivity componentActivity) {
            super(0);
            this.f57759d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57759d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.activity.EditContactActivity$n */
    public static final class C21627n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57760d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f57761e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21627n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f57760d = aVar;
            this.f57761e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57760d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57761e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: D0 */
    private final void m69909D0() {
        m69925T2().mo53983fx().mo4819k(this, new C21624k(new C21609b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final void m69922Q2(String str, boolean z) {
        C41224m mVar;
        if (z) {
            mVar = C41233s.m119492a(getString(C10328q.contact_treasury_code_delete_popup), getString(C10328q.contact_treasury_code_delete_confirm));
        } else {
            mVar = C41233s.m119492a(getString(C10328q.contact_account_delete_title), getString(C10328q.contact_account_delete_alert_msg));
        }
        String str2 = str;
        C35388f2.m105072l2(this, (String) mVar.mo95675a(), (String) mVar.mo95676b(), getString(C10328q.f28966r2), getString(C10328q.f28951b2), new C27672a(this, str), new C27673b(), true, true, "Alert", (View.OnClickListener) null, C11398b.f33140s, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m69923R2(EditContactActivity editContactActivity, String str, View view) {
        C41536l.m120489i(editContactActivity, "this$0");
        C41536l.m120489i(str, "$acctNo");
        editContactActivity.m69925T2().mo53979Xw(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m69924S2(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final EditContactViewModel m69925T2() {
        return (EditContactViewModel) this.f57740H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final RecyclerView m69926U2() {
        Object value = this.f57738F.getValue();
        C41536l.m120488h(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final void m69927V2() {
        EditContactViewModel T2 = m69925T2();
        T2.mo53984gx().mo4819k(this, new C21624k(new C21616c(this)));
        T2.mo53985hx().mo4819k(this, new C21624k(new C21617d(this)));
        T2.mo53982ex().mo4819k(this, new C21624k(new C21618e(this)));
        C37224b.m109963b(T2.mo53981dx(), this, new C21619f(this.f57739G));
        C37224b.m109963b(T2.mo53986ix(), this, new C21620g(this.f57739G));
        C37224b.m109963b(T2.mo53988kx(), this, new C21621h(this, this));
        C37224b.m109963b(T2.mo53987jx(), this, new C21622i(this, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m69928W2(View view, boolean z) {
        WizardObject wizardObject;
        C35893a.C35894a a = C35893a.m106783a(this);
        if (z) {
            WizardObject inputType = new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_NUM_DIGIT);
            Resources resources = getResources();
            int i = C10328q.contact_treasury_wizard_title;
            wizardObject = inputType.setInputTitle(resources.getString(i)).setPageTitle(getResources().getString(i)).setValidatePattern("([0-9]{9})");
        } else {
            WizardObject inputType2 = new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
            Resources resources2 = getResources();
            int i2 = C10328q.f28961m2;
            wizardObject = inputType2.setInputTitle(resources2.getString(i2)).setPageTitle(getResources().getString(i2)).setValidatePattern("([a-zA-Z0-9]{6,})");
        }
        a.mo88134a(wizardObject).mo88136c(view).mo88138e(33223).mo88142i();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m69929X2(String str, int i, int i2, View view, boolean z) {
        C35893a.m106783a(this).mo88134a(new WizardObject().setValue(str).setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setAllowEmptyValue(z).setInputTitle(getString(i))).mo88136c(view).mo88138e(i2).mo88142i();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m69930Y2(String str, View view) {
        C35893a.m106783a(this).mo88137d(AdvancedWizardActivity.class).mo88134a(new WizardObject().setValue(str).setInputStyle(3).setInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE).setInputTitle(getString(C10328q.edit_contact_hint_phone_number)).setMobileNumberInputContactPermissionTextId(C10328q.money_request_msg_info_contacts_permission).setAllowEmptyValue(true).setShowMobileNumberIndexPrefix(Boolean.FALSE)).mo88136c(view).mo88139f(new BaseWizardPlugin()).mo88138e(1322).mo88142i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_edit_contact;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        long longExtra = getIntent().getLongExtra("EDIT_CONTACT_ID", -1);
        m69926U2().setLayoutManager(new LinearLayoutManager(this));
        m69925T2().mo53991nx(longExtra);
        m69909D0();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> arrayList;
        ArrayList<String> stringArrayListExtra;
        String stringExtra;
        String str;
        if (i2 == -1) {
            String str2 = null;
            if (intent != null) {
                arrayList = intent.getStringArrayListExtra("WIZARD_COLLECTED_VALUES");
            } else {
                arrayList = null;
            }
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("WIZARD_NEXT_BTN_CLICKED", false);
            }
            if (i == 139 || i == 140) {
                C38163b bVar = this.f57741I;
                if (bVar != null) {
                    if (intent != null) {
                        bVar.mo91683c(i, intent);
                    } else {
                        return;
                    }
                }
            } else if (i != 1322) {
                if (i != 10002) {
                    String str3 = "";
                    switch (i) {
                        case 33221:
                            if (z) {
                                if (arrayList != null) {
                                    str2 = (String) C41358y.m120009Y(arrayList);
                                }
                                EditContactViewModel T2 = m69925T2();
                                if (str2 != null) {
                                    str3 = str2;
                                }
                                T2.mo53976Ow(str3);
                                break;
                            }
                            break;
                        case 33222:
                            if (z) {
                                if (arrayList != null) {
                                    str2 = (String) C41358y.m120009Y(arrayList);
                                }
                                EditContactViewModel T22 = m69925T2();
                                if (str2 != null) {
                                    str3 = str2;
                                }
                                T22.mo53977Rw(str3);
                                break;
                            }
                            break;
                        case 33223:
                            if (!(!z || arrayList == null || (str = (String) C41358y.m120009Y(arrayList)) == null)) {
                                m69925T2().mo53975Lw(str);
                                break;
                            }
                    }
                } else if (!(intent == null || (stringExtra = intent.getStringExtra("CROPPED_PATH")) == null)) {
                    m69925T2().mo53992ox(stringExtra);
                }
            } else if (z) {
                if (!(intent == null || (stringArrayListExtra = intent.getStringArrayListExtra(BaseWizardPlugin.WIZARD_DATA)) == null)) {
                    str2 = (String) C41358y.m120009Y(stringArrayListExtra);
                }
                m69925T2().mo53978Uw(str2);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C38163b bVar;
        C41536l.m120489i(strArr, "permissions");
        C41536l.m120489i(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (C32303f.m95190a(iArr) && (bVar = this.f57741I) != null) {
            bVar.mo91684d(i);
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.contact_search_header);
        C41536l.m120488h(string, "getString(R.string.contact_search_header)");
        return string;
    }
}
