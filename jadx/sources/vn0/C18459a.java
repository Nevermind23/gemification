package vn0;

import ao0.C10119a;
import ao0.C10122c;
import ao0.C10123d;
import ao0.C10125f;
import ao0.C10126g;
import g91.C32289b0;
import hd0.C24978b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleChooserIsAllowedApiEntity;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOfferApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOfferCategoryApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.OfferProgressApiModel;
import p717bs.C19401a;

/* renamed from: vn0.a */
public final class C18459a {
    /* renamed from: a */
    public final C10122c mo46237a(LifestyleOfferApiModel lifestyleOfferApiModel) {
        C41536l.m120489i(lifestyleOfferApiModel, "offer");
        Long ofrId = lifestyleOfferApiModel.getOfrId();
        if (ofrId != null) {
            return new C10122c(ofrId.longValue(), lifestyleOfferApiModel.getOfferName(), C32289b0.m95091c(lifestyleOfferApiModel.getImageUrl()), C32289b0.m95091c(lifestyleOfferApiModel.getDetailImageUrl()), C32289b0.m95091c(lifestyleOfferApiModel.getBannerImageUrl()), lifestyleOfferApiModel.getStartDate(), lifestyleOfferApiModel.getEndDate(), lifestyleOfferApiModel.getDaysLeft(), C10119a.f27981d.mo26583a(lifestyleOfferApiModel.getBenefName()), lifestyleOfferApiModel.getBenefBadge(), lifestyleOfferApiModel.getBenefitValue(), lifestyleOfferApiModel.getCategoryId(), lifestyleOfferApiModel.getTopFlag(), lifestyleOfferApiModel.getOfferNameLong(), lifestyleOfferApiModel.getOfferDesc(), lifestyleOfferApiModel.getOfferDescLong(), lifestyleOfferApiModel.getBrandName(), lifestyleOfferApiModel.getPhoneNumber(), lifestyleOfferApiModel.getAddress(), lifestyleOfferApiModel.getFacebook(), lifestyleOfferApiModel.getWebsite());
        }
        return null;
    }

    /* renamed from: b */
    public final C10123d mo46238b(LifestyleOfferCategoryApiModel lifestyleOfferCategoryApiModel) {
        String str;
        boolean z;
        C41536l.m120489i(lifestyleOfferCategoryApiModel, "category");
        List e = mo46241e(lifestyleOfferCategoryApiModel.getOffers());
        Long categoryId = lifestyleOfferCategoryApiModel.getCategoryId();
        if (categoryId == null) {
            return null;
        }
        long longValue = categoryId.longValue();
        String categoryDescGe = lifestyleOfferCategoryApiModel.getCategoryDescGe();
        String str2 = "";
        if (categoryDescGe == null) {
            str = str2;
        } else {
            str = categoryDescGe;
        }
        String categoryDescEn = lifestyleOfferCategoryApiModel.getCategoryDescEn();
        if (categoryDescEn != null) {
            str2 = categoryDescEn;
        }
        String c = C32289b0.m95091c(lifestyleOfferCategoryApiModel.getCategoryIconUrl());
        String c2 = C32289b0.m95091c(lifestyleOfferCategoryApiModel.getCategoryImageUrl());
        if (e == null || e.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return new C10123d(longValue, str, str2, c, c2, e);
    }

    /* renamed from: c */
    public final C10125f mo46239c(List list, List list2, List list3, List list4, List list5) {
        return new C10125f(mo46241e(list2), mo46241e(list3), mo46241e(list4), mo46243g(list), mo46243g(list5));
    }

    /* renamed from: d */
    public final C10126g mo46240d(OfferProgressApiModel offerProgressApiModel) {
        C41536l.m120489i(offerProgressApiModel, "entity");
        String benefType = offerProgressApiModel.getBenefType();
        if (benefType == null) {
            return null;
        }
        return new C10126g(benefType, offerProgressApiModel.getClientParticipationCount(), offerProgressApiModel.getClientProgressCount(), offerProgressApiModel.getClientProgressGoal(), offerProgressApiModel.getClientProgressPercentage(), offerProgressApiModel.getClientStatus(), offerProgressApiModel.getClientSumAmount(), offerProgressApiModel.getClientTransactionCount(), offerProgressApiModel.getDaysLeft(), offerProgressApiModel.getEndDate(), offerProgressApiModel.getGoalAmount(), offerProgressApiModel.getGoalTransactions(), offerProgressApiModel.getOffrParticipationCount(), offerProgressApiModel.getOfrId(), offerProgressApiModel.getPromotionType(), offerProgressApiModel.getStartDate(), offerProgressApiModel.getTemplateDesc(), offerProgressApiModel.getValueType(), offerProgressApiModel.getOfferNameLongList(), offerProgressApiModel.getOfferDetailDesc(), offerProgressApiModel.getHasOfferProducts(), offerProgressApiModel.getBenefValue(), offerProgressApiModel.getBenefBadge());
    }

    /* renamed from: e */
    public final List mo46241e(List list) {
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10122c a = mo46237a((LifestyleOfferApiModel) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final boolean mo46242f(LifestyleChooserIsAllowedApiEntity lifestyleChooserIsAllowedApiEntity) {
        C41536l.m120489i(lifestyleChooserIsAllowedApiEntity, "isAllowed");
        if (C19401a.m64892a(lifestyleChooserIsAllowedApiEntity.getValue()) == C24978b.YES) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final List mo46243g(List list) {
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10123d b = mo46238b((LifestyleOfferCategoryApiModel) it.next());
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List mo46244h(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10126g d = mo46240d((OfferProgressApiModel) it.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }
}
