package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone;

import android.content.Intent;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import cf1.C40419j;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10328q;
import p773gv.C24815k;
import r20.C27885a;
import r20.C27886b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddByPhoneViewModel */
public final class AddByPhoneViewModel extends C21481a {

    /* renamed from: h */
    public static final C21814a f58193h = new C21814a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C24815k f58194d;

    /* renamed from: e */
    private final C1644x f58195e = new C1644x(Boolean.FALSE);

    /* renamed from: f */
    private final C1644x f58196f = new C1644x("");

    /* renamed from: g */
    private final C1644x f58197g = new C1644x("");

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddByPhoneViewModel$a */
    public static final class C21814a {
        private C21814a() {
        }

        public /* synthetic */ C21814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddByPhoneViewModel$b */
    static final class C21815b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21815b f58198d = new C21815b();

        C21815b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddByPhoneViewModel(C24815k kVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(kVar, "addReceiverByPhoneNumberUseCase");
        this.f58194d = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m70684gw() {
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final void m70685hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r1 != false) goto L_0x0030;
     */
    /* renamed from: nw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m70686nw() {
        /*
            r4 = this;
            androidx.lifecycle.x r0 = r4.f58195e
            androidx.lifecycle.x r1 = r4.f58196f
            java.lang.Object r1 = r1.mo4814f()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            if (r1 == 0) goto L_0x002f
            androidx.lifecycle.x r1 = r4.f58197g
            java.lang.Object r1 = r1.mo4814f()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x002b
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x002b
            r1 = r2
            goto L_0x002c
        L_0x002b:
            r1 = r3
        L_0x002c:
            if (r1 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r2 = r3
        L_0x0030:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.mo4826r(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddByPhoneViewModel.m70686nw():void");
    }

    /* renamed from: fw */
    public final void mo54391fw() {
        C24815k kVar = this.f58194d;
        Object f = this.f58197g.mo4814f();
        C41536l.m120486f(f);
        Object f2 = this.f58196f.mo4814f();
        C41536l.m120486f(f2);
        C41205b G = kVar.mo63227a((String) f, (String) f2).mo94888G(new C27885a(), new C27886b(C21815b.f58198d));
        C41536l.m120488h(G, "addReceiverByPhoneNumber…{ it.printStackTrace() })");
        addDisposable(G);
    }

    /* renamed from: iw */
    public final LiveData mo54392iw() {
        return this.f58196f;
    }

    /* renamed from: jw */
    public final LiveData mo54393jw() {
        return this.f58197g;
    }

    /* renamed from: kw */
    public final int mo54394kw(String str) {
        C41536l.m120489i(str, "id");
        int i = 0;
        for (WizardObject id : mo54395lw()) {
            if (C41536l.m120484d(id.getId(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: lw */
    public final ArrayList mo54395lw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WizardObject().setInputStyle(3).setInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE).setInputTitle(C32343x.m95452h0(C10328q.money_request_phone_number_wizard, new Object[0])).setValue((String) this.f58197g.mo4814f()).setId("PHONE_WIZARD"));
        arrayList.add(new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setInputTitle(C32343x.m95452h0(C10328q.money_request_name_wizard, new Object[0])).setValue((String) this.f58196f.mo4814f()).setId("NAME_WIZARD"));
        return arrayList;
    }

    /* renamed from: mw */
    public final LiveData mo54396mw() {
        return this.f58195e;
    }

    /* renamed from: ow */
    public final void mo54397ow(Intent intent) {
        ArrayList<String> arrayList;
        String str;
        String str2;
        if (intent != null) {
            arrayList = intent.getStringArrayListExtra(BaseWizardPlugin.WIZARD_DATA);
        } else {
            arrayList = null;
        }
        C1644x xVar = this.f58196f;
        String str3 = "";
        if (arrayList == null || (str = arrayList.get(mo54394kw("NAME_WIZARD"))) == null) {
            str = str3;
        }
        xVar.mo4826r(str);
        C1644x xVar2 = this.f58197g;
        boolean z = false;
        if (!(arrayList == null || (str2 = arrayList.get(mo54394kw("PHONE_WIZARD"))) == null)) {
            C41536l.m120488h(str2, "get(getWizardIndex(PHONE_WIZARD_ID))");
            if (new C40419j("([0-9]{9})").mo94489f(str2)) {
                z = true;
            }
        }
        if (z) {
            str3 = arrayList.get(mo54394kw("PHONE_WIZARD"));
        }
        xVar2.mo4826r(str3);
        m70686nw();
    }
}
