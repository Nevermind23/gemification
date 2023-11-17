package sc0;

import ci1.C40458f;
import ci1.C40472t;
import kotlin.coroutines.Continuation;
import p341ge.bog.mobilebank.dictionary.data.entity.DictionaryEntity;

/* renamed from: sc0.a */
public interface C28188a {

    /* renamed from: sc0.a$a */
    public static final class C28189a {
        /* renamed from: a */
        public static /* synthetic */ Object m86669a(C28188a aVar, long j, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
            String str4;
            String str5;
            if (obj == null) {
                if ((i & 4) != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if ((i & 8) != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                return aVar.mo67704a(j, str, str4, str5, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDictionary");
        }
    }

    @C40458f(".")
    /* renamed from: a */
    Object mo67704a(@C40472t("hashCode") long j, @C40472t("customerSegment") String str, @C40472t("requestId") String str2, @C40472t("serviceName") String str3, Continuation<? super DictionaryEntity> continuation);
}
