package p341ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p366bk.C10328q;
import p881ru.C28092a;
import p881ru.C28095d;
import p881ru.C28097f;
import p881ru.C28098g;
import p881ru.C28099h;
import p881ru.C28100i;
import p881ru.C28101j;
import p881ru.C28103l;
import p881ru.C28105m;
import p881ru.C28107o;
import p891su.C28261a;
import p891su.C28263c;
import p891su.C28271f;
import s10.C28122a;
import t10.C28296a;
import t10.C28298c;
import ue1.C43075l;
import v10.C28960a;
import v10.C28961b;
import v10.C28962c;
import v10.C28963d;
import v10.C28964e;
import v10.C28965f;
import v10.C28966g;
import v10.C28967h;
import v10.C28968i;
import v10.C28969j;
import v10.C28970k;
import v10.C28971l;
import v10.C28972m;
import v10.C28973n;
import v10.C28974o;
import v10.C28975p;
import v10.C28976q;
import v10.C28977r;
import v10.C28978s;
import v10.C28979t;
import v10.C28980u;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel */
public final class EditContactViewModel extends C21481a {

    /* renamed from: d */
    private final C28092a f57765d;

    /* renamed from: e */
    private final C28095d f57766e;

    /* renamed from: f */
    private final C28098g f57767f;

    /* renamed from: g */
    private final C28099h f57768g;

    /* renamed from: h */
    private final C28100i f57769h;

    /* renamed from: i */
    private final C28107o f57770i;

    /* renamed from: j */
    private final C28097f f57771j;

    /* renamed from: k */
    private final C40767b f57772k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f57773l = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f57774m = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f57775n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f57776o = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f57777p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1644x f57778q = new C1644x();

    /* renamed from: r */
    private final C1644x f57779r = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1644x f57780s = new C1644x();

    /* renamed from: t */
    private long f57781t = -1;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$a */
    static final class C21632a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28103l f57782d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21632a(C28103l lVar) {
            super(1);
            this.f57782d = lVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "it");
            return this.f57782d.mo67637b(l.longValue()).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$b */
    static final class C21633b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57783d;

        /* renamed from: e */
        final /* synthetic */ C28122a f57784e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21633b(EditContactViewModel editContactViewModel, C28122a aVar) {
            super(1);
            this.f57783d = editContactViewModel;
            this.f57784e = aVar;
        }

        /* renamed from: a */
        public final void mo53994a(C28261a aVar) {
            this.f57783d.f57780s.mo4826r(Boolean.valueOf(aVar.mo67864t()));
            C1644x Hw = this.f57783d.f57773l;
            C28122a aVar2 = this.f57784e;
            C41536l.m120488h(aVar, "it");
            Hw.mo4826r(aVar2.mo67657d(aVar));
            this.f57783d.f57774m.mo4826r(this.f57784e.mo67656c(aVar));
            this.f57783d.f57775n.mo4826r(new ArrayList(this.f57784e.mo67655b(aVar)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53994a((C28261a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$c */
    static final class C21634c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21634c f57785d = new C21634c();

        C21634c() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$d */
    static final class C21635d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28101j f57786d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21635d(C28101j jVar) {
            super(1);
            this.f57786d = jVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "it");
            return this.f57786d.mo67636a(l.longValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$e */
    static final class C21636e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57787d;

        /* renamed from: e */
        final /* synthetic */ C28122a f57788e;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$e$a */
        static final class C21637a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C28263c f57789d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21637a(C28263c cVar) {
                super(1);
                this.f57789d = cVar;
            }

            /* renamed from: a */
            public final Boolean invoke(C28296a aVar) {
                C41536l.m120489i(aVar, "account");
                return Boolean.valueOf(C41536l.m120484d(aVar.mo67926a(), ((C28263c.C28265b) this.f57789d).mo67878b()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21636e(EditContactViewModel editContactViewModel, C28122a aVar) {
            super(1);
            this.f57787d = editContactViewModel;
            this.f57788e = aVar;
        }

        /* renamed from: a */
        public final void mo53997a(C28263c cVar) {
            ArrayList arrayList;
            if (cVar instanceof C28263c.C28265b) {
                ArrayList arrayList2 = (ArrayList) this.f57787d.f57775n.mo4814f();
                if (arrayList2 != null) {
                    EditContactViewModel editContactViewModel = this.f57787d;
                    boolean unused = C41352v.m119961F(arrayList2, new C21637a(cVar));
                    editContactViewModel.f57777p.mo4826r(new C37223a(((C28263c.C28265b) cVar).mo67878b()));
                }
            } else if ((cVar instanceof C28263c.C28264a) && (arrayList = (ArrayList) this.f57787d.f57775n.mo4814f()) != null) {
                C28122a aVar = this.f57788e;
                EditContactViewModel editContactViewModel2 = this.f57787d;
                C28296a a = aVar.mo67654a(((C28263c.C28264a) cVar).mo67877b());
                arrayList.add(a);
                editContactViewModel2.f57776o.mo4826r(new C37223a(a));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53997a((C28263c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$f */
    static final class C21638f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57790d;

        /* renamed from: e */
        final /* synthetic */ C28122a f57791e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21638f(EditContactViewModel editContactViewModel, C28122a aVar) {
            super(1);
            this.f57790d = editContactViewModel;
            this.f57791e = aVar;
        }

        /* renamed from: a */
        public final void mo53999a(C28271f.C28273b bVar) {
            this.f57790d.f57774m.mo4823o(this.f57791e.mo67656c(bVar.mo67884a()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53999a((C28271f.C28273b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$g */
    static final class C21639g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57792d;

        /* renamed from: e */
        final /* synthetic */ C28122a f57793e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21639g(EditContactViewModel editContactViewModel, C28122a aVar) {
            super(1);
            this.f57792d = editContactViewModel;
            this.f57793e = aVar;
        }

        /* renamed from: a */
        public final void mo54000a(C28271f.C28274c cVar) {
            this.f57792d.f57773l.mo4823o(this.f57793e.mo67657d(cVar.mo67884a()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54000a((C28271f.C28274c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$h */
    static final class C21640h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57794d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21640h(EditContactViewModel editContactViewModel) {
            super(1);
            this.f57794d = editContactViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57794d.f57778q.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$i */
    static final class C21641i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57795d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21641i(EditContactViewModel editContactViewModel) {
            super(1);
            this.f57795d = editContactViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57795d.f57778q.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$j */
    static final class C21642j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57796d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21642j(EditContactViewModel editContactViewModel) {
            super(1);
            this.f57796d = editContactViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57796d.f57778q.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$k */
    static final class C21643k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57797d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21643k(EditContactViewModel editContactViewModel) {
            super(1);
            this.f57797d = editContactViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57797d.f57778q.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$l */
    static final class C21644l extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21644l f57798d = new C21644l();

        C21644l() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(ArrayList arrayList) {
            C41536l.m120488h(arrayList, "it");
            return arrayList;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$m */
    static final class C21645m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21645m(EditContactViewModel editContactViewModel) {
            super(1);
            this.f57799d = editContactViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57799d.f57778q.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$n */
    static final class C21646n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21646n(EditContactViewModel editContactViewModel) {
            super(1);
            this.f57800d = editContactViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57800d.f57778q.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel$o */
    static final class C21647o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditContactViewModel f57801d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21647o(EditContactViewModel editContactViewModel) {
            super(1);
            this.f57801d = editContactViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f57801d.f57778q.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditContactViewModel(C28103l lVar, C28101j jVar, C28122a aVar, C28092a aVar2, C28095d dVar, C28098g gVar, C28099h hVar, C28100i iVar, C28105m mVar, C28107o oVar, C28097f fVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(lVar, "getContactByIdUseCase");
        C41536l.m120489i(jVar, "getAccountEvent");
        C41536l.m120489i(aVar, "contactItemsMapper");
        C41536l.m120489i(aVar2, "addAccountToContact");
        C41536l.m120489i(dVar, "deleteContactAccount");
        C41536l.m120489i(gVar, "editContactName");
        C41536l.m120489i(hVar, "editContactNickname");
        C41536l.m120489i(iVar, "editContactPhone");
        C41536l.m120489i(mVar, "getContactEvent");
        C41536l.m120489i(oVar, "setProfilePicture");
        C41536l.m120489i(fVar, "deleteProfilePicture");
        this.f57765d = aVar2;
        this.f57766e = dVar;
        this.f57767f = gVar;
        this.f57768g = hVar;
        this.f57769h = iVar;
        this.f57770i = oVar;
        this.f57771j = fVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Long>()");
        this.f57772k = h1;
        C41205b G0 = h1.mo94989L0(new C28961b(new C21632a(lVar))).mo95027o0(C40992a.m118827a()).mo94983G0(new C28962c(new C21633b(this, aVar)), new C28963d(C21634c.f57785d));
        C41536l.m120488h(G0, "contactIdSubject.switchM…\n\n            }\n        )");
        addDisposable(G0);
        C41205b F0 = h1.mo94989L0(new C28964e(new C21635d(jVar))).mo95027o0(C40992a.m118827a()).mo94981F0(new C28965f(new C21636e(this, aVar)));
        C41536l.m120488h(F0, "contactIdSubject.switchM…          }\n            }");
        addDisposable(F0);
        C41205b F02 = mVar.mo67639a().mo95030q0(C28271f.C28273b.class).mo94981F0(new C28966g(new C21638f(this, aVar)));
        C41536l.m120488h(F02, "getContactEvent().ofType…t.contact))\n            }");
        addDisposable(F02);
        C41205b F03 = mVar.mo67639a().mo95030q0(C28271f.C28274c.class).mo94981F0(new C28967h(new C21639g(this, aVar)));
        C41536l.m120488h(F03, "getContactEvent().ofType…t.contact))\n            }");
        addDisposable(F03);
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m69956Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final C40754t m69957Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m69958Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m69959Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final void m69967Mw(EditContactViewModel editContactViewModel) {
        int i;
        C41536l.m120489i(editContactViewModel, "this$0");
        C1644x xVar = editContactViewModel.f57778q;
        if (editContactViewModel.mo53989lx()) {
            i = C10328q.contact_treasury_code_add_successful;
        } else {
            i = C10328q.contact_account_add_successfull;
        }
        xVar.mo4826r(new C37223a(new C21503d.C21506c(Integer.valueOf(i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final void m69968Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Pw */
    public static final void m69969Pw(EditContactViewModel editContactViewModel) {
        C41536l.m120489i(editContactViewModel, "this$0");
        editContactViewModel.f57778q.mo4826r(new C37223a(new C21503d.C21506c(Integer.valueOf(C10328q.contact_successful_transaction))));
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public static final void m69970Qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final void m69971Sw(EditContactViewModel editContactViewModel) {
        C41536l.m120489i(editContactViewModel, "this$0");
        editContactViewModel.f57778q.mo4826r(new C37223a(new C21503d.C21506c(Integer.valueOf(C10328q.contact_successful_transaction))));
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public static final void m69972Tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vw */
    public static final void m69973Vw(EditContactViewModel editContactViewModel) {
        C41536l.m120489i(editContactViewModel, "this$0");
        editContactViewModel.f57778q.mo4826r(new C37223a(new C21503d.C21506c(Integer.valueOf(C10328q.contact_successful_transaction))));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final void m69974Ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Yw */
    public static final void m69975Yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public static final void m69976Zw(EditContactViewModel editContactViewModel) {
        int i;
        C41536l.m120489i(editContactViewModel, "this$0");
        C1644x xVar = editContactViewModel.f57778q;
        if (editContactViewModel.mo53989lx()) {
            i = C10328q.contact_treasury_code_delete_successful;
        } else {
            i = C10328q.contact_account_delete_successful;
        }
        xVar.mo4826r(new C37223a(new C21503d.C21506c(Integer.valueOf(i))));
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static final void m69977bx(EditContactViewModel editContactViewModel) {
        C41536l.m120489i(editContactViewModel, "this$0");
        editContactViewModel.f57778q.mo4826r(new C37223a(new C21503d.C21506c(Integer.valueOf(C10328q.edit_contact_alert_photo_deleted_successfully))));
    }

    /* access modifiers changed from: private */
    /* renamed from: cx */
    public static final void m69978cx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: px */
    public static final void m69992px(EditContactViewModel editContactViewModel) {
        C41536l.m120489i(editContactViewModel, "this$0");
        editContactViewModel.f57778q.mo4826r(new C37223a(new C21503d.C21506c(Integer.valueOf(C10328q.edit_contact_alert_photo_changed_successfully))));
    }

    /* access modifiers changed from: private */
    /* renamed from: qx */
    public static final void m69994qx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final C40754t m70002yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m70003zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Lw */
    public final void mo53975Lw(String str) {
        C41536l.m120489i(str, "accountNumber");
        C41205b G = this.f57765d.mo67628a(this.f57781t, str).mo94906z(C40992a.m118827a()).mo94888G(new C28977r(this), new C28978s(new C21640h(this)));
        C41536l.m120488h(G, "fun addAccount(accountNu…       })\n        )\n    }");
        addDisposable(G);
    }

    /* renamed from: Ow */
    public final void mo53976Ow(String str) {
        C41536l.m120489i(str, "fullName");
        C41205b G = this.f57767f.mo67633a(this.f57781t, str).mo94906z(C40992a.m118827a()).mo94888G(new C28960a(this), new C28971l(new C21641i(this)));
        C41536l.m120488h(G, "fun changeContactName(fu…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* renamed from: Rw */
    public final void mo53977Rw(String str) {
        C41536l.m120489i(str, "nickName");
        C41205b G = this.f57768g.mo67634a(this.f57781t, str).mo94906z(C40992a.m118827a()).mo94888G(new C28979t(this), new C28980u(new C21642j(this)));
        C41536l.m120488h(G, "fun changeContactNicknam…      })\n        )\n\n    }");
        addDisposable(G);
    }

    /* renamed from: Uw */
    public final void mo53978Uw(String str) {
        C41205b G = this.f57769h.mo67635a(this.f57781t, str).mo94906z(C40992a.m118827a()).mo94888G(new C28968i(this), new C28969j(new C21643k(this)));
        C41536l.m120488h(G, "fun changePhoneNumber(ph…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* renamed from: Xw */
    public final void mo53979Xw(String str) {
        C41536l.m120489i(str, "accountNumber");
        C41205b G = this.f57766e.mo67630a(this.f57781t, str).mo94906z(C40992a.m118827a()).mo94888G(new C28973n(this), new C28974o(new C21645m(this)));
        C41536l.m120488h(G, "fun deleteAccount(accoun…       })\n        )\n    }");
        addDisposable(G);
    }

    /* renamed from: ax */
    public final void mo53980ax() {
        C41205b G = this.f57771j.mo67632a(this.f57781t).mo94906z(C40992a.m118827a()).mo94888G(new C28970k(this), new C28972m(new C21646n(this)));
        C41536l.m120488h(G, "fun deleteProfilePicture…       })\n        )\n    }");
        addDisposable(G);
    }

    /* renamed from: dx */
    public final LiveData mo53981dx() {
        return this.f57776o;
    }

    /* renamed from: ex */
    public final LiveData mo53982ex() {
        return C1607m0.m5655c(this.f57775n, C21644l.f57798d);
    }

    /* renamed from: fx */
    public final LiveData mo53983fx() {
        return this.f57780s;
    }

    /* renamed from: gx */
    public final LiveData mo53984gx() {
        return this.f57774m;
    }

    /* renamed from: hx */
    public final LiveData mo53985hx() {
        return this.f57773l;
    }

    /* renamed from: ix */
    public final LiveData mo53986ix() {
        return this.f57777p;
    }

    /* renamed from: jx */
    public final LiveData mo53987jx() {
        return this.f57779r;
    }

    /* renamed from: kx */
    public final LiveData mo53988kx() {
        return this.f57778q;
    }

    /* renamed from: lx */
    public final boolean mo53989lx() {
        return C41536l.m120484d(this.f57780s.mo4814f(), Boolean.TRUE);
    }

    /* renamed from: mx */
    public final void mo53990mx() {
        C28298c cVar = (C28298c) this.f57773l.mo4814f();
        if (cVar != null) {
            this.f57779r.mo4826r(new C37223a(Boolean.valueOf(cVar.mo67941b())));
        }
    }

    /* renamed from: nx */
    public final void mo53991nx(long j) {
        this.f57781t = j;
        this.f57772k.onNext(Long.valueOf(j));
    }

    /* renamed from: ox */
    public final void mo53992ox(String str) {
        C41536l.m120489i(str, "imagePath");
        C41205b G = this.f57770i.mo67642a(this.f57781t, new File(str)).mo94906z(C40992a.m118827a()).mo94888G(new C28975p(this), new C28976q(new C21647o(this)));
        C41536l.m120488h(G, "fun setProfileImage(imag…       })\n        )\n    }");
        addDisposable(G);
    }
}
