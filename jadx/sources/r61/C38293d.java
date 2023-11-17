package r61;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40762x;
import p341ge.bog.mobilebank.templates.data.models.TemplatesAndConfigApiModel;

/* renamed from: r61.d */
public interface C38293d {

    /* renamed from: r61.d$a */
    public static final class C38294a {
        /* renamed from: a */
        public static /* synthetic */ C40762x m112569a(C38293d dVar, int i, int i2, int i3, int i4, String str, String str2, String str3, int i5, Object obj) {
            int i6;
            if (obj == null) {
                if ((i5 & 1) != 0) {
                    i = 1000;
                }
                int i7 = 0;
                if ((i5 & 2) != 0) {
                    i6 = 0;
                } else {
                    i6 = i2;
                }
                if ((i5 & 4) != 0) {
                    i3 = 1;
                }
                int i8 = i3;
                if ((i5 & 8) == 0) {
                    i7 = i4;
                }
                if ((i5 & 16) != 0) {
                    str = "I,S";
                }
                String str4 = str;
                if ((i5 & 32) != 0) {
                    str2 = "";
                }
                String str5 = str2;
                if ((i5 & 64) != 0) {
                    str3 = "FULL";
                }
                return dVar.mo91849a(i, i6, i8, i7, str4, str5, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTemplatesAndConfig");
        }
    }

    @C40458f(".?serviceId=COLLECTOR_GET_TEMPLATES_AND_CONFIG&newVersion=1")
    /* renamed from: a */
    C40762x<TemplatesAndConfigApiModel> mo91849a(@C40472t("limit") int i, @C40472t("offset") int i2, @C40472t("fullData") int i3, @C40472t("includeRecentProviders") int i4, @C40472t("templateTypes") String str, @C40472t("templateGroupTypes") String str2, @C40472t("templateDataType") String str3);
}
