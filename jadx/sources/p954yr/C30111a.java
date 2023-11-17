package p954yr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.appsettings.entity.AppSettingApiEntity;
import p758fu.C20557a;

/* renamed from: yr.a */
public final class C30111a {
    /* renamed from: a */
    public final C20557a mo70396a(AppSettingApiEntity appSettingApiEntity) {
        C41536l.m120489i(appSettingApiEntity, "appSettingEntity");
        return new C20557a(appSettingApiEntity.getSettingsName(), appSettingApiEntity.getSettingsNumberValue(), appSettingApiEntity.getBooleanSettings(), appSettingApiEntity.getSettingsValue(), appSettingApiEntity.getSettingsDesc(), appSettingApiEntity.getJsonSettings());
    }

    /* renamed from: b */
    public final List mo70397b(List list) {
        C41536l.m120489i(list, "appSettingEntities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo70396a((AppSettingApiEntity) it.next()));
        }
        return arrayList;
    }
}
