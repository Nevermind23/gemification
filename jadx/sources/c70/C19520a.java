package c70;

import e70.C20182a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.qrscanner.data.entity.QrMerchantInfoEntity;

/* renamed from: c70.a */
public final class C19520a {
    /* renamed from: a */
    public final C20182a mo47766a(QrMerchantInfoEntity qrMerchantInfoEntity) {
        C41536l.m120489i(qrMerchantInfoEntity, "qrMerchantInfoEntity");
        return new C20182a(qrMerchantInfoEntity.isValid(), qrMerchantInfoEntity.getMerchantNameInt(), qrMerchantInfoEntity.getMerchantName(), qrMerchantInfoEntity.getDeviceId());
    }
}
