package p341ge.bog.mobilebank.products.data.mapper;

import java.util.Comparator;
import p341ge.bog.mobilebank.products.data.model.AccountSubAccountAmountSumsApiModel;

/* renamed from: ge.bog.mobilebank.products.data.mapper.AccountsApiModelMapper$convert$lambda$6$$inlined$sortedBy$1 */
public final class AccountsApiModelMapper$convert$lambda$6$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C41506d.m120406e(Integer.valueOf(((AccountSubAccountAmountSumsApiModel) t).getOrderNo()), Integer.valueOf(((AccountSubAccountAmountSumsApiModel) t2).getOrderNo()));
    }
}
