package a31;

import com.google.gson.Gson;
import j31.C36726b;
import j31.C36727c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.data.deeplink.UrlDataEntity;
import p341ge.bog.mobilebank.shared.data.deeplink.UrlParamEntity;

/* renamed from: a31.a */
public final class C30481a {

    /* renamed from: a */
    private final Gson f76472a;

    public C30481a(Gson gson) {
        C41536l.m120489i(gson, "gson");
        this.f76472a = gson;
    }

    /* renamed from: a */
    public final UrlDataEntity mo70815a(String str) {
        C41536l.m120489i(str, "urlDataText");
        try {
            return (UrlDataEntity) this.f76472a.mo18170l(str, UrlDataEntity.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C36726b mo70816b(UrlDataEntity urlDataEntity) {
        List list;
        C41536l.m120489i(urlDataEntity, "urlDataEntity");
        String type = urlDataEntity.getType();
        List<UrlParamEntity> parameters = urlDataEntity.getParameters();
        if (parameters != null) {
            list = new ArrayList(C41343r.m119925u(parameters, 10));
            for (UrlParamEntity c : parameters) {
                list.add(mo70817c(c));
            }
        } else {
            list = C41341q.m119907j();
        }
        return new C36726b(type, list);
    }

    /* renamed from: c */
    public final C36727c mo70817c(UrlParamEntity urlParamEntity) {
        C41536l.m120489i(urlParamEntity, "entity");
        return new C36727c(urlParamEntity.getKey(), urlParamEntity.getValue());
    }
}
