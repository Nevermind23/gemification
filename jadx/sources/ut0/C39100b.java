package ut0;

import hd0.C24978b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.loyaltyprogress.data.model.StarsGuideProductsApiModel;
import p341ge.bog.mobilebank.loyaltyprogress.data.model.SubProductApiModel;
import p717bs.C19401a;
import yt0.C40061b;
import yt0.C40064e;

/* renamed from: ut0.b */
public final class C39100b {
    /* renamed from: a */
    public final List mo92771a(List list) {
        String str;
        String str2;
        String str3;
        C24978b bVar;
        String str4;
        int i;
        C24978b bVar2;
        int i2;
        Iterator it;
        ArrayList arrayList;
        int i3;
        String str5;
        C24978b bVar3;
        int i4;
        List list2 = list;
        C41536l.m120489i(list2, "products");
        int i5 = 10;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            StarsGuideProductsApiModel starsGuideProductsApiModel = (StarsGuideProductsApiModel) it2.next();
            String labelCategory = starsGuideProductsApiModel.getLabelCategory();
            if (labelCategory == null) {
                str = "";
            } else {
                str = labelCategory;
            }
            String labelCategoryName = starsGuideProductsApiModel.getLabelCategoryName();
            if (labelCategoryName == null) {
                str2 = "";
            } else {
                str2 = labelCategoryName;
            }
            String labelCategoryDesc = starsGuideProductsApiModel.getLabelCategoryDesc();
            if (labelCategoryDesc == null) {
                str3 = "";
            } else {
                str3 = labelCategoryDesc;
            }
            YesNoApiEntity isActive = starsGuideProductsApiModel.isActive();
            if (isActive == null || (bVar = C19401a.m64892a(isActive)) == null) {
                bVar = C24978b.NO;
            }
            C24978b bVar4 = bVar;
            String iconName = starsGuideProductsApiModel.getIconName();
            if (iconName == null) {
                str4 = "";
            } else {
                str4 = iconName;
            }
            Integer orderId = starsGuideProductsApiModel.getOrderId();
            if (orderId != null) {
                i = orderId.intValue();
            } else {
                i = 0;
            }
            YesNoApiEntity hasDetails = starsGuideProductsApiModel.getHasDetails();
            if (hasDetails == null || (bVar2 = C19401a.m64892a(hasDetails)) == null) {
                bVar2 = C24978b.NO;
            }
            C24978b bVar5 = bVar2;
            Integer scoreNew = starsGuideProductsApiModel.getScoreNew();
            if (scoreNew != null) {
                i2 = scoreNew.intValue();
            } else {
                i2 = 0;
            }
            List<SubProductApiModel> children = starsGuideProductsApiModel.getChildren();
            if (children != null) {
                ArrayList arrayList3 = new ArrayList(C41343r.m119925u(children, i5));
                Iterator<T> it3 = children.iterator();
                while (it3.hasNext()) {
                    SubProductApiModel subProductApiModel = (SubProductApiModel) it3.next();
                    Integer categoryCoefficient = subProductApiModel.getCategoryCoefficient();
                    if (categoryCoefficient != null) {
                        i3 = categoryCoefficient.intValue();
                    } else {
                        i3 = 0;
                    }
                    String labelCategoryDesc2 = subProductApiModel.getLabelCategoryDesc();
                    Iterator it4 = it2;
                    if (labelCategoryDesc2 == null) {
                        str5 = "";
                    } else {
                        str5 = labelCategoryDesc2;
                    }
                    YesNoApiEntity isActive2 = subProductApiModel.isActive();
                    if (isActive2 == null || (bVar3 = C19401a.m64892a(isActive2)) == null) {
                        bVar3 = C24978b.NO;
                    }
                    Iterator<T> it5 = it3;
                    C24978b bVar6 = bVar3;
                    Integer orderId2 = subProductApiModel.getOrderId();
                    if (orderId2 != null) {
                        i4 = orderId2.intValue();
                    } else {
                        i4 = 0;
                    }
                    arrayList3.add(new C40064e(i3, str5, bVar6, i4));
                    it2 = it4;
                    it3 = it5;
                }
                it = it2;
                arrayList = arrayList3;
            } else {
                it = it2;
                arrayList = null;
            }
            arrayList2.add(new C40061b(str, str2, str3, bVar4, str4, i, bVar5, i2, arrayList));
            it2 = it;
            i5 = 10;
        }
        return arrayList2;
    }
}
