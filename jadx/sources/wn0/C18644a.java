package wn0;

import android.graphics.drawable.Drawable;
import ao0.C10121b;
import g91.C32289b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleBnplApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleBnplExternalImageApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleBnplImageApiModel;

/* renamed from: wn0.a */
public final class C18644a {
    /* renamed from: a */
    private final List m63198a(List list) {
        Image.Url url;
        LifestyleBnplExternalImageApiModel externalFile;
        String fileUrl;
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LifestyleBnplImageApiModel lifestyleBnplImageApiModel = (LifestyleBnplImageApiModel) it.next();
            if (lifestyleBnplImageApiModel == null || (externalFile = lifestyleBnplImageApiModel.getExternalFile()) == null || (fileUrl = externalFile.getFileUrl()) == null) {
                url = null;
            } else {
                String c = C32289b0.m95091c(fileUrl);
                C41536l.m120488h(c, "generateImageUrl(url)");
                url = new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            }
            if (url != null) {
                arrayList.add(url);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C10121b mo46475b(LifestyleBnplApiModel lifestyleBnplApiModel) {
        C41536l.m120489i(lifestyleBnplApiModel, "data");
        return new C10121b(m63198a(lifestyleBnplApiModel.getTop()), m63198a(lifestyleBnplApiModel.getBottom()));
    }
}
