package p341ge.bog.mobilebank.products.data.mapper;

import g91.C32289b0;
import j31.C36725a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.model.ProductTypeApiModel;
import p341ge.bog.mobilebank.products.data.model.YesNoApiModel;
import p341ge.bog.mobilebank.products.data.model.addproduct.CommonGetProductTypeApiModel;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;
import q70.C27685a;
import q70.C27686b;
import xy0.C39935a0;
import xy0.C39944h;

/* renamed from: ge.bog.mobilebank.products.data.mapper.ProductTypeApiModelMapper */
public final class ProductTypeApiModelMapper {
    private final C27685a convert(String str) {
        for (C27685a aVar : C27685a.values()) {
            if (C41536l.m120484d(aVar.mo67221b(), str)) {
                return aVar;
            }
        }
        return null;
    }

    private final C36725a transform(ExternalFileEntity externalFileEntity) {
        String str;
        C36725a asDomainModel = externalFileEntity.asDomainModel();
        String fileUrl = externalFileEntity.getFileUrl();
        if (fileUrl != null) {
            str = C32289b0.m95091c(fileUrl);
        } else {
            str = null;
        }
        return C36725a.m108889b(asDomainModel, (String) null, (String) null, (Number) null, false, str, (String) null, 47, (Object) null);
    }

    public final List<C39944h> transformCommonProducts(List<CommonGetProductTypeApiModel> list) {
        C41536l.m120489i(list, "commonGetProductTypes");
        ArrayList arrayList = new ArrayList();
        for (CommonGetProductTypeApiModel convert : list) {
            C39944h convert2 = convert(convert);
            if (convert2 != null) {
                arrayList.add(convert2);
            }
        }
        return arrayList;
    }

    public final List<C27686b> transformProductTypes(List<ProductTypeApiModel> list) {
        C41536l.m120489i(list, "productTypes");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (ProductTypeApiModel productTypeApiModel : list) {
            arrayList.add(new C27686b(convert(productTypeApiModel.getProduct()), productTypeApiModel.getStatus()));
        }
        return arrayList;
    }

    private final C39944h convert(CommonGetProductTypeApiModel commonGetProductTypeApiModel) {
        C39935a0 a = C39935a0.f94735e.mo93672a(commonGetProductTypeApiModel.getProductCode());
        long id = commonGetProductTypeApiModel.getId();
        if (a == null) {
            return null;
        }
        String productDescription = commonGetProductTypeApiModel.getProductDescription();
        String status = commonGetProductTypeApiModel.getStatus();
        String orderNumber = commonGetProductTypeApiModel.getOrderNumber();
        String productNameKey = commonGetProductTypeApiModel.getProductNameKey();
        String keywords = commonGetProductTypeApiModel.getKeywords();
        boolean convert = convert(commonGetProductTypeApiModel.getNewBadge());
        ExternalFileEntity externalFile = commonGetProductTypeApiModel.getExternalFile();
        return new C39944h(id, a, productDescription, status, orderNumber, productNameKey, keywords, convert, externalFile != null ? transform(externalFile) : null);
    }

    private final boolean convert(YesNoApiModel yesNoApiModel) {
        return yesNoApiModel == YesNoApiModel.YES;
    }
}
