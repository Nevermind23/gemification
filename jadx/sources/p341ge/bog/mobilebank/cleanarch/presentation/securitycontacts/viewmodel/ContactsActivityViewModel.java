package p341ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel;

import a60.C19177a;
import a60.C19178b;
import a60.C19179c;
import a60.C19180d;
import a60.C19181e;
import a60.C19182f;
import a60.C19183g;
import a60.C19184h;
import a60.C19185i;
import a60.C19186j;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p748eu.C20292b;
import p758fu.C20557a;
import p773gv.C24833z;
import p870qt.C27863a;
import p881ru.C28096e;
import p881ru.C28105m;
import p881ru.C28106n;
import p891su.C28271f;
import p948xw.C29861a;
import pc0.C27494a;
import q30.C27677a;
import r30.C27895b;
import ue1.C43075l;
import y50.C29923a;
import y50.C29928b;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel */
public final class ContactsActivityViewModel extends C21481a {

    /* renamed from: u */
    public static final C22430b f59365u = new C22430b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final Client f59366d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C27677a f59367e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C24833z f59368f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C28106n f59369g;

    /* renamed from: h */
    private final C28096e f59370h;

    /* renamed from: i */
    private final C20292b f59371i;

    /* renamed from: j */
    private final C29861a f59372j;

    /* renamed from: k */
    private final C27863a f59373k;

    /* renamed from: l */
    private final C27494a f59374l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public List f59375m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f59376n = new C1644x();

    /* renamed from: o */
    private final C1644x f59377o = new C1644x();

    /* renamed from: p */
    private final C1644x f59378p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1644x f59379q = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1644x f59380r = new C1644x();

    /* renamed from: s */
    private final C40767b f59381s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f59382t;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel$a */
    static final class C22429a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivityViewModel f59383d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22429a(ContactsActivityViewModel contactsActivityViewModel) {
            super(1);
            this.f59383d = contactsActivityViewModel;
        }

        /* renamed from: a */
        public final void mo55413a(C28271f fVar) {
            C27895b b = this.f59383d.f59367e.mo67214b(fVar.mo67884a());
            if (fVar instanceof C28271f.C28275d) {
                this.f59383d.m72725cx(b);
            } else if (fVar instanceof C28271f.C28272a) {
                this.f59383d.m72720Tw(b);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55413a((C28271f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel$b */
    public static final class C22430b {
        private C22430b() {
        }

        public /* synthetic */ C22430b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel$c */
    static final class C22431c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivityViewModel f59384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22431c(ContactsActivityViewModel contactsActivityViewModel) {
            super(1);
            this.f59384d = contactsActivityViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            String str = (String) mVar.mo95675a();
            boolean booleanValue = ((Boolean) mVar.mo95676b()).booleanValue();
            if (C40439w.m117118v(str)) {
                return this.f59384d.f59369g.mo67641b(booleanValue, Long.valueOf(this.f59384d.f59382t)).mo95075O();
            }
            return this.f59384d.f59368f.mo63243b(str, booleanValue).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel$d */
    static final class C22432d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivityViewModel f59385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22432d(ContactsActivityViewModel contactsActivityViewModel) {
            super(1);
            this.f59385d = contactsActivityViewModel;
        }

        /* renamed from: a */
        public final void mo55415a(C41205b bVar) {
            C21484c.m69417i(this.f59385d.f59376n, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55415a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel$e */
    static final class C22433e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivityViewModel f59386d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22433e(ContactsActivityViewModel contactsActivityViewModel) {
            super(1);
            this.f59386d = contactsActivityViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59386d.f59376n, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel$f */
    static final class C22434f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivityViewModel f59387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22434f(ContactsActivityViewModel contactsActivityViewModel) {
            super(1);
            this.f59387d = contactsActivityViewModel;
        }

        /* renamed from: a */
        public final void mo55417a(List list) {
            ContactsActivityViewModel contactsActivityViewModel = this.f59387d;
            C27677a ow = contactsActivityViewModel.f59367e;
            C41536l.m120488h(list, "contactsData");
            List<C27895b> a = ow.mo67213a(list);
            ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (C27895b bVar : a) {
                C29928b bVar2 = new C29928b(bVar);
                bVar2.mo70239e(true);
                arrayList.add(bVar2);
            }
            contactsActivityViewModel.f59375m = C41358y.m119991B0(arrayList);
            C21484c.m69418j(this.f59387d.f59376n, this.f59387d.m72747yw());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55417a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel$g */
    static final class C22435g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivityViewModel f59388d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22435g(ContactsActivityViewModel contactsActivityViewModel) {
            super(1);
            this.f59388d = contactsActivityViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f59388d.f59379q.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel$h */
    static final class C22436h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27895b f59389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22436h(C27895b bVar) {
            super(1);
            this.f59389d = bVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C29928b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "it");
            if (((C27895b) bVar.mo70237c()).mo67439g() == this.f59389d.mo67439g()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel$i */
    static final class C22437i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivityViewModel f59390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22437i(ContactsActivityViewModel contactsActivityViewModel) {
            super(1);
            this.f59390d = contactsActivityViewModel;
        }

        /* renamed from: a */
        public final void mo55420a(C41205b bVar) {
            this.f59390d.f59380r.mo4823o(new C37223a(new C21503d.C21505b((Object) null, 1, (DefaultConstructorMarker) null)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55420a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel$j */
    static final class C22438j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ContactsActivityViewModel f59391d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22438j(ContactsActivityViewModel contactsActivityViewModel) {
            super(1);
            this.f59391d = contactsActivityViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f59391d.f59380r.mo4823o(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactsActivityViewModel(Client client, C27677a aVar, C24833z zVar, C28106n nVar, C28096e eVar, C28105m mVar, C20292b bVar, C29861a aVar2, C27863a aVar3, C27494a aVar4) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(client, "client");
        C41536l.m120489i(aVar, "contactMapper");
        C41536l.m120489i(zVar, "searchContactUseCase");
        C41536l.m120489i(nVar, "loadContactsUseCase");
        C41536l.m120489i(eVar, "deleteContact");
        C41536l.m120489i(mVar, "getContactEvent");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(aVar2, "trustOrUntrustContactUseCase");
        C41536l.m120489i(aVar3, "scaContactsLocalStorage");
        C41536l.m120489i(aVar4, "otpParamsMapBuilder");
        this.f59366d = client;
        this.f59367e = aVar;
        this.f59368f = zVar;
        this.f59369g = nVar;
        this.f59370h = eVar;
        this.f59371i = bVar;
        this.f59372j = aVar2;
        this.f59373k = aVar3;
        this.f59374l = aVar4;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Pair<String, Boolean>>()");
        this.f59381s = h1;
        if (client.isAuthorized()) {
            m72748zw();
            C41205b F0 = mVar.mo67639a().mo95027o0(C40992a.m118827a()).mo94981F0(new C19177a(new C22429a(this)));
            C41536l.m120488h(F0, "getContactEvent().observ…      }\n                }");
            addDisposable(F0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m72711Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m72712Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m72713Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final C40754t m72714Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Gw */
    private final int m72715Gw() {
        Double c;
        C20557a b = this.f59371i.mo48775b("SCA_CONTACTS_TRUST_SUGGESTION_ALL_CONTACTS_SHOW_COUNT");
        if (b == null || (c = b.mo49086c()) == null) {
            return 0;
        }
        return (int) c.doubleValue();
    }

    /* renamed from: Hw */
    private final int m72716Hw() {
        Double c;
        C20557a b = this.f59371i.mo48775b("SCA_CONTACTS_TRUST_SUGGESTION_ALL_CONTACTS_MIN_CONTACTS");
        if (b == null || (c = b.mo49086c()) == null) {
            return 0;
        }
        return (int) c.doubleValue();
    }

    /* renamed from: Pw */
    public static /* synthetic */ void m72717Pw(ContactsActivityViewModel contactsActivityViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        contactsActivityViewModel.mo55406Ow(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final void m72718Rw(ContactsActivityViewModel contactsActivityViewModel) {
        C41536l.m120489i(contactsActivityViewModel, "this$0");
        contactsActivityViewModel.f59379q.mo4826r(new C37223a(new C21503d.C21506c(C41238w.f97225a)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final void m72719Sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public final void m72720Tw(C27895b bVar) {
        if (this.f59376n.mo4814f() instanceof C21503d.C21506c) {
            List list = this.f59375m;
            if (list != null) {
                boolean unused = C41352v.m119961F(list, new C22436h(bVar));
            }
            C21484c.m69418j(this.f59376n, m72747yw());
        }
    }

    /* renamed from: Ww */
    private final boolean m72721Ww() {
        boolean z;
        int i;
        int i2;
        int i3;
        List list = this.f59375m;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !C27863a.f70989b.mo67390a()) {
            int Hw = m72716Hw();
            List list2 = this.f59375m;
            if (list2 != null) {
                i = list2.size();
            } else {
                i = 0;
            }
            List list3 = this.f59375m;
            if (list3 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object next : list3) {
                    if (((C27895b) ((C29928b) next).mo70237c()).mo67447n()) {
                        arrayList.add(next);
                    }
                }
                i2 = arrayList.size();
            } else {
                i2 = 0;
            }
            List list4 = this.f59375m;
            if (list4 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : list4) {
                    if (!((C27895b) ((C29928b) next2).mo70237c()).mo67447n()) {
                        arrayList2.add(next2);
                    }
                }
                i3 = arrayList2.size();
            } else {
                i3 = 0;
            }
            int b = this.f59373k.mo67388b();
            int Gw = m72715Gw();
            if (i > i2 && ((i3 >= Hw || Hw == 0) && b <= Gw)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public static final void m72722Zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public static final void m72723ax(ContactsActivityViewModel contactsActivityViewModel) {
        C41536l.m120489i(contactsActivityViewModel, "this$0");
        contactsActivityViewModel.f59380r.mo4823o(new C37223a(new C21503d.C21506c(C41238w.f97225a)));
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static final void m72724bx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: cx */
    public final void m72725cx(C27895b bVar) {
        List list;
        boolean z;
        if ((this.f59376n.mo4814f() instanceof C21503d.C21506c) && (list = this.f59375m) != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C27895b) ((C29928b) it.next()).mo70237c()).mo67439g() == bVar.mo67439g()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                C29928b bVar2 = (C29928b) list.get(i);
                List list2 = this.f59375m;
                if (list2 != null) {
                    C29928b bVar3 = new C29928b(bVar);
                    bVar3.mo70239e(bVar2.mo70238d());
                    C41238w wVar = C41238w.f97225a;
                    C29928b bVar4 = (C29928b) list2.set(i, bVar3);
                }
                C21484c.m69418j(this.f59376n, m72747yw());
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8 A[LOOP:4: B:46:0x00f2->B:48:0x00f8, LOOP_END] */
    /* renamed from: yw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List m72747yw() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.lifecycle.x r1 = r11.f59378p
            java.lang.Object r1 = r1.mo4814f()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L_0x0011
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x0011:
            boolean r1 = r1.booleanValue()
            r2 = 10
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x005b
            boolean r6 = r11.m72721Ww()
            if (r6 == 0) goto L_0x002a
            y50.a$c r6 = new y50.a$c
            r6.<init>(r5, r4, r3)
            r0.add(r6)
        L_0x002a:
            java.util.List r3 = r11.f59375m
            if (r3 == 0) goto L_0x0110
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = ie1.C41343r.m119925u(r3, r2)
            r8.<init>(r2)
            java.util.Iterator r9 = r3.iterator()
        L_0x003b:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0056
            java.lang.Object r2 = r9.next()
            r3 = r2
            y50.b r3 = (y50.C29928b) r3
            y50.a$b r10 = new y50.a$b
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r10
            r4 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r8.add(r10)
            goto L_0x003b
        L_0x0056:
            r0.addAll(r8)
            goto L_0x0110
        L_0x005b:
            java.util.List r6 = r11.f59375m
            if (r6 == 0) goto L_0x0110
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0068:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0096
            java.lang.Object r8 = r6.next()
            r9 = r8
            y50.b r9 = (y50.C29928b) r9
            java.lang.Object r10 = r9.mo70237c()
            r30.b r10 = (r30.C27895b) r10
            boolean r10 = r10.mo67447n()
            if (r10 != 0) goto L_0x008f
            java.lang.Object r9 = r9.mo70237c()
            r30.b r9 = (r30.C27895b) r9
            boolean r9 = r9.mo67435d()
            if (r9 == 0) goto L_0x008f
            r9 = r4
            goto L_0x0090
        L_0x008f:
            r9 = r5
        L_0x0090:
            if (r9 == 0) goto L_0x0068
            r7.add(r8)
            goto L_0x0068
        L_0x0096:
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x009e
        L_0x009c:
            r6 = r4
            goto L_0x00b5
        L_0x009e:
            java.util.Iterator r6 = r7.iterator()
        L_0x00a2:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x009c
            java.lang.Object r8 = r6.next()
            y50.b r8 = (y50.C29928b) r8
            boolean r8 = r8.mo70238d()
            if (r8 != 0) goto L_0x00a2
            r6 = r5
        L_0x00b5:
            y50.a$d r8 = new y50.a$d
            r9 = 2
            r8.<init>(r6, r5, r9, r3)
            r0.add(r8)
            androidx.lifecycle.x r3 = r11.f59377o
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x00c8
        L_0x00c6:
            r4 = r5
            goto L_0x00de
        L_0x00c8:
            java.util.Iterator r6 = r7.iterator()
        L_0x00cc:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00c6
            java.lang.Object r8 = r6.next()
            y50.b r8 = (y50.C29928b) r8
            boolean r8 = r8.mo70238d()
            if (r8 == 0) goto L_0x00cc
        L_0x00de:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.mo4826r(r4)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = ie1.C41343r.m119925u(r7, r2)
            r8.<init>(r2)
            java.util.Iterator r9 = r7.iterator()
        L_0x00f2:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x010d
            java.lang.Object r2 = r9.next()
            r3 = r2
            y50.b r3 = (y50.C29928b) r3
            y50.a$b r10 = new y50.a$b
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r10
            r4 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r8.add(r10)
            goto L_0x00f2
        L_0x010d:
            r0.addAll(r8)
        L_0x0110:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel.m72747yw():java.util.List");
    }

    /* renamed from: zw */
    private final void m72748zw() {
        C41205b F0 = this.f59381s.mo94989L0(new C19183g(new C22431c(this))).mo95027o0(C40992a.m118827a()).mo94980F(new C19184h(new C22432d(this))).mo94974C(new C19185i(new C22433e(this))).mo94981F0(new C19186j(new C22434f(this)));
        C41536l.m120488h(F0, "private fun configureCon…}.bindToLifecycle()\n    }");
        bindToLifecycle(F0);
    }

    /* renamed from: Ew */
    public final void mo55398Ew() {
        List list = this.f59375m;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List list2 = this.f59375m;
                if (list2 != null) {
                    C29928b b = C29928b.m90791b((C29928b) list.get(i), (Object) null, 1, (Object) null);
                    b.mo70239e(false);
                    C41238w wVar = C41238w.f97225a;
                    C29928b bVar = (C29928b) list2.set(i, b);
                }
            }
        }
        C21484c.m69418j(this.f59376n, m72747yw());
    }

    /* renamed from: Fw */
    public final LiveData mo55399Fw() {
        return this.f59379q;
    }

    /* renamed from: Iw */
    public final LiveData mo55400Iw() {
        return this.f59377o;
    }

    /* renamed from: Jw */
    public final HashMap mo55401Jw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f59374l.mo66809a(otpParams);
    }

    /* renamed from: Kw */
    public final LiveData mo55402Kw() {
        return this.f59378p;
    }

    /* renamed from: Lw */
    public final LiveData mo55403Lw() {
        return this.f59380r;
    }

    /* renamed from: Mw */
    public final ContactsRepositoryImpl.TrustUntrustContactParams mo55404Mw(String str, String str2, String str3) {
        List list;
        List list2 = this.f59375m;
        if (list2 != null) {
            ArrayList<C29928b> arrayList = new ArrayList<>();
            for (Object next : list2) {
                if (((C29928b) next).mo70238d()) {
                    arrayList.add(next);
                }
            }
            list = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (C29928b c : arrayList) {
                list.add(Long.valueOf(((C27895b) c.mo70237c()).mo67439g()));
            }
        } else {
            list = C41341q.m119907j();
        }
        return new ContactsRepositoryImpl.TrustUntrustContactParams(list, 1, BankApi.SERVICE_CLIENTS_TRUST_OR_UNTRUST_CONNECTION, str, str2, str3);
    }

    /* renamed from: Nw */
    public final void mo55405Nw() {
        this.f59373k.mo67389c();
        C21484c.m69418j(this.f59376n, m72747yw());
    }

    /* renamed from: Ow */
    public final void mo55406Ow(String str, boolean z) {
        C41536l.m120489i(str, "keyWord");
        if (this.f59366d.isAuthorized()) {
            if (!C40439w.m117118v(str)) {
                this.f59381s.onNext(C41233s.m119492a(str, Boolean.valueOf(z)));
                return;
            }
            if (z) {
                this.f59382t = 0;
            }
            this.f59382t += (long) 20;
            this.f59381s.onNext(C41233s.m119492a(str, Boolean.valueOf(z)));
        }
    }

    /* renamed from: Qw */
    public final void mo55407Qw(long j) {
        C41205b G = this.f59370h.mo67631a(j).mo94906z(C40992a.m118827a()).mo94888G(new C19181e(this), new C19182f(new C22435g(this)));
        C41536l.m120488h(G, "fun removeContact(contac…       })\n        )\n    }");
        addDisposable(G);
    }

    /* renamed from: Uw */
    public final void mo55408Uw() {
        List list = this.f59375m;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List list2 = this.f59375m;
                if (list2 != null) {
                    C29928b b = C29928b.m90791b((C29928b) list.get(i), (Object) null, 1, (Object) null);
                    b.mo70239e(true);
                    C41238w wVar = C41238w.f97225a;
                    C29928b bVar = (C29928b) list2.set(i, b);
                }
            }
        }
        C21484c.m69418j(this.f59376n, m72747yw());
    }

    /* renamed from: Vw */
    public final void mo55409Vw(boolean z) {
        this.f59378p.mo4826r(Boolean.valueOf(z));
        if (z) {
            mo55408Uw();
        } else {
            C21484c.m69418j(this.f59376n, m72747yw());
        }
    }

    /* renamed from: Xw */
    public final void mo55410Xw(C29923a.C29925b bVar, boolean z) {
        C41536l.m120489i(bVar, "contact");
        List list = this.f59375m;
        if (list != null) {
            int indexOf = list.indexOf(bVar.mo70224b());
            List list2 = this.f59375m;
            if (list2 != null) {
                C29928b b = C29928b.m90791b((C29928b) list.get(indexOf), (Object) null, 1, (Object) null);
                b.mo70239e(z);
                C41238w wVar = C41238w.f97225a;
                C29928b bVar2 = (C29928b) list2.set(indexOf, b);
            }
        }
        C21484c.m69418j(this.f59376n, m72747yw());
    }

    /* renamed from: Yw */
    public final void mo55411Yw(String str, String str2, String str3) {
        List list;
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C29861a aVar = this.f59372j;
        List list2 = this.f59375m;
        if (list2 != null) {
            ArrayList<C29928b> arrayList = new ArrayList<>();
            for (Object next : list2) {
                if (((C29928b) next).mo70238d()) {
                    arrayList.add(next);
                }
            }
            list = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (C29928b c : arrayList) {
                list.add(Long.valueOf(((C27895b) c.mo70237c()).mo67439g()));
            }
        } else {
            list = C41341q.m119907j();
        }
        C41205b G = aVar.mo70123a(list, 1, str, str2, str3).mo94904r(new C19178b(new C22437i(this))).mo94888G(new C19179c(this), new C19180d(new C22438j(this)));
        C41536l.m120488h(G, "fun trustContacts(\n     …        )\n        )\n    }");
        addDisposable(G);
    }

    /* renamed from: q */
    public final LiveData mo55412q() {
        return this.f59376n;
    }
}
