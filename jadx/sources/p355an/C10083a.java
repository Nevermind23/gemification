package p355an;

import fd0.C20463a;
import g91.C32289b0;
import g91.C32319m;
import g91.C32343x;
import he1.C41224m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37603j;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardClientCountryInfoUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardPurposeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p411em.C12486c;
import p411em.C12487d;
import p537nm.C17071b;
import p537nm.C17074c;
import p537nm.C17082f;
import p537nm.C17087h0;
import p537nm.C17091j;
import p579qm.C17538b;
import p669xh.C18763a;
import p674xm.C18798f;
import p855oy.C27094a;

/* renamed from: an.a */
public final class C10083a {

    /* renamed from: a */
    private final C27094a f27848a;

    /* renamed from: b */
    private final C10092j f27849b;

    public C10083a(C27094a aVar, C10092j jVar) {
        C41536l.m120489i(aVar, "lookupUiMapper");
        C41536l.m120489i(jVar, "debitCardMapper");
        this.f27848a = aVar;
        this.f27849b = jVar;
    }

    /* renamed from: a */
    public final CardApplicationTypeDetailsUiModel mo26536a(C17074c cVar) {
        ArrayList arrayList;
        C41536l.m120489i(cVar, "cardApplicationTypeDetails");
        C17071b c = cVar.mo44287a().mo44296c();
        String a = cVar.mo44287a().mo44294a();
        String b = cVar.mo44287a().mo44295b();
        List<C17087h0> b2 = cVar.mo44288b();
        if (b2 != null) {
            C10092j jVar = this.f27849b;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(b2, 10));
            for (C17087h0 g : b2) {
                arrayList2.add(jVar.mo26561g(g));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new CardApplicationTypeDetailsUiModel(c, a, b, false, false, arrayList, 24, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final CardClientCountryInfoUiModel mo26537b(C17082f fVar) {
        C41536l.m120489i(fVar, "clientCountryInfo");
        return new CardClientCountryInfoUiModel(fVar.mo44311b(), fVar.mo44310a(), fVar.mo44313d(), fVar.mo44312c(), fVar.mo44314e());
    }

    /* renamed from: c */
    public final CardPurposeUiModel mo26538c(C20463a aVar) {
        C41536l.m120489i(aVar, "lookup");
        LookupUiModel a = this.f27848a.mo66387a(aVar);
        C17091j.C17092a aVar2 = C17091j.f47807e;
        String upperCase = a.mo52393d().toUpperCase(Locale.ROOT);
        C41536l.m120488h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        C17091j a2 = aVar2.mo44379a(upperCase);
        if (a2 == null) {
            a2 = C17091j.STANDARD;
        }
        return new CardPurposeUiModel(a2, a.mo52391a(), a);
    }

    /* renamed from: d */
    public final CardRenewalListItem.CardRenewalCardItem mo26539d(RecoverCardUiModel recoverCardUiModel) {
        String str;
        boolean z;
        String str2;
        C18763a aVar;
        CreditCardView.C13273e eVar;
        String fileUrl;
        C41536l.m120489i(recoverCardUiModel, "recoverCardUiModel");
        ProductProperties.CardBackgroundInfoContainer cardBackgroundInfo = ProductProperties.getCardBackgroundInfo(recoverCardUiModel.mo39826p());
        CardExternalFile i = recoverCardUiModel.mo39821i();
        String str3 = null;
        if (i != null) {
            str = i.getFileUrl();
        } else {
            str = null;
        }
        if (str != null) {
            z = recoverCardUiModel.mo39821i().isDark();
        } else if (!cardBackgroundInfo.isLightText) {
            z = true;
        } else {
            z = false;
        }
        long e = recoverCardUiModel.mo39815e();
        String f = recoverCardUiModel.mo39817f();
        if (f == null) {
            str2 = C32343x.m95388F(recoverCardUiModel.mo39823k(), new Object[0]);
        } else {
            str2 = f;
        }
        String j = recoverCardUiModel.mo39822j();
        String f2 = C32319m.m95299f(recoverCardUiModel.mo39818g(), "MM/yy");
        C41536l.m120488h(f2, "formatDate(expDate, \"MM/yy\")");
        int i2 = cardBackgroundInfo.resId;
        String d = recoverCardUiModel.mo39813d();
        if ((d == null || (aVar = C37603j.m110584g(d)) == null) && (aVar = C37603j.m110584g(recoverCardUiModel.mo39812b())) == null) {
            aVar = C18763a.DIGITAL_CARD;
        }
        C18763a aVar2 = aVar;
        if (z) {
            eVar = CreditCardView.C13273e.BLACK;
        } else {
            eVar = CreditCardView.C13273e.WHITE;
        }
        CreditCardView.C13273e eVar2 = eVar;
        CardExternalFile i3 = recoverCardUiModel.mo39821i();
        if (!(i3 == null || (fileUrl = i3.getFileUrl()) == null)) {
            str3 = C32289b0.m95091c(fileUrl);
        }
        return new CardRenewalListItem.CardRenewalCardItem(e, str2, j, f2, i2, aVar2, eVar2, str3);
    }

    /* renamed from: e */
    public final C18798f mo26540e(C17538b bVar) {
        C41536l.m120489i(bVar, "data");
        List<C20463a> b = bVar.mo45061b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C20463a c : b) {
            arrayList.add(mo26538c(c));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (hashSet.add(((CardPurposeUiModel) next).mo39414a())) {
                arrayList2.add(next);
            }
        }
        return new C18798f(arrayList2, mo26537b(bVar.mo45060a()));
    }

    /* renamed from: f */
    public final List mo26541f(List list) {
        String str;
        C41536l.m120489i(list, "cards");
        List c = C41339p.m119898c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            if (((RecoverCardUiModel) next).mo39819h()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        C41224m mVar = new C41224m(arrayList, arrayList2);
        List list2 = (List) mVar.mo95675a();
        List list3 = (List) mVar.mo95676b();
        if (!list2.isEmpty()) {
            c.add(new CardRenewalListItem.CardRenewalHeader(C32343x.m95388F("text.card.applications.recover.actionsheet.expired.cards", new Object[0]), C12487d.f37168q, C12486c.f37159b));
            c.addAll(mo26542g(list2));
        }
        if (!list3.isEmpty()) {
            if (!list2.isEmpty()) {
                str = "text.card.applications.recover.actionsheet.other.cards";
            } else {
                str = "text.card.applications.recover.actionsheet.your.cards";
            }
            c.add(new CardRenewalListItem.CardRenewalHeader(C32343x.m95388F(str, new Object[0]), C12487d.icons_48_card_debit_fill, 0, 4, (DefaultConstructorMarker) null));
            c.addAll(mo26542g(list3));
        }
        return C41339p.m119896a(c);
    }

    /* renamed from: g */
    public final List mo26542g(List list) {
        C41536l.m120489i(list, "cards");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo26539d((RecoverCardUiModel) it.next()));
        }
        return arrayList;
    }
}
