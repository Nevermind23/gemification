package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.C5768q;
import java.util.Map;
import p200ob.C7508b;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: xb.u */
public final class C18679u implements C5768q {

    /* renamed from: a */
    private final C18668j f52306a = new C18668j();

    /* renamed from: a */
    public C7508b mo18891a(String str, C5751a aVar, int i, int i2, Map map) {
        if (aVar == C5751a.UPC_A) {
            return this.f52306a.mo18891a(BankApiResponse.SUCCESSFUL_RESPONSE_CODE.concat(String.valueOf(str)), C5751a.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
