package h11;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40749p;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

/* renamed from: h11.a */
public interface C36142a {
    @C40458f(".?serviceId=COMMON_GET_PRELOGIN_IMAGE")
    /* renamed from: a */
    C40749p<ExternalFileEntity> mo88895a(@C40472t("customerId") String str);

    @C40458f(".?serviceId=COMMON_SET_PRELOGIN_IMAGE")
    /* renamed from: b */
    C40734b mo88896b(@C40472t("customerId") String str, @C40472t("fileId") String str2);
}
