package p341ge.bog.mobilebank.lifestyleoffers.presentation.allcategories;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.C1644x;
import ao0.C10119a;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import do0.C12396g;
import do0.C12397h;
import do0.C12398i;
import do0.C12399j;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOffersFilterResultData;
import p380ck.C10464h;
import sn0.C17900d;
import ue1.C43075l;
import uo0.C18269a;
import uo0.C18272d;
import uo0.C18273e;
import uo0.C18274f;
import vo0.C18490b;
import zn0.C19102n;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesViewModel$ViewModel */
public final class LifestyleOffersAllCategoriesViewModel$ViewModel extends C21481a implements C12396g, C12397h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C19102n f43122d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C18490b f43123e;

    /* renamed from: f */
    private final C12396g f43124f = this;

    /* renamed from: g */
    private final C12397h f43125g = this;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List f43126h = C41341q.m119907j();

    /* renamed from: i */
    private LifestyleOffersFilterResultData f43127i = new LifestyleOffersFilterResultData((List) null, (List) null, 3, (DefaultConstructorMarker) null);

    /* renamed from: j */
    private String f43128j = "";

    /* renamed from: k */
    private final C1644x f43129k = new C1644x();

    /* renamed from: l */
    private final C1644x f43130l = new C1644x();

    /* renamed from: m */
    private final C1644x f43131m = new C1644x();

    /* renamed from: n */
    private final C1644x f43132n = new C1644x();

    /* renamed from: o */
    private final C1644x f43133o = new C1644x();

    /* renamed from: p */
    private final C1644x f43134p = new C1644x();

    /* renamed from: q */
    private final C1644x f43135q = new C1644x();

    /* renamed from: r */
    private final C1644x f43136r = new C1644x(0);

    /* renamed from: s */
    private final C1644x f43137s = new C1644x(Boolean.FALSE);

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesViewModel$ViewModel$a */
    static final class C14953a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesViewModel$ViewModel f43138d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesViewModel$ViewModel$a$a */
        /* synthetic */ class C14954a extends C41535k implements C43075l {
            C14954a(Object obj) {
                super(1, obj, C18490b.class, "transform", "transformCategories(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                return ((C18490b) this.receiver).mo46282j(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14953a(LifestyleOffersAllCategoriesViewModel$ViewModel lifestyleOffersAllCategoriesViewModel$ViewModel) {
            super(1);
            this.f43138d = lifestyleOffersAllCategoriesViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p O = this.f43138d.f43122d.mo47303a().mo95062A(new C14959c(new C14954a(this.f43138d.f43123e))).mo95075O();
            C41536l.m120488h(O, "getLifestyleOffersAndCat…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesViewModel$ViewModel$b */
    static final class C14955b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleOffersAllCategoriesViewModel$ViewModel f43139d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesViewModel$ViewModel$b$a */
        static final class C14956a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ LifestyleOffersAllCategoriesViewModel$ViewModel f43140d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14956a(LifestyleOffersAllCategoriesViewModel$ViewModel lifestyleOffersAllCategoriesViewModel$ViewModel) {
                super(1);
                this.f43140d = lifestyleOffersAllCategoriesViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo41893a(List list) {
                C1644x nw = this.f43140d.mo32999Lv();
                LifestyleOffersAllCategoriesViewModel$ViewModel lifestyleOffersAllCategoriesViewModel$ViewModel = this.f43140d;
                C41536l.m120488h(list, "data");
                nw.mo4826r(lifestyleOffersAllCategoriesViewModel$ViewModel.m54809zw(list));
                this.f43140d.f43126h = list;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41893a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14955b(LifestyleOffersAllCategoriesViewModel$ViewModel lifestyleOffersAllCategoriesViewModel$ViewModel) {
            super(1);
            this.f43139d = lifestyleOffersAllCategoriesViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41892a(C31128a aVar) {
            this.f43139d.mo33002ik().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C14956a(this.f43139d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41892a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifestyleOffersAllCategoriesViewModel$ViewModel(C19102n nVar, C18490b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(nVar, "getLifestyleOffersAndCategories");
        C41536l.m120489i(bVar, "offersUiMapper");
        this.f43122d = nVar;
        this.f43123e = bVar;
        C41205b F0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C12398i(new C14953a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C12399j(new C14955b(this)));
        C41536l.m120488h(F0, "merge(\n                o…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m54802fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m54803gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: yw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m54808yw(java.util.List r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L_0x0079
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x000c:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0078
            java.lang.Object r2 = r15.next()
            uo0.d r2 = (uo0.C18272d) r2
            java.lang.String r4 = r2.mo45943d()
            if (r4 == 0) goto L_0x002e
            ge.bog.designsystem.components.common.Image$Url r13 = new ge.bog.designsystem.components.common.Image$Url
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 126(0x7e, float:1.77E-43)
            r12 = 0
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0036
        L_0x002e:
            ge.bog.designsystem.components.common.Image$Resource r13 = new ge.bog.designsystem.components.common.Image$Resource
            int r3 = sn0.C17900d.f50940f
            r4 = 2
            r13.<init>(r3, r0, r4, r0)
        L_0x0036:
            r6 = r13
            ko0.a$a r3 = new ko0.a$a
            java.lang.String r7 = r2.mo45942c()
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            java.util.List r3 = ie1.C41339p.m119900e(r3)
            java.util.List r2 = r2.mo45947g()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = ie1.C41343r.m119925u(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x005b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0070
            java.lang.Object r5 = r2.next()
            uo0.e r5 = (uo0.C18273e) r5
            ko0.a$b r6 = new ko0.a$b
            r6.<init>(r5)
            r4.add(r6)
            goto L_0x005b
        L_0x0070:
            java.util.List r2 = ie1.C41358y.m120023m0(r3, r4)
            boolean unused = ie1.C41352v.m119965z(r1, r2)
            goto L_0x000c
        L_0x0078:
            r0 = r1
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesViewModel$ViewModel.m54808yw(java.util.List):java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public final List m54809zw(List list) {
        Image image;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18272d dVar = (C18272d) it.next();
            Long valueOf = Long.valueOf(dVar.mo45944e());
            String d = dVar.mo45943d();
            if (d != null) {
                image = new Image.Url(d, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            } else {
                image = new Image.Resource(C17900d.f50940f, (Boolean) null, 2, (DefaultConstructorMarker) null);
            }
            arrayList.add(new C18274f.C18278d(valueOf, (Integer) null, image, dVar.mo45942c(), dVar.mo45947g(), (C18269a) null, 0, 98, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    /* renamed from: Db */
    public void mo32994Db(Long l) {
        mo33003q6().mo4823o(C32343x.m95466m(l));
    }

    /* renamed from: G */
    public void mo32995G() {
        mo32997D4().mo4823o(C32343x.m95466m(this.f43127i));
    }

    /* renamed from: lw */
    public void mo41877lw(LifestyleOffersFilterResultData lifestyleOffersFilterResultData) {
        C18272d dVar;
        LifestyleOffersFilterResultData lifestyleOffersFilterResultData2 = lifestyleOffersFilterResultData;
        C41536l.m120489i(lifestyleOffersFilterResultData2, "filterData");
        this.f43127i = lifestyleOffersFilterResultData2;
        ArrayList arrayList = new ArrayList();
        int size = lifestyleOffersFilterResultData.mo42067a().size() + lifestyleOffersFilterResultData.mo42068b().size();
        mo41880ow().mo4823o(Integer.valueOf(size));
        List<C18272d> list = this.f43126h;
        boolean z = true;
        if (!lifestyleOffersFilterResultData.mo42068b().isEmpty()) {
            ArrayList<C18272d> arrayList2 = new ArrayList<>();
            for (Object next : list) {
                if (lifestyleOffersFilterResultData.mo42068b().contains(Long.valueOf(((C18272d) next).mo45944e()))) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
            for (C18272d c : arrayList2) {
                arrayList3.add(c.mo45942c());
            }
            arrayList.addAll(C41358y.m119993D0(arrayList3));
            list = arrayList2;
        }
        if (!lifestyleOffersFilterResultData.mo42067a().isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            for (C18272d dVar2 : list) {
                List g = dVar2.mo45947g();
                ArrayList arrayList5 = new ArrayList();
                for (Object next2 : g) {
                    if (C41358y.m119999O(lifestyleOffersFilterResultData.mo42067a(), ((C18273e) next2).mo45952c())) {
                        arrayList5.add(next2);
                    }
                }
                if (arrayList5.isEmpty()) {
                    dVar = null;
                } else {
                    dVar = C18272d.m62494b(dVar2, 0, (String) null, (String) null, (String) null, arrayList5, 15, (Object) null);
                }
                if (dVar != null) {
                    arrayList4.add(dVar);
                }
            }
            List<C10119a> a = lifestyleOffersFilterResultData.mo42067a();
            ArrayList arrayList6 = new ArrayList(C41343r.m119925u(a, 10));
            for (C10119a name : a) {
                arrayList6.add(name.name());
            }
            arrayList.addAll(arrayList6);
            list = arrayList4;
        }
        List yw = m54808yw(list);
        if (yw == null) {
            yw = C41341q.m119907j();
        }
        mo33004q8().mo4823o(yw);
        C1644x xw = mo33000Rr();
        if (size <= 0 || !yw.isEmpty()) {
            z = false;
        }
        xw.mo4823o(Boolean.valueOf(z));
        this.f43128j = C41358y.m120017g0(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
    }

    /* renamed from: mw */
    public C1644x mo33002ik() {
        return this.f43129k;
    }

    /* renamed from: nh */
    public void mo32996nh(long j, String str, boolean z) {
        if (!z) {
            C36546y.m108282F().mo27137H("life_style_offers", "offer_click", String.valueOf(j), (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
            C37224b.m109965d(mo32998I1(), Long.valueOf(j));
            return;
        }
        C37224b.m109965d(mo33001i2(), C41233s.m119492a(Long.valueOf(j), str));
    }

    /* renamed from: nw */
    public C1644x mo32999Lv() {
        return this.f43131m;
    }

    /* renamed from: ow */
    public C1644x mo41880ow() {
        return this.f43136r;
    }

    /* renamed from: pw */
    public String mo41881pw() {
        return this.f43128j;
    }

    /* renamed from: qw */
    public C1644x mo33004q8() {
        return this.f43130l;
    }

    /* renamed from: rw */
    public final C12396g mo41883rw() {
        return this.f43124f;
    }

    /* renamed from: sw */
    public C1644x mo33001i2() {
        return this.f43134p;
    }

    /* renamed from: tw */
    public C1644x mo32997D4() {
        return this.f43135q;
    }

    /* renamed from: uw */
    public C1644x mo32998I1() {
        return this.f43133o;
    }

    /* renamed from: vw */
    public C1644x mo33003q6() {
        return this.f43132n;
    }

    /* renamed from: ww */
    public final C12397h mo41888ww() {
        return this.f43125g;
    }

    /* renamed from: xw */
    public C1644x mo33000Rr() {
        return this.f43137s;
    }
}
